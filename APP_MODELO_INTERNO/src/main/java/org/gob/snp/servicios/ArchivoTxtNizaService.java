package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.ArchivoTxtNiza;
import org.gob.snp.entidades.SMSignoClaseNiza;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.pojo.ArchivoNizaPojo;

/**
 * @author Chano Rojas
 * @version 1.0 17/03/2014 Servicio de la Entidad ArchivoTxtNiza
 *
 */
public interface ArchivoTxtNizaService extends GenericDao<ArchivoTxtNiza> {

    /**
     * Método que realiza el registro de ArchivoTxtNiza
     *
     * @param archivoTxtNiza
     * @return ArchivoTxtNiza
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas032015
     * Fecha: 17/03/2015
     * Descripcion: metodo para realizar el registro de ArchivoTxtNiza
     * </pre>
     *
     * @throws java.lang.Exception
     */
    ArchivoTxtNiza persistArchivoTxtNiza(ArchivoTxtNiza archivoTxtNiza) throws Exception;

    /**
     * Método que realiza la modificacion de ArchivoTxtNiza
     *
     * @param archivoTxtNiza
     * @return ArchivoTxtNiza
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas032015
     * Fecha: 17/03/2015
     * Descripcion: metodo para realizar el registro de ArchivoTxtNiza
     * </pre>
     *
     * @throws java.lang.Exception
     */
    ArchivoTxtNiza mergeArchivoTxtNiza(ArchivoTxtNiza archivoTxtNiza) throws Exception;

    /**
     * Método que realiza la eliminacion de ArchivoTxtNiza
     *
     * @param archivoTxtNiza
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas032015
     * Fecha: 17/03/2015
     * Descripcion: metodo para realizar el registro de ArchivoTxtNiza
     * </pre>
     *
     * @throws java.lang.Exception
     */
    void removeArchivoTxtNiza(ArchivoTxtNiza archivoTxtNiza) throws Exception;

    /**
     * Método que realiza el listado de ArchivoTxtNiza
     *
     * @return ArchivoTxtNiza
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas032015
     * Fecha: 17/03/2015
     * Descripcion: metodo para realizar el registro de ArchivoTxtNiza
     * </pre>
     *
     * @throws java.lang.Exception
     */
    List<ArchivoTxtNiza> listaArchivoTxtNizaWeb() throws Exception;
    /**
     * Método que realiza elcargado del pojo de archivoclase niza txt
     *
     * @param tramite
     * @return ArchivoTxtNiza
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas30032015
     * Fecha: 30/03/2015
     * Descripcion: metodo para realizar el cargado del pojo de archivotxtniza
     * </pre>
     *
     * @throws java.lang.Exception
     */
     List<ArchivoNizaPojo> cargaArchivoNizaPorTramite(Tramite tramite) throws Exception;
    /**
     * Método que realiza elcargado del pojo de archivoclase niza txt
     *
     * @param sMSignoClaseNiza
     * @return ArchivoTxtNiza
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas30032015
     * Fecha: 30/03/2015
     * Descripcion: metodo para realizar el cargado del pojo de archivotxtniza
     * </pre>
     *
     * @throws java.lang.Exception
     */
    ArchivoTxtNiza encuentraArchivoPorSMSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) throws Exception;  
    /**
     * Método que realiza el eliminado de una txtniza por SmsignoClaseNiza 
     *
     * @param sMSignoClaseNiza
     * * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas08/05/2015
     * Fecha: 30/03/2015
     * Descripcion: metodo para realizar lña eliminacion de un archivo txt niza de un SMSignomarca
     * </pre>
     *
     * @throws java.lang.Exception
     */
     void eliminaTxtNizaPorSmSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) throws Exception;
    
}
