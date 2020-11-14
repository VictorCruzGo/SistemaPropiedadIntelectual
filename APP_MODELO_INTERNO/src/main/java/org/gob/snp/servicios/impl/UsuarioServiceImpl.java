/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Notificacion;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.UsuarioRol;
import org.gob.snp.enums.EnumEstado;
import org.gob.snp.enums.EnumModulosSistema;
import org.gob.snp.enums.EnumRolesUsuario;
import org.gob.snp.enums.EnumTipoOperacionUsuario;
import org.gob.snp.enums.EnumTipoUsuario;
import org.gob.snp.servicios.ErrorAplicacionService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.UsuarioRolService;
import org.gob.snp.servicios.UsuarioService;
import org.gob.snp.servicios.util.UtilitariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Eddy Valero
 */
public class UsuarioServiceImpl extends GenericDaoImpl<Usuario> implements UsuarioService {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private UsuarioRolService usuarioRolService;
    @Autowired
    private RegionalService regionalService;
    @Autowired
    private ErrorAplicacionService errorAplicacionService;
    @Autowired
    private UtilitariosService utilitariosService;

    @Override
    public Usuario persistUsuario(Usuario usuario) throws Exception {
        try {
            super.persist(usuario);
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }

    @Override
    public Usuario mergeUsuario(Usuario usuario) throws Exception {
        try {
            super.merge(usuario);
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }

    @Override
    public void removeUsuario(Usuario usuario) throws Exception {
        try {
            super.remove(usuario);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Usuario> listaUsuario() {
        try {
            List<Usuario> lista = hibernateTemplate.find(
                    "SELECT c "
                    + "FROM Usuario c");
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public String obtieneClavePartidaEnDos(String passEncriptado) {
        String claveNueva = "";
        for (int i = 0; i < passEncriptado.substring(0, 16).length(); i++) {
            claveNueva = claveNueva + passEncriptado.charAt(i);
        }
        return claveNueva;
    }

    public String encriptarContrasenaMD5(String contrasena) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(contrasena.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            return number.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return new String();
    }

    @Override
    public String encriptarContrasena(String login, String pass) {
        String llaveSimetrica1;
        llaveSimetrica1 = obtieneClavePartidaEnDos(encriptarContrasenaMD5(login));
        byte[] aError = null;
        SecretKeySpec key = new SecretKeySpec(llaveSimetrica1.getBytes(), "AES");
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] datosCifrados = cipher.doFinal(pass.getBytes()); //cadena = a texto a cifrar
            return new sun.misc.BASE64Encoder().encode(datosCifrados);
        } catch (Exception e) {
            return null;
        }
    }

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
    @Override
    public Boolean verificaExistenciaUsuario(Usuario usuario) {
        Boolean existeUsuario;
        List<Usuario> lista = hibernateTemplate.find(""
                + "select h "
                + "from Usuario h "
                + "where h.login='" + usuario.getLogin() + "' "
                + " and h.activo is true "
                + "and h.password='" + encriptarContrasena(usuario.getLogin(), usuario.getPassword()) + "'");
        existeUsuario = !lista.isEmpty();
        return existeUsuario;
    }
    
    
    
    
    @Override
    public Boolean verificaUsuarioMExterno(Usuario usuario) {
        Boolean existeUsuario;
        System.out.println("contraseña:::::::::::::::::::::::::::::::::::::::::::::::::::"+usuario.getPassword() );
        System.out.println("enriptado"+encriptarContrasena("mexterno", usuario.getPassword()));
        String usuarioLogin="mexterno";
        List<Usuario> lista = hibernateTemplate.find(""
                + "select h "
                + "from Usuario h "
                + "where h.login='"+usuarioLogin+"' "
                + " and h.activo is true "
                + "and h.password='" + encriptarContrasena("mexterno", usuario.getPassword()) + "'");
        existeUsuario = !lista.isEmpty();
        System.out.println("45645646546546465"+!lista.isEmpty());
        return existeUsuario;
    }

    @Override
    public Boolean verificaExistenciaUsuarioRegistro(Usuario usuario) {
        Boolean existeUsuario;
        List<Usuario> lista = hibernateTemplate.find(""
                + "select h "
                + "from Usuario h "
                + "where h.login='" + usuario.getLogin() + "'");
        existeUsuario = !lista.isEmpty();
        return existeUsuario;
    }

    @Override
    public Boolean validaPassword(String password, String passwordConfirma) {
        Boolean passwordIgual;
        if (password.equals(passwordConfirma)) {
            passwordIgual = true;
        } else {
            passwordIgual = false;
        }
        return passwordIgual;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public Usuario guardaPersonaUsuario(Persona persona, Usuario usuario, Long idUsuarioLogueado) throws Exception {
        try {
            Date fechaProceso = utilitariosService.obtenerFechaServidor();

            String loginUsuario;
            loginUsuario = usuario.getLogin().trim();
            usuario.setActivo(EnumEstado.ACTIVO.getCodigo());
            usuario.setFechaCreacion(fechaProceso);
            usuario.setLogin(loginUsuario);
            usuario.setNombres(usuario.getNombres().trim());
            usuario.setPrimerApellido(usuario.getPrimerApellido().trim());
            usuario.setSegundoApellido(usuario.getSegundoApellido().trim());
            usuario.setNumeroDocumento(usuario.getNumeroDocumento().trim());
            usuario.setTipoUsuario(EnumTipoUsuario.USUARIOEXTERNO.getCodigo());
            usuario.setPassword(encriptarContrasena(usuario.getLogin(), usuario.getPassword()));
            usuario.setFechaUltimaModificacion(fechaProceso);
            usuario = persistUsuario(usuario);
            UsuarioRol usuariorol = new UsuarioRol();
            usuariorol.setFechaInicio(fechaProceso);
            usuariorol.setVigente(true);
            usuariorol.setUsuario(usuario);
            usuariorol.setUsuarioModificador(usuario.getIdUsuario());
            usuariorol.setFechaUltimaModificacion(fechaProceso);
            usuariorol.setRol(usuarioRolService.findRolPorCodigo(EnumTipoUsuario.USUARIOEXTERNO.getCodigo()));
            usuarioRolService.persistUsuarioRol(usuariorol);
            usuario.setUsuarioModificador(usuario.getIdUsuario());
            mergeUsuario(usuario);
            return usuario;
        } catch (Exception e) {
            String nroerror = errorAplicacionService.guardarErrorAplicacion(idUsuarioLogueado, EnumModulosSistema.REGISTRO_DE_USUARIO.getIdModulo(), "guardaPersonaUsuario", e);
            throw new Exception(nroerror);
        }
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public Usuario guardaPersonaUsuarioExterno(Usuario usuario, Long idUsuarioLogueado) throws Exception {
        try {
            Date fechaProceso = utilitariosService.obtenerFechaServidor();

            String loginUsuario;
            loginUsuario = usuario.getLogin().trim();
            usuario.setActivo(EnumEstado.ACTIVO.getCodigo());
            usuario.setFechaCreacion(fechaProceso);
            usuario.setLogin(loginUsuario);
            usuario.setNombres(usuario.getNombres().trim());
            usuario.setTipoUsuario(EnumTipoUsuario.USUARIOEXTERNO.getCodigo());
            usuario.setPassword(encriptarContrasena(usuario.getLogin(), usuario.getPassword()));
            usuario.setFechaUltimaModificacion(fechaProceso);
            usuario = persistUsuario(usuario);
            UsuarioRol usuariorol = new UsuarioRol();
            usuariorol.setFechaInicio(fechaProceso);
            usuariorol.setVigente(true);
            usuariorol.setUsuario(usuario);
            usuariorol.setUsuarioModificador(usuario.getIdUsuario());
            usuariorol.setFechaUltimaModificacion(fechaProceso);
            usuariorol.setRol(usuarioRolService.findRolPorCodigo(EnumTipoUsuario.USUARIOEXTERNO.getCodigo()));
            usuarioRolService.persistUsuarioRol(usuariorol);
            usuario.setUsuarioModificador(usuario.getIdUsuario());
            mergeUsuario(usuario);
            return usuario;
        } catch (Exception e) {
            String nroerror = errorAplicacionService.guardarErrorAplicacion(idUsuarioLogueado, EnumModulosSistema.REGISTRO_DE_USUARIO.getIdModulo(), "guardaPersonaUsuario", e);
            throw new Exception(nroerror);
        }
    }

    @Override
    public Usuario obtieneUsuarioLogueado(Usuario usuario) {
        List<Usuario> lista = hibernateTemplate.find(""
                + "select h "
                + "from Usuario h "
                + "where h.login='" + usuario.getLogin() + "' "
                + " and h.activo is true "
                + "and h.password='" + encriptarContrasena(usuario.getLogin(), usuario.getPassword()) + "'");
        if (!lista.isEmpty()) {
            return lista.get(0);
        } else {
            return new Usuario();
        }
    }
    
    @Override
    public Usuario obtieneUsuarioLogueadoMexterno(Usuario usuario) {
        List<Usuario> lista = hibernateTemplate.find(""
                + "select h "
                + "from Usuario h "
                + "where h.login='" + usuario.getLogin() + "' "
                + " and h.activo is true");
        if (!lista.isEmpty()) {
            return lista.get(0);
        } else {
            return new Usuario();
        }
    }

    @Override
    public String generaNombreCompletoUsuario(Usuario usuario) {
        String nombreCompleto = "";

        if (!usuario.getNombres().equals("null")) {
            nombreCompleto = usuario.getNombres();
        }
        if(usuario.getTipoUsuario().equals(EnumTipoUsuario.USUARIOINTERNO.getCodigo())){
                nombreCompleto = nombreCompleto + " " + usuario.getPrimerApellido() + " " + usuario.getSegundoApellido();
        }

        return nombreCompleto;
    }

    @Override
    public String generaNombreCompletoUsuarioInterno(Usuario usuario) {
        return usuario.getNombres() + " " + usuario.getPrimerApellido() + " " + usuario.getSegundoApellido();
    }

    @Override
    public Usuario encuentraUsuarioPorLogin(String login) {
        List<Usuario> lista = hibernateTemplate.find(""
                + "select j "
                + "from Usuario j "
                + "where j.login = '" + login + "' ");
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;

    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void guardaUsuarioPersonaConfirmado(Usuario usuario) throws Exception {
        usuario.setActivo(true);
//        usuario.getPersona().setVigente(true);
        mergeUsuario(usuario);
//        personaService.mergePersonas(usuario.getPersona());

    }

    @Override
    public String[] validaDatosFormulario(Persona persona, Usuario usuario, String password, String passwordConfirma) {
        String[] colores = new String[8];
        String mensaje = "";
        if (persona.getNombres() == null || persona.getNombres().equals("")) {
            colores[0] = "red";
            mensaje = mensaje + "Nombres, ";
        } else {
            colores[0] = null;
        }
        if (persona.getApellidoPaterno().equals("") || persona.getApellidoPaterno() == null) {
            colores[1] = "red";
            mensaje = mensaje + "Apellido Paterno, ";
        } else {
            colores[1] = null;
        }
        if (persona.getFechaNacimiento() == null) {
            colores[2] = "red";
            mensaje = mensaje + "Fecha de Nacimiento, ";
        } else {
            colores[2] = null;
        }
        if (persona.getNumeroDocumento().equals("") || persona.getNumeroDocumento() == null) {
            colores[3] = "red";
            mensaje = mensaje + "Número de Documento, ";
        } else {
            colores[3] = null;
        }
        if (usuario.getLogin() == null || usuario.getLogin().equals("")) {
            colores[4] = "red";
            mensaje = mensaje + "Login, ";
        } else {
            colores[4] = null;
        }
        if (password == null || password.equals("")) {
            colores[5] = "red";
            mensaje = mensaje + "Contraseña, ";
        } else {
            colores[5] = null;
        }
        if (passwordConfirma == null || passwordConfirma.equals("")) {
            colores[6] = "red";
            mensaje = mensaje + "Repita Contraseña, ";
        } else {
            colores[6] = null;
        }

        colores[7] = mensaje;
        return colores;
    }

    @Override
    public Boolean verificaNumeroDocumento(String numeroDocumento) {
        Boolean numeroRepetido;
        List<Persona> lista = hibernateTemplate.find(""
                + "select c "
                + "from Persona c "
                + "where c.numeroDocumento = '" + numeroDocumento + "'");
        if (!lista.isEmpty()) {
            numeroRepetido = true;
        } else {
            numeroRepetido = false;
        }
        return numeroRepetido;

    }

    @Override
    public Boolean correoValido(String correo) {
        Boolean correoValido;
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            correoValido = true;
        } else {
            correoValido = false;
        }
        return correoValido;
    }

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
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 05/06/2014
     * Descripcion: Se agrega la navegación cuando el usuario es responsable hacia
     * la bandeja de responsables
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 12/08/2014
     * Descripcion: Se debe sacar del flujo la etapa de digitalización
     * para ello se habilita la pagina de busqueda de digitalizacion
     * </pre>
     */
    @Override
    public String derivaALasBandejasSegunaElUsuario(Usuario usuario) {

        List<Rol> listaRoles = usuarioRolService.encuentraRolPorUsuario(usuario);
        try {
            if (usuario.getLogin().equals("modbd")) {
                return "modificacionGeneral";
            }
            //verificar si el usuario ingresado es de notificacion
            //mediante un metodo buscar si el usuario tiene el rol de publicacion
            if (verificaSiUsuarioTieneRolIngresado(usuario, EnumRolesUsuario.TECNICO_EN_PUBLICACION)) {
                return ("publicacionDocumentacion");
            }
            if (verificaSiUsuarioTieneRolIngresado(usuario, EnumRolesUsuario.TECNICO_DIGITALIZADOR)) {
                return ("digitalizacionDocumentacion");
            }
            if (verificaSiUsuarioTieneRolIngresado(usuario, EnumRolesUsuario.TECNICO_RECAUDACIONES)) {
                return ("recibo");
            }

        } catch (Exception ex) {
            Logger.getLogger(UsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (usuario.getTipoUsuario().equals(EnumTipoUsuario.USUARIOEXTERNO.getCodigo())) {
            return "bandejaTramitesSolicitudUsuario";
        } else {
            if (usuarioRolService.verificaSiExisteRol(usuario, EnumRolesUsuario.VENTANILLA.getCodigo())) {
                return "busquedaTramiteCodigoDia";
            } else {
                if (usuarioRolService.verificaSiExisteRol(usuario, EnumRolesUsuario.TECNICO_NOTIFICACION.getCodigo())) {
                    return "bandejaNotificaciones";
                }
            }
            if (usuarioRolService.verificaSiExisteRol(usuario, EnumRolesUsuario.RESPONSABLE_SIGNOS_DISTINTIVOS.getCodigo())
                    || usuarioRolService.verificaSiExisteRol(usuario, EnumRolesUsuario.DIRECTOR_PROPIEDAD_INDUSTRIAL.getCodigo())) {
                return "bandejaResponsables";
            }
        }
        return "busquedaModificacionGeneral";
    }

    @Override
    public Boolean validaNumeroDocumentoUsuario(Persona persona) {
        List<Persona> lista = hibernateTemplate.find(""
                + "select c "
                + "from Persona c "
                + "where c.numeroDocumento = '" + persona.getNumeroDocumento() + "'");
        return lista.isEmpty();
    }

    @Override
    public Usuario encuentraUsuarioConMenorCargaLaboral(List<UsuarioRol> listaUsuarioRol) {
//        la carga minima de trabajo será de 10000 tramites
        Integer minimaCarga = 10000;
//        creamos el usuario al cual se le asignará 
        Usuario usuario = null;
        for (UsuarioRol usuarioRol : listaUsuarioRol) {
//            segun los usuarios que tengan dichos roles en esta regional buscamos en la tabla TramiteFlujoEtapa la cual almacena los registros de los tramites que cada usuario está atendiendo
            List<TramiteFlujoEtapa> lista = hibernateTemplate.find(""
                    + "select j "
                    + "from TramiteFlujoEtapa j "
                    + "where j.usuario.idUsuario = " + usuarioRol.getUsuario().getIdUsuario() + " "
                    + "and j.fechaFin is null ");
//            si la lista tiene datos quiere decir que tiene tramites asignados 
            if (!lista.isEmpty()) {
//                preguntamos si los tramites que tiene asignados es menor a la carga minima 
                if (lista.size() < minimaCarga) {
                    usuario = usuarioRol.getUsuario();
//                    de ser menor a la carga minima cambiamos el valor de carga minima al nuevo 
                    minimaCarga = lista.size();
                }
            } else {
//                de no existir tramites asignados a este usuario inmediatamente elegimos a este usuario como candidato libre
                usuario = usuarioRol.getUsuario();
                minimaCarga = 0;
                break;
            }
        }
//       se retorna el usuario que tenga menor carga laboral 
        return usuario;
    }

    @Override
    public Usuario encuentraUsuarioParaAsignarTramite(FlujoEtapa flujoEtapa, Regional regional) {//System.out.println("\n\n>>>>>>REGIONAL Q LLEGA "+regional+"flujo eta llega  "+flujoEtapa);
//        obtenemos los usuarios con ese rol que existen en la regional del usuario que concluyo el proceso anterior del tramite
        List<UsuarioRol> listaRolesPorRegional = usuarioRolService.listaRolesPorRegional(flujoEtapa.getRol(), regional);
        if (listaRolesPorRegional.isEmpty()) {
//            de no existir regionales con este Rol tenemos que buscar este Usuario con dicho Rol en la Regional Sede
            listaRolesPorRegional = usuarioRolService.listaRolesPorRegional(flujoEtapa.getRol(), regionalService.encuentraRegionalSede());
        }
//        una vez tengamos la lista de los Usuarios con este rol por region,  encontramos al usuario con ese rol que este con menor carga laboral
        return encuentraUsuarioConMenorCargaLaboral(listaRolesPorRegional);

    }

    @Override
    public Regional obtieneRegionalPorUsuario(Usuario usuario) {
        List<Regional> lista = hibernateTemplate.find(""
                + "select ch.regional "
                + "from Usuario ch "
                + "where ch.idUsuario='" + usuario.getIdUsuario() + "' and ch.activo=true");
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return new Regional();
    }

    @Override
    public Boolean verificaRolRevisorUsuario(Usuario usuario) {
        List<UsuarioRol> lista = hibernateTemplate.find(""
                + " select e from UsuarioRol e "
                + "where e.usuario.idUsuario = " + usuario.getIdUsuario() + " "
                + " and e.rol.idRol in ("
                + " select r.idRol from Rol r where r.codigo in ('" + EnumRolesUsuario.DIRECTOR_PROPIEDAD_INDUSTRIAL.getCodigo() + "', '" + EnumRolesUsuario.RESPONSABLE_SIGNOS_DISTINTIVOS.getCodigo() + "')"
                + ")"
        );

        if (!lista.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean verificaExistenciaPersonaUsuario(Persona persona, Usuario usuario) {
        Boolean existeEnUsuario;
        List<Usuario> lista = hibernateTemplate.find(""
                + "select s "
                + "from Persona s "
                + "where s.idPersona = '" + persona.getIdPersona() + "'");
        existeEnUsuario = !lista.isEmpty();
        return existeEnUsuario;

//          List<Usuario> lista = hibernateTemplate.find(""
//                + "select ch "
//                + "from Usuario ch "
//                + "where ch.persona.idPersona = '" + persona.getIdPersona() + "'");
    }

    @Override
    public Boolean[] validaCamposRegitroUsuario(Persona persona, Usuario usuario, String tipoDocumento, String lugarDeExpedicion, String genero, String password) {
        try {

            int sw = 0;
            Boolean validaFormulario = true;
            Boolean validaNombreUsuario = false;
            Boolean validaApellidoPaternoUsuario = false;
            Boolean validaFechaNacimientoUsuario = false;
            Boolean validaGeneroUsuario = false;
            Boolean validaTipoDocumentoUsuario = false;
            Boolean validaNumeroDocumentoUsuario = false;
            Boolean validaLugarExpedicionUsuario = false;
            Boolean validaNombreLoginUsuario = false;
            Boolean validaContraseñaUnoUsuario = false;
            Boolean validacontraseñaDosUsuario = false;
            Boolean validaCorreoElectronico = false;
            Boolean validaCorreoElectronicoSinFormato = false;

            if (usuario.getNombres().equals("") || usuario.getNombres() == null) {

                sw = 1;
                validaNombreUsuario = true;
            }

            if (usuario.getPrimerApellido().equals("") || usuario.getPrimerApellido() == null) {

                sw = 1;
                validaApellidoPaternoUsuario = true;
            }

            if (usuario.getFechaNacimiento() == null) {

//                sw = 1;
//                validaFechaNacimientoUsuario = true;
            }

            if (genero.equals("") || genero.isEmpty()) {

                sw = 1;
                validaGeneroUsuario = true;
            }

            if (usuario.getNumeroDocumento() == null || usuario.getNumeroDocumento().isEmpty()) {

                sw = 1;
                validaNumeroDocumentoUsuario = true;
            }

            if ((tipoDocumento.equals("") || tipoDocumento.equals("null"))) {

                validaTipoDocumentoUsuario = true;
                sw = 1;

                if ((lugarDeExpedicion.equals("") || lugarDeExpedicion.equals("null"))) {

                    validaLugarExpedicionUsuario = true;

                }
            } else {
                if (tipoDocumento.charAt(2) != 'N') {

                    if ((lugarDeExpedicion.equals("") || lugarDeExpedicion.equals("null"))) {

                        validaLugarExpedicionUsuario = true;
                        sw = 1;
                    }
                }
            }

            if (usuario.getCorreoElectronico().equals("") || usuario.getCorreoElectronico() == null) {

                sw = 1;
                validaCorreoElectronico = true;
            } else {

                if (!utilitariosService.validateEmail(usuario.getCorreoElectronico())) {

                    sw = 1;
                    validaCorreoElectronicoSinFormato = true;
                }
            }

            if (usuario.getLogin() == null || usuario.getLogin().equals("")) {

                sw = 1;
                validaNombreLoginUsuario = true;
            }

            if ((usuario.getPassword() == null) || (usuario.getPassword().equals(""))) {

                sw = 1;
                validaContraseñaUnoUsuario = true;
            }

            if (password.equals("") || password.equals("null") || password.isEmpty()) {

                sw = 1;
                validacontraseñaDosUsuario = true;
            }

            if (sw == 1) {

                validaFormulario = false;
            }

            Boolean[] listaErrores = {validaFormulario, validaNombreUsuario, validaApellidoPaternoUsuario, validaFechaNacimientoUsuario, validaGeneroUsuario, validaTipoDocumentoUsuario, validaNumeroDocumentoUsuario, validaLugarExpedicionUsuario, validaNombreLoginUsuario, validaContraseñaUnoUsuario, validacontraseñaDosUsuario, validaCorreoElectronico, validaCorreoElectronicoSinFormato};

            return listaErrores;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Boolean[] validaCamposRegitroUsuarioExterno(Usuario usuario, String password) {
        try {
            int sw = 0;
            Boolean validaFormulario = true;
            Boolean validaNombreUsuario = false;
            Boolean validaNombreLoginUsuario = false;
            Boolean validaContraseñaUnoUsuario = false;
            Boolean validaCorreoElectronico = false;
            Boolean validaCorreoElectronicoSinFormato = false;
            if (usuario.getNombres().equals("") || usuario.getNombres() == null) {
                System.out.println("1");
                sw = 1;
                validaNombreUsuario = true;
            }
            if (usuario.getCorreoElectronico().equals("") || usuario.getCorreoElectronico() == null) {
                System.out.println("2");
                sw = 1;
                validaCorreoElectronico = true;
            } else {
                if (!utilitariosService.validateEmail(usuario.getCorreoElectronico())) {
                    System.out.println("3");
                    sw = 1;
                    validaCorreoElectronicoSinFormato = true;
                }
            }
            if (usuario.getLogin() == null || usuario.getLogin().equals("")) {
                System.out.println("4");
                sw = 1;
                validaNombreLoginUsuario = true;
            }
            if (password.equals("") || password.equals("null") || password.isEmpty()) {
                System.out.println("6");
                sw = 1;
                validaContraseñaUnoUsuario = true;
            }
            if (sw == 1) {
                System.out.println("7");
                validaFormulario = false;
            }
            Boolean[] listaErrores = {validaFormulario, validaNombreUsuario, validaNombreLoginUsuario, validaContraseñaUnoUsuario, validaCorreoElectronico, validaCorreoElectronicoSinFormato};
            return listaErrores;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Boolean[] validaCamposModificacion(Persona persona) {
        try {
            int sw = 0;
            Boolean validaFormulario = true;
            Boolean validaNombreUsuario = false;
            Boolean validaApellidoPaternoUsuario = false;

            if (persona.getNombres().equals("") || persona.getNombres() == null) {
                sw = 1;
                validaNombreUsuario = true;
            }
            if (persona.getApellidoPaterno().equals("") || persona.getApellidoPaterno() == null) {
                sw = 1;
                validaApellidoPaternoUsuario = true;
            }
            if (sw == 1) {
                validaFormulario = false;
            }

            Boolean[] listaErrores = {validaFormulario, validaNombreUsuario, validaApellidoPaternoUsuario};
            return listaErrores;
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * Método que permite obtener al Usuario que realizará la notificación del
     * Trámite
     *
     * @param flujoEtapa
     * @param regional
     * @param usuario
     * @return Usuario
     * @throws java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo existeFecha
     * ----------------------------------------------------
     * </pre>
     */
    @Override
    public Usuario encuentraUsuarioParaNotificarTramite(FlujoEtapa flujoEtapa, Regional regional, Usuario usuario) throws Exception {
        try {
            guardarLogServidor(EnumTipoOperacionUsuario.LISTAR.getCodigo(), usuario.getIdUsuario(), "Obtener el listado de Usuarios por Regional", "UsuarioServiceImpl.encuentraUsuarioParaNotificarTramite");
            //obtenemos los usuarios con ese rol que existen en la regional del usuario que concluyo el proceso anterior del tramite
            List<UsuarioRol> listaRolesPorRegional = usuarioRolService.listaRolesPorRegional(flujoEtapa.getRol(), regional);
            if (listaRolesPorRegional.isEmpty()) {
                //de no existir regionales con este Rol tenemos que buscar este Usuario con dicho Rol en la Regional Sede
                listaRolesPorRegional = usuarioRolService.listaRolesPorRegional(flujoEtapa.getRol(), regionalService.encuentraRegionalSede());
            }
            //una vez tengamos la lista de los Usuarios con este rol por region,  encontramos al usuario con ese rol que este con menor carga laboral
            return encuentraUsuarioNotificadorConMenorCargaLaboral(listaRolesPorRegional, usuario);

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Método que permite obtener al Usuario notificador con menor carga Laboral
     *
     * @param listaUsuarioRol
     * @param usuarioSolicitante
     * @return Usuario
     * @throws java.lang.Exception      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 18/02/2015
     * Descripcion: Se agrega el metodo encuentraUsuarioNotificadorConMenorCargaLaboral
     * ----------------------------------------------------
     * </pre>
     */
    @Override
    public Usuario encuentraUsuarioNotificadorConMenorCargaLaboral(List<UsuarioRol> listaUsuarioRol, Usuario usuarioSolicitante) throws Exception {
        try {
            guardarLogServidor(EnumTipoOperacionUsuario.LISTAR.getCodigo(), usuarioSolicitante.getIdUsuario(), "Listar los registros de Notificacion de acuerdo al usuario", "UsuarioServiceImpl.encuentraUsuarioNotificadorConMenorCargaLaboral");
            //la carga minima de trabajo será de 10000 tramites
            Integer minimaCarga = 10000;
            //creamos el usuario al cual se le asignará 
            Usuario usuario = null;
            for (UsuarioRol usuarioRol : listaUsuarioRol) {
                //segun los usuarios que tengan dichos roles en esta regional buscamos en la tabla TramiteFlujoEtapa la cual almacena los registros de los tramites que cada usuario está atendiendo
                List<Notificacion> lista = hibernateTemplate.find(""
                        + "select e "
                        + "from Notificacion e "
                        + "where e.idUsuarioAsignado = " + usuarioRol.getUsuario().getIdUsuario() + " "
                        + "and e.estadoNotificacion.codigo = 'SOL' ");
                //si la lista tiene datos quiere decir que tiene tramites asignados 
                if (!lista.isEmpty()) {
                    //preguntamos si los tramites que tiene asignados es menor a la carga minima 
                    if (lista.size() < minimaCarga) {
                        usuario = usuarioRol.getUsuario();
                        //de ser menor a la carga minima cambiamos el valor de carga minima al nuevo 
                        minimaCarga = lista.size();
                    }
                } else {
                    //de no existir tramites asignados a este usuario inmediatamente elegimos a este usuario como candidato libre
                    usuario = usuarioRol.getUsuario();
                    minimaCarga = 0;
                    break;
                }
            }
            //se retorna el usuario que tenga menor carga laboral 
            return usuario;
        } catch (Exception e) {
            throw e;

        }

    }

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
    @Override
    public Boolean verificaSiUsuarioTieneRolIngresado(Usuario usuario, EnumRolesUsuario enumRolesUsuario) throws Exception {

        List<UsuarioRol> listUsuarioRol = hibernateTemplate.find(""
                + " select e "
                + " from UsuarioRol e "
                + " where e.usuario.idUsuario = " + usuario.getIdUsuario()
                + " and e.rol.codigo = '" + enumRolesUsuario.getCodigo() + "'"
                + " and e.vigente is true");

        if (!listUsuarioRol.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * método que permite modificar solo la contrasenia de un usuario registrado
     *
     * @param password
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 12/08/2015
     * Descripcion: Se agrega el metodo modificarContraseniaDeUsuarioRegistrado que permite modificar la contrasenia de un usuario registrado
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    @Override
    public void modificarContraseniaDeUsuarioRegistrado(Usuario usuario, String password) {
        try {
            Date fecha = utilitariosService.obtenerFechaServidor();
            usuario.setPassword(password);
            usuario.setPassword(encriptarContrasena(usuario.getLogin(), usuario.getPassword()));
            usuario.setFechaUltimaModificacion(fecha);
            mergeUsuario(usuario);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
    @Override
    public Boolean verificaExistenciaUsuarioLogin(Usuario usuario) {
        Boolean existeUsuario;
        List<Usuario> lista = hibernateTemplate.find(""
                + "select h "
                + "from Usuario h "
                + "where h.login='" + usuario.getLogin() + "' "
                + "");
        existeUsuario = !lista.isEmpty();
        return existeUsuario;
    }

    @Override
    public List<Persona> listaNombrePersonasEtapaTramite(String etapaTramite, String idRegional) {
        String regional = " ";
        String etapaDeTramite = " ";
        if ((idRegional != null) && (!idRegional.equals(""))) {
            regional = " us.regional.idRegional='" + idRegional + "' and ";

        }
        if ((etapaTramite != null) && (!etapaTramite.equals(""))) {
            etapaDeTramite = " and f.etapaTramite='" + etapaTramite + "'";

        }
        try {
            List<Persona> lista = hibernateTemplate.find(""
                    + " select p from Persona p where p.idPersona in ("
                    + " select us.persona.idPersona FROM Usuario us where" + regional + " us.idUsuario in ("
                    + "select u.usuario.idUsuario FROM UsuarioRol u where u.rol.idRol in ( "
                    + "select distinct f.rol.idRol FROM FlujoEtapa f "
                    + "where f.flujo.idFlujo=1 " + etapaDeTramite + ")))");
            if (!lista.isEmpty()) {
                return lista;
            }
        } catch (DataAccessException e) {
        }
        return Collections.emptyList();
    }

    @Override
    public Boolean validaCorreoRepetido(Usuario usuario) {
        Boolean existeCorreo;
        List<Usuario> lista = hibernateTemplate.find(""
                + "select ch "
                + "from Usuario ch "
                + "where ch.correoElectronico='" + usuario.getCorreoElectronico() + "' "
                + "");
        existeCorreo = !lista.isEmpty();
        return existeCorreo;
    }

    @Override
    public List<Usuario> encuentraPorIdUsuario(Long idUsuario) {

        List<Usuario> lista = hibernateTemplate.find(""
                + "select ch "
                + "from Usuario ch "
                + "where ch.idUsuario=" + idUsuario
                + "");

        return lista;
    }

}
