package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoRequisito;
import org.gob.snp.pojo.ExamenFormaPojo;

public interface ExamenFormaPojoService extends GenericDao<ExamenFormaPojo> {

    /**
     * método que permite listar todos los ExamenFormaPojo
     *
     * @param tramite
     * @param etapaTramite
     * @param tipoRequisito
     * @return List
     * @version 1.0, 08/09/2014
     * @author Eddy Valero
     */
    List<ExamenFormaPojo> listaExamenFormaPojo(Tramite tramite, EtapaTramite etapaTramite, TipoRequisito tipoRequisito);

    /**
     * Método que permite guardar el Examen de Forma
     *
     * @param listaExamenFormaPojos
     * @param usuario
     * @param paraNotificacion
     * @param observacionUsuario
     * @throws java.lang.Exception
     *
     * <pre>
     * --------------------------------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 08/09/2014
     * Descripcion: Se crea el metodo guardaExamenDeForma
     * --------------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 24/04/2015
     * Descripcion: Se modifica el metodo con la adecuacion de obtieneFlujoPorTipoTramite
     *
     * </pre>
     *
     */
    void guardaExamenDeForma(List<ExamenFormaPojo> listaExamenFormaPojos, Usuario usuario, String observacionUsuario) throws Exception;

    /**
     * Método que verificar si se teckeo todos los documentos
     *
     * @version 1.0, 23/09/2014
     * @author Jonathan Valdivia
     * @param listaExamenFormaPojos
     * @param usuario
     * @param observacionUsuario
     * @return
     * @throws java.lang.Exception
     * * --------------------------------------------------------------------------
     * Modificado: Gustavo Lizárraga Fecha: 31/08/2015
     * Descripcion: Se modifica el metodo para los 3 nuevos botones suprimiendo el
     * parámetro de notificación.
     *---------------------------------------------------------------------------
     */
    String verificaTodosLosDocumentos(List<ExamenFormaPojo> listaExamenFormaPojos, Usuario usuario, String observacionUsuario) throws Exception;

    /**
     * Método que permite guardar el Examen de Forma Sin Finalizar la operación
     *
     * @version 1.0, 23/09/2014
     * @author Jonathan Valdivia
     * @param listaExamenFormaPojos
     * @throws java.lang.Exception
     */
    void guardaSinFinalizarExamenDeForma(List<ExamenFormaPojo> listaExamenFormaPojos) throws Exception;

    /**
     * Método que verifica si el padre está habilitado
     *
     * @version 1.0, 12/09/2014
     * @author Jonathan Valdivia
     * @param listaExamenFormaPojos
     * @param examenFormaPojo
     * @return
     */
    Boolean verificaSiPadreEstaHabilitado(List<ExamenFormaPojo> listaExamenFormaPojos, ExamenFormaPojo examenFormaPojo);

    /**
     * método que permite generar una Plantilla a partir de un analisis etapa
     *
     *
     * @param tramite
     * @param etapaTramite
     * @param tipoRequisito
     * @param analisisEtapa
     * @param usuario
     * @return List<ExamenFormaPojo>,
     * @throws java.lang.Exception      <pre>
     * --------------------------------------------------------------------------
     * Creado: Eddy Valero Fecha: 05/02/2014
     * Descripcion: Metodo que genera una plantilla para el Examen de Forma de
     * acuerdo al Analisis Etapa y el tipoRequisito
     * --------------------------------------------------------------------------
     * </pre>
     *
     */
    List<ExamenFormaPojo> generarPlantillaExamenFormaPojoPorAnalisisEtapa(Tramite tramite, EtapaTramite etapaTramite, TipoRequisito tipoRequisito, AnalisisEtapa analisisEtapa, Usuario usuario) throws Exception;

    /**
     * Método que permite derivar u observar un tramite de modificacion de
     * nombre o direccion
     *
     * @param tramite
     * @param usuario
     * @param paraNotificacion
     * @param observacionUsuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 30/07/2015
     * Descripcion: permite derivar u observar un tramite de modificacion de nombre o direccion
     * dependiendo si esta observado deriva aventanilla sino deriva a siguiente etapa
     *
     * ----------------------------------------------------
     * </pre>
     */
    public void derivaUObervaCambioNombre(Tramite tramite, Usuario usuario, Boolean paraNotificacion, Boolean observacionUsuario) throws Exception;
}
