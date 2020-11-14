package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.DatoElementoFormulario;
import org.gob.snp.entidades.FormularioTramite;
import org.gob.snp.entidades.RegistroExistenteEF;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.FormularioExamenDeFondoPojo;

public interface DatoElementoFormularioService extends GenericDao<DatoElementoFormulario> {

    /**
     * metodo que permite adicionar las Dosificaciones
     *
     * @param titulo
     * @return titulo
     * @version 1.0, 07/10/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
   public DatoElementoFormulario persistDatoElementoFormulario(DatoElementoFormulario datoElementoFormulario) throws Exception;

    /**
     * metodo que permite modifica las Dosificaciones
     *
     * @param titulo
     * @return titulo
     * @version 1.0, 07/10/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public DatoElementoFormulario mergeDatoElementoFormulario(DatoElementoFormulario datoElementoFormulario) throws Exception;

    /**
     * metodo que permite eliminar las Dosificaciones
     *
     * @version 1.0, 07/10/2014
     * @author RobertoSantivañez
     * @param titulo
     * @throws java.lang.Exception
     *
     */
    public void removeDatoElementoFormulario(DatoElementoFormulario datoElementoFormulario) throws Exception;

    /**
     * metodo que permite listar todos las Dosificaciones
     *
     * @return List
     * @version 1.0, 07/10/2014
     * @author RobertoSantivañez
     */
    public List<DatoElementoFormulario> listaDatoElementoFormulario();

     /**
     * Método que permite listar todos los registros hijos ElementoFormularioTramite dado un ElementoFormularioTramite padre
     *     
     * @param elementoFormularioTramiteRespuesta
     * @return List
     * @version 1.0, 02/10/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    List<DatoElementoFormulario> listaHijosDatoElementoFormulario(DatoElementoFormulario elementoFormularioTramiteRespuesta) throws Exception;
    
    /**
     * Método que permite listar todos los registros Padres ElementoFormularioTramite dado un FormularioTramite
     *          
     * @param analisisEtapa
     * @param pestania     
     * @param seccion     
     * @return List
     * @version 1.0, 02/10/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    List<DatoElementoFormulario> listaPadresDatoElementoFormulario(AnalisisEtapa analisisEtapa, String pestania, int seccion, RegistroExistenteEF registroExistenteEF) throws Exception;
     /**
     * Método que permite listar todos los registros Padres ElementoFormularioTramite dado un FormularioTramite ordenaddo por idDatoElementoFormulario
     *          
     * @param analisisEtapa
     * @param pestania     
     * @param seccion     
     * @return List
     * @version 1.0, 02/10/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    List<DatoElementoFormulario> listaDatoElementoFormulario(AnalisisEtapa analisisEtapa, String pestania, int seccion, RegistroExistenteEF registroExistenteEF) throws Exception;
    /**
     * Método que recupera los datos de la pestania de Registrabilidad
     *          
     * @param analisisEtapa
     * @param pestania
     * @param seccion
     * @param registroExistenteEF
     * @return List
     * @version 1.0, 09/10/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    List<FormularioExamenDeFondoPojo> listaFormularioRegistrabilidad(AnalisisEtapa analisisEtapa, String pestania, int seccion, RegistroExistenteEF registroExistenteEF) throws Exception;
       
    /**
     * Método que recupera los datos de la pestania de Registrabilidad
     *          
     * @param analisisEtapa
     * @param pestania
     * @param seccion
     * @param registroExistenteEF
     * @return List
     * @version 1.0, 09/10/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    List<DatoElementoFormulario> listaDatoElementoFormularioPorOrdenYPestania(AnalisisEtapa analisisEtapa, String pestania, int seccion, RegistroExistenteEF registroExistenteEF) throws Exception;
    
    /**
     * Método que permite guardar los registros generados para el formulario de 
     * Registrabilidad de 
     * DatoElementoFormulario
     *
     * @param listaFormularioExamenDeFondoPojos     
     * @param usuario
     * @throws java.lang.Exception
     * @version 1.0, 17/10/2014
     * @author eddy valero
     * 
     * <pre>
     * Creado: Jonathan Valdivia Fecha: 14/10/2014
     * Descripcion: creación del método guardaListaFormularioExamenDeFondoPojo
     * -------------------------------------------------------------------------
     * Modificado:Eddy Valero Fecha: 21/05/2015
     * Descripcion: se agrega el atributo usuario, el control de la excepcion y
     * consumir la fecha desde el servicio utilitarios.
     * </pre>
     */
    void guardaListaFormularioExamenDeFondoPojo(List<FormularioExamenDeFondoPojo> listaFormularioExamenDeFondoPojos, Usuario usuario) throws Exception;
    
       /**
     * Método que permite listar todos los registros rescatados
     *          
     * @version 1.0, 14/10/2014
     * @author Jonathan Valdivia
     * @param lista
     * @param columnas
     * @throws java.lang.Exception
     */
    void guardaAnalisisDeDenominaciones(List<FormularioExamenDeFondoPojo> lista, int columnas)throws Exception;
    
     /**
     * método que permite verificar si ya existe la seccion tres de la Pestania
     * AnalisisDenominaciones
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @return Boolean
     * @version 1.0, 23/10/2014
     * @author Eddy Valero
     */
    Boolean verificarExisteSeccionTresAnalisisDenominaciones(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa);
    
     /**
     * Método que permite verificar si ya existe la seccion dos de la Pestania
     * Conexion Competitiva
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @return Boolean
     * @version 1.0, 13/11/2014
     * @author Eddy Valero
     */
    Boolean verificarExisteSeccionDosConexionesCompetitivas(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa);
    
     /**
     * Método que permite verificar si existen datos generados de cualquier pestania que se requiera
     * de acuerdo al RegistroExistenteEF
     *
     * @param registroExistenteEF
     * @param pestania
     * @return Boolean
     * @version 1.0, 17/11/2014
     * @author Eddy Valero
     */
    Boolean verificarExisteDatosPestaniaPorPestania(RegistroExistenteEF registroExistenteEF, String pestania);
    
    
}
