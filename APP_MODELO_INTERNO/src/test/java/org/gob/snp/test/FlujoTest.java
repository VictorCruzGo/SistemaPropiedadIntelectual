/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.FlujoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class FlujoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//             ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        FlujoService flujoService = (FlujoService) context.getBean("flujoService");
        ClasificadorService clasificadorService=(ClasificadorService)context.getBean("clasificadorService");

//        TipoTramite tipoTramite = new TipoTramite();
//        tipoTramite.setCodigo("REGS");
        
        
        Flujo flujo=(Flujo)flujoService.find(Flujo.class, 1L);

        System.out.println("ddddddddddddd"+flujo.getTipoTramite().getCodigo());
        TipoTramite tipoTramite = (TipoTramite) clasificadorService.find(TipoTramite.class, flujo.getTipoTramite().getCodigo());
        System.out.println("el Flujo es::: " + tipoTramite.getCodigo());

    }

}
