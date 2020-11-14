package org.gob.snp.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Deposito;
import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.EstadoDeposito;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DepositoService;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.TasaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanoRojas
 */
public class DepositoTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_3//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI VICTOR//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        DepositoService depositoService = (DepositoService) context.getBean("depositoService");
        TasaService tasaService = (TasaService) context.getBean("tasaService");

//        Deposito deposito=new Deposito();
//        BigDecimal unCentavo = new BigDecimal("0.01");
//        deposito.setMonto(unCentavo);
//        deposito.setNroDeposito("12312");
//        deposito.setBanco("BANCO MERCANTIL SANTA CRUZ");
//        deposito.setPersonaDeposito("Mario Beltran");
//        deposito.setSaldo(unCentavo);
//        deposito.setFechaDeposito(new Date());
//        deposito.setEstadoDeposito((EstadoDeposito) clasificadorService.find(EstadoDeposito.class,"DVEN"));
//        deposito=depositoService.persistDeposito(deposito);
//        System.out.println("el nuevo deposito tiene como id"+deposito.getIdDeposito());
//        List<Deposito>list=depositoService.listaDepositoConSaldo();
//        for (Deposito deposito1 : list) {
//            System.out.println("el deposito es en el  banco"+deposito1.getBanco());
//        }
        List<Deposito> list = depositoService.listaDeposito();
        if(list.isEmpty()){
            System.out.println(" la lsita es vacia");
        }else{
            for (Deposito deposito1 : list) {
                System.out.println("el deposito es en el  banco" + deposito1.getNumeroDeposito());
            }
        
        }
//        System.out.println("el deposito esta ligado a un recibo"+depositoService.depositoLigadoRecibo((Deposito)depositoService.find(Deposito.class, 1L)));

//        System.out.println("el monto total es" + depositoService.actualizaSaldoDepositoPorTasa((Tasa)tasaService.find(Tasa.class, 4L),(Deposito)depositoService.find(Deposito.class,1L)));
    }
}
