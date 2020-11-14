/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Registro;
import org.gob.snp.entidades.RegistroExistenteEF;
import org.gob.snp.entidades.SMSignoClaseNiza;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.enums.EnumModulosSistema;
import org.gob.snp.enums.EnumTipoOperacionUsuario;
import org.gob.snp.servicios.DatoElementoFormularioService;
import org.gob.snp.servicios.ErrorAplicacionService;
import org.gob.snp.servicios.RegistroExistenteEFService;
import org.gob.snp.servicios.RegistroService;
import org.gob.snp.servicios.SmSignoClaseNizaService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.TramiteFlujoEtapaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eddy valero
 */
public class RegistroExistenteEFServiceImpl extends GenericDaoImpl<RegistroExistenteEF> implements RegistroExistenteEFService {

    @Autowired
    private TramiteService tramiteService;

    @Autowired
    private SmSignoMarcaService smSignoMarcaService;

    @Autowired
    private SmSignoClaseNizaService smSignoClaseNizaService;

    @Autowired
    private RegistroService registroService;

    @Autowired
    private TramiteFlujoEtapaService tramiteFlujoEtapaService;

    @Autowired
    private DatoElementoFormularioService datoElementoFormularioService;

    @Autowired
    private ErrorAplicacionService errorAplicacionService;

    @Override
    public RegistroExistenteEF persistRegistroExistenteEF(RegistroExistenteEF registroExistenteEF) throws Exception {
        try {
            super.persist(registroExistenteEF);
        } catch (Exception e) {

            throw e;
        }
        return registroExistenteEF;
    }

    @Override
    public RegistroExistenteEF mergeRegistroExistenteEF(RegistroExistenteEF registroExistenteEF) throws Exception {
        try {
            super.merge(registroExistenteEF);
        } catch (Exception e) {
            throw e;
        }
        return registroExistenteEF;
    }

    @Override
    public void removeRegistroExistenteEF(RegistroExistenteEF registroExistenteEF) throws Exception {
        try {
            super.remove(registroExistenteEF);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int validacionesAnalisisEtapaPorSM(String SM, AnalisisEtapa analisisEtapa) throws Exception {

        try {
            /*
             Se devolvera la cadena de acuerdo a lo siguiente
             */

            Tramite tramiteSolicitado = tramiteService.recuperaTramitePorAnalisisEtapa(analisisEtapa);
            //opcion 0: El codigo SM introducido es el mismo que se esta solicitando
            List<SMSignoMarca> listaMismoSM = hibernateTemplate.find(""
                    + "select t from Tramite t where t.idTramite = " + tramiteSolicitado.getIdTramite()
                    + " and t.tramite = '" + SM + "'");
            if (!listaMismoSM.isEmpty()) {
                return 0;
            }

            //opcion 1: El codigo SM Introducido no existe en la Tabla SM
            List<SMSignoMarca> listaNoExisteSM = hibernateTemplate.find(""
                    + "select e from Tramite e "
                    + "where e.tramite = '" + SM + "'"
            );
            if (listaNoExisteSM.isEmpty()) {
                return 1;
            }

            //opcion 2: El codigo SM Introducido existe pero esta en estado AN en Tramite
            List<SMSignoMarca> listaExisteSMVigente = hibernateTemplate.find(""
                    + "select e from Tramite e "
                    + "where e.tramite = '" + SM + "' "
                    + "and e.vigente = false ");
            if (!listaExisteSMVigente.isEmpty()) {
                return 2;
            }

//            //opcion 3: El codigo SM existe pero no tiene finalizado su tramite (Aun no esta en registro)
//            List<SMSignoMarca> listaExisteSMNoRegistrado = hibernateTemplate.find(""
//                    + "select e from Tramite e "
//                    + "where e.tramite = '" + SM + "' "
//                    + "and e.vigente = true "
//                    + " and e.idTramite not in "
//                    + " ("
//                    + "select r.tramite.idTramite from Registro r "
//                    + ")"
//                    + "");
//            if (!listaExisteSMNoRegistrado.isEmpty()) {
//                return 3;
//            }
            //opcion 4: El codigo SM ya esta asociado a este analisisetapa
            //    por lo que no puede volverse a asociar nuevamente
            List<RegistroExistenteEF> listaRegistroExistenteEFAsignado = hibernateTemplate.find(""
                    + "select e from RegistroExistenteEF e "
                    + "where e.tramite = '" + SM + "' "
                    + "and e.estado = 'AC' "
                    + "and e.analisisEtapa.idAnalisisEtapa =  " + analisisEtapa.getIdAnalisisEtapa()
                    + "");
            if (!listaRegistroExistenteEFAsignado.isEmpty()) {
                return 4;
            }

//        opcion 6: El codigo SM ya esta asociado a este analisisetapa, pero se realizó
//            la anulación de sus registros, por lo que se debe tener
//            la opcion de volver a habilitar estos registros            
            List<RegistroExistenteEF> listaRegistroExistenteEFAsignadoAnulado = hibernateTemplate.find(""
                    + "select e from RegistroExistenteEF e "
                    + "where e.tramite = '" + SM + "' "
                    + "and e.estado = 'AN' "
                    + "and e.analisisEtapa.idAnalisisEtapa =  " + analisisEtapa.getIdAnalisisEtapa()
                    + "");
            if (!listaRegistroExistenteEFAsignadoAnulado.isEmpty()) {
                return 5;
            }

            //si todo esta bien se procede a almacenar el registro
            return 6; //En el caso que no se obtenga ninguna validación
        } catch (Exception ex) {
//            Logger.getLogger(RegistroExistenteEFServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }

//        return 100; //En el caso que no se obtenga ninguna validación
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public String guardarRegistroExistenteEFPorSM(String SM, AnalisisEtapa analisisEtapa, Long idUsuario) throws Exception {

        try {
            guardarLogServidor(EnumTipoOperacionUsuario.INSERTAR.getCodigo(), idUsuario, "Insertar un registro de SM para realizar la comparacion", "RegistroExistenteEFServiceImpl.guardarRegistroExistenteEFPorSM");

            RegistroExistenteEF registroExistenteEF = new RegistroExistenteEF();
            Tramite tramite;
            String resultadoValidacion = "";

            //Se devolvera la cadena de acuerdo a lo siguiente
            //opcion 0: El codigo SM Introducido no existe
            //opcion 1: El codigo SM Introducido existe pero esta en estado AN en Tramite
            //opcion 2: El codigo SM existe pero no tiene finalizado su tramite (Aun no esta en registro)
            //opcion 3: El codigo SM es el mismo con el que se esta realizando la solicitud
            //opcion 4: El codigo SM ya esta asociado a este analisisetapa
            //por lo que no puede volverse a asociar nuevamente
            //opcion 5: El codigo SM ya esta asociado a este analisisetapa, pero se realizó
            //la anulación de sus registros, por lo que se debe tener
            //la opcion de volver a habilitar estos registros
            int opcion = 0;

            opcion = validacionesAnalisisEtapaPorSM(SM, analisisEtapa);

            //Debe haber un metodo que de acuerdo un valor devuelva 
            /**
             * *********************
             */
            switch (opcion) {
                case 0:
//                resultadoValidacion = "El codigo SM introducido es el mismo que se esta solicitando";
                    resultadoValidacion = obtenerMensaje(EnumModulosSistema.RELACION_DE_REGISTROS_EXISTENTES.getIdModulo(), 1, "es");
                    break;
                case 1:
//                    resultadoValidacion = "El codigo SM, no existe en la Base de Datos";
                    resultadoValidacion = obtenerMensaje(EnumModulosSistema.RELACION_DE_REGISTROS_EXISTENTES.getIdModulo(), 2, "es");
                    break;
                case 2:
//                    resultadoValidacion = "El tramite asociado a este codigo SM no esta vigente, sin embargo existe el SM";
                    resultadoValidacion = obtenerMensaje(EnumModulosSistema.RELACION_DE_REGISTROS_EXISTENTES.getIdModulo(), 3, "es");
                    break;
//            case 3:
//                resultadoValidacion = "El tramite aún no esta finalizado";
//                break;
                case 4:
                    resultadoValidacion = "El codigo SM ya se encuentra asociado a este analisisetapa";
                    break;
                case 5:

                    //En este caso se debe actualizar todos los registros SM para realizar la habilitacion
                    //Obtener el RegistroExistenteEF de acuerdo al SM introducido
                    List<RegistroExistenteEF> listaRegistroExistenteEFAsignadoAnulado = hibernateTemplate.find(""
                            + "select e from RegistroExistenteEF e "
                            + "where e.tramite = '" + SM + "' "
                            + "and e.estado = 'AN' "
                            + "and e.analisisEtapa.idAnalisisEtapa =  " + analisisEtapa.getIdAnalisisEtapa()
                            + "");
                    //Se debe consultar si el item seleccionado tiene items en RegistroExistenteEF
                    //si tiene registros: cambiar el estado a AC, por este valor enviar un mensaje indicando que se debe verificar
                    //no tiene registros: cambiar el estado a IN, por este valor enviar un mensaje indicando que no es necesario la verificacion pero que si se ha habilitado esta opcion.
                    RegistroExistenteEF registroExistenteEFAN = listaRegistroExistenteEFAsignadoAnulado.get(0);

                    if (datoElementoFormularioService.verificarExisteDatosPestaniaPorPestania(registroExistenteEFAN, "AnalisisDeDenominaciones")) {
                        registroExistenteEFAN.setEstado("AC");
                        merge(registroExistenteEFAN);
                        resultadoValidacion = "El codigo SM ya estaba asociado a este analisisetapa, se realizó la habilitación de los registros se debe realizar su verificación.";
                    } else {
                        registroExistenteEFAN.setEstado("IN");
                        merge(registroExistenteEFAN);
                        resultadoValidacion = "El codigo SM ya estaba asociado a este analisisetapa, sin embargo aún no se generaron los items de verificación correspondientes.";
                    }
                    break;
                case 6:
                    //En caso que no se tenga ninguna observacion se procede a insertar este registro

                    System.out.println("Ingresar registro");

                    //si esta consulta devuelve nulo significa que ya existe el registro asignado al SM
                    tramite = tramiteService.recuperaTramitePorSM(SM, analisisEtapa);

                    System.out.println("tramite *** " + tramite.getIdTramite());

                    if (tramite != null) {
                        SMSignoMarca sMSignoMarca = smSignoMarcaService.encuentraSmSignoMarca(tramite);
                        List<SMSignoClaseNiza> listSMSignoClaseNiza = smSignoClaseNizaService.listaSmSignoClaseNizaPorTramite(tramite);

                        //Armar el numero de la clase niza en el caso que sean varios registros
                        String numeroClaseNiza = "";
                        for (SMSignoClaseNiza sMSignoClaseNiza : listSMSignoClaseNiza) {
                            if (numeroClaseNiza.equals("")) {
                                numeroClaseNiza = sMSignoClaseNiza.getNumeroClaseNiza();
                            } else {
                                numeroClaseNiza = numeroClaseNiza + ", " + sMSignoClaseNiza.getNumeroClaseNiza();
                            }

                        }

                        //Es importante determinar si el tramite ya se encuentra en registro
                        Registro registro = registroService.recuperaRegistroPorTramite(tramite);
                        if (registro != null) {
                            //Almacenar el registro
                            registroExistenteEF.setAnalisisEtapa(analisisEtapa);
                            registroExistenteEF.setIdTramite(tramite.getIdTramite());
                            registroExistenteEF.setTramite(tramite.getTramite());
                            registroExistenteEF.setNumeroClaseNiza(numeroClaseNiza);
                            registroExistenteEF.setListaProducto(null);
                            registroExistenteEF.setRegistro(registro.getRegistro());

                            TramiteFlujoEtapa tramiteFlujoEtapa = tramiteFlujoEtapaService.recuperarTramiteFlujoEtapaIngresoTramite(tramite);
                            registroExistenteEF.setFechaIngreso(tramiteFlujoEtapa.getFechaAsignacion());
                            registroExistenteEF.setMarca(sMSignoMarca.getMarca());
                            registroExistenteEF.setEstado("IN");
                            //Realizar el almacenamiento
                            RegistroExistenteEF registroExistenteEFAux = persistRegistroExistenteEF(registroExistenteEF);
                            resultadoValidacion = "";
                            return resultadoValidacion;
                        } else {
                            //Almacenar el registro
                            registroExistenteEF.setAnalisisEtapa(analisisEtapa);
                            registroExistenteEF.setIdTramite(tramite.getIdTramite());
                            registroExistenteEF.setTramite(tramite.getTramite());
                            registroExistenteEF.setNumeroClaseNiza(numeroClaseNiza);
                            registroExistenteEF.setListaProducto(null);
                            registroExistenteEF.setRegistro(null);

                            TramiteFlujoEtapa tramiteFlujoEtapa = tramiteFlujoEtapaService.recuperarTramiteFlujoEtapaIngresoTramite(tramite);
                            registroExistenteEF.setFechaIngreso(tramiteFlujoEtapa.getFechaAsignacion());
                            registroExistenteEF.setMarca(sMSignoMarca.getMarca());
                            registroExistenteEF.setEstado("IN");
                            //Realizar el almacenamiento
                            RegistroExistenteEF registroExistenteEFAux = persistRegistroExistenteEF(registroExistenteEF);
                            resultadoValidacion = "";
                            return resultadoValidacion;
                        }
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            } //fin de switch
            return resultadoValidacion;
        } catch (Exception e) {
            String nroerror = errorAplicacionService.guardarErrorAplicacion(idUsuario, EnumModulosSistema.CONTROL_DE_FLUJO.getIdModulo(), "FlujoEtapaServiceImpl.controlFlujoPorTramite", e);
            throw new Exception(nroerror);
        }

    }

    @Override
    public List<RegistroExistenteEF> recuperaRegistroExistenteEFPorAnalisisEtapa(AnalisisEtapa analisisEtapa) throws Exception {
        List<RegistroExistenteEF> listaRegistroExistenteEF = hibernateTemplate.find(""
                + "select e from RegistroExistenteEF e "
                + "where e.analisisEtapa.idAnalisisEtapa = " + analisisEtapa.getIdAnalisisEtapa()
                + " and e.estado not in ('AN')");
        if (!listaRegistroExistenteEF.isEmpty()) {
            return listaRegistroExistenteEF;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<RegistroExistenteEF> generarRegistrosExistentesEFPorMarca(String marca, AnalisisEtapa analisisEtapa) {
        //Listado de RegistrosExistentesEF
        List<RegistroExistenteEF> listaRegistroExistenteEFs = new ArrayList<RegistroExistenteEF>();
        //Listado de Tramites
//        List<SMSignoMarca> listaMSignoMarcas = smSignoMarcaService.encuentraListaSmSignoMarcaPorMarcaNoExistsRegistroExistenteEF(marca, analisisEtapa);

        //Lista de Tramites que no necesariamente se encuentra Registrados
        List<SMSignoMarca> listaMSignoMarcas = smSignoMarcaService.encuentraListaSmSignoMarcaPorMarcaExistsOrNotRegistroExistenteEF(marca, analisisEtapa);

        for (SMSignoMarca sMSignoMarca : listaMSignoMarcas) {
            System.out.println(" *** " + sMSignoMarca.getMarca());
        }

        for (SMSignoMarca sMSignoMarca : listaMSignoMarcas) {

            //Si es distinto el tramite del solicitado 
            if (!sMSignoMarca.getTramite().getIdTramite().equals(analisisEtapa.getTramiteFlujoEtapa().getTramite().getIdTramite())) {

                try {
//                System.out.println("sMSignoMarca*** " + sMSignoMarca.getMarca() + " *IdTramite** " + sMSignoMarca.getTramite().getIdTramite());
                    List<SMSignoClaseNiza> listSMSignoClaseNiza = smSignoClaseNizaService.listaSmSignoClaseNizaPorTramite(sMSignoMarca.getTramite());
                    //Armar la fila
                    String numeroClaseNiza = "";
                    for (SMSignoClaseNiza sMSignoClaseNiza : listSMSignoClaseNiza) {
//                    System.out.println("***" + sMSignoClaseNiza.getNumeroClaseNiza() + " *** " + sMSignoClaseNiza.getListaProducto());
                        if (numeroClaseNiza.equals("")) {
                            numeroClaseNiza = sMSignoClaseNiza.getNumeroClaseNiza();
                        } else {
                            numeroClaseNiza = numeroClaseNiza + ", " + sMSignoClaseNiza.getNumeroClaseNiza();
                        }

                    }

                    RegistroExistenteEF registroExistenteEF = new RegistroExistenteEF();
                    Registro registro = registroService.recuperaRegistroPorTramite(sMSignoMarca.getTramite());
                    if (registro != null) {
                        registroExistenteEF.setRegistro(registro.getRegistro());
                    } else {
                        registroExistenteEF.setRegistro("");
                    }

                    //Almacenar el registro
                    registroExistenteEF.setAnalisisEtapa(analisisEtapa);
                    registroExistenteEF.setIdTramite(sMSignoMarca.getTramite().getIdTramite());
                    registroExistenteEF.setTramite(sMSignoMarca.getTramite().getTramite());
                    registroExistenteEF.setNumeroClaseNiza(numeroClaseNiza);
                    registroExistenteEF.setListaProducto(null);

                    TramiteFlujoEtapa tramiteFlujoEtapa = tramiteFlujoEtapaService.recuperarTramiteFlujoEtapaIngresoTramite(sMSignoMarca.getTramite());
//                    registroExistenteEF.setFechaIngreso(tramiteFlujoEtapa.getFechaAsignacion());
                    registroExistenteEF.setFechaIngreso(null);
                    registroExistenteEF.setMarca(sMSignoMarca.getMarca());
                    registroExistenteEF.setEstado("IN");
                    listaRegistroExistenteEFs.add(registroExistenteEF);

                } catch (Exception ex) {
                    Logger.getLogger(RegistroExistenteEFServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

        if (!listaRegistroExistenteEFs.isEmpty()) {
            return listaRegistroExistenteEFs;
        }

        return Collections.EMPTY_LIST;

    }

    @Override
    public void anularRegistroExistenteEFPorMarca(RegistroExistenteEF registroExistenteEF) {
        //Recuperar el RegistroExistente a Modificarse
        RegistroExistenteEF registroExistenteEFAux = find(RegistroExistenteEF.class, registroExistenteEF.getIdRegistroExistenteEF());
        registroExistenteEFAux.setEstado("AN");

        //Obtener todos los registros Asociados al RegistroExistenteEF a partir de
        merge(registroExistenteEFAux);

    }

    @Override
    public List<RegistroExistenteEF> eliminaRegistroExistenteEFdeListado(List<RegistroExistenteEF> listaRegistroExistenteEF, RegistroExistenteEF registroExistenteEF) {
        for (RegistroExistenteEF registroExistenteEF1 : listaRegistroExistenteEF) {
            System.out.println("registroExistenteEF1-------> " + registroExistenteEF1.getTramite());
        }
        List<RegistroExistenteEF> lista = new ArrayList<RegistroExistenteEF>();
        for (RegistroExistenteEF registroExistenteEF1 : listaRegistroExistenteEF) {
            if (!registroExistenteEF1.getTramite().equals(registroExistenteEF.getTramite())) {
                lista.add(registroExistenteEF1);
            }
        }
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<RegistroExistenteEF> generarRegistrosExistentesEFPorClaseNizaYMarca(String marca, AnalisisEtapa analisisEtapa, Long claseNiza, Usuario usuario) throws Exception {

        try {
            
            guardarLogServidor(EnumTipoOperacionUsuario.LISTAR.getCodigo(), usuario.getIdUsuario(), "Obtener un listado de tipo RegistroExistenteEF de todos los SMSignoMarca que tengan coincidencia con la marca y la clase niza", "RegistroExistenteEFServiceImpl.generarRegistrosExistentesEFPorClaseNizaYMarca");
            //Listado de RegistrosExistentesEF
            List<RegistroExistenteEF> listaRegistroExistenteEFs = new ArrayList<RegistroExistenteEF>();

            //Lista de Tramites que no necesariamente se encuentra Registrados
            List<SMSignoMarca> listaMSignoMarcas = smSignoMarcaService.encuentraListaSmSignoMarcaPorMarcaPorNizaNoExistsRegistroExistenteEF(marca, analisisEtapa, claseNiza, usuario);

            for (SMSignoMarca sMSignoMarca : listaMSignoMarcas) {

                //Si es distinto el tramite del solicitado 
                if (!sMSignoMarca.getTramite().getIdTramite().equals(analisisEtapa.getTramiteFlujoEtapa().getTramite().getIdTramite())) {
                    try {
                        List<SMSignoClaseNiza> listSMSignoClaseNiza = smSignoClaseNizaService.listaSmSignoClaseNizaPorTramite(sMSignoMarca.getTramite());
                        //Armar la fila
                        String numeroClaseNiza = "";
                        for (SMSignoClaseNiza sMSignoClaseNiza : listSMSignoClaseNiza) {
                            if (numeroClaseNiza.equals("")) {
                                numeroClaseNiza = sMSignoClaseNiza.getNumeroClaseNiza();
                            } else {
                                numeroClaseNiza = numeroClaseNiza + ", " + sMSignoClaseNiza.getNumeroClaseNiza();
                            }

                        }

                        RegistroExistenteEF registroExistenteEF = new RegistroExistenteEF();
                        Registro registro = registroService.recuperaRegistroPorTramite(sMSignoMarca.getTramite());
                        if (registro != null) {
                            registroExistenteEF.setRegistro(registro.getRegistro());
                        } else {
                            registroExistenteEF.setRegistro("");
                        }

                        //Almacenar el registro
                        registroExistenteEF.setAnalisisEtapa(analisisEtapa);
                        registroExistenteEF.setIdTramite(sMSignoMarca.getTramite().getIdTramite());
                        registroExistenteEF.setTramite(sMSignoMarca.getTramite().getTramite());
                        registroExistenteEF.setNumeroClaseNiza(numeroClaseNiza);
                        registroExistenteEF.setListaProducto(null);

                        TramiteFlujoEtapa tramiteFlujoEtapa = tramiteFlujoEtapaService.recuperarTramiteFlujoEtapaIngresoTramite(sMSignoMarca.getTramite());
                        registroExistenteEF.setFechaIngreso(sMSignoMarca.getTramite().getFechaIngreso());
                        registroExistenteEF.setMarca(sMSignoMarca.getMarca());
                        registroExistenteEF.setEstado("IN");
                        listaRegistroExistenteEFs.add(registroExistenteEF);

                    } catch (Exception ex) {
                        Logger.getLogger(RegistroExistenteEFServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
            
           

            if (!listaRegistroExistenteEFs.isEmpty()) {
//                for (RegistroExistenteEF registroExistenteEF: listaRegistroExistenteEFs) {
//                    System.out.println(" &&&&&  registroExistenteEF  "+registroExistenteEF.getFechaIngreso());    
//                     System.out.println(" %%%%%%%%%%%%%%% "+registroExistenteEF.getTramite());    
//                }
                return listaRegistroExistenteEFs;
            }

            return Collections.EMPTY_LIST;
        } catch (Exception e) {
            throw e;
        }

    }

}
