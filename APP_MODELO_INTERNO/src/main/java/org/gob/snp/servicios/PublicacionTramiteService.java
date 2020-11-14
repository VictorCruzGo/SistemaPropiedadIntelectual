package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Publicacion;
import org.gob.snp.entidades.PublicacionTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * PublicacionTramite
 *
 * @author Susana Escobar Paz
 * @see PublicacionTramiteServiceImpl
 * @see PublicacionTramite
 * @version 1.0, 23/01/2015
 *
 */
public interface PublicacionTramiteService extends GenericDao<PublicacionTramite> {

    /**
     * método que permite insertar registros en la tabla PublicacionTramite
     *
     * @param PublicacionTramite
     * @return PublicacionTramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo persistPublicacionTramite, que inserta registros en la tabla PublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public PublicacionTramite persistPublicacionTramite(PublicacionTramite publicacionTramite) throws Exception;

    /**
     * método que permite actualizar registros en la tabla PublicacionTramite
     *
     * @param PublicacionTramite
     * @return PublicacionTramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo mergePublicacionTramite, que actualiza registros en la tabla PublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public PublicacionTramite mergePublicacionTramite(PublicacionTramite publicacionTramite) throws Exception;

    /**
     * método que permite eliminar registros en la tabla PublicacionTramite
     *
     * @param PublicacionTramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo removePublicacionTramite, que elimina registros en la tabla PublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public void removePublicacionTramite(PublicacionTramite publicacionTramite) throws Exception;

    /**
     * método que permite listar registros de la tabla PublicacionTramite
     *
     * @param
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 24/02/2015
     * Descripcion: Se agrega el metodo listaPublicacionTramite, que recupera una lista de  registros de la tabla PublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<PublicacionTramite> listaPublicacionTramite();

    /**
     * método que permite listar registros de la tabla PublicacionTramite
     *
     * @param Publicacion
     * @param Usuario
     * @return List
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 25/02/2015
     * Descripcion: Se agrega el metodo listaPublicacionTramitePorPublicacion, que recupera una lista de PublicacionTramite asociados a una Publicacion, tabla PublicacionTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<PublicacionTramite> listaPublicacionTramitePorPublicacion(Publicacion publicacion, Usuario usuario);

    /**
     * método que permite insertar registros en la tabla PublicacionTramite
     *
     * @param List<Tramite>
     * @param Publicacion
     * @param Usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 23/02/2015
     * Descripcion: Se agrega el metodo creaPublicacionTramites, que inserta registros en la tabla PublicacionTramite, de acuerdo a una lista de tramites asociados a un numero de Publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public void creaPublicacionTramites(List<Tramite> listaTramitesPorPublicacion, Publicacion publicacion, Usuario usuario) throws Exception;

   

     /*
     * método que permite actualizar registros en la tabla PublicacionTramite
     *
     * @param publicacionTramite
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 24/02/2015
     * Descripcion: Se agrega el metodo devolverPublicacionTramite, que actualiza registros en la tabla PublicacionTramite, asismimo actualiza datos en las tablas Tramite y TramiteFlujoEtapa
     * ----------------------------------------------------
     * Modificado: Susana Escobar Paz
     * Fecha: 18/05/2015
     * Descripcion: Se modifico el metodo para cambiar de estado el registro de publicacion en tabla TramiteFlujoEtapa, al mismo tiempo crear otro registro de Exfm, dato y valor de tabla ValorTramiteVentanillaEForma y DatoTramiteVentanillaEForma
     * </pre>
     */
    public void devolverPublicacionTramite(PublicacionTramite publicacionTramite, Usuario usuario);

    /**
     * método que permite actualizar registros en la tabla PublicacionTramite
     *
     * @param listaPublicacionTramitePorPublicacion
     * @param publicacion
     * @param usuario
         * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 25/02/2015
     * Descripcion: Se agrega el metodo asignarNumeracion, que actualiza registros en la tabla PublicacionTramite, asignando numeros de publicacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
     public void asignarNumeracion(List<PublicacionTramite> listaPublicacionTramitePorPublicacion, Publicacion publicacion, Usuario usuario);
    
    public List<PublicacionTramite> listaPublicacionTramitePorTramite(Tramite tramite);
    
    public PublicacionTramite encuentraPublicacionTramiteAsigPorTramite(Tramite tramite, Usuario usuario);
}
