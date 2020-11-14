package org.gob.snp.servicios;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Deposito;
import org.gob.snp.entidades.Recibo;
import org.gob.snp.entidades.ReciboDeposito;

public interface ReciboDepositoService extends GenericDao<ReciboDeposito> {

    /**
     * metodo que permite gurdar Deposito
     *
     * @param reciboDeposito
     * @return Deposito
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    ReciboDeposito persistReciboDeposito(ReciboDeposito reciboDeposito) throws Exception;

    /**
     * metodo que modifica Deposito
     *
     * @param reciboDeposito
     * @return Deposito
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    ReciboDeposito mergeReciboDeposito(ReciboDeposito reciboDeposito) throws Exception;

    /**
     * metodo que elimina Deposito
     *
     * @param reciboDeposito
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeDeposito(ReciboDeposito reciboDeposito) throws Exception;

    /**
     * metodo que lista Deposito
     *
     * @return List
     * @version 1.0, 1/10/2014
     * @author chano
     */
    List<ReciboDeposito> listaDeposito();
    
    
    /**
     * metodo que suma los montos de un deposito por recibo
     *
     * @return BigeDecimal
     * @param deposito
     * @version 1.0, 10/04/2015
     * @author chanoRojas
     */
     BigDecimal sumaMontoReciboPorDeposito(Deposito deposito);
    /**
     * metodo que lista RecibosDEpsoitos por Recibo
     *
     * @return List
     * @param recibo
     * @version 1.0, 11/04/2015
     * @author chanoRojas
     */
      List<ReciboDeposito> listaReciboDepositoPorRecibo(Recibo recibo);
      /**
     * metodo que lista RecibosDEpsoitos por id Recibo
     *
     * @return List
     * @param recibo
     * @version 1.0, 11/04/2015
     * @author Levi Laura
     */
      List<ReciboDeposito> listaReciboDepositoPorIdRecibo(Recibo recibo);
       /**
     * metodo que lista Depositos por fecha, y regional validos
     *
     * @return List
     * @param recibo
     * @version 1.0, 25/06/2015
     * @author Levi Laura
     */
       List<Deposito> listaReciboDepositoPorIdRecibo(Date fechaBuscar,Long idRegional) ;
       /**
     * metodo que suma los Depositos en una fecha, y el idDeposito
     *
     * @return List
     * @param recibo
     * @version 1.0, 25/06/2015
     * @author Levi Laura
     */
       List<BigDecimal> listaSumaDepositos(Long idDepositoBusca,Date fechaBuscar);
    

}