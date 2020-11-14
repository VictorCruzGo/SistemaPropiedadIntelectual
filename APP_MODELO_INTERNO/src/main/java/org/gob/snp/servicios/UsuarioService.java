package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.UsuarioRol;
import org.gob.snp.enums.EnumRolesUsuario;

public interface UsuarioService extends GenericDao<Usuario> {

    /**
     * metodo que permite adicionar Usuario
     *
     * @param usuario
     * @return Usuario
     * @version 1.0, 20/06/2014
     * @author Chano
     * @throws java.lang.Exception
     */
    Usuario persistUsuario(Usuario usuario) throws Exception;

    /**
     * metodo que permite modifica Usuario
     *
     * @param usuario
     * @return Usuario
     * @version 1.0, 20/06/2014
     * @author Chano
     * @throws java.lang.Exception
     */
    Usuario mergeUsuario(Usuario usuario) throws Exception;

    /**
     * metodo que permite eliminar Usuario
     *
     * @version 1.0, 20/06/2014
     * @author Chano
     * @param usuario
     * @throws java.lang.Exception
     *
     */
    void removeUsuario(Usuario usuario) throws Exception;

    /**
     * metodo que permite listar todos Usuario
     *
     * @return List
     * @version 1.0, 20/06/2014
     * @author Chano
     */
    List<Usuario> listaUsuario();

    /**
     * metodo que permite encriptar el password
     *
     * @param login
     * @param pass
     * @return String Encriptado Password
     * @version 1.0, 24/06/2014
     * @author Henrry
     */
    String encriptarContrasena(String login, String pass);

    /**
     * Método que permite verificar la existencia del Usuario
     *
     * @param usuario
     * @return Boolean
     *
     * <pre>
     * Creado: Henrry Fecha: 24/06/2014
     * Descripcion: Creación del método verificaExistenciaUsuario
     * -------------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 03/06/2015
     * Descripcion: Modificar el método para solo verifique los usuarios que son vigentes
     * </pre>
     */
    Boolean verificaExistenciaUsuario(Usuario usuario);

    /**
     * Método que permite verificar la existencia del Usuario
     *
     * @param usuario
     * @return Boolean
     *
     * <pre>
     * Creado: Henrry Fecha: 24/06/2014
     * Descripcion: Creación del método verificaExistenciaUsuario
     * -------------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 03/06/2015
     * Descripcion: Modificar el método para solo verifique los usuarios que son vigentes
     * </pre>
     */
    Boolean verificaUsuarioMExterno(Usuario usuario);

    /**
     * <pre>
     * Creado: Henrry Guzman, robertoSantivañez
     * Fecha: 08/12/2014
     * Modulo: Registro Usuario
     * Descripción: Permite la verificacion de la existencia del login
     * </pre>
     *
     * @param usuario Usuario
     */
    Boolean verificaExistenciaUsuarioRegistro(Usuario usuario);

    /**
     * metodo que verifica que los password sean iguales
     *
     * @param password
     * @param passwordConfirma
     * @return Boolean
     * @version 1.0, 25/06/2014
     * @author chanorojas
     */
    Boolean validaPassword(String password, String passwordConfirma);

    /**
     * metodo que permite registrar los datos de usuario y persona
     *
     * @param persona
     * @param usuario, persona
     * @param idUsuarioLogueado
     * @return Boolean
     * @version 1.0, 25/06/2014
     * @author chanorojas
     * @throws java.lang.Exception
     */
    Usuario guardaPersonaUsuario(Persona persona, Usuario usuario, Long idUsuarioLogueado) throws Exception;

    /**
     * metodo que permite registrar los datos de usuario y persona
     *
     * @param usuario, persona
     * @param idUsuarioLogueado
     * @return Boolean
     * @version 1.0, 25/06/2014
     * @author chanorojas
     * @throws java.lang.Exception
     */
    Usuario guardaPersonaUsuarioExterno(Usuario usuario, Long idUsuarioLogueado) throws Exception;

    /**
     * metodo obtiene Usuario logueado
     *
     * @param usuario
     * @return Usuario
     * @version 1.0, 25/06/2014
     * @author Henrry
     */
    Usuario obtieneUsuarioLogueado(Usuario usuario);
    /**
     * metodo obtiene Usuario logueado
     *
     * @param usuario
     * @return Usuario
     * @version 1.0, 25/06/2014
     * @author Henrry
     */
     Usuario obtieneUsuarioLogueadoMexterno(Usuario usuario);

    /**
     * metodo obtiene nombre completo del Usuario logueado
     *
     * @param usuario
     * @return String
     * @version 1.0, 25/06/2014
     * @author Henrry
     */
    String generaNombreCompletoUsuario(Usuario usuario);

    /**
     * metodo obtiene nombre completo del Usuario logueado
     *
     * @param usuario
     * @return String
     * @version 1.0, 25/06/2014
     * @author Henrry
     */
    String generaNombreCompletoUsuarioInterno(Usuario usuario);

    /**
     * método que encuentra un Usuario por Login
     *
     * @param login
     * @return Usuario
     * @version 1.0, 25/06/2014
     * @author Jonathan
     */
    Usuario encuentraUsuarioPorLogin(String login);

    /**
     * método que modifica el usuario y persona en estado activo
     *
     * @param usuario
     * @version 1.0, 25/06/2014
     * @author chanorojas
     * @throws java.lang.Exception
     */
    void guardaUsuarioPersonaConfirmado(Usuario usuario) throws Exception;

    /**
     * método que valida el formulario de usuario y persona
     *
     * @param persona
     * @param usuario, persona,password, paswordConfirma return String
     * @version 1.0, 26/06/2014
     * @author chanorojas
     * @param password
     * @param passwordConfirma
     * @return
     */
    String[] validaDatosFormulario(Persona persona, Usuario usuario, String password, String passwordConfirma);

    /**
     * método que verifica si el numero de ci ya esta registradoe n la base
     *
     * @param numeroDocumento
     * @version 1.0, 26/06/2014
     * @author chanorojas
     * @return
     */
    Boolean verificaNumeroDocumento(String numeroDocumento);

    /**
     * método que verifica si el numero de ci ya esta registradoe n la base
     *
     * @param correo
     * @version 1.0, 26/06/2014
     * @author chanorojas
     * @return
     */
    Boolean correoValido(String correo);

    /**
     * Método que permite derivar a las Bandejas de acuerdo al Usuario
     *
     * @param usuario
     * @see EnumRolesUsuario
     * @return String
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 18/08/2014
     * Descripcion: Se agrega el metodo derivaALasBandejasSegunaElUsuario
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 26/02/2014
     * Descripcion: Se agrega la verificacion de que si el usuario es de publicacion
     * si es de publicacion se direcciona a la ruta /publicacion/publicacion.xhtml
     * </pre>
     */
    String derivaALasBandejasSegunaElUsuario(Usuario usuario);

    /**
     * Verifica existencia numero de documento para el usuario, no repetidos
     *
     * @version 1.0, 29/08/2014
     * @author Henrry Guzman
     * @param persona
     * @return Boolean
     */
    Boolean validaNumeroDocumentoUsuario(Persona persona);

    /**
     * Método que encuentra el usuario que se hará cargo del Tramite
     *
     * @version 1.0, 12/09/2014
     * @author Jonathan Valdivia
     * @param listaUsuarioRol
     * @return
     */
    Usuario encuentraUsuarioConMenorCargaLaboral(List<UsuarioRol> listaUsuarioRol);

    /**
     * Método que encuentra el usuario que se hará cargo del Tramite
     *
     * @version 1.0, 12/09/2014
     * @author Jonathan Valdivia
     * @param flujoEtapa
     * @param regional
     * @return
     */
    Usuario encuentraUsuarioParaAsignarTramite(FlujoEtapa flujoEtapa, Regional regional);

    /**
     * Lista Todos los Usuarios que tienen dicho Rol en cierta Regional
     *
     * @version 1.0, 03/10/2014
     * @author chanoRojas
     * @param usuario
     * @return Boolean
     */
    Regional obtieneRegionalPorUsuario(Usuario usuario);

    /**
     * Verificar si el Usuario ingresado, tiene un rol de Revisor o Director
     * retorna los siguientes valores: verdadero: el usuario es revisor o
     * Director falso: el usuario es tecnico o tiene otro rol
     *
     * @version 1.0, 19/11/2014
     * @author Eddy Valero
     * @param usuario
     * @return Boolean
     */
    Boolean verificaRolRevisorUsuario(Usuario usuario);

    /**
     * Verificar si una persona esta registrado en usuario retorna los
     * siguientes valores: verdadero: si la persona esta resgistrada como
     * usuario falso: si la persona no esta registrada como usuario
     *
     * @version 1.0, 20/11/2014
     * @author chanoRojas
     * @param persona
     * @return Boolean
     */
    Boolean verificaExistenciaPersonaUsuario(Persona persona, Usuario usuario);

    /**
     * valida campos de registro de usuario
     *
     * @version 1.0, 20/11/2014
     * @author robertoSantivañez
     * @param persona
     * @param usuario
     * @param Usuario
     * @param tipoDocumento
     * @param lugarDeExpedicion
     * @param genero
     * @param password
     * @return Boolean[]
     */
    Boolean[] validaCamposRegitroUsuario(Persona persona, Usuario usuario, String tipoDocumento, String lugarDeExpedicion, String genero, String password);

    /**
     * valida campos de registro de usuario externo el cal solo debera llenar su
     * nombre completo y su paswo
     *
     * @version 1.0, 20/11/2014
     * @author chanoRojas
     * @param usuario
     * @param password
     * @return Boolean[]
     */
    Boolean[] validaCamposRegitroUsuarioExterno(Usuario usuario, String password);

    Boolean[] validaCamposModificacion(Persona persona);

    /**
     * Método que permite obtener al Usuario que realizará la notificación del
     * Trámite
     *
     * @param flujoEtapa
     * @param regional
     * @param usuario
     * @return Usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo existeFecha
     * ----------------------------------------------------
     * </pre>
     */
    Usuario encuentraUsuarioParaNotificarTramite(FlujoEtapa flujoEtapa, Regional regional, Usuario usuario) throws Exception;

    /**
     * Método que permite obtener al Usuario notificador con menor carga Laboral
     *
     * @param listaUsuarioRol
     * @param usuarioSolicitante
     * @return Usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo encuentraUsuarioNotificadorConMenorCargaLaboral
     * ----------------------------------------------------
     * </pre>
     */
    Usuario encuentraUsuarioNotificadorConMenorCargaLaboral(List<UsuarioRol> listaUsuarioRol, Usuario usuarioSolicitante) throws Exception;

    /**
     * Método que permite verificar si el usuario tiene un determinado rol, de
     * acuerdo al EnumRolesUsuario
     *
     * @param usuario
     * @param enumRolesUsuario
     * @see EnumRolesUsuario
     * @return Boolean
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 26/02/2015
     * Descripcion: Se agrega el metodo verificaSiUsuarioTieneRolIngresado
     * ----------------------------------------------------
     * </pre>
     */
    Boolean verificaSiUsuarioTieneRolIngresado(Usuario usuario, EnumRolesUsuario enumRolesUsuario) throws Exception;

    /**
     * método que permite modificar solo la contrasenia de un usuario registrado
     *
     * @param password
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha:
     * Descripcion: Se agrega el metodo modificarContraseniaDeUsuarioRegistrado que permite modificar la contrasenia de un usuario registrado
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    void modificarContraseniaDeUsuarioRegistrado(Usuario usuario, String password);

    /**
     * método que permite verificar si el login de un usuario esta registrado en
     * la Base de datos
     *
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha:
     * Descripcion: Se agrega el metodo verificaExistenciaUsuarioLogin que permite verificar si el login de un usuario esta registrado en la Base de datos
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    Boolean verificaExistenciaUsuarioLogin(Usuario usuario);

    /**
     * método que permite Sacar el listado de personas tomando en cuenta la
     * etapa del tramite y su regional
     *
     * @param etapaTramite
     * @param idRegional
     *
     * @return
     */
    List<Persona> listaNombrePersonasEtapaTramite(String etapaTramite, String idRegional);

    /**
     * método que permite verificar si el login de un usuario esta registrado en
     * la Base de datos
     *
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha:
     * Descripcion: Se agrega el metodo verificaExistenciaUsuarioLogin que permite verificar si el login de un usuario esta registrado en la Base de datos
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    public Boolean validaCorreoRepetido(Usuario usuario);

    /**
     * método que permite encontrat a un usuario seghun su id la Base de datos
     *
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado Por: Levi Laura Ramos
     * Fecha:
     * Descripcion: método que permite encontrat a un usuario seghun su id
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    List<Usuario> encuentraPorIdUsuario(Long idUsuario);

}
