package org.gob.snp.test;


import java.util.Date;
import org.gob.snp.entidades.OTRenovacion;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.OTRenovacionService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.gob.snp.test.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class OTRenovacionTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//SISTEMA_SENAPI/APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        OTRenovacionService oTRenovacionService = (OTRenovacionService) context.getBean("oTRenovacionService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

        OTRenovacion oTRenovacion = new OTRenovacion();
        oTRenovacion.setObservacion("EL FINAL DEL DIA SIN OBSERVACIONES");
        oTRenovacion.setTramite((Tramite) tramiteService.find(Tramite.class, 1L));
        oTRenovacion.setReclasificacionMultiple(Boolean.TRUE);
        oTRenovacion.setReclasificacionClase(Integer.MAX_VALUE);
        oTRenovacion.setArchivoLimitacionProductos("ARCHIVO1ARCHIVO1ARCHIVO1ARCHIVO1ARCHIVO1ARCHIVO1ARCHIVO1");
        oTRenovacion.setFechaResolucion(new Date());
        oTRenovacion.setFechaUltimaModificacion(new Date());
        oTRenovacion.setVigente(Boolean.TRUE);
        oTRenovacion = oTRenovacionService.persistOTRenovacion(oTRenovacion);
        System.out.println("el id de la nueva renocaion es " + oTRenovacion.getIdRenovacion());
        

    }

}
