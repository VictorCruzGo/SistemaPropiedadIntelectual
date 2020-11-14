package org.gob.snp.servicios;

import org.gob.snp.GenericDao;
import org.gob.snp.entidades.ErrorAplicacion;

/**
 * @author Eddy Valero
 * @version 1.0 26/11/2014 Implementación del Servicio ErrorAplicacionService
 *
 * <pre>
 * -----------------------------------------------------------------------------
 * Modificado: Eddy Valero Fecha: 08/12/2014
 * Se programa el metodo guardarErrorAplicacion (Long idUsuario, Long idModulo, String claseMetodo, Exception e)
 * -----------------------------------------------------------------------------
 * Modificado: Eddy Valero Fecha : 26/12/2014
 * Se
 * 
 * </pre>
 * 
 */


public interface ErrorAplicacionService extends GenericDao<ErrorAplicacion> {
    
    /**
     * Metodo que permite guardar el error generado en un determinado Metodo, en una 
     * tabla bajo un determinado Id
     * @param idUsuario: Identificación del Usuario que genero el error
     * @param idModulo: Identificación del Modulo en donde se genero el error
     * @param claseMetodo: Cadena con el formato NombreClase.Nombremetodo()
     * @param e: Excepcion del cual se generara información en el sistema
     * @return String, el numero del mensaje asociado al modulo y en un determinado idioma
     */
    String guardarErrorAplicacion(Long idUsuario, Long idModulo, String claseMetodo, Exception e);
    
    
    /**
     * Metodo que permite recuperar el ultimo error asignado al Usuario
     * @param idUsuario: Identificación del Usuario que genero el error
     * @return String, el numero de error asociado al mensaje
     */
    String obtenerErrorAplicacion(Long idUsuario);
    
    
    
}
