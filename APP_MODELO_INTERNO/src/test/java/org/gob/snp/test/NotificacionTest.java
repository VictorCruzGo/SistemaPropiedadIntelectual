/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.DocumentoObservacionPojo;
import org.gob.snp.servicios.NotificacionService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Gustavo Lizarraga
 *
 */
public class NotificacionTest {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        NotificacionService notificacionService = (NotificacionService) context.getBean("notificacionService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
//        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
//        DocumentoObservacion PojoService documentoObservacionPojoService = (DocumentoObservacion PojoService) context.getBean("documentoObservacionPojoService");

//        Usuario usuario = usuarioService.find(Usuario.class, 22L);
//        Tramite tramite = tramiteService.find(Tramite.class, 2L);
//        
//        List<DocumentoObservacionPojo> listaDocumentoObservacionPojo;
//        try {
//            listaDocumentoObservacionPojo = documentoObservacionPojoService.ListaDocumentoObservacionPojoPorTramite(tramite, usuario);
//            for (DocumentoObservacionPojo documentoObservacionPojo : listaDocumentoObservacionPojo) {
//                System.out.println(" ** "+ documentoObservacionPojo.getDocumento().getIdDocumento());
//            }
//            
//            notificacionService.guardarRegistroDocumentosNotificacion(listaDocumentoObservacionPojo, tramite, usuario);
//        } catch (Exception ex) {
//            Logger.getLogger(NotificacionTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
    }

}
