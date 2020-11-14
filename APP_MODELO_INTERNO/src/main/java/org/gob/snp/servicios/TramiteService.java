package org.gob.snp.servicios;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.DIGArchivoDocumento;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Direccion;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Registro;
import org.gob.snp.entidades.RegistroExistenteEF;
import org.gob.snp.entidades.SMColor;
import org.gob.snp.entidades.SMImagen;
import org.gob.snp.entidades.SMLogotipo;
import org.gob.snp.entidades.SMSignoClaseNiza;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.SMTipoSignoSolicitado;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteUsuario;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoPersonaSolicitud;
import org.gob.snp.entidades.vistas.TipoSolicitante;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.pojo.ArchivoNizaPojo;
import org.gob.snp.pojo.NaturalJuridicoPojo;
import org.gob.snp.pojo.NaturalPoderPojo;

public interface TramiteService extends GenericDao<Tramite> {

    /**
     * método que guarda un nuevo tramite
     *
     * @param tramite
     * @version 1.0, 10/07/2014
     * @author chano
     * @return Tramite
     */
    Tramite persistTramite(Tramite tramite) throws Exception;

    /**
     * método que modifca tramite
     *
     * @param tramite
     * @version 1.0, 10/07/2014
     * @author chano
     * @return Tramite
     */
    Tramite mergeTramite(Tramite tramite) throws Exception;

    /**
     * método que elimina tramite
     *
     * @param tramite
     * @version 1.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeTramite(Tramite tramite) throws Exception;

    /**
     * método que verifica si el numero de ci ya esta registradoe n la base
     *
     * @version 1.0, 10/07/2014
     * @author
     * @return Listtramite
     */
    List<Tramite> listaTramite();

    /**
     * Método para guardar los datos de Identificacion de Solicitante
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param tramite
     * @param smsignomarca
     * @param listSmslogotipo
     * @param listaClasificadorMarca
     * @param listaSmSignoClaseniza
     * @return Tramite
     * @exception Exception
     */
    Tramite guardaIdentificacionSignoDistintivo(Tramite tramite, SMSignoMarca smsignomarca, List<SMLogotipo> listSmslogotipo, List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, List<SMSignoClaseNiza> listaSmSignoClaseniza) throws Exception;

    /**
     * Método para guardar los datos de Identificacion de Solicitante
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param tramite
     * @param smsignomarca
     * @param listSmslogotipo
     * @param listaSMTipoSignoSolicitado
     * @param listaSmSignoClaseniza
     * @return Tramite
     * @exception Exception
     */
    Tramite guardaIdentificacionSignoDistintivoRenovacion(Tramite tramite, SMSignoMarca smsignomarca, List<SMLogotipo> listSmslogotipo, List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, List<SMSignoClaseNiza> listaSmSignoClaseniza) throws Exception;

    /**
     * Método para guardar los datos de Identificacion de Solicitante
     *
     * @version 1.0, 24/07/2014
     * @author Jonathan Valdivia
     * @param tipoSolicitante
     * @param tramite
     * @param listaDatosContactoSolicitante
     * @param persona
     * @param empresa
     * @param usuario
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardaIdentificacionSolicitanteRegistro(TipoSolicitante tipoSolicitante, Tramite tramite, List<DatosContacto> listaDatosContactoSolicitante, Persona persona, Empresa empresa, Usuario usuario) throws Exception;

    /**
     * Método para guardar los datos de Identificacion de Solicitante
     *
     * @version 1.0, 24/07/2014
     * @author Jonathan Valdivia
     * @param tipoSolicitante
     * @param tramite
     * @param listaDatosContactoSolicitante
     * @param persona
     * @param empresa
     * @param usuario
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardaIdentificacionSolicitanteRegistroParaRenovacion(TipoSolicitante tipoSolicitante, Tramite tramite, List<DatosContacto> listaDatosContactoSolicitante, Persona persona, Empresa empresa, Usuario usuario) throws Exception;

    /**
     * Método para encontrar un Tramiteusuario segun su tramite
     *
     * @version 1.0, 24/07/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return *
     */
    TramiteUsuario encuentraTramiteUsuarioPorTramite(Tramite tramite);

    /**
     * Método activa boton para la carga de datos del formulario primera pestaña
     * de solicitud de Usuarios
     *
     * @version 1.0, 17/07/2014
     * @author Henrry Guzman
     * @param tipoSolicitante
     * @param numeroDocumento
     * @return String
     * @throws java.lang.Exception
     */
    Boolean activaBotonCargaObjeto(String tipoSolicitante, String numeroDocumento) throws Exception;

    /**
     * Método verifica datos del formulario tanto para guaradar o modificar
     * primera pestaña de solicitud de Usuarios
     *
     * @version 2.0, 29/07/2014
     * @author Henrry Guzman
     * @param tipoSolicitante
     * @param numeroDocumento
     * @param listaDatosDeContacto
     * @param persona
     * @param empresa
     * @return Boolean
     * @throws java.lang.Exception
     */
    Boolean primeraParteVerificaAntesDeGuardarOModificar(String tipoSolicitante, String numeroDocumento, List<DatosContacto> listaDatosDeContacto, Persona persona, Empresa empresa) throws Exception;

    /**
     * método que permite verificar si en un listado de Datos contacto existe
     * una dirección
     *
     * @version 1.0, 17/07/2014
     * @author Jonathan Valdivia
     * @param listaDeDatosContacto
     * @return
     * @throws java.lang.Exception
     *
     */
    Boolean tieneDireccion(List<DatosContacto> listaDeDatosContacto) throws Exception;

    /**
     * método que permite verificar si en un listado de Datos contacto existe
     * una dirección
     *
     * @version 1.0, 17/07/2014
     * @author Chanorojas
     * @param listaDeDatosContacto
     * @return
     * @throws java.lang.Exception
     *
     */
    Boolean tieneDireccionYCorreo(List<DatosContacto> listaDeDatosContacto) throws Exception;

    /**
     * Método envia mensaje de error validaciones primera pestaña de solicitud
     * de Usuarios
     *
     * @version 1.0, 17/07/2014
     * @author Henrry Guzman
     * @param tipoSolicitante
     * @param numeroDocumento
     * @param listaDatosDeContacto
     * @return String
     * @throws java.lang.Exception
     */
    String enviaMensajeDeError(String tipoSolicitante, String numeroDocumento, List<DatosContacto> listaDatosDeContacto) throws Exception;

    /**
     * metodo modifica Tramite Web para solicitud usuario para el Bean
     *
     * @version 1.0, 22/07/2014
     * @author Henrry Guzman
     * @param tipoSolicitante
     * @param numeroDocumento
     * @param listaDatosDeContacto
     * @param persona
     * @param empresa
     * @return Boolean
     * @throws java.lang.Exception
     */
    Boolean modificaPrimeraParte(String tipoSolicitante, String numeroDocumento, List<DatosContacto> listaDatosDeContacto, Persona persona, Empresa empresa) throws Exception;

    /**
     * metodo valida para la confirmacion de la modificacion Tramite Web para
     * solicitud usuario
     *
     * @version 1.0, 22/07/2014
     * @author Henrry Guzman
     * @param numeroDocumento
     * @param listaDatosDeContacto
     * @param persona
     * @return Boolean
     * @throws java.lang.Exception
     */
    Boolean segundaParteVerificaAntesDeGuardarOModificar(String numeroDocumento, List<DatosContacto> listaDatosDeContacto, Persona persona) throws Exception;

    /**
     * Método activa boton para la carga de datos del formulario segunda pestaña
     * de solicitud de Usuarios
     *
     * @version 1.0, 17/07/2014
     * @author Henrry Guzman
     * @param numeroDocumento
     * @param persona
     * @return String
     * @throws java.lang.Exception
     */
    Boolean activaBotonCargaObjetoPestaniaDos(String numeroDocumento, Persona persona) throws Exception;

    /**
     * Método envia mensaje de error validaciones segunda pestaña de solicitud
     * de Usuarios
     *
     * @version 1.0, 22/07/2014
     * @author Henrry Guzman
     * @param numeroDocumento
     * @param listaDatosDeContacto
     * @param persona
     * @return String
     * @throws java.lang.Exception
     */
    String enviaMensajeDeErrorPestaniaDos(String numeroDocumento, List<DatosContacto> listaDatosDeContacto, Persona persona) throws Exception;

    /**
     * Método habilita registro de datos de contacto primera pestaña de
     * solicitud de Usuarios
     *
     * @version 1.0, 29/07/2014
     * @param tipoSolicitante
     * @param etapa
     * @param tramite
     * @param persona
     * @param empresa
     * @return String
     */
    Boolean habilitaPermisosParaListadoDatosContactoModificaElimina(String tipoSolicitante, String etapa, Tramite tramite, Persona persona, Empresa empresa);

    /**
     * Método valida existencia de clasifiacdores tercera pestaña de solicitud
     * de Usuarios
     *
     * @version 1.0, 04/08/2014
     * @param listaSMTipoSignoSolicitado
     * @return Boolean
     */
    Boolean validaGuardadoYModificadoTerceraPestania(List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado);

    /**
     * Método lista de tramite para usuarios externos con estado USU
     *
     * @param usuario
     * @return List tramite
     *
     * <pre>
     * -----------------------------------------------------
     * Creado: Henrry Guzman  Fecha: 05/08/2014
     * Descripcion: crear el metodo listaTramiteUsuarioExterno
     * -----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 18/11/2015
     * Descripción: Modificación de la consulta, que considere el índice creado en TramiteUsuario.
     * -----------------------------------------------------
     * </pre>
     */
    List<Tramite> listaTramiteUsuarioExterno(Usuario usuario);

    /**
     * Método para guardar los datos de Identificacion de Representante
     *
     * @version 1.0, 04/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @param apoderado
     * @param personaApoderado
     * @param listaDatosDeContactoRepresentante
     * @return
     */
    Tramite guardaIdentificacionRepresentanteRegistro(Tramite tramite, Poder apoderado, Persona personaApoderado, List<DatosContacto> listaDatosDeContactoRepresentante);

    /**
     * Método para guardar Renovacion los datos de Identificacion de
     * Representante
     *
     * @version 1.0, 17/10/2014
     * @author chanoRojas
     * @param tramite
     * @param apoderado
     * @param personaApoderado
     * @param listaDatosDeContactoRepresentante
     * @return
     */
    Tramite guardaIdentificacionRepresentanteRegistroRenovacion(Tramite tramite, Poder apoderado, Persona personaApoderado, List<DatosContacto> listaDatosDeContactoRepresentante);

    /**
     * Método para recuperar el apoderado segun el tramite
     *
     * @version 1.0, 04/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     */
    Poder recuperaApoderadoPorTramite(Tramite tramite);

    /**
     * Método para guardar los datos de Direccion Formulario Direccion de
     * Notificacion
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param tramite
     * @param listaDireccion
     * @param usuario
     * @param idFlujo
     * @param idPagina
     * @return Tramite
     * @exception Exception
     */
    Tramite guardaDireccionNotificacion(Tramite tramite, List<Direccion> listaDireccion, Usuario usuario, Long idFlujo, Long idPagina) throws Exception;

    /**
     * Método para recuperar la empresa segun el tramite
     *
     * @version 1.0, 05/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     */
    PersonaEmpresaTramite recuperaPersonaEmpresaTramitePorTramite(Tramite tramite);

    /**
     * Método para recuperar todos los Tramites que se encuentren en la etapa de
     * Ventanilla
     *
     * @version 1.0, 10/08/2014
     * @author Jonathan Valdivia
     * @return
     */
    List<Tramite> recuperaTramitesEnVentanilla();

    /**
     * Método para recuperar todos los Tramites que se encuentren en la etapa de
     * Ventanilla
     *
     * @version 1.0, 10/08/2014
     * @author Jonathan Valdivia
     * @param codigo
     * @param tipoPersona
     * @param tipoTramite
     * @return
     */
    List<Tramite> buscaTramitePorParametrosParaVentanilla(String codigo, String tipoPersona, String tipoTramite);

    void metodoAutomaticoParaPestaniaTres(Tramite tramite);

    /**
     * Método que elimina los datos del apoderado si es que no tiene dependiente
     *
     * @version 1.0, 10/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     */
//    void eliminaDatosPestaniaDos(Tramite tramite);
    /**
     * Método que realiza la busqueda especial de tramites
     *
     * @version 1.0, 10/08/2014
     * @author Jonathan Valdivia
     * @param usuario
     * @param fechaFinalSolicitud
     * @param fechaInicialSolicitud
     * @param tipoTramiteSolicitud
     * @param codigo
     * @return list Tramite
     *
     */
    List<Tramite> listaFiltradoUsuarioExterno(Usuario usuario, Date fechaInicialSolicitud, Date fechaFinalSolicitud, String tipoTramiteSolicitud, String codigo);

    /**
     * Método que elimina completamente un tramite que ya no será usado por el
     * Usuario Externo
     *
     * @version 1.0, 15/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @throws java.lang.Exception
     */
    void eliminaTramite(Tramite tramite) throws Exception;

    /**
     * Método que realiza el guardado de las solicitudes
     *
     * @version 1.0, 15/08/2014
     * @author chano
     * @param tramite
     *
     */
    void guardaSolicitudFinal(Tramite tramite);

    /**
     * Método que realiza el codigo dia segun el tipo de tramite
     *
     * @version 1.0, 15/08/2014
     * @author chano
     * @param tipoTramite
     * @return String
     *
     */
    String generaCodigoTramite(TipoTramite tipoTramite);

    /**
     * Método que realiza el guardado de ventanilla
     *
     * @version 1.0, 15/08/2014
     * @author chano
     * @param tramite
     * @throws java.lang.Exception
     *
     */
    void guardaTramiteVentanilla(Tramite tramite) throws Exception;

    /**
     * Metodo para navegar entre las diferentes solicitudes segun el tipo de
     * Tramite
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     *
     */
    String direccionaASolicitudSegunTramite(Tramite tramite);

    /**
     * Retorna la posicion de la pestaña a la
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     *
     */
    int retornaPestaniaANavegar(Tramite tramite);

    /**
     * Método verifica si existe o no el usuario solicitante, de acuerdo al
     * usuario solicitado o no
     *
     * @version 1.0, 20/08/2014
     * @author Eddy Valero
     * @param tipoSolicitante
     * @param numeroDocumento
     * @param persona
     * @param empresa
     * @return Boolean
     * @throws java.lang.Exception
     */
    Boolean verificarExistenciaSolicitanteBaseDatos(String tipoSolicitante, String numeroDocumento, Persona persona, Empresa empresa) throws Exception;

    /**
     * Método envia mensaje de error en caso que el usuario solicitante no
     * exista
     *
     *
     * @version 1.0, 20/08/2014
     * @author Eddy Valero
     * @param tipoSolicitante
     * @param numeroDocumento
     * @return String
     * @throws java.lang.Exception
     */
    String enviaMensajeVerificarExistenciaSolicitanteBaseDatos(String tipoSolicitante, String numeroDocumento) throws Exception;

    /**
     * Método verifica que el usuario solicitante tiene registros de datos de
     * contacto primera pestaña de solicitud de Usuarios
     *
     * @version 1.0, 20/08/2014
     * @author Eddy Valero
     * @param listaDatosDeContacto
     * @return Boolean
     * @throws java.lang.Exception
     */
    Boolean verificarDatosContactoSolicitante(List<DatosContacto> listaDatosDeContacto) throws Exception;

    /**
     * Método que envia un mensaje en caso de que no se encuentre datos contacto
     * del Usuario Solicitante primera pestaña de solicitud de Usuarios
     *
     * @version 1.0, 20/08/2014
     * @author Eddy Valero
     * @param listaDatosDeContacto
     * @return Boolean
     * @throws java.lang.Exception
     */
    String enviaMensajeverificarDatosContactoSolicitante(List<DatosContacto> listaDatosDeContacto) throws Exception;

    /**
     * Método que genera un codigo de modificacion
     *
     * @version 1.0, 21/08/2014
     * @author chano
     * @param tramite
     * @return String
     */
    String generaCodigoModificacion(Tramite tramite);

    /**
     * Método que guarda un tramite con un codigo correlativo
     *
     * @version 1.0, 21/08/2014
     * @author chano
     * @param tramite
     */
    void guardaModificadoFinal(Tramite tramite);

    /**
     * Método que modifica el estado de un tramite a estado USU
     *
     * @version 1.0, 21/08/2014
     * @author chano
     * @param tramite
     */
    void guardaModificadoFormularios(Tramite tramite);

    /**
     * Método valida existencia de Clasificadores activados
     * Figurativo,Tridimensional y Auditivo para obligar al usuario al cargado
     * de imagen
     *
     * @version 1.0, 26/09/2014
     * @author Henrry Guzman
     * @param listaSMTipoSignoSolicitado
     * @param smslogotipoList
     * @param smslogotipo
     * @return boolean
     */
    Boolean validaImagenPorSMTipoSignoSolicitadoTerceraPestania(List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, List<String> smslogotipoList, SMLogotipo smslogotipo);

    /**
     * Método valida existencia de Clasificadores activados
     * Figurativo,Tridimensional y Auditivo para obligar al usuario al cargado
     * de imagen
     *
     * @version 1.0, 19/12/2014
     * @author Henrry Guzman
     * @param listaClasificador
     * @param smImagenList
     * @param smslogotipo
     * @return boolean
     */
    Boolean validaImagenPorSMTipoSignoSolicitadoTerceraPestaniaOriginal(List<SMTipoSignoSolicitado> listaClasificador, List<SMImagen> smImagenList, SMSignoMarca mSignoMarca);

    /**
     * Método muestra mensaje para el metodo valida
     * validaImagenPorClasificadorMarcaTerceraPestania.
     *
     * @version 1.0, 26/09/2014
     * @author Henrry Guzman
     * @param listaSMTipoSignoSolicitado
     * @param smslogotipoList
     * @param smslogotipo
     * @return String
     */
    String validaImagenPorSMTipoSignoSolicitadoTerceraPestaniaMensajes(List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, List<String> smslogotipoList, SMLogotipo smslogotipo);

    /**
     * Método muestra mensaje para el metodo valida
     * validaImagenPorClasificadorMarcaTerceraPestania.
     *
     * @version 1.0, 19/12/2014
     * @author Henrry Guzman
     * @param listaClasificador
     * @param smsImagenList
     * @param smslogotipo
     * @return String
     */
    String validaImagenPorSMTipoSignoSolicitadoTerceraPestaniaMensajesOriginal(List<SMTipoSignoSolicitado> listaClasificador, List<SMImagen> smsImagenList, SMSignoMarca sMSignoMarca);

    /**
     * Método valida existencia de ClaseInternacionalNiza y su descripcion.
     *
     * @version 1.0, 26/09/2014
     * @author Henrry Guzman
     * @param numeroInternacional
     * @param listaProductosTextArea
     * @return boolean
     */
    Boolean validaClaseInternacionalNizaTerceraPestania(String numeroInternacional, String listaProductosTextArea);

    /**
     * Método muestra mensaje para el metodo valida
     * validaClaseInternacionalNizaTerceraPestania.
     *
     * @version 1.0, 26/09/2014
     * @author Henrry Guzman
     * @param numeroInternacional
     * @param listaProductosTextArea
     * @return String
     */
    String validaClaseInternacionalNizaTerceraPestaniaMensajes(String numeroInternacional, String listaProductosTextArea);

    /**
     * Método que genera un codigo correlativo por area
     *
     * @version 1.0, 16/09/2014
     * @author chanoRojas
     * @return String
     * @param tipoTramite
     * @param usuario
     */
    String generaCodigoTramiteVentanilla(TipoTramite tipoTramite, Usuario usuario);

    /**
     * Método para guardar los datos de Direccion Formulario Direccion de
     * Notificacion
     *
     * @version 1.0, 22/10/2014
     * @author Eddy Valero
     * @param tramite
     * @param direccion
     * @return Tramite
     * @exception Exception
     */
    Tramite guardaDireccionNotificacionObjeto(Tramite tramite, Direccion direccion) throws Exception;

    /**
     * método que envia el mensaje Validación en el caso de no tener dirección o
     * Correo Electronico
     *
     * @version 1.0, 25/09/2014
     * @author Jonathan Valdivia
     * @param listaDeDatosContacto
     * @return
     * @throws java.lang.Exception
     *
     */
    String mensajeSiTieneDireccionYCorreoElectronico(List<DatosContacto> listaDeDatosContacto) throws Exception;

    /**
     * método que envia el mensaje Validación en el caso de no tener dirección o
     * Correo Electronico
     *
     * @version 1.0, 25/09/2014
     * @author Jonathan Valdivia
     * @param listaDeDatosContacto
     * @return
     * @throws java.lang.Exception
     *
     */
    String mensajeSiTieneDireccionYCorreoElectronicoApoderado(List<DatosContacto> listaDeDatosContacto) throws Exception;

    /**
     * Retorna la ultima pagina que se modifico
     *
     * @version 1.0, 29/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     *
     */
    String retornaAPestaniaParaCompletar(Tramite tramite);

    /**
     * Retorna una lista por Region
     *
     * @version 1.0, 02/10/2014
     * @author chanoRojas
     * @param regional
     * @return
     *
     */
    List<Tramite> listadoTramitePorRegion(Regional regional);

    /**
     * Método para recuperar el Tramite de acuerdo a un Codigo SM introducido
     *
     * @version 1.0, 16/10/2014
     * @author Eddy Valero
     * @param SM Codigo SM introducido
     * @param analisisEtapa
     * @return Tramite
     * @exception Exception
     */
    Tramite recuperaTramitePorSM(String SM, AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * Método para guardar tramite regsitro publicacion
     *
     * @version 1.0, 21/10/2014
     * @author chanoRojas
     * @param tramite
     * @param registro
     * @param publicacion
     * @exception Exception
     */
    void guardaTramiteRegistroYPublicacionTramiteRenovacion(Tramite tramite, Registro registro, Publicacion publicacion) throws Exception;

    /**
     * Método para guardar tramite regsitro publicacion
     *
     * @version 1.0, 21/10/2014
     * @author chanoRojas
     * @param tramite
     * @param apoderado
     * @param personaApoderado
     * @param listaDatosDeContactoRepresentante
     * @return
     * @exception Exception
     */
    Tramite guardaIdentificacionRepresentanteRegistroRenovacionModificadoApoderado(Tramite tramite, Poder apoderado, Persona personaApoderado, List<DatosContacto> listaDatosDeContactoRepresentante) throws Exception;

    /**
     * Método para recuperar el Tramite de acuerdo al analisisEtapa Introducido
     *
     * @version 1.0, 05/11/2014
     * @author Eddy Valero
     * @param analisisEtapa a partir de este analisis se recuperara el
     * analisisEtapa
     * @return Tramite
     * @exception Exception
     */
    Tramite recuperaTramitePorAnalisisEtapa(AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * Método para listar los Tramites existentes en un eliminaTramite
     * ListadoDeRegistrosExistentesEF
     *
     * @version 1.0, 07/11/2014
     * @author Jonathan Valdivia
     * @param listaRegistrosExistentesEF
     * @return
     * @exception Exception
     */
    List<Tramite> listaTramitesPorRegistrosExistenteEF(List<RegistroExistenteEF> listaRegistrosExistentesEF) throws Exception;

    /**
     * Método para listar los Tramites existentes en un
     * ListadoDeRegistrosExistentesEF
     *
     * @version 1.0, 07/11/2014
     * @author roco
     * @param usuario
     * @param codigoSm
     * @return
     * @exception Exception
     */
    Tramite obtieneTramiteParaRecaudacion(Usuario usuario, String codigoSm) throws Exception;

    /**
     * Método que valida los campos de un formualrio de registro de solcitante
     * Juridico controlando si todos los parametros estan vacion o existe por lo
     * menos un campo lleno
     *
     * @param numeroDocumento
     * @param empresa
     * @param tipoDocumentoIdentidad
     * @param paisNacionalidad
     * @param lugarExpedicion
     * @param domicilio
     * @return Boolean[]
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Roberto Santibañez  Fecha: 07/11/2014
     * Descripcion: crear el metodo validaCamposJuridico
     * ---------------------------------------------
     * Modificado: Eddy Valero Fecha: 15/06/2015
     * Descripción: Ya no se validara que para el tipo de documento NIT para un solicitante juridico, sea necesario
     * registrar un lugar de expedición, comentando ese bloque de validacion.
     * ---------------------------------------------
     * Modificado: Eddy Valero Fecha: 13/10/2015
     * Descripción: Se agrega el campo Domicilio para realizar la validación
     * </pre>
     */
    Boolean[] validaCamposJuridico(String numeroDocumento, Empresa empresa, String tipoDocumentoIdentidad, String lugarExpedicion, String paisNacionalidad, String domicilio);

    /**
     * Método que valida los campos de un formualrio de registro de solcitante
     * Natural controlando si todos los parametros estan vacion o existe por
     * lomenos un campo lleno
     *
     * @param numeroDocumento
     * @param persona
     * @param tipoDocumentoIdentidad
     * @param lugarExpedicion
     * @param paisNacionalidad
     * @param domicilio
     * @return Boolean[]
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Roberto Santibañez  Fecha: 07/11/2014
     * Descripcion: crear el metodo validaCamposNatural
     * ---------------------------------------------
     * Modificado: Eddy Valero Fecha: 15/06/2015
     * Descripción: Ya no se validara que para el tipo de documento NIT para un solicitante juridico, sea necesario
     * registrar un lugar de expedición, comentando ese bloque de validacion.
     * ---------------------------------------------
     * Modificado: Eddy Valero Fecha: 13/10/2015
     * Descripción: Se agrega el campo domicilio para realizar la validación
     * </pre>
     */
    Boolean[] validaCamposNatural(String numeroDocumento, Persona persona, String tipoDocumentoIdentidad, String lugarExpedicion, String paisNacionalidad, String domicilio);

    /**
     * Método que encuentra el listado de persona empresatramite por tramite
     *
     * @version 1.0, 19/11/2014
     * @author chanoRojas
     * @param tramite
     * @return
     */
    List<PersonaEmpresaTramite> recuperaListaPersonaEmpresaTramitePorTramite(Tramite tramite);

    /**
     * Método para guardar los datos de Identificacion de Solicitante oersona
     * empresa con varios titulares
     *
     * @version 1.0, 17/11/2014
     * @author chanoRojas
     * @param tipoSolicitante
     * @param tramite
     * @param listaDatosContactoSolicitante
     * @param persona
     * @param empresa
     * @param flujo
     * @param idPagina
     * @param usuario
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardaIdentificacionSolicitanteRegistroGeneral(TipoSolicitante tipoSolicitante, Tramite tramite, List<DatosContacto> listaDatosContactoSolicitante, Persona persona, Empresa empresa, Flujo flujo, Long idPagina, Usuario usuario) throws Exception;

    /**
     * Método para listar apoderados que pertenecen a un tramite Método para
     * listar un unico apoderado que este relacionado a uno o muchos tramites.
     *
     * @version 1.0, 17/11/2014 , 1.1, 19/12/2014
     * @author chanoRojas, RobertoSantivañez
     * @param tramite
     * @param idUsuario
     * @return List
     *
     */
    List<Poder> recuperaListaApoderosPorTramite(Tramite tramite, Long idUsuario);

    /**
     * Metodo que permite guardar varios apoderados y crear tramite, expediente,
     * tramite usuario,personaEmpresa cuanod no existe
     *
     * @version 1.0, 25/11/2014
     * @author chanoRojas
     * @param tramite
     * @param usuario
     * @param apoderado
     * @param listaDatosDeContactoRepresentante
     * @param personaApoderado
     * @param flujo
     * @param direccionIPCliente
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardaIdentificacionRepresentanteRegistroGeneral(Tramite tramite, Usuario usuario, Poder apoderado, Persona personaApoderado, List<DatosContacto> listaDatosDeContactoRepresentante, Flujo flujo, String direccionIPCliente) throws Exception;

    /**
     * Método para eliminar los solicitantes persona o empresa meintras no esten
     * ligados a algun tramite o bloqueados
     *
     * @version 1.0, 20/11/2014
     * @author chanoRojas
     * @param tramite
     * @param persona
     * @param empresa
     * @param usuario
     * @throws java.lang.Exception
     */
    void eliminaPersonaEmpresaTramite(Tramite tramite, Persona persona, Empresa empresa, Usuario usuario) throws Exception;

    /**
     *
     * @version 1.0, 20/11/2014 modificado 27/12/2014
     * @author chanoRojas
     * @param tramite
     * @param personaEmpresaTramite
     * @param idUsuario
     * @throws java.lang.Exception
     */
    void eliminaApoderadoTramite(Tramite tramite, PersonaEmpresaTramite personaEmpresaTramite, Long idUsuario) throws Exception;

    /**
     * Metodo que permite crear un tramite, usuarioTramite y Expediente
     *
     * @version 1.0, 25/11/2014
     * @author chanoRojas
     * @param tramite
     * @param usuario
     * @param tipoTramite
     * @param idFlujo
     * @return
     * @throws java.lang.Exception
     */
    Tramite creaTramiteUsuarioTramiteYExpediente(Tramite tramite, Usuario usuario, TipoTramite tipoTramite, Long idFlujo) throws Exception;

    /**
     * Método para guardar la tercera pestaña en el refistro pi100
     *
     * @version 1.0, 10/12/2014
     * @author chanoRojas
     * @param tramite
     * @param smsignomarca
     * @param listImagenes
     * @param listaSMTipoSignoSolicitado
     * @param listArchivoPojo
     * @param listaSmColor
     * @param idFlujo
     * @param idPagina
     * @param usuario
     * @param documento
     * @param dIGArchivoDocumentoTXT
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardaIdentificacionSignoDistintivoGeneral(Tramite tramite, SMSignoMarca smsignomarca, List<SMImagen> listImagenes, List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, List<ArchivoNizaPojo> listArchivoPojo, List<SMColor> listaSmColor, Long idFlujo, Long idPagina, Usuario usuario, Documento documento, DIGArchivoDocumento dIGArchivoDocumentoTXT) throws Exception;

    /**
     * Método para validar los campos de nombre de diseño, tipo de diseño,
     * imagen, color, descripcion,clase niza de una marca
     *
     * @version 1.0, 19/12/2014
     * @author RobertoSantivañez
     * @param mSignoMarca
     * @param listaClasificador
     * @param listaImagenLogotipos
     * @param listaColores
     * @param listaSignoClaseNiza
     * @return
     * @throws java.lang.Exception
     */
    public Boolean[] validaCamposSignoDistintivo(SMSignoMarca mSignoMarca, List<SMTipoSignoSolicitado> listaClasificador, List<SMImagen> listaImagenLogotipos, List<String> listaColores, List<SMSignoClaseNiza> listaSignoClaseNiza) throws Exception;

    /**
     * Método para validar los campos de nombre de diseño, tipo de diseño,
     * imagen, color, descripcion,clase niza de una marca
     *
     * @version 1.0, 19/12/2014
     * @author RobertoSantivañez
     * @param tramite
     * @param direccion
     * @param usuario
     * @param idFlujo
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardaDireccionNotificacionObjetoGeneral(Tramite tramite, Direccion direccion, Usuario usuario, Long idFlujo) throws Exception;

    /**
     * Método para guradar el tramite con la descripcion unipersonal
     *
     * @version 1.0, 24/12/2014
     * @author chanoRojas
     * @param tramite
     * @param usuario
     * @param flujo
     * @param idPagina
     * @return tramite
     * @throws java.lang.Exception
     */
    Tramite guardaTramiteUnipersonalGeneral(Tramite tramite, Usuario usuario, Flujo flujo, Long idPagina) throws Exception;

    /**
     * Método transaccional responsable de la eliminación de un tramite
     * solicitado.
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 15/01/2015
     * Descripcion: Se debe eliminar todos los items asociados al tramite,
     * se inicia por los registros de SMSignoMarca y finalmente se realiza
     * la eliminacion de la persona
     * y el apoderado asociados siempre y cuando corresponda la eliminación
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    void eliminarSolicitudRegistroSignoDistintivo(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método transaccional responsable de eliminar apoderados ligados a un
     * tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas Fecha: 27/01/2015
     * Descripcion: Se debe eliminar todos los items de apoderado ligados a un tramite,
     * por si el usuario decide modificar el tipo de registro de apoderado por unipersonal
     * es por ello que se eliminaria registros existentes de la base
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    void guardaTramiteDesligandoApoderado(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método transaccional responsable de eliminar apoderados ligados a un
     * tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas Fecha: 29/01/2015
     * Descripcion: ctualiza la etapa validacion a uno cuando se guarda el formulario de la pagina en el flujo ntramite que se esta utilizando la pagina
     * </pre>
     *
     * @param tramite
     * @param flujo
     * @param idPagina
     * @param usuario
     * @return
     */
    Tramite actualizaEtapaValidacion(Tramite tramite, Flujo flujo, Long idPagina, Usuario usuario);

    /**
     * Método responsable de crear el binario en el campo etapa validacion para
     * controlar el guardado de las paginas por tipo de flujo o tipo de
     * solicitud
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas Fecha: 29/01/2015
     * Descripcion:
     * </pre>
     *
     * @param tramite
     * @param flujo
     * @param idPagina
     * @param usuario
     * @return
     */
    Tramite llenaCamposNumeroPaginasEtapaValidacionPorTramite(Tramite tramite, Flujo flujo, Long idPagina, Usuario usuario);

    /**
     * Método responsable de verificar si el formulario de registro esta
     * completado
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas Fecha: 29/01/2015
     * Descripcion:
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @return
     */
    Boolean verificaTipoSolicitudRegistradaTotalmente(Tramite tramite, Usuario usuario);

    /**
     * Método responsable de crear el binario en el campo etapa validacion para
     * controlar el guardado de las paginas por tipo de flujo o tipo de
     * solicitud
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas Fecha: 29/01/2015
     * Descripcion:
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @return
     * @throws java.lang.Exception
     */
    Tramite guardarTramiteYGeneraCorrelativo(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método responsable de actualizar el binario por modificacion de nombre o
     * direccion en el campo etapa validacion para controlar el guardado de las
     * paginas por tipo de flujo o tipo de solicitud
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas Fecha: 29/01/2015
     * Descripcion:
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @return
     */
    Tramite actualizaEtapaValidacionModificacionNombreYDireccion(Tramite tramite, Usuario usuario);

    /**
     * método que permite crear un nuevo tramite para el tramite de Modificacion
     * de Nombre y Direccion
     *
     * @param tramiteAModificar
     * @param usuario
     * @param flujoBase
     * @param direccionIPCliente
     * @return Tramite      <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 05/02/2015
     * Descripcion: Se agrega el metodo creaTramiteUsuarioTramite que adiciona registros en las tablas Tramite, TramiteUsuario.
     * ----------------------------------------------------
     * Modificado Por: Susana Escobar Paz               Fecha: 29/09/2015
     * Descripcion: Modificacion de metodo encargado de la creacion de tramite para modificacion de nombre y direccion
     * </pre>
     *
     * @throws java.lang.Exception
     */
    Tramite creaTramiteUsuarioTramite(Tramite tramiteAModificar, Usuario usuario, Flujo flujoBase, String direccionIPCliente) throws Exception;

    /**
     * método que permite eliminar un tramite para el tramite de Modificacion de
     * Nombre y Direccion
     *
     * @param tramite
     * @param usuario
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 05/02/2015
     * Descripcion: Se agrega el metodo eliminarSolicitudModificacion que elimina registros en las tablas Tramite, TramiteUsuario, Apoderado, Persona, DatosContacto, Direccion, asociados aun tramite de modificacion.
     * ----------------------------------------------------
     * Modificado: Susana Escobar Paz   Fecha: 26/06/2015
     * Descripcion: El metodo de eliminacion debe eliminar tambien los, datos contactos creados, Adecuaciones para eliminar tambien datos contactos
     * </pre>
     *
     * @throws java.lang.Exception
     */
    void eliminarSolicitudModificacion(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método para encontrar el nombre de tramite segun tipo tramite y tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas02  Fecha: 12/02/2015
     * Descripcion:
     * </pre>
     *
     * @param tramite
     *
     * @return tramite
     * @throws java.lang.Exception
     */
    String encuentraNombrePorTramiteYtipoTramite(Tramite tramite) throws Exception;

    /**
     * método que permite listar registros de las tablas Tramite y
     * PublicacionTramite
     *
     * @param Usuario
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 26/02/2015
     * Descripcion: Se agrega el metodo listaTramitesPorPublicacion, que lista registros en etapa de Publicacion que no s eencuentren en PublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<Tramite> listaTramitesPorPublicacion(Usuario usuario);

    /**
     * Método responsable de verificar si el formulario de registro esta
     * completado y si existe el codigo dia
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:Susana Escobar
     * Fecha: 07/05/2015
     * Descripcion:
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @return
     */
    Boolean verificaSolicitudConcluidaYCodDia(Tramite tramite, Usuario usuario);

    /**
     * Método que saca los tramites asociados a un expediente mediante in
     * idExpediente d etipo Long
     *
     * @param idExpediente
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:Levi Laura
     * Fecha: 07/05/2015
     * Descripcion:
     * </pre>
     *
     *
     */
    List<Tramite> listaTramitesPorExpediente(Long idExpediente);

    /**
     * Método que obtiene un Tramite de acuerdo a un SM determinado
     *
     * @param codigoSM
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:Eddy Valero Fecha: 08/06/2015
     * Descripcion: creacion del método obtenerTramitePorCodigoSM
     * </pre>
     *
     * @throws java.lang.Exception
     *
     */
    Tramite obtenerTramitePorCodigoSM(String codigoSM, Usuario usuario) throws Exception;

    /**
     * Método que valida el campo codigoSM introducido
     *
     * @param codigoSM
     * @param usuario
     * @return
     *
     * <pre>
     * -------------------------------------------------------------
     * Creado:Eddy Valero Fecha: 08/06/2015
     * Descripcion: creacion del método validaCamposObtenerTramiteSM
     * </pre>
     *
     */
    public Boolean[] validaCamposObtenerTramiteSM(String codigoSM, Usuario usuario);

    /**
     * método que permite inicializar el campo etapa validacion para tramite de
     * Modificacion de Nombre y Direcion
     *
     * @param tramite
     * @param usuario
     * @return Tramite      <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 25/06/2015
     * Descripcion: Se agrega el metodo inicializaEtapaValidacionModificacionNombreYDireccion que permite inicializar el campo etapa validacion para tramite de Modificacion de Nombre y Direcion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public Tramite inicializaEtapaValidacionModificacionNombreYDireccion(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que permite encontrar el tramite padre REGS de un expediente
     *
     * @param tramite
     * @param usuario
     * @return tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo encuentraTramitePadre
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Tramite encuentraTramitePadre(Tramite tramite, Usuario usuario);

    /**
     * Método que permite encontrar el tipoGenero asociado a cada tramite
     *
     * @param tramite
     * @param usuario
     * @return tramite
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 24/07/2015
     * Descripcion: En el caso de que el tipoTramite o flujo no tuviese un tipoGenero,
     * el valor por defecto que debe asumir es el del tipoTramite mismo.
     * Se debe obtener de acuerdo al tipoTramite se debe obtener el tipoGenero
     * 1. TipoTramite si pertenece al area de signos distintivos
     *
     * ----------------------------------------------------
     * </pre>
     */
    String obtenerTipoGeneroTramite(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método para guardar los datos de Direccion Formulario Direccion de
     * Notificacion
     *
     * @param tramite
     * @param listaDireccion
     * @param usuario
     * @param direccionIPCliente
     * @param numeroSeccion
     * @param idFlujo
     * @return Tramite
     * @exception Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 29/09/2015
     * Descripcion: Se realiza el registro de la dirección asociado al Trámite
     *
     * ----------------------------------------------------
     * </pre>
     */
    Tramite guardaDireccionNotificacion(Tramite tramite, List<Direccion> listaDireccion, Usuario usuario, String direccionIPCliente, Long numeroSeccion, Long idFlujo) throws Exception;

    /**
     * Método para guardar los datos de Identificacion de Solicitante
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param tramite
     * @param smsignomarca
     * @param listaImagenes
     * @param listaSMTipoSignoSolicitado
     * @param listArchivoPojo
     * @param listaSmColor
     * @param idFlujo
     * @param usuario
     * @param documento
     * @param dIGArchivoDocumentoTXT
     * @return Tramite
     * @exception Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 09/10/2015
     * Descripcion: Metodo que realiza el almacenamiento de los datos de Signo Distintivo
     *
     * ----------------------------------------------------
     * </pre>
     */
    Tramite guardaSignoDistintivo(Tramite tramite, SMSignoMarca smsignomarca, List<SMImagen> listaImagenes, List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, List<ArchivoNizaPojo> listArchivoPojo, List<SMColor> listaSmColor, Long idFlujo, Usuario usuario, Documento documento, DIGArchivoDocumento dIGArchivoDocumentoTXT) throws Exception;

    /**
     * Método para guardar los datos de Identificacion de Solicitante
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param respuesta
     * @param lemaComercial
     * @param numeroSignoRegistrado
     * @param numeroSolicitudTramite
     * @param numeroCertificado
     * @param fechaVigencia
     * @param numeroFormularioSolicitud
     * @return Tramite
     * @exception Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 09/10/2015
     * Descripcion: Metodo que permite la busqueda de un registro de Tramite de acuerdo a los siguientes criterios
     *
     * ----------------------------------------------------
     * </pre>
     */
    Tramite buscarSignoSolicitado(String cadena, StringBuffer respuesta, String lemaComercial, String numeroSignoRegistrado, String numeroSolicitudTramite, String numeroCertificado, String fechaVigencia, String numeroFormularioSolicitud) throws Exception;

    /**
     * Método para guardar los datos de Direccion Formulario Direccion de
     * Notificacion
     *
     * @param tipoSolicitante
     * @param tramite
     * @param listaDatosContactoSolicitante
     * @param persona
     * @param empresa
     * @param usuario
     * @param ipDireccion
     * @param fllujo
     *
     * @return Tramite
     * @exception Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: ChanoRojasMaldonado Fecha: 09/10/2015
     * Descripcion: Se realiza el registro de la dirección asociado al Trámite
     *
     * ----------------------------------------------------
     * </pre>
     */
    public Tramite guardaSolicitanteNaturalJuridicoGeneral(TipoSolicitante tipoSolicitante, Tramite tramite, List<DatosContacto> listaDatosContactoSolicitante, Persona persona, Empresa empresa, Usuario usuario, String ipDireccion, Flujo fllujo) throws Exception;

    /**
     * Busqueda de tramite por registro
     *
     * @param registro
     * @param serie
     * @param usuario
     * @return Tramite
     * @exception Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 20/09/2015
     * Descripcion: Método que encuentra un tramite a partir de datos del registro
     *
     * ----------------------------------------------------
     * </pre>
     */
    Tramite obtenerTramitePorRegistro(String registro, String serie, Usuario usuario) throws Exception;

    /**
     * Busqueda de tramite por numero de publicacion
     *
     * @param nroPubli
     * @param usuario
     * @return Tramite
     * @exception Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 20/09/2015
     * Descripcion: Método que encuentra un tramite a partir de dato del numero de registro
     *
     * ----------------------------------------------------
     * </pre>
     */
    Tramite obtenerTramitePorNroPublicacion(String nroPubli, Usuario usuario) throws Exception;

    public Tramite guardaSolicitanteNuevoTitularLicenciatario(TipoPersonaSolicitud tipoPersonaSolicitud, TipoSolicitante tipoSolicitante, Tramite tramite, List<DatosContacto> listaDatosContactoSolicitante, Persona persona, Empresa empresa, Usuario usuario, String ipDireccion, Flujo fllujo) throws Exception;

    /**
     * *
     * Método que obtiene el tramite de acuerdo a un codigo dia
     *
     * @param parametros
     * @param codigoDia
     * @return Tramite
     * @throws java.lang.Exception
     * ---------------------------------------------------- Creado Por: Eddy
     * Valero Fecha: 16/10/2015 Descripcion: Se agrega el metodo
     * obtenerTramitePadrePorCodigoDia
     * ----------------------------------------------------
     *
     *
     */
    Tramite obtenerTramitePadrePorCodigoDia(HashMap parametros, String codigoDia) throws Exception;

    /**
     * Método que permite crear un nuevo tramite para el tramite de
     * LemaComercial
     *
     * @param tramiteOrigen
     * @param tramiteAModificar
     * @param usuario
     * @param flujoBase
     * @param direccionIPCliente
     * @return Tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Eddy Valero Fecha: 19/10/2015
     * Descripcion: Se agrega el metodo CrearActualizarTramiteUsuarioTramiteLemaComercial,
     * el método es utilizado en el formulario de registro de Lema Comercial
     * </pre>
     *
     * @throws java.lang.Exception
     */
    Tramite crearActualizarTramiteUsuarioTramiteLemaComercial(Tramite tramiteOrigen, Tramite tramiteAModificar, Usuario usuario, Flujo flujoBase, String direccionIPCliente) throws Exception;

    /**
     * Método que permite crear un nuevo tramite para el tramite de
     * LemaComercial
     *
     * @param listaNaturalJuridicoPojo
     * @param tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Chano Rojas Maldonado
     * Fecha: 19/10/2015
     * Descripcion: Se agrega el metodo  eliminar tramite
     * </pre>
     *
     * @throws java.lang.Exception
     */
    void eliminaPersonaEmpresaDatosContactoBase(List<NaturalJuridicoPojo> listaNaturalJuridicoPojo, Tramite tramite) throws Exception;

    /**
     * Método que permite comparar la lista logica de solicitantes de la vista
     * con la lista existente en la base de datos
     *
     * @param listaNaturalPoderPojo
     * @param tramite
     * @param usuario
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz Fecha: 28/10/2015
     * Descripcion: Se agrega el metodo eliminaPersonaPoderDatosContactoBase,
     * el método permite comparar la lista logica de la vista con la lista existente en la base de datos
     * </pre>
     *
     * @throws java.lang.Exception
     */
    void eliminaPersonaPoderDatosContactoBase(List<NaturalPoderPojo> listaNaturalPoderPojo, Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método que permite comparar la lista logica de nuevos titulares o
     * licenciatarios la vista con la lista existente en la base de datos
     *
     * @param listaNaturalJuridicoPojo
     * @param tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz Fecha: 28/10/2015
     * Descripcion: Se agrega el metodo eliminaPersonaEmpresaDatosContactoBaseTitularLice,
     * el método permite comparar la lista logica de la vista con la lista existente en la base de datos
     * </pre>
     *
     * @throws java.lang.Exception
     */
    void eliminaPersonaEmpresaDatosContactoBaseTitularLice(List<NaturalJuridicoPojo> listaNaturalJuridicoPojo, Tramite tramite) throws Exception;

    /**
     * Método que permite encontrar un tramite a partir del SM y el nombre de la
     * Marca o Signo Distintivo
     *
     * @param codigoSM
     * @param Marca
     * @param usuario
     * @return Tramite
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz Fecha: 24/11/2015
     * Descripcion: Se agrega el metodo obtenerTramitePorCodigoSMyMarca,
     * el método permite encontrar un tramite a partir del SM y el nombre de la Marca o Signo Distintivo
     * </pre>      
     *     
     */
    public Tramite obtenerTramitePorCodigoSMyMarca(String codigoSM, String Marca, Usuario usuario);
    
    
    /**
     * Método que permite encontrar el objeto tramite a partir del campo tramite enviado
     * Marca o Signo Distintivo
     *
     * @return Tramite
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz Fecha: 24/11/2015
     * Descripcion: Se agrega el metodo obtenerTramitePorCodigoSMyMarca,
     * el método permite encontrar un tramite a partir del SM y el nombre de la Marca o Signo Distintivo
     * </pre>      
     *     
     */
     List<Tramite> obtienePrimerTramitePorCampoTramite(String campoTramite) throws Exception;
    
    /**
     * Método que permite generar el correlativo por tramite y regional
     
     *
     * @param tramite
     * @param usuario
     * @return Tramite
     * <pre>
     * ----------------------------------------------------
     * Creado Por: chanoRojas-Diciembre Fecha: 03/12/2015
     * Descripcion: Para el metodo los parametros son usuario y tramite puesto que debera tener el codigo del tramite de ventanilla por regional
     * </pre>      
     *     
     */
    String generaCodigoTramiteVentanillaPorRegional(Tramite tramite, Usuario usuario);
    
}
