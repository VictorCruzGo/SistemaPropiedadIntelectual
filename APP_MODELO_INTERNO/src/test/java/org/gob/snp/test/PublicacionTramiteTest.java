/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.PublicacionTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.PublicacionService;
import org.gob.snp.servicios.PublicacionTramiteService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Susana Escobar Paz
 */
public class PublicacionTramiteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        PublicacionService publicacionService = (PublicacionService) context.getBean("publicacionService");
        PublicacionTramiteService publicacionTramiteService = (PublicacionTramiteService) context.getBean("publicacionTramiteService");

        Tramite tramite = tramiteService.find(Tramite.class, 149566L);
        Usuario usuario = usuarioService.find(Usuario.class, 167L);
        Publicacion publicacion = publicacionService.find(Publicacion.class, 2l);
//        PublicacionTramite publicacionTramite = new PublicacionTramite();
//        publicacionTramite = publicacionTramiteService.find(PublicacionTramite.class, 2l);

//        publicacionTramite.setPublicacion(publicacion);
//        publicacionTramite.setTramite(tramite);
////        
//        publicacionTramite.setNumeroPublicacion(10);
//        publicacionTramite.setPublicado(false);
////        
////        
//        publicacionTramite.setObservacion("observacion");
//        publicacionTramite.setEstadoPublicacionTramite("ELIM");
//        publicacionTramite.setUsuario(usuario.getIdUsuario());
//        
//        publicacionTramite.setFechaUltimaModificacion(new Date());
//        PublicacionTramite nuevo =publicacionTramiteService.persistPublicacionTramite(publicacionTramite);
//        System.out.println("EL NUEVO OBJETO PUBLICACIONTRAMITE ES    "+nuevo.getIdPublicacionTramite());
//        PublicacionTramite actualizar = publicacionTramiteService.find(PublicacionTramite.class, 1l);
//        actualizar.setEstadoPublicacionTramite("ELIM");
        //publicacionTramiteService.mergePublicacionTramite(actualizar);
        //publicacionTramiteService.removePublicacionTramite(actualizar);
//        try {
//            List<PublicacionTramite> lista = publicacionTramiteService.listaPublicacionTramite();
//            if (!lista.isEmpty()) {
//                for (PublicacionTramite publicacionTramite2 : lista) {
//                    System.out.println("la lista de publicacionTramite  es    " + publicacionTramite2.getIdPublicacionTramite());
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/");
//        try {
//            List<PublicacionTramite> lista2 = publicacionTramiteService.listaPublicacionTramitePorPublicacion(publicacion, usuario);
//            if (!lista2.isEmpty()) {
//                for (PublicacionTramite publicacionTramite3 : lista2) {
//                    System.out.println("la lista de publicacionTramite  es   + " + publicacionTramite3.getIdPublicacionTramite());
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
       // publicacionTramiteService.devolverPublicacionTramite(publicacionTramite, usuario);
        PublicacionTramite recuperado = publicacionTramiteService.encuentraPublicacionTramiteAsigPorTramite(tramite, usuario);
        System.out.println("recuperadoo     "+recuperado);

    }

}
