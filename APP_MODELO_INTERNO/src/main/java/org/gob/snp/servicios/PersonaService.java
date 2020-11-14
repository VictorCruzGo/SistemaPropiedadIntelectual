package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface PersonaService extends GenericDao<Persona> {

    /**
     * metodo que permite adicionar Personas
     *
     * @param persona
     * @return Personas
     * @version 1.0, 20/06/2014
     * @author Jonathan
     * @throws java.lang.Exception
     */
    Persona persistPersonas(Persona persona) throws Exception;

    /**
     * metodo que permite modifica Personas
     *
     * @param persona
     * @return Personas
     * @version 1.0, 20/06/2014
     * @author Jonathan
     * @throws java.lang.Exception
     */
    Persona mergePersonas(Persona persona) throws Exception;

    /**
     * metodo que permite eliminar Personas
     *
     * @version 1.0, 20/06/2014
     * @author Jonathan
     * @param persona
     * @throws java.lang.Exception
     *
     */
    void removePersonas(Persona persona) throws Exception;

    /**
     * metodo que permite listar todos Personas
     *
     * @return List
     * @version 2.0, 17/10/2012
     * @author Jonathan
     */
    List<Persona> listaPersonas();

    /**
     * metodo valida campos de Personas
     *
     * @param persona
     * @return List String
     * @version 1.0, 14/07/2014
     * @author Henrry Guzman
     */
    List<String> validaDatosPersonaNatural(Persona persona);

    Persona verificaExistenciaDocumentoPersona(String numeroDocumento) throws Exception;

    Empresa verificaExistenciaDocumentoEmpresa(String numeroDocumento) throws Exception;

    /**
     * Metodo que verifica si la persona esta implicada en algun tramite
     *
     * @param persona
     * @param tramite
     * @return List String
     * @version 1.0, 12/08/2014
     * @author Jonathan Valdivia
     */
    Boolean verificaSiPersonaTieneTramites(Persona persona, Tramite tramite);

    /**
     * Metodo que verifica si una persona es Usuario
     *
     * @param persona
     * @return List String
     * @version 1.0, 12/08/2014
     * @author Jonathan Valdivia
     */
    Boolean verificaSiPersonaTieneUsuario(Persona persona);

    List<Persona> listaPersonaBloqueadas();

    /**
     * Metodo que verifica si el titular del tramite es una Entidad persona
     *
     * @param tramite
     * @return Boolean
     * @version 1.0, 13/10/2014
     * @author Eddy Valero
     */
    Boolean titularEsPersona(Tramite tramite);

    /**
     * Recuperar los datos de la persona que esta asociado a un tramite como
     * solicitante
     *
     * @param tramite
     * @return Persona
     * @version 1.0, 13/10/2014
     * @author Eddy Valero
     */
    Persona encuentraPersonaTramite(Tramite tramite);

    /**
     * Recuperara el listado de personas ligadas a un tramite como
     * solicitante
     * @param tramite
     * @return List Persona
     * @version 1.0, 17/11/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    List<Persona> encuentraListadoPersonaTramite(Tramite tramite) ;

    /**
     * Recuperara el listado de personas ligadas a un tramite como
     * titular para modificaciones.
     * @param tramite
     * @return List Persona
     * @version 1.0, 17/11/2014
     * @author Levi Laura
     * @throws java.lang.Exception
     */
    List<Persona> encuentraListadoPersonaTramiteTitular(Tramite tramite);
    /**
     * Recuperara el listado de personas ligadas a un tramite como
     * Licenciatario para modificaciones.
     * @param tramite
     * @return List Persona
     * @version 1.0, 17/11/2014
     * @author Levi Laura
     * @throws java.lang.Exception
     */
    List<Persona> encuentraListadoPersonaTramiteLicenciatario(Tramite tramite);
    /**
     * guarda nueva persona para el procedimiento de modificacion de nombre el
     * metodo tiene los parametros de empresa y persona por si se decide cambiar
     * de tipo de solicitante relacionado a un tramite
     *
     * @param tramite
     * @version 1.0, 03/11/2014
     * @author chanoRojas
     * @param persona
     * @param empresa
     * @param usuario
     * @return Tramite
     * @throws java.lang.Exception
     */
    Tramite guardaPersonaEmpresaModificacionNombre(Tramite tramite, Persona persona, Empresa empresa, Usuario usuario) throws Exception;

    /**
     * modifica una persona o empresa que ya esta en la registrada en la base de
     * datos en el procedimeinto de modificacion de nombre, el metodo tiene los
     * parametros de empresa y persona por si se decide cambiar de tipo de
     * solicitante relacionado a un tramite
     *
     * @param tramite
     * @version 1.0, 03/11/2014
     * @author chanoRojas
     * @param persona
     * @param empresa
     * @param usuario
     * @return Tramite
     * @throws java.lang.Exception
     */
    Tramite modificaPersonaEmpresaModificacionNombre(Tramite tramite, Persona persona, Empresa empresa, Usuario usuario) throws Exception;
    
    /**
     * Buscar todas las personas que son apoderados de un determinado Tramite
     * 
     * @param tramite
     * @param usuario
     * @return List<Persona> Retornar el listado de todos los apoderados.
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 16/01/2015
     * Descripcion: recuperar el listado de todas las personas que son apoderados del Tramite
     * </pre>
     * 
     */
    List <Persona> recuperaPersonasApoderadosPorSolicitudTramite(Tramite tramite, Usuario usuario) throws Exception;
    
    
    
    /**
     * busca persona por id, que ya esta registrada en la base de datos  
     *
     * @param tramite
     * @version 1.0, 03/11/2014
     * @author Roberto Santivañez
     * @param persona
     * @param usuario
     * @return Tramite
     */
    public void modificarRegistroPersona(Persona persona, Usuario usuario);
    
     /**
     * método que permite verificar si el idModificar de persona ya esta asociado a un tramite de Modificacion de Nombre
     * @param tramite
     * @param persona
     
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 24/07/2015
     * Descripcion: Se agrega el metodo verificaIdEmpresaModificarExistteEnTramite, que permite verificar si el idModificar de persona ya esta asociado a un tramite de Modificacion de Nombre
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Boolean verificaIdPersonaModificarExistteEnTramite(Tramite tramite, Persona persona);

     /**
     * método que permite listar a todas las personas con un mismo numero de ci
     * @param numero     
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Chano Rojas Maldonado
     * Fecha: 25/08/2015
     * Descripcion: Lista todas las personas con el mismo nu mero de Ci 
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     * @return List
     */
    List<Persona> listaPersonasConMismoCi(String numero);
    
    
}
