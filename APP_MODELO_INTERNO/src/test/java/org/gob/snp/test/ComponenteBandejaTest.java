/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.BandejaUsuario;
import org.gob.snp.entidades.vistas.BandejaUsuarioExterno;
import org.gob.snp.servicios.BandejaUsuarioExternoService;
import org.gob.snp.servicios.BandejaUsuarioService;
import org.gob.snp.servicios.TramiteFlujoEtapaService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class ComponenteBandejaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//         ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//Proyecto_Susan//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        BandejaUsuarioService bandejaUsuarioService = (BandejaUsuarioService)context.getBean("bandejaUsuarioService");
        TramiteFlujoEtapaService tramiteFlujoEtapaService = (TramiteFlujoEtapaService)context.getBean("tramiteFlujoEtapaService");
        UsuarioService usuarioService = (UsuarioService)context.getBean("usuarioService");
        BandejaUsuarioExternoService bandejaUsuarioExternoService = (BandejaUsuarioExternoService)context.getBean("bandejaUsuarioExternoService");
        
        //UsuarioService usuarioService = (UsuarioService)context.getBean("usuarioService");
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        int c=1;int d=1;
        List<BandejaUsuario> listaA = bandejaUsuarioService.listaBandeja();
        for (BandejaUsuario bandejaUsuario : listaA) {
            System.out.println(c+" ** "+bandejaUsuario.getTramite());
            c++;
        }
        List<BandejaUsuarioExterno> lista = bandejaUsuarioExternoService.listaBandejaUsuarioExterno();
        for (BandejaUsuarioExterno bandejaUsuarioExterno : lista) {
            System.out.println(d+" ** "+bandejaUsuarioExterno.getTramite()+"<<<<<<<<  ");
            d++;
        }
        
        
//        System.out.println("nombre es:::"+bandejaUsuarioService.generaNombrePorEtapa("REGS"));
//        System.out.println("fecha Inicial "+tramiteFlujoEtapaService.find(Tramiteflujoetapa.class, 4L).getFechaInicio());
//        System.out.println("fecha Final "+new Date());
//        System.out.println("dias::: "+bandejaUsuarioService.diferenciaDeFechasEnDias(tramiteFlujoEtapaService.find(Tramiteflujoetapa.class, 4L).getFechaInicio(), new Date()));
//        
        
//        Date fecha = new Date(2014-1900,05,5);
//        System.out.println("fecha es:::"+fecha);
//        TipoTramite tipoTramite = new TipoTramite();
//        tipoTramite.setCodigo("REGS");
//        Etapa etapa = new Etapa();
//        etapa.setCodigo("EXFM");
//        System.out.println("el color es:::: "+bandejaUsuarioService.generaColoresSemaforoSegunEtapaYDias(tipoTramite,etapa,fecha));
//        Usuario usuario = usuarioService.find(Usuario.class, 4L);
//        Date fechaInicial = new Date(2014-1900,04,27);
////        Date fechaInicial = new Date();
//        System.out.println("fechaInicial "+fechaInicial);
////        Date fechaFinal = new Date(2014-1900,11,16);
//        Date fechaFinal = new Date();
//        System.out.println("fechaFinal "+fechaFinal);
//        List<BandejaUsuario> lista = bandejaUsuarioService.listaBandejaPorUsuario(usuario, fechaInicial, new Date());
//        for (BandejaUsuario bandejaUsuario : lista) {
//            System.out.println("bandeja::: "+bandejaUsuario.getNombre());
//        }
        
    }
    
}
