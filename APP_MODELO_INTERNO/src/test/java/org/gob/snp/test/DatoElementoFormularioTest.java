package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.DatoElementoFormulario;
import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.FormularioTramite;
import org.gob.snp.entidades.RegistroExistenteEF;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.enums.EnumEtapaTramite;
import org.gob.snp.pojo.FormularioExamenDeFondoPojo;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DatoElementoFormularioService;
import org.gob.snp.servicios.FormularioTramiteService;
import org.gob.snp.servicios.RegistroExistenteEFService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan Valdivia
 */
public class DatoElementoFormularioTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        DatoElementoFormularioService datoElementoFormularioService = (DatoElementoFormularioService) context.getBean("datoElementoFormularioService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        RegistroExistenteEFService registroExistenEFService = (RegistroExistenteEFService) context.getBean("registroExistenteEFService");

//        Tramite tramite = tramiteService.find(Tramite.class, 6L);
//        AnalisisEtapa analisisEtapa = analisisEtapaService.obtenerAnalisisEtapaDeTramite(tramite, (EtapaTramite) clasificadorService.find(EtapaTramite.class, EnumEtapaTramite.EXAMEN_DE_FONDO.getCodigo()));
////        List<FormularioExamenDeFondoPojo> listaExamenDeFondo = datoElementoFormularioService.listaFormularioRegistrabilidad(analisisEtapa, "AnalisisDeDenominaciones");
//        List<DatoElementoFormulario> listaElementoFormulario = datoElementoFormularioService.listaDatoElementoFormularioPorOrdenYPestania(analisisEtapa, "AnalisisDeDenominaciones", 1, null);
////        List<DatoElementoFormulario> listaElementoFormulario = datoElementoFormularioService.listaPadresDatoElementoFormulario(analisisEtapa, "AnalisisDeDenominaciones", 1);
//        
////        List<FormularioExamenDeFondoPojo> listaElementoFormulario = datoElementoFormularioService.listaFormularioRegistrabilidad(analisisEtapa, "AnalisisDeConfundibilidad", 4);
////        for (FormularioExamenDeFondoPojo formularioExamenDeFondoPojo : listaElementoFormulario) {
////            System.out.println("son;;;;;; "+formularioExamenDeFondoPojo);
////        }
//     
//        for (DatoElementoFormulario datoElementoFormulario : listaElementoFormulario) {
//            System.out.println("los datos son::::: "+datoElementoFormulario.getIdDatoElementoFormulario());
//        }

        RegistroExistenteEF registroExistente = registroExistenEFService.find(RegistroExistenteEF.class, 6L);
        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 13L);
        
        
        if (datoElementoFormularioService.verificarExisteDatosPestaniaPorPestania(registroExistente, "AnalisisDeDenominaciones")){
            System.out.println("Existen Registros Asociados");
        }else{
            System.out.println("No Existen Registros Asociados");
        }
        
        
        
        
        
        
        
    }
}
