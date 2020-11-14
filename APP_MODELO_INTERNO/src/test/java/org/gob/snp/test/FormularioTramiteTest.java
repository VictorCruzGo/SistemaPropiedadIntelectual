/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.FormularioTramite;
import org.gob.snp.entidades.Persona;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.FormularioTramiteService;
import org.gob.snp.servicios.PersonaEmpresaTramiteService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class FormularioTramiteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        FormularioTramiteService formularioTramiteService = (FormularioTramiteService) context.getBean("formularioTramiteService");

        //***Verificar la Busqueda
//        FormularioTramite formularioTramite = formularioTramiteService.find(FormularioTramite.class, 1L);
//        System.out.println("**** "+ formularioTramite.getNombreFormulario());
        
        //***Verificar la creacion de la tabla
//        FormularioTramite formularioTramite = new FormularioTramite();
//        formularioTramite.setCodigo("REGP");
//        formularioTramite.setNombreFormulario("NOMBRE FORMULARIO");
//        formularioTramite.setFechaInicio(new Date());
//        formularioTramite.setFechaFin(null);
//        formularioTramite.setFechaUltimaModificacion(new Date());
//        formularioTramite.setVigente(Boolean.TRUE);
//        formularioTramite.setUsuario(null);
//        formularioTramiteService.persist(formularioTramite);
//        System.out.println("Los datos se guardaron correctamente....");
        
        //***Verificar la eliminacion del registro del FormularioTramite
//        FormularioTramite formularioTramite = formularioTramiteService.find(FormularioTramite.class, 2L);
//        System.out.println("**** " + formularioTramite.getNombreFormulario());
//        formularioTramiteService.removeFormularioTramite(formularioTramite);
//        System.out.println("Se realizo la eliminacion del FormularioTramite");
        
        //**Verificar Modificacion de un registro de la Tabla
//        FormularioTramite  formularioTramite = formularioTramiteService.find(FormularioTramite.class, 3L);
//        formularioTramite.setCodigo("REGPMODIF");
//        FormularioTramite formularioTramiteAux = formularioTramiteService.mergeFormularioTramite(formularioTramite);
        
        //***Listado de Registros
//        List<FormularioTramite> formularioTramites = formularioTramiteService.listaFormularioTramite();
//        for (FormularioTramite formularioTramite : formularioTramites) {
//            System.out.println("Codigo *** "+ formularioTramite.getCodigo()+ "  NombreFormulario ***"+ formularioTramite.getNombreFormulario());
//        }
        
        
        
    }
}
