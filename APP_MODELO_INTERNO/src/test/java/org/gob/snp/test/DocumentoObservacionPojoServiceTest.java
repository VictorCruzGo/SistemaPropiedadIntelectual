/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.pojo.DocumentoObservacionPojo;
import org.gob.snp.pojo.ExamenFormaPojo;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.DocumentoObservacionPojoService;
import org.gob.snp.servicios.ExamenFormaPojoService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class DocumentoObservacionPojoServiceTest {

    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        DocumentoObservacionPojoService documentoObservacionPojoService = (DocumentoObservacionPojoService) context.getBean("documentoObservacionPojoService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        Tramite tramite = tramiteService.find(Tramite.class, 1L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);

        try {
            List<DocumentoObservacionPojo> lista = documentoObservacionPojoService.ListaDocumentoObservacionPojoPorTramite(tramite, usuario);
            System.out.println("Listado de Documentos Pojo");
            for (DocumentoObservacionPojo documentoObservacionPojo : lista) {
                System.out.println(" *** " + documentoObservacionPojo.getDocumento().getIdDocumento() + " **** " + documentoObservacionPojo.getObservacion());
            }

        } catch (Exception ex) {
            Logger.getLogger(DocumentoObservacionPojoServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
