package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Direccion;
import org.gob.snp.entidades.SMSolicitadoPrioridad;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface DireccionService extends GenericDao<Direccion> {

    /**
     * metodo que permite adicionar Direccion
     *
     * @param direccion
     * @return Direccion
     * @version 1.0, 20/06/2014
     * @author Chano
     * @throws java.lang.Exception
     */
    Direccion persistDireccion(Direccion direccion) throws Exception;

    /**
     * metodo que permite modifica Direccion
     *
     * @param direccion
     * @return Direccion
     * @version 1.0, 20/06/2014
     * @author Chano
     * @throws java.lang.Exception
     */
    Direccion mergeDireccion(Direccion direccion) throws Exception;

    /**
     * metodo que permite eliminar Direccion
     *
     * @version 1.0, 20/06/2014
     * @author Chano
     * @param direccion
     * @throws java.lang.Exception
     *
     */
    void removeDireccion(Direccion direccion) throws Exception;

    /**
     * metodo que permite listar todos Direccion
     *
     * @return List
     * @version 1.0, 20/06/2014
     * @author Chano
     */
    List<Direccion> listaDireccion();

    /**
     * metodo que permite listar registros de Direccion asociados a un
     * determinado Tramite
     *
     * @return List
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param tramite
     */
    List<Direccion> listaDireccionXTramite(Tramite tramite);

    /**
     * metodo que devuelve la posicion que ocupa un determinado registro a
     * partir de un listado de Direcciones
     *
     * @return int
     * @version 1.0, 05/08/2014
     * @author Eddy Valero
     * @param listaDireccion
     * @param direccionSeleccionada
     */
    int encuentraPosicionListadoDireccion(List<Direccion> listaDireccion, Direccion direccionSeleccionada);

    /**
     * metodo devuelve la lista de las direcciones que tiene un usuario par
     * efectos de notificacion
     *
     * @param usuario
     * @return List
     * @version 1.0, 12/08/2014
     * @author Roberto Santivañez, Jonathan Valdivia
     */
    List<Direccion> listaDireccionPorUsuario(Usuario usuario);

    /**
     * Método que verifica si el tramite enviado tiene una Direccion registrada
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     *
     */
    Boolean tieneDireccion(Tramite tramite);

    /**
     * Método que lista todas las direcciones por Tramite
     *
     * @return List
     * @version 1.0, 20/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     */
    List<Direccion> listaDireccionesPorTramite(Tramite tramite);

    /**
     * Método valida los campos del formulario de direccion registro PI100
     * quinta pestaña este metodo nos retorna un mensaje de validacion.
     *
     * @param direccion
     * @return String
     * @version 1.0, 29/09/2014
     * @author chanoRojas
     * @param tipoCiudadNotificacion
     * @param zonaNotificacion
     */
    String[] validaCamposDireccion(Direccion direccion, String tipoCiudadNotificacion, String zonaNotificacion);

    /**
     * Método cambia color campos del formulario de direccion si la validacion a
     * si lo requiere registro PI100 quinta pestaña este metodo nos retorna un
     * entero para verificar el campo a pintar.
     *
     * @return int
     * @version 1.0, 22/09/2014
     * @author Henrry Guzman
     * @param Direccion direccion
     */
    int validaCamposDireccionCambiaColor(Direccion direccion);

    /**
     * Método que obtiene la direccion vigente para un determinado Tramite
     *
     * @return Direccion
     * @version 1.0, 22/09/2014
     * @author Eddy Valero
     * @param tramite
     */
    Direccion encuentraDireccionVigentePorTramite(Tramite tramite);

    /**
     * Método que permite obtener todas las direcciones asociadas a un
     * determinado Tramite
     *
     * @param tramite
     * @param usuario
     * @return List<Direccion>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 24/02/2015
     * Descripcion: Se agrega el metodo listaDireccionXTramite
     * ----------------------------------------------------
     * </pre>
     */
    List<Direccion> listaDireccionXTramite(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método que permite obtener la zona general ya sea Macrodistrito o
     * Provincia para agrupar las notificaciones.
     *
     * @param coordenadas
     * @return String
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Gustavo Lizárraga Fecha: 15/05/2015
     * Descripcion: Se agrega el metodo obtieneZonaGeneral
     * ----------------------------------------------------
     * </pre>
     */
    String obtieneZonaGeneral(String coordenadas) throws Exception;

    /**
     * *****Metodos nuevos*******
     */
    /**
     * Método valida los campos del formulario de direccion 
     *
     * @param direccion
     * @return String
     * @param tipoCiudadNotificacion
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 28/09/2015
     * Descripcion: creación del método validaCamposDireccion
     * ----------------------------------------------------
     * </pre>
     * @throws java.lang.Exception
     */
    String[] validaCamposDireccion(Direccion direccion, String tipoCiudadNotificacion) throws Exception;

}
