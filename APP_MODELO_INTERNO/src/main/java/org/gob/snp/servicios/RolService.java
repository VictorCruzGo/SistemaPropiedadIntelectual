package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.Usuario;

public interface RolService extends GenericDao<Rol> {

    
    
    
    
    
    Rol persistRol(Rol rol) throws Exception;
    
    
    Rol mergeRol(Rol rol) throws Exception;
    
    
    void removeRol(Rol rol) throws Exception;
    
    
    /**
     * método que permite listar todos los Roles
     *
     * @return List
     * @version 2.0, 20/06/2014
     * @author Jonathan
     */
    List<Rol> listaRoles();
    
    /**
     * Método que permite listar todos los roles por Usuario.
     *
     * @param usuario
     * @return List <Rol>
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 20/06/2014
     * Descripcion: Se crea el método listaRolesPorUsuario
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 19/08/2015
     * Descripcion: Se crea el método listaRolesPorUsuario
     * </pre>
     */
    
    List<Rol> listaRolesPorUsuario(Usuario usuario);
    
}