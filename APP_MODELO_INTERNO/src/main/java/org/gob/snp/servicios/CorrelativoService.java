package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Correlativo;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.RegionalCorrelativo;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.TipoTramite;

/**
 *
 *
 * @author eddy valero
 * @version 1.0, 24/07/2014
 *
 */
public interface CorrelativoService extends GenericDao<Correlativo> {

    /**
     * método que permite adicionar un registro a la tabla Correlativo
     *
     * @param correlativo
     * @return Correlativo
     * @version 1.0, 24/07/2014
     * @author eddy valero
     * @throws Exception
     */
    Correlativo persistCorrelativo(Correlativo correlativo) throws Exception;

    /**
     * metodo que permite modificar el registro correspondiente de la tabla
     * Correlativo
     *
     * @param correlativo
     * @return Correlativo
     * @version 1.0, 24/07/2014
     * @author eddy valero
     */
    Correlativo mergeCorrelativo(Correlativo correlativo) throws Exception;

    /**
     * metodo que permite eliminar el registro correspondiente de la tabla
     * Correlativo
     *
     * @version 1.0, 24/07/2014
     * @param correlativo
     * @version 1.0, 24/07/2014
     * @author eddy valero
     * @throws java.lang.Exception
     */
    void removeCorrelativo(Correlativo correlativo) throws Exception;

    /**
     * método que permite recuperar el registro de acuerdo al nombre de la tabla
     * solicitada
     *
     * @param nombreTabla
     * @return List
     * @version 1.0, 24/07/2014
     * @author eddy valero
     */
    List<Correlativo> listaCorrelativoXTabla(String nombreTabla);

    /**
     * método que permite recuperar el registro de la tabla solicitada
     *
     * @param nombreTabla
     * @return Long
     * @version 1.0, 24/07/2014
     * @author eddy valero
     */
    Long NumeroAsignado(String nombreTabla);

    /**
     * método que permite recuperar el registro de la tabla solicitada
     *
     * @param tipoTramite
     * @return Correlativo
     * @version 1.0, 16/09/2014
     * @author chanoRojas
     */
    Correlativo encuentraCorrelativoPortramite(TipoTramite tipoTramite);
    /**
     * método que permite recuperar el registro de la tabla solicitada
     *
     * @param tramite
     * @param regional
     * @return Correlativo
     * @version 1.0, 03/12/2015
     * @author chanoRojas-Diciembre
     */
    RegionalCorrelativo encuentraCorrelativoPortramiteRegional(Tramite tramite,Regional regional);
    /**
     * Método que permite obtener el siguiente numero asignado a la Tabla
     *
     * @param nombreTabla
     * @return Long, el valor siguiente de acuerdo a la Tabla
    * <pre>
    * ----------------------------------------------------
    * Creado: Eddy Valero Fecha: 11/02/2015
    * Descripcion: Se agrega el metodo obtenerSiguienteNumeroAsignadoPorTabla que devuelve un
    * Long, el metodo solamente devuelve el numero siguiente que es posible asignar
    * y no realiza la actualizacion como el metodo NumeroAsignado(String nombreTabla)
    * </pre>
     */
    Long obtenerSiguienteNumeroAsignadoPorTabla(String nombreTabla);
    /**
     * Método que obtiene los acronimos de la tabla correlativo
     *
     * @param nombreTabla
     * @return Long, el valor siguiente de acuerdo a la Tabla
    * <pre>
    * ----------------------------------------------------
    * Creado: Levi Laura Fecha: 11/02/2015
   
    * </pre>
     */
     List<String> obtieneAcronimos();
    /**
     * Método que verifica si esta en la tabla tramite
     *
     * @param nombreTabla
     * @return Método que verifica si esta en la tabla tramite
    * <pre>
    * ----------------------------------------------------
    * Creado: Levi Laura Fecha: 11/02/2015
   
    * </pre>
     */ 
     Boolean verificaSiEstaSistema(String codigoTramite);

}
