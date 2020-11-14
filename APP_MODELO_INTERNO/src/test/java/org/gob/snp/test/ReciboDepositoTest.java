package org.gob.snp.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Deposito;
import org.gob.snp.entidades.Recibo;
import org.gob.snp.entidades.ReciboDeposito;
import org.gob.snp.servicios.ClaseNizaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DepositoService;
import org.gob.snp.servicios.DireccionService;
import org.gob.snp.servicios.ExpedienteService;
import org.gob.snp.servicios.ReciboDepositoService;
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
public class ReciboDepositoTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ProyectoFinal//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        TasaService tasaService = (TasaService) context.getBean("tasaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        ExpedienteService expedienteService = (ExpedienteService) context.getBean("expedienteService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        DireccionService direccionService = (DireccionService) context.getBean("direccionService");
        ClaseNizaService claseNizaService = (ClaseNizaService) context.getBean("claseNizaService");
//        ReciboService reciboService = (ReciboService) context.getBean("reciboService");
        ReciboDepositoService reciboDepositoService = (ReciboDepositoService) context.getBean("reciboDepositoService");
        DepositoService depositoService = (DepositoService) context.getBean("depositoService");
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	String dateInString = "24/08/2015";
        Date date = formatter.parse(dateInString);
        
        int suma=0;
      //  List<Deposito> lista=reciboDepositoService.listaReciboDepositoPorIdRecibo(date,new Long(1));
       // System.out.println("tam lista "+lista.size());
       // for(int i=0;i<=lista.size()-1;i++)
       // {  System.out.println("idDeposito"+lista.get(i).getMonto());
       //    suma=suma+lista.get(i).getMonto().intValue();
           
       // }
        //System.out.println("SUMA:"+suma);
                
        //System.out.println("la suma"+reciboDepositoService.listaSumaDepositos(new Long(4),date).get(0));
//        System.out.println("El monto de la suma de saldos es" + reciboDepositoService.sumaMontoReciboPorDeposito((Deposito) depositoService.find(Deposito.class, 1L)) + "::::::::::::::::::::::");

//        List<ReciboDeposito>list=reciboDepositoService.listaReciboDepositoPorRecibo((Recibo)reciboService.find(Recibo.class,1L));    
//        for (ReciboDeposito reciboDeposito : list) {
//            System.out.println("el id de deposito es:::::: "+reciboDeposito.getDeposito().getIdDeposito());
//            
//        }
    }
}
    