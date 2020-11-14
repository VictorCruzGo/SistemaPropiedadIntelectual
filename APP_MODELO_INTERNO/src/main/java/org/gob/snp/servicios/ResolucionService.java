/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Resolucion;
import org.gob.snp.entidades.Tramite;

/**
 *
 * @author Gustavo Lizarraga
 */
public interface ResolucionService extends GenericDao<Resolucion> {

    /**
     * Metodo que permite adicionar una Resolucion
     *
     * @param resolucion
     * @return Resolucion
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Resolucion persistResolucion(Resolucion resolucion) throws Exception;

    /**
     * Metodo que permite modificar una Resolucion
     *
     * @param resolucion
     * @return Resolucion
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Resolucion mergeResolucion(Resolucion resolucion) throws Exception;

    /**
     * Metodo que permite eliminar una Resolucion
     *
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @param resolucion
     * @throws java.lang.Exception
     *
     */
    void removeResolucion(Resolucion resolucion) throws Exception;

    /**
     * Metodo que permite listar todas las Resoluciones
     *
     * @return List
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     */
    List<Resolucion> listaResolucion();

    /**
     * Metodo que permite listar todas las Resoluciones a traves de un Tramite
     *
     * @return List
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @param tramite
     */
    List<Resolucion> listaResolucionATravesDeUnTramite(Tramite tramite);
}
