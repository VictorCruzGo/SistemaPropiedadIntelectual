package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Pagina;

/**
 * @author Eddy Valero
 * @version 1.0 26/11/2014 Servicio de la Entidad Pagina
 *
  */


public interface PaginaService extends GenericDao<Pagina> {
    
   /**
     * metodo que permite adicionar Pagina
     *
     * @param pagina
     * @return Pagina
     * @version 1.0, 15/12/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    Pagina persistPagina(Pagina pagina) throws Exception;

    /**
     * metodo que permite modifica Pagina
     *
     * @param pagina
     * @return Pagina
     * @version 1.0, 15/12/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    Pagina mergePagina(Pagina pagina) throws Exception;

    /**
     * metodo que permite eliminar un registro de Pagina
     *
     * @param pagina
     * @version 1.0, 15/12/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    void removePagina(Pagina pagina) throws Exception;

    /**
     * metodo que permite listar todos los registros de Pagina
     *
     * @version 1.0, 15/12/2014
     * @return Pagina
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    List<Pagina> listaPagina() throws Exception;
    
    /**
     * Método que permite listar todos los submenus según el flujo
     *
     * @version 1.0, 07/01/2015
     * @param codigo
     * @return Pagina
     * @author Jonathan Valdivia
     */
    List<Pagina> listaSubMenusPorFlujo(Long codigo);
    /**
     * Método que permite lencontrar una pagina por un flujo*
     * @version 1.0, 07/01/2015
     * @param idFlujo
     
     * @return Pagina
     * @author Jonathan Valdivia
     */
       Pagina encuentraPaginaPorFlujo(Long idFlujo);
    
  
    
}
