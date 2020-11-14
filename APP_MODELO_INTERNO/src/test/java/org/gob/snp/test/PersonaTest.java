/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.PersonaEmpresaTramiteService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class PersonaTest {

    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        // TODO code application logic here
      //  ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//sipi//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        UtilitariosService utilitariosService = (UtilitariosService) context.getBean("utilitariosService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        
        
//        PersonaEmpresaTramiteService personaEmpresaTramiteService = (PersonaEmpresaTramiteService) context.getBean("personaEmpresaTramiteService");
//        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
//        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
//        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");

//        Empresa empresa = empresaService.find(Empresa.class, 3L);
//        System.out.println("el id de empresa es" + empresa.getIdEmpresa() + "::::::::::::::::::::.");
//        Tramite tramite = tramiteService.find(Tramite.class, 3L);
//        System.out.println("el id de tramite es " + tramite.getIdTramite());
//        Persona persona=new Persona();
//        persona.setNombres("Ana Maria");
//        persona.setApellidoPaterno("Mariaca");
//        persona.setApellidoMaterno("Mariaca");
//        persona.setFechaNacimiento(new Date());
//        persona.setLugarExpedicion((TipoCiudad)clasificadorService.find(TipoCiudad.class, "LPZ"));
//        persona.setNumeroDocumento("123456");
//        persona.setTipoDocumento((TipoDocumentoIdentidad)clasificadorService.find(TipoDocumentoIdentidad.class,"CIDE" ));
//        persona.setTipoGeneroPersona((TipoGeneroPersona)clasificadorService.find(TipoGeneroPersona.class,"MAS"));
//        persona.setVigente(true);
//        System.out.println("el id de la nueva persona es"+ personaService.persistPersonas(persona).getIdPersona());
//        Tramite tramite = tramiteService.find(Tramite.class, 2L);
        
//        if (personaService.titularEsPersona(tramite)){
//            System.out.println("El tramite tiene como titular a una persona");
//            Persona persona = personaService.encuentraPersonaTramite(tramite);
//            System.out.println("*** "+ persona.getNombres());
//            
//        }else{
//            System.out.println("El tramite no tiene como titular a una persona");
//        }
//        
//        try {
//            List<Persona> lista = personaService.encuentraListadoPersonaTramite(tramite);
//            if (!lista.isEmpty()) {
//                for (Persona persona : lista) {
//                    System.out.println("la lsita de personas es" + persona.getNombres());
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //Probar el metodo
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        Persona persona = personaService.find(Persona.class, 16L);
//        System.out.println("Usuario "+ usuario.getPassword());
//        System.out.println("Persona "+ persona.getNombres());
//        
//        persona.setNombres("CHANO");
//        personaService.modificarRegistroPersona(persona, usuario);
        
       List<Persona> lista=personaService.listaPersonasConMismoCi("4275750");
        System.out.println("tamaño lista"+lista.size());
        for (Persona persona1 : lista) {
            System.out.println("El nombre de las personas"+ persona1.getApellidoMaterno() + ""+ persona1.getApellidoPaterno());
            
        }
        
        
        
       
        
        
        
        
        
        

    }
}
