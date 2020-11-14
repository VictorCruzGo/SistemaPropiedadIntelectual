/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import org.gob.snp.entidades.DocumentoPublicacion;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoDocumento;
import org.gob.snp.enums.EnumEstadoPublicacion;
import org.gob.snp.servicios.DocumentoPublicacionService;
import org.gob.snp.servicios.PublicacionService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Susana
 */
public class DocumentoPublicacionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        PublicacionService publicacionService = (PublicacionService) context.getBean("publicacionService");
        DocumentoPublicacionService documentoPublicacionService = (DocumentoPublicacionService) context.getBean("documentoPublicacionService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        Publicacion publicacion = publicacionService.find(Publicacion.class, 15l);
        Usuario usuario = usuarioService.find(Usuario.class, 19L);
        DocumentoPublicacion documentoPublicacion = new DocumentoPublicacion();

      //  documentoPublicacion.setPublicacion(publicacion);
  //      documentoPublicacion.setNombreArchivo("Tux.jpg");

        //File file = new File ("//home//henrry//Pictures//Tux.jpg");
        //File file = new File ("//home//henrry//Pictures//LINUX.jpg");
//        File file = new File("//home//henrry//Pictures//ubuntu.jpg");
//
//        byte[] bFile = new byte[(int) file.length()];
//
//        try {
//
//            FileInputStream fileInputStream = new FileInputStream(file);
//            //convertir el archivo en array de bytes
//            fileInputStream.read(bFile);
//            fileInputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

      //  documentoPublicacion.setArchivoPublicacion(bFile);
     //   documentoPublicacion.setEstadoPublicacion("PUBL");

      //  Boolean w = documentoPublicacionService.creaDocumentoPublicacion(documentoPublicacion, usuario);
      //  System.out.println("NUEVOOOO " + w);

        //DocumentoPublicacion nuevo = documentoPublicacionService.persistDocumentoPublicacion(documentoPublicacion);
        //System.out.println("NUEVO DOCUMENTOPUBLICACION  "+nuevo);
        //   DocumentoPublicacion actualizar = documentoPublicacionService.find(DocumentoPublicacion.class, 4l);
//        actualizar.setNombreArchivo("nombre.jpg");
        //documentoPublicacionService.mergeDocumentoPublicacion(actualizar);
        //documentoPublicacionService.removeDocumentoPublicacion(actualizar);
//        try {
//            List<DocumentoPublicacion> lista = documentoPublicacionService.listaDocumentoPublicacion();
//            if (!lista.isEmpty()) {
//                for (DocumentoPublicacion documentoPublicacion2 : lista) {
//                    System.out.println("la lista de documentopublicacion  es    " + documentoPublicacion2.getIdDocumentoPublicacion());
//                    //System.out.println("EL ARCHIVO ES "+Arrays.toString(documentoPublicacion2.getArchivoPublicacion()));
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*");
//        Publicacion publicacionC = publicacionService.find(Publicacion.class, 8l);
//        try {
//            List<DocumentoPublicacion> lista2 = documentoPublicacionService.listaDocumentoPublicacionPorPublicacion(publicacionC, usuario);
//            if (!lista2.isEmpty()) {
//                for (DocumentoPublicacion documentoPublicacion3 : lista2) {
//                    System.out.println("la lista de documentopublicacion  es    " + documentoPublicacion3.getEstadoPublicacion());
//                    // System.out.println("EL ARCHIVO ES "+Arrays.toString(documentoPublicacion3.getArchivoPublicacion()));
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
       
        String estado = EnumEstadoPublicacion.PUBLICADO.getCodigo();
        DocumentoPublicacion lista = documentoPublicacionService.encuentraDocumentoPubblicacionPorEstado(publicacion,estado,usuario);
        System.out.println("LISTA   "+lista);
            
        
    }
    }
