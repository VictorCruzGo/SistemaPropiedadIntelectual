/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.FormularioTramite;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ElementoFormularioTramiteService;
import org.gob.snp.servicios.FormularioTramiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author eddy
 */
public class ElementoFormularioTramiteTest {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        FormularioTramiteService formularioTramiteService = (FormularioTramiteService) context.getBean("formularioTramiteService");
        ElementoFormularioTramiteService elementoFormularioTramiteService = (ElementoFormularioTramiteService) context.getBean("elementoFormularioTramiteService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");

        System.out.println("***");

        //*** Verificar la busqueda
//        ElementoFormularioTramite elementoFormularioTramite = elementoFormularioTramiteService.find(ElementoFormularioTramite.class, 1L);
//        System.out.println("*** "+ elementoFormularioTramite.getNombreElemento());
        //*** Verificar el almacenamiento
//        FormularioTramite formularioTramite = formularioTramiteService.find(FormularioTramite.class, 1L);
//        ElementoFormularioTramite elementoFormularioTramite = new ElementoFormularioTramite();
//        elementoFormularioTramite.setFormularioTramite(formularioTramite);
//        elementoFormularioTramite.setTipoElemento("textbox");
//        elementoFormularioTramite.setNombreElemento("OtroNombre");
//        elementoFormularioTramite.setOrden(1);
//        elementoFormularioTramite.setIdPadre(null);
//        elementoFormularioTramite.setFechaInicio(new Date());
//        elementoFormularioTramite.setFechaFin(null);
//        elementoFormularioTramite.setVigente(Boolean.TRUE);
//        elementoFormularioTramite.setUsuario(null);
//        elementoFormularioTramite.setFechaUltimaModificacion(new Date());
//        
//        try {
//            ElementoFormularioTramite elementoFormularioTramiteAux = elementoFormularioTramiteService.persistElementoFormularioTramite(elementoFormularioTramite);
//        } catch (Exception ex) {
//            Logger.getLogger(ElementoFormularioTramiteTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        System.out.println("Se logro la insercion del registro");
        //*** Verificar la modificacion
//        ElementoFormularioTramite elementoFormularioTramite = elementoFormularioTramiteService.find(ElementoFormularioTramite.class, 23L);
//        elementoFormularioTramite.setNombreElemento("OtroNombreElemento");
//        ElementoFormularioTramite elementoFormularioTramiteAux = elementoFormularioTramiteService.merge(elementoFormularioTramite);
//        
//        System.out.println("se logro realizar la modificación*** ");
        //*** Verificar la eliminacion
//        ElementoFormularioTramite elementoFormularioTramite = elementoFormularioTramiteService.find(ElementoFormularioTramite.class, 23L);
//        try {
//            elementoFormularioTramiteService.removeElementoFormularioTramite(elementoFormularioTramite);
//        } catch (Exception ex) {
//            Logger.getLogger(ElementoFormularioTramiteTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("se logro realizar la eliminacion");
        //*** Verificar el listado
        FormularioTramite formularioTramite = formularioTramiteService.find(FormularioTramite.class, 1L);
        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 16L);

//        List<ElementoFormularioTramite> lista;
        try {
//            elementoFormularioTramiteService.vaciarRegistrosDatoElementoFormulario(formularioTramite, analisisEtapa, pestania);

            //Generar la primera plantilla
//            elementoFormularioTramiteService.generarPlantillaRegistrabilidad(formularioTramite, analisisEtapa);
            //Generar la segunda plantilla
//            elementoFormularioTramiteService.generarPlantillaRelacionRegistroExistente(formularioTramite, analisisEtapa);
            //Generar la plantilla de analisis de denominaciones y de confundibilidad
            elementoFormularioTramiteService.generarPlantillaAnalisisDenominacionesConfundibilidad(formularioTramite, analisisEtapa);
            //elementoFormularioTramiteService.generarPlantillaConclusion(formularioTramite, analisisEtapa);
        } catch (Exception ex) {
            Logger.getLogger(ElementoFormularioTramiteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
