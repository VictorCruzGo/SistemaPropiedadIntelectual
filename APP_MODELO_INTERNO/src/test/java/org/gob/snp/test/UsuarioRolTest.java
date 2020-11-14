/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.UsuarioRol;
import org.gob.snp.servicios.NotificacionService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.RolService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioRolService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author susana
 */
public class UsuarioRolTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        UsuarioRolService usuarioRolService = (UsuarioRolService) context.getBean("usuarioRolService");
        RolService rolService = (RolService) context.getBean("rolService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        
        Tramite tramite = tramiteService.find(Tramite.class, 27L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        Rol rol=rolService.find(Rol.class, 2l);
        Regional regional = regionalService.find(Regional.class, 6l);
        
        System.out.println("ROL   "+rol.getNombre());
        System.out.println("REGIONAL   "+regional.getNombre());
        

        List<UsuarioRol> listaSu =  usuarioRolService.listaRolesPorRegional(rol, regional);
        for (UsuarioRol usuarioRol : listaSu) {
            System.out.println("eeeeeeeeeeeeee "+usuarioRol.getIdUsuarioRol());
        }
        if(listaSu.isEmpty()){
            System.out.println("LISTA VACIAAAAAAAAA");
        }
    }

}
