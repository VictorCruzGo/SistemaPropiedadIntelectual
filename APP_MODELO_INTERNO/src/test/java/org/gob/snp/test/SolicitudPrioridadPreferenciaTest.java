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
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.SMSolicitadoLema;
import org.gob.snp.entidades.SolicitudPrioridadPreferencia;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoPreferenciaPrioridad;
import org.gob.snp.enums.EnumTipoPreferenciaPrioridad;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.SmSolicitadoLemaService;
//import org.gob.snp.servicios.SolicitudPrioridadPreferenciaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Eddy Valero
 */
public class SolicitudPrioridadPreferenciaTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

//        SolicitudPrioridadPreferenciaService solicitudPrioridadPreferenciaService = (SolicitudPrioridadPreferenciaService) context.getBean("solicitudPrioridadPreferenciaService");

        SmSignoMarcaService smSignoMarcaService = (SmSignoMarcaService) context.getBean("smSignoMarcaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        //Pruebas de los servicios de SMSolicitadoLema
//        SolicitudPrioridadPreferencia solicitudPrioridadPreferencia = solicitudPrioridadPreferenciaService.find(SolicitudPrioridadPreferencia.class, 1L);
        Tramite tramite = tramiteService.find(Tramite.class, 1L);

        //Persist
//        TipoPreferenciaPrioridad preferenciaPrioridad = new TipoPreferenciaPrioridad();
//        preferenciaPrioridad.setCodigo(EnumTipoPreferenciaPrioridad.PREFERENCIA.getCodigo());
//        SolicitudPrioridadPreferencia solicitudPrioridadPreferencia = new SolicitudPrioridadPreferencia();
//        solicitudPrioridadPreferencia.setTramite(tramite);
//        solicitudPrioridadPreferencia.setCodigoClasificador("PANR");
//        solicitudPrioridadPreferencia.setPreferenciaPrioridad(preferenciaPrioridad);
//        solicitudPrioridadPreferencia.setNumeroPrioridad("12345");
//        solicitudPrioridadPreferencia.setOficinaPrioridad("");
//        solicitudPrioridadPreferencia.setFechaEmision(new Date());
//        solicitudPrioridadPreferencia.setVigente(Boolean.TRUE);
//        solicitudPrioridadPreferencia.setLugar("Lugar");
//        solicitudPrioridadPreferencia.setObservacion("");
//        solicitudPrioridadPreferencia.setUsuarioModificador(null);
//        solicitudPrioridadPreferencia.setFechaUltimaModificacion(new Date());
//        
//        solicitudPrioridadPreferenciaService.persist(solicitudPrioridadPreferencia);
        //Remove
//        SolicitudPrioridadPreferencia solicitudPrioridadPreferencia = solicitudPrioridadPreferenciaService.find(SolicitudPrioridadPreferencia.class, 1L);
//
//        try {
//            solicitudPrioridadPreferenciaService.removeSMSolicitadoPrioridadLema(solicitudPrioridadPreferencia);
//            System.out.println("se elimino el registro");
//        } catch (Exception ex) {
//            Logger.getLogger(SolicitudPrioridadPreferenciaTest.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //Merge
        //Listado
    }

}
