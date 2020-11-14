package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.vistas.BusquedaMarcas;

/**
 * @author Eddy Valero
 * @version 1.0, 01/09/2015
 *
 */
public interface BusquedaMarcasService extends GenericDao<BusquedaMarcas> {

    /**
     * Método que permite listar todos los registros de la Vista para las
     * busquedas de marcas
     *
     * @return List<BusquedaMarcas>
     * @throws java.lang.Exception
     */
    List<BusquedaMarcas> listaBandeja() throws Exception;
    
    
    /**
     * Método que permite listar registros de Busqueda de Marcas de acuerdo
     * con los criterios de busqueda siguientes: 
     * codigoSM, marca, claseNiza, datoSolicitante, datoApoderado
     *
     * @param tramite
     * @param codigoSM
     * @param marca
     * @param claseNiza
     * @param datoSolicitante
     * @param datoApoderado
     * @param idUsuario
     * @return ListBusquedaMarcas
     * @throws java.lang.Exception
     */
    List<BusquedaMarcas> listaBusquedasSMMarcaClaseSolicitanteApoderado(String codigoSM, String marca, String claseNiza, String datoSolicitante, String datoApoderado, Long idUsuario) throws Exception;

    

}
