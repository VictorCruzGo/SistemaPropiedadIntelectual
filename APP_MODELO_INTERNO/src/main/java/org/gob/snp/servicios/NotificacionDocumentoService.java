/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.NotificacionDocumento;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * NotificacionDocumento
 *
 * @author Eddy Valero
 * @see NotificacionDocumentoImpl
 * @see NotificacionDocumento
 * @version 1.0, 13/02/2014
 *
 */
public interface NotificacionDocumentoService extends GenericDao<NotificacionDocumento> {

    /**
     * Método que permite el persist de la Entidad NotificacionDocumento
     *
     * @param notificacionDocumento
     * @return NotificacionDocumento
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo persistNotificacionDocumento
     * </pre>
     */
    NotificacionDocumento persistNotificacionDocumento(NotificacionDocumento notificacionDocumento) throws Exception;

    /**
     * Método que modifica la Entidad NotificacionDocumento
     *
     * @param notificacionDocumento
     * @return NotificacionDocumento
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo mergeNotificacionDocumento
     * </pre>
     */
    NotificacionDocumento mergeNotificacionDocumento(NotificacionDocumento notificacionDocumento) throws Exception;

    /**
     * método que elimina NotificacionDocumento
     *
     * @param notificacionDocumento
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo removeNotificacionDocumento
     * </pre>
     */
    void removeNotificacionDocumento(NotificacionDocumento notificacionDocumento) throws Exception;

    /**
     * método que lista los documentos a modificar de una Notificacion
     *
     * @param notificacion
     * @return List<NotificacionDocumento>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo listaDocumentosDeUnaNotificacion para el listado
     * de los documentos a notificar de una Notificacion.
     * </pre>
     */
    List<NotificacionDocumento> listaDocumentosDeUnaNotificacion(Notificacion notificacion) throws Exception;
    /**
     * método que lista los documentos que estan notificados apartir del documento
     *
     * @param notificacion
     * @return List<NotificacionDocumento>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Levi Laura Fecha: 20/02/2015
     * Descripcion: este metodo te devuelve todos los registros de NotificacionDocumento asociados a un documento, osea a quellos documentos elegidso para 
     * ser notificados
     * </pre>
     */
    List<NotificacionDocumento> listaNotificacionesDeUnDocumento(Documento documento) throws Exception;
}
