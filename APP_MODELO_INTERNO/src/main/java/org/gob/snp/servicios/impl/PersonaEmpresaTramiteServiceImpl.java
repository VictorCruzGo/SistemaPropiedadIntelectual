/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoCiudad;
import org.gob.snp.entidades.vistas.TipoDocumento;
import org.gob.snp.entidades.vistas.TipoGeneroPersona;
import org.gob.snp.entidades.vistas.TipoPais;
import org.gob.snp.entidades.vistas.TipoPersonaSolicitud;
import org.gob.snp.entidades.vistas.TipoSolicitante;
import org.gob.snp.enums.EnumTipoOperacionUsuario;
import org.gob.snp.enums.EnumTipoPersonaSolicitud;
import org.gob.snp.enums.EnumTipoSolicitante;
import org.gob.snp.pojo.NaturalJuridicoPojo;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DatosContactoService;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.PersonaEmpresaTramiteService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.PoderService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.gob.snp.servicios.util.UtilitariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author chanorojas / Roberto Santivañez
 */
public class PersonaEmpresaTramiteServiceImpl extends GenericDaoImpl<PersonaEmpresaTramite> implements PersonaEmpresaTramiteService {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private ClasificadorService clasificadorService;

    @Autowired
    private TramiteService tramiteService;

    @Autowired
    private UtilitariosService utilitariosService;

    @Autowired
    private DatosContactoService datosContactoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PoderService poderService;

    @Override
    public PersonaEmpresaTramite persistPersonaEmpresaTramite(PersonaEmpresaTramite personaEmpresaTramite) throws Exception {
        try {
            super.persist(personaEmpresaTramite);
        } catch (Exception e) {
            throw e;
        }
        return personaEmpresaTramite;
    }

    @Override
    public PersonaEmpresaTramite mergePersonaEmpresaTramite(PersonaEmpresaTramite personaEmpresaTramite) throws Exception {
        try {
            super.merge(personaEmpresaTramite);
        } catch (Exception e) {
            throw e;
        }
        return personaEmpresaTramite;
    }

    @Override
    public void removePersonaEmpresaTramite(PersonaEmpresaTramite personaEmpresaTramite) throws Exception {
        try {
            super.remove(personaEmpresaTramite);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<PersonaEmpresaTramite> listaPersonaEmpresaTramite() {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find(
                "select c "
                + "from PersonaEmpresaTramite c");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.emptyList();
    }

    @Override
    public List<PersonaEmpresaTramite> listaPersonasPorUsuarioTramite(Usuario usuario) {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                + "select c "
                + "from PersonaEmpresaTramite c "
                + "where c.tramite.idTramite in "
                + "(select o.tramite.idTramite from TramiteUsuario o where o.usuario.idUsuario = '" + usuario.getIdUsuario() + "') ");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.emptyList();
    }

    @Override
    public List<Persona> listaPersonasPorUsuario(Usuario usuario) {

        List<Persona> lista = hibernateTemplate.find(""
                + "select distinct c.persona from "
                + "PersonaEmpresaTramite c "
                + "where c.tramite.idTramite in "
                + "(select o.tramite.idTramite from TramiteUsuario o where o.usuario.idUsuario = '" + usuario.getIdUsuario() + "')");
        //  + "(select o.tramite.idTramite from TramiteUsuario o where o.usuario.idUsuario = '" + usuario.getIdUsuario() + "') and c.persona.bloqueado=true");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.emptyList();
    }

    @Override
    public List<Empresa> listaEmpresasPorUsuario(Usuario usuario) {
        List<Empresa> lista = hibernateTemplate.find(""
                + "select distinct c.empresa "
                + "from PersonaEmpresaTramite c "
                + "where c.tramite.idTramite in "
                + "(select o.tramite.idTramite from TramiteUsuario o where o.usuario.idUsuario = '" + usuario.getIdUsuario() + "')");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.emptyList();
    }

    //modificar la consulta por el cambio de las tablas de apoderado, personaempresaTramite
    @Override
    public List<PersonaEmpresaTramite> listaApoderadoPersonaPorUsuario(Usuario usuario) {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find("select c from PersonaEmpresaTramite c "
                + "where c.tipoPersonaSolicitud.codigo='" + EnumTipoPersonaSolicitud.APODERADO.getCodigo() + "' and c.tramite.idTramite in "
                + "(select o.tramite.idTramite from TramiteUsuario o where o.usuario.idUsuario = '" + usuario.getIdUsuario() + "')");
        if (!lista.isEmpty()) {
            return lista;
        } else {
            return Collections.emptyList();

        }
    }

    @Override
    public List<Persona> listaApoderadoPersonaPorUsuarioFinal(Usuario usuario) {
        List<Persona> lista = hibernateTemplate.find("select distinct c.persona from PersonaEmpresaTramite c "
                + "where c.tipoPersonaSolicitud.codigo='" + EnumTipoPersonaSolicitud.APODERADO.getCodigo() + "' and c.tramite.idTramite in "
                + "(select o.tramite.idTramite from TramiteUsuario o where o.usuario.idUsuario = '" + usuario.getIdUsuario() + "')");
        if (!lista.isEmpty()) {
            List<Persona> listaFinal = new ArrayList<Persona>();
            for (Persona persona : lista) {
                listaFinal.add(persona);
            }
            for (int i = 0; i < lista.size(); i++) {
                Persona persona = lista.get(i);
                for (int j = i + 1; j < lista.size(); j++) {
                    Persona p = lista.get(j);
                    if (persona.getNombres().equals(p.getNombres()) && persona.getApellidoPaterno().equals(p.getApellidoPaterno())
                            && persona.getApellidoMaterno().equals(p.getApellidoMaterno()) && persona.getNumeroDocumento().equals(p.getNumeroDocumento())
                            && persona.getTipoDocumento().getCodigo().equals(p.getTipoDocumento().getCodigo()) && persona.getTipoGeneroPersona().getCodigo().equals(p.getTipoGeneroPersona().getCodigo())) {
//                        if (persona.getLugarExpedicion() != null && p.getLugarExpedicion() != null) {
//                            if (persona.getLugarExpedicion().getCodigo().equals(p.getLugarExpedicion().getCodigo())) {
                        listaFinal.remove(p);
//                            }
//                        }
                    }
                }
            }
            return listaFinal;
        } else {
            return Collections.emptyList();
        }
    }

    public Poder buscaApoderadoPorPersona(Persona persona) {
        List<Poder> lista = hibernateTemplate.find("select c from Apoderado c where c.persona.idPersona='" + persona.getIdPersona() + "'");
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }

    @Override
    public PersonaEmpresaTramite obtienePersonaEmpresaTramitePorTramite(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and j.tipoPersonaSolicitud.codigo = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "' and j.vigente=true");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public Boolean verificaSiEmpresaEstaImplicadaEnOtroTramite(Empresa empresa, Tramite tramite) {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.empresa.idEmpresa = " + empresa.getIdEmpresa() + " "
                + "and j.tramite.idTramite <> " + tramite.getIdTramite() + "");
        return !lista.isEmpty();
    }

    @Override
    public Boolean verificaSiPersonaEstaImplicadaEnOtroTramite(Persona persona, Tramite tramite) {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.persona.idPersona = " + persona.getIdPersona() + " "
                + "and j.tramite.idTramite <> " + tramite.getIdTramite() + " "
                + "and j.persona.bloqueado = false");
        return !lista.isEmpty();
    }

    @Override
    public List<PersonaEmpresaTramite> buscaPersonaempresatramitePorParametrosParaVentanilla(String codigo, String tipoPersona, String tipoTramite) {
        int sw = 0;
        String codigoTramiteConsulta = "";
        String tipoPersonaConsulta = "";
        String tipoTramiteConsulta = "";
        String whereConsulta = "";
        if (!codigo.isEmpty()) {
            codigoTramiteConsulta = "and j.tramite.codigoDia like '%" + codigo + "%'";
            sw = 1;
        }
        if (!tipoPersona.isEmpty()) {
            if (tipoPersona.equals(EnumTipoSolicitante.NATURAL.getCodigo())) {
                tipoPersonaConsulta = tipoPersonaConsulta + "and j.persona is not null";
            } else {
                tipoPersonaConsulta = tipoPersonaConsulta + "and j.empresa is not null";
            }
            sw = 1;
        }
        if (!tipoTramite.isEmpty()) {
            tipoTramiteConsulta = " and j.tramite.tipoTramite.codigo = '" + tipoTramite + "'";
            sw = 1;
        }
        if (sw == 1) {
            whereConsulta = " " + codigoTramiteConsulta + " " + tipoPersonaConsulta + " " + tipoTramiteConsulta;
        }
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.etapaTramite.codigo = 'VEN' and j.tipoPersonaSolicitud = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "'"
                + whereConsulta + " ");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public PersonaEmpresaTramite obtienePersonaEmpresaTramiteSegunPersona(Persona persona) {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find("select j "
                + "from PersonaEmpresaTramite j "
                + "where j.persona.idPersona = " + persona.getIdPersona() + "");
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }

    @Override
    public PersonaEmpresaTramite obtienePersonaEmpresaTramiteApoderadoPorTramite(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and j.tipoPersonaSolicitud.codigo = '" + EnumTipoPersonaSolicitud.APODERADO.getCodigo() + "' and j.vigente=true ");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public PersonaEmpresaTramite obtienePersonaEmpresaTramiteSolicitantePorTramite(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and j.tipoPersonaSolicitud.codigo = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "' and j.vigente=true ");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void guardaNuevoApoderadoYDaBajaAntiguo(Tramite tramite, Poder apoderadoNuevo) throws Exception {
        try {
            Date fechaModificacion = new Date();
            PersonaEmpresaTramite personaEmpresa = obtienePersonaEmpresaTramiteApoderadoPorTramite(tramite);
            if (personaEmpresa != null) {
                personaEmpresa.setFechaUltimaModificacion(fechaModificacion);
                personaEmpresa.setVigente(Boolean.FALSE);
                mergePersonaEmpresaTramite(personaEmpresa);
            }
            PersonaEmpresaTramite personaEmpresaTramiteAuxiliar = new PersonaEmpresaTramite();
            personaEmpresaTramiteAuxiliar.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, EnumTipoPersonaSolicitud.APODERADO.getCodigo()));
            personaEmpresaTramiteAuxiliar.setTramite(tramite);
            personaEmpresaTramiteAuxiliar.setIdPersonaSolicitud(null);
            personaEmpresaTramiteAuxiliar.setFechaCreacion(fechaModificacion);
            personaEmpresaTramiteAuxiliar.setVigente(Boolean.TRUE);
//            personaEmpresaTramiteAuxiliar.setPersona((Persona) personaService.find(Persona.class, apoderadoNuevo.getPersona().getIdPersona()));
            persistPersonaEmpresaTramite(personaEmpresaTramiteAuxiliar);
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public Boolean verificaModificacionNombre(Tramite tramite, Persona persona, Empresa empresa) {
        Boolean puedeModificarNombre = false;
        PersonaEmpresaTramite personaEmpresa = obtienePersonaEmpresaTramiteSolicitantePorTramite(tramite);
        if (persona.getIdPersona() != null) {
            if ((persona.getIdPersona()).equals(personaEmpresa.getPersona().getIdPersona())) {
                puedeModificarNombre = true;
            }
        }
        if (empresa.getIdEmpresa() != null) {
            if ((empresa.getIdEmpresa()).equals(personaEmpresa.getEmpresa().getIdEmpresa())) {
                puedeModificarNombre = true;
            }
        }
        return puedeModificarNombre;
    }

    //metodo de transferencia de una persona o empresa a un nuevo solicitante o empresa
//    public void guardaTransferenciaModificacion(Tramite tramite, Persona personaNueva, Empresa empresaNueva, List<DatosContacto> listaDatosDeContactoSolicitanteNuevo) throws Exception {
//        Date fechaModificacion=new Date();
//        int sw=0;
//        
//        if (personaNueva != null) {
//            personaNueva.setFechaUltimaModificacion(fechaModificacion);
//            personaNueva.setVigente(Boolean.TRUE);
//           personaService.persistPersonas(personaNueva);
//            
//        }
//        if (empresaNueva != null) {
//            empresaNueva.setFechaUltimaModificacion(fechaModificacion);
//            empresaNueva.setFechaCreacion(fechaModificacion);
//            empresaNueva.setVigente(Boolean.TRUE);
//            empresaService.persistEmpresa(empresaNueva);
//        }
//
//        if (personaApoderado.getIdPersona() == null) {
//            personaApoderado = personaService.persistPersonas(personaApoderado);
//        }
//        personaEmpresaTramiteService.guardaNuevoApoderadoYDaBajaAntiguo(tramite, apoderado);
//
//        for (DatosContacto datoscontacto : listaDatosDeContactoRepresentante) {
//            datoscontacto.setPersona(personaApoderado);
//            if (datoscontacto.getIdContacto() == null) {
//                try {
//                    datosContactoService.persistDatoscontacto(datoscontacto);
//                } catch (Exception ex) {
//                    Logger.getLogger(TramiteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//    }
    @Override
    public List<PersonaEmpresaTramite> obtieneListaPersonaEmpresaPorTramite(Tramite tramite) {

        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and j.vigente=true ");
        if (!list.isEmpty()) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void bloqueaPersonaEmpresaPorTramite(Tramite tramite, Usuario usuario) throws Exception {
        Date fechaPersonaEmpresa = new Date();
        List<PersonaEmpresaTramite> listado = obtieneListaPersonaEmpresaPorTramite(tramite);

        for (PersonaEmpresaTramite personaEmpresaTramite : listado) {

            if (personaEmpresaTramite.getPersona() != null) {
                if (personaEmpresaTramite.getPersona().getIdPersona() != null) {
                    Persona persona = ((Persona) personaService.find(Persona.class, personaEmpresaTramite.getPersona().getIdPersona()));
                    persona.setUsuarioModificador(usuario.getIdUsuario());
                    persona.setBloqueado(Boolean.TRUE);
                    persona.setFechaUltimaModificacion(fechaPersonaEmpresa);
                    personaService.mergePersonas(persona);
                }
            } else {

                if (personaEmpresaTramite.getEmpresa() != null) {
                    if (personaEmpresaTramite.getEmpresa().getIdEmpresa() != null) {
                        Empresa empresa = ((Empresa) empresaService.find(Empresa.class, personaEmpresaTramite.getEmpresa().getIdEmpresa()));
                        empresa.setUsuarioModificador(usuario.getIdUsuario());
                        empresa.setBloqueado(Boolean.TRUE);
                        empresa.setFechaUltimaModificacion(fechaPersonaEmpresa);
                        empresaService.mergeEmpresa(empresa);
                    }
                }
            }
        }
    }

    @Override
    public void desbloqueaPersonaEmpresaPorTramite(Tramite tramite, Usuario usuario) throws Exception {
        Date fechaPersonaEmpresa = new Date();

        List<PersonaEmpresaTramite> listado = obtieneListaPersonaEmpresaPorTramite(tramite);

        for (PersonaEmpresaTramite personaEmpresaTramite : listado) {
            if (personaEmpresaTramite.getPersona() != null) {
                if (personaEmpresaTramite.getPersona().getIdPersona() != null) {
                    Persona persona = ((Persona) personaService.find(Persona.class, personaEmpresaTramite.getPersona().getIdPersona()));
                    persona.setUsuarioModificador(usuario.getIdUsuario());
                    persona.setBloqueado(Boolean.FALSE);
                    persona.setFechaUltimaModificacion(fechaPersonaEmpresa);
                    personaService.mergePersonas(persona);
                }

            } else {
                if (personaEmpresaTramite.getEmpresa() != null) {
                    if (personaEmpresaTramite.getEmpresa().getIdEmpresa() != null) {
                        Empresa empresa = ((Empresa) empresaService.find(Empresa.class, personaEmpresaTramite.getEmpresa().getIdEmpresa()));
                        empresa.setUsuarioModificador(usuario.getIdUsuario());
                        empresa.setBloqueado(Boolean.FALSE);
                        empresa.setFechaUltimaModificacion(fechaPersonaEmpresa);
                        empresaService.mergeEmpresa(empresa);
                    }
                }
            }
        }
    }

    @Override
    public Boolean verificaPersonaEmpresaLigadaAVariosTramites(Persona persona, Empresa empresa, Usuario usuario) {

        String consulta = " ";
        if (persona.getIdPersona() != null) {
            consulta = "where ch.persona.idPersona='" + persona.getIdPersona() + "'";
        }
        if (empresa.getIdEmpresa() != null) {
            consulta = "where ch.empresa.idEmpresa='" + empresa.getIdEmpresa() + "'";
        }
        Boolean estaLigadoAOtrosTramites = false;
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select ch "
                + "from PersonaEmpresaTramite ch " + consulta + " and ch.vigente=true and ch.tipoPersonaSolicitud.codigo='" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "'");
        if (!list.isEmpty()) {
            estaLigadoAOtrosTramites = list.size() > 1;
        }
        return estaLigadoAOtrosTramites;
    }

    @Override
    public Boolean verificaApoderadoLigadoAVariosTramites(Tramite tramite, PersonaEmpresaTramite personaEmpresaTramite, Usuario usuario) throws Exception {
        try {
            Boolean estaLigadoAOtrosTramites = false;
            List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                    + "select ch "
                    + "from PersonaEmpresaTramite ch "
                    + "where ch.persona.idPersona='" + personaEmpresaTramite.getPersona().getIdPersona() + "' "
                    + "and ch.vigente=true and ch.tipoPersonaSolicitud.codigo='" + EnumTipoPersonaSolicitud.APODERADO.getCodigo() + "'");
            if (!list.isEmpty()) {
                estaLigadoAOtrosTramites = list.size() > 1;
            }
            return estaLigadoAOtrosTramites;
        } catch (Exception ch) {

            throw ch;
        }
    }

    @Override
    public Boolean verificaPersonaEmpresaExisteEnTramite(Tramite tramite, Persona persona, Empresa empresa, Usuario usuario) {
        Boolean existeElRegsitro = false;
        if (persona.getIdPersona() != null) {
            if (tramite.getIdTramite() != null) {
                List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                        + "select ch "
                        + "from PersonaEmpresaTramite ch where ch.persona.idPersona='" + persona.getIdPersona() + "' "
                        + "and ch.vigente=true "
                        + "and ch.tramite.idTramite='" + tramite.getIdTramite() + "'");
                existeElRegsitro = !list.isEmpty();
            }

        } else {
            if (tramite.getIdTramite() != null) {
                List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                        + "select ch "
                        + "from PersonaEmpresaTramite ch where ch.empresa.idEmpresa='" + empresa.getIdEmpresa() + "' "
                        + "and ch.vigente=true "
                        + "and ch.tramite.idTramite='" + tramite.getIdTramite() + "'");
                existeElRegsitro = !list.isEmpty();
            }

        }

        return existeElRegsitro;
    }

    @Override
    public List<PersonaEmpresaTramite> obtieneListaApoderadoPersonaPorTramite(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select ch "
                + "from PersonaEmpresaTramite ch "
                + "where ch.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and ch.vigente=true and ch.tipoPersonaSolicitud.codigo='" + EnumTipoPersonaSolicitud.APODERADO.getCodigo() + "' ");
        if (!list.isEmpty()) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    /**
     * Método que lista personaempresatramite
     *
     * @param codigo este campo corresponde al codigoDia del trámite
     * @param tipoPersona corresponde al tipoPersona que puede ser JURIDICO o
     * NATURAL
     * @param tipoTramite
     * @param tipoCiudad
     * @param usuario
     * @return List<PersonaEmpresaTramite>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 22/04/2015
     * Descripcion: El metodo es responsable de recuperar en un listado de PersonaEmpresaTramite
     * todos los registros con un tramite diferente.
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 17/06/2015
     * Descripcion: Modificar el método para que en la búsqueda se considere la regional
     * en la cual se lleno el trámite.
     * </pre>
     *
     */
    @Override
    public List<PersonaEmpresaTramite> obtieneListaBandejaVentanilla(String codigo, String tipoPersona, String tipoTramite, String tipoCiudad, Usuario usuario) throws Exception {
        try {
            guardarLogServidor(EnumTipoOperacionUsuario.LISTAR.getCodigo(), usuario.getIdUsuario(), "Generar los registros para la Bandeja de Ventanilla", "PersonaEmpresaTramiteServiceImpl.obtieneListaBandejaVentanilla");
            //variable resultante
            List<PersonaEmpresaTramite> listaEmpresaTramite = new ArrayList<PersonaEmpresaTramite>();

            int sw = 0;
            String codigoTramiteConsulta = "";
            String tipoPersonaConsulta = "";
            String tipoTramiteConsulta = "";
            String tipoCiudadConsulta = "";
            String whereConsulta = "";

            //Bloque para armar las consultas dinámicas para realizar la consulta desde la vista
            /**
             * **********************************************************
             */
            if (!codigo.isEmpty()) {
                codigoTramiteConsulta = "and j.tramite.codigoDia like '%" + codigo + "%'";
                sw = 1;
            }
            if (!tipoPersona.isEmpty()) {
                if (tipoPersona.equals(EnumTipoSolicitante.NATURAL.getCodigo())) {
                    tipoPersonaConsulta = tipoPersonaConsulta + "and j.persona is not null";
                } else {
                    tipoPersonaConsulta = tipoPersonaConsulta + "and j.empresa is not null";
                }
                sw = 1;
            }
            if (!tipoTramite.isEmpty()) {
                tipoTramiteConsulta = " and j.tramite.tipoTramite.codigo = '" + tipoTramite + "'";
                sw = 1;
            }

            if (!tipoCiudad.isEmpty()) {
                tipoCiudadConsulta = " and j.tramite.idTramite in (select e.tramite.idTramite from Direccion e "
                        + "where e.tipoCiudadNotificacion.codigo = '" + tipoCiudad + "'"
                        + " ) ";
                sw = 1;
            }

            if (sw == 1) {
                whereConsulta = " " + codigoTramiteConsulta + " " + tipoPersonaConsulta + " " + tipoTramiteConsulta + " " + tipoCiudadConsulta;
            }
            System.out.println("La consulta es: *** " + whereConsulta);
            /**
             * **********************************************************
             */
            /**
             * **********************************************************
             */
            //Obtener la consulta con las restricciones de todos los Tramites diferentes
            List<Tramite> listaTramite = hibernateTemplate.find(""
                    + "select distinct j.tramite "
                    + "from PersonaEmpresaTramite j "
                    + "where j.tramite.etapaTramite.codigo = 'VEN' and j.tipoPersonaSolicitud = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "'"
                    + whereConsulta + " ");

            //Recorrer el listado de Tramites y obtener el primero de la lista en PersonaEmpresaTramite
            //con el registro obtenido agregar en la variable resultante
            for (Tramite tramite : listaTramite) {

                List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                        + "select j "
                        + "from PersonaEmpresaTramite j "
                        + "where j.tramite.etapaTramite.codigo = 'VEN' and j.tipoPersonaSolicitud = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "'"
                        + " and j.tramite.idTramite = " + tramite.getIdTramite()
                        + whereConsulta + " ");

                PersonaEmpresaTramite personaEmpresaTramite = lista.get(0);

                //Agregar a la variable resultante
                listaEmpresaTramite.add(personaEmpresaTramite);
            }

            if (!listaEmpresaTramite.isEmpty()) {
                return (listaEmpresaTramite);
            }

            return Collections.EMPTY_LIST;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * método que permite crear datos en tablas Persona, Empresa y
     * PersonaEmpresaTramite, para completar la solicitud de Modificacion de
     * Nombre y Direccion
     *
     * @param persona
     * @param empresa
     * @param tramite
     * @param usuario
     *
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo creaPersonaEmpresaTramiteParaModificacion
     * ----------------------------------------------------
     * Modificado: Susana Escobar Paz
     * Fecha: 10/08/2015
     * Descripcion: adecuaciones para mantener siempre datos vigentes
     * </pre>
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public void creaPersonaEmpresaTramiteParaModificacion(Persona persona, Empresa empresa, Tramite tramite, Usuario usuario) {
        guardarLogServidor(EnumTipoOperacionUsuario.INSERTAR.getCodigo(), usuario.getIdUsuario(), "Crear datos en tablas Persona, Empresa y PersonaEmpresaTramite, para completar la solicitud de Modificacion de Nombre y Direccion", "PersonaEmpresaTramiteService.creaPersonaEmpresaTramiteParaModificacion");
        try {
            Date fecha = utilitariosService.obtenerFechaServidor();
            Persona personaNueva = new Persona();
            Persona personaCreada = new Persona();
            Empresa empresaNueva = new Empresa();
            Empresa empresaCreada = new Empresa();
            PersonaEmpresaTramite personaEmpresaTramiteCreado = new PersonaEmpresaTramite();
            PersonaEmpresaTramite personaEmpresaTramiteNueva = new PersonaEmpresaTramite();
            String tipoDocumentoIdentidad = "";
            String tipoSolicitante = "";
            String numeroDocumento = "";
            String lugarExpedicion = "";
            String paisNacionalidad = "";
            String genero = "";

            if (persona.getIdPersona() != null) {

                tipoDocumentoIdentidad = persona.getTipoDocumento().getCodigo();
                tipoSolicitante = EnumTipoSolicitante.NATURAL.getCodigo();
                numeroDocumento = persona.getNumeroDocumento();
                lugarExpedicion = persona.getLugarExpedicion().getCodigo();
                paisNacionalidad = persona.getTipoPais().getCodigo();
                genero = persona.getTipoGeneroPersona().getCodigo();

            } else {
                // System.out.println("SOLO ACTUALIZAR "+persona.getNombres()+" "+persona.getApellidoPaterno()+" "+persona.getApellidoMaterno());
                tipoDocumentoIdentidad = empresa.getTipoDocumentoEmpresa().getCodigo();
                tipoSolicitante = EnumTipoSolicitante.JURIDICO.getCodigo();
                numeroDocumento = empresa.getNumeroDocumento();
                //lugarExpedicion = empresa.getLugarExpedicion().getCodigo();
                paisNacionalidad = empresa.getTipoPais().getCodigo();

            }

            if (tipoSolicitante.equals(EnumTipoSolicitante.JURIDICO.getCodigo())) {

                //empresaNueva.setNombreRepresentante(empresa.getNombreRepresentante());
//                System.out.println("   PREGUNTA  PARA EMPRESA   " + verificaEmpresaExisteEnTramite(tramite, empresa, usuario));
//                System.out.println(" PREGUNTA PARA  IDMODIFICAR   " + empresaService.verificaIdEmpresaModificarExistteEnTramite(tramite, empresa));
                if (!verificaEmpresaExisteEnTramite(tramite, empresa, usuario) && !empresaService.verificaIdEmpresaModificarExistteEnTramite(tramite, empresa)) {

                    if (empresaNueva.getIdEmpresa() == null) {
                        empresaNueva.setNombreRepresentante(empresa.getNombreRepresentante());
                        empresaNueva.setTipoDocumentoEmpresa((TipoDocumento) clasificadorService.find(TipoDocumento.class, tipoDocumentoIdentidad));
                        empresaNueva.setNumeroDocumento(numeroDocumento);
                        empresaNueva.setLugarExpedicion(null);
                        empresaNueva.setTipoPais((TipoPais) clasificadorService.find(TipoPais.class, paisNacionalidad));
                        empresaNueva.setBloqueado(empresa.getBloqueado());
                        empresaNueva.setVigente(empresa.getVigente());
                        empresaNueva.setFechaCreacion(fecha);
                        empresaNueva.setIdEmpresaModificar(empresa.getIdEmpresa());
                        empresaNueva.setUsuarioModificador(usuario.getIdUsuario());
                        empresaNueva.setFechaUltimaModificacion(fecha);
                        //System.out.println("PERSIT empresa idididididiid " + empresaNueva.getIdEmpresaModificar());
                        empresaCreada = empresaService.persistEmpresa(empresaNueva);
                        //AQUI CREAR LOS DATOSM CONTACTO
                        List<DatosContacto> listaDatosDeContacto;
                        listaDatosDeContacto = datosContactoService.listaDatosDeContactoPorEmpresa(empresa);

                        for (DatosContacto datoscontacto2 : listaDatosDeContacto) {
//                            datoscontacto2.setIdContacto(null);
//                            datoscontacto2.setEmpresa(empresaCreada);
//                            datoscontacto2.setVigente(Boolean.TRUE);
//                            datoscontacto2.setUsuarioModificador(usuario.getIdUsuario());
//                            datoscontacto2.setFechaUltimaModificacion(fecha);

                            // System.out.println("DE LA LISTA DE PERSONA "+datoscontacto2.getIdContacto());
                            DatosContacto datoCrear = new DatosContacto();
                            datoCrear.setEmpresa(empresaCreada);
                            datoCrear.setNotificar(datoscontacto2.getNotificar());
                            datoCrear.setDato(datoscontacto2.getDato());
                            datoCrear.setTipoContacto(datoscontacto2.getTipoContacto());
                            datoCrear.setVigente(true);
                            datoCrear.setIdDatoContactoModificar(datoscontacto2.getIdDatoContactoModificar());
                            datoCrear.setUsuarioModificador(usuario.getIdUsuario());
                            datoCrear.setFechaUltimaModificacion(fecha);
                            datosContactoService.persistDatoscontacto(datoCrear);

                        }
                    } else {
                        //    System.out.println("EMPRESA EXISTE   NO HACER NADA  ");
                    }
                    personaEmpresaTramiteNueva.setTramite(tramite);
                    personaEmpresaTramiteNueva.setFechaCreacion(fecha);
                    personaEmpresaTramiteNueva.setVigente(Boolean.TRUE);
                    personaEmpresaTramiteNueva.setUsuarioModificador(usuario.getIdUsuario());
                    personaEmpresaTramiteNueva.setFechaUltimaModificacion(fecha);
                    personaEmpresaTramiteNueva.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo()));
                    personaEmpresaTramiteNueva.setEmpresa(empresaCreada);
                    //personaEmpresaTramiteNueva.setEmpresa(empresa);
                    personaEmpresaTramiteCreado = persistPersonaEmpresaTramite(personaEmpresaTramiteNueva);

                } else {

                    //   personaEmpresaTramiteCreado = obtienePersonaEmpresaTramiteSegunEmpresa(empresa);
                    //  mergePersonaEmpresaTramite(personaEmpresaTramiteCreado);
                    List<Empresa> listadoEmpresaOficial = empresaService.encuentraListadoEmpresasTramite(tramite);
                    for (Empresa empresa1 : listadoEmpresaOficial) {
                        //       System.out.println(" ***  " + empresa.getIdEmpresa() + " ========= " + empresa1.getIdEmpresaModificar());
                        if (empresa.getIdEmpresa().equals(empresa1.getIdEmpresaModificar())) {
                            Empresa empresaAux = empresaService.find(Empresa.class, empresa1.getIdEmpresa());
                            //         System.out.println("EMPRESA NUEVA  ENCONTRADA  CASO 3 " + empresaAux);
                            empresaAux.setNombreRepresentante(empresa.getNombreRepresentante());
                            empresaAux.setUsuarioModificador(usuario.getIdUsuario());
                            empresaAux.setFechaUltimaModificacion(fecha);
                            empresaService.mergeEmpresa(empresaAux);
                        }
                    }

                }

            } else {
                //System.out.println("ELSE PERSONA");
                personaNueva.setNombres(persona.getNombres());
                personaNueva.setApellidoPaterno(persona.getApellidoPaterno());
                personaNueva.setApellidoMaterno(persona.getApellidoMaterno());

                personaNueva.setNumeroDocumento(numeroDocumento);
                personaNueva.setTipoDocumento((TipoDocumento) clasificadorService.find(TipoDocumento.class, tipoDocumentoIdentidad));
                personaNueva.setTipoPais((TipoPais) clasificadorService.find(TipoPais.class, paisNacionalidad));

                personaNueva.setBloqueado(persona.getBloqueado());

                if (tipoDocumentoIdentidad.equals("DNNN") || tipoDocumentoIdentidad.equals("OTNN")) {
                    lugarExpedicion = null;
                }

                if (lugarExpedicion == null || lugarExpedicion.equals("")) {
                    personaNueva.setLugarExpedicion(null);
                } else {
                    personaNueva.setLugarExpedicion((TipoCiudad) clasificadorService.find(TipoCiudad.class, lugarExpedicion));
                }
                personaNueva.setTipoGeneroPersona((TipoGeneroPersona) clasificadorService.find(TipoGeneroPersona.class, genero));

                personaNueva.setFechaNacimiento(persona.getFechaNacimiento());
                personaNueva.setVigente(persona.getVigente());
                personaNueva.setFechaCreacion(fecha);
                personaNueva.setIdPersonaModificar(persona.getIdPersona());
                personaNueva.setUsuarioModificador(usuario.getIdUsuario());
                personaNueva.setFechaUltimaModificacion(fecha);

                //System.out.println("   PREGUNTA  PERSONA   " + verificaPersonaEmpresaExisteEnTramite(tramite, persona, usuario));
                //System.out.println("   pregunta ID EXISTETETE  " + personaService.verificaIdPersonaModificarExistteEnTramite(tramite, persona));
                if (!verificaPersonaEmpresaExisteEnTramite(tramite, persona, empresa, usuario) && !personaService.verificaIdPersonaModificarExistteEnTramite(tramite, persona)) {

                    if (personaNueva.getIdPersona() == null) {

                        personaCreada = personaService.persistPersonas(personaNueva);

                    }
                    /////////////////////CREAR DATO CONTACTO DE PERSONAS
                    List<DatosContacto> listaDatosDeContacto;
                    listaDatosDeContacto = datosContactoService.listaDatosDeContactoPorPersona(persona);
                    for (DatosContacto datoscontacto1 : listaDatosDeContacto) {
                        // System.out.println("DE LA LISTA DE PERSONA "+datoscontacto1.getIdContacto());

//                        datoscontacto1.setIdContacto(null);
//                        datoscontacto1.setPersona(personaCreada);
//                        datoscontacto1.setVigente(Boolean.TRUE);
//                        datoscontacto1.setUsuarioModificador(usuario.getIdUsuario());
//                        datoscontacto1.setFechaUltimaModificacion(fecha);
                        DatosContacto datoCrear = new DatosContacto();
                        datoCrear.setPersona(personaCreada);
                        datoCrear.setNotificar(datoscontacto1.getNotificar());
                        datoCrear.setDato(datoscontacto1.getDato());
                        datoCrear.setTipoContacto(datoscontacto1.getTipoContacto());
                        datoCrear.setVigente(true);
                        datoCrear.setIdDatoContactoModificar(datoscontacto1.getIdDatoContactoModificar());
                        datoCrear.setUsuarioModificador(usuario.getIdUsuario());
                        datoCrear.setFechaUltimaModificacion(fecha);

                        datosContactoService.persistDatoscontacto(datoCrear);
                        //   System.out.println("SE GUARDADO");

                    }
                    /////////////////////////////////
                    personaEmpresaTramiteNueva.setTramite(tramite);
                    personaEmpresaTramiteNueva.setFechaCreacion(fecha);
                    personaEmpresaTramiteNueva.setVigente(Boolean.TRUE);
                    personaEmpresaTramiteNueva.setUsuarioModificador(usuario.getIdUsuario());
                    personaEmpresaTramiteNueva.setFechaUltimaModificacion(fecha);
                    personaEmpresaTramiteNueva.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo()));
                    personaEmpresaTramiteNueva.setPersona(personaCreada);
                    //personaEmpresaTramiteNueva.setEmpresa(empresa);
                    personaEmpresaTramiteCreado = persistPersonaEmpresaTramite(personaEmpresaTramiteNueva);

                } else {

                    //    personaEmpresaTramiteCreado = obtienePersonaEmpresaTramiteSegunPersona(persona);
                    //    mergePersonaEmpresaTramite(personaEmpresaTramiteCreado);
                    List<Persona> listadoPersonaOficial = personaService.encuentraListadoPersonaTramite(tramite);
                    for (Persona persona1 : listadoPersonaOficial) {
                        //  System.out.println(" ***  " + persona.getIdPersona() + " ========= " + persona1.getIdPersonaModificar());
                        if (persona.getIdPersona().equals(persona1.getIdPersonaModificar())) {
                            Persona personaAux = personaService.find(Persona.class, persona1.getIdPersona());
                            //    System.out.println("PERSONA NUEVA  ENCONTRADA  CASO 3 " + personaAux);
                            personaAux.setNombres(persona.getNombres());
                            personaAux.setApellidoPaterno(persona.getApellidoPaterno());
                            personaAux.setApellidoMaterno(persona.getApellidoMaterno());
                            personaAux.setUsuarioModificador(usuario.getIdUsuario());
                            personaAux.setFechaUltimaModificacion(fecha);
                            personaService.mergePersonas(personaAux);
                        }
                    }
                    // personaService.mergePersonas(persona);
                }
            }
            tramite.setUsuarioModificador(usuario.getIdUsuario());
            tramite.setFechaUltimaModificacion(fecha);
            tramiteService.mergeTramite(tramite);
            //  return personaEmpresaTramiteCreado;

        } catch (Exception ex) {
            Logger.getLogger(PersonaEmpresaTramiteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  return null;
    }

    /**
     * método que permite determinar si una empresa esta incluida en un tramite.
     *
     * @param empresa
     * @param tramite
     * @param usuario
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Chano Rojas Fecha:
     * Descripcion: Se crea el metodo verificaEmpresaExisteEnTramite
     * ----------------------------------------------------
     * Modificado: Susana Escobar Paz Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo verificaEmpresaExisteEnTramite, que permite determinar si una empresa esta incluida en un tramite
     * </pre>
     */
    @Override
    public Boolean verificaEmpresaExisteEnTramite(Tramite tramite, Empresa empresa, Usuario usuario) {
        Boolean existeElRegsitro = false;
        if (tramite.getIdTramite() != null) {
            List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                    + "select ch "
                    + "from PersonaEmpresaTramite ch where ch.empresa.idEmpresa='" + empresa.getIdEmpresa() + "' "
                    + "and ch.vigente=true "
                    + "and ch.tramite.idTramite='" + tramite.getIdTramite() + "'");
            existeElRegsitro = !list.isEmpty();
        }
        return existeElRegsitro;
    }

    /**
     * método que permite buscar el registro en PersonaEmpresaTramite asociado a
     * una Empresa
     *
     * @param empresa
     * @return PersonaEmpresaTramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 16/06/2015
     * Descripcion: Se agrega el metodo obtienePersonaEmpresaTramiteSegunEmpresa
     * ----------------------------------------------------
     * Modificado
     * Descripcion:
     * </pre>
     */
    @Override
    public PersonaEmpresaTramite obtienePersonaEmpresaTramiteSegunEmpresa(Empresa empresa) {
        List<PersonaEmpresaTramite> lista = hibernateTemplate.find("select s "
                + "from PersonaEmpresaTramite s "
                + "where s.empresa.idEmpresa = " + empresa.getIdEmpresa() + "");
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }

    /**
     * método que permite guardar datos de modificacion de una direccion en la
     * tabla TemporalModificacion
     *
     * @param lista
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 05/02/2015
     * Descripcion: Se agrega el metodo guardaTemporalModificacionDireccion
     * ----------------------------------------------------
     * Modificado:  Susana Escobar Paz
     * Fecha: 29/06/2015
     * Descripcion: Reestructuracion del metodo para crear registros de persona, empresa, PersonEmpresaTramite y DatosContacto
     * </pre>
     *
     * @throws java.lang.Exception
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void guardaTemporalModificacionDireccion(List<DatosContacto> lista, Usuario usuarioAux, Persona persona, Empresa empresa, Tramite tramite) throws Exception {
        guardarLogServidor(EnumTipoOperacionUsuario.INSERTAR.getCodigo(), usuarioAux.getIdUsuario(), "Inserta datos en tablas DatosContacto, Persona, Empresa, PersonaEmpresaTramite", "TemporalModificacionService.guardaTemporalModificacionDireccion");
        Date fechaActual = utilitariosService.obtenerFechaServidor();
        TipoSolicitante tipoSolicitante;
        PersonaEmpresaTramite nuevoPersonaEmpresaTramite = new PersonaEmpresaTramite();

        if (empresa != null) {
            tipoSolicitante = (TipoSolicitante) clasificadorService.find(TipoSolicitante.class, EnumTipoSolicitante.JURIDICO.getCodigo());
        } else {
            tipoSolicitante = (TipoSolicitante) clasificadorService.find(TipoSolicitante.class, EnumTipoSolicitante.NATURAL.getCodigo());
        }
        PersonaEmpresaTramite personaEmpresaTramite = new PersonaEmpresaTramite();
        personaEmpresaTramite.setTramite(tramite);
        personaEmpresaTramite.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo()));
        personaEmpresaTramite.setFechaCreacion(fechaActual);
        personaEmpresaTramite.setUsuarioModificador(usuarioAux.getIdUsuario());
        personaEmpresaTramite.setFechaUltimaModificacion(fechaActual);
        personaEmpresaTramite.setVigente(true);

        if (tipoSolicitante.getCodigo().equals(EnumTipoSolicitante.NATURAL.getCodigo())) {
            Persona personaCreada = new Persona();
            Persona personaNueva = new Persona();
            //  if (!verificaPersonaEmpresaExisteEnTramite(tramite, persona, usuarioAux)) {
            //   System.out.println("   PREGUNTA     " + verificaPersonaEmpresaExisteEnTramite(tramite, persona, usuarioAux));
            // System.out.println("   pregunta ID EXISTETETE  " + personaService.verificaIdPersonaModificarExistteEnTramite(tramite, persona));
            if (!verificaPersonaEmpresaExisteEnTramite(tramite, persona, empresa, usuarioAux)
                    && !personaService.verificaIdPersonaModificarExistteEnTramite(tramite, persona)) {
                String lugarExpedicion = persona.getLugarExpedicion().getCodigo();
                personaNueva.setNombres(persona.getNombres());
                personaNueva.setApellidoPaterno(persona.getApellidoPaterno());
                personaNueva.setApellidoMaterno(persona.getApellidoMaterno());
                personaNueva.setNumeroDocumento(persona.getNumeroDocumento());
                personaNueva.setTipoDocumento((TipoDocumento) clasificadorService.find(TipoDocumento.class, persona.getTipoDocumento().getCodigo()));
                personaNueva.setTipoPais((TipoPais) clasificadorService.find(TipoPais.class, persona.getTipoPais().getCodigo()));
                personaNueva.setBloqueado(persona.getBloqueado());
                if (persona.getTipoDocumento().getCodigo().equals("DNNN") || persona.getTipoDocumento().getCodigo().equals("OTNN")) {
                    lugarExpedicion = null;
                }
                if (lugarExpedicion == null || lugarExpedicion.equals("")) {
                    personaNueva.setLugarExpedicion(null);
                } else {
                    personaNueva.setLugarExpedicion((TipoCiudad) clasificadorService.find(TipoCiudad.class, lugarExpedicion));
                }
                personaNueva.setTipoGeneroPersona((TipoGeneroPersona) clasificadorService.find(TipoGeneroPersona.class, persona.getTipoGeneroPersona().getCodigo()));
                personaNueva.setFechaNacimiento(persona.getFechaNacimiento());
                personaNueva.setVigente(persona.getVigente());
                personaNueva.setFechaCreacion(fechaActual);
                personaNueva.setIdPersonaModificar(persona.getIdPersona());
                personaNueva.setUsuarioModificador(usuarioAux.getIdUsuario());
                personaNueva.setFechaUltimaModificacion(fechaActual);
                personaCreada = personaService.persistPersonas(personaNueva);
                personaEmpresaTramite.setPersona(personaCreada);
                nuevoPersonaEmpresaTramite = persistPersonaEmpresaTramite(personaEmpresaTramite);

            } else {
                //personaCreada = personaService.find(Persona.class, persona.getIdPersona());

                List<Persona> listadoPersonaOficial = personaService.encuentraListadoPersonaTramite(tramite);
                for (Persona persona1 : listadoPersonaOficial) {
                    //      System.out.println(" ***  " + persona.getIdPersona() + " ========= " + persona1.getIdPersonaModificar());
                    if (persona.getIdPersona().equals(persona1.getIdPersonaModificar())) {
                        personaCreada = personaService.find(Persona.class, persona1.getIdPersona());
                        //        System.out.println("PERSONA NUEVA  ENCONTRADA  CASO 3 " + personaCreada);
//                            personaAux.setNombres(persona.getNombres());
//                          
//                            personaAux.setFechaUltimaModificacion(fechaActual);
//                            personaService.mergePersonas(personaAux);
                    }
                }
            }

            List<DatosContacto> listaDatosDeContacto = datosContactoService.listaDatosDeContactoPorPersona(personaCreada);
            for (DatosContacto datosContacto : listaDatosDeContacto) {
                //System.out.println("BORRADO  " + datosContacto.getIdContacto());
                datosContactoService.removeDatoscontacto(datosContacto);
            }
            //List<DatosContacto> listaFiltrada = datosContactoService.filtroListaDatosContactoModificar(lista);
            for (DatosContacto datoscontacto1 : lista) {

                // if (datoscontacto1.getIdContacto() == null) {
                DatosContacto datoCrear = new DatosContacto();
                datoCrear.setPersona(personaCreada);
                datoCrear.setNotificar(datoscontacto1.getNotificar());
                datoCrear.setDato(datoscontacto1.getDato());
                datoCrear.setTipoContacto(datoscontacto1.getTipoContacto());
                datoCrear.setVigente(true);
                datoCrear.setIdDatoContactoModificar(datoscontacto1.getIdDatoContactoModificar());
                datoCrear.setUsuarioModificador(usuarioAux.getIdUsuario());
                datoCrear.setFechaUltimaModificacion(fechaActual);

//                datoscontacto1.setIdContacto(null);
//                datoscontacto1.setPersona(personaCreada);
//                datoscontacto1.setVigente(true);
//                datoscontacto1.setUsuarioModificador(usuarioAux.getIdUsuario());
//                datoscontacto1.setFechaUltimaModificacion(fechaActual);
                // System.out.println("ID PERSIST    " + datoscontacto1.getIdContacto() + " ---------  dato1  " + datoCrear.getDato() + " idMod " + datoCrear.getIdDatoContactoModificar() + " vigente " + datoCrear.getVigente());
                datosContactoService.persistDatoscontacto(datoCrear);

            }

        } /////////////////////////FIN DE LA SECCION DE PERSONA ///////////////////////////////
        else {
            Empresa empresaCreada = new Empresa();
            Empresa empresaNueva = new Empresa();
            //  if (!verificaEmpresaExisteEnTramite(tramite, empresa, usuarioAux)) {

            // System.out.println("   PREGUNTA  PARA EMPRESA   " + verificaEmpresaExisteEnTramite(tramite, empresa, usuarioAux));
            //System.out.println(" PREGUNTA PARA  IDMODIFICAR   " + empresaService.verificaIdEmpresaModificarExistteEnTramite(tramite, empresa));
            if (!verificaEmpresaExisteEnTramite(tramite, empresa, usuarioAux)
                    && !empresaService.verificaIdEmpresaModificarExistteEnTramite(tramite, empresa)) {

                empresaNueva.setNombreRepresentante(empresa.getNombreRepresentante());
                empresaNueva.setTipoDocumentoEmpresa((TipoDocumento) clasificadorService.find(TipoDocumento.class, empresa.getTipoDocumentoEmpresa().getCodigo()));
                empresaNueva.setNumeroDocumento(empresa.getNumeroDocumento());
                empresaNueva.setLugarExpedicion(null);
                empresaNueva.setTipoPais((TipoPais) clasificadorService.find(TipoPais.class, empresa.getTipoPais().getCodigo()));
                empresaNueva.setBloqueado(empresa.getBloqueado());
                empresaNueva.setVigente(empresa.getVigente());
                empresaNueva.setFechaCreacion(fechaActual);
                empresaNueva.setIdEmpresaModificar(empresa.getIdEmpresa());
                empresaNueva.setUsuarioModificador(usuarioAux.getIdUsuario());
                empresaNueva.setFechaUltimaModificacion(fechaActual);
                empresaCreada = empresaService.persistEmpresa(empresaNueva);
                personaEmpresaTramite.setEmpresa(empresaCreada);
                nuevoPersonaEmpresaTramite = persistPersonaEmpresaTramite(personaEmpresaTramite);

            } else {

                // empresaCreada = empresaService.find(Empresa.class, empresa.getIdEmpresa());
                List<Empresa> listadoEmpresaOficial = empresaService.encuentraListadoEmpresasTramite(tramite);
                for (Empresa empresa1 : listadoEmpresaOficial) {
                    //  System.out.println(" ***  " + empresa.getIdEmpresa() + " ========= " + empresa1.getIdEmpresaModificar());
                    if (empresa.getIdEmpresa().equals(empresa1.getIdEmpresaModificar())) {
                        // Empresa empresaAux = empresaService.find(Empresa.class, empresa1.getIdEmpresa());
//                        empresaAux.setNombreRepresentante(empresa.getNombreRepresentante());
//                        empresaAux.setUsuarioModificador(usuarioAux.getIdUsuario());
//                        empresaAux.setFechaUltimaModificacion(fechaActual);
                        //   empresaCreada = empresaService.mergeEmpresa(empresaAux);
                        empresaCreada = empresaService.find(Empresa.class, empresa1.getIdEmpresa());
//                        System.out.println("EMPRESA NUEVA  ENCONTRADA  CASO 3 " + empresaCreada);
                    }
                }
            }

            List<DatosContacto> listaDatosDeContacto = datosContactoService.listaDatosDeContactoPorEmpresa(empresaCreada);
            for (DatosContacto datosContacto : listaDatosDeContacto) {
                // System.out.println("BORRADO  " + datosContacto.getIdContacto());
                datosContactoService.removeDatoscontacto(datosContacto);
            }
            List<DatosContacto> listaFiltrada = datosContactoService.filtroListaDatosContactoModificar(lista);
            for (DatosContacto datoscontacto2 : listaFiltrada) {
                //   System.out.println("PERSIST dato2  " + datoscontacto2.getDato() + " idMod " + datoscontacto2.getIdDatoContactoModificar() + " vigente " + datoscontacto2.getVigente());
                //   if (datoscontacto2.getIdContacto() == null) {
                datoscontacto2.setIdContacto(null);
                datoscontacto2.setEmpresa(empresaCreada);
                datoscontacto2.setVigente(true);
                datoscontacto2.setUsuarioModificador(usuarioAux.getIdUsuario());
                datoscontacto2.setFechaUltimaModificacion(fechaActual);
                datosContactoService.persistDatoscontacto(datoscontacto2);
            }

        }

        tramite.setFechaUltimaModificacion(fechaActual);
        tramite.setUsuarioModificador(usuarioAux.getIdUsuario());
        tramiteService.mergeTramite(tramite);
        //  return nuevoPersonaEmpresaTramite;
    }

    /**
     * método que permite elimnar datos de: persona, empresa y
     * PersonaEmpresaTramite, para permitir la modificacion (reinicio) de la
     * solicitud de Modificacion
     *
     * @param tramite
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo eliminaDatosParaModificacionSolModificacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void eliminaDatosParaModificacionSolModificacion(Tramite tramite, Usuario usuario) throws Exception {
        guardarLogServidor(EnumTipoOperacionUsuario.ELIMINAR.getCodigo(), usuario.getIdUsuario(), "Eliminacion de datos de Modificación", "TramiteServiceImpl.eliminaDatosParaModificacionSolModificacion");

        List<PersonaEmpresaTramite> listaEmpresaTramites = obtieneListaPersonaEmpresaPorTramite(tramite);

        for (PersonaEmpresaTramite personaEmpresaTramite : listaEmpresaTramites) {
            //System.out.println("personaempresaTramite id" + personaEmpresaTramite.getIdPersonaSolicitud());

            //preguntar si el registro es empresa
            if (personaEmpresaTramite.getEmpresa() != null) {
                //  System.out.println("ES EMPRESA " + personaEmpresaTramite.getEmpresa().getIdEmpresa());
                //preguntar si la empresa tiene ya asociado otro tramite
                if (!empresaService.verificaSiEmpresaTieneTramites(personaEmpresaTramite.getEmpresa(), tramite)) {
                    // System.out.println("La empresa no tiene otro Tramite PUEDE SER ELIMINADA");
                    List<DatosContacto> listaDatosContacto;
                    listaDatosContacto = datosContactoService.listaDatosDeContactoAModificarPorEmpresa(personaEmpresaTramite.getEmpresa(), usuario);
                    for (DatosContacto datoscontacto : listaDatosContacto) {
                        //System.out.println(" Dato Contacto " + datoscontacto.getIdContacto());
                        DatosContacto datosContactoAux = datosContactoService.find(DatosContacto.class, datoscontacto.getIdContacto());
                        datosContactoService.removeDatoscontacto(datosContactoAux);
                    }
                    //Eliminar el registro de EmpresaTramiteService
//                        System.out.println("Ingresar a eliminar personaEMpresaTramite");
                    PersonaEmpresaTramite personaEmpresaTramiteAux = find(PersonaEmpresaTramite.class, personaEmpresaTramite.getIdPersonaSolicitud());
                    //System.out.println(" IdpersonaEmpresaTramite a eliminar " + personaEmpresaTramiteAux.getIdPersonaSolicitud());
                    removePersonaEmpresaTramite(personaEmpresaTramiteAux);
                    //System.out.println("Eliminado satisfactoriamente **** ");
                    empresaService.removeEmpresa(personaEmpresaTramite.getEmpresa());
                } else {
                    //System.out.println("LA EMPRESA SI TIENE OTRO TRAMITE ");
                    List<DatosContacto> listaDatosContacto;
                    listaDatosContacto = datosContactoService.listaDatosDeContactoAModificarPorEmpresa(personaEmpresaTramite.getEmpresa(), usuario);
                    for (DatosContacto datoscontacto : listaDatosContacto) {
                        //System.out.println(" Dato Contacto " + datoscontacto.getIdContacto());
                        DatosContacto datosContactoAux = datosContactoService.find(DatosContacto.class, datoscontacto.getIdContacto());
                        datosContactoService.removeDatoscontacto(datosContactoAux);
                    }
                    PersonaEmpresaTramite personaEmpresaTramiteAux = find(PersonaEmpresaTramite.class, personaEmpresaTramite.getIdPersonaSolicitud());
                    // System.out.println(" IdpersonaEmpresaTramite a eliminar " + personaEmpresaTramiteAux.getIdPersonaSolicitud());
                    removePersonaEmpresaTramite(personaEmpresaTramiteAux);
                    //  System.out.println("Eliminado satisfactoriamente **** ");
                }

            }

            //preguntar si el registro es solamente persona
            if (personaEmpresaTramite.getPersona() != null && personaEmpresaTramite.getPoder() == null) {
                //  System.out.println("ES PERSONA TIENE ID" + personaEmpresaTramite.getPersona().getIdPersona());
                if (!personaService.verificaSiPersonaTieneTramites(personaEmpresaTramite.getPersona(), tramite)) {
                    // System.out.println("La persona no tiene Tramites pendientes ***");
                    List<DatosContacto> listaDatosContacto;
                    listaDatosContacto = datosContactoService.listaDatosDeContactoAModificarPorPersona(personaEmpresaTramite.getPersona(), usuario);
                    if (!usuarioService.verificaExistenciaPersonaUsuario(personaEmpresaTramite.getPersona(), usuario)) {
                        for (DatosContacto datosContacto : listaDatosContacto) {
                            ///   System.out.println(" Dato Contacto X" + datosContacto.getIdContacto());
                            DatosContacto datosContactoAux = datosContactoService.find(DatosContacto.class, datosContacto.getIdContacto());
                            datosContactoService.removeDatoscontacto(datosContactoAux);
                        }
                    }
                    PersonaEmpresaTramite personaEmpresaTramiteAux = find(PersonaEmpresaTramite.class, personaEmpresaTramite.getIdPersonaSolicitud());
                    //System.out.println(" IdpersonaEmpresaTramite a eliminar " + personaEmpresaTramiteAux.getIdPersonaSolicitud());
                    removePersonaEmpresaTramite(personaEmpresaTramiteAux);

                    //Verificar que no exista un usuario asignado a la persona, si no existe, se puede proceder a la eliminacion de la persona
                    if (!usuarioService.verificaExistenciaPersonaUsuario(personaEmpresaTramite.getPersona(), usuario)) {
                        Persona personaAux = personaService.find(Persona.class, personaEmpresaTramite.getPersona().getIdPersona());
                        personaService.removePersonas(personaAux);
                    }

                } else {
                    // System.out.println("LA PERSONA SI TIENE TRAMITES ");
                    List<DatosContacto> listaDatosContacto;
                    listaDatosContacto = datosContactoService.listaDatosDeContactoAModificarPorPersona(personaEmpresaTramite.getPersona(), usuario);
                    for (DatosContacto datoscontacto : listaDatosContacto) {
                        //   System.out.println(" Dato Contacto " + datoscontacto.getIdContacto());
                        DatosContacto datosContactoAux = datosContactoService.find(DatosContacto.class, datoscontacto.getIdContacto());
                        datosContactoService.removeDatoscontacto(datosContactoAux);
                    }
                    PersonaEmpresaTramite personaEmpresaTramiteAux = find(PersonaEmpresaTramite.class, personaEmpresaTramite.getIdPersonaSolicitud());
                    // System.out.println(" IdpersonaEmpresaTramite a eliminar " + personaEmpresaTramiteAux.getIdPersonaSolicitud());
                    removePersonaEmpresaTramite(personaEmpresaTramiteAux);

                }
            }
        }

    }//fin

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void aceptarCambioNombre(Tramite tramitePadre, Tramite tramiteModificacion, Long IdUsuario) throws Exception {
        try {
            guardarLogServidor(EnumTipoOperacionUsuario.ACTUALIZAR.getCodigo(), IdUsuario, "Actualizacion y creacion de TramiteFlujoEtapas para consolidacion de Cambio de Nombre", "PersonaEmpresaTramiteServiceImpl.aceptarCambioNombre");

            Date fechaGeneral = utilitariosService.obtenerFechaServidor();
            List<PersonaEmpresaTramite> listaPersonaEmpresaTramiteMod = obtieneListadoPersonaEmpresaTramiteSolicitantePorTramite(tramiteModificacion);
            for (PersonaEmpresaTramite personaEmpresaTramiteMod : listaPersonaEmpresaTramiteMod) {
                //  System.out.println("ID PERSONA EMRPRESA TRAMITE  " + personaEmpresaTramiteMod.getIdPersonaSolicitud());
                if (personaEmpresaTramiteMod.getPersona() != null && personaEmpresaTramiteMod.getPoder() == null) {
                    // System.out.println(" ENVIANDOO PARA BUSCAR -- " + personaEmpresaTramiteMod.getPersona().getIdPersonaModificar() + "-- TRAMITE PADRE " + tramitePadre);
                    PersonaEmpresaTramite personaEmpresaTramitePadre = encuentraPersonaEmpresaTramitePorPersonaYTramite(personaEmpresaTramiteMod.getPersona().getIdPersonaModificar(), tramitePadre);
                    if (personaEmpresaTramitePadre != null) {
                        //   System.out.println("PERSONA EMPRESA TRAMITE PARA DAR DE BAJA " + personaEmpresaTramitePadre.getIdPersonaSolicitud());

                        personaEmpresaTramitePadre.setVigente(Boolean.FALSE);
                        personaEmpresaTramitePadre.setUsuarioModificador(IdUsuario);
                        personaEmpresaTramitePadre.setFechaUltimaModificacion(fechaGeneral);
                        mergePersonaEmpresaTramite(personaEmpresaTramitePadre);

                        PersonaEmpresaTramite personaEmpresaTramiteCambio = new PersonaEmpresaTramite();
                        personaEmpresaTramiteCambio.setTramite(tramitePadre);
                        personaEmpresaTramiteCambio.setPersona(personaEmpresaTramiteMod.getPersona());
                        personaEmpresaTramiteCambio.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo()));
                        personaEmpresaTramiteCambio.setFechaCreacion(fechaGeneral);
                        personaEmpresaTramiteCambio.setVigente(Boolean.TRUE);
                        personaEmpresaTramiteCambio.setUsuarioModificador(IdUsuario);
                        personaEmpresaTramiteCambio.setFechaUltimaModificacion(fechaGeneral);
                        persistPersonaEmpresaTramite(personaEmpresaTramiteCambio);
                        //      System.out.println("NUEVO PARA CREAR   " + personaEmpresaTramiteCambio.getPersona().getIdPersona());

                        List<DatosContacto> listadoDatosPersonaOriginal = datosContactoService.listaDatosDeContactoPorPersona(personaEmpresaTramiteMod.getPersona());

                        for (DatosContacto datosContacto : listadoDatosPersonaOriginal) {
                            //System.out.println("ORIGINAL DATOS CONTACTO " + datosContacto.getIdContacto());
                            datosContacto.setVigente(false);
                            datosContacto.setUsuarioModificador(IdUsuario);
                            datosContacto.setFechaUltimaModificacion(fechaGeneral);
                            datosContactoService.mergeDatoscontacto(datosContacto);
                            // datosContactoService.removeDatoscontacto(datosContacto);
                        }

                        List<DatosContacto> listaDatosDeContacto;
                        listaDatosDeContacto = datosContactoService.listaDatosDeContactoPorPersona(personaEmpresaTramitePadre.getPersona());
                        for (DatosContacto datoscontacto1 : listaDatosDeContacto) {
                            // System.out.println("DE LA LISTA DE PERSONA "+datoscontacto1.getIdContacto());
                            DatosContacto datoCrear = new DatosContacto();
                            datoCrear.setPersona(personaEmpresaTramiteMod.getPersona());
                            datoCrear.setNotificar(datoscontacto1.getNotificar());
                            datoCrear.setDato(datoscontacto1.getDato());
                            datoCrear.setTipoContacto(datoscontacto1.getTipoContacto());
                            datoCrear.setVigente(true);
                            datoCrear.setIdDatoContactoModificar(datoscontacto1.getIdDatoContactoModificar());

                            datoCrear.setUsuarioModificador(IdUsuario);
                            datoCrear.setFechaUltimaModificacion(fechaGeneral);
                            datosContactoService.persistDatoscontacto(datoCrear);
                            //   System.out.println("SE GUARDADO");

                        }

                    } else {
                        System.out.println("ERROR AL CONSOLIDAR PERSONA, NO SE PUEDE ENCONTRAR PET PADRE");
                    }
                }
                if (personaEmpresaTramiteMod.getEmpresa() != null && personaEmpresaTramiteMod.getPoder() == null) {
                    // System.out.println(" ENVIANDOO PARA BUSCAR -- " + personaEmpresaTramiteMod.getEmpresa().getIdEmpresaModificar() + "-- TRAMITE PADRE " + tramitePadre);
                    PersonaEmpresaTramite personaEmpresaTramitePadre = encuentraPersonaEmpresaTramitePorEmpresaYTramite(personaEmpresaTramiteMod.getEmpresa().getIdEmpresaModificar(), tramitePadre);
                    if (personaEmpresaTramitePadre != null) {
                        //   System.out.println("PERSONA EMPRESA TRAMITE PARA DAR DE BAJA " + personaEmpresaTramitePadre.getIdPersonaSolicitud());

                        personaEmpresaTramitePadre.setVigente(Boolean.FALSE);
                        personaEmpresaTramitePadre.setUsuarioModificador(IdUsuario);
                        personaEmpresaTramitePadre.setFechaUltimaModificacion(fechaGeneral);
                        mergePersonaEmpresaTramite(personaEmpresaTramitePadre);

                        PersonaEmpresaTramite personaEmpresaTramiteCambio = new PersonaEmpresaTramite();
                        personaEmpresaTramiteCambio.setTramite(tramitePadre);
                        personaEmpresaTramiteCambio.setEmpresa(personaEmpresaTramiteMod.getEmpresa());
                        personaEmpresaTramiteCambio.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo()));
                        personaEmpresaTramiteCambio.setFechaCreacion(fechaGeneral);
                        personaEmpresaTramiteCambio.setVigente(Boolean.TRUE);
                        personaEmpresaTramiteCambio.setUsuarioModificador(IdUsuario);
                        personaEmpresaTramiteCambio.setFechaUltimaModificacion(fechaGeneral);
                        persistPersonaEmpresaTramite(personaEmpresaTramiteCambio);
                        // System.out.println("NUEVO PARA CREAR   " + personaEmpresaTramiteCambio.getEmpresa().getIdEmpresa());
                        List<DatosContacto> listadoDatosEmpresaOriginal = datosContactoService.listaDatosDeContactoPorEmpresa(personaEmpresaTramiteMod.getEmpresa());

                        for (DatosContacto datosContacto : listadoDatosEmpresaOriginal) {
                            //System.out.println("ORIGINAL DATOS CONTACTO " + datosContacto.getIdContacto());
                            datosContacto.setVigente(false);
                            datosContacto.setUsuarioModificador(IdUsuario);
                            datosContacto.setFechaUltimaModificacion(fechaGeneral);
                            datosContactoService.mergeDatoscontacto(datosContacto);
                            //  datosContactoService.removeDatoscontacto(datosContacto);
                        }

                        List<DatosContacto> listaDatosDeContacto;
                        listaDatosDeContacto = datosContactoService.listaDatosDeContactoPorEmpresa(personaEmpresaTramitePadre.getEmpresa());

                        for (DatosContacto datoscontacto2 : listaDatosDeContacto) {

                            DatosContacto datoCrear = new DatosContacto();
                            datoCrear.setEmpresa(personaEmpresaTramiteMod.getEmpresa());
                            datoCrear.setNotificar(datoscontacto2.getNotificar());
                            datoCrear.setDato(datoscontacto2.getDato());
                            datoCrear.setTipoContacto(datoscontacto2.getTipoContacto());
                            datoCrear.setVigente(true);
                            datoCrear.setIdDatoContactoModificar(datoscontacto2.getIdDatoContactoModificar());
                            datoCrear.setUsuarioModificador(IdUsuario);
                            datoCrear.setFechaUltimaModificacion(fechaGeneral);
                            datosContactoService.persistDatoscontacto(datoCrear);
                        }
                    } else {
                        System.out.println("ERROR AL CONSOLIDAR EMPRESA, NO SE PUEDE ENCONTRAR PET PADRE");
                    }
                }

            }
            //  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//            List<PersonaEmpresaTramite> listaPersonaEmpresaTramiteAcutal = obtieneListadoPersonaEmpresaTramiteSolicitantePorTramite(tramitePadre);
//            for (PersonaEmpresaTramite personaEmpresaTramite : listaPersonaEmpresaTramiteAcutal) {
//                System.out.println("LISTA NUEVA padre     **** " + personaEmpresaTramite.getIdPersonaSolicitud());
//            }
//
//            List<PersonaEmpresaTramite> listaPersonaEmpresaTramiteCambioNombre = obtieneListadoPersonaEmpresaTramiteSolicitantePorTramite(tramiteModificacion);
//            for (PersonaEmpresaTramite personaEmpresaTramite : listaPersonaEmpresaTramiteCambioNombre) {
//                System.out.println("LISTA modificacion    ****  " + personaEmpresaTramite.getIdPersonaSolicitud());
//            }

        } catch (Exception ex) {
            Logger.getLogger(PersonaEmpresaTramiteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PersonaEmpresaTramite encuentraPersonaEmpresaTramitePorPersonaYTramite(Long IdPersona, Tramite tramite) throws Exception {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select s "
                + "from PersonaEmpresaTramite s where s.persona.idPersona='" + IdPersona + "' "
                + "and s.vigente=true "
                + "and s.tramite.idTramite='" + tramite.getIdTramite() + "'");
        if (!list.isEmpty()) {
            return list.get(0);
        } else {

            List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                    + "select s "
                    + "from PersonaEmpresaTramite s where s.persona.idPersonaModificar='" + IdPersona + "' "
                    + "and s.vigente=true "
                    + "and s.tramite.idTramite='" + tramite.getIdTramite() + "'");
            if (!lista.isEmpty()) {
                return lista.get(0);
            }
        }
        return null;
    }

    @Override
    public List<PersonaEmpresaTramite> obtieneListadoPersonaEmpresaTramiteSolicitantePorTramite(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and j.tipoPersonaSolicitud.codigo = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "' and j.vigente=true ");
        if (!list.isEmpty()) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public PersonaEmpresaTramite encuentraPersonaEmpresaTramitePorEmpresaYTramite(Long IdEmpresa, Tramite tramite) throws Exception {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select ch "
                + "from PersonaEmpresaTramite ch where ch.empresa.idEmpresa='" + IdEmpresa + "' "
                + "and ch.vigente=true "
                + "and ch.tramite.idTramite='" + tramite.getIdTramite() + "'");
        if (!list.isEmpty()) {
            return list.get(0);
        } else {

            List<PersonaEmpresaTramite> lista = hibernateTemplate.find(""
                    + "select ch "
                    + "from PersonaEmpresaTramite ch where ch.empresa.idEmpresaModificar='" + IdEmpresa + "' "
                    + "and ch.vigente=true "
                    + "and ch.tramite.idTramite='" + tramite.getIdTramite() + "'");
            if (!lista.isEmpty()) {
                return lista.get(0);
            }
        }
        return null;
    }

    @Override
    public int encuentraPosicionListadoPojoNaturalJuridico(List<NaturalJuridicoPojo> listaNaturalJuridico, NaturalJuridicoPojo naturalJuridicoPojo) {
        int posicion = 0;
        int cont = 0;
        for (NaturalJuridicoPojo naturalJuridicoPojo1 : listaNaturalJuridico) {

            System.out.println("empresa" + naturalJuridicoPojo.getEmpresaPojo().getNombreRepresentante());
            System.out.println("persona" + naturalJuridicoPojo.getPersonaPojo().getNombres());
            System.out.println("empresa" + naturalJuridicoPojo1.getEmpresaPojo().getNombreRepresentante());
            System.out.println("persona" + naturalJuridicoPojo1.getPersonaPojo().getNombres());

            if (naturalJuridicoPojo.getEmpresaPojo().getNombreRepresentante() != null) {
                System.out.println("entro por empresa");
                if (naturalJuridicoPojo1.getEmpresaPojo().getNombreRepresentante().equals(naturalJuridicoPojo.getEmpresaPojo().getNombreRepresentante())) {
                    posicion = cont;
                }
            } else {
                System.out.println("entro por persona");
                if (naturalJuridicoPojo.getPersonaPojo().getNombres() != null) {
                    if (naturalJuridicoPojo1.getPersonaPojo().getNombres().equals(naturalJuridicoPojo.getPersonaPojo().getNombres()) && naturalJuridicoPojo1.getPersonaPojo().getApellidoPaterno().equals(naturalJuridicoPojo.getPersonaPojo().getApellidoPaterno())) {
                        posicion = cont;
                    }
                }
            }
            cont++;
        }
        return posicion;
    }

    @Override
    public List<PersonaEmpresaTramite> obtieneListaPersonaEmpresaPorTramiteNTITLICE(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + " select j "
                + " from PersonaEmpresaTramite j "
                + " where (j.tipoPersonaSolicitud.codigo = '" + EnumTipoPersonaSolicitud.LICENCIATARIO.getCodigo() + "' or j.tipoPersonaSolicitud.codigo='" + EnumTipoPersonaSolicitud.NUEVOTITULAR.getCodigo() + "') "
                + " and j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + " and j.vigente=true");
        if (!list.isEmpty()) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<PersonaEmpresaTramite> obtieneListaPersonaEmpresaPorTramiteSOLI(Tramite tramite) {
        List<PersonaEmpresaTramite> list = hibernateTemplate.find(""
                + "select j "
                + "from PersonaEmpresaTramite j "
                + "where j.tramite.idTramite = " + tramite.getIdTramite() + " "
                + "and j.tipoPersonaSolicitud.codigo = '" + EnumTipoPersonaSolicitud.SOLICITANTE.getCodigo() + "' and j.vigente=true");
        if (!list.isEmpty()) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void eliminaApoderadoDatosContactoPoder(Long idTramite, Long idUsuario) throws Exception {
        System.out.println("entro al metodo de eliminacion de tramite");
        if (idTramite != null) {
            Tramite tramite = (Tramite) tramiteService.find(Tramite.class, idTramite);
            Usuario usuario = (Usuario) usuarioService.find(Usuario.class, idUsuario);
            if (!obtieneListaApoderadoPersonaPorTramite(tramite).isEmpty()) {
                for (PersonaEmpresaTramite personaEmpresaTramite : obtieneListaApoderadoPersonaPorTramite(tramite)) {
                    if (!personaService.verificaSiPersonaTieneTramites(personaEmpresaTramite.getPersona(), tramite)) {

                        List<DatosContacto> listaDatosContacto;
                        listaDatosContacto = datosContactoService.listaDatosDeContactoPorPersona(personaEmpresaTramite.getPersona());
                        for (DatosContacto datosContacto : listaDatosContacto) {
                            DatosContacto datosContactoAux = datosContactoService.find(DatosContacto.class, datosContacto.getIdContacto());
                            datosContactoService.removeDatoscontacto(datosContactoAux);
                        }
                        PersonaEmpresaTramite personaEmpresaTramiteAux = find(PersonaEmpresaTramite.class, personaEmpresaTramite.getIdPersonaSolicitud());
                        removePersonaEmpresaTramite(personaEmpresaTramiteAux);
                        if (!poderService.recuperaPoderPorTramite(personaEmpresaTramite, usuario).isEmpty()) {
                            for (Poder apoderado : poderService.recuperaPoderPorTramite(personaEmpresaTramite, usuario)) {
                                poderService.removePoder(apoderado);
                            }
                        }
                        Persona personaAux = personaService.find(Persona.class, personaEmpresaTramite.getPersona().getIdPersona());
                        personaService.removePersonas(personaAux);
                    }
                }
            }
        }
    }

}
