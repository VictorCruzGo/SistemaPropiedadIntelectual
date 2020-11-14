package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.DosificacionTasa;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.vistas.TipoDosificacion;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DosificacionService;
import org.gob.snp.servicios.DosificacionTasaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TasaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author RobertoSantivañez
 */
public class DosificacionTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        DosificacionService dosificacionService = (DosificacionService) context.getBean("dosificacionService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        DosificacionTasaService dosificacionTasaService = (DosificacionTasaService) context.getBean("dosificacionTasaService");
        TasaService tasaService = (TasaService) context.getBean("tasaService");
//        List<Dosificacion> lista = dosificacionService.listaDosificacion();
//        for (Dosificacion dosificacion : lista) {
//            System.out.println(":::::::::::" + dosificacion.getSerie() + ":::::::" + dosificacion.getRegional() + "::::::::::" + dosificacion.getSiguiente());
//        }
//
//        System.out.println(""+dosificacionService.actualizaSeguienteDosificacion((TipoDosificacion) clasificadorService.find(TipoDosificacion.class,"RENA")));
//        Regional regional=(Regional)regionalService.find(Regional.class,1L);
//        System.out.println("la regional es"+regional.getNombre());
//        List<Dosificacion>list=dosificacionService.listaDosificacionPorRegional(regional);
//        for (Dosificacion dosificacion : list) {
//            System.out.println("Tipo Dosifcacion:::::::"+dosificacion.getTipoDosificacion().getNombre()+":::::::::Rango Inicio::::::::::"+dosificacion.getValorInicial()+":::::::::Siguiente::::::::"+dosificacion.getSiguiente()+"::::::::Rango Final"+dosificacion.getValorFinal());
//        }
//        System.out.println(":::::::::::::::" + regionalService.listaRegional());
//          System.out.println(":::::::::" + dosificacionService.valorRestoDeposito((Regional) regionalService.find(Regional.class, 1L), "A01"));
//        System.out.println(":::::::::" + dosificacionService.valorRestoDeposito((Regional) regionalService.find(Regional.class, 1L), "A01"));

//----------lista de ciudades filtradas
//          List<TipoCiudadNotificacion>lista=dosificacionService.listaTipoCiudadDeNotificacionFiltrado();
//          for (TipoCiudadNotificacion tipoCiudadNotificacion : lista) {
//              System.out.println(":::::::::::::::"+tipoCiudadNotificacion.getCodigo()+":::::::::::::::::::::::::::::"+tipoCiudadNotificacion.getNombre());
//        }
        Regional regional = (Regional) regionalService.find(Regional.class, 1L);
        Tasa tasa =(Tasa)tasaService.find(Tasa.class, 10L);
        
//          TipoDosificacion tipoDosificacion = (TipoDosificacion) clasificadorService.find(TipoDosificacion.class, "RENA");
//          TipoDosificacion tipoDosificacion = (TipoDosificacion) clasificadorService.find(TipoDosificacion.class, "RENA");

//          Boolean roco = dosificacionService.verificaRegistroDosificacion(tipoDosificacion, regional);
//          System.out.println(":::::::::::::::::::::" +roco);
//        
//---------------------------------------------------------------------------------------------------------
//        List<TipoDosificacion> lista = dosificacionService.listaDosificaciones(regional);
//        for (TipoDosificacion tipoDosificacion1 : lista) {
//            System.out.println(":::::::::::::::::" + tipoDosificacion1.getCodigo() + "::::::::::::"+tipoDosificacion1.getNombre()+"::::::::::::::");
//        }
//        System.out.println("el numero que le corresponde en el correlativo es" + dosificacionService.actualizaSeguienteDosificacion(tipoDosificacion, regional));
//
//        --------------------------------------------metodos de dosificacionTasa-----------------------
        List<DosificacionTasa> lista = dosificacionTasaService.encuentraListaDosificacionTasaPorTasa(tasa, regional);
        for (DosificacionTasa dosificacionTasa : lista) {
            System.out.println("el id de la dosificacion es" + dosificacionTasa.getTipoRecibo().getDescripcion());

        }

    }
}
