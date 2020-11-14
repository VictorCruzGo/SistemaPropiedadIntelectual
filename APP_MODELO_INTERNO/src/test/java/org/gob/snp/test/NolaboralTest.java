package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.servicios.NoLaboralService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddyvalero
 */
public class NolaboralTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\workspaceNetBeans\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        NoLaboralService noLaboralService = (NoLaboralService) context.getBean("noLaboralService");
        //05/08/2014
        //Date fechaActual = new Date(2014-1900,7-1,3);
        Date fechaActual = new Date();

        System.out.println("..." + fechaActual);

        if (noLaboralService.existeFecha(fechaActual)) {
            System.out.println("La fecha Existe");
        } else {
            System.out.println("La fecha no Existe");
        }

    }

}
