package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Registro;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface RegistroService extends GenericDao<Registro> {

    /**
     * metodo que permite gurdar Registro
     *
     * @param registro
     * @return Registro
     * @version 1.0, 15/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Registro persistRegistro(Registro registro) throws Exception;

    /**
     * metodo que modifica Registro
     *
     * @param registro
     * @return Registro
     * @version 1.0, 15/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Registro mergeRegistro(Registro registro) throws Exception;

    /**
     * metodo que elimina Registro
     *
     * @param registro
     * @version 1.0, 15/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeRegistro(Registro registro) throws Exception;

    /**
     * metodo que modifica Registro
     *
     * @return List
     * @version 1.0, 15/07/2014
     * @author chano
     */
    public List<Registro> listaRegistro();

    /**
     * metodo que modifica Registro
     *
     * @param tramite
     * @return Registro
     * @version 1.0, 16/07/2014
     * @author eddy valero
     */
    Registro recuperaRegistroPorTramite(Tramite tramite);

    /**
     * metodo que lista tramite por busqueda
     *
     * @param usuario
     * @param fechaInicial
     * @param codigoResolucion
     * @param numeroResolucion@return List
     * @version 1.0, 15/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    List<Tramite> listaTramiteFiltradoParametros(Usuario usuario, Date fechaInicial, String codigoResolucion, String numeroResolucion) throws Exception;

    /**
     * metodo que devuelve un tramite por busqueda
     *
     * @param usuario
     * @param fechaInicial
     * @param codigoSm
     * @param numeroResolucion@return List
     * @version 1.0, 17/10/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    Tramite obtieneTramiteParaRenovacion(Usuario usuario, Date fechaInicial, String codigoSm, String numeroResolucion) throws Exception;

    /**
     * metodo que Valida los campos Registro
     *
     * @param registro
     * @param publicacion
     * @return Registro
     * @version 1.0, 22/10/2014
     * @author RobertoSantivañez
     */
    public Boolean[] validaCamposRegistroRenovacion(Registro registro, Publicacion publicacion);

    /**
     * metodo que Valida los campos Registro
     *
     * @param registro
     * @return Registro
     * @version 1.0, 22/10/2014
     * @author RobertoSantivañez
     */
    public Boolean validaDatoRegistroRepetido(Registro registro);

    /**
     * metodo que Valida los campos Registro
     *
     * @param registro
     * @return Registro
     * @version 1.0, 22/10/2014
     * @author RobertoSantivañez
     */
    public Boolean validaDatoNumeroRepetido(Registro registro);

    /**
     * método que permite crear un nuevo registro en la Tabla Registro, si el
     * registro existe devuelve el mismo sino lo crea.
     *
     * @param tramite
     * @param usuario
     *
     * @return Registro objeto registro
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 10/02/2015
     * Descripcion: Se agrega el metodo creaRegistroDocumento, que inserta un registro en tabla registro
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public Registro creaRegistroDocumento(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que recoge la serie correspondiente de acuerdo a nacionalidad de
     * solicitante y datos de Regional
     *
     * @param tramite
     * @param usuario
     * @return String
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo generaSerie, que devuelve la serie para el Registro.
     * ----------------------------------------------------
     * Modificado por: Susana Escobar Paz
     * Fecha: 17/03/2015
     * Descripcion: Generar la serie a partir de la nacionalidad, tipo tramite, regional, vigente, tablas Dosificacion, DosificacionTasa y Tasa
     *
     * Modificado por: Susana Escobar Paz
     * Fecha: 23/04/2015
     * Descripcion: Generar la serie a partir de la nacionalidad, tipo tramite, regional, vigente, tipo recibo, tablas Dosificacion y Tasa
     * </pre>
     */
    public String generaSerie(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que permite encontrar el nombre de la marca
     *
     * @param tramite
     * @param usuario
     * @return smsignoMarca
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo datoSignoMarca, que permite encontrar el nombre de la marca
     * ----------------------------------------------------
     * Modificado:
     * Fecha:
     * Descripcion:
     * </pre>
     */
    public SMSignoMarca datoSignoMarca(Tramite tramite, Usuario usuario);

    /**
     * método que permite encontrar datos del solicitante consultando tabla
     * PersonaEmpresaTramite
     *
     * @param tramite
     * @param usuario
     * @return personaEmpresaTramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo datoSolicitante, que que permite encontrar datos del solicitante consultando tabla PersonaEmpresaTramite
     * ----------------------------------------------------
     * Modificado:
     * Fecha:
     * Descripcion:
     * </pre>
     */
    public PersonaEmpresaTramite datoSolicitante(Tramite tramite, Usuario usuario);

    /**
     * método que permite encontrar datos del apoderado si tiene
     *
     * @param tramite
     * @param usuario
     * @return persona
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo datoApoderado, que permite encontrar datos del apoderado si tiene
     * ----------------------------------------------------
     * Modificado:
     * Fecha:
     * Descripcion:
     * </pre>
     */
    public Persona datoApoderado(Tramite tramite, Usuario usuario);

    /**
     * método que permite crear documento de regiatro
     *
     * @param tramite
     * @param usuario
     * @return documento
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo creaDocumento que permite crear documento de regiatro
     * ----------------------------------------------------
     * Modificado:
     * Fecha:
     * Descripcion:
     * </pre>
     */
    public Documento creaDocumento(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que realiza la busqueda de un Tramite a partir de su codigo SM y
     * su numero de Resolución
     *
     * @param codigoSm
     * @param numeroResolucion
     * @param usuario
     * @throws java.lang.Exception
     * @return Tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo obtieneTramiteParaLemaComercial
     * </pre>
     *
     */
    Tramite obtieneTramiteParaLemaComercial(Usuario usuario, String codigoSm, String numeroResolucion) throws Exception;

    /**
     * Método que obtiene el Registro Activo por numero de registro y serie
     *
     * @param numero
     * @param serie
     * @param usuario
     * @return String
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 28/09/2015
     * Descripcion: creación del método obtieneRegistroActivoPorNroSerie
     * ----------------------------------------------------
     * </pre>
     */
    Registro obtieneRegistroActivoPorNroSerie(String numero, String serie, Usuario usuario);

    /**
     * Método que obtiene el Registro Anulado por numero de registro y serie
     *
     * @param numero
     * @param serie
     * @param usuario
     * @return String
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 28/09/2015
     * Descripcion: creación del método obtieneRegistroAnuladoPorNroSerie
     * ----------------------------------------------------
     * </pre>
     */
    Registro obtieneRegistroAnuladoPorNroSerie(String numero, String serie, Usuario usuario);

    /**
     * Método que anula el registro y activa el mismo con el tramiteNuevo
     *
     * @param registro
     * @param tramiteNuevo
     * @param direccionIP
     * @param usuario
     * @return String
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 30/09/2015
     * Descripcion: creación del método reasignarRegistro
     * ----------------------------------------------------
     * </pre>      
     *
     */
    Registro reasignarRegistro(Registro registro, Tramite tramiteNuevo, Usuario usuario, String direccionIP) throws Exception;

     /**
     * Método que valida campos de la busqueda por registro en la vista buscador de formularios de modificaciones
     *
     * @param datoRegistro
     * @param serieRegistro
     * @param datoResolucion
     * @param gestion         
     * @return String     
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 19/10/2015
     * Descripcion: creación del método validaCamposBuscadorModificacion valida campos de la busqueda por registro en la vista buscador de formularios de modificaciones
     * ----------------------------------------------------
     * </pre>      
     *
     */
    public Boolean[] validaCamposBuscadorModificacion(String datoRegistro, String serieRegistro, String datoResolucion, String gestion);

    /**
     * Método que busca el registro activo para la solicitud de Modificacion
     *
     * @param numero
     * @param serie
     * @param Resolucion
     * @param gestion         
     * @param usuario         
     * @return String     
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 20/10/2015
     * Descripcion: creación del método buscaRegistroActivoParaSolModificacion busca el registro activo para la solicitud de Modificacion
     * ----------------------------------------------------
     * </pre>      
     *
     */
    public Tramite buscaRegistroActivoParaSolModificacion(String numero, String serie, String Resolucion, String gestion, Usuario usuario);
    /**
     * Método que busca el registro activo para la solicitud de Modificacion
     *
     * @param numero
     * @param serie
     * @param Resolucion
     * @param gestion         
     * @param usuario         
     * @return String     
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Chano Rojas Maldonado Fecha: 11/11/2015
     * Descripcion: creación del método buscaRegistroActivoParaSolModificacion busca el registro activo para la solicitud de Modificacion
     * ----------------------------------------------------
     * </pre>      
     *
     */
     Tramite buscaRegistroActivo(String numero, String serie, String Resolucion, String gestion, Usuario usuario) ;

}
