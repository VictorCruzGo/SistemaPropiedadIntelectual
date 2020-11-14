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
import org.gob.snp.entidades.Institucion;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.InstitucionService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author susana
 */
public class InstitucionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        InstitucionService institucionService = (InstitucionService) context.getBean("institucionService");

        Usuario usuario = (Usuario) usuarioService.find(Usuario.class, 1l);

        Institucion institucion = new Institucion();
        //Institucion institucion = institucionService.find(Institucion.class, 1l);
         institucion.setCodigo("SNP");
        institucion.setNombre("Servicio Nacional de Propiedad Intelectual");
        institucion.setAcronimo("SENAPI");
        institucion.setSerieRegistroVigente("C");
        institucion.setCorrelativoRegistro(0l);
        institucion.setVigente(true);
        institucion.setUsuario(usuario.getIdUsuario());
        institucion.setFechaUltimaModificacion(new Date());
        try {
            institucionService.mergeInstitucion(institucion);
        } catch (Exception ex) {
            Logger.getLogger(InstitucionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Institucion>list=institucionService.listaInstitucion();
        for (Institucion institucions: list) {
            System.out.println(":::::::"+institucions.getSerieRegistroVigente());
        }
        
        String registro = institucionService.obtenerSiguienteRegistro(usuario);
        System.out.println("registro nuevooooo  "+registro);
        

    }

}
