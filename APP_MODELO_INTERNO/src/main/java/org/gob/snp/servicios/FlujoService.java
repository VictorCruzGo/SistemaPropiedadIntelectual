package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.vistas.TipoTramite;

public interface FlujoService extends GenericDao<Flujo> {

    /**
     * método que permite listar todos los Flujos
     *
     * @return List
     * @version 1.0, 03/07/2014
     * @author Jonathan
     */
    List<Flujo> listaFlujo();        
    
    /**
     * método que obtiene el Flujo desde el parametro tipoTramite
     *
     * @param tipoTramite
     * @return List
     * @version 1.0, 03/07/2014
     * @author Jonathan
     */
    Flujo obtieneFlujoPorTipoTramite(TipoTramite tipoTramite);        
    
}