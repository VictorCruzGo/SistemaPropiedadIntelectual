package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.SMSolicitadoPrioridad;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface SmSolicitadoPrioridadService extends GenericDao<SMSolicitadoPrioridad> {

    /**
     * metodo que permite adicionar SMSolicitadoPrioridad
     *
     * @param sMSolicitadoPrioridad
     * @return SMSolicitadoPrioridad
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    SMSolicitadoPrioridad persistSMSolicitadoPrioridad(SMSolicitadoPrioridad sMSolicitadoPrioridad) throws Exception;

    /**
     * metodo que permite modificar SMSolicitadoPrioridad
     *
     * @param sMSolicitadoPrioridad
     * @return SMSolicitadoPrioridad
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    SMSolicitadoPrioridad mergeSMSolicitadoPrioridad(SMSolicitadoPrioridad sMSolicitadoPrioridad) throws Exception;

    /**
     * metodo que permite eliminar SMSolicitadoPrioridad
     *
     * @param sMSolicitadoPrioridad
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    void removeSMSolicitadoPrioridad(SMSolicitadoPrioridad sMSolicitadoPrioridad) throws Exception;

    /**
     * metodo que permite Listar SMSolicitadoPrioridad
     *
     * @return Lista de SMSolicitadoPrioridad
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     */
    List<SMSolicitadoPrioridad> listadoSmsolicitadoprioridad();

    /**
     * metodo que permite Listar SMSolicitadoPrioridad
     *
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     * @param listaSmsolicitadoPrioridad
     * @param tramite
     */
    void guardaListaSmSolicitadoPrioridad(List<SMSolicitadoPrioridad> listaSmsolicitadoPrioridad, Tramite tramite);

    /**
     * metodo que permite encontra la posicion de un elemento en un listado
     * SMSolicitadoPrioridad
     *
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     * @param listaSolicitadoPrioridad
     * @param sMSolicitadoPrioridadSeleccionado
     * @return int
     */
    int encuentraPosicionLsitado(List<SMSolicitadoPrioridad> listaSolicitadoPrioridad, SMSolicitadoPrioridad sMSolicitadoPrioridadSeleccionado);

    /**
     * metodo que verifica si existen SmsolicitudPrioridad en la base segun un
     * id tramite
     *
     * @param tramite
     * @return
     * @version 1.0, 04/08/2014
     * @author ChanoRojas
     */
    Boolean verificaGuardarOModificar(Tramite tramite);

    /**
     * metodo que permite Listar SMSolicitadoPrioridad segun tramite
     *
     * @param tramite
     * @return Lista de SMSolicitadoPrioridad
     * @version 1.0, 22/07/2014
     * @author ChanoRojas
     */
    List<SMSolicitadoPrioridad> listadoSmSolicitadoPrioridadPorTramite(Tramite tramite);

    /**
     * metodo que permite modificar SMSolicitadoPrioridad segun tramite
     *
     * @param listadoSmsPrioridad
     * @param tramite, listadoSmsprioridad
     * @version 1.0, 13/08/2014
     * @author ChanoRojas
     */
    void modificaListadoPrioridad(List<SMSolicitadoPrioridad> listadoSmsPrioridad, Tramite tramite);

    /**
     * metodo que permite elimina SMSolicitadoPrioridad segun tramite
     *
     * @param tramite
     * @version 1.0, 13/08/2014
     * @author ChanoRojas
     */
    void eliminaPrioridadesSegunTramite(Tramite tramite);

    /**
     * Metodo que verifica si el tramite introducido tiene prioridad guardadda
     *
     * @param tramite
     * @version 1.0, 13/08/2014
     * @author ChanoRojas
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
    List<SMSolicitadoPrioridad> listaSmSolicitadoPrioridadPorTramite(Tramite tramite);

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 23/09/2014
     * @author chanorojas
     * @param datosPrimerComboPrioridad
     * @param smsolicitadoprioridad
     * @return String[]
     */
    String[] validaCamposPrioridad(String datosPrimerComboPrioridad, SMSolicitadoPrioridad smsolicitadoprioridad);

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 23/09/2014
     * @author chanorojas
     * @param sMSolicitadoPrioridad
     * @param tramite
     * @param idFlujo
     * @param idPagina
     * @param usuario
     * @throws java.lang.Exception
     */
    void guardaListaSmSolicitadoPrioridadGeneral(SMSolicitadoPrioridad sMSolicitadoPrioridad, Tramite tramite, Long idFlujo, Long idPagina, Usuario usuario) throws Exception;

    /**
     * Método que valida el formualrio cinco
     *
     * @version 1.0, 21/01/2015
     * @author chanorojas
     * @param sMSolicitadoPrioridad
     * @param usuario
     * @throws java.lang.Exception
     */
    void eliminaSmSolicitadoPrioridadGeneral(SMSolicitadoPrioridad sMSolicitadoPrioridad, Usuario usuario) throws Exception;

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
     * Método que lista los valores de prioridad
     *
     * @version 1.0, 13/05/2015
     * @author chanorojas
     * @param tramite
     * @return *
     */
    List<SMSolicitadoPrioridad> listaPrioridadPorTramite(Tramite tramite);

    /**
     * Método que lista los valores de preferencia
     *
     * @version 1.0, 13/05/2015
     * @author chanorojas
     * @param tramite
     * @return *
     */
    List<SMSolicitadoPrioridad> listaPreferenciaPorTramite(Tramite tramite);

    /**
     * Método que lista los valores de preferencia
     *
     * @version 1.0, 18/05/2015
     * @author chanorojas
     * @param tramite
     * @param listadoSolicitadoPrioridad
     * @param listadoSolicitadoPreferencia
     * @param usuario
     * @param idflujo
     * @param idPagina
     * @throws java.lang.Exception
     */
    void guardaPreferenciaPrioridaYOposicionAndina(Tramite tramite, List<SMSolicitadoPrioridad> listadoSolicitadoPrioridad, List<SMSolicitadoPrioridad> listadoSolicitadoPreferencia, Usuario usuario, Long idflujo, Long idPagina) throws Exception;

    /**
     * Método que realiza la validacion d los campos de preferencia
     *
     * @version 1.0, 18/05/2015
     * @author chanorojas
     * @param datosPrimerComboPrioridad
     * @param smsolicitadoprioridad
     * @return
     */
    public String[] validaCamposPreferencia(String datosPrimerComboPrioridad, SMSolicitadoPrioridad smsolicitadoprioridad);

    /**
     * Método que realiza la validacion d los campos del formulario de
     * preferencia y validacion del formulario pi100
     *
     * @version 1.0, 19/05/2015
     * @author chanorojas
     * @param activaPrioridad
     * @param activaPreferencia
     * @param listadoSolicitadoPrioridad
     * @param listadoSolicitadoPreferencia
     * @return
     */
    public String[] validaPrioridaYOposicionAndina(String activaPrioridad, String activaPreferencia, List<SMSolicitadoPrioridad> listadoSolicitadoPrioridad, List<SMSolicitadoPrioridad> listadoSolicitadoPreferencia);

    /**
     * Método que realiza la eliminacion de los listados de preferencia y prioridad ligados a un tramite
     * preferencia y validacion del formulario pi100
     *
     * @version 1.0, 19/05/2015
     * @author chanorojas
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    public void eliminaDatosListados(Tramite tramite, Usuario usuario) throws Exception;

}
