package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SeccionFormularioSolicitud;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * SeccionFormularioSolicitud
 *
 * @author Eddy Valero
 * @see SeccionFormularioSolicitudImpl
 * @see SeccionFormularioSolicitud
 * @version 1.0, 01/10/2015
 *
 */
public interface SeccionFormularioSolicitudService extends GenericDao<SeccionFormularioSolicitud> {

    /**
     * Método que permite adicionar SeccionFormularioSolicitud
     *
     * @param seccionFormularioSolicitud
     * @return SeccionFormularioSolicitud
     * @throws java.lang.Exception
     */
    SeccionFormularioSolicitud persistSeccionFormularioSolicitud(SeccionFormularioSolicitud seccionFormularioSolicitud) throws Exception;

    /**
     * Método que permite modifica SeccionFormularioSolicitud
     *
     * @param seccionFormularioSolicitud
     * @return SeccionFormularioSolicitud
     * @throws java.lang.Exception
     */
    SeccionFormularioSolicitud mergeSeccionFormularioSolicitud(SeccionFormularioSolicitud seccionFormularioSolicitud) throws Exception;

    /**
     * Método que permite eliminar SeccionFormularioSolicitud
     *
     * @param seccionFormularioSolicitud
     * @throws java.lang.Exception
     *
     */
    void removeSeccionFormularioSolicitud(SeccionFormularioSolicitud seccionFormularioSolicitud) throws Exception;

    /**
     * Método que permite listar todos SeccionFormularioSolicitud
     *
     * @return List
     */
    List<SeccionFormularioSolicitud> listaSeccionFormularioSolicitud();

    /**
     * Método que permite listar todos SeccionFormularioSolicitud
     *
     * @param idFlujo
     * @param idUsuario
     * @return int
     *
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 01/10/2015
     * Descripcion: El metodo obtiene el numero de Secciones de la Solicitud
     * </pre>
     */
    Long numeroSeccionesSolicitudFlujo(Long idFlujo, Long idUsuario) throws Exception;

    /**
     * Método que retorna la cadena de validación de Tramite
     *
     * @param idFlujo
     * @param numeroSeccion
     * @param idUsuario
     * @return String
     */
    String generarEtapaValidacionTramite(Long idFlujo, Long numeroSeccion, Long idUsuario) throws Exception;
    
    /**
     * Método que actualiza la cadena de validación de Tramite
     *
     * @param etapaValidacion
     * @param idFlujo
     * @param numeroSeccion
     * @param idUsuario
     * @return String
     */
    String actualizaEtapaValidacionTramite(String etapaValidacion, Long idFlujo, Long numeroSeccion, Long idUsuario) throws Exception;

}
