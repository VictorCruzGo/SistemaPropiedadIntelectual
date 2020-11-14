/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.pojo.ExamenFormaPojo;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ExamenFormaPojoService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class ExamenFormaPojoServiceTest {

    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ExamenFormaPojoService examenPojoService = (ExamenFormaPojoService) context.getBean("examenFormaPojoService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");

//        TipoRequisito tipoRequisito = new TipoRequisito();
//        tipoRequisito.setCodigo("MIN");
//
//        Tramite tramite = tramiteService.find(Tramite.class, 2L);
//        EtapaTramite etapaTramite = new EtapaTramite();
//        etapaTramite.setCodigo("EXFM");
//
//        List<ExamenFormaPojo> listaExamenFormaPojo = examenPojoService.listaExamenFormaPojo(tramite, etapaTramite, tipoRequisito);
//
//        for (ExamenFormaPojo examenFormaPojo : listaExamenFormaPojo) {
//            
//            if (examenFormaPojo.getDatoTramiteVentanillaEForma() != null){
//                System.out.println("***Padre: "+examenFormaPojo.getDatoTramiteVentanillaEForma().getCodigo());
//            }else{
////                System.out.println("***Padre: "+examenFormaPojo.getDatoTramiteVentanillaEForma().getCodigo());
////            System.out.println("====="+examenFormaPojo.getValorTramiteVentanillaEForma().getDatoTramiteVentanillaEForma().getCodigo());
////                System.out.println("====="+examenFormaPojo.getValorTramiteVentanillaEForma().getDatoTramiteVentanillaEForma().getDescripcion());
//                System.out.println("=====Hijo: "+examenFormaPojo.getValorTramiteVentanillaEForma().getTipoFormularioVentanillaEForma().getNombre());
//            }
//            
//            if (examenFormaPojo.getValorTramiteVentanillaEForma() != null){
////                System.out.println("***"+examenFormaPojo.getDatoTramiteVentanillaEForma().getCodigo());
//                System.out.println("====="+examenFormaPojo.getValorTramiteVentanillaEForma().getDatoTramiteVentanillaEForma().getCodigo());
//                System.out.println("====="+examenFormaPojo.getValorTramiteVentanillaEForma().getDatoTramiteVentanillaEForma().getDescripcion());
//                System.out.println("====="+examenFormaPojo.getValorTramiteVentanillaEForma().getTipoFormularioVentanillaEForma().getNombre());
//            }
        //Testear generarPlantillaExamenFormaPojoPorAnalisisEtapa
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        Tramite tramite = tramiteService.find(Tramite.class, 24L);
        EtapaTramite etapaTramite = new EtapaTramite();
        etapaTramite.setCodigo("EXFM");
        TipoRequisito tipoRequisito = new TipoRequisito();
        tipoRequisito.setCodigo("MIN");
        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 6L);
        try {
            
            List<ExamenFormaPojo> list = examenPojoService.generarPlantillaExamenFormaPojoPorAnalisisEtapa(tramite, etapaTramite, tipoRequisito, analisisEtapa, usuario);
            
            for (ExamenFormaPojo examenFormaPojo : list) {
                System.out.println(" *** "+ examenFormaPojo.getDatoTramiteVentanillaEForma().getIdDatoTramiteVentanillaEForma());
            }
        } catch (Exception ex) {
            Logger.getLogger(ExamenFormaPojoServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        

    }

}
