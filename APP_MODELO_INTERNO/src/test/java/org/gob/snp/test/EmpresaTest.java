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
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.TipoDocumento;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.PersonaEmpresaTramiteService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class EmpresaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
     //   ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        
        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

//        Usuario usuario = new Usuario(1L);
//        List<Empresa> lista = empresaService.listaEmpresa();
//        for (Empresa empresa : lista) {
//            System.out.println("id::::"+ empresa.getIdEmpresa() );
//            System.out.println("nombre::: " + empresa.getLugarConstitucion());
//        }
//        TipoDocumentoIdentidad tipoDocumentoEmpresa = (TipoDocumentoIdentidad) clasificadorService.find(TipoDocumentoIdentidad.class, "CIDE");
////        System.out.println("el tipoDocumentoEmpresa "+tipoDocumentoEmpresa.getDescripcion());
//        Empresa empresa = new Empresa();
//        empresa.setFechaCreacion(new Date());
//        empresa.setFechaUltimaModificacion(new Date());
//        empresa.setNombreRepresentante("ULTIMA EMPRESA");
//        empresa.setNumeroDocumento("11111111");
//        empresa.setTipoDocumentoEmpresa(tipoDocumentoEmpresa);
//        empresa.setVigente(true);
//        empresa = empresaService.persistEmpresa(empresa);
//        System.out.println("Empresa " + empresa.getNombreRepresentante());

//        TipoDocumentoIdentidad tipoDocumentoEmpresa = (TipoDocumentoIdentidad) clasificadorService.find(TipoDocumentoIdentidad.class, "CIDE");
//        System.out.println("el tipoDocumentoEmpresa "+tipoDocumentoEmpresa.getDescripcion());
//        Empresa empresa = empresaService.find(Empresa.class, 21L);
//        empresa.setNumeroDocumento("123456");
//        empresa.setNombreRepresentante("Representante Modificado");
//        empresaService.removeEmpresa(empresa);
//          Empresa empresa = empresaService.find(Empresa.class, 5L);               
//        Map<String,Empresa> test = new HashMap<String, Empresa>();
//        test.put("Empresa", empresa);
//        System.out.println("EMpresa::: "+((Empresa)test.get("Empresa")).getLugarConstitucion());
//        String cadena = "tipo";
//        for (int i = 0; i < 10; i++) {
//            System.out.println(cadena+i);
//        }
        
        //Verificar si la empresa es solicitante de un determinado tramite
        Tramite tramite = tramiteService.find(Tramite.class, 8L);
//        if (empresaService.titularEsEmpresa(tramite)){
//            System.out.println("El tramite tiene como titular a una empresa");
//                Empresa empresa = empresaService.encuentraEmpresaTramite(tramite);
//            System.out.println("*** "+ empresa.getNombreRepresentante());
//            
//        }else{
//            System.out.println("El tramite no tiene como titular a una empresa");
//        }
        
        
//        listado de empresa por tramite
        
//        List<Empresa>lista=empresaService.encuentraListadoEmpresasTramite(tramite);
//        
//        if(!lista.isEmpty()){
//            for (Empresa empresa : lista) {
//                System.out.println("los ides son:"+empresa.getIdEmpresa());
//                
//            }
//        }
            

        
//        Empresa empresa = empresaService.find(Empresa.class, 2L);
//        System.out.println("EMPRESA TEST "+tramite);
//        if(!lista.isEmpty()){
//            for (Empresa empresa : lista) {
//                System.out.println("los ides son:   "+empresa.getIdEmpresa());
//                
//            }
//        }
        
        
        
        
        
    }

}
