/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.OTSolicitadoModificacion;
import org.gob.snp.servicios.OTSolicitadoModificacionService;


/**
 *
 * @author chanorojas
 * @version  v 1.0 13/11/2014
 */
public class OTSolicitadoModificacionServiceImpl extends GenericDaoImpl<OTSolicitadoModificacion> implements OTSolicitadoModificacionService{

   
    @Override
    public OTSolicitadoModificacion persistOTSolicitadoModificacion(OTSolicitadoModificacion oTSolicitadoModificacion) throws Exception {
        try {
            super.persist(oTSolicitadoModificacion);
        } catch (Exception e) {
            throw e;
        }
        return oTSolicitadoModificacion;
    }

    @Override
    public OTSolicitadoModificacion mergeOTSolicitadoModificacion(OTSolicitadoModificacion oTSolicitadoModificacion) throws Exception {
        try {
            super.merge(oTSolicitadoModificacion);
        } catch (Exception e) {
            throw e;
        }
        return oTSolicitadoModificacion;
    }

    @Override
    public void removeOTSolicitadoModificacion(OTSolicitadoModificacion oTSolicitadoModificacion) throws Exception {
        try {
            super.remove(oTSolicitadoModificacion);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<OTSolicitadoModificacion> listaOTSolicitadoModificacion() {
        List<OTSolicitadoModificacion> lista = hibernateTemplate.find(
                "select c "
                + "from OTSolicitadoModificacion c");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.emptyList();
    }

}
