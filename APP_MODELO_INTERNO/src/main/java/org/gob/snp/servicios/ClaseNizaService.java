package org.gob.snp.servicios;

import java.util.Collections;
import org.gob.snp.GenericDao;
import java.util.List;
import org.gob.snp.entidades.ClaseNiza;

public interface ClaseNizaService extends GenericDao<ClaseNiza> {

    /**
     * metodo que permite adicionar Claseniza
     *
     * @param claseniza
     * @return ClaseNiza
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    ClaseNiza persistClaseNiza(ClaseNiza claseniza) throws Exception;

    /**
     * metodo que permite modifica Claseniza
     *
     * @param claseniza
     * @return Claseniza
     * @version 1.0, 15/07/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    ClaseNiza mergeClaseNiza(ClaseNiza claseniza) throws Exception;

    /**
     * metodo que permite eliminar Claseniza
     *
     * @version 1.0, 15/07/2014
     * @author ChanoRojas
     * @param claseniza
     * @throws java.lang.Exception
     *
     */
    void removeClaseNiza(ClaseNiza claseniza) throws Exception;

    /**
     * metodo que permite listar todos Claseniza
     *
     * @return List
     * @version 1.0, 15/07/2014
     * @author ChanoRojas
     */
    List<ClaseNiza> listaClaseNiza();

    /**
     * metodo que lsita una clase segun id claseniza
     *
     * @param claseniza
     * @version 1.0, 15/07/2014
     * @author Chano Rojas
     * @return
     */
    List<ClaseNiza> listaClaseNizaPorid(ClaseNiza claseniza);

    /**
     * metodo que lista los productos de una claseniza por productos
     *
     * @param claseniza
     * @version 1.0, 17/07/2014
     * @author Chano Rojas
     * @return
     */
    List<String> listadoDeProductos(ClaseNiza claseniza);

    /**
     * metodo que lista los productos de una claseniza por busqueda de una
     * palabra clave
     *
     * @param palabraClave
     * @version 1.0, 17/07/2014
     * @author Chano Rojas
     * @return
     */
    List<ClaseNiza> listaClaseNizaProductosServicios(String palabraClave);

    /**
     * Metodo que lista los productos de una claseniza solo numero
     *
     * @version 1.0, 21/07/2014
     * @author Henrry Guzman
     * @return 
     */
    List<String> listaNumerosClaseNizaProductosServicios();

    /**
     * Metodo que lista los servicios de la clase niza
     *
     * @version 1.0, 16/06/2014
     * @author ChanoRojas
     * @return 
    
     */
     List<String> listaNumerosClaseNizaServicios();
        /**
    /**
     * Metodo que lista los productos de la clase niza
     *
     * @version 1.0, 16/06/2014
     * @author ChanoRojas
     * @return 
    
     */
     List<String> listaNumerosClaseNizaProductos();
        /**
         * metodo que lista los productos de una claseniza por busqueda de una
         * palabra clave
         *
         *
         * @version 1.0, 17/07/2014
         * @author Chano Rojas
         * @param numeroNiza
         * @return
         */
        ClaseNiza obtienClaseNizaPorNumero(String numeroNiza);

    /**
     * metodo que lista los productos de una claseniza por busqueda de una
     * palabra clave
     *
     * @param palabraClave
     * @version 1.0, 17/07/2014
     * @author Chano Rojas
     * @return 
     */
    List<String> listadoDeBuscador(String palabraClave);

    
    
    
    
     List<String> listaNumerosClaseNizaProductosValidados();
     
     
     List<String> listaNumerosClaseNizaServiciosValidados();
     
     
     
     
    
}
