package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Modulo;
import org.gob.snp.servicios.MascaraService;
import org.gob.snp.servicios.ModuloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class ModuloTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ModuloService moduloService = (ModuloService) context.getBean("moduloService");        
        List<Modulo> lista = moduloService.listaModulosOrdenados();
        
        for (Modulo modulo : lista) {
            System.out.println("el modulo es---- "+modulo.getDescripcion());
        }
        
    }

}
