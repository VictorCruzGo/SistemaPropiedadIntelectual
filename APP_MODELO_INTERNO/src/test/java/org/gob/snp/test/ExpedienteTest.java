package org.gob.snp.test;

import java.util.Date;
import org.gob.snp.entidades.Expediente;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.ExpedienteService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class ExpedienteTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//SISTEMA_SENAPI/APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
//        PersonaService personaService = (PersonaService) context.getBean("personaService");
        ExpedienteService expedienteService = (ExpedienteService) context.getBean("expedienteService");
        ClasificadorService clasificadorService=(ClasificadorService)context.getBean("clasificadorService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

        
        //Pruebas de Flujo Basico
   
        //Insertar un nuevo registro
//        Expediente exp = new Expediente();
//        exp.setTipoTramite((TipoTramite)clasificadorService.find(TipoTramite.class,EnumTipoTramite.REGISTRO_EN_EL_AREA_DE_SIGNOS_DISTINTIVOS.getCodigo()));
//        exp.setFechaCreacionRegistro(new Date());
//        exp.setObservacion("SIN OBSERVACION");
//        exp.setFechaUltimaModificacion(new Date());
//        exp = expedienteService.persistExpediente(exp);
//        System.out.println("el ide de expediente es:::::::::::" + exp.getIdExpediente());

        
        /*
        //Modificacion del registro
        Expediente expedienteAux = expedienteService.find(Expediente.class, 19L);
        
        expedienteAux.setObservacion("Nueva observacion");
        expedienteAux.setAreaTramite("RECU");
        
        expedienteService.merge(expedienteAux);
        */
        
        //Eliminacion del registro
//        Expediente expedienteAux = expedienteService.find(Expediente.class, 19L);
//        expedienteService.remove(expedienteAux);
        
        //Prueba recuperacion registro Expediente
        Tramite tramite = tramiteService.find(Tramite.class, 7L);
        Expediente expediente = new Expediente();
//        expediente = expedienteService.encuentraExpedientePorTramite(tramite);
//        System.out.println("Expediente***"+expediente.getIdExpediente());
        
        
        expediente = expedienteService.encuentraExpedienteGenerico(1L);
        System.out.println("Expediente***"+expediente.getIdExpediente());
        

    }

}
