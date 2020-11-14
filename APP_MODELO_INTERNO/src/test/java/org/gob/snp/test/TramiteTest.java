package org.gob.snp.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.ClaseNiza;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Direccion;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Expediente;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.PublicacionTramite;
import org.gob.snp.entidades.Regional;

import org.gob.snp.entidades.SMLogotipo;
import org.gob.snp.entidades.SMSignoClaseNiza;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoProceso;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoContacto;
import org.gob.snp.entidades.vistas.TipoDocumento;
import org.gob.snp.entidades.vistas.TipoGenero;
import org.gob.snp.entidades.vistas.TipoGeneroPersona;
import org.gob.snp.entidades.vistas.TipoSolicitante;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.enums.EnumEtapaTramite;
import org.gob.snp.enums.EnumTipoSigno;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.PoderService;
import org.gob.snp.servicios.ClaseNizaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DireccionService;
import org.gob.snp.servicios.ExpedienteService;
import org.gob.snp.servicios.PersonaEmpresaTramiteService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.PublicacionService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class TramiteTest {
private static TramiteService tramiteService;
    public static void main(String[] args) throws Exception {
        
        //ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano////SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

         TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
         UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
         
         
        //List<Tramite> tramites=tramiteService.encuentraTramiteXVariosCampos("1","ENT","","");
       // System.out.println("Tam Tramites"+tramites.size());
         
         
         System.out.println("hola");
         
         Usuario usuario = usuarioService.find(Usuario.class, 1L);
         Tramite tramite = tramiteService.find(Tramite.class, 35L);
         
         tramiteService.generaCodigoTramiteVentanillaPorRegional(tramite, usuario);
    }
}
