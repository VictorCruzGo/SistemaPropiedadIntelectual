package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.FormularioTramite;

public interface FormularioTramiteService extends GenericDao<FormularioTramite> {

    /**
     * método que permite guardar FormularioTramiteService
     *
     * @param formularioTramite
     * @return FormularioTramiteService
     * @version 2.0, 07/10/2014
     * @author roberto Santivañez
     * @throws java.lang.Exception
     */
    FormularioTramite persistFormularioTramite(FormularioTramite formularioTramite) throws Exception;

    /**
     * método que permite actualizar formularioTramite
     *
     * @param formularioTramite
     * @return FormularioTramiteService
     * @version 2.0, 07/10/2014
     * @author roberto Santivañez
     * @throws java.lang.Exception
     */
    FormularioTramite mergeFormularioTramite(FormularioTramite formularioTramite) throws Exception;

    
    /**
     * método que permite guardar formularioTramite
     *
     * @param formularioTramite
     * @version 2.0, 07/10/2014
     * @author roberto Santivañez
     * @throws java.lang.Exception
     */
    void removeFormularioTramite (FormularioTramite formularioTramite) throws Exception;

    /**
     * método que permite listar todos los registros de formularioTramite
     *
     * @return List
     * @version 2.0, 07/10/2014
     * @author roberto Santivañez
     */
    List<FormularioTramite> listaFormularioTramite();

    /**
     * Método que encuentra un FormularioTramite por FlujoEtapa
     *
     * @param flujoEtapa
     * @return List
     * @version 1.0, 17/10/2014
     * @author roberto Santivañez
     */
    FormularioTramite encuentraFormularioTramitePorFlujoEtapa(FlujoEtapa flujoEtapa);
    
}
