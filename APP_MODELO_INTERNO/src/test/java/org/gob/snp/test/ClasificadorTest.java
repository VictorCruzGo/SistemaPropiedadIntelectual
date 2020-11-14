package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoNotificacion;
import org.gob.snp.entidades.vistas.EstadoProcesoPublicacion;
import org.gob.snp.entidades.vistas.EstadoPublicacion;
import org.gob.snp.entidades.vistas.EstadoPublicacionTramite;
import org.gob.snp.entidades.vistas.TipoDocumentacion;
import org.gob.snp.entidades.vistas.TipoNotificacion;
import org.gob.snp.entidades.vistas.TipoPais;
import org.gob.snp.entidades.vistas.TipoPreferencia;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanorojas
 */
public class ClasificadorTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        Applic ationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
 //       ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
   ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");     
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        //      TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

//        System.out.println("entro a metodo de Listado de ciudades");
//        List<Clasificador> list = clasificadorService.listadoCiudadClasificador();
//        for (Clasificador clasificador : list) {
//            System.out.println("los Datos de ciudad son:::" + clasificador.getNombre());
//        }
//        List<TipoSolicitud> list = clasificadorService.listadoTipoSolicitudClasificador();
//        for (TipoSolicitud tipoSolicitud : list) {
//            System.out.println("los Datos de ciudad son:::" + tipoSolicitud.getCodigo()+":::::Nombre::::"+tipoSolicitud.getNombre()+":::::");
//        }
//        List<TipoTramite> list = clasificadorService.listadoTipoTramiteClasificador();
//        for (TipoTramite tipoTramite : list) {
//            System.out.println("los Datos de ciudad son:::" + tipoTramite.getCodigo()+":::::Nombre::::"+tipoTramite.getNombre()+":::::");
//        }
//        EtapaTramite et = (EtapaTramite) clasificadorService.encuentraEtapaTramitePorCodigo(EtapaTramite.class, "VEN");
//        System.out.println("el tramite es::: " + et.getDescripcion());
//        List<TipoProteccionPrioridadDatos>lista=clasificadorService.listadoTipoProteccionPrioridadDatos();
//        for (TipoProteccionPrioridadDatos tipoProteccionPrioridadDatos : lista) {
//            System.out.println("descripcion ::::::::::::::::::::."+tipoProteccionPrioridadDatos.getDescripcion()+":::::::::::::::codigo padre:::::::::::::"+tipoProteccionPrioridadDatos.getDominioPadre());
//            
//        }
//        List<TipoProteccionPrioridadDatos>lista=clasificadorService.listadoTipoProteccionPrioridadDatos("EXTR");
//        for (TipoProteccionPrioridadDatos tipoProteccionPrioridadDatos : lista) {
//            System.out.println("descripcion ::::::::::::::::::::."+tipoProteccionPrioridadDatos.getDescripcion()+":::::::::::::::codigo padre:::::::::::::"+tipoProteccionPrioridadDatos.getDominioPadre());
//            
//        }
//        List<TipoProteccionPrioridad>lista=clasificadorService.listadoTipoProteccionPrioridad();
//        for (TipoProteccionPrioridad tipoProteccionPrioridad : lista) {
//            System.out.println("descripcion ::::::::::::::::::::."+tipoProteccionPrioridad.getCodigo()+":::::::::::::::codigo padre:::::::::::::"+tipoProteccionPrioridad.getDescripcion());
//        }
//        
//        List<TipoSigno>lista=clasificadorService.listadoTipoSigno();
//        for (TipoSigno tipoSigno : lista) {
//            System.out.println("descripcion ::::::::::::::::::::."+tipoSigno.getCodigo()+":::::::::::::::codigo padre:::::::::::::"+tipoSigno.getDescripcion());
//        }
//        List<TipoCiudad> lista = clasificadorService.listadoTipoCiudad();
//        for (TipoCiudad tipoCiudad : lista) {
//            System.out.println(":::::::::::::::1::::::::::::" + tipoCiudad.getCodigo() + ":::::::::::::::2:::::::::::::::::::" + tipoCiudad.getDescripcion() + ":::::::::::::::3:::::::::::::::" + tipoCiudad.getNombre());
//        }
//        List<TipoCiudadNotificacion> lista1 = clasificadorService.listadoCiudadClasificadorNotificacion();
//        for (TipoCiudadNotificacion clasificador : lista1) {
//            System.out.println("-----" + clasificador.getCodigo()+"-----"+clasificador.getDescripcion()+"-------"+clasificador.getNombre());
//        }
//        List<TipoCiudad> list = clasificadorService.listadoTipoCiudad();
//        for (TipoCiudad tipoCiudad : list) {
//            System.out.println(":::::::::::::::" + tipoCiudad.getCodigo() + ":::::::::::::::::" + tipoCiudad.getDescripcion() + "::::::::::::::::" + tipoCiudad.getNombre());
//        List<TipoSigno>lista=clasificadorService.listadoTipoSigno();
//        for (TipoSigno tipoSigno : lista) {
//            System.out.println("descripcion ::::::::::::::::::::."+tipoSigno.getCodigo()+":::::::::::::::codigo padre:::::::::::::"+tipoSigno.getDescripcion());
//        List<TipoProteccionPrioridad>lista=clasificadorService.listadoTipoProteccionPrioridad();
//        for (TipoProteccionPrioridad tipoProteccionPrioridad : lista) {
//            System.out.println("descripcion ::::::::::::::::::::."+tipoProteccionPrioridad.getCodigo()+":::::::::::::::codigo padre:::::::::::::"+tipoProteccionPrioridad.getDescripcion());
//        }
//            List<TipoSolicitudDeposito> listaDeposito = clasificadorService.listadoSolicitudDeposito();
//            for (TipoSolicitudDeposito tipoSolicitudDeposito : listaDeposito) {
//                System.out.println("el clasificador es " + tipoSolicitudDeposito.getDescripcion());
//
//            }
//            List<EstadoProceso>lista=clasificadorService.listadoEstadoProceso();
//            for (EstadoProceso estadoProceso : lista) {
//                System.out.println("los codigos son"+estadoProceso.getCodigo());
//            }
//            List<TipoSolicitante> listaTipoSolicitante = clasificadorService.listadoTipoSolicitantedPersonaSD();
//            for (TipoSolicitante tipoSolicitante : listaTipoSolicitante) {
//                System.out.println("***"+tipoSolicitante.getCodigo());
//                    List <TipoDocumentoIdentidad> listaDoc = clasificadorService.listadoTipoDocumentoIdentidadTipoSolicitante(tipoSolicitante);
//                for (TipoDocumentoIdentidad tipoDocumentoIdentidad : listaDoc) {
//                    System.out.println("****"+tipoDocumentoIdentidad.getDescripcion());
//                }
//            
//            }
//        System.out.println(":::::::::::::::::::::::::::El Formualrio ::::::::::::::::::::::");
//        List<FormularioIngresoSignosDistintivos> lista = clasificadorService.listaFormularioSignosDistintivos();
//        int cont =0;
//        for (FormularioIngresoSignosDistintivos formularioIngresoSignosDistintivos : lista) {
//            cont ++;
//            System.out.println(""+cont +":" + formularioIngresoSignosDistintivos.getDescripcion()+"");
//            List<FormularioIngresoSignosDistintivos>listaHijos=clasificadorService.listaFormularioSignosDistintivosDependientes(formularioIngresoSignosDistintivos.getCodigo());
//            for (FormularioIngresoSignosDistintivos formularioIngresoSignosDistintivos1 : listaHijos) {
//                System.out.println("                                                                                                                    "+formularioIngresoSignosDistintivos1.getDescripcion());
//            }
//        }
//        List<FormularioIngresoPojo> listaPojo = clasificadorService.listaPojoDinamico((Tramite) tramiteService.find(Tramite.class, 1L), "MIN");
//        if (!listaPojo.isEmpty()) {
//            for (FormularioIngresoPojo formularioIngresoPojo : listaPojo) {
//                System.out.println("entro al for del test");
//                System.out.println("1--- " + formularioIngresoPojo.getValorCheckBoxPadre());
//                System.out.println("2--Codigo" + formularioIngresoPojo.getDocumentoDocumentoPlantillaPadres().getFormularioIngreso().getCodigo());
//                System.out.println("3--Descripcion" + formularioIngresoPojo.getDocumentoDocumentoPlantillaPadres().getFormularioIngreso().getDescripcion());
//                for (Clasificador clasificador : formularioIngresoPojo.getListaClasificadorHijos()) {
//                    System.out.println("los valores son " + clasificador.getCodigo());
//                    System.out.println("descripcion" + clasificador.getDescripcion());
//                }
//                System.out.println("4---" + formularioIngresoPojo.getObservacion());
//                System.out.println("5---" + formularioIngresoPojo.getEstado());
//            }
//        } else {
//            System.out.println("lista vacia");
//        }
//    }
//    
//  List<TipoRequisito> lista = clasificadorService.listadoTipoRequisito();
//        for (TipoRequisito tipoRequisito : lista) 
//        {
//            System.out.println("::::::::::" + tipoRequisito.getCodigo() + "::::::::::" + tipoRequisito.getDescripcion() + "::::::::::" + tipoRequisito.getNombre());
//        }  
//    List<Clasificador>lista= clasificadorService.listaFormularioSignosDistintivosDependientesClasificador("SRSD");
//        for (Clasificador clasificador : lista) {
//            System.out.println("los valores son "+clasificador.getDescripcion());
//        }
//    
//    }
//        List<TipoFormularioVentanillaEForma>list=clasificadorService.listaDependientesRequisitoFlujoVentanillaEforma("SRS1");
//        int cont=0;
//        for (TipoFormularioVentanillaEForma tipoFormularioVentanillaEForma : list) {
//            cont++;
//            System.out.println("cod"+cont+".-"+tipoFormularioVentanillaEForma.getCodigo());
//            System.out.println("des"+cont+".-"+tipoFormularioVentanillaEForma.getDescripcion());
//            
//        }
//       
//       //------------- lista de tipo de dosificacion por regional
//       List<TipoDosificacion>lista= clasificadorService.listaTipoDosificacion();
//        for (TipoDosificacion tipoDosificacion : lista) {
//            System.out.println("nombre de tipo dosificacion::::::::::"+tipoDosificacion.getDescripcion());
//            
//        }
        //------------- lista de tipo de dosificacion por regional
//          List<TipoBanco>lista= clasificadorService.listaTipoBanco();
//          for(TipoBanco tipoBanco : lista){
//              System.out.println(":::::::::::::::CODIGO::::::::::::::"+tipoBanco.getCodigo()+":::::::::::::NOMBRE::::::::::"+tipoBanco.getNombre());
//          }
//        List<TipoPais>lista= clasificadorService.listadoTipoPais();
//        for (TipoPais tipoPais : lista){
//            System.out.println("::::::::::::::::"+tipoPais.getDescripcion()+":::::::::::::"+tipoPais.getNombre());
//            
//        }
//        List<TipoDocumentacion> lista = clasificadorService.listadoTipoDocumentacion();
//        for (TipoDocumentacion tipoDocumentacion : lista) {
//            System.out.println("  ::::::::::::::::  " + tipoDocumentacion.getCodigo() + "  :::::::::::::  " + tipoDocumentacion.getNombre() + "  :::::::::::::  " + tipoDocumentacion.getDescripcion() + "  :::::::::::::  " + tipoDocumentacion.getVigente());
//
//        }
//        List<TipoNotificacion> lista = clasificadorService.listadoTipoNotificacion();
//        for (TipoNotificacion tipoNotificacion : lista) {
//            System.out.println(" *** "+ tipoNotificacion.getCodigo());
//        }
//        List<EstadoNotificacion> lista = clasificadorService.listadoEstadoNotificacion();
//        for (EstadoNotificacion tipoNotificacion : lista) {
//            System.out.println(" *** " + tipoNotificacion.getCodigo());
//        }
//        List<EstadoPublicacion> lista2 = clasificadorService.listadoEstadoPublicacion();
//        for (EstadoPublicacion estadoPublicacion : lista2) {
//            System.out.println(" LISTA " + estadoPublicacion.getCodigo());
//        }
//        
//        List<EstadoPublicacionTramite> lista3 = clasificadorService.listadoEstadoPublicacionTramite();
//        for (EstadoPublicacionTramite estadoPublicacionTramite : lista3) {
//            System.out.println(" LISTA publicaciontramite       " + estadoPublicacionTramite.getCodigo());
//        }
//        
//        System.out.println("PRUEBA "+clasificadorService.find(EstadoPublicacion.class, EnumEstadoPublicacion.PUBLICADO.getCodigo()).toString());
//        System.out.println("PRUEBA "+clasificadorService.find(EstadoPublicacionTramite.class, EnumEstadoPublicacionTramite.ASIGNADO.getCodigo()));
//        System.out.println("PRUEBA not "+clasificadorService.find(EstadoNotificacion.class, EnumEstadoNotificacion.REALIZADO.getCodigo()).toString());
//        List<TipoPreferenciaPrioridad> lista = clasificadorService.listadoTipoPreferenciaPrioridad();
//        for (TipoPreferenciaPrioridad tipoPreferenciaPrioridad : lista) {
//            System.out.println(" *** " + tipoPreferenciaPrioridad.getCodigo());
//            
//        }
//        List<TipoPrioridad> lista = clasificadorService.listadoTipoPrioridad();
//        for (TipoPrioridad tipoPrioridad : lista) {
//            System.out.println(" *** " + tipoPrioridad.getCodigo());
//            
//        }
        
//        List<TipoPreferencia> lista = clasificadorService.listadoTipoPreferencia();
//        for (TipoPreferencia tipoPreferencia : lista) {
//            System.out.println(" *** " + tipoPreferencia.getCodigo());
//            
//        }
        
        //De acuerdo al Dominio y al Nombre devolver la Zona
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        String codigoZona = clasificadorService.devolverCodigoZona("LPZ", "HURNUNI", usuario);
//        System.out.println("CodigoZona *** " + codigoZona);
//        
//        List<EstadoProcesoPublicacion> lista = clasificadorService.listadoEstadoProcesoPublicacion();
//        for (EstadoProcesoPublicacion estadoProcesoPublicacion : lista) {
//            System.out.println("%%%%%%%%%  "+estadoProcesoPublicacion.getCodigo());
//        }
        
        System.out.println("hola");
        
        List<TipoPais> lista = clasificadorService.listadoTipoPais();
        
        for (TipoPais tipoPais : lista) {
            System.out.println("tipo pais" + tipoPais.getNombre());
        }
        
    }
}
