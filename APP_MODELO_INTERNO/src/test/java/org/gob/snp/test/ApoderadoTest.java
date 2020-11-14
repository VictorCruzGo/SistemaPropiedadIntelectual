package org.gob.snp.test;

import java.util.List;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.PoderService;
import org.gob.snp.servicios.PersonaEmpresaTramiteService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanoRojas
 */
public class ApoderadoTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        PoderService poderService = (PoderService) context.getBean("poderService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        PersonaEmpresaTramiteService personaEmpresaTramiteService = (PersonaEmpresaTramiteService) context.getBean("personaEmpresaTramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        
//        Apoderado apoderado = new Apoderado();
//        apoderado.setFechaExpiracionPoder(new Date());
//        apoderado.setLugar("LPz");
//        apoderado.setNumeroPoder("123456as");
//        apoderado.setPersona((Persona) personaService.find(Persona.class, 3L));
//        apoderado.setRepresentante("qwe");
//        apoderado.setUltimaModificacion(new Date());
//        apoderado.setVigente(true);
//        System.out.println("el id del nuevo apoderado es "+apoderadoService.persistApoderado(apoderado).getIdApoderado());
//        

//          Apoderado apoderado = (Apoderado)apoderadoService.find(Apoderado.class, 1L);
////          apoderado.setNumeroPoder("0014521");
////        System.out.println("el id del nuevo apoderado es "+apoderadoService.mergeApoderado(apoderado).getIdApoderado());
//        apoderadoService.removeApoderado(apoderado);
//        Tramite tramite = tramiteService.find(Tramite.class, 148L);
//        if(apoderadoService.tieneApoderado(tramite)){
//            System.out.println("tiene");
//        }else{
//            System.out.println("no tiene");
//        }
//        Tramite tramite = tramiteService.find(Tramite.class, 5L);
//        PersonaEmpresaTramite personaEmpresaTramite = personaEmpresaTramiteService.find(PersonaEmpresaTramite.class, 16L);
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        try {
//            
//            List<Apoderado> listaApoderado = apoderadoService.recuperaPoderPorTramite(personaEmpresaTramite, usuario);
//            for (Apoderado apoderado : listaApoderado) {
//            System.out.println(" *** " + apoderado.getIdApoderado() );
//        }
//        } catch (Exception e) {
//            System.out.println(" Error "+ e.getMessage());
//        }
 
        Tramite tramite = tramiteService.find(Tramite.class, 3L);
        Poder apoderado = poderService.recuperaPoderPorTramite(tramite);
        
        
        System.out.println(" El Numero de Poder es : " + apoderado.getIdPoder());
        
        
        
     
    }
}
