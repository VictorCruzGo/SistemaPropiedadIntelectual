/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.BandejaNotificacion;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * BandejaNotificacion
 *
 * @author Gustavo Lizarraga
 * @see BandejaNotificacionServiceImpl
 * @see BandejaNotificacion
 * @version 1.0, 20/02/2015
 *
 */
public interface BandejaNotificacionService extends GenericDao<BandejaNotificacion> {

    /**
     * método que lista las notificaciones de la Bandeja
     *
     * @return List<BandejaNotificacion>, Lista de las notificaciones
     * @param usuario      
     * <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga, Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo listadoBandejaNotificacion(Usuario usuario)
     * el cual recibe un usuario para realizar el log.
     * ----------------------------------------------------
     * </pre>
     */
    List<BandejaNotificacion> listadoBandejaNotificacion(Usuario usuario);

}
