/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.ObservacionTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.ObservacionTramiteService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.gob.snp.servicios.util.BusquedaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Eddy Valero
 */
public class BusquedaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");                                                                                           
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branchesInterno//APP_SIUNO_INTERNO/src//main//webapp//WEB-INF//applicationContext.xml");
        
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        BusquedaService busquedaService = (BusquedaService) context.getBean("busquedaService");

        Tramite tramite = busquedaService.obtenerTramitePorCodigoDia("2015120137", 1L);
        
        System.out.println(" *** "+ tramite.getIdTramite());

        
        

    }

}
