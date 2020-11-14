package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Modificacion;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoModificacion;

/**
 *
 * @author gusn8
 *
 */
public interface ModificacionService extends GenericDao<Modificacion> {

    /**
     * Metodo que permite adicionar una Modificacion
     *
     * @param modificacion
     * @return Modificacion
     * @version 1.0, 25/09/20154
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    public Modificacion persistModificacion(Modificacion modificacion) throws Exception;

    /**
     * Metodo que permite modificar una Modificacion
     *
     * @param modificacion
     * @return Modificacion
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    public Modificacion mergeModificacion(Modificacion modificacion) throws Exception;

    /**
     * Metodo que permite aliminar una Modificacion
     *
     * @param modificacion
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    public void removeModificacion(Modificacion modificacion) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return List
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     */
    public List<Modificacion> listaModificacion();

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @param modificacion
     * @param tramite
     * @param tipoModificacion
     * @param nombreTitular
     * @param domicilioTitular
     * @param signoDistintivoTitular
     * @param tipoSignoTitular
     * @param claseTitular
     * @param numeroRegistro
     * @param serieNumeroRegistro,
     * @param codigoSM
     * @param numeroPublicacion
     * @param numeroUltimaRenovacion
     * @param nuevaDireccion
     * @param nuevaNacionalidad
     * @param nuevoPaisDeConstitucion
     * @param acompMarcaLema
     * @param numeroRegistroMarcaLema
     * @param serieRegistroMarcaLema
     * @param fechaRegistroParaLema
     * @param usuario
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @return
     * @throws java.lang.Exception
     */
    Modificacion guardaModificacionDireccion(Modificacion modificacion, Tramite tramite, String tipoModificacion, String nombreTitular, String domicilioTitular, String signoDistintivoTitular, String tipoSignoTitular, String claseTitular, String numeroRegistro, String serieNumeroRegistro, String codigoSM, Long numeroPublicacion, String numeroUltimaRenovacion, String nuevaDireccion, String nuevaNacionalidad, String nuevoPaisDeConstitucion, String acompMarcaLema, String numeroRegistroMarcaLema, String serieRegistroMarcaLema, Date fechaRegistroParaLema, Usuario usuario) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @param modificacion
     * @param tramite
     * @param tipoModificacion
     * @param nombreTitular
     * @param domicilioTitular
     * @param signoDistintivoTitular
     * @param tipoSignoTitular
     * @param claseTitular
     * @param numeroRegistro
     * @param serieNumeroRegistro,
     * @param codigoSM
     * @param numeroPublicacion
     * @param numeroUltimaRenovacion
     * @param usuario
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @return
     * @throws java.lang.Exception
     */
    Modificacion guardaModificacionNombre(Modificacion modificacion, Tramite tramite, String tipoModificacion, String nombreTitular, String domicilioTitular, String signoDistintivoTitular, String tipoSignoTitular, String claseTitular, String numeroRegistro, String serieNumeroRegistro, String codigoSM, Long numeroPublicacion, String numeroUltimaRenovacion, String acompMarcaLema, String numeroRegistroMarcaLema, String serieRegistroMarcaLema, Date fechaRegistroParaLema, Usuario usuario) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @param modificacion
     * @param tramite
     * @param tipoModificacion
     * @param nombreTitular
     * @param domicilioTitular
     * @param signoDistintivoTitular
     * @param tipoSignoTitular
     * @param claseTitular
     * @param numeroRegistro
     * @param serieNumeroRegistro,
     * @param codigoSM
     * @param numeroPublicacion
     * @param numeroUltimaRenovacion
     * @param fechaInicioLicencia
     * @param fechaFinLicencia
     * @param licenciaIndefinida
     * @param usuario
     * @return
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Modificacion guardaModificacionLicenciaDeUso(Modificacion modificacion, Tramite tramite, String tipoModificacion, String nombreTitular, String domicilioTitular, String signoDistintivoTitular, String tipoSignoTitular, String claseTitular, String numeroRegistro, String serieNumeroRegistro, String codigoSM, Long numeroPublicacion, String numeroUltimaRenovacion, Date fechaInicioLicencia, Date fechaFinLicencia, Boolean licenciaIndefinida, String acompMarcaLema, String numeroRegistroMarcaLema, String serieRegistroMarcaLema, Date fechaRegistroParaLema, Usuario usuario) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return Boolean
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Boolean[] validaModificaciones() throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return Boolean
     * @param nuevaDireccion
     * @param nuevaNacionalidad
     * @param nuevoPaisDeConstitucion
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Boolean[] validaCambioDireccion(String nuevaDireccion, String nuevaNacionalidad, String nuevoPaisDeConstitucion) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return Boolean
     * @param fechaInicio
     * @param fechaFin
     * @param indefinido
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Boolean[] validaLicenciasDeUso(Date fechaInicio, Date fechaFin, Boolean indefinido) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return Boolean
     * @param nombreTitular
     * @param domicilioTitular
     * @param signoDistintivoTitular
     * @param tipoSigno
     * @param tipoTitular
     * @param numeroPublicacion
     * @param numeroRegistro
     * @param numeroUltimaRenovacion
     * @param SM
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Boolean[] validaCabecera(String nombreTitular, String domicilioTitular, String signoDistintivoTitular, String tipoSigno, String tipoTitular, String numeroRegistro, String SM, Long numeroPublicacion, String numeroUltimaRenovacion) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return Boolean
     * @param numeroDocumento
     * @param empresa
     * @param tipoDocumentoIdentidad
     * @param lugarExpedicion
     * @param paisNacionalidad
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     */
    Boolean[] validaCamposJuridicoCambioNombre(String numeroDocumento, Empresa empresa, String tipoDocumentoIdentidad, String lugarExpedicion, String paisNacionalidad);

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @return Boolean
     * @param numeroDocumento
     * @param persona
     * @param tipoDocumentoIdentidad
     * @param lugarExpedicion
     * @param paisNacionalidad
     * @version 1.0, 25/09/2015
     * @author Gustavo Lizárraga
     */
    Boolean[] validaCamposNaturalCambioNombre(String numeroDocumento, Persona persona, String tipoDocumentoIdentidad, String lugarExpedicion, String paisNacionalidad);

    public Modificacion recuperaModificacionPorTramite(Long IdTramite, Long IdUsuario);

    public TipoModificacion obtieneTipoModificacion(Tramite tramite) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @param modificacion
     * @param tramite
     * @param tipoModificacion
     * @param nombreTitular
     * @param domicilioTitular
     * @param signoDistintivoTitular
     * @param tipoSignoTitular
     * @param claseTitular
     * @param numeroRegistro
     * @param serieNumeroRegistro,
     * @param codigoSM
     * @param numeroPublicacion
     * @param numeroUltimaRenovacion
     * @param fusionParticipante
     * @param usuario
     * @return
     * @version 1.0, 26/10/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Modificacion guardaModificacionFusion(Modificacion modificacion, Tramite tramite, String tipoModificacion, String nombreTitular, String domicilioTitular, String signoDistintivoTitular, String tipoSignoTitular, String claseTitular, String numeroRegistro, String serieNumeroRegistro, String codigoSM, Long numeroPublicacion, String numeroUltimaRenovacion, String acompMarcaLema, String numeroRegistroMarcaLema, String serieRegistroMarcaLema, Date fechaRegistroParaLema, String fusionParticipante, Usuario usuario) throws Exception;

    /**
     * Metodo que permite listar todas las Modificaciones
     *
     * @param modificacion
     * @param tramite
     * @param tipoModificacion
     * @param nombreTitular
     * @param domicilioTitular
     * @param signoDistintivoTitular
     * @param tipoSignoTitular
     * @param claseTitular
     * @param numeroRegistro
     * @param serieNumeroRegistro,
     * @param codigoSM
     * @param numeroPublicacion
     * @param numeroUltimaRenovacion
     * @param usuario
     * @return
     * @version 1.0, 26/10/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    Modificacion guardaModificacionTransferencia(Modificacion modificacion, Tramite tramite, String tipoModificacion, String nombreTitular, String domicilioTitular, String signoDistintivoTitular, String tipoSignoTitular, String claseTitular, String numeroRegistro, String serieNumeroRegistro, String codigoSM, Long numeroPublicacion, String numeroUltimaRenovacion, String acompMarcaLema, String numeroRegistroMarcaLema, String serieRegistroMarcaLema, Date fechaRegistroParaLema, Usuario usuario) throws Exception;

    /**
     * Método que permite encontrar Modificacion segun Tramite 
     *
     * @param tramite
     * @return Tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz Fecha: 15/10/2015
     * Descripcion: Se agrega el metodo obtieneModificacion,
     * el metodo encuentra el objeto Modificacion segun un tramite, se utiliza en el Formulario de solicitud PI103
     * </pre>
     *
     * @throws java.lang.Exception
     */
    Modificacion obtieneModificacion(Tramite tramite) throws Exception;
    
    /**
     * Método que permite encontrar Modificacion segun Tramite y tipo de modificacion
     *
     * @param tramite
     * @param tipoModificacion
     * @param usuario
     * @return Tramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz Fecha: 15/12/2015
     * Descripcion: Se agrega el metodo preguntaSiExisteModificacionPorTipoModificacion,
     * el metodo encuentra el objeto Modificacion segun un tramite y tipo de modificacion si existe, se utiliza en el Formulario de Modificacion General
     * </pre>
     *
     * @throws java.lang.Exception
     */
    Modificacion preguntaSiExisteModificacionPorTipoModificacion(Tramite tramite, String tipoModificacion, Usuario usuario)  throws Exception;   
    
    Tramite encuentraTramiteModificacionPorCodigo(String codigo, Usuario usuario);
}
