package org.gob.snp.test;

import org.gob.snp.entidades.Modificacion;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.enums.EnumTipoModificacion;
import org.gob.snp.servicios.ModificacionService;
import org.gob.snp.servicios.PaginaService;
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
public class ModificacionTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branchesInterno//APP_SIUNO_INTERNO/src//main//webapp//WEB-INF//applicationContext.xml");  
        ///home/susana/Proyecto_Susan/branchesInterno/APP_SIUNO_INTERNO/src/main/webapp/WEB-INF/applicationContext.xml
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//SISTEMA_SENAPI/APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ModificacionService modificacionService = (ModificacionService) context.getBean("modificacionService");
        RegistroService registroService = (RegistroService) context.getBean("registroService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        RegistroService registrolService = (RegistroService) context.getBean("registroService");
        PaginaService paginaService = (PaginaService) context.getBean("paginaService");

        Tramite tramite = tramiteService.find(Tramite.class, 6L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        
        
       // Modificacion modificacion = modificacionService.preguntaSiExisteModificacionPorTipoModificacion(tramite, EnumTipoModificacion.LICENCIA_DE_USO.getCodigo(), usuario);
        
        Tramite encontrado = modificacionService.encuentraTramiteModificacionPorCodigo("CN-000001-2015", usuario);
        System.out.println("encontrado   "+encontrado);

    }

}
