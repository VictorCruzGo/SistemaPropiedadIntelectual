package org.gob.snp.test;

import java.util.Date;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class RegionalTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//SISTEMA_SENAPI/APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        

        //Metodo que permite obtener la regional a partir de un listado de direcciones
        Tramite tramite = tramiteService.find(Tramite.class, 1L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        Regional regional = regionalService.encuentraRegionalDeDireccionPorTramite(tramite, usuario);
        
        System.out.println("regional *** "+ regional.getIdRegional());
        

        
        

        

            
    }
  
}
