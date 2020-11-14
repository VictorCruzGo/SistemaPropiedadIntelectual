package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoSolicitante;

public interface DatosContactoService extends GenericDao<DatosContacto> {

    /**
     * método que permite listar todos los DatosContacto
     *
     * @return List
     * @version 1.0, 10/07/2014
     * @author Jonathan
     */
    List<DatosContacto> listaDatoscontacto();

    /**
     * método que permite adicionar DatosContacto
     *
     * @param datosContacto
     * @return
     * @version 1.0, 10/07/2014
     * @author Jonathan
     * @throws java.lang.Exception
     */
    DatosContacto persistDatoscontacto(DatosContacto datosContacto) throws Exception;

    /**
     * metodo que permite modifica DatosContacto
     *
     * @param datosContacto
     * @return DatosContacto
     * @version 1.0, 10/07/2014
     * @author Jonathan
     * @throws java.lang.Exception
     */
    DatosContacto mergeDatoscontacto(DatosContacto datosContacto) throws Exception;

    /**
     * metodo que permite eliminar DatosContacto
     *
     * @version 1.0, 10/07/2014
     * @author Jonathan
     * @param datosContacto
     * @throws java.lang.Exception
     */
    void removeDatoscontacto(DatosContacto datosContacto) throws Exception;

    /**
     * metodo que permite listar datos de contacto por persona o empresa
     *
     * @param persona, empresa
     * @version 1.0, 10/07/2014
     * @author chano
     * @param empresa
     * @return
     */
    List<DatosContacto> listaDatosContactoEmpresaPersona(Persona persona, Empresa empresa);

    /**
     * metodo que permite eliminar los datos de contacto que no son necesarios
     *
     * @version 1.0, 29/07/2014
     * @author Jonathan Valdivia Modificado chanoRojas 13/01/2015
     * @param listaDatosContacto
     * @param tramite
     * @param persona
     * @param empresa
     * @throws java.lang.Exception
     *
     */
    public void eliminaDatosContactoInnecesarios(List<DatosContacto> listaDatosContacto, Tramite tramite, Persona persona, Empresa empresa, Usuario usuario) throws Exception;

    /**
     * metodo que permite obtener la posicion del dato de contacto selecionado
     * de una lista de datos de contacto
     *
     * @version 1.0, 29/07/2014
     * @author Henrry Guzman
     * @param listaDatoscontacto
     * @param datoscontactoSeleccionada
     * @return
     */
    int encuentraPosicionListadoDireccion(List<DatosContacto> listaDatoscontacto, DatosContacto datoscontactoSeleccionada);

    /**
     * Metodo que permite listar los datos contacto por Persona
     *
     * @version 1.0, 13/08/2014
     * @author Jonathan Valdivia
     * @param persona
     * @return
     */
    List<DatosContacto> listaDatosDeContactoPorPersona(Persona persona);

    /**
     * Metodo que permite listar los datos contacto por Persona
     *
     * @version 1.0, 15/08/2014
     * @author Jonathan Valdivia
     * @param empresa
     * @return
     */
    List<DatosContacto> listaDatosDeContactoPorEmpresa(Empresa empresa);

    /**
     * Metodo que permite modificar la direccion de una persona titular en el
     * procedimiento de modificación de dirección
     *
     * @version 1.0, 01/11/2014
     * @author chanoRojas
     * @param tramite
     * @param listaDatosDeContactoSoliciatanteNuevo
     * @throws java.lang.Exception
     */
    void guardaDireccionSolicitanteModificacion(Tramite tramite, List<DatosContacto> listaDatosDeContactoSoliciatanteNuevo) throws Exception;

    /**
     * método que permite listar datos de contacto a modificar, en estado no
     * vigente
     *
     * @param empresa
     * @param usuario
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 14/05/2015
     * Descripcion: Se agrega el metodo listaDatosDeContactoAModificarPorEmpresa que permite listar datos de contacto a modificar, en estado no vigente
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    List<DatosContacto> listaDatosDeContactoAModificarPorEmpresa(Empresa empresa, Usuario usuario);

    /**
     * método que permite listar datos de contacto a modificar, en estado no
     * vigente
     *
     * @param persona
     * @param usuario
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 14/05/2015
     * Descripcion: Se agrega el metodo listaDatosDeContactoAModificarPorEmpresa que permite listar datos de contacto a modificar, en estado no vigente
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    List<DatosContacto> listaDatosDeContactoAModificarPorPersona(Persona persona, Usuario usuario);

    /**
     * @param listaLogica      <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 14/05/2015
     * Descripcion: Se agrega el metodo filtroListaDatosContactoModificar, que permite filtrar datos duplicados en una lista de datos contactos
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    List<DatosContacto> filtroListaDatosContactoModificar(List<DatosContacto> listaLogica);

    /**
     * @param IdMod      <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 27/07/2015
     * Descripcion: Se agrega el metodo verificaIdDatoContactoExiste, que permite verificar si un dato contacto existe o no.
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     *
     * @return
     */
    Boolean verificaIdDatoContactoExiste(Long IdMod);

    public void aceptarCambioDireccion(Tramite tramitePadre, Tramite tramiteModificacion, Long IdUsuario);
    
    public void guardaListaDatosContacto(List<DatosContacto> listaDatosContacto, Long idUsuario);

    /**
     * <pre>
     * Creado: Chano Rojas
     * Fecha: 21/09/2015
     * Descripcion: metodo que realiza el listado de datos contato al hacer el registro de un solicitante juridico y natural
     * Modificado:
     * Descripcion:
     * </pre>
     * @param domicilio
     * @param telefonoUno
     * @param telefonoDos
     * @param telefonoTres
     * @param celUno
     * @param celTres
     * @param idUsuario
     * @param celDos
     * @param correoSolicitante
     * @return
     * @throws java.lang.Exception
     */
    List<DatosContacto> generaListaDedatoscontacto(String domicilio, String telefonoUno, String telefonoDos, String telefonoTres, String celUno, String celDos, String celTres, String correoSolicitante, Long idUsuario) throws Exception;

}
