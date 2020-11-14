package org.gob.snp.servicios;

import org.gob.snp.GenericDao;
import java.util.List;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.UsuarioRol;


/** 
 * @author 
 * <pre> 
 * ------------------------------------------------------------------------------------------- 
 * Modificado: Jonathan Valdivia  Fecha: 08/12/2014
 * Tarea: Método para verificar si el usuario es Director dePropiedad Industrial
 * Metodos Modificados: ninguno
 * Metodos Agregados: verificaSiUsuarioEsDirector
 * </pre>
 */
public interface UsuarioRolService extends GenericDao<UsuarioRol> {

    /**
     * metodo que permite adicionar Rol
     *
     * @param usuarioRol
     * @return UsuarioRol
     * @version 1.0, 23/06/2014
     * @author Chano
     * @throws java.lang.Exception
     */
    UsuarioRol persistUsuarioRol(UsuarioRol usuarioRol) throws Exception;

    /**
     * metodo que permite modifica Usuario
     *
     * @param usuarioRol
     * @return UsuarioRol
     * @version 1.0, 23/06/2014
     * @author Chano
     * @throws java.lang.Exception
     */
    UsuarioRol mergeUsuarioRol(UsuarioRol usuarioRol) throws Exception;

    /**
     * metodo que permite eliminar UsuarioRol
     *
     * @version 1.0, 23/06/2014
     * @author Chano
     * @param usuarioRol
     * @throws java.lang.Exception
     *
     */
    void removeUsuarioRol(UsuarioRol usuarioRol) throws Exception;

    /**
     * metodo que permite listar todos los usuarioRoles
     *
     * @return List
     * @version 1.0, 23/06/2014
     * @author Chano
     */
    List<UsuarioRol> listaUsuarioRol();

    /**
     * metodo para la búsqueda de un ROL por codigo
     * @version 1.0, 12/08/2014
     * @param String codigo
     * @author Henrry Guzman
     * @return Rol
     */
    Rol findRolPorCodigo(String codigo) throws Exception;
    
    /**
     * Metodo que encuentra Rol por Usuario
     * @version 1.0, 18/08/2014     
     * @author Jonathan Valdivia
     * @param usuario     
     * @return      
     */
    List<Rol> encuentraRolPorUsuario(Usuario usuario);
    
        
    /**
     * Verifica si existe el Rol para ese usuario con el codigo enviado
     *
     * @version 1.0, 10/09/2014
     * @author Jonathan Valdivia          
     * @param usuario          
     * @param codigoRol          
     * @return Boolean
     */
    Boolean verificaSiExisteRol(Usuario usuario, String codigoRol);
        
    /**
     * Lista Todos los Usuarios que tienen dicho Rol en cierta Regional
     *
     * @version 1.0, 12/09/2014
     * @author Jonathan Valdivia                   
     * @param rol                   
     * @param regional                   
     * @return Boolean
     */
    List<UsuarioRol> listaRolesPorRegional(Rol rol, Regional regional);
    
    /**
     * Verifica si el usuario es Director de Propiedad Industrial                     
     * @param usuario
     * @return Boolean
     */
    Boolean verificaSiUsuarioEsDirector(Usuario usuario);
    /**
     * Encuentra los items de UsuarioRol por usuario                    
     * @author Levi Laura
     * @param usuario
     * @return Boolean
     */
    List<UsuarioRol> encuentraUsuarioRolPorUsuario(Usuario usuario); 
     /**
     * Verifica si el usuario es responsable de signos distitivos
     * @author Levi Laura
     * @param usuario
     * @return Boolean
     */
    Boolean verificaSiUsuarioEsResponsable(Usuario usuario);
    /**
     * Saca todos los roles de la tabla UsuarioROl exclusivamente para el responsable de signos , para el reporte por etapas
     * @author Levi Laura
     * @param usuario
     * @return Boolean
     */
    List<UsuarioRol> encuentraUsuarioRolParaResponsableSigno();
    /**
     * Saca todos los UsuarioRol dado un codigo y nombre de rol
     * @author Levi Laura
     * @param usuario
     * @return Boolean
     */
    List<UsuarioRol> listadoUsuarioRolporRol(String codigo, String nombre);
    /**
     * Dado el login se busca el id  de usuario
     * @author Levi Laura
     * @param usuario
     * @return Boolean
     */
    List<Long> BuscaUsuarioporLogin(String login);
    /**
     * Saca todos los roles de la tabla UsuarioROl exclusivamente para el director de propiedad intelectual , para el reporte por etapas
     * @author Levi Laura
     * @param usuario
     * @return Boolean
     */
    List<UsuarioRol> encuentraUsuarioRolParaDirectorPropiedad();
}
