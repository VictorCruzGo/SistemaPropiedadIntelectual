package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DatoTramiteVentanillaEFormaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan Valdivia
 */
public class DatoTramiteVentanillaEFormaTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");    
                ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        DatoTramiteVentanillaEFormaService datoTramiteVentanillaEFormaService = (DatoTramiteVentanillaEFormaService) context.getBean("datoTramiteVentanillaEFormaService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        ClasificadorService clasificadorService=(ClasificadorService)context.getBean("clasificadorService");
        UsuarioService usuarioService = (UsuarioService)context.getBean("usuarioService");
//
//        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapaService.class, 1L);
//        
//        DatoTramiteVentanillaEForma datoTramiteVentanillaEForma = new DatoTramiteVentanillaEForma();
//        
//        datoTramiteVentanillaEForma.setAnalisisEtapa(analisisEtapa);
//        datoTramiteVentanillaEForma.setTipoRequisito(null);
//        datoTramiteVentanillaEForma.setCodigo(null);
//        datoTramiteVentanillaEForma.setDescripcion(null);
//        datoTramiteVentanillaEForma.setPresento(Boolean.TRUE);
//        datoTramiteVentanillaEForma.setObservacion(null);
//        datoTramiteVentanillaEForma.setPosicion(Integer.SIZE);
//        
//        datoTramiteVentanillaEForma = datoTramiteVentanillaEFormaService.persist(datoTramiteVentanillaEForma);
//        
//        

//        List<DatoTramiteVentanillaEForma> lista = datoTramiteVentanillaEFormaService.listaDatoTramiteVentanillaEForma(tramite);
//        for (DatoTramiteVentanillaEForma datoTramiteVentanillaEForma : lista) {
//            System.out.println("***********"+datoTramiteVentanillaEForma.getDescripcion());
        
//        TipoRequisito tipoRequisito=(TipoRequisito) clasificadorService.find(TipoRequisito.class,"MIN");
//        
//        
////        }
//        List<DatoTramiteVentanillaEForma> list = datoTramiteVentanillaEFormaService.listaDatoTramiteVEntanillaPorRequisitoFlujoVentanillaEForma((AnalisisEtapa) analisisEtapaService.find(AnalisisEtapa.class, 14L),tipoRequisito);
//        for (DatoTramiteVentanillaEForma datoTramiteVentanillaEForma : list) {
//            System.out.println("el codigo padre es"+datoTramiteVentanillaEForma.getCodigo());
//            System.out.println("la descripcion es"+datoTramiteVentanillaEForma.getDescripcion());
//            
//        }
//        Tramite tramite = tramiteService.find(Tramite.class, 4L);
//        List<DatoTramiteVentanillaEForma> lista = datoTramiteVentanillaEFormaService.listaDatosTramiteVentanillaAdicionales(tramite);
//        for (DatoTramiteVentanillaEForma datoTramiteVentanillaEForma : lista) {
//            System.out.println("*************"+datoTramiteVentanillaEForma.getIdDatoTramiteVentanillaEForma());
//        }
        
        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 42L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        
        //datoTramiteVentanillaEFormaService.EliminarAdicionalesDatoTramiteVentanillaEFormaDeAnalisisEtapa(analisisEtapa,usuario);
        
        if (datoTramiteVentanillaEFormaService.validaExisteRegistrosDatoTramiteVentanillaenAnalisisEtapa(analisisEtapa, usuario)){
            System.out.println("El analisis etapa tiene registros *** ");
        }else{
            System.out.println("El analisi etapa no tiene registros *** ");
        }
            
       
    }
}
