/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.vistas.GridRegistroExistente;
import org.gob.snp.servicios.GridRegistroExistenteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class GridRegistroExistenteTest {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        GridRegistroExistenteService gridRegistroExistenteService = (GridRegistroExistenteService) context.getBean("gridRegistroExistenteService");
        
        List<GridRegistroExistente> lista = gridRegistroExistenteService.listaGridRegistroExistenteServiceComparaSM("SM-0001-2014");
        
        for (GridRegistroExistente gridRegistroExistente : lista) {
            System.out.println("** "+gridRegistroExistente.getNombreMarca());
        }

        System.out.println("***Busqueda por Marca*****");
        
        
        List<GridRegistroExistente> lista1 = gridRegistroExistenteService.listaGridRegistroExistenteServiceComparaMarca("S%g%");
        for (GridRegistroExistente gridRegistroExistente : lista1) {
            System.out.println("*** "+gridRegistroExistente.getNombreMarca());
        }
        
        
        


    }
}
