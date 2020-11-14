package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.vistas.BusquedaSmmarca;

/**
 * @author Eddy Valero
 * @version 1.0, 02/09/2015
 *
 */
public interface BusquedaSmmarcaService extends GenericDao<BusquedaSmmarca> {

    
    /**
     * Método que permite listar registros de Busqueda de Marcas de acuerdo
     * con los criterios de busqueda siguientes: 
     * codigoSM, marca, claseNiza, datoSolicitante, datoApoderado
     *
     * @param tramite
     * @param marca
     * @param claseNiza
     * @param idUsuario
     * @return List BusquedaSmmarca
     * @throws java.lang.Exception
     */
    List<BusquedaSmmarca> listaBusquedasSMMarcaClase(String tramite, String marca, String claseNiza, Long idUsuario) throws Exception;

    

}
