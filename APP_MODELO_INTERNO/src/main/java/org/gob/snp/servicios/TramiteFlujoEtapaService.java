package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoRevision;
import org.gob.snp.enums.EnumEtapaTramite;
import org.gob.snp.pojo.FormularioVentanillaPojo;

/**
 * @author Chano Rojas
 * @version 1.0, 02/07/2014
 *
 * <pre>
 * -------------------------------------------------------------------------------------------
 * Interface que realiza las operaciones de la Entidad TramiteFlujoEtapa
 *
 * </pre>
 */
public interface TramiteFlujoEtapaService extends GenericDao<TramiteFlujoEtapa> {

    /**
     * método que permite registrar TramiteFlujoEtapa
     *
     * @param tramiteFlujoEtapa
     * @return TramiteFlujoEtapa
     * @version 1.0, 02/07/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    TramiteFlujoEtapa persistTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa) throws Exception;

    /**
     * método que permite modificar TramiteFlujoEtapa
     *
     * @param tramiteFlujoEtapa
     * @return TramiteFlujoEtapa
     * @version 1.0, 02/07/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    TramiteFlujoEtapa mergeTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa) throws Exception;

    /**
     * método que permite eliminar TramiteFlujoEtapa
     *
     * @param tramiteFlujoEtapa
     * @version 1.0, 02/07/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    void removeTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa) throws Exception;

    /**
     * método que permite listar todos los TramiteFlujoEtapa
     *
     * @return List
     * @version 1.0, 02/07/2014
     * @author Jonathan
     */
    List<TramiteFlujoEtapa> listaTramiteFlujoEtapa();

    /**
     * Método que verifica si existe o no un registro en la tabla
     * TramiteFlujoEtapa, en etapaTramite igual a Examen de Forma
     *
     * @version 1.0, 05/07/2014
     * @author Eddy Valero
     * @param tramite
     * @return Boolean
     */
    Boolean ExisteTramiteFlujoEtapaEnTramite(Tramite tramite);

    /**
     * método que permite llenar los datos de la Plantilla para el Examen de
     * Forma
     *
     * @version 1.0, 08/09/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    void creaExamenDeFormaConDatosDePlantilla(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que permite llenar los datos de la base al
     * pojoFormalarioVentanillaPojo
     *
     * @version 1.0, 09/09/2014
     * @author chanoRojas
     * @param tramite
     * @param codigoTipoRequisito
     * @return listaFormulario
     * @throws java.lang.Exception
     */
    List<FormularioVentanillaPojo> cargaValoresPojoFormularioVentanilla(Tramite tramite, String codigoTipoRequisito) throws Exception;

    /**
     * método que permite unir los tres listados de Minimos, Opcionales y Otros
     *
     * @version 1.0, 09/09/2014
     * @author Henrry Guzman
     * @param listaFormularioVentanillaMinimos
     * @param listaFormularioVentanillaOpcionales
     * @param listaFormularioVentanillaOtros
     * @return List
     */
    
        /**
     * Método que agrupa los listados de ventanilla
     *
     * @param listaFormularioVentanillaMinimos
     * @param listaFormularioVentanillaOpcionales
     * @param listaFormularioVentanillaOtros
     * @param listaFormularioVentanillaAnexos
     * @return List<FormularioVentanillaPojo>
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Henrry Guzman Fecha: 09/09/2014
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 09/09/2014
     * Se agrega la lista listaFormularioVentanillaAnexos, el listado de los anexos,
     * para su almacenamiento y posterior recuperación.
     * 
     * </pre>
     */
    
    List<FormularioVentanillaPojo> unionListaFormularioVentanillaMinimosOpcionalesOtros(List<FormularioVentanillaPojo> listaFormularioVentanillaMinimos, List<FormularioVentanillaPojo> listaFormularioVentanillaOpcionales, List<FormularioVentanillaPojo> listaFormularioVentanillaOtros, List<FormularioVentanillaPojo> listaFormularioVentanillaAnexos);

    /**
     * Método que encuentra el registro de TramiteFlujoEtapa por Tramite
     *
     * @version 1.0, 09/09/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return TramiteFlujoEtapa
     */
    TramiteFlujoEtapa encuentraTramiteFlujoEtapaPorTramite(Tramite tramite);

    /**
     * Método de acuerdo a la plantilla de ingreso de ventanilla, se realiza la
     * insercion o modificacion de registros de las Tablas
     * DatoTramiteVentanillaEForma y ValorTramiteVentanillaEForma
     *
     * @param listaFormularioTramiteVentanilla
     * @param tramite
     * @param tramiteObservacion
     * @param direccionIP
     * @param usuario
     * @return AnalisisEtapa
     * @see AnalisisEtapa
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------
     * Creado: Chano Rojas Fecha: 03/07/2014
     * Descripcion: Almacenamiento y modificacion de registros
     * -------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 17/03/2014
     * Descripcion: Adecuaciones para realizar solamente el almacenamiento de los datos
     * excluyendo la derivacion del flujo
     *
     * -------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 10/04/2014
     * Descripcion: Adecuar el metodo para permitir guardar la observacion del tramite
     * independientemente, de acuerdo a lo Instruido por Orietha Castillo
     * -------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 10/04/2014
     * Descripcion: Agregar los logs de modificacion de registro
     * </pre>
     */
    AnalisisEtapa guardaFormularioVentanillaPojo(List<FormularioVentanillaPojo> listaFormularioTramiteVentanilla, Tramite tramite, String tramiteObservacion, String direccionIP, Usuario usuario) throws Exception;

    /**
     * Método que realiza o modificacion de registros de las Tablas
     * DatoTramiteVentanillaEForma y ValorTramiteVentanillaEForma
     *
     * @param tramite
     * @param registroAnalisisEtapaGeneral
     * @param usuario
     * @see AnalisisEtapa
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------
     * Creado: Chano Rojas Fecha: 03/07/2014
     * Descripcion: Almacenamiento y modificacion de registros
     * -------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 17/03/2014
     * Descripcion: Adecuaciones para realizar solamente el almacenamiento de los datos
     * excluyendo la derivacion del flujo
     *
     * </pre>
     */
    void derivarTramiteFlujoVentanilla(Tramite tramite, AnalisisEtapa registroAnalisisEtapaGeneral, Usuario usuario) throws Exception;

    /**
     * método que permite llenar los datos de la Plantilla par ael Examen de
     * Forma
     *
     * @param tramite
     * @param usuario
     * @param direccionIPCliente
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 08/09/2014
     * Descripcion: Se agrega el metodo existeFecha, responsable de realizar
     * si la fecha ingresada existe
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 26/03/2014
     * Descripcion: Para los casos en los que ya se tiene un registro en Tramite Flujo Etapa
     * se debe crear el registro de AnalisisEtapa y no asi TramiteFlujoEtapa y AnalisisEtapa
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 09/12/2015
     * Descripcion: Se modifica el método que considere el usuario y la direccionIPCliente
     * </pre>
     */
    void creaVentanillaConDatosDePlantilla(Tramite tramite, Usuario usuario, String direccionIPCliente) throws Exception;

    /**
     * método que permite obtener el ultimo usuario que realizo una observacion
     * en cualquie etapa
     *
     * @version 1.0, 19/09/2014
     * @author Eddy Valero
     * @param tramite
     */
    Usuario encuentraUltimoUsuarioAsignadoTramite(Tramite tramite);

    /**
     * método que verifica si debe agregarse los Requisitos Adicionales en el
     * Examen de Forma Forma
     *
     * @version 1.0, 19/09/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     * @throws java.lang.Exception
     */
    Boolean verificaSiSeDebeGuardarLosAdicionales(Tramite tramite) throws Exception;

    /**
     * Método que permite recuperar los Datos Adicionales de un Examen de Forma
     * anterior
     *
     * @version 1.0, 19/09/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     * @throws java.lang.Exception /** método que lista datos adicionales de
     * exfm, si el tramite esta observado recupera adicionales de ventanilla y
     * exfm
     * @param Tramite
     *
     * <pre>
     * ----------------------------------------------------
     *Modificado Por: Susana Escobar Paz
     * Fecha: 08/04/2015
     * Descripcion: método que lista datos adicionales de exfm, si el tramite esta observado recupera adicionales de ventanilla y exfm
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    List<DatoTramiteVentanillaEForma> recuperaDatosAdicionalesDeAnteriorExamenDeForma(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método que permite guardar el listado de formaulario de ingreso
     *
     * @version 1.0, 24/09/2014
     * @author ChanoRojas
     * @param listaFormularioTramiteVentanilla
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    void guardaFormularioVentanillaPojoParaOtros(List<FormularioVentanillaPojo> listaFormularioTramiteVentanilla, Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método que permite recuperar el TramiteFlujoEtapa de un Tramite, este
     * registro contiene la fecha de Ingreso de un determinado Tramite, en este
     * caso el registro corresponde al primer registro que se atiendo en
     * ventanilla
     *
     * @version 1.0, 16/10/2014
     * @author Eddy Valero
     * @param tramite
     * @return TramiteFlujoEtapa
     * @throws java.lang.Exception
     */
    TramiteFlujoEtapa recuperarTramiteFlujoEtapaIngresoTramite(Tramite tramite) throws Exception;

    /**
     * Método que permite verificar si un Tramite ya fue aprobado por los
     * respectivos superiores
     *
     * @param tramite - tramite es el registro que se verificara si ya está
     * aprobado
     * @param flujoEtapa - Es la etapa en la cual se encuentra el registro
     * @param flujo - El flujo es aquel que
     * @return TipoRevision - Verifica en que tipo de Revision se encuentra el
     * tramite enviado: APRO si se aprobó el tramite, REPR si se reprobó el
     * trámite y NREV si aún no sé revisó el Trámite
     */
    TipoRevision verificaElTipoDeRevisionDelTramite(Tramite tramite, FlujoEtapa flujoEtapa, Flujo flujo);

    /**
     * Método que permite verificar si el ultimo de los flujos está aprobado
     *
     * @param tramite - tramite es el registro que se verificara si ya está
     * aprobado
     * @param flujoEtapa - Es la etapa en la cual se encuentra el registro
     * @param flujo - El flujo es aquel que
     * @return Boolean True - si se aprobó el último de los Flujos del Tramite,
     * False caso contrario
     */
    Boolean verificaSiSeAproboElTramite(Tramite tramite, FlujoEtapa flujoEtapa, Flujo flujo);

    /**
     * Método que lista los registros TramiteFlujoEtapa que se hicieron a partir
     * del TramiteFlujoEtapa enviado hasta el que realizó la última etapaTramite
     * enviada
     *
     * @param tramiteFlujoEtapa tramiteFlujoEtapa actual en la que se encuentra
     * el proceso
     * @param etapaTramite EtapaTramite hasta la cual se pretende buscar
     * @return List<TramiteFlujoEtapa> lista resultante de la búsqueda
     */
    List<TramiteFlujoEtapa> listaDeTramiteFlujoEtapaAntecesores(TramiteFlujoEtapa tramiteFlujoEtapa, EtapaTramite etapaTramite);

    /**
     * Método que guarda la observacion que realizó el Superior y se almacena en
     * los tramitesFlujoEtapa de sus dependientes
     *
     * @param tramiteFlujoEtapa tramiteFlujoEtapa actual en la que se encuentra
     * el proceso
     * @param etapaTramite EtapaTramite hasta la cual se pretende buscar
     * @param observacion Observacion realizada por el superior
     * @param concede
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: SD Fecha: SD
     * Descripcion: Se agrega el metodo guardaObservacionAntecesores
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 07/04/2015
     * Descripcion: Se modifica el metodo que considera insertar la observacion
     * en los registros que no seran eliminados
     * en TramiteFlujoEtapa
     * </pre>
     */
    void guardaObservacionAntecesores(TramiteFlujoEtapa tramiteFlujoEtapa, EtapaTramite etapaTramite, String observacion, Boolean concede) throws Exception;

    /**
     * Método encuentra el TramiteFlujoEtapa que fue creado anteriormente
     *
     * @param tramiteFlujoEtapa TramiteFlujoEtapa del cual quiere encontrarse su
     * registro anterior
     * @param etapaTramite es la etapa que deberia existir
     * @return TramiteFlujoEtapa es el tramite que se deberia reutilizar
     * @throws java.lang.Exception
     */
    TramiteFlujoEtapa encuentraTramiteFlujoEtapaAnterior(TramiteFlujoEtapa tramiteFlujoEtapa, EtapaTramite etapaTramite) throws Exception;

    /**
     * método que realiza la derivación a la siguiente etapa a partir de
     * digitalizacion, finalizado el metodo se obtiene el siguiente resultado: -
     * se actualiza el tramite a la siguiente etapa - se actualiza el
     * tramiteflujoetapa actual con la fecha de finalizacion - se inserta un
     * nuevo registro en tramiteflujoetapa con el usuario y la siguiente etapa
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 29/01/2015
     * Descripcion: Se agrega el metodo derivarDigitalizacionSiguienteEtapa
     * ----------------------------------------------------
     * </pre>
     */
    void derivarDigitalizacionSiguienteEtapa(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que realiza la derivación a la siguiente etapa a partir de
     * publicacion, finalizado el metodo se obtiene el siguiente resultado: - se
     * actualiza el tramite a la siguiente etapa - se actualiza el
     * tramiteflujoetapa actual con la fecha de finalizacion - se inserta un
     * nuevo registro en tramiteflujoetapa con el usuario y la siguiente etapa
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 29/01/2015
     * Descripcion: Se agrega el metodo derivarPublicacionSiguienteEtapa
     * ----------------------------------------------------
     * </pre>
     */
    void derivarPublicacionSiguienteEtapa(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que realiza la derivación a la siguiente etapa a partir de
     * publicacion, finalizado el metodo se obtiene el siguiente resultado: - se
     * actualiza el tramite a la siguiente etapa - se actualiza el
     * tramiteflujoetapa actual con la fecha de finalizacion - se inserta un
     * nuevo registro en tramiteflujoetapa con el usuario y la siguiente etapa
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 29/01/2015
     * Descripcion: Se agrega el metodo derivarImpresionTituloSiguienteEtapa
     * ----------------------------------------------------
     * </pre>
     */
    void derivarImpresionTituloSiguienteEtapa(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método para crea derivar siguiente etapa de Registro
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:Susana Escobar  Fecha: 05/02/2015
     * Descripcion:
     * </pre>
     *
     * @param
     * @param usuario
     * @return
     */
    void derivarRegistroSiguienteEtapa(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * metodo para obtener el ultimo tramiteFlujoEtapa del tramite y de acuerdo
     * a la EtapaTramite
     *
     * @param tramite, el tramite ingresado
     * @param etapaTramite, la etapa relacionada
     * @param usuario
     * @return TramiteFlujoEtapa, El objeto que almacena el registro
     * @see EnumEtapaTramite
     * @throws java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 02/02/2015
     * Descripcion: Se agrega el metodo encuentraUltimoTramiteFlujoEtapa
     * ----------------------------------------------------
     * </pre>
     */
    TramiteFlujoEtapa encuentraUltimoTramiteFlujoEtapa(Tramite tramite, EtapaTramite etapaTramite, Usuario usuario) throws Exception;

    /**
     * Método para crear un nuevo AnalisisEtapa con datos asociados de la
     * Plantilla de acuerdo a la tabla RequisitoFlujoVentanillaEForma
     *
     * @param tramite
     * @param tramiteFlujoEtapa
     * @param usuario
     * @return AnalisisEtapa, El objeto que almacena el registro de
     * AnalisisEtapa
     * @see EnumEtapaTramite
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 02/02/2015
     * Descripcion: Se agrega el metodo creaExamenDeFormaConDatosDePlantillaEnAnalisisEtapa
     * -------------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 28/07/2015
     * Descripcion: Se modifica el método para obtener la plantilla agregándole el parametro tipoGenero
     * </pre>
     */
    AnalisisEtapa creaExamenDeFormaConDatosDePlantillaEnAnalisisEtapa(Tramite tramite, TramiteFlujoEtapa tramiteFlujoEtapa, Usuario usuario) throws Exception;

    /**
     * Método que realiza la actualizacion de la fecha de inicio de la etapa de
     * una etapa
     *
     * @param tramite
     * @param usuario
     * @param etapaTramite
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 12/03/2015
     * Descripcion: Se agrega el metodo actualizarFechaInicioUltimoTramiteFlujoEtapaDeEtapa
     * ----------------------------------------------------
     * </pre>
     */
    void actualizarFechaInicioUltimoTramiteFlujoEtapaDeEtapa(Tramite tramite, Usuario usuario, EtapaTramite etapaTramite) throws Exception;

    /**
     * Método que obtiene una plantilla a partir de un determinado flujoEtapa y
     * el tipo de Requisito: MIN u OPC
     *
     * @param flujoEtapa
     * @param usuario
     * @param codigoTipoRequisito
     * @return List<FormularioVentanillaPojo>, el listado con la plantilla
     * armada
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo obtenerRegistrosPlantillaFlujoEtapa
     * ----------------------------------------------------
     * </pre>
     */
    List<FormularioVentanillaPojo> obtenerRegistrosPlantillaFlujoEtapa(FlujoEtapa flujoEtapa, Usuario usuario, String codigoTipoRequisito) throws Exception;

    /**
     * Método que deriva un tramite a su siguiernte etapa partir sin analisis
     * estapa de un determinado flujo Etapa Analisis Etapa
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas Fecha: 29/04/2015
     * ----------------------------------------------------
     * </pre>
     */
    void derivarSiguienteSinAnalisis(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Metodo para modificar la fecha Ingreso de un determinado
     * TramiteFlujoEtapa
     *
     * @param tramiteFlujoEtapa
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 13/05/2015
     * Descripcion: Se agrega el metodo modificarFechaIngreso
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 13/05/2015
     * Descripcion: Se modifica el método para que se actualice la fecha una
     * sola vez en el ingreso del tramite al examen de forma
     * </pre>
     */
    void modificarFechaInicioTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa, Usuario usuario) throws Exception;

    /**
     * método que permite rescatar un listado de tramiteFlujoEtapa por tramite
     *
     * @param tramite
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/05/2015
     * Descripcion: Se agrega el metodo listaTramiteFlujoEtapaPorTramite, que permite rescatar un listado de tramiteFlujoEtapa por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<TramiteFlujoEtapa> listaTramiteFlujoEtapaPorTramite(Tramite tramite, Usuario usuario);

    /**
     * método que permite rescatar un listado de tramiteFlujoEtapa por tramite
     *
     * @param tramite
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Levi Laura
     * Fecha: 13/08/2015
     * Descripcion: Busca tuplas de TramiteFlujoEtapa tomando en cuenta todas las variables como filtros para el reporte por etapas
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    List<TramiteFlujoEtapa> listaTramiteFlujoEtapaFiltros(String regional, Long usuario, String etapaTramite, Date fechaInicio, Date fechaFin);

    /**
     * método que permite rescatar un listado de notificacio
     *
     * @param tramite
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Levi Laura
     * Fecha: 13/08/2015
     * Descripcion: Busca tuplas de Notificacion tomando en cuenta todas las variables como filtros para el reporte por etapas
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    List<Notificacion> listaTramiteFlujoEtapaFiltrosNotificacion(String regional, Long usuario, String etapaTramite, Date fechaInicio, Date fechaFin);

    /**
     * método que permite rescatar un tramiteFlujoEtapa por tramite y etapa
     *
     * @param tramite
     * @param etapa
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 27/08/2015
     * Descripcion: metodo que busca el tramiteFlujoEtapa de un tramite que corresponda a una etapa y no tenga fecha fin
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public TramiteFlujoEtapa encuentraTramiteFlujoEtapaPorTramiteYEtapa(Tramite tramite, EtapaTramite etapa);

    public TramiteFlujoEtapa encuentraUltimoTramiteFlujoEtapaPorTramite(Tramite tramite);

    /**
     * método que permite rescatar un tramiteFlujoEtapa por tramite y etapa
     *
     * @param tramite
     * @param etapa
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Levi Laura
     * Fecha: 04/09/2015
     * Descripcion: Encuentra el registro siguiente en la base de datos TramiteFlujoEtapa dado un idtramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public TramiteFlujoEtapa encuentraSiguienteRegistro(Tramite tramite, Long idTramiteFlujoEtapa);
}
