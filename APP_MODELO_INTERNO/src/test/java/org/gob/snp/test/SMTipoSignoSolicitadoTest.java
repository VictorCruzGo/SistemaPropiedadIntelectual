/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;


import java.util.List;
import org.gob.snp.entidades.Pagina;
import org.gob.snp.entidades.SMTipoSignoSolicitado;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.PaginaService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.SmTipoSignoSolicitadoService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy valero
 */
public class SMTipoSignoSolicitadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
          ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//sipi//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");        
        SmTipoSignoSolicitadoService smTipoSignoSolicitadoService = (SmTipoSignoSolicitadoService) context.getBean("smTipoSignoSolicitadoService");;
        SMTipoSignoSolicitado sMTipoSignoSolicitado = new SMTipoSignoSolicitado();
        
        SmSignoMarcaService smSignoMarcaService = (SmSignoMarcaService) context.getBean("smSignoMarcaService");
        TramiteService tramiteService=(TramiteService)context.getBean("tramiteService");
        PaginaService paginaService=(PaginaService)context.getBean("paginaService");
        
        //Adicionar registro
//        clasificadormarca.setSmsignomarca(smsignomarca);
//        clasificadormarca.setTipoMarca("Mixta");
//        clasificadormarca.setOtro("Color Amarillo");
//        clasificadorMarcaService.persist(clasificadormarca);
        
        
        //Modificar Registro
//        clasificadormarca = clasificadorMarcaService.find(ClasificadorMarca.class, 7L);
//        clasificadormarca.setOtro("Color Amarillo");
//        clasificadormarca.setTipoMarca("Mixta");
//        ClasificadorMarca clasificadormarcaAux = clasificadorMarcaService.merge(clasificadormarca);
        

        
        //Eliminar Registro
//        clasificadormarca = clasificadorMarcaService.find(ClasificadorMarca.class, 7L);
//        clasificadorMarcaService.remove(clasificadormarca);
//        SMSignoMarca smsignomarca = smSignoMarcaService.find(SMSignoMarca.class, 324L);
            
//        Tramite tramite=(Tramite)tramiteService.find(Tramite.class,66L);
//        List<SMTipoSignoSolicitado> lista = smTipoSignoSolicitadoService.listaSMTipoSignoSolicitadoPorTramite(tramite);
//        for (SMTipoSignoSolicitado mTipoSignoSolicitado : lista) {
//        System.out.println("ES.:::::::::::::::"+mTipoSignoSolicitado.getIdSMTipoSignoSolicitado());
//        }
        
        Pagina pagina=paginaService.encuentraPaginaPorFlujo(1L);
        System.out.println("123456"+pagina.getIdFlujo());
//        
        
    }

}
