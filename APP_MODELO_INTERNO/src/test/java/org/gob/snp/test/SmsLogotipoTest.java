package org.gob.snp.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.gob.snp.entidades.SMLogotipo;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.SmLogotipoService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class SmsLogotipoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//         TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        SmSignoMarcaService smSignoMarcaService = (SmSignoMarcaService) context.getBean("smSignoMarcaService");
        SmLogotipoService smLogotipoService = (SmLogotipoService) context.getBean("smLogotipoService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

//        SMSLogotipo smsLogotipo=new SMSLogotipo();
//        smsLogotipo.setDescripcion("ARTICULO");
//        smsLogotipo.setURLLogotipo("D:carpeta_modificado");
//        smsLogotipo.setSmsignomarca((Smsignomarca)smSignoMarcaService.find(Smsignomarca.class, 5L));
//        smsLogotipo.setProtegeColor(true);
//        System.out.println("el id nuevo es"+smsLogotipoService.persistSmsLogotipo(smsLogotipo).getIdSMSLogotipo());
//        System.out.println("el id nuevo es"+smsLogotipoService.mergeSmsLogotipo(smsLogotipo).getIdSMSLogotipo());
//        List<Smsignomarca>lista=smSignoMarcaService.listaSmSignoMarca();
//        for (Smsignomarca smsignomarca : lista) {
//            System.out.println("los datos son::::::::"+smsignomarca.getTipoSolicitudDeposito().getCodigo());
//            
//        }
//        Tramite tramite = tramiteService.find(Tramite.class, 190L);
//        System.out.println("el logo es::::: "+smLogotipoService.encuentraSmLogoTipoPorTramite(tramite));
        Tramite tramite = tramiteService.find(Tramite.class, 2L);

        List<SMLogotipo> listasMLogotipo = smLogotipoService.encuentraSmLogoTipoPorTramite(tramite);

        if (!listasMLogotipo.isEmpty()) {
            for (SMLogotipo sMLogotipo : listasMLogotipo) {
                System.out.println(" *** " + sMLogotipo.getIdSMLogotipo());
            }
        }else{
            System.out.println("No tiene registros en SMsLogotipo");
        }

    }
}
