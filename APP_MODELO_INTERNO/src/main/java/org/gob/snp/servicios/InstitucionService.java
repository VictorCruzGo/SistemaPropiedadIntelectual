/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Institucion;
import org.gob.snp.entidades.Usuario;

/**
 * Mapeo de la Entidad a persistir Tabla Institucion
 *
 * @author Susana Escobar Paz
 * @see Institucion
 * @see InstitucionService
 * @version 1.0, 27/04/2015  <pre>
 *
 * </pre>
 */
public interface InstitucionService extends GenericDao<Institucion> {

    /**
     * método que permite insertar registros en la tabla Institucion
     *
     * @param institucion
     * @return institucion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo persistInstitucion, que inserta registros en la tabla Institucion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Institucion persistInstitucion(Institucion institucion) throws Exception;

    /**
     * método que permite actualizar registros en la tabla Institucion
     *
     * @param institucion
     * @return institucion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo mergeInstitucion, que actualiza registros en la tabla Institucion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Institucion mergeInstitucion(Institucion institucion) throws Exception;

    /*
     * método que permite elominar registros en la tabla Institucion
     *
     * @param institucion
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo removeInstitucion, que elimina registros en la tabla Institucion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    void removeInstitucion(Institucion institucion) throws Exception;

    /*
     * método que permite listar registros de la tabla Institucion
     *
     * @param 
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo listaInstitucion, que recupera una lista de  registros de la tabla Institucion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    List<Institucion> listaInstitucion();

       /**
     * método que permite encontrar el siguiente codigo de Registro
     *
     * @param usuario
     * @return registro
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo obtenerSiguienteRegistro, que permite encontrar el siguiente codigo de Registro
     * ----------------------------------------------------
     * Modificado: 
     * Fecha: 
     * Descripcion: 
     * </pre>
     */
    public String obtenerSiguienteRegistro(Usuario usuario);
}
