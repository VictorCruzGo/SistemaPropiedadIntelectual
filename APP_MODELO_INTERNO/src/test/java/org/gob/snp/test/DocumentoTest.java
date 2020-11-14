/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoArchivo;
import org.gob.snp.entidades.vistas.TipoDocumentacion;
import org.gob.snp.enums.EnumTipoArchivo;
import org.gob.snp.enums.EnumTipoDocumentacion;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DocumentoService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
//import org.gob.snp.servicios.impl.DocumentoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan Valdivia
 */
public class DocumentoTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        //  ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        DocumentoService documentoService = (DocumentoService) context.getBean("documentoService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");

        Tramite tramite = tramiteService.find(Tramite.class, 5L);
        Usuario usuario = usuarioService.find(Usuario.class, 20L);
        //Documento documento2 = documentoService.find(Documento.class, 6l);

//        TipoDocumentacion tipoDocumentacion = new TipoDocumentacion();
//        // tipoDocumentacion.setCodigo("RES");
//        List<Documento> lista = documentoService.documentosPorTramite(tramite);
//        for (Documento documento : lista) {
//            System.out.println("el documento es-----" + documento.getIdDocumento());
//        }
//        try {
//            List<Documento> lista = documentoService.listadoDocumentosAEntregarPorTramite(tramite);
//            System.out.println("\n\nNumero Trámite: " + tramite.getIdTramite() + "\nTipo de Documentacion: " + tipoDocumentacion.getCodigo() + "\n");
//            for (Documento documento : lista) {
//                System.out.println("Archivos por entregar: " + documento.getNombreArchivo());
//            }
//        } catch (Exception e) {
//            System.out.println("Ocurrio un error en el Listado." + e.getMessage());
//        }
        Date fechaRegistro = new Date();
        Documento documento = new Documento();
//            documento.setTramite(tramite);
//            documento.setIdAnalisisEtapa(Long.MIN_VALUE);
//            documento.setUbicacion("/ruta");
//            documento.setNombreArchivo("nombre");
//            documento.setDescripcion("descripcion");
//            documento.setNroFolios(1);
//            documento.setFechaCreacion(fechaRegistro);
//            documento.setTipoDocumentacion((TipoDocumentacion) clasificadorService.find(TipoDocumentacion.class, EnumTipoDocumentacion.REGISTRO.getCodigo()));
//            documento.setTipoArchivo((TipoArchivo) clasificadorService.find(TipoArchivo.class, EnumTipoArchivo.PDF.getCodigo())); 
//            documento.setNumeroImpresiones(0);
//            documento.setVigente(Boolean.TRUE);
//            documento.setFechaUltimaModificacion(fechaRegistro);
//            documento.setUsuarioModificador(usuario.getIdUsuario());
//            //EnumTipoDocumentacion.REGISTRO.getCodigo();
//            // documento.setTipoDocumentacion(tipo);            
//            System.out.println("SE CARGARON LOS DATOS   "+EnumTipoDocumentacion.REGISTRO.getCodigo());
//            documentoService.persistDocumento(documento);

        documentoService.adicionarImpresion(tramite, usuario);
        Integer s = documentoService.documentoRegistroPorTramite(tramite);
        System.out.println(" NUEVO NUMERO DE IMPRESIONES  " + s);

    }

}
