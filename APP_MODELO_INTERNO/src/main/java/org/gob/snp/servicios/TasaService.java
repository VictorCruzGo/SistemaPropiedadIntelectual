package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.vistas.TipoTramite;

public interface TasaService extends GenericDao<Tasa> {

    /**
     * metodo que permite gurdar Tasa
     *
     * @param tasa
     * @return Tasa
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Tasa persistTasa(Tasa tasa) throws Exception;

    /**
     * metodo que modifica Tasa
     *
     * @param tasa
     * @return Tasa
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Tasa mergeTasa(Tasa tasa) throws Exception;
    
    /**
     * metodo que elimina Tasa
     *
     * @param tasa
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
            
    void removeTasa(Tasa tasa) throws Exception;
            
    /**
     * metodo que lista Tasa
     * @return List
     * @version 1.0, 1/10/2014
     * @author chano
     */
    List<Tasa> listaTasa();
    /**
     * metodo que lista Tasa por tipoTramite
     * @return List
     * @param tipoTramite 
     * @version 1.0, 12/04/2015
     * @author chano
     */
      List<Tasa> listaTasaPorTipoTramite(TipoTramite tipoTramite);
    /**
     * metodo que lista Tasa por tipoTramite
     * @param tramite
     * @return List
     
     * @version 1.0, 12/04/2015
     * @author chano
     */
      List<Tasa> listaTasaPorTramite(Tramite tramite);

}
