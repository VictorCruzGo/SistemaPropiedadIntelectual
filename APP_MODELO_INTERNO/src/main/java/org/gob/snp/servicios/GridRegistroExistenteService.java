/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.vistas.GridRegistroExistente;

/**
 * Clase responsable de la Administración 
 * @author eddy
 */
public interface GridRegistroExistenteService extends GenericDao<GridRegistroExistente>{
    
    
    /**
     * método que permite listar todos los Registros de la Vista GridRegistroExistente que tienen el SM indicado
     *
     * @param   SM
     *          Cadena que se compara con los SM que se tienen registrados
     * @return List
     * @version 1.0, 14/10/2014
     * @author eddy valero
     */
    List<GridRegistroExistente> listaGridRegistroExistenteServiceComparaSM(String SM);
    
    /**
     * método que permite realizar busquedas de Marca de acuerdo a carácteres comodin
     *
     * @param   marca
     *          Cadena que se compara con los SM que se tienen registrados
     * @return List
     * @version 1.0, 14/10/2014
     * @author eddy valero
     */
    List<GridRegistroExistente> listaGridRegistroExistenteServiceComparaMarca(String marca);
    
}
