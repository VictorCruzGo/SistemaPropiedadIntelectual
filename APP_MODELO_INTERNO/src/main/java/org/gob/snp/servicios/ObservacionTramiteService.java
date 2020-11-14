package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.ObservacionTramite;
import org.gob.snp.entidades.Tramite;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * ObservacionTramite
 *
 * @author Eddy Valero
 * @see ObservacionTramiteImpl
 * @see ObservacionTramite
 * @version 1.0, 14/09/2015
 *
 */
public interface ObservacionTramiteService extends GenericDao<ObservacionTramite> {

    /**
     * Método que permite adicionar ObservacionTramite
     *
     * @param observacionTramite
     * @return ObservacionTramite
     * @throws java.lang.Exception
     */
    ObservacionTramite persistObservacionTramite(ObservacionTramite observacionTramite) throws Exception;

    /**
     * Método que permite modifica ObservacionTramite
     *
     * @param observacionTramite
     * @return ObservacionTramite
     * @throws java.lang.Exception
     */
    ObservacionTramite mergeObservacionTramite(ObservacionTramite observacionTramite) throws Exception;

    /**
     * Método que permite eliminar ObservacionTramite
     *
     * @param observacionTramite
     * @throws java.lang.Exception
     *
     */
    void removeObservacionTramite(ObservacionTramite observacionTramite) throws Exception;

    /**
     * Método que permite listar todos ObservacionTramite
     *
     * @return List
     */
    List<ObservacionTramite> listaObservacionTramite();

    /**
     * Método que permite guardar un registro ObservacionTramite
     *
     * @param observacionTramite
     * @param direccionIP
     * @param idUsuario
     * @return
     * @throws java.lang.Exception
     */
    ObservacionTramite GuardarRegistroObservacionTramite(ObservacionTramite observacionTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Método que permite listar los registros de ObservacionTramite de un
     * determinado Tramite
     *
     *
     * @param idTramite
     * @return List<ObservacionTramite>
     * @throws java.lang.Exception
     */
    List<ObservacionTramite> listaObservacionTramitePorTramite(Long idTramite) throws Exception;

    /**
     * Método que permite actualizar un registro ObservacionTramite
     *
     * @param observacionTramite
     * @param direccionIP
     * @param idUsuario
     * @return
     * @throws java.lang.Exception
     */
    ObservacionTramite ActualizarRegistroObservacionTramite(ObservacionTramite observacionTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Método que permite eliminar un registro ObservacionTramite
     *
     * @param observacionTramite
     * @param direccionIP
     * @param idUsuario
     * @throws java.lang.Exception
     */
    void EliminarRegistroObservacionTramite(ObservacionTramite observacionTramite, String direccionIP, Long idUsuario) throws Exception;

    /**
     * Obtener un vector de los valores(valor1, valor2, valor3, ...)
     * obtenidos a partir de un formato a:
     * dato1:valor1 ; dato2: valor2; dato3: valor3; dato4; valor4; ...
     *
     * @param cadena
     * @return 
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 06/10/2015
     * Descripcion: Se agrega el metodo obtenerCadena
     * ----------------------------------------------------
     * </pre>
     */
    String[] obtenerCadena(String cadena) throws Exception;
    

    
    /**
     * Obtener un vector con los valores resultados de la validación para el panel
     * de marca registrada anteriormente
     *
     * @param lemaComercial
     * @param numeroSignoRegistrado
     * @param numeroSolicitudTramite
     * @param numeroCertificado
     * @param fechaVigencia
     * @param numeroFormularioSolicitud
     * @param noEsMarcaSolicitadaRegistrada
     * @return 
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 07/10/2015
     * Descripcion: Se agrega el metodo validaCamposDatosLemaComercial
     * ----------------------------------------------------
     * </pre>
     */
    String[] validaCamposDatosLemaComercial(String lemaComercial, String numeroSignoRegistrado, String numeroSolicitudTramite,
            String numeroCertificado, String fechaVigencia, String numeroFormularioSolicitud, Boolean noEsMarcaSolicitadaRegistrada) throws Exception;
    

    

    /**
     * Método que permite obtener la ultima observacion registrada por tramite y por usuario
     *
     * @param idTramite
     * @param idUsuario
     * @return
     * @throws java.lang.Exception
     * 
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 19/10/2015
     * Descripcion: Obtener el ultimo registro disponible para el usuario externo y además que se encuentre en estado 'AC'
     * </pre>
     */
    ObservacionTramite obtenerRegistroObservacionTramitePorTramiteYUsuario(Long idTramite, Long idUsuario) throws Exception;

}
