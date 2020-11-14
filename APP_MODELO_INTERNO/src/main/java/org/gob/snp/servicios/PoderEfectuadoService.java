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
import org.gob.snp.entidades.PoderEfectuado;
import org.gob.snp.entidades.Tramite;

/**
 *
 * @author roco
 */
public interface PoderEfectuadoService extends GenericDao<PoderEfectuado>{
    /**
     * método que permite listar todos los poderesefectuadoas
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */
      List<PoderEfectuado> listaPoderDepositado();
    /**
     * método que permite adicionar  los poderes efectuados
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */  
      PoderEfectuado persistPoderesEfectuados(PoderEfectuado poderesEfectuados)throws Exception;
    /**
     * método que permite listar tuplas cuyo TramiteEfectuado sea igual al tamite insertado como parametro
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */    
      List<PoderEfectuado> listaPoderesEfectuadosXTramite(Tramite tramite) throws Exception;
    /**
     * método que permite insertar un objeto poderesefectuados
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Levi
     */   
      
      void removePoderDepositado(PoderEfectuado poderesEfectuados)throws Exception;
      void insertaPoderEfectuado(Tramite tramite, List<PoderEfectuado> listaPoderesEfec) throws Exception;
    
    
}
