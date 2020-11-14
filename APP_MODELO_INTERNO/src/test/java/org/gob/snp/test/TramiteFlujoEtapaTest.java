/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.ValorTramiteVentanillaEForma;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.enums.EnumEtapaTramite;
import org.gob.snp.pojo.FormularioVentanillaPojo;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.FlujoEtapaService;
import org.gob.snp.servicios.FlujoService;
import org.gob.snp.servicios.TramiteFlujoEtapaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class TramiteFlujoEtapaTest {
    private static TramiteFlujoEtapaService tramiteFlujoEtapaService;
    private static  ApplicationContext context;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ProyectoFinal//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        tramiteFlujoEtapaService = (TramiteFlujoEtapaService) context.getBean("tramiteFlujoEtapaService");
      
       
        String fi = "2015-09-02";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dateI = format.parse(fi);
        
        
        String ff = "2015-09-03";
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dateF = format1.parse(ff);
        
        List<Notificacion> lista= tramiteFlujoEtapaService.listaTramiteFlujoEtapaFiltrosNotificacion(null,new Long(203),"VEN",dateI,dateF); 
        System.out.println("tam lista: "+lista.size());
        for(int i=0;i<=lista.size()-1;i++)
        {
            System.out.println("idTarmite"+lista.get(i).getIdTramite());
        
        }    
    
         // System.out.println("ENCONTRADOO "+encontrado.getIdTramiteFlujoEtapa()+"  etapa   "+encontrado.getEtapaTramite().getCodigo());
    }

}
