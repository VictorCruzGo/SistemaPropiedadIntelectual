/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Scanner;
import org.gob.snp.entidades.Direccion;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DireccionService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy valero
 */
public class DireccionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//NetBeansProjects//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");                                                                                           
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//gusn8//ProyectosGus//branches//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        DireccionService direccionService = (DireccionService) context.getBean("direccionService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");

//        Tramite tramite = tramiteService.find(Tramite.class, 2L);
//        Direccion direccion = new Direccion();
//        Direccion direccion2 = direccionService.find(Direccion.class, 2L);
//        
//        TipoCiudad tipoCiudad = (TipoCiudad)clasificadorService.find(TipoCiudad.class, "LPZ");
        //Adicionar registro
//        direccion.setTramite(tramite);
//        direccion.setPais("BOL");
////        direccion.setCiudad("La Paz");
//        direccion.setTipoCiudad(tipoCiudad);
//        direccion.setDireccion("Calle Bolivia");
//        direccion.setZona("San Pedro");
//        direccion.setBarrio("Plaza");
//        direccion.setCalle("Calle Bolivia");
//        direccion.setNumero("2536");
//        direccion.setFechaCreacion(new Date());
//        direccion.setVigente(Boolean.TRUE);
//        Direccion direccionAux = direccionService.persist(direccion);
//        System.out.println("Nuevo Registro**** "+ direccionAux.getIdDireccion());
        //Modificar Registro
//        direccion = direccionService.find(Direccion.class, 4L);
//        direccion.setCiudad("Oruro");
//        direccionService.mergeDireccion(direccion);
        //Eliminar Registro
//        direccion = direccionService.find(Direccion.class, 5L);
//        direccionService.removeDireccion(direccion);
        //A partir de una lista encontrar la posicion en la que se encuentra determinado elemento
//        direccion.setZona("zona1");
//        direccion.setBarrio("barrio1");
//        direccion.setCalle("calle1");
//        direccion.setNumero("numero1");
//        
//        
//        
//        Trami te tramite = tramiteService.find(Tra mite.class, 1L);
//        
//        List<Direccion> listaDireccion = direccionService.listaDireccionesPorTramite(tramite);
//        for (Direccion direccion1 : listaDireccion) {
//            System.out.println("***" + direccion1.getZona() + "*******" + direccion1.getBarrio());
//        }
//        
//        int pos;
//        pos = direccionService.encuentraPosicionListadoDireccion(listaDireccion, direccion);
//        
//        System.out.println("Posicion****"+pos);
//        Usuario usuario = usuarioService.find(Usuario.class, 19L);
//        List<Direccion> lista = direccionService.listaDireccionPorUsuario(usuario);
//        System.out.println("lista con:::::::::::" + lista.size());
//        for (Direccion direccion1 : lista) {
//            System.out.println("Las direcciones son:::::::::::::::::" + direccion1.getBarrio() + " otro:::::::" + direccion1.getCalle());
//        } 
//        System.out.println("VALIDA DIRECCION:" + direccionService.validaCamposDireccion(direccion2, "es"));
        
        //geocoding("-16.498761,-68.134643");
//        geo coding("-16.526061, -68.176593");
        String r = direccionService.obtieneZonaGeneral("-16.769549,-68.382093");
        System.out.println("ZONA GRAL: "+r);
    }

    public static void geocoding(String addr) throws Exception {
        // build a URL
        String s = "http://maps.google.com/maps/api/geocode/json?sensor=false&address=";
        s += URLEncoder.encode(addr, "UTF-8");
        URL url = new URL(s);

        // read from the URL
        Scanner scan = new Scanner(url.openStream());
        String str = new String();
        while (scan.hasNext()) {
            str += scan.nextLine();
        }
        scan.close();

        // build a JSON object
        JSONObject obj = new JSONObject(str);
        if (!obj.getString("status").equals("OK")) {
            return;
        }

        // get the first result
//        JSONO bject res = obj.getJSONArray("results").getJSONObject(0);
//        System.out.println(res.getString("formatted_address"));
//        JSONO bject loc = res.getJSONObject("geometry").getJSONObject("location");
//        System.out.println("lat: " + loc.getDouble("lat")+ ", lng: " + loc.getDouble("lng"));
        JSONObject res = obj.getJSONArray("results").getJSONObject(0);
        //System.out.println(res.getString("address_components"));
        JSONArray loc = res.getJSONArray("address_components");
        System.out.println("MAC: " + loc.getJSONObject(1).getString("long_name"));
    }

}
