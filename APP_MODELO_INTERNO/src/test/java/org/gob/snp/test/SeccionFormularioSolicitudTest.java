/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import org.gob.snp.servicios.SeccionFormularioSolicitudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy valero
 */
public class SeccionFormularioSolicitudTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");                                                                                           
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        
        
        SeccionFormularioSolicitudService seccionFormularioSolicitudService = (SeccionFormularioSolicitudService) context.getBean("seccionFormularioSolicitudService");
        
        
        
        /*
        Long nroSecciones= 0L;
        nroSecciones = seccionFormularioSolicitudService.numeroSeccionesSolicitudFlujo(1L, 1L);
        System.out.println(" *** " + nroSecciones);
                */
        
        System.out.println(" *** " + seccionFormularioSolicitudService.generarEtapaValidacionTramite(1L, 4L, 1L));
        
        
        System.out.println(" *** " + seccionFormularioSolicitudService.actualizaEtapaValidacionTramite("11111", 14L, 3L, 1L));
        
        
        

        
        


    }

}
