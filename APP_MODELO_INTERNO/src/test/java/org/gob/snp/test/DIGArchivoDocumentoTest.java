/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.gob.snp.entidades.DIGArchivoDocumento;
import org.gob.snp.entidades.Documento;
import org.gob.snp.servicios.DIGArchivoDocumentoService;
import org.gob.snp.servicios.DocumentoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class DIGArchivoDocumentoTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");        
        DocumentoService documentoService = (DocumentoService) context.getBean("documentoService");
        DIGArchivoDocumentoService dIGArchivoDocumentoService = (DIGArchivoDocumentoService) context.getBean("dIGArchivoDocumentoService");
        
//        Documento documento = documentoService.find(Documento.class, 1L);
//        
//        DIGArchivoDocumento dIGArchivoDocumento = new DIGArchivoDocumento();
//        
//        dIGArchivoDocumento.setDocumento(documento);
//        //dIGArchivoDocumento.setIdDIGArchivoDocumento(1L);
//        File file = new File ("//home//eddy//img//angularjs.pdf");
////        File file = new File ("//home//eddy//logotipo.png");
////        File file = new File ("//home//eddy//poohUno.jpeg");
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
//        
//        
//        
//        dIGArchivoDocumento.setImagen(bFile);
//        
//        dIGArchivoDocumentoService.persist(dIGArchivoDocumento);
//        
//        System.out.println("hola ");
        
        
        String nombreArchivo = "inception.pdf";
        System.out.println("nombre");
        int tamanio = nombreArchivo.length();
        System.out.println("el tamanio----"+tamanio);
        System.out.println("la extension es punto-----"+nombreArchivo.substring(tamanio-4, tamanio-3));
        System.out.println("la extension es-----"+nombreArchivo.substring(tamanio-3, tamanio));
    }
}
