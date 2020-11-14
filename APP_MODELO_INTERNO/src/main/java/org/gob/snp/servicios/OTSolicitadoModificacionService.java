/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Menu;
import org.gob.snp.entidades.OTSolicitadoModificacion;

/**
 *
 * @author chano
 */
public interface OTSolicitadoModificacionService extends GenericDao<OTSolicitadoModificacion>{
      /**
     * método que permite hacer el registro de OTSolicitudModificacion
     *
     * @param oTSolicitadoModificacion
     * @return List
     * @version 1.0, 13/11/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    OTSolicitadoModificacion persistOTSolicitadoModificacion(OTSolicitadoModificacion oTSolicitadoModificacion) throws Exception;
    /**
     * método que permite hacer la modificacion de un registro de OTSolicitudModificacion
     * @param oTSolicitadoModificacion
     * @return List
     * @version 1.0, 13/11/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    OTSolicitadoModificacion mergeOTSolicitadoModificacion(OTSolicitadoModificacion oTSolicitadoModificacion) throws Exception;
    
      /**
     * método que permite eliminar el registro de OTSolicitudModificacion
     *
     * @param oTSolicitadoModificacion
     * @version 1.0, 13/11/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    void removeOTSolicitadoModificacion(OTSolicitadoModificacion oTSolicitadoModificacion) throws Exception;
    
      /**
     * método que permite listar los registro de OTSolicitudModificacion
     *
     * @return List
     * @version 1.0, 13/11/2014
     * @author chanoRojas
     */
    public List<OTSolicitadoModificacion> listaOTSolicitadoModificacion();
    
}
