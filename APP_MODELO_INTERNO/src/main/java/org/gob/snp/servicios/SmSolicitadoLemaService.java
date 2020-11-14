package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SMSolicitadoLema;

/**
 * Interface NoLaboralService
 *
 * @author Eddy Valero
 * @see SmSolicitadoLemaServiceImpl
 * @see SMSolicitadoLema
 * @version 1.0, 27/04/2015
 *
 */
public interface SmSolicitadoLemaService extends GenericDao<SMSolicitadoLema> {

    /**
     * Método que permite adicionar SMSolicitadoLema
     *
     * @param sMSolicitadoLema
     * @return SMSolicitadoLema
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo persistSMSolicitadoLema
     * </pre>
     *
     */
    SMSolicitadoLema persistSMSolicitadoLema(SMSolicitadoLema sMSolicitadoLema) throws Exception;

    /**
     * Método que permite modificar SMSolicitadoLema
     *
     * @param sMSolicitadoLema
     * @return SMSolicitadoLema
     * @throws java.lang.Exception
     * 
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo mergeSMSolicitadoLema
     * </pre>
     *
     */
    SMSolicitadoLema mergeSMSolicitadoLema(SMSolicitadoLema sMSolicitadoLema) throws Exception;

    /**
     * Método que permite eliminar SMSolicitadoLema
     *
     * @param sMSolicitadoLema
     * @throws java.lang.Exception
     * 
     * 
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo removeSMSolicitadoLema
     * </pre>
     */
    void removeSMSolicitadoLema(SMSolicitadoLema sMSolicitadoLema) throws Exception;

    /**
     * Método que permite Listar SMSolicitadoLema
     *
     * @return List<SMSolicitadoLema> 
     * @version 1.0, 22/07/2014
     *
     * 
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo listadoSmsolicitadoprioridad
     * </pre>
     */
    List<SMSolicitadoLema> listadoSmsolicitadoprioridad();

    /**
     * metodo que Valida los campos de ingreso al formulario para realizar la
     * Busqueda de un Tramite y agregarle el Lema Comercial
     *
     * @param datoRegistro
     * @param datoSM
     * @return List
     * 
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 27/04/2015
     * Descripcion: Se agrega el metodo listadoSmsolicitadoprioridad
     * </pre>
     */
    public Boolean[] validaCamposRenovacionUno(String datoRegistro, String datoSM);

}
