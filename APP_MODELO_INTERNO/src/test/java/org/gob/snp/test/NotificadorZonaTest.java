/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import org.gob.snp.entidades.NotificadorZona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.NotificadorZonaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * Entidad responsable de las pruebas de la Entidad, la interface y la
 * implementación de NotificadorZona
 *
 * @author Eddy Valero
 * @version 1.0 22/05/2015
 *
 */
public class NotificadorZonaTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        NotificadorZonaService notificadorZonaService = (NotificadorZonaService) context.getBean("notificadorZonaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        //Prueba del persist
//        NotificadorZona notificadorZona = new NotificadorZona();
//        notificadorZona.setIdNotificador(1L);
//        notificadorZona.setCodigoZona("1000");
//        notificadorZona.setNumeroNotificaciones(1L);
//        notificadorZona.setEstado("AC");
//        notificadorZona.setUsuario(1L);
//        notificadorZona.setFechaUltimaModificacion(new Date());
//        notificadorZonaService.persistNotificadorZona(notificadorZona);
        //Prueba del merge
//        NotificadorZona notificadorZona = notificadorZonaService.find(NotificadorZona.class, 1L);
//        notificadorZona.setCodigoZona("2000");
//        notificadorZonaService.mergeNotificadorZona(notificadorZona);
        //Prueba del remove
//        NotificadorZona notificadorZona = notificadorZonaService.find(NotificadorZona.class, 1L);
//        notificadorZonaService.removeNotificadorZona(notificadorZona);
        //        System.out.println("Se realizo la operacion correctamente");
        
        
        //Probar el metodo de asignacion de Usuario
        Tramite tramite = tramiteService.find(Tramite.class, 2L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        notificadorZonaService.contarZonasPorNotificador(11L,usuario);
        
        NotificadorZona notificadorZona = notificadorZonaService.asignarZonaNotificacionANotificador(tramite, usuario);
            
        
//        notificadorZonaService.actualizarRegistroZonaNotificadorZona(tramite, usuario);
        
        
        
        
        
    }

}
