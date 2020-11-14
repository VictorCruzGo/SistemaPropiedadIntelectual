/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.RegionalCorrelativo;
import org.gob.snp.servicios.RegionalCorrelativoService;


/**
 *
 * @author Chano Rojas
 */
public class RegionalCorrelativoServiceImpl extends GenericDaoImpl<RegionalCorrelativo> implements RegionalCorrelativoService {

    @Override
    public  RegionalCorrelativo persistRegionalCorrelativo(RegionalCorrelativo regionalCorrelativo) throws Exception {
        try {
            super.persist(regionalCorrelativo);
        } catch (Exception e) {
            throw e;
        }
        return regionalCorrelativo;
    }

    @Override
    public RegionalCorrelativo mergeRegionalCorrelativo(RegionalCorrelativo regionalCorrelativo) throws Exception {
        try {
            super.merge(regionalCorrelativo);
        } catch (Exception e) {
            throw e;
        }
        return regionalCorrelativo;
    }

    @Override
    public void removeRegionalCorrelativo(RegionalCorrelativo regionalCorrelativo) throws Exception {
        try {
            super.remove(regionalCorrelativo);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<RegionalCorrelativo> listaRegionalCorrelativoXTabla(String nombreTabla) {
        List<RegionalCorrelativo> lista = hibernateTemplate.find(""
                + "select ch "
                + "from RegionalCorrelativo ch");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
    }

    

}
