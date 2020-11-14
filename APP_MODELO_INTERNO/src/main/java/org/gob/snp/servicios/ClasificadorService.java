package org.gob.snp.servicios;

import java.io.Serializable;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Clasificador;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoNotificacion;
import org.gob.snp.entidades.vistas.EstadoProceso;
import org.gob.snp.entidades.vistas.EstadoProcesoPublicacion;
import org.gob.snp.entidades.vistas.EstadoPublicacion;
import org.gob.snp.entidades.vistas.EstadoPublicacionTramite;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoBanco;
import org.gob.snp.entidades.vistas.TipoCiudad;
import org.gob.snp.entidades.vistas.TipoCiudadNotificacion;
import org.gob.snp.entidades.vistas.TipoColor;
import org.gob.snp.entidades.vistas.TipoContacto;
import org.gob.snp.entidades.vistas.TipoDocumentacion;
import org.gob.snp.entidades.vistas.TipoDocumento;
import org.gob.snp.entidades.vistas.TipoDosificacion;
import org.gob.snp.entidades.vistas.TipoFormularioVentanillaEForma;
import org.gob.snp.entidades.vistas.TipoGenero;
import org.gob.snp.entidades.vistas.TipoGeneroPersona;
import org.gob.snp.entidades.vistas.TipoModificacion;
import org.gob.snp.entidades.vistas.TipoNotificacion;
import org.gob.snp.entidades.vistas.TipoPais;
import org.gob.snp.entidades.vistas.TipoPreferencia;
import org.gob.snp.entidades.vistas.TipoPreferenciaPrioridad;
import org.gob.snp.entidades.vistas.TipoPrioridad;
import org.gob.snp.entidades.vistas.TipoProteccionPrioridad;
import org.gob.snp.entidades.vistas.TipoProteccionPrioridadDatos;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.entidades.vistas.TipoSigno;
import org.gob.snp.entidades.vistas.TipoSolicitante;
import org.gob.snp.entidades.vistas.TipoSolicitud;
import org.gob.snp.entidades.vistas.TipoSolicitudDeposito;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.pojo.FormularioVentanillaPojo;

public interface ClasificadorService extends GenericDao<Clasificador> {

    public Serializable find(Class clazz, String id);

    /**
     * metodo que permite guardar Cllasificador
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 26/06/2014
     * @author chanorojas, Roberto Santivañe
     * @throws java.lang.Exception
     */
    Clasificador persistClasificador(Clasificador clasificador) throws Exception;

    /**
     * metodo que permite modificar Cllasificador
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 26/06/2014
     * @author chanorojas, Roberto Santivañe
     * @throws java.lang.Exception
     */
    Clasificador mergeClasificador(Clasificador clasificador) throws Exception;

    /**
     * metodo que permite eliminar Cllasificador
     *
     * @param clasificador
     * @
     * @version 1.0, 26/06/2014
     * @author chanorojas, Roberto Santivañe
     * @throws java.lang.Exception
     */
    void removeClasificador(Clasificador clasificador) throws Exception;

    /**
     * metodo que permite listar las ciudades del clasificador
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    List<Clasificador> listadoCiudadClasificador();

    /**
     * metodo que permite listar las ciudades del clasificador donde se tenga
     * una suscursal
     *
     * @return List<TipoCiudadNotificacion>
     * @version 1.0, 16/09/2014
     * @author RobertoSantivañez
     */
    List<TipoCiudadNotificacion> listadoCiudadClasificadorNotificacion();

    /**
     * metodo que permite listar las etapas de un tramite
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    List<EtapaTramite> listadoEtapaClasificador();

    /**
     * metodo que permite listar los tipos de tramites
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    String recuperaNombreTipoTramitePorCodigo(String codigo);

    /**
     * metodo que permite listar el tipo de Solicitudes
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    List<TipoSolicitud> listadoTipoSolicitudClasificador();

    /**
     * metodo que permite listar el tipo de tramites
     *
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     */
    List<TipoTramite> listadoTipoTramiteClasificador();

    /**
     * metodo que permite listar el tipo de documento
     *
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     */
    List<TipoDocumento> listadoTipoDocumentoSD();

    /**
     * metodo que permite listar el tipo de Solicitante
     *
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     */
    List<TipoSolicitante> listadoTipoSolicitantedPersonaSD();

    /**
     * metodo que permite listar el tipo de datos de contacto
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public List<TipoContacto> listaTipoContactoSD();

    /**
     * metodo que permite listar el tipo de genero de una persona
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    List<TipoGeneroPersona> listadoTipoGeneroPersona();

    /**
     * metodo que permite listar el tipo de ciudades que se tiene en la Base de
     * Datos
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    List<TipoCiudad> listadoTipoCiudad();

    /**
     * metodo que permite listas los tipos de tramites pestaña 3
     *
     * @param clasificador
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    List<TipoGenero> listadoTipoGeneroTramite();

    /**
     * metodo que permite listas los tipos de tramites pestaña 3
     *
     * @return Clasificador
     * @version 1.0, 03/06/2014
     * @author RobertoSantivañez
     */
    List<TipoGenero> listadoTipoGeneroTramiteRenovacion();

    /**
     * metodo que permite listar Una Vista de TipoProteccionPrioridad
     *
     * @version 1.0, 21/07/2014
     * @author chanorojas
     * @return Listado TipoProteccionPrioridad
     * @throws java.lang.Exception
     */
    List<TipoProteccionPrioridad> listadoTipoProteccionPrioridad();

    /**
     * metodo que permite listar Una Vista de TipoProteccionPrioridadDatos
     *
     * @version 1.0, 21/07/2014
     * @author chanorojas
     * @return Listado TipoProteccionPrioridadDatos
     * @throws java.lang.Exception
     */
    List<TipoProteccionPrioridadDatos> listadoTipoProteccionPrioridadDatos();

    /**
     * metodo que permite listar La Vista de TipoProteccionPrioridadDatos segun
     * codigo padre
     *
     * @param codigoPadre
     * @version 1.0, 21/07/2014
     * @author chanorojas
     * @return Listado TipoProteccionPrioridadDatos
     */
    List<TipoProteccionPrioridadDatos> listadoTipoProteccionPrioridadDatos(String codigoPadre);

    /**
     * metodo que permite listar La Vista de TipoSolicitudDeposito
     *
     * @version 1.0, 25/07/2014
     * @author chanorojas
     * @return Listado TipoSolicitudDeposito
     */
    List<TipoSolicitudDeposito> listadoSolicitudDeposito();

    /**
     * metodo que permite listar La Vista de TipoSigno
     *
     * @version 1.0, 25/07/2014
     * @author eddy valero
     * @return Listado TipoSigno
     */
    List<TipoSigno> listadoTipoSigno();

    /**
     * metodo que permite listar La Vista de EstadoProceso
     *
     * @version 1.0, 13/08/2014
     * @author rojas
     * @return Listado EstadoProceso
     */
    List<EstadoProceso> listadoEstadoProceso();

    /**
     * metodo que permite listar los tipos de documento cuando el solicitante es
     *
     * @version 1.0, 18/08/2014
     * @author evalero
     * @param tipoSolicitante
     * @return Listado TipoDocumentoIdentidad
     */
    List<TipoDocumento> listadoTipoDocumentoTipoSolicitante(TipoSolicitante tipoSolicitante);

    /**
     * metodo que permite listar los datos del clasificador para el formulario
     * de verificacion de ingreso
     *
     * @version 1.0, 18/08/2014
     * @author ROBERTO SANTIVAÑEZ
     * @return Listado FormularioIngresoSignosDistintivos
     * @t
     */
//    List<FormularioIngreso> listaFormularioSignosDistintivos();
    /**
     * metodo que permite listar los datos del clasificador dependientes de un
     * clasificador en especifico para el formulario de verificacion de ingreso
     *
     * @version 1.0, 18/08/2014
     * @author chano
     * @param dominio
     * @param codigoPadre
     * @return Listado FormularioIngresoSignosDistintivos
     */
//    List<FormularioIngreso> listaFormularioSignosDistintivosDependientes(String codigoPadre);
    List<Clasificador> listaFormularioSignosDistintivosClasificador(String dominio);

    /**
     * metodo que lista los clasificadores hijos por dominio padre clasificador
     * en especifico para el formulario de verificacion de ingreso
     *
     * @version 1.0, 02/09/2014
     * @author chano
     * @param codigoPadre
     * @return Listado FormularioIngresoSignosDistintivos
     */
    List<Clasificador> listaFormularioSignosDistintivosDependientesClasificador(String codigoPadre);

    /**
     * metodo que confecciona todo el codigo para el pojo Formulario
     * clasificador
     *
     * @version 1.0, 02/09/2014
     * @author chano
     * @param tramite
     * @param tipoPrioridad
     * @return List FormularioIngresoPojo
     */
//    List<FormularioIngresoPojo> listaPojoDinamico(Tramite tramite, String tipoPrioridad);
    List<TipoRequisito> listadoTipoRequisito();

    /**
     * metodo determina la posicion del registro Formulario recepcion de
     * Documentos para la opcion Otros
     *
     * @version 1.0, 03/09/2014
     * @author Henrry Guzman
     * @param listaFormularioVentanillaPojo
     * @param formularioVentanillaPojoSeleccionada
     * @return int
     */
    int encuentraPosicionListadoFormularioVentanillaPojo(List<FormularioVentanillaPojo> listaFormularioVentanillaPojo, FormularioVentanillaPojo formularioVentanillaPojoSeleccionada);

    /**
     * metodo determina la posicion del registro Formulario recepcion de
     * Documentos para la opcion Otros
     *
     * @version 1.0, 08/09/2014
     * @author chanorojas
     * @param codigoPadre
     * @return List
     */
    List<TipoFormularioVentanillaEForma> listaDependientesRequisitoFlujoVentanillaEforma(String codigoPadre);

    /**
     * metodo que lista tipoDosificacion
     *
     * @version 1.0, 01/10/2014
     * @author chanorojas
     * @return List
     */
    List<TipoDosificacion> listaTipoDosificacion();

    /**
     * metodo que lista tipoDeBanco
     *
     * @version 1.0, 04/11/2014
     * @author ROBERTO SANTIVAÑEZ
     * @return List<TipoDosificacion>
     */
    public List<TipoBanco> listaTipoBanco();

    /**
     * metodo que lista TipoModificacion
     *
     * @version 1.0, 06/11/2014
     * @author ROBERTO SANTIVAÑEZ
     * @return List<TipoBanco>
     */
    List<TipoModificacion> listaTipoModificacion();

    /**
     * metodo que lista TipoPais
     *
     * @version 1.0, 18/11/2014
     * @author ROBERTO SANTIVAÑEZ
     * @return List<TipoPais>
     */
    public List<TipoPais> listadoTipoPais();

    /**
     * Método que lista el Tipo de Documentacion
     *
     * @version 1.0, 28/01/2015
     * @author Gustavo Lizárraga
     * @return List<Clasificador>
     * @throws java.lang.Exception
     */
    public List<TipoDocumentacion> listadoTipoDocumentacion() throws Exception;

    /**
     * Método que lista el Tipo de Documentacion para Usuarios Internos
     *
     * @return List<TipoDocumentacion>
     * @throws java.lang.Exception
     * @see TipoDocumentacion      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 10/02/2015
     * Descripcion: El metodo devuelve el listado de TipoDocumentacion,
     * sin considerar en el listado Clase Niza, Descripcion, ni Registro
     * ----------------------------------------------------
     * </pre>
     */
    public List<TipoDocumentacion> listadoTipoDocumentacionDigitalizacion() throws Exception;

    /**
     * Método que lista el Tipo de Notificacion
     *
     * @return List<TipoNotificacion>
     * @throws java.lang.Exception
     * @see TipoNotificacion      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 11/02/2015
     * Descripcion: El metodo devuelve el listado de TipoNotificacion
     * ----------------------------------------------------
     * </pre>
     */
    public List<TipoNotificacion> listadoTipoNotificacion() throws Exception;

    /**
     * Método que lista el Estado de Notificacion
     *
     * @return List<EstadoNotificacion>
     * @throws java.lang.Exception
     * @see EstadoNotificacion      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 11/02/2015
     * Descripcion: El metodo devuelve el listado de EstadoNotificacion
     * ----------------------------------------------------
     * </pre>
     */
    public List<EstadoNotificacion> listadoEstadoNotificacion() throws Exception;

    /**
     * método que permite listar registros de la vista EstadoPublicacion
     *
     * @param
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 26/02/2015
     * Descripcion: Se agrega el metodo listadoEstadoPublicacion, que lista registros de la vista EstadoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<EstadoPublicacion> listadoEstadoPublicacion() throws Exception;

    /**
     * método que permite listar registros de la vista EstadoPublicacionTramite
     *
     * @param
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 26/02/2015
     * Descripcion: Se agrega el metodolistadoEstadoPublicacionTramite, que lista registros de la vista EstadoPublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public List<EstadoPublicacionTramite> listadoEstadoPublicacionTramite() throws Exception;

    /*
     * método que permite listar registros de la vista EstadoPublicacion excluyendo el estado Prepublicado
     *
     * @param 
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 21/04/2015
     * Descripcion: Se agrega el metodo listadoEstadoPublicacionEx, que lista registros de la vista EstadoPublicacion excluyendo el estado Prepublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @throws java.lang.Exception
     */
    public List<EstadoPublicacion> listadoEstadoPublicacionEx() throws Exception;

    /*
     * método que permite listar registros de la vista EstadoPublicacion excluyendo el estado Enviado
     *
     * @param 
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 21/04/2015
     * Descripcion: Se agrega el metodo listadoEstadoPublicacionCarga, que lista registros de la vista EstadoPublicacion excluyendo el estado Enviado
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @throws java.lang.Exception
     */
    public List<EstadoPublicacion> listadoEstadoPublicacionCarga() throws Exception;

    /**
     * método que permite listar registros de un Dominio Determinado
     *
     * @param dominio
     * @param usuario
     * @return List<Clasificador>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Eddy Valero Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo listarDominioPlantilla, de acuerdo a un determinado dominio
     * ----------------------------------------------------
     * </pre>
     */
    public List<Clasificador> listarDominioPlantilla(String dominio, Usuario usuario) throws Exception;

    /**
     * método que permite listar registros de la vista EstadoPublicacionTramite
     * <pre>
     * ----------------------------------------------------
     * Creado Por: ChanoRojas
     * Fecha: 26/02/2015
     * Descripcion: Se agrega el metodolistadoEstadoPublicacionTramite, que lista registros de la vista EstadoPublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return lista de TipoPreferenciaPrioridad
     * @throws java.lang.Exception
     */
    List<TipoPreferenciaPrioridad> listadoTipoPreferenciaPrioridad() throws Exception;

    /**
     * método que permite listar registros de la vista EstadoPublicacionTramite
     *
     *
     * @return List TipoPreferencia
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: ChanoRojas
     * Fecha: 26/02/2015
     * Descripcion: Se agrega el metodolistadoEstadoPublicacionTramite, que lista registros de la vista EstadoPublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    List<TipoPreferencia> listadoTipoPreferencia() throws Exception;

    /**
     * método que permite listar registros de la vista EstadoPublicacionTramite
     *
     * @return List TipoPrioridad
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: ChanoRojas
     * Fecha: 26/02/2015
     * Descripcion: Se agrega el metodolistadoEstadoPublicacionTramite, que lista registros de la vista EstadoPublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    List<TipoPrioridad> listadoTipoPrioridad() throws Exception;

    /**
     * Método que permite listar las Zonas de una Ciudad Determinada
     *
     * @param dominio
     * @param usuario
     * @return List<Clasificador>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Gustavo Lizárraga Fecha: 22/05/2015
     * Descripcion: Se agrega el metodo listaZonasPorCiudad, de acuerdo a un determinado dominio
     * ----------------------------------------------------
     * </pre>
     */
    public List<Clasificador> listaZonasPorCiudad(String dominio, Usuario usuario) throws Exception;

    /**
     * Método que permite devolver el codigo de la zona de acuerdo al Dominio y
     * al Nombre
     *
     * @param dominio
     * @param nombre
     * @param usuario
     * @return List TipoPrioridad
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/05/2015
     * Descripcion: Se crea el método devolverCodigoZona
     * ----------------------------------------------------
     * </pre>
     */
    String devolverCodigoZona(String dominio, String nombre, Usuario usuario) throws Exception;

    /**
     * método que permite listar estadoProcesoPublicacion
     *
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 22/06/2015
     * Descripcion: Se agrega el metodo listadoEstadoPublicacion, que lista registros de la vista EstadoPublicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public List<EstadoProcesoPublicacion> listadoEstadoProcesoPublicacion() throws Exception;

    public List<Clasificador> listaEtapaTramiteSignoYMarca() throws Exception;

    /**
     * método que permite listar los TipoDocumentacion para el usuario de
     * Impresion de TItulos
     *
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 13/08/2015
     * Descripcion: Se agrega el metodo listadoTipoDocumentacionDigitalizacionUsuarioTitulos, que permite listar los TipoDocumentacion para el usuario de Impresion de TItulos
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public List<TipoDocumentacion> listadoTipoDocumentacionDigitalizacionUsuarioTitulos() throws Exception;

    public List<EstadoProceso> listadoEstadoProcesoValida();

    public List<TipoColor> listadoTipoColor() throws Exception;

    /**
     * método que permite listar los TipoDocumentacion para el usuario de
     * Impresion de TItulos
     *
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: chanoRojas
     * Fecha: 25/09/2015
     * Descripcion: Se agrega el tipo color para el guardado de tipo color en la pestaña tres
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public List<Clasificador> listaClasificadorXDomnio(String dominio) throws Exception;

    /**
     * Método que obtiene todos los registros del Clasificador con el dominio
     * CodigoTramite
     *
     * @return List
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero
     * Fecha: 03/10/2015
     * Descripcion: Se agrega el metodo listadoCodigoTramite
     * ----------------------------------------------------
     * </pre>
     *
     *
     */
    public List<Clasificador> listadoCodigoTramite() throws Exception;

    /**
     * Método que obtiene todos los registros de la vista TipoGenero
     *      
     * @return List
     * @throws java.lang.Exception     
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 26/10/2015
     * Descripcion: Se agrega el metodo listadoCodigoTramite, ue obtiene todos los registros de la vista TipoGenero
     * ----------------------------------------------------
     * </pre>
     *
     *
     */
    public List<TipoGenero> listadoTipoGenero();
}
