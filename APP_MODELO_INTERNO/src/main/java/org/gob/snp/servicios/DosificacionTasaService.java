package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DosificacionTasa;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tasa;

public interface DosificacionTasaService extends GenericDao<DosificacionTasa> {

    /**
     * Método para la insercion de una DosificacionTasa
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas
     * Fecha: 26/02/2015
     * Descripcion:Metodo para insercion de un objeto DosificacionTasa
     * </pre>
     *
     * @param dosificacionTasa
     * @return tramite
     * @throws java.lang.Exception
     */
    DosificacionTasa persistDosificacionTasa(DosificacionTasa dosificacionTasa) throws Exception;

    /**
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas02
     * Fecha: 26/02/2015
     * Descripcion: Metodo para modificar Dosificacion Tasa
     * </pre>
     *
     * @param dosificacionTasa
     * @return tramite
     * @throws java.lang.Exception
     */
    DosificacionTasa mergeDosificacionTasa(DosificacionTasa dosificacionTasa) throws Exception;

    /**
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas02
     * Fecha: 26/02/2015
     * Descripcion:
     * </pre>
     *
     * @param dosificacionTasa
     * @throws java.lang.Exception
     */
    void removeDosificacionTasa(DosificacionTasa dosificacionTasa) throws Exception;

    /**
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas02
     * Fecha: 26/02/2015
     * Descripcion: Metodo para listar Dosificacion Tasa
     * </pre>
     *
     * @return tramite
     */
    List<DosificacionTasa> listaDosificacionTasa();

    /**
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas04
     * Fecha: 10/04/2015
     * Descripcion: Metodo para realizar la busqueda de DosificacionTasa por el id de Tasa
     * </pre>
     *
     * @param tasa
     * @param regional
     * @return tramite
     */
    DosificacionTasa encuentraDosificacionTasaPorTasa(Tasa tasa,Regional regional);
    /**
     * <pre>
     * ----------------------------------------------------
     * Creado:chanoRojas04
     * Fecha: 23/04/2015
     * Descripcion: Metodo para realizar la busqueda de un listado de dosificacionTasa por el id de Tasa
     * </pre>
     *
     * @param tasa
     * @param regional
     * @return tramite
     */
    List<DosificacionTasa> encuentraListaDosificacionTasaPorTasa(Tasa tasa,Regional regional);

}
