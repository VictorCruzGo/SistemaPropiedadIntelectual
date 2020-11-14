/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.RequisitoFlujoEtapaPlantilla;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.entidades.vistas.TipoRespuestaRequisito;
import org.gob.snp.enums.EnumTipoRequisito;
import org.gob.snp.enums.EnumTipoRespuestaRequisito;
import org.gob.snp.pojo.ExamenFormaPojo;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.FlujoEtapaService;
import org.gob.snp.servicios.RequisitoFlujoEtapaPlantillaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class RequisitoFlujoEtapaPlantillaTest {
    
    public static void main(String[] args) throws Exception {
        
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        RequisitoFlujoEtapaPlantillaService requisitoFlujoEtapaPlantillaService = (RequisitoFlujoEtapaPlantillaService) context.getBean("requisitoFlujoEtapaPlantillaService");
        FlujoEtapaService flujoEtapaService = (FlujoEtapaService) context.getBean("flujoEtapaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        
        //Probar el persist
//        FlujoEtapa flujoEtapa = flujoEtapaService.find(FlujoEtapa.class, 2L);
//        RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla = new RequisitoFlujoEtapaPlantilla();
//        requisitoFlujoEtapaPlantilla.setRequisito("Requisitos");
//        requisitoFlujoEtapaPlantilla.setPestania("Examen");
//        requisitoFlujoEtapaPlantilla.setSeccion("Escrito de solicitud de registro de una Marca de Producto");
//        requisitoFlujoEtapaPlantilla.setOrden(1);
//        requisitoFlujoEtapaPlantilla.setTipoRequisito((TipoRequisito) clasificadorService.find(TipoRequisito.class, EnumTipoRequisito.MINIMO.getCodigo()));
//        requisitoFlujoEtapaPlantilla.setTipoRespuestaRequisito((TipoRespuestaRequisito) clasificadorService.find(TipoRespuestaRequisito.class, EnumTipoRespuestaRequisito.CHECK.getCodigo()));
//        requisitoFlujoEtapaPlantilla.setTieneDetalle(Boolean.TRUE);
//        requisitoFlujoEtapaPlantilla.setVigente(Boolean.TRUE);
//        requisitoFlujoEtapaPlantilla.setFechaInicio(new Date());
//        requisitoFlujoEtapaPlantilla.setFechaFin(null);
//        requisitoFlujoEtapaPlantilla.setUltimaModificacion(new Date());
//        requisitoFlujoEtapaPlantilla.setFlujoEtapa(flujoEtapa);
//        RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantillaAux = requisitoFlujoEtapaPlantillaService.persist(requisitoFlujoEtapaPlantilla);
        
        //Probar el merge
//        RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla = requisitoFlujoEtapaPlantillaService.find(RequisitoFlujoEtapaPlantilla.class, 1L);
//        requisitoFlujoEtapaPlantilla.setOrden(1);
//        requisitoFlujoEtapaPlantillaService.merge(requisitoFlujoEtapaPlantilla);
        
        //Probar el list
//        List<RequisitoFlujoEtapaPlantilla> listrequisitoFlujoEtapaPlantilla = new ArrayList<RequisitoFlujoEtapaPlantilla>();
//        listrequisitoFlujoEtapaPlantilla = requisitoFlujoEtapaPlantillaService.listaRequisitoFlujoEtapaPlantilla();
//        for (RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla : listrequisitoFlujoEtapaPlantilla) {
//            System.out.println("***"+requisitoFlujoEtapaPlantilla.getPestania());
//        }
        
        //Probar la eliminacion
//        RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla = requisitoFlujoEtapaPlantillaService.find(RequisitoFlujoEtapaPlantilla.class, 1L);
//        requisitoFlujoEtapaPlantillaService.remove(requisitoFlujoEtapaPlantilla);
        
        //A partir de un padre mostrar los registros hijo de registros de RequisitoFlujoEtapaPlantilla
//        RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantillaPadre = requisitoFlujoEtapaPlantillaService.find(RequisitoFlujoEtapaPlantilla.class, 10L);
//        List<RequisitoFlujoEtapaPlantilla> listaRequisitoFlujoEtapaPlantillas = requisitoFlujoEtapaPlantillaService.listaRequisitoFlujoEtapaPlantillaHijosPorPadre(requisitoFlujoEtapaPlantillaPadre);
//        for (RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla : listaRequisitoFlujoEtapaPlantillas) {
//            System.out.println("*******************************");
//            System.out.println(requisitoFlujoEtapaPlantilla.getRequisito());
//            System.out.println(requisitoFlujoEtapaPlantilla.getIdRequisitoFlujoEtapaPlantillaPadre());
//        }
        
        
        //Devolver todos los padres de acuerdo al flujoEtapa tipoRequisito y una pestaña determinada
        FlujoEtapa flujoEtapa = flujoEtapaService.find(FlujoEtapa.class, 5L);
        TipoRequisito tipoRequisito = (TipoRequisito) clasificadorService.find(TipoRequisito.class, "MIN");
        String pestania = "Datos Generales";
        
        
        System.out.println("***"+tipoRequisito.getCodigo());
        
        
//        List<RequisitoFlujoEtapaPlantilla> listarRequisitoFlujoEtapaPlantillas = new ArrayList<RequisitoFlujoEtapaPlantilla>();
//        listarRequisitoFlujoEtapaPlantillas = requisitoFlujoEtapaPlantillaService.listaRequisitoFlujoEtapaPlantillaPadreTipoRequisito(flujoEtapa, tipoRequisito, pestania);
//        for (RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla : listarRequisitoFlujoEtapaPlantillas) {
//            System.out.println("***"+requisitoFlujoEtapaPlantilla.getRequisito());
//        }
        
//        Probar la generacion del pojo ExamenFormaExamenPojo
////        List<ExamenFormaExamenPojo> listaExamenFormaExamenPojo = new ArrayList<ExamenFormaExamenPojo>();
//        listaExamenFormaExamenPojo = requisitoFlujoEtapaPlantillaService.listaPojoExamenFormaDinamico(flujoEtapa, tipoRequisito, pestania);
//        for (ExamenFormaPojo examenFormaExamenPojo : listaExamenFormaExamenPojo) {
//            System.out.println("***");
//            System.out.println(examenFormaExamenPojo.getValorCheckBoxRequisito().toString());
//            System.out.println("Id*** "+examenFormaExamenPojo.getRequisitoFlujoEtapaPlantilla().getIdRequisitoFlujoEtapaPlantilla());
//            System.out.println(examenFormaExamenPojo.getRequisitoFlujoEtapaPlantilla().getRequisito());
//            System.out.println("IdPadre***"+examenFormaExamenPojo.getRequisitoFlujoEtapaPlantilla().getIdRequisitoFlujoEtapaPlantillaPadre());
//            System.out.println(examenFormaExamenPojo.getObservacionRequisito());
//            
//        }
        
        

        
        
    
        
    }
    
}

 
