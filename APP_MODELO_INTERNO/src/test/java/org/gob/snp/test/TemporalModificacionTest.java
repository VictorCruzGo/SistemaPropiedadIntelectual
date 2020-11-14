/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.TemporalModificacion;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.TemporalModificacionService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Sushy
 */
public class TemporalModificacionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        TemporalModificacionService temporalModificacionService = (TemporalModificacionService) context.getBean("temporalModificacionService");

        //declaracion de servicios
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

        //capturar un registro de la bd
        Persona persona = personaService.find(Persona.class, 16L);

        Usuario usuario = usuarioService.find(Usuario.class, 19L);

        Tramite tramite = tramiteService.find(Tramite.class, 20l);

        Empresa empresa = empresaService.find(Empresa.class, 1l);
        
             
        

//        System.out.println("Tabla temporal  Persist ******");
//
        //TemporalModificacion temporalModificacion = new TemporalModificacion();
//        temporalModificacion.setNombreTabla("Persona");
//        temporalModificacion.setIdTabla(persona.getIdPersona());
//        temporalModificacion.setCampoTabla("Nombre");
//        temporalModificacion.setDatoCampo("Susana");
//        temporalModificacion.setVigente(Boolean.TRUE);
//        temporalModificacion.setUsuario(usuario.getIdUsuario());
//        temporalModificacion.setFechaUltimaModificacion(new Date());
//        try {
//            temporalModificacionService.persist(temporalModificacion);
//            System.out.println("Se realizo la insercion exitosamente");
//        } catch (Exception e) {
//            printStackTrace();
//        }
        //cargar registros en la Lista
//         List<TemporalModificacion> lista= temporalModificacionService.listaTemporalModificacion();
//         
//         
//         //Mostrar los datos de la lista
//         for (TemporalModificacion temporalModificacion : lista) {
//             System.out.println(" *** "+ temporalModificacion.getIdTemporalModificacion());
//        }
//         
//    TemporalModificacion temporalModificacionSue = temporalModificacionService.find(TemporalModificacion.class, 1L);
//        System.out.println("Es objeto de id 1"+temporalModificacionSue.getDatoCampo());
//       temporalModificacionSue.setDatoCampo("datomerge");
//     temporalModificacionService.merge(temporalModificacionSue);
//       System.out.println("Es objeto de id 1 MERGE"+temporalModificacionSue.getDatoCampo());
        // temporalModificacionService.remove(temporalModificacionSue);
        TemporalModificacion temporalModificacionN = new TemporalModificacion();
        TemporalModificacion temporalModificacionAp = new TemporalModificacion();
        TemporalModificacion temporalModificacionAm = new TemporalModificacion();

//        temporalModificacionN.setNombreTabla("Persona");
//        temporalModificacionN.setIdTabla(1L);
//        temporalModificacionN.setCampoTabla("NombreCampo");
//        temporalModificacionN.setDatoCampo(persona.getNombres());
//        temporalModificacionN.setVigente(Boolean.TRUE);
//        temporalModificacionN.setUsuario(usuario.getIdUsuario());
//        temporalModificacionN.setFechaUltimaModificacion(new Date());

//        TemporalModificacion temporalModificacionAux = new TemporalModificacion();
//        temporalModificacionAux.setTramite(tramite);
//        temporalModificacionAux.setNombreTabla("Empresa");
//        temporalModificacionAux.setIdTabla(empresa.getIdEmpresa());
//        temporalModificacionAux.setCampoTabla("NombreRepresentante");
//        temporalModificacionAux.setDatoCampo(empresa.getNombreRepresentante());
//        temporalModificacionAux.setVigente(Boolean.TRUE);
//        temporalModificacionAux.setUsuario(usuario.getIdUsuario());
//        temporalModificacionAux.setFechaUltimaModificacion(new Date());
//        temporalModificacionService.persistTemporalModificacion(temporalModificacionAux);
//        System.out.println("REGISTRO INGRESADO %%%%%--------->");
        
        
     //   temporalModificacionService.eliminaTemporalModificacionTramite(tramite,usuario);

    }

}
