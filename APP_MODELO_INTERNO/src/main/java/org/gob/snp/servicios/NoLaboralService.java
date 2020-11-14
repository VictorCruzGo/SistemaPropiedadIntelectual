/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios;

import java.util.Date;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.NoLaboral;
import org.gob.snp.servicios.impl.NoLaboralServiceImpl;


/**
 * Interface responsable de realizar operaciones de persistencia a la Clase NoLaboral
 * @author eddyvalero
 * @see NoLaboralServiceImpl
 * @see NoLaboral
 * @version 1.0, 03/07/2014
 * 
 */
public interface NoLaboralService extends GenericDao<NoLaboral> {
    
    /**
     * método que permite verificar si la fecha ingresada pertenece a un feriado o no
     *
     * @return boolean, true: si existe el registro con la fecha
     *                  false: no existe el registro con la fecha
     * 
     * <pre>
    * ----------------------------------------------------
    * Creado: Eddy Valero Fecha: 03/07/2014
    * Descripcion: Se agrega el metodo existeFecha, responsable de realizar
    * si la fecha ingresada existe
    * ----------------------------------------------------
    * Modificado: Gustavo Lizarraga Fecha: 03/10/2014
    * Descripcion: Se agrega el metodo existeFecha, responsable de realizar
    * si la fecha ingresada existe
    * </pre>
     */
    boolean existeFecha(Date fecha);
    
}
