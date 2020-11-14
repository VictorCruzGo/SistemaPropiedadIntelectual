package org.gob.snp.servicios;

import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Poder;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface PoderService extends GenericDao<Poder> {

    /**
     * método que permite guardar Poder
     *
     * @param poder     
     * @return Apoderadp
     * @version 2.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Poder persistPoder(Poder poder) throws Exception;

    /**
     * método que permite guardar Poder
     *
     * @param poder     
     * @return Apoderadp
     * @version 2.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    Poder mergePoder(Poder poder) throws Exception;

    /**
     * método que permite guardar Poder
     *
     * @param poder     
     * @version 2.0, 10/07/2014
     * @author chano
     * @throws java.lang.Exception
     */
    void removePoder(Poder poder) throws Exception;

    /**
     * método que permite listar todos los Roles
     *
     * @return List
     * @version 2.0, 10/07/2014
     * @author chano
     */
    List<Poder> listaPoder();

    /**
     * Metodo que verifica si el Tramite ingresado tiene un Poder asignado
     *
     * @param tramite
     * @return List
     * @version 1.0 19/08/2014
     * @author Jonathan Valdivia
     */
    Boolean tienePoder(Tramite tramite);

    /**
     * Método para recuperar el apoderado de acuerdo a un determinado Tramite
     *
     * @version 1.0, 13/10/2014
     * @author Eddy Valero
     * @param tramite
     * @return
     */
    Poder recuperaPoderPorTramite(Tramite tramite);

    /**
     * Metodo que valida el registro de guardado de Poder
     *
     * @param apoderado
     * @param personaPoder
     * @param numeroDocumentoPoder
     * @param tipoDocumentoIdentidadPoder
     * @param lugarExpedicionRepresentante
     * @param usuario
     * @return Boolean[]
     * @throws java.lang.Exception
     * <pre>
     * ----------------------------------------------------
     * Creado: Chano Rojas Fecha: 25/11/2014
     * Descripcion: crear el metodo validaFormularioPoder
     * ---------------------------------------------
     * Modificado: Eddy Valero Fecha: 15/06/2015
     * Descripción: Ya no se validara que para el tipo de documento NIT, sea necesario 
     * registrar un lugar de expedición, comentando ese bloque de validacion.
     * </pre>
     */
    Boolean[] validaFormularioApoderado(Poder apoderado, Persona personaPoder, String numeroDocumentoPoder, String tipoDocumentoIdentidadPoder, String lugarExpedicionRepresentante, Usuario usuario) throws Exception;

    /**
     * Método para recuperar el listado de datos del Poder de un Poder, de
     * acuerdo a un registro de personaEmpresaTramite
     *
     * @param personaEmpresaTramite
     * @param usuario
     * @return List<Poder>
     * @throws java.lang.Exception
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 16/01/2015
     * Descripcion: Obtener todos los registros de Poder asociado a
     * un determinado PersonaEmpresaTramite
     * ---------------------------------------------
     * </pre>
     */
    List<Poder> recuperaPoderPorTramite(PersonaEmpresaTramite personaEmpresaTramite, Usuario usuario) throws Exception;
    
    Boolean[] validaFormularioPoderGeneral(Poder apoderado, Persona personaPoder, String numeroDocumentoPoder, String tipoDocumentoIdentidadPoder, String lugarExpedicionRepresentante, String Domicilio, String Correo, Usuario usuario) throws Exception;

}
