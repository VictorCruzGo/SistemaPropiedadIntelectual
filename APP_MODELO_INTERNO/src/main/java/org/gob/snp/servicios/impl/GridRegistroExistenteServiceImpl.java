/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios.impl;

import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.vistas.GridRegistroExistente;
import org.gob.snp.servicios.GridRegistroExistenteService;

/**
 *
 * @author eddy
 * Clase responsable de la implementación de la interface GridRegistroExistenteService
 */
public class GridRegistroExistenteServiceImpl extends GenericDaoImpl<GridRegistroExistente> implements GridRegistroExistenteService{

    @Override
    public List<GridRegistroExistente> listaGridRegistroExistenteServiceComparaSM(String SM) {
        List<GridRegistroExistente> listaGridRegistroExistente = hibernateTemplate.find(""
                + "select e from GridRegistroExistente e "
                + "where e.sm = '"+ SM + "' ");
        if (!listaGridRegistroExistente.isEmpty()){
            return listaGridRegistroExistente;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<GridRegistroExistente> listaGridRegistroExistenteServiceComparaMarca(String marca) {
        List<GridRegistroExistente> listaGridRegistroExistente = hibernateTemplate.find(""
                + "select e from GridRegistroExistente e "
                + "where e.nombreMarca like  '"+ marca + "' ");
        if (!listaGridRegistroExistente.isEmpty()){
            return listaGridRegistroExistente;
        }
        return Collections.EMPTY_LIST;
    }
    
}
