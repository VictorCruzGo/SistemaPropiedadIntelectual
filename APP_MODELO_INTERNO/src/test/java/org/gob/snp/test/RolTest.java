/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.RolService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class RolTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//         TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        RolService rolService = (RolService)context.getBean("rolService");
        
        Usuario usuario = new Usuario(1L);
        List<Rol> lista = rolService.listaRolesPorUsuario(usuario);
        for (Rol rol : lista) {
            System.out.println("nombre::: "+rol.getNombre());
        }
        
        
    }
    
}
