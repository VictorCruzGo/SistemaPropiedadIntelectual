package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.vistas.BusquedaSmmarca;
import org.gob.snp.servicios.BusquedaSmmarcaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanorojas
 */
public class BusquedaSmmarcaTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        Applic ationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        //       ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        
        BusquedaSmmarcaService bandejaUsuarioService = (BusquedaSmmarcaService) context.getBean("busquedaSmmarcaService");

        
        
        System.out.println("Hola");
        
        //listaBusquedasSMMarcaClaseSolicitanteApoderado(String codigoSM, String marca, String claseNiza, String datoSolicitante, String datoApoderado, Long idUsuario){
        
        List<BusquedaSmmarca> listaBandeja = bandejaUsuarioService.listaBusquedasSMMarcaClase("", "", "", 1L);
        
        
        for (BusquedaSmmarca busquedaMarcas : listaBandeja) {
            System.out.println(" *** " + busquedaMarcas.getMarca() + " codigoSM *** " + busquedaMarcas.getMarca() );
        }
        
        
    }
}
