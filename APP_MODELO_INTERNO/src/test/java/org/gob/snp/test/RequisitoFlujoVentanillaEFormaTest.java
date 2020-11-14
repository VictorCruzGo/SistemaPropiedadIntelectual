package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.RequisitoFlujoEtapaPlantilla;
import org.gob.snp.entidades.RequisitoFlujoVentanillaEForma;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.FlujoEtapaService;
import org.gob.snp.servicios.RequisitoFlujoVentanillaEFormaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan Valdivia
 */
public class RequisitoFlujoVentanillaEFormaTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");
        
        RequisitoFlujoVentanillaEFormaService requisitoFlujoVentanillaEFormaService = (RequisitoFlujoVentanillaEFormaService) context.getBean("requisitoFlujoVentanillaEFormaService");
        FlujoEtapaService flujoEtapaService = (FlujoEtapaService) context.getBean("flujoEtapaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        
        
        FlujoEtapa flujoEtapa = flujoEtapaService.find(FlujoEtapa.class, 134L);
        TipoRequisito tipoRequisito = (TipoRequisito) clasificadorService.find(TipoRequisito.class, "MIN");

//        
//        RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma = new RequisitoFlujoVentanillaEForma();
//        requisitoFlujoVentanillaEForma.setFlujoEtapa(flujoEtapa);
//        requisitoFlujoVentanillaEForma.setCodigo("PNA1");
//        requisitoFlujoVentanillaEForma.setTipoRequisito(tipoRequisito);
//        requisitoFlujoVentanillaEForma.setFechaCreacion(new Date());
//        requisitoFlujoVentanillaEForma.setPosicion(7);
//        requisitoFlujoVentanillaEForma.setVigente(Boolean.TRUE);
//        requisitoFlujoVentanillaEForma.setDescripcion("Persona Natural");
//        requisitoFlujoVentanillaEFormaService.persistRequisitoFlujoVentanillaEForma(requisitoFlujoVentanillaEForma);       
//        requisitoFlujoVentanillaEForma = requisitoFlujoVentanillaEFormaService.find(RequisitoFlujoVentanillaEForma.class, 11L);
//        requisitoFlujoVentanillaEForma.setDescripcion("Nueva Descripcion");
//        requisitoFlujoVentanillaEFormaService.mergeRequisitoFlujoVentanillaEForma(requisitoFlujoVentanillaEForma);
//        requisitoFlujoVentanillaEFormaService.removeRequisitoFlujoVentanillaEForma(requisitoFlujoVentanillaEForma);
//        List<RequisitoFlujoVentanillaEForma> lista = requisitoFlujoVentanillaEFormaService.listaRequisitoFlujoVentanillaEForma();
//        for (RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma1 : lista) {
//            System.out.println("Los Requisitos son:::"+requisitoFlujoVentanillaEForma1.getDescripcion());
//        }        
//        List<RequisitoFlujoVentanillaEForma> lista = requisitoFlujoVentanillaEFormaService.listaRequisitoFlujoVentanillaEFormaPorFlujoEtapa(flujoEtapa);        
//        List<RequisitoFlujoVentanillaEForma> lista = requisitoFlujoVentanillaEFormaService.listaRequisitoFlujoVentanillaEForma();        
////        int cont = 0;
//        for (RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma : lista) {
////            cont++;
////            System.out.println("COD" + cont + ":" + requisitoFlujoVentanillaEForma.getCodigo());
////            System.out.println("DES" + cont + ":" + requisitoFlujoVentanillaEForma.getDescripcion());
//            System.out.println(requisitoFlujoVentanillaEForma.getDescripcion());
//        }
        
        
        List<RequisitoFlujoVentanillaEForma> lista = requisitoFlujoVentanillaEFormaService.listaRequisitoFlujoVentanillaEFormaPorFlujoEtapa(flujoEtapa, "LC", 1L);
        
        for (RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma : lista) {
            System.out.println(requisitoFlujoVentanillaEForma.getTipoGenero() + "**"+requisitoFlujoVentanillaEForma.getTipoRequisito().getCodigo()+ "*** "+ requisitoFlujoVentanillaEForma.getDescripcion());
        }
        
        
        
        
        

    }
}