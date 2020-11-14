package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.RequisitoFlujoVentanillaEForma;
import org.gob.snp.entidades.TramiteFlujoEtapa;
import org.gob.snp.entidades.Usuario;

public interface RequisitoFlujoVentanillaEFormaService extends GenericDao<RequisitoFlujoVentanillaEForma> {

    /**
     * método que permite guardar RequisitoFlujoVentanillaEForma
     *
     * @version 1.0, 04/09/2014
     * @author Jonathan Valdivia
     * @param requisitoFlujoVentanillaEForma
     * @return
     * @throws java.lang.Exception
     */
    RequisitoFlujoVentanillaEForma persistRequisitoFlujoVentanillaEForma(RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma) throws Exception;

    /**
     * método que permite modificar RequisitoFlujoVentanillaEForma
     *
     * @version 1.0, 04/09/2014
     * @author Jonathan Valdivia
     * @param requisitoFlujoVentanillaEForma
     * @return
     * @throws java.lang.Exception
     */
    RequisitoFlujoVentanillaEForma mergeRequisitoFlujoVentanillaEForma(RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma) throws Exception;

    /**
     * método que permite eliminar RequisitoFlujoVentanillaEForma
     *
     * @version 1.0, 04/09/2014
     * @author Jonathan Valdivia
     * @param requisitoFlujoVentanillaEForma
     * @throws java.lang.Exception
     */
    void removeRequisitoFlujoVentanillaEForma(RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma) throws Exception;

    /**
     * método que permite listar todos los RequisitoFlujoVentanillaEForma
     *
     * @return List
     * @version 1.0, 04/09/2014
     * @author Jonathan Valdivias
     */
    List<RequisitoFlujoVentanillaEForma> listaRequisitoFlujoVentanillaEForma();

    /**
     * método que permite listar todos los RequisitoFlujoVentanillaEForma por
     * FlujoEtapa
     *
     * @param flujoEtapa
     * @return List
     * @version 1.0, 08/09/2014
     * @author chano
     */
    List<RequisitoFlujoVentanillaEForma> listaRequisitoFlujoVentanillaEFormaPorFlujoEtapa(FlujoEtapa flujoEtapa);

    /**
     * Método que verifica si un RequisitoFLujoVentanillaEForma tiene
     * dependientes en Clasificador
     *
     * @param requisitoFlujoVentanillaEForma
     * @return List
     * @version 1.0, 08/09/2014
     * @author chano
     */
    Boolean tieneDependientes(RequisitoFlujoVentanillaEForma requisitoFlujoVentanillaEForma);

    /**
     * Método que permite listar todos los RequisitoFlujoVentanillaEForma por
     * FlujoEtapa y de acuerdo al tipo de Requisito: MINIMO Y OPCIONAL
     *
     * @param flujoEtapa
     * @param usuario
     * @param codigoTipoRequisito
     * @return List<RequisitoFlujoVentanillaEForma>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 17/04/2015
     * Descripcion: Se agrega el metodo listaRequisitoFlujoTipoRequisito
     * </pre>
     */
    List<RequisitoFlujoVentanillaEForma> listaRequisitoFlujoTipoRequisito(FlujoEtapa flujoEtapa, Usuario usuario, String codigoTipoRequisito) throws Exception;
    
    /**
     * Método que permite listar todos los RequisitoFlujoVentanillaEForma por
     * FlujoEtapa y tipoGenero
     *
     * @param flujoEtapa
     * @param idUsuario
     * @param tipoGenero
     * @return List<RequisitoFlujoVentanillaEForma>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 24/07/2015
     * Descripcion: Se agrega el metodo listaRequisitoFlujoVentanillaEFormaPorFlujoEtapa
     * </pre>
     */
    List<RequisitoFlujoVentanillaEForma> listaRequisitoFlujoVentanillaEFormaPorFlujoEtapa(FlujoEtapa flujoEtapa, String tipoGenero, Long idUsuario) throws Exception;

}
