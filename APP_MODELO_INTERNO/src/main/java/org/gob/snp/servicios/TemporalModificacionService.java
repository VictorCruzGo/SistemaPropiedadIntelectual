/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.TemporalModificacion;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * TemporalModificacion
 *
 * @author Susana Escobar Paz
 * @see TemporalModificacionServiceImpl
 * @see TemporalModificacion
 * @version 1.0, 20/01/2015
 *
 */
public interface TemporalModificacionService extends GenericDao<TemporalModificacion> {

    /**
     * método que permite insertar registros en la tabla TemporalModificacion
     *
     * @param temporalModificacion
     * @return temporalModificacion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 10/02/2015
     * Descripcion: Se agrega el metodo persistTemporalModificacion, que inserta registros en la tabla TemporalModificacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    TemporalModificacion persistTemporalModificacion(TemporalModificacion temporalModificacion) throws Exception;

    /**
     * método que permite actualizar registros en la tabla TemporalModificacion
     *
     * @param temporalModificacion
     * @return temporalModificacion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 10/02/2015
     * Descripcion: Se agrega el metodo mergeTemporalModificacion, que actualiza registros en la tabla TemporalModificacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    TemporalModificacion mergeTemporalModificacion(TemporalModificacion temporalModificacion) throws Exception;

    /**
     * método que permite elominar registros en la tabla TemporalModificacion
     *
     * @param temporalModificacion
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 10/02/2015
     * Descripcion: Se agrega el metodo removeTemporalModificacion, que elimina registros en la tabla TemporalModificacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    void removeTemporalModificacion(TemporalModificacion temporalModificacion) throws Exception;

    /**
     * método que permite listar registros de la tabla TemporalModificacion
     *
     * @param 
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 10/02/2015
     * Descripcion: Se agrega el metodo listaTemporalModificacion, que recupera una lista de  registros de la tabla TemporalModificacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    List<TemporalModificacion> listaTemporalModificacion();   
       
}
