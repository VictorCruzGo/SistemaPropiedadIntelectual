package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.pojo.FormularioExamenDeFondoPojo;

public interface AnalisisEtapaService extends GenericDao<AnalisisEtapa> {

    /**
     * método que permite guardar AnalisisEtapa
     *
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia
     * @param analisisEtapa
     * @return
     * @throws java.lang.Exception
     */
    AnalisisEtapa persistAnalisisEtapa(AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * método que permite modificar AnalisisEtapa
     *
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia
     * @param analisisEtapa
     * @return
     * @throws java.lang.Exception
     */
    AnalisisEtapa mergeAnalisisEtapa(AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * método que permite eliminar AnalisisEtapa
     *
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia
     * @param analisisEtapa
     * @throws java.lang.Exception
     */
    void removeAnalisisEtapa(AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * método que permite listar todos los AnalisisEtapa
     *
     * @return List
     * @version 1.0, 02/09/2014
     * @author Jonathan Valdivia
     */
    List<AnalisisEtapa> listaAnalisisEtapa();

    /**
     * Método que permite guardar RequisitoFlujoVentanillaEForma segun un
     * FlujoEtapa
     *
     * @version 1.0, 08/09/2014
     * @author Jonathan Valdivia
     * @param tramiteFlujoEtapa
     * @param flujoEtapa
     * @return
     * @throws java.lang.Exception
     */
    AnalisisEtapa persistRequisitoFlujoVentanillaEFormaPorFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa, FlujoEtapa flujoEtapa) throws Exception;

    /**
     * Método que permite dado un Tramite determinar el AnalisisEtapa
     *
     * @version 1.0, 08/09/2014
     * @author Eddy Valero
     * @param tramite
     * @param etapaTramite
     * @return AnalisisEtapa
     * @throws java.lang.Exception
     */
    AnalisisEtapa obtenerAnalisisEtapaDeTramite(Tramite tramite, EtapaTramite etapaTramite) throws Exception;

    /**
     * Método que verifica si existe o no registros en AnalisisEtapa de
     * TramiteFlujoEtapa con el respectivo Trámite
     *
     * @version 1.0, 11/09/2014
     * @author Eddy Valero
     * @param tramite
     * @return AnalisisEtapa
     * @throws java.lang.Exception
     */
    Boolean existeAnalisisEtapaEnTramiteFlujoEtapa(Tramite tramite) throws Exception;

    /**
     * Método que permite listar todos los registros rescatados
     *
     * @version 1.0, 01/10/2014
     * @author Jonathan Valdivia
     * @param lista
     * @param columnas
     * @throws java.lang.Exception
     */
    void guarda(List<FormularioExamenDeFondoPojo> lista, int columnas) throws Exception;

    /**
     * Método que permite obtener un registro de AnalisisEtapa de acuerdo al
     * tramiteFlujoEtapa ingresado
     *
     * @param tramiteFlujoEtapa, de acuerdo a este parametro se recupera el
     * AnalisisEtapa asignado a este tramiteFlujoEtapa
     * @return AnalisisEtapa:
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 06/02/2015
     * Descripcion: Método que permite obtener un registro de AnalisisEtapa de
     * acuerdo al tramiteFlujoEtapa ingresado
     * </pre>
     */
    AnalisisEtapa obtenerAnalisisEtapadeTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa) throws Exception;

    /**
     * Método que permite crear un AnalisisEtapa para un TramiteFlujoEtapa
     *
     * @param tramiteFlujoEtapa
     * @param flujoEtapa
     * @param direccionIP
     * @param idUsuario
     * @return
     * @throws java.lang.Exception
     *
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 09/12/2015
     * Descripcion: Método que permite crear un registro de AnalisisEtapa 
     * acuerdo al tramiteFlujoEtapa ingresado
     * </pre>
     *
     *
     */
    AnalisisEtapa crearAnalisisEtapaPorTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa, FlujoEtapa flujoEtapa, String direccionIP, Long idUsuario) throws Exception;

}
