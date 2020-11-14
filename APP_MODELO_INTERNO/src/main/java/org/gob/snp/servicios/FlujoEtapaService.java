package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoEtapa;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoTramite;

/**
 *
 *
 * @author Jonathan Valdivia
 *
 *
 */
public interface FlujoEtapaService extends GenericDao<FlujoEtapa> {

    /**
     * método que permite almacenar en la tabla FlujoEtapa
     *
     * @return FlujoEtapa
     * @version 1.0, 01/09/2014
     * @author Eddy Valero
     */
    FlujoEtapa persistFlujoEtapa(FlujoEtapa flujoEtapa) throws Exception;

    ;
    
    /**
     * método que permite actualizar un determinado registro del FlujoEtapa
     *
     * @return FlujoEtapa
     * @version 1.0, 01/09/2014
     * @author Eddy Valero
     */
    FlujoEtapa mergeFlujoEtapa(FlujoEtapa flujoEtapa) throws Exception;

    ;
    
    /**
     * método que permite eliminar un determinado registro del FlujoEtapa
     *
     * @version 1.0, 01/09/2014
     * @author Eddy Valero
     */
    void removeFlujoEtapa(FlujoEtapa flujoEtapa) throws Exception;

    ;
    

    /**
     * método que permite listar todos los FlujoEtapa
     *
     * @return List
     * @version 1.0, 02/07/2014
     * @author Jonathan
     */
    List<FlujoEtapa> listaFlujoEtapa();

    /**
     * método que dado una etapa devuelve el numero de días
     *
     * @param tipoTramite
     * @param etapaTramite
     * @return Cadena
     * @version 1.0, 02/07/2014
     * @author Eddy Valero
     */
    int plazoPorTipoTramiteYEtapa(TipoTramite tipoTramite, EtapaTramite etapaTramite);

    /**
     * Método que encuentra FlujoEtapa por Flujo y EtapaTramite
     *
     * @param tramite
     * @param estadoEtapa
     * @return
     *
     * <pre>
     * -----------------------------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 08/09/2014
     * -----------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 11/12/2014
     * En caso que el tramite sea de tipo Modificacion MODI, se debe obtener
     * el flujo de modificación correcto.
     * </pre>
     */
    FlujoEtapa encuentraFlujoEtapaPorFlujoYTramite(Tramite tramite, EstadoEtapa estadoEtapa);

    /**
     * método que determina el maximo orden que se tiene para un determinado
     * flujo, en la tabla FlujoEtapa
     *
     * @param flujo
     * @return int
     * @version 1.0, 08/09/2014
     * @author Eddy Valero
     */
    int maximoOrdenDisponiblePorFlujo(Flujo flujo);

    /**
     * método que dado un tramite determina cual es la siguiente etapa que le
     * corresponde
     *
     * @param tramite el tramite que se quiere verificar
     * @param estadoEtapa el estado de la etapa
     * @param idUsuario el id del responsable que esta realizando la operación
     * @return retornar FlujoEtapa, correspondiente al siguiente flujo Etapa, y
     * NULL, en caso que no existen mas etapas.
     * @throws java.lang.Exception
     */
    FlujoEtapa controlFlujoPorTramite(Tramite tramite, EstadoEtapa estadoEtapa, Long idUsuario) throws Exception;

    /**
     * Método que encuentra el Id de Padre del Flujo Etapa segun la Etapa del
     * Tramite
     *
     * @param tramite
     * @return Long, obtiene el IdPadrede la Etapa Actual
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 08/09/2014
     * Descripcion: Se agrega el metodo encuentraIdPadreDeFlujoEtapa
     *  ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 24/04/2015
     * Descripcion: Modifica el metodo para que su parametro de entrada sea el
     * tramite
     * </pre>
     */
    Long encuentraIdPadreDeFlujoEtapa(Tramite tramite);

    /**
     * Método que encuentra Flujo Etapa segun la Etapa del Tramite
     *
     * @version 1.0, 17/10/2014
     * @author Jonathan Valdivia
     * @param etapaTramite
     * @return
     */
    FlujoEtapa encuentraFlujoEtapaPorEtapaTramite(EtapaTramite etapaTramite);

    /**
     * Método que encuentra Flujo Etapa correspondiente, al retroceder un flujo
     * etapa de acuerdo al Tramite y EstadoEtapa introducido
     *
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     * @param tramite
     * @param estadoEtapa
     * @param idUsuario
     * @return
     * @throws java.lang.Exception
     */
    FlujoEtapa controlRetornarAnteriorFlujoPorTramite(Tramite tramite, EstadoEtapa estadoEtapa, Long idUsuario) throws Exception;

    /**
     * Método que verifica si al tramite ingresado, el flujo actual le
     * corresponde o no Revision
     *
     * @param flujo flujo principal del tramite
     * @param tramite tramite ingresado
     * @param idUsuario idUsuario que realiza la operacion
     * @return Boolean Verdadero, si el FlujoEtapa asociado al Tramite le
     * corresponde revision Falso, si el FlujoEtapa no le corresponde revision
     * @throws java.lang.Exception
     */
    Boolean verificaSiTramiteTieneRevision(Flujo flujo, Tramite tramite, Long idUsuario) throws Exception;

    /**
     * Método que verifica si al tramite ingresado, el flujo actual le
     * corresponde generar o no otro AnalisisEtapa
     *
     * @param flujo flujo principal del tramite
     * @param tramite mensaje del tramite
     * @param idUsuario idusuario
     * @return Boolean Verdadero, si el FlujoEtapa asociado al Tramite le
     * corresponde generar otro analisis etapa Falso, si el FlujoEtapa no le
     * corresponde generar otro analisis etapa
     * @throws java.lang.Exception
     */
    Boolean verificaSiTramiteGeneraAnalisisEtapa(Flujo flujo, Tramite tramite, Long idUsuario) throws Exception;

    /**
     * Método que obtiene el FlujoEtapa padre a partir del Flujo Principal, el
     * Tramite ingresado
     *
     * @param flujo flujo principal del tramite
     * @param tramite mensaje del tramite
     * @param idUsuario idusuario
     * @return Flujo, obtener el flujo padre
     * @throws java.lang.Exception
     */
    Flujo obtenerFlujoEtapaPrincipal(Flujo flujo, Tramite tramite, Long idUsuario) throws Exception;

    /**
     * método que dado un tramite determina cual es la siguiente etapa que le
     * corresponde sin implicar las observaciones
     *
     * @param tramite el tramite que se quiere verificar
     * @param estadoEtapa el estado de la etapa
     * @param idUsuario el id del responsable que esta realizando la operación
     * @return retornar FlujoEtapa, correspondiente al siguiente flujo Etapa, y
     * NULL, en caso que no existen mas etapas.
     * @throws java.lang.Exception
     */
    FlujoEtapa controlFlujoPorTramiteSinObservaciones(Tramite tramite, EstadoEtapa estadoEtapa, Long idUsuario) throws Exception;

    /**
     * método que permite obtener el FlujoEtapa de acuerdo al Flujo y la
     * EtapaTramite enviados
     *
     * @param flujo, el flujo en el que se encuentra el tramite
     * @param etapaTramite, la etapa en la que se encuentra el flujo
     * @return FlujoEtapa, objeto con el valor del FlujoEtapa actual
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 02/02/2015
     * Descripcion: Se agrega el metodo existeFecha, responsable de realizar
     * si la fecha ingresada existe
     *  ----------------------------------------------------
     * </pre>
     */
    FlujoEtapa encuentraFlujoEtapaPorFlujoyEtapaTramite(Flujo flujo, EtapaTramite etapaTramite);

    /**
     * método que permite obtener el FlujoEtapa especifico de Notificacion
     *
     * @param flujo, el flujo en el que se encuentra el tramite
     * @param etapaTramite, la etapa en la que se encuentra el flujo
     * @param usuario
     * @return FlujoEtapa, objeto con el valor del FlujoEtapa actual
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo encuentraFlujoEtapaNotificacionPorFlujoyEtapaTramite
     *  ----------------------------------------------------
     * </pre>
     */
    FlujoEtapa encuentraFlujoEtapaNotificacionPorFlujoyEtapaTramite(Flujo flujo, EtapaTramite etapaTramite, Usuario usuario);

    /**
     * método que dado un tramite determina cual es la siguiente FlujoEtapa que
     * le corresponde
     *
     * @param tramite el tramite que se quiere verificar
     * @param estadoEtapa el estado de la etapa
     * @param idUsuario el id del responsable que esta realizando la operación
     * @return retornar FlujoEtapa, correspondiente al siguiente flujo Etapa, y
     * NULL, en caso que no existen mas etapas.
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 05/04/2015
     * Descripcion: Se agrega el metodo obtenerFlujoEtapaSiguienteDeTramite
     *  ----------------------------------------------------
     * </pre>
     *
     */
    FlujoEtapa obtenerFlujoEtapaSiguienteDeTramite(Tramite tramite, EstadoEtapa estadoEtapa, Long idUsuario) throws Exception;

    /**
     * Método que obtiene el último flujoetapa de acuerdo a la etapaPadre.
     * corresponde
     *
     * @param idTramite
     * @param idUsuario
     * @param codigoEstadoEtapa
     * @param etapaPadre
     * @return FlujoEtapa
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/08/2015
     * Descripcion: Se agrega el metodo obtenerUltimoEstadoEtapa
     *  ----------------------------------------------------
     * </pre>
     *
     */
    FlujoEtapa obtenerUltimoEstadoEtapa(Long idTramite, Long idUsuario, String codigoEstadoEtapa, Long etapaPadre) throws Exception;

    List<FlujoEtapa> listaFlujoEtapaPorFlujo();
}
