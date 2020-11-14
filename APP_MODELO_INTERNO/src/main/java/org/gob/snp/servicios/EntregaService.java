/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Entrega;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 *
 * @author gusn8
 */
public interface EntregaService extends GenericDao<Entrega> {

    /**
     * Metodo que permite adicionar Entrega de Documentos
     *
     * @param entrega
     * @return Entrega
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Entrega persistEntrega(Entrega entrega) throws Exception;

    /**
     * Metodo que permite modifica la Entrega de Documentos
     *
     * @param entrega
     * @return Entrega
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Entrega mergeEntrega(Entrega entrega) throws Exception;

    /**
     * Metodo que permite eliminar Entrega de Documentos
     *
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @param entrega
     * @throws java.lang.Exception
     *
     */
    void removeEntrega(Entrega entrega) throws Exception;

    /**
     * Metodo que permite listar todas las Entregas realizadas
     *
     * @return List
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     */
    List<Entrega> listaEntrega();

    /**
     * Método que permite Guardar un registro de una entrega en la Tabla
     * Entrega.
     *
     * @param listaEntregas Lista que se obtiene del PickList asociado a la
     * vista, el cuál contiene todos los documentos entregados
     * @param entregadoA Variable de la vista que contiene el nombre de la
     * persona que recibio el Documento.
     * @param tipoDocumento Variable que almacena el tipo de documento que
     * presento el usuario ya sea (CI, Pasaporte, etc)
     * @param numeroDocumento Variable que almacena el numero de documento
     * @param lugarExpedicion Variable que almacena el lugar de expedición del
     * usuario que recogio el documento.
     * @param observaciones Variable que almacena alguna observacion que se
     * tenga en la entrega de los documentos.
     * @param idUsuario Variable que almacena el ID del usuario asociado a esta
     * entrega, es decir el usuario que entrego un documento.
     * @param tramite
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     * @return boolean
     * @throws java.lang.Exception *
     * ---------------------------------------------------- Modificado por:
     * Gustavo Lizarraga Fecha: 1/07/2015 Descripcion: Se modifico el campo de
     * TipoDocumento que convierte de String a TipoDocumento para almacenar en
     * la base de datos. -----------------------------------------------------
     */
    boolean guardarDocumentosEntregados(List<Documento> listaEntregas, String entregadoA, String tipoDocumento, String numeroDocumento, String lugarExpedicion, String observaciones, long idUsuario, Tramite tramite) throws Exception;

    /**
     * Método que permite listar los Documentos entregados por fecha
     *
     * @param usuario
     * @param fechaFin
     * @param fechaInicio
     * @param codigo
     * @version 1.0, 17/06/2015
     * @author Gustavo Lizárraga
     * @return List
     */
    List<Entrega> listaDocumentosEntregadosPorFechaOcodigo(Usuario usuario, Date fechaInicio, Date fechaFin, String codigo);

    /**
     * Método que permite validar los campos de Entrega de Documentos.
     *
     * @param entregadoA Variable de la vista que contiene el nombre de la
     * persona que recibio el Documento.
     * @param tipoDocumento Variable que almacena el tipo de documento que
     * presento el usuario ya sea (CI, Pasaporte, etc)
     * @param numeroDocumento Variable que almacena el numero de documento
     * @param procedencia Variable que almacena el lugar de expedición del
     * usuario que recogio el documento.
     * @param target, Variable que tiene el numero de documentos que contiene el
     * PickList para tener documentos a entregar, en caso de que sea 0 quiere
     * decir que no coloco ningun documento en la sección de Documentos a
     * Entregar
     * @param activaProcedencia , variable para saber si se activo el tipo de
     * documento para poder validar.
     * @version 1.0, 17/06/2015
     * @author Gustavo Lizárraga
     * @return String[]
     *
     * ---------------------------------------------------- Modificado por:
     * Gustavo Lizarraga Fecha: 1/07/2015 Descripcion: Se adiciono una variable
     * de entrada "activaProcedencia" para identificar cuando se activo el
     * selectOneMenu de TipoDocumento.
     * -----------------------------------------------------
     */
    public String[] validarCampos(String entregadoA, String tipoDocumento, String procedencia, String numeroDocumento, int target, boolean activaProcedencia);

    /**
     * Método que permite validar los campos de Entrega de Documentos.
     *
     * @param tramite
     * @version 1.0, 17/06/2015
     * @author Gustavo Lizárraga
     * @return String[]
     */
    public boolean finalizarEntrega(Tramite tramite);

    /**
     * Método que permite registrar la hora y fecha que inició el trámite de
     * Entrega de Documentos
     *
     * @param tramite
     * @version 1.0, 29/06/2015
     * @author Gustavo Lizárraga
     */
    public void registraFechaInicioEntrega(Tramite tramite);

    /**
     * Método que permite listar registros de la tabla entrega que esten
     * asociados a la ULTIMA entrega realizada por el usuario
     *
     * @param usuario
     * @version 1.0, 30/06/2015
     * @author Levi Laura
     * @return List
     */
    public List<Entrega> encuentraDocumentosEnEntrega(Usuario usuario);

    /**
     * Método que permite validar los campos de Entrega de Documentos.
     *
     * @param fechaFin variable que almacena la fecha de fin.
     * @param fechaInicio Variable que almacena la fecha de inicio.
     * @param codigo Variable que almacena el código a buscar
     * @version 1.0, 06/07/2015
     * @author Gustavo Lizárraga
     * @return String[]
     *
     * <pre>
     * ----------------------------------------------------
     * Modificado por: Gustavo Lizarraga Fecha: 06/07/2015 Descripción: Método
     * que valida el los campos de fecha.
     * -----------------------------------------------------
     * </pre>
     */
    public String[] validarCamposBusquedaPorFechaOcodigo(Date fechaInicio, Date fechaFin, String codigo);
}
