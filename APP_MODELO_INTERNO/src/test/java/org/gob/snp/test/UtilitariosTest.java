package org.gob.snp.test;

import java.util.Date;
import org.gob.snp.servicios.NoLaboralService;
import org.gob.snp.servicios.util.UtilitariosService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddyvalero
 */
public class UtilitariosTest {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        UtilitariosService utilitariosService = (UtilitariosService) context.getBean("utilitariosService");

//        int n=0;
//        
//        n = utilitariosService.diasHabiles(new Date(2014,6,19), new Date(2014,7,3));
//        
//        System.out.println("..."+n);
//        
        //05/08/2014
        //Date fechaActual = new Date(2014-1900,7-1,3);
        /*
         Date fechaActual = new Date();
         System.out.println("..."+fechaActual);
         if(noLaboralService.existeFecha(fechaActual)){
         System.out.println("La fecha Existe");
         }else{
         System.out.println("La fecha no Existe");
         }
         */
//        String correo = "correo@gmail.com";
//        System.out.println("es:::::::" + utilitariosService.validateEmail(correo));

//        Date fechaInicial = new Date(2014-1900, 1, 02, 01, 35, 23);
//        System.out.println("la fecha Inicial es--------->"+fechaInicial);
//        System.out.println("la fecha Final es--------->"+new Date());
//        System.out.println("el método es------> " + utilitariosService.diferenciaExactaEntreDosFechas(fechaInicial, new Date()));   
        
        Date fecha = utilitariosService.obtenerFechaServidor();
        System.out.println("*** " + fecha);
        
        
        
        
    }

}
