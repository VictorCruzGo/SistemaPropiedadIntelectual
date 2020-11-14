package org.gob.snp.servicios.impl;

import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.Auditoria;
import org.gob.snp.servicios.AuditoriaService;
import org.gob.snp.servicios.util.UtilitariosService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementación de la Interface AuditoriaService
 *
 * @author Eddy Valero
 * @see Auditoria
 * @see AuditoriaService
 * @version 1.0, 14/09/2015
 *
 */
public class AuditoriaServiceImpl extends GenericDaoImpl<Auditoria> implements AuditoriaService {

    @Autowired
    private UtilitariosService utilitariosService;

    @Override
    public Auditoria persistAuditoria(Auditoria auditoria) throws Exception {
        try {
            super.persist(auditoria);
        } catch (Exception e) {

            throw e;
        }
        return auditoria;
    }

    @Override
    public Auditoria mergeAuditoria(Auditoria auditoria) throws Exception {
        try {
            super.merge(auditoria);
        } catch (Exception e) {
            throw e;
        }
        return auditoria;
    }

    @Override
    public void removeAuditoria(Auditoria auditoria) throws Exception {
        try {
            super.remove(auditoria);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Auditoria> listaAuditoria() {
        try {
            List<Auditoria> lista = hibernateTemplate.find(
                    "SELECT e "
                    + "FROM Auditoria e");
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }


}
