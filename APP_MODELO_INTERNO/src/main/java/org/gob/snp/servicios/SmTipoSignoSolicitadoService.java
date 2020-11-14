package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.SMTipoSignoSolicitado;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface SmTipoSignoSolicitadoService extends GenericDao<SMTipoSignoSolicitado> {

    SMTipoSignoSolicitado persistSMTipoSignoSolicitado(SMTipoSignoSolicitado sMTipoSignoSolicitado) throws Exception;

    SMTipoSignoSolicitado mergeSMTipoSignoSolicitado(SMTipoSignoSolicitado sMTipoSignoSolicitado) throws Exception;

    void removeSMTipoSignoSolicitado(SMTipoSignoSolicitado sMTipoSignoSolicitado) throws Exception;

    List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado();

    /**
     * Método para realizar el listado de los SMTipoSignoSolicitado de acuerdo a
     * un registro de smsignomarca
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param smsignomarca
     * @return List
     */
    List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitadoXSmSignoMarcaSolicitado(SMSignoMarca smsignomarca);

    /**
     * Método para realizar el listado de los SMTipoSignoSolicitado de acuerdo a
     * un registro de smsignomarca
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param denominativo
     * @param denominativoConGrafia
     * @param denominacionOrigen
     * @param figurativa
     * @param auditivo
     * @param tridimensional
     * @param listaSMTipoSignoSolicitado
     * @param otro
     * @param tipoSignoOtros
     * @return List
     */
    List<SMTipoSignoSolicitado> obtieneListaSMTipoSignoSolicitadoConValores(Boolean denominativo, Boolean denominativoConGrafia,Boolean denominacionOrigen, Boolean figurativa, Boolean tridimensional, Boolean auditivo, Boolean otro, String tipoSignoOtros, List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado);
       
    /**
     * Método para realizar el listado de los SMTipoSignoSolicitado de acuerdo a
 un registro de smsignomarca
     * @version 1.0, 21/05/2015
     * @author chanoRojas
     * @param denominativo
     * @param denominativoConGrafia
     * @param denominacionOrigen
     * @param figurativa
     * @param tridimensional
     * @param auditivo
     * @param otro
     * @param tipoSignoOtros
     * @return List
     */
    List<SMTipoSignoSolicitado> obtieneListaSMTipoSignoSolicitadoConValoresGeneral(Boolean denominativo, Boolean denominativoConGrafia,Boolean denominacionOrigen, Boolean figurativa, Boolean tridimensional, Boolean auditivo, Boolean otro, String tipoSignoOtros);
    
    /**
     * Método que genera un listado de todos los SMTipoSignoSolicitado por
     * Tramite
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return List
     */
    List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitadoPorTramite(Tramite tramite);

    /**
     * Método que verifica si el tipo de Signo Marca del tramite introducido es
     * tridimensional
     *
     * @version 1.0, 13/11/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return List
     */
    Boolean verificaSiElTipoSignoMarcaEsTridimensional(Tramite tramite);

    /**
     * 
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas Fecha: 21/01/2015
     * Descripcion: modificar el listado de SmTipoSignoSolicitado por tramite en el registro de Signo Marca
     * </pre>
     *
     * @param listaSMTipoSignoSolicitado
     * @param tramite
     * @param smsignomarca
     * @param usuario
     * @throws java.lang.Exception
     */
    void modificaListaDeSignoSolicitado(List<SMTipoSignoSolicitado> listaSMTipoSignoSolicitado, Tramite tramite, SMSignoMarca smsignomarca, Usuario usuario) throws Exception;
}
