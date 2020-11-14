package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.SMSolicitadoPrioridad;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.TipoProteccionPrioridad;
import org.gob.snp.entidades.vistas.TipoProteccionPrioridadDatos;
import org.gob.snp.entidades.vistas.TipoSolicitud;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.SmSolicitadoPrioridadService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanorojas
 */
public class SmSolicitadoPrioridadTest {

    public static void main(String[] args) throws Exception {
          ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
          
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        SmSolicitadoPrioridadService smSolicitadoPrioridadService=(SmSolicitadoPrioridadService)context.getBean("smSolicitadoPrioridadService");
        TramiteService tramiteService=(TramiteService)context.getBean("tramiteService");
        
////            
//            SMSolicitadoPrioridad smsolicitadoprioridad=new SMSolicitadoPrioridad();
//            smsolicitadoprioridad.setFechaEmision(new Date());
//            smsolicitadoprioridad.setNumeroPrioridad("12345");
//            smsolicitadoprioridad.setOficinaPrioridad("SENAPI");
//            smsolicitadoprioridad.setTipoProteccionPrioridad((TipoProteccionPrioridad)clasificadorService.find(TipoProteccionPrioridad.class,"EXTR"));
//            smsolicitadoprioridad.setTramite((Tramite)tramiteService.find(Tramite.class,5L));
//            smsolicitadoprioridad.setUltimaModificacion(new Date());
//            smsolicitadoprioridad.setVigente(true);
//            smsolicitadoprioridad.setLugar("Nueva Sonora");
//            smsolicitadoprioridad.setObservacion("SIN OBSERVACIONES");
//            System.out.println("el id del solicitadoProteccion es"+smSolicitadoPrioridadService.persistSmsolicitadoprioridad(smsolicitadoprioridad).getIdSolicitadoPrioridad());
        
//            SMSolicitadoPrioridad smsolicitadoprioridad=smSolicitadoPrioridadService.find(SMSolicitadoPrioridad.class,2L);
//            smsolicitadoprioridad.setOficinaPrioridad("MERCANTIL");
//            smSolicitadoPrioridadService.mergeSmsolicitadoprioridad(smsolicitadoprioridad);
//            smSolicitadoPrioridadService.remove(smsolicitadoprioridad);
//            List<Smsolicitadoprioridad>lista=smSolicitadoPrioridadService.listadoSmsolicitadoprioridad();
//            for (SMSolicitadoPrioridad smsolicitadoprioridad1 : lista) {
//                System.out.println("el valor de "+smsolicitadoprioridad1.getOficinaPrioridad());
//            
//        }
//      
        
        
        
//        List<SMSolicitadoPrioridad>lista=smSolicitadoPrioridadService.listaPrioridadPorTramite((Tramite)tramiteService.find(Tramite.class,8L));        
//        for (SMSolicitadoPrioridad smsolicitadoprioridad : lista) {
//            System.out.println("el id de los smsprioridad es::::::::::::"+smsolicitadoprioridad.getIdSolicitadoPrioridad());
//            
//        }
        
        List<SMSolicitadoPrioridad>lista=smSolicitadoPrioridadService.listaPreferenciaPorTramite((Tramite)tramiteService.find(Tramite.class,26L));        
        for (SMSolicitadoPrioridad smsolicitadoprioridad : lista) {
            System.out.println("el id de los smsprioridad es::::::::::::"+smsolicitadoprioridad.getIdSolicitadoPrioridad());
            
        }
        
        
        
        
        
    }
}
