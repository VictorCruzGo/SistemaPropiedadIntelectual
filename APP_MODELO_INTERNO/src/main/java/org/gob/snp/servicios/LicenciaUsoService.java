package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.LicenciaUso;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.PersonaEmpresaTramite;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 *
 * @author gusn8
 *
 */
public interface LicenciaUsoService extends GenericDao<LicenciaUso> {

    /**
     * Metodo que permite adicionar una Licencia de Uso
     *
     * @param licenciaUso
     * @return LicenciaUso
     * @version 1.0, 30/07/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    LicenciaUso persistLicenciaUso(LicenciaUso licenciaUso) throws Exception;

    /**
     * Metodo que permite modifica la Licencia de Uso
     *
     * @param licenciaUso
     * @return LicenciaUso
     * @version 1.0, 30/07/2015
     * @author Gustavo Lizárraga
     * @throws java.lang.Exception
     */
    LicenciaUso mergeLicenciaUso(LicenciaUso licenciaUso) throws Exception;

    /**
     * Metodo que permite eliminar una Licencia de Uso
     *
     * @version 1.0, 30/07/2015
     * @author Gustavo Lizárraga
     * @param licenciaUso
     * @throws java.lang.Exception
     *
     */
    void removeLicenciaUso(LicenciaUso licenciaUso) throws Exception;

    /**
     * Metodo que permite listar todas las Licencias de Uso
     *
     * @return List
     * @version 1.0, 04/01/2015
     * @author Gustavo Lizárraga
     */
    List<LicenciaUso> listaLicenciaUso();

    public Boolean[] validarCamposLicenciaUso(Date fechaInicio, Date fechaFin, boolean indefinido);

    public PersonaEmpresaTramite guardarLicenciatarioYFechaLicencia(Persona persona, Empresa empresa, Tramite tramite, Usuario usuario, Date fechaInicio, Date fechaFin, Boolean indefinido) throws Exception;

    /**
     * metodo que verifica si una persona ya esta ligada a un tramite
     *
     * @version 1.0, 11/10/2014
     * @author chanoRojas
     * @param persona
     * @param tramite
     * @param usuario
     * @return Boolean verificasi la persona ya esta ligada a un tramite
     */
    Boolean verificaPersonaEmpresaExisteEnTramite(Tramite tramite, Persona persona, Usuario usuario);

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

}
