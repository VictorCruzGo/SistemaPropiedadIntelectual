/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.PublicacionService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Susana Escobar Paz
 */
public class PublicacionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        PublicacionService publicacionService = (PublicacionService) context.getBean("publicacionService");
//        Publicacion publicacion = new Publicacion();
//        publicacion.setFecha(new Date());
//        publicacion.setFechaPublicacionGaceta(new Date());
//        publicacion.setFechaPublicacionWeb(new Date());
//        publicacion.setPublicadoWeb(Boolean.TRUE);
//        publicacion.setInicioNumeroPublicacion(1);
//        publicacion.setFinNumeroPublicacion(10);
//        publicacion.setObservacion("observacion");
//        publicacion.setNroGaceta(10);
//        publicacion.setEstadoPublicacion("GEN");
//        publicacion.setFechaCreacionRegistro(new Date());
//        publicacion.setUsuario(20l);
//        publicacion.setFechaUltimaModificacion(new Date());
        // Publicacion nuevo = publicacionService.persistPublicacion(publicacion);
        //setLugarExpedicion((TipoCiudad) clasificadorService.find(TipoCiudad.class, "LPZ"));
        //System.out.println("el id de la nueva publicacion  es   " + nuevo.getIdPublicacion());

//        Publicacion actualizar = new Publicacion();
//        actualizar = publicacionService.find(Publicacion.class, 3l);
//        actualizar.setNroGaceta(11);
        //publicacionService.merge(actualizar);
        //publicacionService.remove(actualizar);
        Usuario usuario = usuarioService.find(Usuario.class, 20l);
        Publicacion publicacion = publicacionService.find(Publicacion.class, 9l);
//
       // Publicacion prueba = publicacionService.creaPublicacion(usuario);
        
        Long numero = publicacionService.recuperaCantidadTramitesPorPublicacion(publicacion, usuario);
        System.out.println(" &&%&%&% "+numero);
        
        //System.out.println("PUBLICACION NUEVA ES "+prueba);

//        try {
//            List<Publicacion> lista = publicacionService.listaPublicacion();
//            if (!lista.isEmpty()) {
//                for (Publicacion publicacion2 : lista) {
//                    System.out.println("la lista de publicaciones  es    " + publicacion2.getIdPublicacion());
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

}
