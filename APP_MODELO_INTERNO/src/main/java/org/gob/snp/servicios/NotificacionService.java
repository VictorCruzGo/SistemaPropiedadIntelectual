package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.DocumentoObservacionPojo;

/**
 *
 * Interface responsable de las operaciones de Notificacion
 *
 * @author Eddy Valero
 * @version 1.0 18/11/2014
 *
 */
public interface NotificacionService extends GenericDao<Notificacion> {

    /**
     * *
     * Metodo temporal que permite realizar el proceso de Notificación de forma
     * Temporal
     *
     * @param tramite
     * @param tramiteFlujoEtapa
     * @param idUsuario
     * @param mensaje
     * @throws java.lang.Exception
     */
    public void procesoNotificacionTemporal(Tramite tramite, TramiteFlujoEtapa tramiteFlujoEtapa, Long idUsuario, String mensaje) throws Exception;

    /**
     * Método que lista todas las modificaciones
     *
     * @return List<Notificacion>
     *
     * <pre>
     * Modificado: Gustavo Lizarraga Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo listadoNotificaciones
     * </pre>
     *
     * @exception java.lang.Exception
     */
    List<Notificacion> listadoNotificaciones() throws Exception;

    /**
     * Metodo que almacena o realiza el persist de una Notificacion
     *
     * @return Notificacion
     * @param notificacion
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo persistNotificacion para realizar
     * el persist de una Notificacion
     * ----------------------------------------------------
     * </pre>
     */
    Notificacion persistNotificacion(Notificacion notificacion) throws Exception;

    /**
     * Metodo que almacena o realiza la modificacion de una Notificacion
     *
     * @return Notificacion
     * @param notificacion
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo mergeNotificacion para realizar
     * la modificación de una Notificacion
     * ----------------------------------------------------
     * </pre>
     */
    Notificacion mergeNotificacion(Notificacion notificacion) throws Exception;

    /**
     * Metodo que elimina una Notificacion
     *
     * @param notificacion
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo persistNotificacion para realizar
     * la eliminacion de una Notificacion
     * ----------------------------------------------------
     * </pre>
     */
    void removeNotificacion(Notificacion notificacion) throws Exception;

    /**
     * Metodo que realiza el Registro de una notificación
     *
     * @param listaDocumentoObservacionPojo
     * @param tramite, el tramite del cual se almacenar su modificación
     * @param usuario
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo guardarRegistroDocumentosNotificacion
     * responsable de realizar el almacenamiento de la Notificación y de todos
     * los documentos asociados a esta notificacion
     * ----------------------------------------------------
     * </pre>
     */
    void guardarRegistroDocumentosNotificacion(List<DocumentoObservacionPojo> listaDocumentoObservacionPojo, Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Metodo que realiza la actualización de el lugar de notificacion
     *
     * @param notificacion
     * @param fechaSolicitudNotificacion
     * @param personaNotificada
     * @param observacion
     * @param usuario
     * @param notificado
     * @return Notificacion
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga, Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo actualizarInformacionNotificacion el cuál permite actualizar
     * la informacion de una notificacion como la fechaSolicitudNotificacion, la personaNotificada
     * y las observaciones.
     * ----------------------------------------------------
     * </pre>
     */
    Notificacion actualizaInformacionNotificacion(Notificacion notificacion, Date fechaSolicitudNotificacion, String personaNotificada, String observacion, Usuario usuario, Boolean notificado) throws Exception;

    /**
     * Metodo que obtiene la lista de todos los Documentos asociados a un
     * Trámite en la opción de Notificación
     *
     * @param tramite
     * @return List
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga, Fecha: 10/04/2015
     * Descripcion: Se agrega el metodo listaDocumentosAsociadosAUnTramite que devuelve
     * una lista con todos los documentos asociados aun tramite.
     * ----------------------------------------------------
     * </pre>
     */
    List<Documento> listaDocumentosAsociadosAUnTramite(String tramite) throws Exception;

    /**
     * método que permite rescatar un listado de notificaciones por tramite
     *
     * @param tramite
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 21/05/2015
     * Descripcion: Se agrega el metodo listaNotificacionesPorTramite, que permite rescatar un listado de notificaciones por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<Notificacion> listaNotificacionesPorTramite(Tramite tramite, Usuario usuario);

    /**
     * Metodo que realiza la finalizacion de el lugar de notificacion
     *
     * @param notificacion
     * @param fechaSolicitudNotificacion
     * @param personaNotificada
     * @param observacion
     * @param usuario
     * @param notificado
     * @return Notificacion
     * @exception java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga, Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo actualizarInformacionNotificacion el cuál permite actualizar
     * la informacion de una notificacion como la fechaSolicitudNotificacion, la personaNotificada
     * y las observaciones.
     * ----------------------------------------------------
     * </pre>
     */
    Notificacion finalizarInformacionNotificacion(Notificacion notificacion, Date fechaSolicitudNotificacion, String personaNotificada, String observacion, Usuario usuario, Boolean notificado) throws Exception;

    /**
     * Metodo que realiza la validación de los campos del Detalle de la
     * Notificacion
     *
     * @param fechaNotificacion
     * @param horaSeleccionada
     * @param minutoSeleccionado
     * @param personaNotificada
     * @return String[]      <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizarraga, Fecha: 02/07/2015
     * Descripcion: Método para validar los campos de el Detalle de Notificaciones
     * ----------------------------------------------------
     * </pre>
     */
    public String[] validarCampos(Date fechaNotificacion, String horaSeleccionada, String minutoSeleccionado, String personaNotificada);

    public void asignaHoraRecepcionNotificacion(Notificacion notificacion, Usuario usuario) throws Exception;

}
