package org.gob.snp.servicios;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface SmSignoMarcaService extends GenericDao<SMSignoMarca> {

    SMSignoMarca persistSmsignoMarca(SMSignoMarca smsignomarca) throws Exception;

    SMSignoMarca mergeSmsignoMarca(SMSignoMarca smsignomarca) throws Exception;

    void removeSmsignoMarca(SMSignoMarca smsignomarca) throws Exception;

    List<SMSignoMarca> listaSmSignoMarca();

    /**
     * Método para realizar el listado de los logotipos asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 05/08/2014
     * @author Eddy Valero
     * @author Henrry Guzman Modificacion Adicion Exception
     * @version 2.0, 25/09/2014
     * @param tramite
     * @return SMSignoMarca
     * @throws java.lang.Exception
     */
    SMSignoMarca registroSmsignoMarcaXTramite(Tramite tramite) throws Exception;

    /**
     * Metodo que verifica si el Tramite ingresado tiene un SMSignoMarca
     * registrado
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     */
    Boolean tieneSmSignoMarca(Tramite tramite);

    /**
     * Método que encuentra el SmSignoMarca por tramite
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     */
    SMSignoMarca encuentraSmSignoMarca(Tramite tramite);
    
    /**
     * Método que recupera un conjunto de SmSignoMarca de acuerdo a la busqueda 
     * de los parecidos en el nombre de la marca
     *
     * @version 1.0, 21/10/2014
     * @author Eddy Valero
     * @param marca
     * @param analisisEtapa
     * @return List
     */
    List<SMSignoMarca> encuentraListaSmSignoMarcaPorMarcaNoExistsRegistroExistenteEF(String marca, AnalisisEtapa analisisEtapa);
    
    /**
     * Método que recupera un conjunto de SmSignoMarca de acuerdo a la busqueda 
     * de los parecidos en el nombre de la marca sin considerar que el registro
     * buscado se encuentre aun registrado (No se encuentra en la tabla Registro)
     *
     * @version 1.0, 09/12/2014
     * @author Eddy Valero
     * @param marca
     * @param analisisEtapa
     * @return List
     */
    List<SMSignoMarca> encuentraListaSmSignoMarcaPorMarcaExistsOrNotRegistroExistenteEF(String marca, AnalisisEtapa analisisEtapa);
    
    
    /**
     * Método que encuentra el SmSignoMarca de acuerdo a un AnalisisEtapa Ingresado
     *
     * @version 1.0, 30/10/2014
     * @author Eddy Valero
     * @param analisisEtapa
     * @return SMSignoMarca
     */
    SMSignoMarca encuentraSmSignoMarcaPorAnalisisEtapa(AnalisisEtapa analisisEtapa);
    /**
     * Método que confirma si existe creado un objeto SmsignoMarca ligado a un tramite
     *
     * @version 1.0, 18/12/2014
     * @author chanoRojas
     * @param tramite
     * @return SMSignoMarca
     */
    Boolean verificaSiExisteSmSignoMarca(Tramite tramite);
    

    /**
     * Método que recupera todos los registros de Signos y Marcas de acuerdo 
     * a la Marca y Clase Niza enviados
     *
     * @param marca
     * @param analisisEtapa
     * @param claseNiza
     * @param usuario
     * @return List<SMSignoMarca>
     * @throws java.lang.Exception
     * 
     * <pre>
     * Creado: Eddy Valero Fecha: 20/05/2015
     * Descripcion: metodo para obtener todos los SMSignoMarcas de acuerdo a una marca 
     * o a una clase niza
     * --------------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 25/06/2015
     * Se modifica la búsqueda para que se considere en el criterio de busqueda por 
     * Nombre de la Marca o por Clase Niza.
     * </pre>
     */
    List<SMSignoMarca> encuentraListaSmSignoMarcaPorMarcaPorNizaNoExistsRegistroExistenteEF(String marca, AnalisisEtapa analisisEtapa, Long claseNiza, Usuario usuario) throws Exception;
    
    
    /**
     * Método que realiza la busqueda de datos para asociar a una solicitud de signo un Lema Comercial
     *
     * @param parametros
     * @param nombreMarca
     * @param codigoSM
     * @param numeroResolucion     
     * @param serieResolucion     
     * @param fechaVigencia     
     * @return Tramite
     * @throws java.lang.Exception
     * 
     * <pre>
     * --------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 14/10/2015
     * Descripcion: Método para realizar una búsqueda por trámite solicitado, devolviendo
     * el tramite Solicitado.
     * --------------------------------------------------------------------------
     * </pre>
     */
    Tramite obtenerTramiteParaLemaComercial(HashMap parametros,String nombreMarca, String codigoSM, String numeroResolucion, String serieResolucion, Date fechaVigencia) throws Exception;
    
    
    
}
