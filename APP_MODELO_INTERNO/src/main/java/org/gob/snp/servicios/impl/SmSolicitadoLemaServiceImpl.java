/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.SMSolicitadoLema;
import org.gob.snp.servicios.SmSolicitadoLemaService;

/**
 *
 * @author Eddy Valero
 */
public class SmSolicitadoLemaServiceImpl extends GenericDaoImpl<SMSolicitadoLema> implements SmSolicitadoLemaService {

    @Override
    public SMSolicitadoLema persistSMSolicitadoLema(SMSolicitadoLema sMSolicitadoLema) throws Exception {
        try {
            super.persist(sMSolicitadoLema);
            return sMSolicitadoLema;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public SMSolicitadoLema mergeSMSolicitadoLema(SMSolicitadoLema sMSolicitadoLema) throws Exception {
        try {
            super.merge(sMSolicitadoLema);
            return sMSolicitadoLema;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void removeSMSolicitadoLema(SMSolicitadoLema sMSolicitadoLema) throws Exception {
        try {
            super.remove(sMSolicitadoLema);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<SMSolicitadoLema> listadoSmsolicitadoprioridad() {
        List<SMSolicitadoLema> lista = hibernateTemplate.find(""
                + "select e"
                + " from SMSolicitadoLema e");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public Boolean[] validaCamposRenovacionUno(String datoRegistro, String datoSM) {
        
        Boolean sw = true;
        Boolean numeroRegistroValida = false;
        Boolean tramiteSMValida = false;

        if ((datoRegistro == null || datoRegistro.isEmpty())) {

            if (datoSM == null || datoSM.isEmpty()) {
                sw = false;
                tramiteSMValida = true;
                numeroRegistroValida = true;
            }
        } else {
            if (datoRegistro == null || datoRegistro.isEmpty()) {
                sw = false;
                numeroRegistroValida = true;
            } 
        }

        Boolean[] listaError = {sw, numeroRegistroValida, tramiteSMValida};
        return listaError;
        
    }
    

}
