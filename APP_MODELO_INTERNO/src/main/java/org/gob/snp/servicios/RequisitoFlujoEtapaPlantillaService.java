package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.RequisitoFlujoEtapaPlantilla;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.pojo.ExamenFormaPojo;


/**
 * Interface Responsable de los servicios de RequisitoFlujoEtapaPlantilla
 *
 * @version 1.0, 01/09/2014
 * @author Eddy Valero
  */   

public interface RequisitoFlujoEtapaPlantillaService extends GenericDao<RequisitoFlujoEtapaPlantilla> {

    /**
     * método que guarda un nuevo RequisitoFlujoEtapaPlantilla
     *
     * @param requisitoFlujoEtapaPlantilla
     * @version 1.0, 01/09/2014
     * @author eddy valero
     * @return RequisitoFlujoEtapaPlantilla
     */
    RequisitoFlujoEtapaPlantilla persistRequisitoFlujoEtapaPlantilla(RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla) throws Exception;

    /**
     * método que modifica RequisitoFlujoEtapaPlantilla
     *
     * @param requisitoFlujoEtapaPlantilla
     * @version 1.0, 01/09/2014
     * @author eddy valero
     * @return RequisitoFlujoEtapaPlantilla
     */
    RequisitoFlujoEtapaPlantilla mergeRequisitoFlujoEtapaPlantilla(RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla) throws Exception;

    /**
     * método que elimina RequisitoFlujoEtapaPlantilla
     *
     * @param requisitoFlujoEtapaPlantilla
     * @version 1.0, 01/09/2014
     * @author eddy valero
     * @throws java.lang.Exception
     */
    void removeRequisitoFlujoEtapaPlantilla(RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla) throws Exception;

    /**
     * método que realiza el listado de todos los registros RequisitoFlujoEtapaPlantilla
     *
     * @version 1.0, 01/09/2014
     * @author eddy valero
     * @return RequisitoFlujoEtapaPlantilla
     */
    List<RequisitoFlujoEtapaPlantilla> listaRequisitoFlujoEtapaPlantilla();
    
    /**
     * método que realiza el listado de todos los registros hijos a partir de un registro padre de RequisitoFlujoEtapaPlantilla
     *
     * @param requisitoFlujoEtapaPlantilla
     * @version 1.0, 02/09/2014
     * @author eddy valero
     * @return RequisitoFlujoEtapaPlantilla
     */
    List<RequisitoFlujoEtapaPlantilla> listaRequisitoFlujoEtapaPlantillaHijosPorPadre(RequisitoFlujoEtapaPlantilla requisitoFlujoEtapaPlantilla);
    
    /**
     * método que realiza el listado de todos los registros padres de acuerdo al FlujoEtapa y por TipoRequisito
     *
     * @param flujoEtapa
     * @param tipoRequisito
     * @param pestania
     * @version 1.0, 02/09/2014
     * @author eddy valero
     * @return RequisitoFlujoEtapaPlantilla
     */
    List<RequisitoFlujoEtapaPlantilla> listaRequisitoFlujoEtapaPlantillaPadreTipoRequisito(FlujoEtapa flujoEtapa, TipoRequisito tipoRequisito, String pestania);
    
    /**
     * método que genera la plantilla de acuerdo al flujoetapa enviado
     *
     * @param flujoEtapa
     * @param tipoRequisito
     * @param pestania
     * @version 1.0, 03/09/2014
     * @author eddy valero
     * @return ExamenFormaExamenPojo
     */
    List<ExamenFormaPojo> listaPojoExamenFormaDinamico(FlujoEtapa flujoEtapa, TipoRequisito tipoRequisito, String pestania);
    
}
