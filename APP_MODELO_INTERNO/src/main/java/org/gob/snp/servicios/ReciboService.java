
package org.gob.snp.servicios;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Deposito;
import org.gob.snp.entidades.DetalleTitulo;
import org.gob.snp.entidades.DosificacionTasa;
import org.gob.snp.entidades.Recibo;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface ReciboService extends GenericDao<Recibo> {
    
    /**
     * metodo que permite gurdar Recibo
     *
     * @param recibo
     * @return Recibo
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Recibo persistRecibo(Recibo recibo) throws Exception;

    /**
     * metodo que modifica Recibo
     *
     * @param recibo
     * @return Recibo
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Recibo mergeRecibo(Recibo recibo) throws Exception;

    /**
     * * metodo que elimina Recibo
     *
     * @param recibo
     * @version 1.0, 1/10/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removeRecibo(Recibo recibo) throws Exception;

    /**
     * metodo que lista Recibo
     *
     * @return List
     * @version 1.0, 1/10/2014
     * @author chano
     */
    List<Recibo> listaRecibo();

    /**
     * metodo que lista Recibo Emitidos
     *
     * @return List
     * @version 1.0, 21/10/2014
     * @author chanoRojas
     */
    List<Recibo> listaReciboEmitido();

    /**
     * metodo que lista Recibo
     *
     * @param recibo
     * @param tasa
     * @param listaDepositos
     * @version 1.0, 1/10/2014
     * @author chano
     * @param regional
     * @param usuario
     * @param detalleTitulo
     * @throws java.lang.Exception
     */
    void guardaReciboDepositoTramite(Recibo recibo, Tasa tasa, List<Deposito> listaDepositos, Regional regional, Usuario usuario, DetalleTitulo detalleTitulo) throws Exception;

    /**
     * metodo que lista Recibo
     *
     * @param recibo
     * @param tasa
     * @param listaDepositos
     * @version 1.0, 1/10/2014
     * @author chano
     * @param regional
     * @param usuario
     * @param detalleTitulo
     * @param cantidad
     * @param reciboRescatado
     * @param dosificacionTasaSelecionada
     * @throws java.lang.Exception
     */

    void guardaReciboDepositoTramiteCantidad(Recibo recibo, Tasa tasa, List<Deposito> listaDepositos, Regional regional, Usuario usuario, DetalleTitulo detalleTitulo, int cantidad,Recibo reciboRescatado) throws Exception;

    /**
     * metodo que lista Recibo
     *
     * @param tasa
     * @param listaDepositos
     * @return Bollean
     * @version 1.0, 1/10/2014
     * @author chano
     */
    Boolean activaGuardadoRecibo(Tasa tasa, List<Deposito> listaDepositos);

    /**
     * metodo que lista Recibo
     *
     * @param tasa
     * @param listaDepositos
     * @param cantidad
     * @return Bollean
     * @version 1.0, 1/10/2014
     * @author chano
     */
    Boolean activaGuardadoReciboCantidad(Tasa tasa, List<Deposito> listaDepositos, int cantidad);

    /**
     * metodo que anula un recibo y suma los montos usados en reciboDeposito
     *
     * @param recibo
     * @version 1.0, 13/10/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    void anulaRecibo(Recibo recibo) throws Exception;
    /**
     * metodo que elimina un recibo y suma los montos usados en reciboDeposito para mostrar al usuario los numeros de correlativos del recibo 
     * para que se puedan reutilizar en otro recibo a difernecia de recibo anulado
     *
     * @param recibo
     * @version 1.0, 13/10/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    void eliminaRecibo(Recibo recibo) throws Exception;

    /**
     * metodo que la posicion del msaldo mayor de un listado de depositos
     *
     * @param listaDeposito
     * @return Integer
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     */
    Integer encuentraSaldoMayor(List<Deposito> listaDeposito);

    /**
     * metodo que la suma los saldos de un listado de depositos
     *
     * @param listaDepostio
     * @return BigDecimal
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     */
    BigDecimal sumaMontosListado(List<Deposito> listaDepostio);

    /**
     * método que permite encontrar la serie y el numero de titulo de un tramite
     *
     * @param tramite
     * @param usuario
     * @return registro
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 20/04/2015
     * Descripcion: Se agrega el metodo encuentraSerieTituloPorTramite, que permite encontrar la serie y el numero de titulo de un tramite
     * ----------------------------------------------------
     * Modificado:
     * Fecha:
     * Descripcion:
     * </pre>
     */
    DetalleTitulo encuentraSerieTituloPorTramite(Tramite tramite, Usuario usuario);

    /**
     * metodo que la suma los saldos de un listado de depositos
     *
     * @param usuario
     * @return BigDecimal
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     */
    List<Recibo> listaReciboEmitidoAnuladoConTitulo(Usuario usuario);

    /**
     * metodo que la suma los saldos de un listado de depositos
     *
     * @param usuario
     * @return BigDecimal
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     */
    
    List<Recibo> listaReciboEmitidoAnulado(Usuario usuario);
    

    /**
     * metodo que la suma los saldos de un listado de depositos
     *
     * @param usuario
     * @return BigDecimal
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     */
    List<DetalleTitulo> listadetalleTituloAnuladosPoRecibo(Usuario usuario);

    /**
     * metodo que lista los recibos por fecha segun el que se pone en la vista
     *
     * @param fechaBuscar
     * @return BigDecimal
     * @version 1.0, 01/06/2014
     * @author chanoRojas
     */
    List<Recibo> listaReciboEmitidoPorFecha(Date fechaBuscar);

    /**
     * metodo que lista los recibos por fecha segun el que se pone en la vista
     *
     * @param fechaBuscar
     * @return BigDecimal
     * @version 1.0, 01/06/2014
     * @author chanoRojas
     */

    List<Recibo> listaReciboEmitidoPorFechaValidos(Date fechaBuscar);

    /**
     * metodo que lista los recibos por fecha segun el que se pone en la vista
     * tomando en cuenta restricciones
     *
     * @param fechaBuscar
     * @return BigDecimal
     * @version 1.0, 01/06/2014
     * @author chanoRojas
     */

    List<Recibo> listaReciboEmitidoPorFechaValidosImprime(Date fechaBuscar);

    /**
     * metodo que lista los recibos por fecha segun el que se pone en la vista
     *
     * @param fechaBuscar
     * @param usuario
     * @param regional
     * @return BigDecimal
     * @version 1.0, 01/06/2014
     * @author chanoRojas
     */
    List<Recibo> listaReciboEmitidoPorFechaPorUsuarioYRegional(Date fechaBuscar, Usuario usuario, Regional regional);

    /**
     * metodo que lista los depositos por su número de deposito
     *
     * @param recibo
     * @return BigDecimal
     * @version 1.0, 08/06/2015
     * @author chanoRojas
     */
    String encuentraDepositosPorRecibo(Recibo recibo);

     /**
     * Saca la cantidad, y suma de montos  por tasa , dada un determinada fecha por mes
     * @param tramite     
     * @return BigDecimal
     * @version 1.0, 08/06/2015
     * @author Levi Laura
     */
     List<String>  cuentaSumaXtasaXmes(Date fechaI, Date fechaF, Long idRegional);
     /**
     * Saca la cantidad, y suma de montos  por tasa , dada un determinada fecha por mes en todo sus días.
     * @param tramite     
     * @return BigDecimal
     * @version 1.0, 08/06/2015
     * @author Levi Laura
     */
     List<String>  cuentaSumaXtasaXmesXDia(String fecha, Long idRegional);

     
     /**
     * Saca la cantidad, y suma de montos  por tasa , dada un determinada fecha por mes en todo sus días.
     * @param tramite     
     * @return BigDecimal
     * @version 1.0, 08/06/2015
     * @author ChanoRojas
     */
       Boolean validaRegistroDeRecibos(Tramite tramite);

    /**
     * metodo que devuelve los depositos usados por un recibo
     *
     * @param recibo
     * @return BigDecimal
     * @version 1.0, 08/06/2015
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    List<Deposito> muestralistaDedepositosUsadosconSaldoActualizado(Recibo recibo);

     
     
public Recibo encuentraReciboEmitidoPorTramite(Tramite tramite);       
}
