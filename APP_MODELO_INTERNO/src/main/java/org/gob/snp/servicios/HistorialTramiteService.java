/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.HistorialTramite;

/**
 * Implementación de la Interface HistorialTramite
 * @author Susana Escobar Paz
 * @see HisttorialTramiteServiceImpl
 * @see HistorialTramiteService
 * @version 1.0, 21/05/2015
 */
public interface HistorialTramiteService extends GenericDao<HistorialTramite>{
    /**
     * método que permite rescatar un listado de la vista historialTramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 21/05/2015
     * Descripcion: Se agrega el metodo listadoHistorialTramite, que permite rescatar un listado de la vista historialTramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<HistorialTramite> listadoHistorialTramite();
    /**
     * método que permite rescatar un listado de la vista historialTramite por tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 22/05/2015
     * Descripcion: Se agrega el metodo listadoHistorialTramite, que permite rescatar un listado de la vista historialTramite por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public List<HistorialTramite> listadoHistorialTramitePorTramite(Tramite tramite, Usuario usuario);
}
