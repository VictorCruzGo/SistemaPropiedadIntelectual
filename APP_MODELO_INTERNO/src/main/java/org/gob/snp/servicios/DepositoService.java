package org.gob.snp.servicios;

import java.math.BigDecimal;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Deposito;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.Usuario;

public interface DepositoService extends GenericDao<Deposito> {

    /**
     * metodo que permite gurdar Deposito
     *
     * @param deposito
     * @return Deposito
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Deposito persistDeposito(Deposito deposito) throws Exception;

    /**
     * metodo que modifica Deposito
     *
     * @param deposito
     * @return Deposito
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Deposito mergeDeposito(Deposito deposito) throws Exception;

    /**
     * metodo que elimina Deposito
     *
     * @param deposito
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeDeposito(Deposito deposito) throws Exception;

    /**
     * metodo que lista Deposito
     *
     * @return List
     * @version 1.0, 1/10/2014
     * @author chano
     */
    List<Deposito> listaDeposito();

    /**
     * metodo que lista Deposito con saldo
     *
     * @return List
     * @version 1.0, 1/10/2014
     * @author chano
     */
    List<Deposito> listaDepositoConSaldo();

    /**
     * metodo que lista Deposito con saldo
     *
     * @param usuario
     * @return List
     * @version 1.0, 1/07/2015
     * @author chanoRojas
     */
    List<Deposito> listaDepositoConSaldoPorUSuario(Usuario usuario);

    /**
     * guarda deposito
     *
     * @param deposito
     * @version 1.0, 04/10/2014
     * @author chanoRojas
     * @param usuario
     * @throws java.lang.Exception
     */
    void guardaDeposito(Deposito deposito, Usuario usuario) throws Exception;

    /**
     * verifica si un deposito esta en la tabla recibodeposito, habilita
     * modificar y eliminar
     *
     * @param deposito
     * @version 1.0, 04/10/2014
     * @author chanoRojas
     * @return
     */
    Boolean depositoParaModificarEliminar(Deposito deposito);

    /**
     * actualiza el saldo de un deposito al registrar un recibo
     *
     * @param tasa
     * @param deposito
     * @version 1.0, 008/10/2014
     * @author chanoRojas
     * @return
     */
    BigDecimal actualizaSaldoDepositoPorTasa(Tasa tasa, Deposito deposito);

    /**
     * metodo que permite Validarlos datos de Deposito
     *
     * @param deposito
     * @version 1.0, 21/04/2015
     * @author chanoRojas
     * @param banco
     * @return
     */
    Boolean[] validaCamposDeposito(Deposito deposito, String banco);

    /**
     * metodo que permite Validarlos datos de Deposito
     *
     * @param deposito
     * @version 1.0, 21/04/2015
     * @author chanoRojas
     * @param usuario
     *
     * @throws java.lang.Exception
     */
    void cambiaEstadoDeposito(Deposito deposito, Usuario usuario) throws Exception;

    /**
     * metodo que permite Validarlos datos de Deposito
     *
     * @param deposito
     * @version 1.0, 21/04/2015
     * @author chanoRojas
     * @return
     *
     */
    Boolean validaNumeroDeposito(Deposito deposito);
    /**
     * metodo que lista a depositos con mayor saldo a cero
     *
     * @version 1.0, 21/04/2015
     * @author chanoRojas
     * @param listaDepositos
     * @return
     *
     */
    List<Deposito>generalistaDepositosConSaldo(List<Deposito>listaDepositos);
    

}
