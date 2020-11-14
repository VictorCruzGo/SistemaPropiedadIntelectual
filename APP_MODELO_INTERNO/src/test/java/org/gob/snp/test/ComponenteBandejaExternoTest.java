/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.BandejaUsuarioExterno;
import org.gob.snp.servicios.BandejaUsuarioExternoService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class ComponenteBandejaExternoTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\Henrry\\SVN PROYECTO SENAPI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        BandejaUsuarioExternoService bandejaUsuarioExternoService = (BandejaUsuarioExternoService) context.getBean("bandejaUsuarioExternoService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        Usuario usuario = usuarioService.find(Usuario.class, 3L);
//        System.out.println("::::::::::LISTADO::::::::::::::::::::");
        List<BandejaUsuarioExterno>lista=bandejaUsuarioExternoService.listaBandejaPorUsuarioExterno(usuario);
        for (BandejaUsuarioExterno bandejaUsuarioExterno : lista) {
             System.out.println("idObjeto:::::::::" + bandejaUsuarioExterno.getIdExpediente() + ":::::IDTramite:::::" + bandejaUsuarioExterno.getTramiteObjeto()+ ":::::Tramite:::::" + bandejaUsuarioExterno.getTramite() + "::::Nombre::::"+bandejaUsuarioExterno.getNombreSolicitud()+":::::::");
        }

//        
//        Date fechaInicial=new Date();
//        Date fechaFin=new Date();
                 
        
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        Date fechaInicial = sdf.parse("2014, 08, 13 00:00:00.000");
//        Date fechaInicial = sdf.parse("2014-08-12 00:00:00.000 ");
//        Date fechaFin = sdf2.parse("2014-08-13 23:59:59.997");
//        Date fechaInicial = sdf.parse(fechaInicialini);
//        Date fechaFin = sdf2.parse(fechaFinini);
//        Date fechaInicial= null;        
//        Date fechaFin = null;

//        String area = "";
//        String tipoTramite = "";
//        String estado = "";
//        String nombreMarca = "Marca";
//        System.out.println("entro al metodo");
//        System.out.println("fechainicio:::" + fechaInicial + ":::::fechaFin:::::::" + fechaFin + ":::::::::area::::::::"+area+"::::::tipotramite::::::"+tipoTramite+"::::::nombremarca::::::::"+nombreMarca+"::::::estado::::::"+estado+":::::::::");
//        List<BandejaUsuarioExterno> lista = bandejaUsuarioExternoService.listaBandejaPorUsuarioExternoFiltradoParametros(usuario, fechaInicial, fechaFin, area, tipoTramite, estado, nombreMarca);
//        if (!lista.isEmpty()) {
//            System.out.println("existen registros con esos parametros");
//            for (BandejaUsuarioExterno bandejaUsuarioExterno : lista) {
//                System.out.println("idObjeto:::::::::" + bandejaUsuarioExterno.getIdExpediente() + ":::::idUusario:::::" + bandejaUsuarioExterno.getTramite() + "::::Nombre::::" + bandejaUsuarioExterno.getNombreSolicitud() + ":::::::");
//            }
//        } else {
//            System.out.println("no existen registros con esos parametros");
//        }

    }

}
