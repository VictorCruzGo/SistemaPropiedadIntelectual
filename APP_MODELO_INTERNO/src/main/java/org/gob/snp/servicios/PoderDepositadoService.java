/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.PoderDepositado;
import org.gob.snp.entidades.Tramite;

/**
 *
 * @author roco
 */
public interface PoderDepositadoService extends GenericDao<PoderDepositado>{
    /**
     * método que permite listar todos los poderes
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */
      List<PoderDepositado> listaPoderDepositado();
    /**
     * método que permite adicionar  los poderes
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */  
      
       PoderDepositado persistPoderDepositado(PoderDepositado poderDepositado) throws Exception;
       
    /**
     * método que permite encontrar los poderes asociados a un tramite
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */     
       List<PoderDepositado>  encuentraPoderDepositadoPorTramite(Tramite tramite) throws Exception;
       /**
     * método que permite eliminar poderes asociados a un tramite
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */ 
      void removePoderDepositado(PoderDepositado poderDepositado) throws Exception ;
       /**
     * método que inserta un poderDepositado ala base pero primero elimina todos los relacionados al campo tramite
     *
     * @return List
     * @version 2.0, 05/12/2014
     * @author Levi
     */
      
      void insertaPoderDepositadoPorTramite(Tramite tramite,List<PoderDepositado> listPoderDepo, Long idUsuario, String ip)throws Exception;
      
      /**
     * método que lista poderDepositado relacionados  a un numero de testimonio
     *
     * @return List
     * @version 2.0, 08/12/2014
     * @author Levi
     */
      List<PoderDepositado> encuentraPoderDepositadoPorTestimonio(PoderDepositado poderDepositado) throws Exception;
       /**
     * método que busca el PoderDepositado apartir de una opcion ecogida y la cadena a buscar
     *
     * @return List
     * @version 2.0, 08/12/2014
     * @author Levi
     */
      
      List<PoderDepositado> encuentraPoderDepositadoXFiltro(String opcion,String aBuscar)throws Exception;
}
