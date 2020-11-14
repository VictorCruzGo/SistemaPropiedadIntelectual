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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy valero
 */
public class ObservacionTramiteTest {

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

        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ObservacionTramiteService observacionTramiteService = (ObservacionTramiteService) context.getBean("observacionTramiteService");

        Tramite tramite = tramiteService.find(Tramite.class, 1L);

        //Prueba persistencia
        ObservacionTramite observacionTramite = new ObservacionTramite();
//        observacionTramite.setTramite(tramite);
//        observacionTramite.setIdUsuario(1L);
//        observacionTramite.setEtapaTramite("PUB");
//        observacionTramite.setDescripcion("Observacion Publicacion");
//        observacionTramite.setFechaObservacion(new Date());
//        observacionTramite.setFechaUltimaModificacion(new Date());
//        observacionTramite.setUsuario(1L);
//        observacionTramite = observacionTramiteService.persistObservacionTramite(observacionTramite);
//        System.out.println("Tramite "+ tramite.getIdTramite());

        //Prueba Actualizacion
//        observacionTramite = observacionTramiteService.find(ObservacionTramite.class, 1L);
//        observacionTramite.setEtapaTramite("VEN");
//        observacionTramiteService.mergeObservacionTramite(observacionTramite);
        //Prueba Eliminacion
//        observacionTramite = observacionTramiteService.find(ObservacionTramite.class, 3L);
//        observacionTramiteService.removeObservacionTramite(observacionTramite);
        //Prueba Mostrar Datos
//        List<ObservacionTramite> listaObservacionTramite = observacionTramiteService.listaObservacionTramite();
//        
//        for (ObservacionTramite observacionTramite1 : listaObservacionTramite) {
//            System.out.println(" *** " + observacionTramite1.getDescripcion());
//        }
        //String[] cadenaLemaComercial = observacionTramiteService.obtenerCadena("Nombre Marca:uno; CodigoSM: dos; Certificado Nro: tres; Serie: cuatro; fecha Vigencia: cinco; Numero Formulario: ");

//        for (String string : cadenaLemaComercial) {
//
//            if (string.equals(" ")) {
//                System.out.println("es vacio");
//            } else {
//                System.out.println(" *** :" + string);
//            }
//        }
        
        String[] cadenaLemaComercial = observacionTramiteService.validaCamposDatosLemaComercial("Todos podemos", "", "123", "123", "125", "125", Boolean.TRUE);
        
        System.out.println("  *** " + cadenaLemaComercial[0]);
        
        
        
        
        
        
        

    }

}
