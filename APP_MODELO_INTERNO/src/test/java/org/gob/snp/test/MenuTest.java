/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Menu;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.MenuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class MenuTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        MenuService menuService = (MenuService)context.getBean("menuService");
//        Usuario usuario = new Usuario(1L);
//        List<Menu> lista = menuService.listaMenusPorUsuario(usuario);
//        for (Menu menu : lista) {
//            System.out.println("padre::: "+menu.getDescripcion());
//            for (Menu menu1 : menuService.listaMenusDescendientesPorMenu(menu)) {
//                System.out.println("hijo::: "+menu1.getNombre());
//            }
//        }
//        Rol rol = new Rol(1L);
//        List<Menu> lista = menuService.listaMenusPorRol(rol);
//        for (Menu menu : lista) {
//            System.out.println("menu::: "+menu.getNombre());
//        }
        
//        Usuario usuario = new Usuario(1L);
//        List<Menu> listaMenus = menuService.listaMenusPorUsuario(usuario,"ES");
//        for (Menu menu : listaMenus) {
//            System.out.println("padre::: "+menu.getNombre()) ;
//             for (Menu menu1 : menuService.listaMenusDescendientesPorMenu(menu)) {
//                System.out.println("hijo::: "+menu1.getNombre());
//            }
//        }
        Menu menu = menuService.find(Menu.class, 3L);
        if(menuService.tieneDescendientes(menu)){
            System.out.println("tiene");
        }else{
            System.out.println("no tiene");
        }
    }
    
}
