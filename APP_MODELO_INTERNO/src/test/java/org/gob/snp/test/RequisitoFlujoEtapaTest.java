package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.RequisitoFlujoEtapa;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.entidades.vistas.TipoRespuestaRequisito;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.RequisitoFlujoEtapaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jonathan Valdivia
 */
public class RequisitoFlujoEtapaTest{

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");                                                                                                                                    
        RequisitoFlujoEtapaService requisitoFlujoEtapaService = (RequisitoFlujoEtapaService)context.getBean("requisitoFlujoEtapaService");
        ClasificadorService clasificadorService = (ClasificadorService)context.getBean("clasificadorService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService)context.getBean("analisisEtapaService");
        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 2L);
        RequisitoFlujoEtapa requisitoFlujoEtapa = new RequisitoFlujoEtapa();
        requisitoFlujoEtapa.setRequisito("Prueba Requisito");
        requisitoFlujoEtapa.setPestania("Examen");
        requisitoFlujoEtapa.setSeccion("Seccion");
        requisitoFlujoEtapa.setSubSeccion("Sub Seccion");
        requisitoFlujoEtapa.setOrden(1);
        requisitoFlujoEtapa.setTipoRequisito((TipoRequisito)clasificadorService.find(TipoRequisito.class, "MIN"));
        requisitoFlujoEtapa.setTipoRespuestaRequisito((TipoRespuestaRequisito)clasificadorService.find(TipoRespuestaRequisito.class, "TXT"));
        requisitoFlujoEtapa.setValor("Valor");
        requisitoFlujoEtapa.setTieneDetalle(Boolean.TRUE);
        requisitoFlujoEtapa.setFechaCreacion(new Date());
        requisitoFlujoEtapa.setVigente(Boolean.TRUE);
        requisitoFlujoEtapa.setFechaUltimaModificacion(new Date());
        requisitoFlujoEtapa.setAnalisisEtapa(analisisEtapa);
        requisitoFlujoEtapaService.persistRequisitoFlujoEtapa(requisitoFlujoEtapa);
        List<RequisitoFlujoEtapa> lista = requisitoFlujoEtapaService.listaRequisitoFlujoEtapa();
        for (RequisitoFlujoEtapa requisitoFlujoEtapa1 : lista) {
            System.out.println("el requisito es:::::::::"+requisitoFlujoEtapa1.getIdRequisitoFlujoEtapa());
        }
    }
}
