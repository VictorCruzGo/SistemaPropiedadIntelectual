/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.RenovacionTramite;
import org.gob.snp.entidades.Tramite;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * NoLaboral
 *
 * @author Eddy Valero
 * @see RenovacionTramiteServiceImpl
 * @see RenovacionTramite
 * @version 1.0 23/10/2015
 *
 */
public interface RenovacionTramiteService extends GenericDao<RenovacionTramite> {

    /**
     * método que permite agregar una RenovacionTramite
     *
     * @param renovacionTramite
     * @return RenovacionTramite
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método persistRenovacionTramite
     * </pre>
     */
    RenovacionTramite persistRenovacionTramite(RenovacionTramite renovacionTramite) throws Exception;

    /**
     * metodo que permite modifica RenovacionTramite
     *
     * @param renovacionTramite
     * @return RenovacionTramite
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método mergeRenovacionTramite
     * </pre>
     */
    RenovacionTramite mergeRenovacionTramite(RenovacionTramite renovacionTramite) throws Exception;

    /**
     * metodo que permite eliminar RenovacionTramite
     *
     * @param renovacionTramite
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método removeRenovacionTramite
     * </pre>
     *
     */
    void removeRenovacionTramite(RenovacionTramite renovacionTramite) throws Exception;

    /**
     * método que permite listar todos las RenovacionTramites
     *
     * @return List
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método listaRenovacionTramite
     * </pre>
     *
     */
    List<RenovacionTramite> listaRenovacionTramite();

    /**
     * Método que permite realizar guardar un registro de RenovacionTramite
     *
     * @param renovacionTramite
     * @param direccionIP
     * @param idUsuario
     * @throws java.lang.Exception
     * @return RenovacionTramite
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método GuardarRegistroRenovacionTramite
     * </pre>
     *
     */
    RenovacionTramite GuardarRegistroRenovacionTramite(RenovacionTramite renovacionTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Método que permite realizar una actualización de RenovacionTramite
     *
     * @param renovacionTramite
     * @param EtapaTramite
     * @param direccionIP
     * @param idUsuario
     * @throws java.lang.Exception
     * @return RenovacionTramite
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método ActualizarRegistroRenovacionTramite
     * </pre>
     *
     */
    RenovacionTramite ActualizarRegistroRenovacionTramite(RenovacionTramite renovacionTramite, String EtapaTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Método que permite eliminar un registro de RenovacionTramite
     *
     * @param renovacionTramite
     * @param EtapaTramite
     * @param direccionIP
     * @param idUsuario
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 23/10/2015
     * Descripcion: Se crea el método EliminarRegistroRenovacionTramite
     * </pre>
     *
     */
    void EliminarRegistroRenovacionTramite(RenovacionTramite renovacionTramite, String EtapaTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Método que permite realizar los datos enviados desde el formulario de
     * renovación tramite
     *
     *
     * @param tramite
     * @param etapaTramite
     * @param renovacionTramite
     * @param listaRenovacionTramite
     * @param direccionIP
     * @param idUsuario
     * @throws java.lang.Exception
     * @return RenovacionTramite
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/10/2015
     * Descripcion: Si el tramite ingresado existe se deben sobreescribir los metodos,
     * si es la primera vez que ingresa se debe realizar un almacenamiento.
     * </pre>
     *
     */
    void GuardarRegistroFormularioSolicitudRenovacionTramite(Tramite tramite, String etapaTramite, RenovacionTramite renovacionTramite, List<RenovacionTramite> listaRenovacionTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Método que permite obtener un registro de RenovacionTramite asociado al
     * Tramite
     *
     *
     * @param idTramite
     * @param idUsuario
     * @throws java.lang.Exception
     * @return RenovacionTramite
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/10/2015
     * Descripcion: Obtener el registro de RenovacionTramite de acuerdo a un
     * determinado Tramite
     * </pre>
     *
     */
    RenovacionTramite ObtenerRegistroRenovacionTramitePorTramite(Long idTramite, Long idUsuario) throws Exception;

    /**
     *
     * @param solicitanteTitular
     * @param domicilioTitular
     * @throws java.lang.Exception
     * @return String[]
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/10/2015
     * Descripcion: Validar el ingreso del solicitante titular y del domicilio del Titular
     * </pre>
     *
     */
    String[] validaCamposBloqueTitular(String solicitanteTitular, String domicilioTitular) throws Exception;

    /**
     * Método que permite obtener un listado separado por un caracter  de un vector 
     * Tramite
     * @param cadena     
     * @throws java.lang.Exception
     * @return String[]
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/10/2015
     * Descripcion: Validar el ingreso del solicitante titular y del domicilio del Titular
     * </pre>
     *
     */
    String[] obtenerCadenaRenovacion(String cadena) throws Exception;

    /**
     * Método validaCamposBloqueDatosRenovacion
     * @param renovacionTramite
     * @param generoRenovacion
     * @param numeroInternacionalRenovacion
     * @throws java.lang.Exception
     * @return String[]
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 29/10/2015
     * Descripcion: Validar el ingreso de los datos obligatorios de RenovacionTramite
     * </pre>
     *
     */
    String[] validaCamposBloqueDatosRenovacion(RenovacionTramite renovacionTramite, String generoRenovacion, String numeroInternacionalRenovacion, List<RenovacionTramite> listaRenovacionTramite, Boolean checkTxtNiza, String nombreArchivo) throws Exception;
    
    
    
}
