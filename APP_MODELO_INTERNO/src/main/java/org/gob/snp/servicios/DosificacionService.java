package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Dosificacion;
import org.gob.snp.entidades.DosificacionTasa;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoCiudadNotificacion;
import org.gob.snp.entidades.vistas.TipoDosificacion;
import org.gob.snp.entidades.vistas.TipoTasa;
import org.gob.snp.entidades.vistas.TipoTramite;

public interface DosificacionService extends GenericDao<Dosificacion> {

    /**
     * metodo que permite adicionar las Dosificaciones
     *
     * @param titulo
     * @return titulo
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public Dosificacion persistDosificacion(Dosificacion dosificacion) throws Exception;

    /**
     * metodo que permite modifica las Dosificaciones
     *
     * @param titulo
     * @return titulo
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public Dosificacion mergeDosificacion(Dosificacion dosificacion) throws Exception;

    /**
     * metodo que permite eliminar las Dosificaciones
     *
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     * @param titulo
     * @throws java.lang.Exception
     *
     */
    public void removeDosificacion(Dosificacion dosificacion) throws Exception;

    /**
     * metodo que permite listar todos las Dosificaciones
     *
     * @return List
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     */
    public List<Dosificacion> listaDosificacion();

    /**
     * metodo que permite guardar dosificacion
     *
     * @param dosificacion
     * @version 1.0, 02/10/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    public void guradaDosificacion(Dosificacion dosificacion) throws Exception;

    /**
     * metodo que permite modificar el numero siguinete en dosifucacion
     *
     * @param tipoDosificacion
     * @version 1.0, 02/10/2014
     * @author ChanoRojas
     * @param regional
     * @return
     * @throws java.lang.Exception
     */
    Integer actualizaSeguienteDosificacion(TipoDosificacion tipoDosificacion, Regional regional) throws Exception;

    /**
     * metodo que permite modificar el numero siguinete en dosifucacion
     *
     * @param regional
     * @version 1.0, 03/10/2014
     * @author RobertoSantivañez
     * @return
     */
    List<Dosificacion> listaDosificacionPorRegional(Regional regional);

    /**
     * metodo que permite modificar el numero siguinete en dosifucacion
     *
     * @param regional
     * @param serie
     * @version 1.0, 03/10/2014
     * @author RobertoSantivañez
     * @return
     */
    public Integer valorRestoDeposito(Regional regional, String serie);

    /**
     * metodo que permite modificar el numero siguinete en dosifucacion
     *
     * @version 1.0, 07/10/2014
     * @author chanoRojas
     * @return list
     */
    List<TipoCiudadNotificacion> listaTipoCiudadDeNotificacionFiltrado();

    /**
     * metodo que permite modificar
     *
     * @version 1.0, 14/10/2014
     * @author Roberto Santivañez
     * @param dosificacion
     * @param tipoDosificacion
     * @param regional
     * @return list
     */
    Boolean[] validaCamposDosificacion(Dosificacion dosificacion, String tipoDosificacion, String regional);

    /**
     * metodo que permite controlar color a los campos validados de dosificacion
     *
     * @version 1.0, 14/10/2014
     * @author Roberto Santivañez
     * @param dosificacion
     * @return list
     */
    public int validaCampoDosificacionColor(Dosificacion dosificacion);

    /**
     * metodo que permite ver si TipoDosificacion esta registrado en un regional
     *
     * @version 1.0, 31/10/2014
     * @author Roberto Santivañez
     * @param regional
     * @return Boolean
     */
    public List<TipoDosificacion> listaDosificaciones(Regional regional);

    /**
     * metodo que lista los tipos de TipoDosificacion que puede realizar una
     * ragional
     *
     * @version 1.0, 31/10/2014
     * @author Roberto Santivañez
     * @param tipoDosificacion
     * @param regional
     * @return list
     */
    public Boolean verificaRegistroDosificacion(TipoDosificacion tipoDosificacion, Regional regional);

    /**
     * metodo que devuelve el numero restante de dosificaciones por tipo de
     * dosificacion
     *
     * @version 1.0, 5/11/2014
     * @author chanoRojas
     * @param tipoDosificacion
     * @param regional
     * @return list
     */
    Integer encuentraRestanteSegunTipoDosificacion(TipoDosificacion tipoDosificacion, Regional regional);

     /**
     * método que Encuentra Serie de que correponde a un tramite de acuerdo al
     * TipoTramite, Regional y Nacionalidad del Solicitante
     *
     * @param Regional
     * @param Nacionalidad
     * @param TipoTramite
     * @param Usuario
     * @return String
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 17/03/2015
     * Descripcion: Se agrega el metodo encuentraSerie, que Encuentra Serie de que correponde a un tramite de acuerdo al TipoTramite, Regional y Nacionalidad del Solicitante
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    public String encuentraSerie(final TipoTramite tipoTramite, final Regional regional, final TipoTasa tipoTasa, Usuario usuario);

}
