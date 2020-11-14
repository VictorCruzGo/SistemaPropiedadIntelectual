/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import org.gob.snp.servicios.ErrorAplicacionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class ErrorAplicacionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        
        ErrorAplicacionService errorAplicacionService = (ErrorAplicacionService) context.getBean("errorAplicacionService");
        
        
        System.out.println(" Error :::: "+ errorAplicacionService.obtenerErrorAplicacion(76L));
        
        
        

    }

}
