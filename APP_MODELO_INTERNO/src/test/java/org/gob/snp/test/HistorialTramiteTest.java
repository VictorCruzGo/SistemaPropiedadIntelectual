/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.HistorialTramite;
import org.gob.snp.servicios.HistorialTramiteService;
import org.gob.snp.servicios.NotificacionService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author susana
 */
public class HistorialTramiteTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        HistorialTramiteService historialTramiteService = (HistorialTramiteService) context.getBean("historialTramiteService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        Tramite tramite = tramiteService.find(Tramite.class, 1L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        List<HistorialTramite> listaSu = historialTramiteService.listadoHistorialTramitePorTramite(tramite, usuario);
        int c=0;
        for (HistorialTramite historialTramite : listaSu) {
            c++;
            System.out.println(">>>>>  "+historialTramite.getDescripcionEtapa());
            System.out.println(">>>>>  "+historialTramite.getDescripcionEstado());
            System.out.println(">>>>>  "+historialTramite.getFechaAsignacion());
        }
        System.out.println("VALOR "+c);
    }

}
