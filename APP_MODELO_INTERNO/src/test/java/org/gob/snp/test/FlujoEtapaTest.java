/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoEtapa;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.FlujoEtapaService;
import org.gob.snp.servicios.FlujoService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class FlujoEtapaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");
        FlujoEtapaService flujoEtapaService = (FlujoEtapaService) context.getBean("flujoEtapaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        FlujoService flujoService = (FlujoService) context.getBean("flujoService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        Tramite tramite = tramiteService.find(Tramite.class, 84L);

//        System.out.println(" **** El idFlujoTramite es : " + flujoEtapaService.encuentraIdPadreDeFlujoEtapa(tramite)) ;
//        EstadoEtapa estadoEtapa = new EstadoEtapa();
//        estadoEtapa.setCodigo("OBS");
//        
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        FlujoEtapa flujoEtapaSiguiente = new FlujoEtapa();
//        
//        
//        try {
//            flujoEtapaSiguiente = flujoEtapaService.controlFlujoPorTramite(tramite, estadoEtapa, 1L);
//        } catch (Exception ex) {
////            Logger.getLogger(FlujoEtapaTest.class.getName()).log(Level.SEVERE, null, ex);
////            ex.getStackTrace();
//            System.out.println(" *** ");
//            System.out.println(" *** ");
//        }
//        try {
//            FlujoEtapa flujoEtapa = flujoEtapaService.obtenerUltimoEstadoEtapa(tramite.getIdTramite(), 1L, "REV", 6L);
//        } catch (Exception ex) {
//            Logger.getLogger(FlujoEtapaTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        List<FlujoEtapa> lista = flujoEtapaService.listaFlujoEtapaPorFlujo();
//        for (FlujoEtapa flujoEtapa : lista) {
//            System.out.println("FLUJO   " + flujoEtapa.getEtapaTramite().getDescripcion());
//        }
        
        
        
        EstadoEtapa estadoEtapa = new EstadoEtapa();
            estadoEtapa.setCodigo("ASIG");
        
        FlujoEtapa flujoEtapa;
        try {
            flujoEtapa = flujoEtapaService.controlFlujoPorTramite(tramite, estadoEtapa, 1L);
            System.out.println("Flujo Etapa " + flujoEtapa.getIdFlujoEtapa() + " **** " + flujoEtapa.getEtapaTramite().getCodigo());
        } catch (Exception ex) {
            Logger.getLogger(FlujoEtapaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

    }

}
