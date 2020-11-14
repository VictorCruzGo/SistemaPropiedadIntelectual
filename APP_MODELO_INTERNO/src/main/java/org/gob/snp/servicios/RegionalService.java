package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface RegionalService extends GenericDao<Regional> {

    /**
     * metodo que permite gurdar Regional
     *
     * @param regional
     * @return Regional
     * @version 1.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Regional persistRegional(Regional regional) throws Exception;

    /**
     * metodo que modifica Regional
     *
     * @param regional
     * @return Regional
     * @version 1.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Regional mergeRegional(Regional regional) throws Exception;

    /**
     * metodo que elimina Regional
     *
     * @param regional
     * @version 1.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeRegional(Regional regional) throws Exception;

    /**
     * metodo que modifica Regional
     *
     * @return List
     * @version 1.0, 10/07/2014
     * @author chano
     */
    public List<Regional> listaRegional();
    
    /**
     * Método que encuentra Regional Sede
     *
     * @return List
     * @version 1.0, 12/09/2014
     * @author Jonathan Valdivia
     */
    public Regional encuentraRegionalSede();

     /**
     * metodo obtiene Regional por codigo Ciudad Notificacion
     * @param codigo
     * @return Regional
     * @version 1.0, 16/09/2014
     * @author Henrry Guzman
     */
    Regional obtieneRegionalPorCiudadNotificacion(String codigo);
    
    
    /**
     * Método que permite obtener la Regional de Direccion a partir de Tramite
     *
     *
     * @param tramite
     * @param usuario
     * @return Usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 24/02/2015
     * Descripcion: Se agrega el metodo encuentraRegionalDeDireccionPorTramite,
     * dada un determinado Tramite obtener su regional donde se encuentra registrada
     * su dirección de notificación, a partir del primer item del Listado de Direccion.
     * ----------------------------------------------------
     * </pre>
     */
    Regional encuentraRegionalDeDireccionPorTramite(Tramite tramite, Usuario usuario) throws Exception;
    
    

    
}
