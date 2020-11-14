package org.gob.snp.test;

import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.ValorTramiteVentanillaEForma;
import org.gob.snp.entidades.vistas.TipoFormularioVentanillaEForma;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DatoTramiteVentanillaEFormaService;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ValorTramiteVentanillaEFormaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author
 */
public class ValorTramiteVentanillaEFormaTest {

    public static void main(String[] args) throws Exception {

//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");    
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//NetBeans//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        ValorTramiteVentanillaEFormaService valorTramiteVentanillaEFormaService = (ValorTramiteVentanillaEFormaService) context.getBean("valorTramiteVentanillaEForma");
        DatoTramiteVentanillaEFormaService datoTramiteVentanillaEFormaService = (DatoTramiteVentanillaEFormaService) context.getBean("datoTramiteVentanillaEFormaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");

        DatoTramiteVentanillaEForma datoTramiteVentanillaEForma = datoTramiteVentanillaEFormaService.find(DatoTramiteVentanillaEFormaService.class, 1L);

        ValorTramiteVentanillaEForma valorTramiteVentanillaEForma = new ValorTramiteVentanillaEForma();

        TipoFormularioVentanillaEForma tipoFormularioVentanillaEForma = (TipoFormularioVentanillaEForma) clasificadorService.find(TipoFormularioVentanillaEForma.class, "");

        valorTramiteVentanillaEForma.setDatoTramiteVentanillaEForma(datoTramiteVentanillaEForma);
        valorTramiteVentanillaEForma.setPresento(Boolean.TRUE);
        valorTramiteVentanillaEForma.setTipoFormularioVentanillaEForma(null);
        valorTramiteVentanillaEForma.setObservacion(null);
        valorTramiteVentanillaEForma.setTipoFormularioVentanillaEForma(tipoFormularioVentanillaEForma);
        

        valorTramiteVentanillaEForma = valorTramiteVentanillaEFormaService.persist(valorTramiteVentanillaEForma);

//        List<DatoTramiteVentanillaEForma> lista = datoTramiteVentanillaEFormaService.listaDatoTramiteVentanillaEForma(tramite);
//        for (DatoTramiteVentanillaEForma datoTramiteVentanillaEForma : lista) {
//            System.out.println("***********"+datoTramiteVentanillaEForma.getDescripcion());
//        }
    }
}
