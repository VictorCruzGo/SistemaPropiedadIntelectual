package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.SolicitudPrioridadPreferencia;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * SolicitudPrioridadPreferencia.
 *
 * @author Eddy Valero
 * @version 1.0, 20/07/2015
 * @see GenericDao
 */
public interface SolicitudPrioridadPreferenciaService extends GenericDao<SolicitudPrioridadPreferencia> {

    /**
     * metodo que permite adicionar SMSolicitadoPrioridadLema
     *
     * @param solicitudPrioridadPreferencia
     * @return SMSolicitadoPrioridadLema
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     *
     */
    SolicitudPrioridadPreferencia persistSMSolicitadoPrioridadLema(SolicitudPrioridadPreferencia solicitudPrioridadPreferencia) throws Exception;

    /**
     * Metodo que permite modificar SMSolicitadoPrioridadLema.
     *
     * @param solicitudPrioridadPreferencia
     * @return SMSolicitadoPrioridadLema
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     *
     */
    SolicitudPrioridadPreferencia mergeSMSolicitadoPrioridadLema(SolicitudPrioridadPreferencia solicitudPrioridadPreferencia) throws Exception;

    /**
     * metodo que permite eliminar SMSolicitadoPrioridadLema
     *
     * @param solicitudPrioridadPreferencia
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    void removeSMSolicitadoPrioridadLema(SolicitudPrioridadPreferencia solicitudPrioridadPreferencia) throws Exception;

    /**
     * metodo que permite Listar SMSolicitadoPrioridadLema
     *
     * @return Lista de SMSolicitadoPrioridadLema
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     */
    List<SolicitudPrioridadPreferencia> listadoSmsolicitadoprioridad();

    /**
     * metodo que permite Listar SMSolicitadoPrioridadLema
     *
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     * @param listaSmsolicitadoPrioridad
     * @param tramite
     */
    void guardaListaSmSolicitadoPrioridad(List<SolicitudPrioridadPreferencia> listaSmsolicitadoPrioridad, Tramite tramite);

    /**
     * metodo que permite encontra la posicion de un elemento en un listado
     * SMSolicitadoPrioridadLema
     *
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     * @param listaSolicitadoPrioridad
     * @param solicitudPrioridadPreferenciaSeleccionado
     * @return int
     */
    int encuentraPosicionLsitado(List<SolicitudPrioridadPreferencia> listaSolicitadoPrioridad, SolicitudPrioridadPreferencia solicitudPrioridadPreferenciaSeleccionado);

    /**
     * metodo que verifica si existen SmsolicitudPrioridad en la base segun un
     * id tramite
     *
     * @param tramite
     * @return
     * @version 1.0, 13/07/2015
     * @author Eddy Valero
     */
    Boolean verificaGuardarOModificar(Tramite tramite);

    /**
     * metodo que permite Listar SMSolicitadoPrioridadLema segun tramite
     *
     * @param tramite
     * @return Lista de SMSolicitadoPrioridadLema
     * @version 1.0, 20/07/2015
     * @author Eddy Valero
     */
    List<SolicitudPrioridadPreferencia> listadoSmSolicitadoPrioridadPorTramite(Tramite tramite);

    /**
     * metodo que permite modificar SMSolicitadoPrioridadLema segun tramite
     *
     * @param listadoSmsPrioridad
     * @param tramite, listadoSmsprioridad
     * @version 1.0, 13/07/2015
     * @author Eddy Valero
     */
    void modificaListadoPrioridad(List<SolicitudPrioridadPreferencia> listadoSmsPrioridad, Tramite tramite);

    /**
     * metodo que permite elimina SMSolicitadoPrioridadLema segun tramite
     *
     * @param tramite
     * @version 1.0, 13/07/2015
     * @author Eddy Valero
     */
    void eliminaPrioridadesSegunTramite(Tramite tramite);

    /**
     * Metodo que verifica si el tramite introducido tiene prioridad guardadda
     *
     * @param tramite
     * @version 1.0, 13/07/2015
     * @author Eddy Valero
     * @return
     */
    Boolean tieneSmSolicitadoPrioridad(Tramite tramite);

    /**
     * Método que genera un listado de todoss los solicitado prioridades por
     * Tramite
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return List
     */
    List<SolicitudPrioridadPreferencia> listaSmSolicitadoPrioridadPorTramite(Tramite tramite);

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 23/09/2014
     * @author chanorojas
     * @param datosPrimerComboPrioridad
     * @param smsolicitadoprioridad
     * @return String[]
     */
    String[] validaCamposPrioridad(String datosPrimerComboPrioridad, SolicitudPrioridadPreferencia smsolicitadoprioridad);

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 23/09/2014
     * @author chanorojas
     * @param solicitudPrioridadPreferencia
     * @param tramite
     * @param idFlujo
     * @param idPagina
     * @param usuario
     * @throws java.lang.Exception
     */
    void guardaListaSmSolicitadoPrioridadGeneral(SolicitudPrioridadPreferencia solicitudPrioridadPreferencia, Tramite tramite, Long idFlujo, Long idPagina, Usuario usuario) throws Exception;

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 21/01/2015
     * @author chanorojas
     * @param solicitudPrioridadPreferencia
     * @param usuario
     * @throws java.lang.Exception
     */
    void eliminaSmSolicitadoPrioridadGeneral(SolicitudPrioridadPreferencia solicitudPrioridadPreferencia, Usuario usuario) throws Exception;

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 23/09/2014
     * @author chanorojas
     * @param usuario
     * @param tramite
     * @param flujo
     * @param idPagina
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardatramiteSinPrioridad(Tramite tramite, Usuario usuario, Flujo flujo, Long idPagina) throws Exception;

    /**
     * Método que lista los valores de preferencia.
     *
     *
     * @param tramite
     * @return List<SMSolicitadoPrioridadLema>
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy valero Fecha: 13/07/2015
     * Descripcion: Se agrega el metodo listaPrioridadPorTramite
     * </pre>
     */
    List<SolicitudPrioridadPreferencia> listaPrioridadPorTramite(Tramite tramite);

    /**
     * Método que lista los valores de preferencia.
     *
     *
     * @param tramite
     * @return List<SMSolicitadoPrioridadLema>
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy valero Fecha: 13/07/2015
     * Descripcion: Se agrega el metodo listaPrioridadPorTramite
     * </pre>
     */
    SolicitudPrioridadPreferencia prioridadPorTramite(Tramite tramite);
        /**
         * Método que lista los valores de preferencia.
         *
         * @param tramite
         * @return List<SMSolicitadoPrioridadLema>
         *
         * <pre>
         * -------------------------------------------------------------------------
         * Creado: Eddy valero Fecha: 13/07/2015
         * Descripcion: Se agrega el metodo listaPreferenciaPorTramite
         * </pre>
         */
        List<SolicitudPrioridadPreferencia> listaPreferenciaPorTramite(Tramite tramite );

    /**
     * Método que realiza el registro de las prioridades y preferencias
     * asociadas a la solicitud de Lema Comercial.
     *
     * @param tramite
     * @param listadoSolicitadoPrioridad
     * @param listadoSolicitadoPreferencia
     * @param usuario
     * @param idflujo
     * @param idPagina
     * @param prioridadAndina
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy valero Fecha: 13/07/2015
     * Descripcion: Se agrega el metodo guardaPreferenciaPrioridaYOposicionAndina
     * </pre>
     */
    void guardaPreferenciaPrioridadYOposicionAndina(Tramite tramite, List<SolicitudPrioridadPreferencia > listadoSolicitadoPrioridad , List<SolicitudPrioridadPreferencia> listadoSolicitadoPreferencia, Usuario usuario       , Long idflujo, Long idPagina        ,String prioridadAndina) throws Exception;

        /**
         * Método que realiza la validacion d los campos de preferencia
         *
         * @version 1.0, 18/05/2015
         * @author chanorojas
         * @param datosPrimerComboPrioridad
         * @param smsolicitadoprioridad
         * @return
         */
        String[] validaCamposPreferencia(String datosPrimerComboPrioridad, SolicitudPrioridadPreferencia smsolicitadoprioridad
        );

    /**
     * Método que realiza la validacion d los campos del formulario de
     * preferencia y validacion del formulario pi100
     *
     * @version 1.0, 12/10/2015
     * @author chanorojasmaldonado
     * @param oposicionAndinaHabilita
     * @param activaPrioridad
     * @param activaPreferencia
     * @param listadoSolicitadoPrioridad
     * @param listadoSolicitadoPreferencia
     * @param oposicionAndina
     * @return
     */
     String[] validaPrioridadYOposicionAndina (String oposicionAndinaHabilita, String activaPrioridad , String activaPreferencia, List<SolicitudPrioridadPreferencia > listadoSolicitadoPrioridad       , List<SolicitudPrioridadPreferencia> listadoSolicitadoPreferencia, String oposicionAndina );

    /**
     * Método que realiza la eliminacion de los listados de preferencia y
     * prioridad ligados a un tramite preferencia y validacion del formulario
     * pi100
     *
     * @version 1.0, 19/05/2015
     * @author chanorojas
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
     void eliminaDatosListados(Tramite tramite, Usuario usuario) throws Exception;
        /**
         * Método que encuentra un registro de oposicion andina segun tramite
         * pi100
         *
         * @version 1.0, 12/10/2015
         * @author chanorojasmaldonado
         * @param tramite
         * @return
         */
        SolicitudPrioridadPreferencia PrioridadAndinaPorTramite(Tramite tramite
    

);

}
