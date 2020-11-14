package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Expediente;
import org.gob.snp.entidades.Tramite;

public interface ExpedienteService extends GenericDao<Expediente> {

    /**
     * método que permite listar todos las Expedientes
     *
     * @return List
     * @version 1.0, 10/07/2014
     * @author chano
     */
    List<Expediente> listaExpediente();

    /**
     * método que permite adicionar Expedientes
     *
     * @param expediente
     * @return
     * @version 1.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Expediente persistExpediente(Expediente expediente) throws Exception;

    /**
     * metodo que permite modifica Expediente
     *
     * @param expediente
     * @return Expediente
     * @version 1.0, 10/07/2014
     * @author chano
     */
    Expediente mergeExpediente(Expediente expediente) throws Exception;

    /**
     * metodo que permite eliminar Expediente
     *
     * @version 1.0, 10/07/2014
     * @author chano
     * @param expediente
     *
     * @throws java.lang.Exception
     *
     */
    void removeExpediente(Expediente expediente) throws Exception;
    
    /**
     * metodo que recupera un determinado expediente de acuerdo al Tramite
     * 
     * @version 1.0, 13/10/2014
     * @author eddy valero
     * @param tramite
     * @return 
     */
    Expediente encuentraExpedientePorTramite(Tramite tramite);
     
    
    /**
     * Método que recupera el expediente genérico
     *
     * @param idUsuario
     * @return  Expediente
     * @throws java.lang.Exception
     * 
     * <pre>
     * -------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 19/10/20105
     * Descripcion: Obtener el expediente genérico cuyos parametros tienen el  valor cero.
     * </pre>
     
     * 
     */
    Expediente encuentraExpedienteGenerico(Long idUsuario) throws Exception;
    
     
     
    

}
