package org.gob.snp.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Pagina;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.PaginaService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.RegistroService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanoRojas
 */
public class RegistroTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//SISTEMA_SENAPI/APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        RegistroService registroService = (RegistroService) context.getBean("registroService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        RegistroService registrolService = (RegistroService) context.getBean("registroService");
        PaginaService paginaService = (PaginaService) context.getBean("paginaService");

//
//        Registro registro = new Registro();
//        registro.setRegistro("789");
//        registro.setFechaRegistro(new Date());
//        registro.setFechaUltimaModificacion(new Date());
//        registro.setNroTitulo("16546546561");
//        registro.setTramite((Tramite) tramiteService.find(Tramite.class, 4L));
//        registroService.persistRegistro(registro);
//        System.out.println(":::::::::::::::::::::::::::::" + registroService.validaDatoNumeroRepetido(registro));
//        System.out.println(":::::::::::::::::::::::::::::" + registroService.validaDatoRegistroRepetido(registro));
//
//        regionalService.persistRegional(regional);
//        Regional r = regionalService.obtieneRegionalPorCiudadNotificacion("LPZ");
//        System.out.println("Nombre:" + r.getNombre() + " Direccion:" + r.getDireccion());
//        Regional regional = regionalService.obtieneRegionalPorUsuario(1L);
//busqueda por parametros
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////        Date fechaInicial=null;
//        Date fechaInicial = sdf.parse("2014-10-14");
////        Date fechaInicial = sdf.parse("");
////        String fechaInicial="";
//        String codigoResolucion = "SM-0001-2014";
//        String numeroResolucion = "REG1";
////        String codigoResolucion = "";
////        String numeroResolucion = "";
////        System.out.println("::::" + fechaInicial);
////    
//        List<Tramite> list = registroService.listaTramiteFiltradoParametros((Usuario) usuarioService.find(Usuario.class, 18L), fechaInicial, codigoResolucion, numeroResolucion);
//        for (Tramite tramite : list) {
//            System.out.println("los id's son" + tramite.getIdTramite());
//        }
//        Tramite tramite = tramiteService.find(Tramite.class, 6L);
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        Regional regional = regionalService.find(Regional.class, 1L);

//        Registro registro = registroService.recuperaRegistroPorTramite(tramite);
//        System.out.println("REGISTRO RECUPARADO ES TEST " + registro);
//
//        Registro registroNuevo = registroService.creaRegistroDocumento(tramite, usuario);
//        System.out.println("REGISTRO CREADO ES " + registroNuevo);
        /**
         * *****************serie********************
         */
//        PersonaEmpresaTramite valor = tramiteService.recuperaPersonaEmpresaTramitePorTramite(tramite);
//
//        String serie = registroService.generaSerie(tramite);
//        System.out.println("serie generada " + serie);
//        
//        Registro registro = registrolService.creaRegistroDocumento(tramite, usuario);
//        
//        System.out.println("REGISTRO NUEVO    "+registro);
//        Documento documento = registroService.creaDocumento(tramite, usuario);
//        System.out.println("NUEVO DOCUMENTO    " + documento.getTramite().getIdTramite());
//
        
        
        Pagina pagina=paginaService.encuentraPaginaPorFlujo(1L);
        
        
        
        
    }

}
