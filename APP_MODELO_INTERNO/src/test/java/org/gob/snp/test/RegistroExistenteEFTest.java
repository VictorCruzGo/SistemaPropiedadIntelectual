/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.RegistroExistenteEF;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.RegistroExistenteEFService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class RegistroExistenteEFTest {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        RegistroExistenteEFService registroExistenteEFService = (RegistroExistenteEFService) context.getBean("registroExistenteEFService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");

        //Guardar Registro
//        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 1L);
//        RegistroExistenteEF registroExistenteEF = new RegistroExistenteEF();
//        
//        registroExistenteEF.setAnalisisEtapa(analisisEtapa);
//        registroExistenteEF.setIdTramite(1L);
//        registroExistenteEF.setIdRegistro(1L);
//        registroExistenteEF.setTramite("SM-0001");
//        registroExistenteEF.setNumeroClaseNiza("1");
//        registroExistenteEF.setCodigoTramite("1");
//        registroExistenteEF.setListaProducto("Lista de Productos");
//        registroExistenteEF.setRegistro("reg");
//        registroExistenteEF.setFechaIngreso(new Date());
//        registroExistenteEF.setMarca("marca");
//        registroExistenteEF.setEstado("AC");
//        registroExistenteEF.setUsuario(null);
//        registroExistenteEF.setFechaUltimaModificacion(new Date());
//        
//        try {
//            RegistroExistenteEF registroExistenteEFAux = registroExistenteEFService.persistRegistroExistenteEF(registroExistenteEF);
//            System.out.println("Registro Insertado Exitosamente");
//            
//        } catch (Exception ex) {
//            Logger.getLogger(RegistroExistenteEFTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Actualizar registro
//        RegistroExistenteEF registroExistenteEF = registroExistenteEFService.find(RegistroExistenteEF.class, 1L);
//        registroExistenteEF.setCodigoTramite("nt");
//        try {
//            RegistroExistenteEF registroExistenteEFAux = registroExistenteEFService.merge(registroExistenteEF);
//            System.out.println("Registro modificado Exitosamente");
//
//        } catch (Exception ex) {
//            Logger.getLogger(RegistroExistenteEFTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Eliminar Registro
//        RegistroExistenteEF registroExistenteEF = registroExistenteEFService.find(RegistroExistenteEF.class, 1L);
//
//        try {
//            registroExistenteEFService.removeRegistroExistenteEF(registroExistenteEF);
//            System.out.println("Registro eliminado Exitosamente");
//
//        } catch (Exception ex) {
//            Logger.getLogger(RegistroExistenteEFTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 15L);
////        RegistroExistenteEF registroExistenteEF = registroExistenteEFService.find(RegistroExistenteEF.class, 78L);
//        //Guardar un registro encontrado por SM
//        String resultado = registroExistenteEFService.guardarRegistroExistenteEFPorSM("SM-0002-2014",analisisEtapa);
////        String resultado = registroExistenteEFService.guardarRegistroExistenteEFPorSM("SM-0002-2014", analisisEtapa);String resultado = registroExistenteEFService.guardarRegistroExistenteEFPorSM("1000",analisisEtapa);
//        
//        System.out.println("resultado: .... "+ resultado);
        
        
        
        List<RegistroExistenteEF> registroExistenteEFs = registroExistenteEFService.generarRegistrosExistentesEFPorMarca("%", analisisEtapa);
        
        for (RegistroExistenteEF registroExistenteEF : registroExistenteEFs) {
            System.out.println(" **** " + registroExistenteEF.getMarca());
        }
        

        //Verificar el listado de solamente los activos
//        List<RegistroExistenteEF> lista;
//        System.out.println("prueba ***");
//        try {
//            lista = registroExistenteEFService.recuperaRegistroExistenteEFPorAnalisisEtapa(analisisEtapa);
//            for (RegistroExistenteEF registroExistenteEF : lista) {
//                System.out.println(" *** " + registroExistenteEF.getMarca());
//            }
//
//        } catch (Exception ex) {
//            Logger.getLogger(RegistroExistenteEFTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        registroExistenteEFService.anularRegistroExistenteEFPorMarca(registroExistenteEF);

    }
}
