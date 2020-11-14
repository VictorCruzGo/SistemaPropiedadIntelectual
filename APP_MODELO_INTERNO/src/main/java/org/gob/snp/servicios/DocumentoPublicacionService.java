/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DocumentoPublicacion;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.PublicacionTramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoPublicacion;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * DocumentoPublicacion
 *
 * @author Susana Escobar Paz
 * @see DocumentoPublicacionServiceImpl
 * @see DocumentoPublicacion
 * @version 1.0, 23/01/2015
 *
 */
public interface DocumentoPublicacionService extends GenericDao<DocumentoPublicacion> {

    /**
     * método que permite insertar registros en la tabla DocumentoPublicacion
     *
     * @param documentoPublicacion
     * @return documentoPublicacion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo persistDocumentoPublicacion, que inserta registros en la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public DocumentoPublicacion persistDocumentoPublicacion(DocumentoPublicacion documentoPublicacion) throws Exception;

    /**
     * método que permite actualizar registros en la tabla DocumentoPublicacion
     *
     * @param documentoPublicacion
     * @return documentoPublicacion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo mergeDocumentoPublicacion, que actualiza registros en la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public DocumentoPublicacion mergeDocumentoPublicacion(DocumentoPublicacion documentoPublicacion) throws Exception;

    /**
     * método que permite elominar registros en la tabla DocumentoPublicacion
     *
     * @param documentoPublicacion
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo removeDocumentoPublicacion, que elimina registros en la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public void removeDocumentoPublicacion(DocumentoPublicacion documentoPublicacion) throws Exception;

    /**
     * método que permite listar registros de la tabla DocumentoPublicacion
     *
     * @param
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo listaDocumentoPublicacion, que recupera una lista de  registros de la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<DocumentoPublicacion> listaDocumentoPublicacion();

    /**
     * método que permite listar registros de la tabla DocumentoPublicacion
     *
     * @param publicacion
     * @param usuario
     * @param
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo listaDocumentoPublicacion, que recupera una lista de documentos asociados a una Publicacion, de la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<DocumentoPublicacion> listaDocumentoPublicacionPorPublicacion(Publicacion publicacion, Usuario usuario);

    /**
     * método que Adjunta documento de Publicacion a la tabla
     * DocumentoPublicacion
     *
     * @param documentoPublicacion
     * @param usuario
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 13/03/2015
     * Descripcion: Se agrega el metodo creaDocumentoPublicacion, que Adjunta documento de Publicacion a la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public Boolean creaDocumentoPublicacion(DocumentoPublicacion documentoPublicacion, Usuario usuario) throws Exception;

    /**
     * método que Adjunta documento de Publicacion a la tabla
     * DocumentoPublicacion
     *
     * @param documentoPublicacion
     * @param usuario
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 21/04/2015
     * Descripcion: Se agrega el metodo actualizaDocumentoPublicacion, que actualiza documento de Publicacion en la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public Boolean actualizaDocumentoPublicacion(DocumentoPublicacion documentoPublicacion, Usuario usuario) throws Exception;

    /**
     * método que Adjunta documento de Publicacion a la tabla
     * DocumentoPublicacion
     *
     * @param publicacion
     * @param estado
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 21/04/2015
     * Descripcion: Se agrega el metodo encuentraDocumentoPubblicacionPorEstado, que encuentra documentos de publicacion por estado en la tabla DocumentoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public DocumentoPublicacion encuentraDocumentoPubblicacionPorEstado(Publicacion publicacion, String estado, Usuario usuario);
}
