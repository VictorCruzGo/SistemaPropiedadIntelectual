package org.gob.snp.test;

import java.nio.file.Files;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.ClaseNiza;
import org.gob.snp.servicios.ClaseNizaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanoRojas
 */
public class ClaseNizaTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ClaseNizaService claseNizaService = (ClaseNizaService) context.getBean("claseNizaService");

//        for (int i = 1; i < 46; i++) {
//        Claseniza claseNiza=new Claseniza();
//        claseNiza.setFechaFin(new Date());
//        claseNiza.setFechaInicio(new Date());
//        claseNiza.setNumeroClaseNiza(""+i);
//        claseNiza.setProteccion("CLASE NISA+++++++++++++"+i);
//        claseNiza.setVigente(true);
//        claseNiza=claseNizaService.persistClaseNiza(claseNiza);
//        System.out.println("el id de la clase niza es "+claseNiza.getIdClaseNiza());
//        }
        
        
        
//        List<ClaseNiza> lista = claseNizaService.listaClaseNiza();
//        for (ClaseNiza claseNiza : lista) {
//            System.out.println("entro al metodo");
//            System.out.println("-"+claseNiza.getNumeroClaseNiza());
//            
//        }
//        
        
        
        
        
        List<String>listaDos=claseNizaService.listaNumerosClaseNizaServicios();
        for (String string : listaDos) {
            System.out.println("-"+string);
        }
        
        
        
//        List<String>listaDos=claseNizaService.listaNumerosClaseNizaProductosValidados();
//        for (String string : listaDos) {
//            System.out.println("-"+string);
//        }
        
//        List<String>listaDos=claseNizaService.listaNumerosClaseNizaServiciosValidados();
//        for (String string : listaDos) {
//            System.out.println("-"+string);
//        }
//        List<Claseniza>listaFiltrada=claseNizaService.listaClaseNizaProductosServicios("productos");
//        for (Claseniza claseniza : listaFiltrada) {
//            System.out.println("el id de la clase  niza"+claseniza.getIdClaseNiza());
//            System.out.println("el id de la clase  niza"+claseniza.getTiposClaseNiza());
//            System.out.println("el tipo de la clase es"+claseniza.getTipo());
//            
//        }
//        List<String> listaFiltrada = claseNizaService.listaNumerosClaseNizaProductosServicios();
//        for (String claseniza : listaFiltrada) {
//            System.out.println("numero:" + claseniza);
//        }
        
//        List<Claseniza>listaFiltrada=claseNizaService.listaClaseNizaProductosServicios("comida");
//        for (Claseniza claseniza : listaFiltrada) {
//            System.out.println("el id de la clase  niza"+claseniza.getIdClaseNiza());
//            System.out.println("--------------"+claseniza.getTiposClaseNiza());
//            System.out.println("--------------"+claseniza.getNotaTipoCLaseNiza());
//            System.out.println("tipo----------------------"+claseniza.getTipo());
//            
//        }
//        List<String>listaFiltrada2=claseNizaService.listadoDeBuscador("comida");
//        for (String string : listaFiltrada2) {
//            System.out.println("entro a la lista");
//        }
            
        
    }
}

