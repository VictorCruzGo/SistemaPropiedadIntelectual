package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Titulo;
import org.gob.snp.servicios.TituloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author RobertoSantivañez
 */
public class TituloTest {

    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 01-10-14-11-30//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        TituloService tituloService = (TituloService) context.getBean("tituloService");

        List<Titulo> lista = tituloService.listaTitulo();
        for (Titulo titulo1 : lista) {
//                    System.out.println(":::::::::::"+titulo1.getNroTitulo()+":::::::"+titulo1.getRecibo()+"::::::::::"+titulo1.getRegional());
        }
    }
}
