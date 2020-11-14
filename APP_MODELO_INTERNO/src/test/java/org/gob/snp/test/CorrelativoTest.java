package org.gob.snp.test;

import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.RegionalCorrelativo;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.CorrelativoService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Eddy Valero
 */
public class CorrelativoTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//sipi2//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        CorrelativoService correlativoService = (CorrelativoService) context.getBean("correlativoService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

//        Correlativo correlativo = new Correlativo();
        /*
         //AdicionarRegistro
         correlativo.setIncremento(1L);
         correlativo.setNombreTabla("tramite");
         correlativo.setUltimoNumeroAsignado(0L);
         Correlativo correlativoAux = new Correlativo();
         correlativoAux = correlativoService.persist(correlativo);
         */
        /*  
         correlativo = correlativoService.find(Correlativo.class, 1L);
         //EliminarRegistro
         correlativoService.removeCorrelativo(correlativo);
         */
        /*
         //Modificar registro
         correlativo = correlativoService.find(Correlativo.class, 1L);
         correlativo.setNombreTabla("NombreTabla");
         correlativoService.merge(correlativo);
         */
        /*
         //Listar registro por tabla
         List <Correlativo> listcorrelativo = correlativoService.listaCorrelativoXTabla("NombreTabla");
        
         System.out.println("***"+listcorrelativo.get(0).getNombreTabla());
         System.out.println("***"+listcorrelativo.get(0).getIncremento());
         System.out.println("***"+listcorrelativo.get(0).getUltimoNumeroAsignado());
         */
//    Long valor = correlativoService.NumeroAsignado("NombreTabla");
//    System.out.println("***El valor asignado es:   "+valor);
        RegionalCorrelativo correlativo1 = correlativoService.encuentraCorrelativoPortramiteRegional((Tramite) tramiteService.find(Tramite.class, 151669L), (Regional) regionalService.find(Regional.class, 2L));
        System.out.println("el acronimo es" + correlativo1.getCorrelativo().getAcronimo());
        System.out.println("el separador es" + correlativo1.getCorrelativo().getSeparador());
        System.out.println("el separador es" + correlativo1.getCorrelativo().getUltimoNumeroAsignado());
    }
}
