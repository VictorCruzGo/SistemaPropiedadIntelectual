package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.RequisitoFlujoEtapa;

public interface RequisitoFlujoEtapaService extends GenericDao<RequisitoFlujoEtapa> {

    /**
     * método que permite guardar RequisitoFlujoEtapa
     *     
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia     
     * @param requisitoFlujoEtapa     
     * @return 
     * @throws java.lang.Exception
     */
    RequisitoFlujoEtapa persistRequisitoFlujoEtapa(RequisitoFlujoEtapa requisitoFlujoEtapa) throws Exception;

    /**
     * método que permite modificar RequisitoFlujoEtapa
     *
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia
     * @param requisitoFlujoEtapa
     * @return 
     * @throws java.lang.Exception
     */
    RequisitoFlujoEtapa mergeRequisitoFlujoEtapa(RequisitoFlujoEtapa requisitoFlujoEtapa) throws Exception;

    
    /**
     * método que permite eliminar RequisitoFlujoEtapa
     *     
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia     
     * @param requisitoFlujoEtapa     
     * @throws java.lang.Exception
     */
    void removeRequisitoFlujoEtapa (RequisitoFlujoEtapa requisitoFlujoEtapa) throws Exception;

    /**
     * método que permite listar todos los RequisitoFlujoEtapa
     *
     * @return List
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivias
     */
    List<RequisitoFlujoEtapa> listaRequisitoFlujoEtapa();


}
