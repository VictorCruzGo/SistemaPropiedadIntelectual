/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.FormularioExamenDeFondoPojo;
import org.gob.snp.servicios.ExamenDeFondoPojoService;
import org.gob.snp.servicios.ExamenFormaPojoService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan
 */
public class ExamenDeFondoPojoServiceTest {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ExamenDeFondoPojoService examenDeFondoPojoService = (ExamenDeFondoPojoService) context.getBean("examenDeFondoPojoService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        List<FormularioExamenDeFondoPojo> listaExamenDeFondo = new ArrayList<FormularioExamenDeFondoPojo>();
        
        Tramite tramite = tramiteService.find(Tramite.class, 7L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        
        try {
            //examenDeFondoPojoService.denegarSolicitudExamenDeFondo(tramite, usuario);
            examenDeFondoPojoService.actualizarObservacionSolicitudExamenDeFondo(tramite, usuario, Boolean.FALSE, "Observacion PARA UNO");
            
        } catch (Exception ex) {
            Logger.getLogger(ExamenDeFondoPojoServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
