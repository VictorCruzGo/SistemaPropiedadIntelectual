package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.vistas.BusquedaMarcas;
import org.gob.snp.servicios.BandejaUsuarioService;
import org.gob.snp.servicios.BusquedaMarcasService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanorojas
 */
public class BusquedaMarcasTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        Applic ationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        //       ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        
        BusquedaMarcasService bandejaUsuarioService = (BusquedaMarcasService) context.getBean("busquedaMarcasService");

        
        
        System.out.println("Hola");
        
        //listaBusquedasSMMarcaClaseSolicitanteApoderado(String codigoSM, String marca, String claseNiza, String datoSolicitante, String datoApoderado, Long idUsuario){
        
        List<BusquedaMarcas> listaBandeja = bandejaUsuarioService.listaBusquedasSMMarcaClaseSolicitanteApoderado("","","","","",1L);
        
        
        for (BusquedaMarcas busquedaMarcas : listaBandeja) {
            System.out.println(" *** " + busquedaMarcas.getMarca() + " codigoSM *** " + busquedaMarcas.getCodigoSM() + " claseNiza "+ busquedaMarcas.getClase() + "solicitante  " + busquedaMarcas.getSolicitante() + "apoderado "  + busquedaMarcas.getApoderado());
        }
        
        
    }
}
