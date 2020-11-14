/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.ArrayList;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.NotificadorZona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * NotificadorZona
 *
 * @author Eddy Valero
 * @see NotificadorZonaServiceImpl
 * @see NotificadorZona
 * @version 1.0, 22/05/2015
 *
 */
public interface NotificadorZonaService extends GenericDao<NotificadorZona> {

    /**
     * Método que permite el persist de la Entidad NotificadorZona
     *
     * @param notificadorZona
     * @return NotificadorZona
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 22/05/2015
     * Descripcion: Se agrega el metodo persistNotificadorZona
     * </pre>
     */
    NotificadorZona persistNotificadorZona(NotificadorZona notificadorZona) throws Exception;

    /**
     * Método que modifica la Entidad NotificadorZona
     *
     * @param notificadorZona
     * @return NotificadorZona
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 22/05/2015
     * Descripcion: Se agrega el metodo mergeNotificadorZona
     * </pre>
     */
    NotificadorZona mergeNotificadorZona(NotificadorZona notificadorZona) throws Exception;

    /**
     * método que elimina NotificadorZona
     *
     * @param notificadorZona
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 22/05/2015
     * Descripcion: Se agrega el metodo removeNotificadorZona
     * </pre>
     */
    void removeNotificadorZona(NotificadorZona notificadorZona) throws Exception;

    /**
     * Método responsable de obtener el número de zonas y el número
     * de notificaciones  por notificador
     *
     * @param idNotificador
     * @param usuario
     * @return ArrayList
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/05/2015
     * Descripcion: Se agrega el metodo contarZonasPorNotificador
     * </pre>
     */
    ArrayList contarZonasPorNotificador(Long idNotificador, Usuario usuario) throws Exception;;
    
    /**
     * Método responsable de devolver un objeto de NotificadorZona de acuerdo
     * al codigoZona enviado
     *
     * @param codigoZona
     * @param usuario
     * @return NotificadorZona
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/05/2015
     * Descripcion: Se agrega el metodo devolverSiExisteCodigoZona
     * </pre>
     */
    NotificadorZona devolverSiExisteCodigoZona(String codigoZona, Usuario usuario) throws Exception;
    
    /**
     * Método responsable de realizar el registro o actualización en un registro de 
     * NotificadorZona, de acuerdo a la asignación realizada, finalmente
     * devuelve el registro insertado o modificado.
     *
     * @param tramite
     * @param usuario
     * @return ArrayList
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/05/2015
     * Descripcion: Se agrega el metodo asignarZonaNotificacionANotificador
     * </pre>
     */
    NotificadorZona asignarZonaNotificacionANotificador(Tramite tramite, Usuario usuario) throws Exception;
    
    
    /**
     * Método responsable de realizar la actualización o eliminación de un
     * registro NotificadorZona dependiendo si tiene o no NumeroNotificaciones.
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/05/2015
     * Descripcion: Se agrega el metodo actualizarRegistroZonaNotificadorZona
     * </pre>
     */
    void actualizarRegistroZonaNotificadorZona(Tramite tramite, Usuario usuario) throws Exception;
    
    
}
