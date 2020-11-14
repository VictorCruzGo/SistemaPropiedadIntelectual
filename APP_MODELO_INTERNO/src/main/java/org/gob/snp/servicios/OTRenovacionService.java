package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.OTRenovacion;
import org.gob.snp.entidades.Tramite;

public interface OTRenovacionService extends GenericDao<OTRenovacion> {

    /**
     * metodo que permite gurdar OTRenovacion
     *
     * @param oTRenovacion
     * @return OTRenovacion
     * @version 1.0, 17/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    OTRenovacion persistOTRenovacion(OTRenovacion oTRenovacion) throws Exception;

    /**
     * metodo que modifica OTRenovacion
     *
     * @param oTRenovacion
     * @return OTRenovacion
     * @version 1.0, 17/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    OTRenovacion mergeOTRenovacion(OTRenovacion oTRenovacion) throws Exception;

    /**
     * metodo que elimina OTRenovacion
     *
     * @param oTRenovacion
     * @version 1.0, 17/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeOTRenovacion(OTRenovacion oTRenovacion) throws Exception;

    /**
     * metodo que modifica OTRenovacion
     *
     * @return List
     * @version 1.0, 17/07/2014
     * @author chano
     */
    public List<OTRenovacion> listaOTRenovacion();
    
    
    /**
     * metodo que Valida los campos Renovacion
     *
     * @return List
     * @version 1.0, 23/10/2014
     * @author RobertoSantivañez
     */
    public Boolean[] validaCamposRenovacionUno(String datoRegistro, Date datoFecha, String datoSM);
    
    
}
