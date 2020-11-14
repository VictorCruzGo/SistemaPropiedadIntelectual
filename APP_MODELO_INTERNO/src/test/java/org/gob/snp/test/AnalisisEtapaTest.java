package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.TramiteFlujoEtapaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan Valdivia
 */
public class AnalisisEtapaTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//      ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        TramiteFlujoEtapaService tramiteFlujoEtapaService = (TramiteFlujoEtapaService) context.getBean("tramiteFlujoEtapaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        

//        TramiteFlujoEtapa tramiteFlujoEtapa = tramiteFlujoEtapaService.find(TramiteFlujoEtapa.class, 1L);
////        EtapaTramite etapaTramite = (EtapaTramite)clasificadorService.find(EtapaTramite.class, "EXFM");
//        
////        EtapaTramite etapa = (EtapaTramite) clasificadorService.find(EtapaTramite.class, "EXFF");
//        AnalisisEtapa analisisEtapa = new AnalisisEtapa();
//        analisisEtapa.setTramiteFlujoEtapa(tramiteFlujoEtapa);
//        
//        analisisEtapa.setTitulo("Prueba de Titulo");
//        analisisEtapa.setPie("Prueba de Pie");
//        analisisEtapa.setCodigoTramite("TRAM");
//        analisisEtapa.setNombreTramite("NombreTra");
//        analisisEtapa.setFechaRegistro(new Date());
//        analisisEtapa.setPlazo(2);
//        analisisEtapaService.persistAnalisisEtapa(analisisEtapa);                
//        List<AnalisisEtapa> lista = analisisEtapaService.listaAnalisisEtapa();
//        for (AnalisisEtapa analisisEtapa1 : lista) {
//            System.out.println("************************" + analisisEtapa1.getNombreTramite());
//        }
//        
//        Tramite tramite = tramiteService.find(Tramite.class, 4L);
//        EtapaTramite etapaTramite = new EtapaTramite();
//        etapaTramite.setCodigo("EXFM");
        
//        if (analisisEtapaService.existeAnalisisEtapaEnTramiteFlujoEtapa(tramite)){
//                System.out.println("*** existen registros");
//        }else{
//                System.out.println("*** no existen registros");
//        };
//        
//        AnalisisEtapa analisisEtapa1=analisisEtapaService.obtenerAnalisisEtapaDeTramite(tramite, etapaTramite);
//        System.out.println("saco el objeto"+analisisEtapa1.getIdAnalisisEtapa()+"---------------------------*-*-*-*-*-*-*-");
//        
//        List<AnalisisEtapa> lista = analisisEtapaService.listaAnalisisEtapa();
//        for (AnalisisEtapa analisisEtapa : lista) {
//            System.out.println("elementos ------"+analisisEtapa.getIdAnalisisEtapa());
//        }
        
        
        //Testear recuperar un AnalisisETapa desde IdTramiteFlujoEtapa
//        TramiteFlujoEtapa tramiteFlujoEtapa = tramiteFlujoEtapaService.find(TramiteFlujoEtapa.class, 12L);
//        
//        AnalisisEtapa analisisEtapa = analisisEtapaService.obtenerAnalisisEtapadeTramiteFlujoEtapa(tramiteFlujoEtapa);
//        
//        
//        System.out.println("analisisEtapa *** "+ analisisEtapa.getIdAnalisisEtapa());
        
        
        Tramite tramite = tramiteService.find(Tramite.class, 5L);
        EtapaTramite etapaTramite = new EtapaTramite();
        
        etapaTramite.setCodigo("VEN");
        
        if (analisisEtapaService.existeAnalisisEtapaEnTramiteFlujoEtapa(tramite)){
            System.out.println("Existe analisisEtapa");
            AnalisisEtapa analisisEtapa = analisisEtapaService.obtenerAnalisisEtapaDeTramite(tramite, etapaTramite);
            
            
            System.out.println("AnalisisEtapa "+ analisisEtapa.getIdAnalisisEtapa());
            
        }
        
        
    }
}
