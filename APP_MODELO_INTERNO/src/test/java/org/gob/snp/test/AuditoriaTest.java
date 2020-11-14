/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Auditoria;
import org.gob.snp.servicios.AuditoriaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy valero
 */
public class AuditoriaTest {

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

        AuditoriaService auditoriaService = (AuditoriaService) context.getBean("auditoriaService");

        Auditoria auditoria = new Auditoria();

        //Prueba de Persistencia
//        auditoria.setTabla("Empresa");
//        auditoria.setIdRegistro(1L);
//        auditoria.setEtapa("EXFM");
//        auditoria.setIdUsuario(1L);
//        auditoria.setFecha(new Date());
//        auditoria.setTipoOperacion("ELIM");
//        auditoria.setDireccionIP("DireccionIP");
//        auditoria.setDato("Nueva Descripcion del Registro");
//        auditoria.setDato("Nueva Detalle del Registro");
//        auditoria.setEstado("AC");
//        
//        auditoriaService.persistAuditoria(auditoria);
        //Prueba Eliminacion
//        auditoria = auditoriaService.find(Auditoria.class, 3L);
//        auditoriaService.removeAuditoria(auditoria);
        
        //Prueba Modificacion
        auditoria = auditoriaService.find(Auditoria.class, 4L);
        auditoria.setDato("Nuevo Dato");
        auditoriaService.mergeAuditoria(auditoria);

        //Prueba de Listado
        List<Auditoria> listaAuditoria = auditoriaService.listaAuditoria();

        for (Auditoria auditoria1 : listaAuditoria) {
            System.out.println("auditoria *** " + auditoria1.getDato());
        }

    }

}
