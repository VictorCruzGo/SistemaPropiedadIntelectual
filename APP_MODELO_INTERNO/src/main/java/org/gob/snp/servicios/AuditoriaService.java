package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Auditoria;


/**
 * Interface responsable de realizar operaciones de persistencia a la Clase Auditoria
 * @author Eddy Valero
 * @see AuditoriaImpl
 * @see Auditoria
 * @version 1.0, 17/09/2015
 * 
 */
public interface AuditoriaService extends GenericDao<Auditoria> {

    /**
     * Método que permite adicionar Auditoria
     *
     * @param auditoria
     * @return Auditoria
     * @throws java.lang.Exception
     */
    Auditoria persistAuditoria(Auditoria auditoria) throws Exception;

    /**
     * Método que permite modifica Auditoria
     *
     * @param auditoria
     * @return Auditoria
     * @throws java.lang.Exception
     */
    Auditoria mergeAuditoria(Auditoria auditoria) throws Exception;

    /**
     * Método que permite eliminar Auditoria
     *
     * @param auditoria
     * @throws java.lang.Exception
     *
     */
    void removeAuditoria(Auditoria auditoria) throws Exception;
    
    
    /**
     * Método que permite listar todos ObservacionTramite
     *
     * @return List
     */
    List<Auditoria> listaAuditoria();

    
}
