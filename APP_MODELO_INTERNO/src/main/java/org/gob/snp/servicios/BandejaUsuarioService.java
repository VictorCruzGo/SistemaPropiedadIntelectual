package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.BandejaUsuario;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoTramite;

/**
 * @author Jonathan Valdivia  <pre>
 * -------------------------------------------------------------------------------------------
 * Modificado: Jonathan Valdivia  Fecha: 10/12/2014
 * Tarea: Verificar si al menos alguno de los registros que apareceran en la bandeja tiene observacion
 * Metodos Modificados: ninguno
 * Metodos Agregados: verificaSiTieneObservacion
 *
 * </pre>
 */
public interface BandejaUsuarioService extends GenericDao<BandejaUsuario> {

    /**
     * método que permite listar todos los registros de la Vista creada para las
     * Bandejas
     *
     * @return List
     * @version 1.0, 26/06/2014
     * @author Jonathan Valdivia
     */
    List<BandejaUsuario> listaBandeja();

    /**
     * Método responsable de listar todos los registros por Usuario y segun el
     * Area
     *
     * @param usuario usuario para el cual se verificará si tiene documentos
     * pendientes
     * @param fechaInicial fecha desde la cual se quiere buscar los tramites
     * asignados al usuario
     * @param fechaFinal fecha hasta la cual se quiere buscar los tramites
     * asignados al usuario
     * @return List<BandejaUsuario>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 26/06/2014
     * Descripcion: Se agrega el metodo listaBandejaPorUsuario
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 24/04/2015
     * Descripcion: Se modifica el método agregándose los comentarios, el método de log,
     * también se modifica en la comparación de fechas y recupere los tramites
     * hasta el día siguiente
     * </pre>
     *
     */
    List<BandejaUsuario> listaBandejaPorUsuario(Usuario usuario, Date fechaInicial, Date fechaFinal) throws Exception;

    /**
     * Método responsable de listar todos los registros por Usuario y segun el
     * Area
     *
     * @param usuario usuario para el cual se verificará si tiene documentos
     * pendientes
     * @param fechaInicial fecha desde la cual se quiere buscar los tramites
     * asignados al usuario
     * @param fechaFinal fecha hasta la cual se quiere buscar los tramites
     * asignados al usuario
     * @return List<BandejaUsuario>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 26/06/2014
     * Descripcion: Se agrega el metodo listaBandejaPorUsuario
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 24/04/2015
     * Descripcion: Se modifica el método agregándose los comentarios, el método de log,
     * también se modifica en la comparación de fechas y recupere los tramites
     * hasta el día siguiente
     * </pre>
     *
     */
    
    List<BandejaUsuario> listaBandejaPorUsuarioRevisor(Usuario usuario, Date fechaInicial, Date fechaFinal) throws Exception;
    /**
     * Método responsable de listar todos los registros por Usuario y segun el
     * Area
     *
     * @param usuario usuario para el cual se verificará si tiene documentos
     * pendientes
     * @param fechaInicial fecha desde la cual se quiere buscar los tramites
     * asignados al usuario
     * @param fechaFinal fecha hasta la cual se quiere buscar los tramites
     * asignados al usuario
     * @return List<BandejaUsuario>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 26/06/2014
     * Descripcion: Se agrega el metodo listaBandejaPorUsuario
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 24/04/2015
     * Descripcion: Se modifica el método agregándose los comentarios, el método de log,
     * también se modifica en la comparación de fechas y recupere los tramites
     * hasta el día siguiente
     * </pre>
     *
     */

    List<BandejaUsuario> listaBandejaPorUsuarioTipoTramite(Usuario usuario, Date fechaInicial, Date fechaFinal, String codigoEtapaTramite) throws Exception;

    /**
     * método que permite generar el nombre objeto del tramite segun la etapa
     *
     * @param etapa
     * @return String (nombre del titulo del tramite)
     * @version 1.0, 02/07/2014
     * @author Jonathan Valdivia
     */
    String generaNombrePorEtapa(String etapa);

    /**
     * método que devuelve la diferencia entre dos fechas en dias
     *
     * @param fechaInicial
     * @param fechaFinal
     * @return int
     * @version 1.0, 02/07/2014
     * @author Jonathan Valdivia
     */
    int diferenciaDeFechasEnDias(Date fechaInicial, Date fechaFinal);

    /**
     * método que devuelve el color segun la etapa y la fechaInicial
     *
     * @param tipoTramite
     * @param etapaTramite
     * @param fechaAsignacion
     * @return int
     * @version 1.0, 02/07/2014
     * @author Jonathan Valdivia
     */
    String generaColoresSemaforoSegunEtapaYDias(TipoTramite tipoTramite, EtapaTramite etapaTramite, Date fechaAsignacion);

    /**
     * Método responsable de que a partir de la bandeja navegue a una
     * determinada vista en funcion de la etapa tramite que le corresponde al
     * usuario
     *
     * @param bandejaUsuario
     * @param usuario
     * @return String, regla de navegación que le corresponde a una determinada
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 02/07/2014
     * Descripcion: Se agrega el metodo navegaSegunTipoTramite
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 24/04/2015
     * Descripcion: Se realiza modificaciones para que solamente de acuerdo al
     * tramiteEtapa enviado se realice la navegacion a una vista, ademas de
     * agregarle el log del usuario, en caso que no se identifique ninguna vista
     * se vuelve a la misma página.
     * </pre>
     *
     */
    String navegaSegunTipoTramite(BandejaUsuario bandejaUsuario, Usuario usuario) throws Exception;

    /**
     * método que ordena los colores del Semaforo
     *
     * @param tipoTramite
     * @param etapaTramite
     * @param fechaAsignacion
     * @return String
     * @version 1.0, 02/07/2014
     * @author Jonathan Valdivia
     */
    String ordenaSemaforo(TipoTramite tipoTramite, EtapaTramite etapaTramite, Date fechaAsignacion);

    /**
     * Método que verifica si al menos alguno de los registros de la Bandeja
     * tiene Observación
     *
     *
     * @param listaBandejaUsuario lista de registros que debe atender en bandeja
     * dicho usuario
     * @return Boolean si es true quiere decir que existe al menos un registro
     * con observacion, caso contrario envia False
     */
    Boolean verificaSiTieneObservacion(List<BandejaUsuario> listaBandejaUsuario);

}
