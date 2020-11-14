package org.gob.snp.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.ClaseNiza;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Direccion;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Expediente;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.SMLogotipo;
import org.gob.snp.entidades.SMSignoClaseNiza;

import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoContacto;
import org.gob.snp.entidades.vistas.TipoDocumento;
import org.gob.snp.entidades.vistas.EstadoProceso;
import org.gob.snp.entidades.vistas.TipoGenero;
import org.gob.snp.entidades.vistas.TipoGeneroPersona;
import org.gob.snp.entidades.vistas.TipoSolicitante;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.enums.EnumTipoSigno;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.ClaseNizaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DireccionService;
import org.gob.snp.servicios.ExpedienteService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TasaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class TasaTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        TasaService tasaService=(TasaService)context.getBean("tasaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        ExpedienteService expedienteService = (ExpedienteService) context.getBean("expedienteService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        DireccionService direccionService = (DireccionService) context.getBean("direccionService");
        ClaseNizaService claseNizaService = (ClaseNizaService)context.getBean("claseNizaService");
        
        
//        Tasa tasa=new Tasa();
//        tasa.setCosto(new BigDecimal("195.50"));
//        tasa.setDescripcion("marcas y signos");
//        tasa.setDescuento(123);
//        tasa.setFechaFin(new Date());
//        tasa.setFechaInicio(new Date());
//        tasa.setTipoTramite((TipoTramite)clasificadorService.find(TipoTramite.class,EnumTipoTramite.REGISTRO_EN_EL_AREA_DE_DERECHOS_DE_AUTOR.getCodigo()));
//        tasa.setVigente(Boolean.TRUE);
//        tasa=tasaService.persistTasa(tasa);
//        System.out.println("el id del nuevo registro de tasa es"+tasa.getIdTasa());
//      
        
//        List<Tasa>list=tasaService.listaTasaPorTipoTramite((TipoTramite)clasificadorService.find(TipoTramite.class,"REGS"));
        List<Tasa>list=tasaService.listaTasa();
        for (Tasa tasa : list) {
            System.out.println(":::::::"+tasa.getDescripcion());
            
        }

    }
}
