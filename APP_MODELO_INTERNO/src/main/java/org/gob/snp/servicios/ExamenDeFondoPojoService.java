package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.ExamenDeFondoPojo;
import org.gob.snp.pojo.FormularioExamenDeFondoPojo;

public interface ExamenDeFondoPojoService extends GenericDao<ExamenDeFondoPojo> {

    /**
     * Método que permite listar todos los registros rescatados (Prueba)
     *
     * @version 1.0, 01/10/2014
     * @author Jonathan Valdivia
     * @param lista
     * @param columnas
     * @throws java.lang.Exception
     */
    void guarda(List<FormularioExamenDeFondoPojo> lista, int columnas) throws Exception;

    /**
     * Método que permite Observar el Examen de Fondo y asignarlo de acuerdo al
     * tipo de Observacion que se registró
     *
     * @param listaExamenDeFondo
     * @param tramite
     * @param usuario
     * @param paraNotificacion
     * @param observacionUsuario
     * @return String la ruta Url de bandeja una vez finalizada la operacion
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 19/11/2014
     * Descripcion: Se agrega el metodo guardaObservacion
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 06/04/2015
     * Descripcion: Se modifica el metodo para que permite insertar un registro nuevo en
     * TramiteFlujoEtapa para los casos que son enviados hasta ventanilla(OBs)
     * y Casos enviados hasta el Usuario (OBUS)
     * </pre>
     */
    public String guardaObservacion(List<FormularioExamenDeFondoPojo> listaExamenDeFondo, Tramite tramite, Usuario usuario, Boolean paraNotificacion, Boolean observacionUsuario) throws Exception;

    /**
     * Método que permite Conceder el examen de Fondo
     *
     * @param tramite
     * @param usuario
     * @param concedido
     * @throws java.lang.Exception
     *
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 19/11/2014
     * Descripcion: Se agrega el metodo guardaObservacion
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 07/04/2015
     * Descripcion: Al insertarse un nuevo registro agregar los datos de
     * UsuarioModificador y fechaUltimaModificacion
     * </pre>
     */
    public void concedeDeniegaExamenDeFondo(Tramite tramite, Usuario usuario, Boolean concedido) throws Exception;

    /**
     * método que dado un tramite restaura todos los valores hasta la solicitud
     * del Tecnico de Examen de Fondo.
     *
     * @param tramite el tramite que se quiere verificar
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 07/04/2015
     * Descripcion: Se agrega el metodo denegarSolicitudExamenDeFondo, rsponsable de
     * realizar la eliminacion de registros
     *  ----------------------------------------------------
     * </pre>
     *
     *
     */
    public void denegarSolicitudExamenDeFondo(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que dado un tramite guarda las observaciones hasta el anterior
     * registro Tecnico de Examen de Fondo.
     *
     * @param tramite el tramite que se quiere verificar
     * @param usuario
     * @param concedido
     * @param Observacion
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 07/04/2015
     * Descripcion: Se agrega el metodo actualizarObservacionSolicitudExamenDeFondo, rsponsable de
     * realizar la eliminacion de registros
     *  ----------------------------------------------------
     * </pre>
     */
    public void actualizarObservacionSolicitudExamenDeFondo(Tramite tramite, Usuario usuario, Boolean concedido, String Observacion) throws Exception;
    
    
    /**
     * Método que permite Conceder el examen de Fondo a partir de cualquiera de los revisores.
     *
     * @param tramite
     * @param usuario
     * @param aprobado
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 17/08/2015
     * Descripcion: Se crea el método concedeExamenDeFondo
     * </pre>
     */
    public void aprobarExamenDeFondo(Tramite tramite, Usuario usuario, Boolean aprobado) throws Exception;
    
    
    /**
     * Método actualiza la fecha de inicio del tramiteFlujoEtapaDeUnRevisor.
     *
     * @param idTramite
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 17/08/2015
     * Descripcion: Se crea el método concedeExamenDeFondo
     * </pre>
     */
    public void actualizarFechaInicioTramiteFlujoEtapa(Long idTramite, Usuario usuario) throws Exception;
    

}
