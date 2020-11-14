package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.DocumentoObservacionPojo;


/**
 * Interface responsable de realizar operaciones de persistencia al Pojo DocumentoObservacionPojo.java
 * @author Eddy Valero
 * @see DocumentoObservacionPojoServiceImpl
 * @see DocumentoObservacionPojo
 * @version 1.0, 12/02/2015
 * 
 */
public interface DocumentoObservacionPojoService extends GenericDao<DocumentoObservacionPojo> {

    /**
     * Método que permite listar todos los Documentos asociados a un Tramite incluyendo el
     * campo de Observación.
     *
     * @param tramite, el objeto del cual se requieren recuperar sus documentos
     * @param usuario, el usuario que realiza el tramite
     * @return List<DocumentoObservacionPojo>
     * @throws java.lang.Exception
     * 
     * <pre>
    * ----------------------------------------------------
    * Creado: Eddy Valero Fecha: 12/02/2015
    * Descripcion: Se agrega el metodo ListaDocumentoObservacionPojoPorTramite
    * que recupera todos los documents asociados a un determinado tramite
    * ----------------------------------------------------
    * </pre>
     
     */
    List<DocumentoObservacionPojo> ListaDocumentoObservacionPojoPorTramite(Tramite tramite, Usuario usuario) throws Exception;
    
}
