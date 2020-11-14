/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
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
 * @author jonathanvaldivia/RobertoSantivañez
 */
public class PersonaEmpresaTramiteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("K:\\Proyecto SI\\APP_SIUNO\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
  ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_4//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        PersonaService personaService = (PersonaService) context.getBean("personaService");
        PersonaEmpresaTramiteService personaEmpresaTramiteService = (PersonaEmpresaTramiteService) context.getBean("personaEmpresaTramiteService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
////        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
//        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

//        Persona persona = (Persona) personaService.find(Persona.class, 3L);
//        System.out.println("el id de persona::::" + persona.getIdPersona() + "::::::::::::::::");
//        Tramite tramite = tramiteService.find(Tramite.class, 113L);
//        Persona persona = personaService.find(Persona.class, 64L);
//        Empresa empresa= empresaService.find(Empresa.class,15L);
//        Empresa empresa = new Empresa();
//        System.out.println("la verificacion es si el tramite pertenece a la misma persona es" + personaEmpresaTramiteService.verificaModificacionNombre(tramite, persona, empresa));
//        System.out.println("el id de tramite es " + tramite.getIdTramite());
//        PersonaEmpresaTramite personaET = new PersonaEmpresaTramite();
//        personaET.setTramite(tramite);
//        personaET.setFechaCreacion(new Date());
//        personaET.setEmpresa(null);
//        personaET.setPersona(persona);
//        personaET.setTipoPersonaSolicitud((TipoPersonaSolicitud) clasificadorService.find(TipoPersonaSolicitud.class, "SOLI"));
//        personaET.setVigente(true);
//        personaET.setUltimaModificacion(new Date());
//        System.out.println("el id de persona tramite es" + personaEmpresaTramiteService.persistPersonaEmpresaTramite(personaET).getIdPersonaSolicitud());
//        
//        
//        System.out.println("el id del perempresatramites"+personaEmpresaTramiteService.obtienePersonaEmpresaTramiteApoderadoPorTramite(tramite));
//        
//        Tramite tramite = tramiteService.find(Tramite.class, 102L);
//        System.out.println("::::::::::::"+tramite.getIdTramite());
//        Usuario usuario = usuarioService.find(Usuario.class, 260L);
//                
//        PersonaEmpresaTramite test = personaEmpresaTramiteService.obtienePersonaEmpresaTramitePorTramite(tramite);
//        System.out.println("El id PersonaEmpresaTramite========= "+test.getIdPersonaSolicitud());
//        Empresa empresa = empresaService.find(Empresa.class, 26L);
//        Tramite tramite = tramiteService.find(Tramite.class, 38L);
//        System.out.println("la empresa es--------- " + empresa.getNombreRepresentante());
//        System.out.println("ESTAAAA::::: "+personaEmpresaTramiteService.verificaSiEmpresaEstaImplicadaEnOtroTramite(empresa, tramite));
//        List<Persona>lista=personaEmpresaTramiteService.listaPersonasPorUsuario((Usuario) usuarioService.find(Usuario.class, 2L));
//        if(!lista.isEmpty()){
//            for (Persona persona : lista) {
//                System.out.println("Los parametros son " + persona.getNombres());
//
//            }
//        }else{
//            System.out.println("no existe datos en la lista");
//        
//        }
//        
//        List<Apoderado> lis = personaEmpresaTramiteService.listaPersonasApoderadoPorUsuario((Usuario) usuarioService.find(Usuario.class, 3L));
//        for (Apoderado apoderado : lis) {
//            System.out.println("los apoderados son "+apoderado.getIdApoderado());
//        }
//        List<PersonaEmpresaTramite> list = personaEmpresaTramiteService.obtieneListaPersonaEmpresaPorTramite(tramite);
//        for(PersonaEmpresaTramite tramite1 :list){
//            System.out.println(":::::::::::::::::::::::"+tramite1.getTramite()+":::::::::::::"+tramite1.getFechaUltimaModificacion()+":::::::::::::");
//        
//        } 
//        personaEmpresaTramiteService.bloqueaPersonaEmpresaPorTramite(tramite, usuario);
//        List<PersonaEmpresaTramite>lista=personaEmpresaTramiteService.obtieneListaApoderadoPersonaPorTramite(tramite);
//        for (PersonaEmpresaTramite personaEmpresaTramite : lista) {
//            System.out.println("el apoderado es"+personaEmpresaTramite.getApoderado().getIdApoderado());
//            System.out.println("la persona es"+personaEmpresaTramite.getPersona().getIdPersona());
//            
//        }
        
        
        Usuario usuario = usuarioService.find(Usuario.class, 260L);
//        List<PersonaEmpresaTramite> listaPersonaEmpresaTramites = personaEmpresaTramiteService.listaApoderadoPersonaPorUsuario(usuario);
//        for (PersonaEmpresaTramite personaEmpresaTramite : listaPersonaEmpresaTramites) {
//            System.out.println("idPErsonaEMpresaTRamite " + personaEmpresaTramite.getIdPersonaSolicitud());
//        }
        
        List<Persona> listaPersonaEmpresaTramites = personaEmpresaTramiteService.listaApoderadoPersonaPorUsuarioFinal(usuario);
        for (Persona personaEmpresaTramite : listaPersonaEmpresaTramites) {
            System.out.println("idPErsonaEMpresaTRamite " + personaEmpresaTramite.getIdPersona());
        }
        
        
        
        

    }

}
