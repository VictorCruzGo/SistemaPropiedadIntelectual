package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DIGArchivoDocumento;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Usuario;

/**
 * @author Eddy Valero
 * @version 1.0 26/11/2014 Servicio de la Entidad DIGArchivoDocumento
 *
 */
public interface DIGArchivoDocumentoService extends GenericDao<DIGArchivoDocumento> {

    /**
     * metodo que permite adicionar DIGArchivoDocumento
     *
     * @param dIGArchivoDocumento
     * @return DIGArchivoDocumento
     * @version 1.0, 15/12/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    DIGArchivoDocumento persistDIGArchivoDocumento(DIGArchivoDocumento dIGArchivoDocumento) throws Exception;

    /**
     * metodo que permite modifica DIGArchivoDocumento
     *
     * @param dIGArchivoDocumento
     * @return DIGArchivoDocumento
     * @version 1.0, 15/12/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    DIGArchivoDocumento mergeDIGArchivoDocumento(DIGArchivoDocumento dIGArchivoDocumento) throws Exception;

    /**
     * metodo que permite eliminar un registro de DIGArchivoDocumento
     *
     * @param dIGArchivoDocumento
     * @version 1.0, 15/12/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    void removeDIGArchivoDocumento(DIGArchivoDocumento dIGArchivoDocumento) throws Exception;

    /**
     * metodo que permite listar todos los registros de DIGArchivoDocumento
     *
     * @version 1.0, 15/12/2014
     * @return DIGArchivoDocumento
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    List<DIGArchivoDocumento> listaDIGArchivoDocumentoWeb() throws Exception;

    /**
     * Método que guarda la lista de los Documentos y los DIGArchivoDocumentos
     * que se Digitalizaron
     *
     * @param listaDIGArchivoDocumento
     * @return String: retornar la regla de navegacion que permite volver al
     * formulario anterior
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:  Fecha: 
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 14/04/2015
     * Se modifica el metodo para que retorne a la misma pagina una vez
     * realizado el almacenamiento
     * </pre>
     *
     */
    
    String guardaListaDocumentosDigitalizados(List<DIGArchivoDocumento> listaDIGArchivoDocumento);

    /**
     * Método que guarda la lista de los Documentos y los DIGArchivoDocumentos
     * que se Digitalizaron
     *
     * @param listaDIGArchivoDocumento
     * @param usuario
     * @return String: retornar a la misma pagina
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo guardaListaDocumentosDigitalizadosPorUsuario
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 14/04/2015
     * Descripcion: Se quita el parametro de reglaNavegacion el almacenamiento se realiza
     * de manera directa en las Documento y DIGArchivoDocumento, antes volvia a la pagina 
     * de la cual se estaba llamando pero ahora devolvera a la misma pagina.
     * </pre>
     *
     */
    String guardaListaDocumentosDigitalizadosPorUsuario(List<DIGArchivoDocumento> listaDIGArchivoDocumento, Usuario usuario) throws Exception;

    /**
     * Método que nos retorna la extensión del nombre de un archivo
     *
     * @param nombreArchivo nombre del archivo del cual se quiere extraer la
     * extension
     * @return String retorna la extension del archivo
     *
     */
    String extensionDeArchivo(String nombreArchivo);

    /**
     * Método que actualiza la lista de los Archivos Documentos que se
     * almacenaran
     *
     * @param listaAntigua
     * @param documento
     * @return List<DIGArchivoDocumento> lista de Archivos Documentos final
     *
     */
    List<DIGArchivoDocumento> actualizaListaDIGArchivoDocumento(List<DIGArchivoDocumento> listaAntigua, Documento documento);

    /**
     * Método que obtiene el DIGArchivo por Documento
     *
     * @param documento
     * @return DIGArchivoDocumento de acuerdo al Documento introducido
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 09/02/2015
     * Descripcion: Se agrega el metodo obtenerDIGArchivoDocumentoPorDocumento,
     * para obtener el objeto DIGArchivoDocumentoPorDocumento
     * </pre>
     */
    DIGArchivoDocumento obtenerDIGArchivoDocumentoPorDocumento(Documento documento);
}
