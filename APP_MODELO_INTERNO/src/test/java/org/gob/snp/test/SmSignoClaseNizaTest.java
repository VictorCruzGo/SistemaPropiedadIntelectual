package org.gob.snp.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.gob.snp.entidades.ClaseNiza;
import org.gob.snp.entidades.SMSignoClaseNiza;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.ClaseNizaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.SmSignoClaseNizaService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class SmSignoClaseNizaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ProyectoFinal//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        SmSignoClaseNizaService smSignoClaseNizaService = (SmSignoClaseNizaService) context.getBean("smSignoClaseNizaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        ClaseNizaService claseNizaService = (ClaseNizaService) context.getBean("claseNizaService");
        SmSignoMarcaService smSignoMarcaService = (SmSignoMarcaService) context.getBean("smSignoMarcaService");

//        SMSignoClaseNiza smsignoclaseniza=new SMSignoClaseNiza();
//        smsignoclaseniza.setArchivoProducto("DIRECCION ARCHIVO O LISTADO DE ARCHIVOS");
//        smsignoclaseniza.setClaseNiza((Claseniza)claseNizaService.find(Claseniza.class,6L));
//        smsignoclaseniza.setListaProducto("listado de clase niza");
//        smsignoclaseniza.setNumeroClaseNiza("10");
//        smsignoclaseniza.setObservaciones("sin observaciones");
//        smsignoclaseniza.setSmsignomarca((SMSignoMarca)smSignoMarcaService.find(SMSignoMarca.class, 5L));
//        smsignoclaseniza.setVigente(true);
//        System.out.println("el id del metodo"+smSignoClaseNizaService.persistSmSignoClaseNiza(smsignoclaseniza).getIdSignoClaseNiza());
//        
//        SMSignoClaseNiza smsignoclaseniza=smSignoClaseNizaService.find(SMSignoClaseNiza.class, 2L);
//        smsignoclaseniza.setNumeroClaseNiza("1");
//        smSignoClaseNizaService.mergeSmSignoClaseNiza(smsignoclaseniza);
//        smSignoClaseNizaService.removeSmSignoClaseNiza(smsignoclaseniza);
//        
//        List<SMSignoClaseNiza>lista=smSignoClaseNizaService.listaSmSignoClaseNiza();
//        for (SMSignoClaseNiza smsignoclaseniza : lista) {
//            System.out.println("el id de la clase  niza es::::::::::::::::::::::::::::::: "+smsignoclaseniza.getIdSignoClaseNiza());
//            
//        }
//        
//        
//        SMSignoMarca smsignomarca = smSignoMarcaService.find(SMSignoMarca.class, 6L);
//        
//        System.out.println("***"+ smsignomarca.getTramite().getIdTramite());
//        
//        List <SMSignoClaseNiza> listasigno = smSignoClaseNizaService.listaSmSignoClaseNizaXSmSignoMarca(smsignomarca);
//        for (SMSignoClaseNiza smsignoclaseniza : listasigno) {
//            System.out.println("***"+smsignoclaseniza.getIdSignoClaseNiza());
//        }
   /*     List<SMSignoClaseNiza> lista = smSignoClaseNizaService.listaSmSignoClaseNizaPorTramite((Tramite) tramiteService.find(Tramite.class, 21L));
        for (SMSignoClaseNiza sMSignoClaseNiza : lista) {
            System.out.println("erl id de las clases nizas es "+sMSignoClaseNiza.getIdSignoClaseNiza());

        }*/
        
        Tramite tramite= tramiteService.find(Tramite.class, 16L);
        
        System.out.println("####"+tramite.getIdTramite());
        List<SMSignoClaseNiza> lista= smSignoClaseNizaService.listaSmSignoClaseNizaPorTramite(tramite);
        for (SMSignoClaseNiza sMSignoClaseNiza : lista) {
            System.out.println("****"+sMSignoClaseNiza.getClaseNiza().getTiposClaseNiza());
            
        }

    }
}
