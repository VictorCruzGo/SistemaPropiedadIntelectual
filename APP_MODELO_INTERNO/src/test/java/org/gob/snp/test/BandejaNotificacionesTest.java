/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.BandejaNotificacion;
import org.gob.snp.servicios.BandejaNotificacionService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author gusn8
 */
public class BandejaNotificacionesTest {

    private static ApplicationContext context;
    private static BandejaNotificacionService bandejaNotificacionesService;
    private static UsuarioService usuarioService;
    private static Usuario usuario;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        bandejaNotificacionesService = (BandejaNotificacionService) context.getBean("bandejaNotificacionService");
        usuarioService = (UsuarioService) context.getBean("usuarioService");
        usuario = usuarioService.find(Usuario.class, 17L);

        listarNotificaciones(usuario);
    }

    //LISTAR UNA ENTREGA
    public static void listarNotificaciones(Usuario u) {
        try {
            List<BandejaNotificacion> lista = bandejaNotificacionesService.listadoBandejaNotificacion(u);
            if (!lista.isEmpty()) {
                for (BandejaNotificacion bandejaNotificacion : lista) {
                    System.out.println("Notificacion 1: " + bandejaNotificacion.getNombreSolicitud());
                }
            }
        } catch (Exception e) {
            System.out.println("Hubo un error en el listado de vehiculos: " + e.getMessage());
        }
    }

}
