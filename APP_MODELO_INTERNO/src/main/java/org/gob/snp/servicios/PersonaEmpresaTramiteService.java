package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.NaturalJuridicoPojo;

public interface PersonaEmpresaTramiteService extends GenericDao<PersonaEmpresaTramite> {

    /**
     * metodo que permite adicionar PersonaEmpresaTramite
     *
     * @param personaEmpresaTramite
     * @return personaEmpresaTramite
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    PersonaEmpresaTramite persistPersonaEmpresaTramite(PersonaEmpresaTramite personaEmpresaTramite) throws Exception;

    /**
     * metodo que permite modifica PersonaEmpresaTramite
     *
     * @param personaEmpresaTramite
     * @return personaEmpresaTramite
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    PersonaEmpresaTramite mergePersonaEmpresaTramite(PersonaEmpresaTramite personaEmpresaTramite) throws Exception;

    /**
     * metodo que permite eliminar PersonaEmpresaTramite
     *
     * @param personaEmpresaTramite
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     *
     */
    void removePersonaEmpresaTramite(PersonaEmpresaTramite personaEmpresaTramite) throws Exception;

    /**
     * metodo que permite listar todos Tramiteusuario
     *
     * @return List
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     */
    List<PersonaEmpresaTramite> listaPersonaEmpresaTramite();

    /**
     * metodo que permite listar todos personas y empresas segun el usuario
     *
     * @param usuario
     * @return List
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     */
    List<PersonaEmpresaTramite> listaPersonasPorUsuarioTramite(Usuario usuario);

    /**
     * metodo que permite listar todos personas segun el usuario
     *
     * @param usuario
     * @return List
     * @version 1.0, 11/07/2014
     * @author ChanoRojas
     */
    List<Persona> listaPersonasPorUsuario(Usuario usuario);

    /**
     * metodo que permite listar todos empresas segun el usuario
     *
     * @param usuario
     * @return List
     * @version 1.0, 11/07/2014
     * @author ChanoRojas
     */
    List<Empresa> listaEmpresasPorUsuario(Usuario usuario);

    /**
     * metodo que permite listar todos las personas apoderadas segun el usuario
     *
     * @param usuario
     * @return List
     * @version 1.0, 30/12/2014
     * @author ChanoRojas
     */
    List<PersonaEmpresaTramite> listaApoderadoPersonaPorUsuario(Usuario usuario);

    /**
     * metodo que permite listar todos las personas apoderadas segun el usuario
     *
     * @param usuario
     * @return List
     * @version 1.0, 30/12/2014
     * @author ChanoRojas
     */
    List<Persona> listaApoderadoPersonaPorUsuarioFinal(Usuario usuario);

    /**
     * metodo que permite obtenes una PersonaEmpresaTramite por medio de un
     * Tramite
     *
     * @version 1.0, 28/07/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return PersonaEmpresaTramite
     */
    PersonaEmpresaTramite obtienePersonaEmpresaTramitePorTramite(Tramite tramite);

    /**
     * metodo que permite verificar si la empresa esta implicada en algun otro
     * tramite
     *
     * @version 1.0, 28/07/2014
     * @author Jonathan Valdivia
     * @param empresa
     * @param tramite
     * @return
     */
    Boolean verificaSiEmpresaEstaImplicadaEnOtroTramite(Empresa empresa, Tramite tramite);

    /**
     * metodo que permite verificar si la persona esta implicada en algun otro
     * tramite
     *
     * @version 1.0, 28/07/2014
     * @author Jonathan Valdivia
     * @param persona
     * @param tramite
     * @return
     */
    Boolean verificaSiPersonaEstaImplicadaEnOtroTramite(Persona persona, Tramite tramite);

    /**
     * metodo que permite verificar si la persona esta implicada en algun otro
     * tramite
     *
     * @version 1.0, 11/08/2014
     * @author Jonathan Valdivia
     * @param codigo
     * @param tipoPersona
     * @param tipoTramite
     * @return
     */
    List<PersonaEmpresaTramite> buscaPersonaempresatramitePorParametrosParaVentanilla(String codigo, String tipoPersona, String tipoTramite);

    /**
     * metodo que permite verificar si la persona esta implicada en algun otro
     * tramite
     *
     * @version 1.0, 11/08/2014
     * @author Jonathan Valdivia
     * @param persona
     * @return
     */
    PersonaEmpresaTramite obtienePersonaEmpresaTramiteSegunPersona(Persona persona);

    /**
     * Método que permite obtener una PersonaEmpresaTramite con una persona que
     * es apoderado por medio de un Tramite
     *
     * @param tramite
     * @return PersonaEmpresaTramite      <pre>
     * ----------------------------------------------------
     * Creado: Jonathan Valdivia Fecha: 28/07/2014
     * Descripcion: recuperar el listado de todas las personas que son apoderados del Tramite
     * </pre>
     *
     */
    PersonaEmpresaTramite obtienePersonaEmpresaTramiteApoderadoPorTramite(Tramite tramite);

    /**
     * metodo que permite obtener una PersonaEmpresaTramite con una persona que
     * es solicitante por medio de un Tramite
     *
     * @version 1.0, 06/11/2014
     * @author chanoRojas
     * @param tramite
     * @return PersonaEmpresaTramite
     */
    PersonaEmpresaTramite obtienePersonaEmpresaTramiteSolicitantePorTramite(Tramite tramite);

    /**
     * metodo que guarda modificado de apoderado
     *
     * @version 1.0, 27/10/2014
     * @author chanoRojas
     * @param tramite
     * @param apoderadoNuevo
     * @throws java.lang.Exception
     */
    void guardaNuevoApoderadoYDaBajaAntiguo(Tramite tramite, Poder apoderadoNuevo) throws Exception;

    /**
     * método que verifica si el cambio de nombre es para el mismo solicitante o
     * es
     *
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     * @param tramite
     * @param persona
     * @param empresa
     * @return Boolean
     */
    Boolean verificaModificacionNombre(Tramite tramite, Persona persona, Empresa empresa);

    /**
     * Metodo que lista todas las personas - empresa por tramite
     *
     * @version 1.0, 21/11/2014
     * @author robertoSantivañez
     * @param tramite
     * @return Boolean
     */
    public List<PersonaEmpresaTramite> obtieneListaPersonaEmpresaPorTramite(Tramite tramite);

    /**
     * Metodo recorre una lista de tipo personaEmpresaTramite y bloquea a
     * persona/empresa.
     *
     * @version 1.0, 21/11/2014
     * @author robertoSantivañez
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    public void bloqueaPersonaEmpresaPorTramite(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Metodo recorre una lista de tipo personaEmpresaTramite y desbloquea a
     * persona/empresa.
     *
     * @version 1.0, 21/11/2014
     * @author robertoSantivañez
     * @param tramite
     * @param usuario
     * @throws java.lang.Exception
     */
    public void desbloqueaPersonaEmpresaPorTramite(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * método que verifica si el una empresa o una persona esta ligado a varios
     * tramites
     *
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     * @param persona
     * @param empresa
     * @param usuario
     * @return Boolean
     */
    Boolean verificaPersonaEmpresaLigadaAVariosTramites(Persona persona, Empresa empresa, Usuario usuario);

    /**
     *
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     * @param tramite
     * @param personaEmpresaTramite
     * @param usuario
     * @return Boolean
     * @throws java.lang.Exception
     */
    Boolean verificaApoderadoLigadoAVariosTramites(Tramite tramite, PersonaEmpresaTramite personaEmpresaTramite, Usuario usuario) throws Exception;

    /**
     * metodo que verifica si una persona ya esta ligada a un tramite
     *
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     * @param persona
     * @param tramite
     * @param empresa
     * @param usuario
     * @return Boolean verificasi la persona ya esta ligada a un tramite
     */
    Boolean verificaPersonaEmpresaExisteEnTramite(Tramite tramite, Persona persona, Empresa empresa, Usuario usuario);

    /**
     * metodo que lista personaempresatramite para listar
     *
     * @version 1.0, 23/12/2014
     * @author chanoRojas
     * @param tramite
     * @return Boolean verificasi la persona ya esta ligada a un tramite
     */
    List<PersonaEmpresaTramite> obtieneListaApoderadoPersonaPorTramite(Tramite tramite);

    /**
     * Método que lista personaempresatramite
     *
     * @param codigo este campo corresponde al codigoDia del trámite
     * @param tipoPersona corresponde al tipoPersona que puede ser JURIDICO o
     * NATURAL
     * @param tipoTramite
     * @param tipoCiudad
     * @param usuario
     * @return List<PersonaEmpresaTramite>
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 22/04/2015
     * Descripcion: El metodo es responsable de recuperar en un listado de PersonaEmpresaTramite
     * todos los registros con un tramite diferente.
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 17/06/2015
     * Descripcion: Modificar el método para que en la búsqueda se considere la regional
     * en la cual se lleno el trámite.
     * </pre>
     *
     */
    List<PersonaEmpresaTramite> obtieneListaBandejaVentanilla(String codigo, String tipoPersona, String tipoTramite, String tipoCiudad, Usuario usuario) throws Exception;

    /**
     * método que permite crear datos en tablas Persona, Empresa y
     * PersonaEmpresaTramite, para completar la solicitud de Modificacion de
     * Nombre y Direccion
     *
     * @param persona
     * @param empresa
     * @param tramite
     * @param usuario
     *
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo creaPersonaEmpresaTramiteParaModificacion
     * ----------------------------------------------------
     * Modificado
     * Descripcion:
     * </pre>
     */
    public void creaPersonaEmpresaTramiteParaModificacion(Persona persona, Empresa empresa, Tramite tramite, Usuario usuario);

    /**
     * método que permite determinar si una empresa esta incluida en un tramite.
     *
     * @param empresa
     * @param tramite
     * @param usuario
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Chano Rojas Fecha:
     * Descripcion: Se crea el metodo verificaEmpresaExisteEnTramite
     * ----------------------------------------------------
     * Modificado: Susana Escobar Paz Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo verificaEmpresaExisteEnTramite
     * </pre>
     */
    public Boolean verificaEmpresaExisteEnTramite(Tramite tramite, Empresa empresa, Usuario usuario);

    /**
     * método que permite buscar el registro en PersonaEmpresaTramite asociado a
     * una Empresa
     *
     * @param empresa
     * @return PersonaEmpresaTramite
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 16/06/2015
     * Descripcion: Se agrega el metodo obtienePersonaEmpresaTramiteSegunEmpresa
     * ----------------------------------------------------
     * Modificado
     * Descripcion:
     * </pre>
     */
    public PersonaEmpresaTramite obtienePersonaEmpresaTramiteSegunEmpresa(Empresa empresa);

    /**
     * método que permite guardar datos de modificacion de una direccion en la
     * tabla TemporalModificacion
     *
     * @param lista, usuarioAux, idTabla
     * @param usuarioAux
     * @param persona
     * @param empresa
     * @param tramite
     *
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 05/02/2015
     * Descripcion: Se agrega el metodo guardaTemporalModificacionDireccion
     * ----------------------------------------------------
     * Modificado: Susana Escobar Paz
     * Fecha: 10/08/2015
     * Descripcion: adecuaciones para afectar siempre datos vigentes, en caso de cambio de direccion
     * </pre>
     *
     * @throws java.lang.Exception
     */
    public void guardaTemporalModificacionDireccion(List<DatosContacto> lista, Usuario usuarioAux, Persona persona, Empresa empresa, Tramite tramite) throws Exception;

    /**
     * método que permite elimnar datos de: persona, empresa y
     * PersonaEmpresaTramite, para permitir la modificacion (reinicio) de la
     * solicitud de Modificacion
     *
     * @param tramite
     * @param usuario      <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 15/06/2015
     * Descripcion: Se agrega el metodo eliminaDatosParaModificacionSolModificacion
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @throws java.lang.Exception
     */
    void eliminaDatosParaModificacionSolModificacion(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * Método que permite consolidar el cambio de nombre, dando de baja los
     * anateriores y vigentes los actuales
     *
     * @param tramitePadre
     * @param tramiteModificacion
     * @param IdUsuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 30/07/2015
     * Descripcion: Actualizar a no vigente los TramiteFlujoEtapa actuales y crear Otros vigentes que contengan los nuevos datos de persona o empresab
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    void aceptarCambioNombre(Tramite tramitePadre, Tramite tramiteModificacion, Long IdUsuario) throws Exception;

    /**
     * Método que permite encontrar el listado de personas Solicitantes
     * asociados a un tramite
     *
     * @param IdPersona
     * @param tramite
     * @return
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 30/07/2015
     * Descripcion: permite encontrar el listado de personas Solicitantes asociados a un tramite
     *
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    PersonaEmpresaTramite encuentraPersonaEmpresaTramitePorPersonaYTramite(Long IdPersona, Tramite tramite) throws Exception;

    /**
     * Método que permite encontrar el listado de empresa Solicitantes asociados
     * a un tramite
     *
     * @param IdEmpresa
     * @param tramite
     * @return
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 30/07/2015
     * Descripcion: permite encontrar el listado de empresas Solicitantes asociados a un tramite
     *
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    PersonaEmpresaTramite encuentraPersonaEmpresaTramitePorEmpresaYTramite(Long IdEmpresa, Tramite tramite) throws Exception;

    /**
     * Método que permite encontrar el listado de empresa Solicitantes asociados
     * a un tramite
     *
     * @param listaNaturalJuridico
     * @param naturalJuridicoPojo
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: creacion por chanoRojas  08/10/2015
     * Descripcion: permite encontrar la posicion de un objeto tipo naturalJuridico en un listado de la misma clase
     *
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    int encuentraPosicionListadoPojoNaturalJuridico(List<NaturalJuridicoPojo> listaNaturalJuridico, NaturalJuridicoPojo naturalJuridicoPojo);

    /**
     * Método que permite encontrar el listado de PersonaEmpresaTramite vigentes
     * por tramite
     *
     * @param tramite
     * @return
     *
     */
    List<PersonaEmpresaTramite> obtieneListadoPersonaEmpresaTramiteSolicitantePorTramite(Tramite tramite);

    public List<PersonaEmpresaTramite> obtieneListaPersonaEmpresaPorTramiteNTITLICE(Tramite tramite);

    /**
     * Método que permite encontrar el listado de PersonaEmpresaTramite para
     * TipoPersonaSolicitud Solicitante SOLI por tramite
     *
     * @param tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz Fecha: 22/10/2015
     * Descripcion: permite encontrar el listado de PersonaEmpresaTramite para TipoPersonaSolicitud Solicitante SOLI
     *
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    public List<PersonaEmpresaTramite> obtieneListaPersonaEmpresaPorTramiteSOLI(Tramite tramite);

    /**
     * Método que permite encontrar el listado de PersonaEmpresaTramite para
     * TipoPersonaSolicitud Solicitante SOLI por tramite
     *
     * @param idTramite
     * @param idUsuario
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanorojasnoviembre2015
     * Descripcion: permite eliminar un registro de apoderado y poder
     *
     *
     * ----------------------------------------------------
     * </pre>
     * @throws java.lang.Exception
     *
     */
    void eliminaApoderadoDatosContactoPoder(Long idTramite, Long idUsuario) throws Exception;
}
