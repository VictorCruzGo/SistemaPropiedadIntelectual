package org.gob.snp.test;

import java.util.Date;
import org.gob.snp.entidades.Correlativo;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.RegionalCorrelativo;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.CorrelativoService;
import org.gob.snp.servicios.RegionalCorrelativoService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Eddy Valero
 */
public class RegionalCorrelativoTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//sipi2//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        RegionalCorrelativoService regionalCorrelativoService = (RegionalCorrelativoService) context.getBean("regionalCorrelativoService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        CorrelativoService correlativoService = (CorrelativoService) context.getBean("correlativoService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        RegionalCorrelativo regionalCorrelativo = new RegionalCorrelativo();

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
        /*9
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
//        System.out.println("***El valor asignado es:   "+valor);
        Correlativo correlativo1 = (Correlativo) correlativoService.find(Correlativo.class, 13L);
        Regional regional = (Regional) regionalService.find(Regional.class, 1L);
        regionalCorrelativo.setCorrelativo(correlativo1);
        regionalCorrelativo.setRegional(regional);
        regionalCorrelativo.setUsuario(((Usuario) usuarioService.find(Usuario.class, 1L)).getIdUsuario());
        regionalCorrelativo.setFechaUltimaModificacion(new Date());
        
       regionalCorrelativoService.persistRegionalCorrelativo(regionalCorrelativo);
      
    }

}
