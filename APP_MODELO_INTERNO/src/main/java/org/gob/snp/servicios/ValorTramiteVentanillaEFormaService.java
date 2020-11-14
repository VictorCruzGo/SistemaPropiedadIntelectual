package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.ValorTramiteVentanillaEForma;

public interface ValorTramiteVentanillaEFormaService extends GenericDao<ValorTramiteVentanillaEForma> {

    /**
     * método que permite listar todos las datos de Valores que guardan en
     * ventanilla Tramite
     *
     * @return Lista
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     */
    public List<ValorTramiteVentanillaEForma> listadoValorTramiteVentanillaEForma();

    /**
     * método que permite adicionar Valores que guardan en ventanilla Tramite
     *
     * @param datoTramiteVentanillaEForma
     * @return
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public ValorTramiteVentanillaEForma persistValorTramiteVentanillaEForma(ValorTramiteVentanillaEForma valorTramiteVentanillaEForma) throws Exception;

    /**
     * metodo que permite modifica Valores que guardan en ventanilla Tramite
     *
     * @param datoTramiteVentanillaEForma
     * @return datoTramiteVentanillaEForma
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public ValorTramiteVentanillaEForma mergeValorTramiteVentanillaEForma(ValorTramiteVentanillaEForma valorTramiteVentanillaEForma) throws Exception;

    /**
     * metodo que permite eliminar Valores que guardan en ventanilla Tramite
     *
     * @version 1.0, 04/09/2014
     * @author RobertoSantivañez
     * @param datoTramiteVentanillaEForma
     *
     * @throws java.lang.Exception
     *
     */
    public void removeValorTramiteVentanillaEForma(ValorTramiteVentanillaEForma valorTramiteVentanillaEForma) throws Exception;

    /**
     * metodo que permite encontrar los ValorTramiteVentanillaEForma segun un
     * DatoTramiteVentanillaEForma
     *
     * @version 1.0, 05/09/2014
     * @author Chano Rojas
     * @param datoTramiteVentanillaEForma
     * @return
     *
     *
     */
    public List<ValorTramiteVentanillaEForma> listaValoresTramiteVentanillaEFormaPorDatoTramite(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma);

    /**
     * Método que inserta un registro en TramiteFlujoVentanillaEforma
     *
     *
     * @param valorTramiteVentanillaEForma
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
    public ValorTramiteVentanillaEForma guardarValorTramiteVentanillaEForma(ValorTramiteVentanillaEForma valorTramiteVentanillaEForma, String etapa, String direccionIP, Long idUsuario) throws Exception;

}
