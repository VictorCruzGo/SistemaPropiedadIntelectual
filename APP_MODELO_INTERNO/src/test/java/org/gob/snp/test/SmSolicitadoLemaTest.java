/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.SMSolicitadoLema;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.SmSolicitadoLemaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Eddy Valero
 */
public class SmSolicitadoLemaTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        SmSolicitadoLemaService smSolicitadoLemaService = (SmSolicitadoLemaService) context.getBean("smSolicitadoLemaService");

        SmSignoMarcaService smSignoMarcaService = (SmSignoMarcaService) context.getBean("smSignoMarcaService");

        //Pruebas de los servicios de SMSolicitadoLema
        SMSignoMarca smSignoMarca = smSignoMarcaService.find(SMSignoMarca.class, 1L);

        //Persist
//        SMSolicitadoLema smSolicitadoLema = new SMSolicitadoLema();
//        smSolicitadoLema.setFechaUltimaModificacion(new Date());
//        smSolicitadoLema.setFrase("Mi Frase");
//        smSolicitadoLema.setTramite(smSignoMarca.getTramite());
//        smSolicitadoLemaService.persist(smSolicitadoLema);
//        System.out.println("Se realizo la insercion correctamente ... ");

        //Remove
//        SMSolicitadoLema smSolicitadoLema = smSolicitadoLemaService.find(SMSolicitadoLema.class, 1L);
//        smSolicitadoLemaService.remove(smSolicitadoLema);
//        System.out.println("Se realizo la eliminacion correctamente ....");
        //          SMSolicitadoLema sMSolicitadoLemaAux = 
        //Merge
//        SMSolicitadoLema smSolicitadoLema = smSolicitadoLemaService.find(SMSolicitadoLema.class, 2L);
//        smSolicitadoLema.setFrase("Mi nueva Frase");
//        smSolicitadoLemaService.merge(smSolicitadoLema);
//        System.out.println("Se realizó la modificacion *** ");
        
        //Listado
        List <SMSolicitadoLema> lista = smSolicitadoLemaService.listadoSmsolicitadoprioridad();
                
        for (SMSolicitadoLema sMSolicitadoLema : lista) {
            System.out.println(" *** "+ sMSolicitadoLema.getIdSolicitadoLema() + " *** "  + sMSolicitadoLema.getFrase() );
        }
        
    }

}
