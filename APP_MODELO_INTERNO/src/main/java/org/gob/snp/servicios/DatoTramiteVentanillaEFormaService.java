package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoRequisito;

public interface DatoTramiteVentanillaEFormaService extends GenericDao<DatoTramiteVentanillaEForma> {

    /**
     * método que permite listar todos las datos de Tramites que entran a
     * ventanilla
     *
     * @return Lista
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     */
    public List<DatoTramiteVentanillaEForma> listadoDatoTramiteVentanillaEForma();

    /**
     * método que permite adicionar datos de Tramites que entran a ventanilla
     *
     * @param datoTramiteVentanillaEForma
     * @return
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public DatoTramiteVentanillaEForma persistDatosTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma) throws Exception;

    /**
     * metodo que permite modifica datos de Tramites que entran a ventanilla
     *
     * @param datoTramiteVentanillaEForma
     * @return datoTramiteVentanillaEForma
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public DatoTramiteVentanillaEForma mergeDatosTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma) throws Exception;

    /**
     * metodo que permite eliminar datos de Tramites que entran a ventanilla
     *
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     * @param datoTramiteVentanillaEForma
     *
     * @throws java.lang.Exception
     *
     */
    public void removeDatoTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma) throws Exception;

    /**
     * metodo que permite eliminar datos de Tramites que entran a
     *
     * @version 1.0, 05/09/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     * @throws java.lang.Exception
     *
     */
    public List<DatoTramiteVentanillaEForma> listaDatoTramiteVentanillaEForma(Tramite tramite) throws Exception;

    /**
     * metodo que permite eliminar datos de Tramites que entran a
     *
     * @version 1.0, 08/09/2014
     * @param analisisEtapa
     * @authorchanoRojas
     * @param tipoRequisito
     * @return
     * @List
     *
     */
    List<DatoTramiteVentanillaEForma> listaDatoTramiteVEntanillaPorRequisitoFlujoVentanillaEForma(AnalisisEtapa analisisEtapa, TipoRequisito tipoRequisito);

    /**
     * Método que permite encontrar DatoTramiteVentanillaEForma con el AnalisisEtapa
     * Tramite
     *
     * @version 1.0, 10/04/2015
     * @author Levi Laura
     * @param tramite
     * @return
     */
    List<DatoTramiteVentanillaEForma> listaDatoTramiteVEntanillaPorAnalisisEtapa(AnalisisEtapa analisisEtapa);
    
    /**
     * Método que permite encontrar los Requisitos Adicionales de Ventanilla por
     * Tramite
     *
     * @version 1.0, 09/09/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     */
    
    List<DatoTramiteVentanillaEForma> listaDatosTramiteVentanillaAdicionales(Tramite tramite);

    /**
     * Método que realiza la eliminación de registros de la Tabla
     * DatoTramiteVentanillaEForma, de acuerdo al AnalisisEtapa
     *
     * @param analisisEtapa
     * @param fechaProceso
     * @param direccionIP
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * -------------------------------------------------------
     * Creado: Eddy Valero Fecha: 17/03/2014
     * Descripcion: Se elimina los registros de DatoTramiteVentanillaEForma, cuyos registros
     * sean de TipoRequisito adicionales
     * </pre>
     */
    void EliminarAdicionalesDatoTramiteVentanillaEFormaDeAnalisisEtapa(AnalisisEtapa analisisEtapa, Date fechaProceso, String direccionIP, Usuario usuario) throws Exception;

    /**
     * Método que verifica si ya existe algun registro de DatoTramiteVentanilla
     * asociado al Analisis Etapa introducido
     *
     *
     * @param analisisEtapa
     * @param usuario
     * @return Boolean: Verdadero si existe algun registro asociado a
     * AnalisisEtapa Falso en caso contrario
     * @throws java.lang.Exception
     *
     *
     * <pre>
     * -------------------------------------------------------
     * Creado: Eddy Valero Fecha: 17/03/2014
     * Descripcion: Se elimina los registros de DatoTramiteVentanillaEForma, cuyos registros
     * sean de TipoRequisito adicionales
     * </pre>
     */
    Boolean validaExisteRegistrosDatoTramiteVentanillaenAnalisisEtapa(AnalisisEtapa analisisEtapa, Usuario usuario) throws Exception;
    
    
    /**
     * Método que inserta un registro en TramiteFlujoVentanillaEforma
     *
     *
     * @param datoTramiteVentanillaEForma
     * @param etapa
     * @param direccionIP
     * @param idUsuario
     * @return DatoTramiteVentanillaEForma, registro insertado
     * @throws java.lang.Exception
     *
     *
     * <pre>
     * -------------------------------------------------------
     * Creado: Eddy Valero Fecha: 11/12/2015
     * Descripcion: El metodo realiza la inserción del registro con los logs requeridos
     * </pre>
     */
    public DatoTramiteVentanillaEForma guardarDatosTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma, String etapa, String direccionIP, Long idUsuario) throws Exception;

}
