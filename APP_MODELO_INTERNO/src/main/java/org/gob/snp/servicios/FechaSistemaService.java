package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.vistas.FechaSistema;


/**
 * Interface responsable de realizar operaciones de persistencia a la Clase FechaSistema
 * @author Eddy Valero
 * @see FechaSistemaImpl
 * @see FechaSistema
 * @version 1.0, 18/09/2015
 * 
 */
public interface FechaSistemaService extends GenericDao<FechaSistema> {

    /**
     * Método que permite obtener la Fecha de una determinada regional, si no existe,
     * retorna la fecha de la regional principal.
     *
     * @return Date
     * @throws java.lang.Exception
     */
    Date obtenerFechaRegional() throws Exception;
    
    /**
     * Método que permite obtener la Fecha de una determinada regional, si no existe,
     * retorna la fecha de la regional principal.
     *
     * @param idRegional
     * @return Date
     * @throws java.lang.Exception
     */
    Date obtenerFechaRegional(Long idRegional)  throws Exception;
    
}
