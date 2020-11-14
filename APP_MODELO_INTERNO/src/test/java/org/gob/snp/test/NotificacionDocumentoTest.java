/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.NotificacionDocumento;
import org.gob.snp.servicios.DocumentoService;
import org.gob.snp.servicios.NotificacionDocumentoService;
import org.gob.snp.servicios.NotificacionService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Gustavo Lizarraga
 *
 */
public class NotificacionDocumentoTest {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        NotificacionDocumentoService notificacionDocumentoService = (NotificacionDocumentoService) context.getBean("notificacionDocumentoService");
        NotificacionService notificacionService = (NotificacionService) context.getBean("notificacionService");
        DocumentoService documentoService = (DocumentoService) context.getBean("documentoService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

//
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        Tramite tramite = tramiteService.find(Tramite.class, 1L);
//        Documento documento = documentoService.find(Documento.class, 1L);
        Notificacion notificacion = notificacionService.find(Notificacion.class, 1L);

        //Almacenamiento del registro
//        NotificacionDocumento notificacionDocumento = new NotificacionDocumento();
//        notificacionDocumento.setDocumento(documento);
//        notificacionDocumento.setNotificacion(notificacion);
//        notificacionDocumento.setFechaUltimaModificacion(new Date());
//        notificacionDocumento.setObservacionNotificacionDocumento("Observaciones del Registro");
//        notificacionDocumento.setUsuario(usuario.getIdUsuario());
//        NotificacionDocumento notificacionDocumentoAux = notificacionDocumentoService.persist(notificacionDocumento);
        //Modificacion del registro
//        NotificacionDocumento notificacionDocumento = notificacionDocumentoService.find(NotificacionDocumento.class, 1L);
//        notificacionDocumento.setObservacionNotificacionDocumento("Otra Observacion");
//        notificacionDocumentoService.merge(notificacionDocumento);
        //Eliminacion del Registro
//        NotificacionDocumento notificacionDocumento = notificacionDocumentoService.find(NotificacionDocumento.class, 1L);
//        
//        try {
//            notificacionDocumentoService.removeNotificacionDocumento(notificacionDocumento);
//            System.out.println("se elimino el registro correctamente");
//        } catch (Exception ex) {
//            Logger.getLogger(NotificacionDocumentoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        List<NotificacionDocumento> lista = notificacionDocumentoService.listaDocumentosDeUnaNotificacion(notificacion);
        System.out.println("Tamaño: " + lista.size());
        for (NotificacionDocumento nd : lista) {
            System.out.println("Documentos: " + nd.getDocumento().getDescripcion() + "---" + nd.getObservacionNotificacionDocumento() + "---" + nd.getDocumento().getNombreArchivo());
        }

    }

}
