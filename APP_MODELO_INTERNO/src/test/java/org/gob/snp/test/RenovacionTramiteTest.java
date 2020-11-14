/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.ObservacionTramite;
import org.gob.snp.entidades.RenovacionTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.ObservacionTramiteService;
import org.gob.snp.servicios.RenovacionTramiteService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy valero
 */
public class RenovacionTramiteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        
        
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        RenovacionTramiteService renovacionTramiteService = (RenovacionTramiteService) context.getBean("renovacionTramiteService");
        
        

        
        Tramite tramite = tramiteService.find(Tramite.class, 10L);
        
        
        //Prueba persistencia
//        RenovacionTramite renovacionTramite = new RenovacionTramite();
//        
//        System.out.println(" *** ");
//        
//        renovacionTramite.setTramite(tramite);
//        renovacionTramite.setNombreRazonSocialTitular("Jose Fernando Aguirre");
//        renovacionTramite.setDomicilio("Domicilio");
//        renovacionTramite.setSignoDistintivo("Nombre de Marca");
//        renovacionTramite.setTipoGenero("LC");
//        renovacionTramite.setNumeroClaseNiza("0");
//        renovacionTramite.setRegistro("0001");
//        renovacionTramite.setSerieRegistro("C");
//        renovacionTramite.setFechaOtorgacionMarca(new Date());
//        renovacionTramite.setListaProductosServicios("Listado de Productos para la clase Niza 0");
//        renovacionTramite.setClaseActualNiza("actual");
//        renovacionTramite.setEstado("AC");
//        
//        renovacionTramiteService.GuardarRegistroRenovacionTramite(renovacionTramite, "192.168.139.256", 1L);
        
        

        //Prueba Actualizacion
//        renovacionTramite = renovacionTramiteService.find(RenovacionTramite.class, 1L);
//        renovacionTramite.setDomicilio("nueva Direccion");
//        
//        renovacionTramiteService.mergeRenovacionTramite(renovacionTramite);
        
        //Prueba Eliminacion
//        renovacionTramite = renovacionTramiteService.find(RenovacionTramite.class, 1L);
//        renovacionTramiteService.removeRenovacionTramite(renovacionTramite);
        
        
        //Prueba Mostrar Datos
//        List<RenovacionTramite> listaRenovacionTramite =  renovacionTramiteService.listaRenovacionTramite();
//        
//        for (RenovacionTramite registro : listaRenovacionTramite) {
//            System.out.println(" *** " + registro.getIdRenovacionTramite() );
//        }
        
        
        
        
        //Prueba del metodo de guardado de RenovacionTramite
//        System.out.println(" *** ");
//        
//        List<RenovacionTramite> listaRenovacionTramite = new ArrayList<RenovacionTramite>();
//        
//        //cargar datos de prueba en  RenovacionTramite
//        RenovacionTramite reno1 = new RenovacionTramite();
//        reno1.setNombreRazonSocialTitular("NombreUno");
//        reno1.setDomicilio("domicilioUno");
//        
//        RenovacionTramite reno2 = new RenovacionTramite();
//        reno2.setNombreRazonSocialTitular("NombreDos");
//        reno2.setDomicilio("domicilioDos");
//        
//        RenovacionTramite reno3 = new RenovacionTramite();
//        reno3.setNombreRazonSocialTitular("NombreTres");
//        reno3.setDomicilio("domicilioTres");
//        
//        RenovacionTramite reno4 = new RenovacionTramite();
//        reno4.setNombreRazonSocialTitular("NombreCuatro");
//        reno4.setDomicilio("domicilioCuatro");
//        
//        
//        listaRenovacionTramite.add(reno1);
//        listaRenovacionTramite.add(reno2);
//        listaRenovacionTramite.add(reno3);
//        listaRenovacionTramite.add(reno4);
//        
//        
//        for (RenovacionTramite renovacionTramite : listaRenovacionTramite) {
//            System.out.println(" *** "+ renovacionTramite.getNombreRazonSocialTitular());
//        }
//        
////        RenovacionTramite renovacionTramitePrincipal = new RenovacionTramite();
//        RenovacionTramite renovacionTramitePrincipal =  renovacionTramiteService.find(RenovacionTramite.class, 6L);
//        
//        renovacionTramitePrincipal.setSignoDistintivo("Marca Inicial");
//        renovacionTramitePrincipal.setTipoGenero("MC");
//        renovacionTramitePrincipal.setNumeroClaseNiza("30");
//        renovacionTramitePrincipal.setRegistro("1234");
//        renovacionTramitePrincipal.setSerieRegistro("C");
//        renovacionTramitePrincipal.setFechaOtorgacionMarca(new Date());
//        renovacionTramitePrincipal.setNumeroUltimaRenovacion("3");
//        renovacionTramitePrincipal.setNumeroPenultimaRenovacion("4");
//        renovacionTramitePrincipal.setListaProductosServicios("Listado de productos propios de la marca *** ");
//        renovacionTramitePrincipal.setClaseActualNiza("32");

//        RenovacionTramite renovacionTramite = renovacionTramiteService.GuardarRegistroFormularioSolicitudRenovacionTramite(tramite, "USU",renovacionTramitePrincipal, listaRenovacionTramite, "192.168.139.22", 1L);
      
        
        RenovacionTramite renovacionTramite = renovacionTramiteService.ObtenerRegistroRenovacionTramitePorTramite(tramite.getIdTramite(), 1L);
        System.out.println(" *** " + renovacionTramite.getIdRenovacionTramite());
        
        
        
        
        
        
        
        


    }

}
