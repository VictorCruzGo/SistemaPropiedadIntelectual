package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Correlativo;
import org.gob.snp.entidades.RegionalCorrelativo;

/**
 *
 *
 * @author chanoRojas
 * @version 1.0, 02/12/2014
  */
public interface RegionalCorrelativoService extends GenericDao<RegionalCorrelativo> {

    /**
     * método que permite adicionar un registro a la tabla Correlativo
     *
     * @param regionalCorrelativo
     * @return Correlativo
     * @version 1.0, 02/12/2014
     * @author chano rojas
     * @throws Exception
     */
    RegionalCorrelativo persistRegionalCorrelativo(RegionalCorrelativo regionalCorrelativo) throws Exception;

    /**
     * metodo que permite modificar el registro correspondiente de la tabla
     * Correlativo
     *
     * @param regionalCorrelativo
     * @return Correlativo
     * @version 1.0, 02/12/2014
     * @author chano rojas
     * @throws java.lang.Exception
     */
    RegionalCorrelativo mergeRegionalCorrelativo(RegionalCorrelativo regionalCorrelativo) throws Exception;

    /**
     * metodo que permite eliminar el registro correspondiente de la tabla
     * Correlativo
     *
     * @version 1.0, 02/12/2014
     * @version 1.0, 02/12/2014
     * @author chano Rojas
     * @param regionalCorrelativo
     * @throws java.lang.Exception
     */
    void removeRegionalCorrelativo(RegionalCorrelativo regionalCorrelativo) throws Exception;

    /**
     * método que permite recuperar el registro de acuerdo al nombre de la tabla
     * solicitada
     *
     * @param nombreTabla
     * @return List
     * @version 1.0, 02/12/2014
     * @author chanoRojas-diciembre
     */
    List<RegionalCorrelativo> listaRegionalCorrelativoXTabla(String nombreTabla);

}
