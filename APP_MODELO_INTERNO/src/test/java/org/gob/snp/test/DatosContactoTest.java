package org.gob.snp.test;

import java.util.ArrayList;
import java.util.List;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DatosContactoService;
import org.gob.snp.servicios.EmpresaService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author chanoRojas
 */
public class DatosContactoTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI VICTOR//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//ProyectoSu//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        DatosContactoService datosContactoService = (DatosContactoService) context.getBean("datosContactoService");
        EmpresaService empresaService = (EmpresaService) context.getBean("empresaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");

//        DatosContacto datoscontacto = new DatosContacto();
//        datoscontacto.setDato("Numero  Modificado DOS 123456");
//        datoscontacto.setEmpresa((Empresa) empresaService.find(Empresa.class, 3L));
//        datoscontacto.setNotificar(true);
//        datoscontacto.setPersona((Persona) personaService.find(Persona.class, 2L));
//        datoscontacto.setTipoContacto((TipoContacto) clasificadorService.find(TipoContacto.class, "CELN"));
//        System.out.println("El id de Datos Contacto" + datosContactoService.mergeDatoscontacto(datoscontacto).getIdContacto());
       Tramite tramite = tramiteService.find(Tramite.class, 21L);
//        DatosContacto datoscontacto1 = datosContactoService.find(DatosContacto.class, 188L);
//        DatosContacto datoscontacto2 = datosContactoService.find(DatosContacto.class, 192L);
//        DatosContacto datoscontacto3 = datosContactoService.find(DatosContacto.class, 168L);
////        DatosContacto datoscontacto1 = datosContactoService.find(DatosContacto.class, 65L);
//        List<DatosContacto> lista = new ArrayList<DatosContacto>();
//        lista.add(datoscontacto1);
//        lista.add(datoscontacto2);
//        lista.add(datoscontacto3);
////        lista.add(datoscontacto1);
////        datosContactoService.eliminaDatosContactoInnecesarios(lista, tramite);
//        System.out.println("VALOR POSICION:" + datosContactoService.encuentraPosicionListadoDireccion(lista, datoscontacto1));
        
        Empresa empresa = empresaService.find(Empresa.class, 1L);
        Persona persona =personaService.find(Persona.class,15L);
        //List<DatosContacto> lista = datosContactoService.listaDatosDeContactoPorEmpresa(empresa);
          try {
           List<DatosContacto> lista = datosContactoService.listaDatosDeContactoPorEmpresa(empresa);
           if(lista.isEmpty()){
                System.out.println("ES VACIO");
           }  
           
            if (!lista.isEmpty()) {
                System.out.println("NO ES VACIO");
                for (DatosContacto datosContacto : lista) {
                    System.out.println("la lsita de contactos es" + datosContacto.getDato());
                }

            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
//         try {
//           List<DatosContacto> lista = datosContactoService.listaDatosDeContactoPorPersona(persona);
//           if(lista.isEmpty()){
//                System.out.println("ES VACIO");
//           }  
//           
//            if (!lista.isEmpty()) {
//                System.out.println("NO ES VACIO");
//                for (DatosContacto datosContacto : lista) {
//                    System.out.println("la lsita de contactos es" + datosContacto.getDato());
//
//                }
//
//            }
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        }
//        

    }
}
