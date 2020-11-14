package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * Publicacion
 *
 * @author Susana Escobar Paz
 * @see PublicacionServiceImpl
 * @see DocumentoPublicacion
 * @version 1.0, 23/01/2015
 *
 */

public interface PublicacionService extends GenericDao<Publicacion> {

 /**
     * método que permite insertar registros en la tabla Publicacion
     *
     * @param publicacion
      * @return Publicacion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo persistPublicacion, que inserta registros en la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @throws java.lang.Exception
     */
   public Publicacion persistPublicacion(Publicacion publicacion) throws Exception;

      /**
     * método que permite actualizar registros en la tabla Publicacion
     *
     * @param publicacion 
     * @return Publicacion      
     * 
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo mergePublicacion, que actualiza registros en la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public Publicacion mergePublicacion(Publicacion publicacion) throws Exception;

      /**
     * método que permite eliminar registros en la tabla Publicacion
     *
     * @param publicacion
     
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo removePublicacion, que elimina registros en la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public void removePublicacion(Publicacion publicacion) throws Exception;

      /**
     * método que permite listar registros de la tabla Publicacion
     *
     * @param
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo listaPublicacion, que recupera una lista de  registros de la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<Publicacion> listaPublicacion();
    
    
    /**
     * método que permite completar registros en la tabla Publicacion
     *
     * @param publicacion
     * @param usuario
     * @return 
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 02/03/2015
     * Descripcion: Se agrega el metodo registraOtrosDatosPublicacion, que actualiza registros en la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public Publicacion registraOtrosDatosPublicacion(Publicacion publicacion, Usuario usuario);
    
     /**
     * método que crear nueva Publicacion, registro en la tabla Publicacion
     *
     * @param usuario
     * @return 
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 02/03/2015
     * Descripcion: Se agrega el metodo creaPublicacion, que inserta un nuevo  registro en la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public Publicacion creaPublicacion(Usuario usuario);
    
    /**
     * método que permite completar registros en la tabla Publicacion en estado Enviado
     *
     * @param publicacion
     * @param usuario
     * @return 
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 13/04/2015
     * Descripcion: Se agrega el metodo actualizaPublicacionEnviado, que actualiza registros en la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public Publicacion actualizaPublicacionEnviado(Publicacion publicacion, Usuario usuario);
    
    
     /**
     * método que permite inicializar el campo finNumeracion
     *
     * @param publicacion
     * @param usuario
     * @return 
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 22/04/2015
     * Descripcion: Se agrega el metodo borrarFinPublicacion, que inicializa el campo finNumeracion de la tabla Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public void borrarFinPublicacion(Publicacion publicacion, Usuario usuario);
    
    /**
     * método que recupera el nombre de la marca para un tramite de tipo REGS
     *
     * @param tramite
     * @param nombreTabla
     * @param usuario
     * @return 
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 24/04/2015
     * Descripcion: Se agrega el metodo recuperaMarcaPatenteDerechoAutor, que recupera el nombre de la marca para un tramite de tipo REGS
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public String recuperaMarcaPatenteDerechoAutor(Tramite tramite, String nombreTabla, Usuario usuario);  
    
    /**
     * método que recupera la cantidad de tramites asociados a una publicacion 
     * @param publicacion
     * @param usuario
     * @return
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 22/06/2015
     * Descripcion: Se agrega el metodo recuperaCantidadTramitesPorPublicacion, que recupera la cantidad de tramites asociados a una publicacion  
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @throws java.lang.Exception
     */
    public Long recuperaCantidadTramitesPorPublicacion(Publicacion publicacion, Usuario usuario) throws Exception;
    
    /**
     * método que actualiza el estadoProceso de una publicacion a Finalizado 
     * @param publicacion
     * @param usuario
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 22/06/2015
     * Descripcion: Se agrega el metodo finalizarPublicacion, que actualiza el estadoProceso de una publicacion a Finalizado 
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @throws java.lang.Exception
     */
    public void finalizarPublicacion(Publicacion publicacion, Usuario usuario) throws Exception;
    
      /**
     * método que valida si una publicacion tiene numnero de gaceta  
     * @param publicacion
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/06/2015
     * Descripcion: Se agrega el metodo validadPublicacionTerminada, que verifica que una publicacion ha sido terminada
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @return 
     */
    public Boolean validadPublicacionTerminada(Publicacion publicacion); 
    
   }
