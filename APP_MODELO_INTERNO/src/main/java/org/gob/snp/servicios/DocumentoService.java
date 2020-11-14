package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DIGArchivoDocumento;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface DocumentoService extends GenericDao<Documento> {

    /**
     * método que permite guardar Documento
     *
     * @param documento
     * @return Documento
     * @version 2.0, 01/12/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    Documento persistDocumento(Documento documento) throws Exception;

    /**
     * método que permite guardar Documento
     *
     * @param documento
     * @return Documento
     * @version 2.0, 01/12/2014
     * @author Jonathan Valdivia
     * @throws java.lang.Exception
     */
    Documento mergeDocumento(Documento documento) throws Exception;

    /**
     * método que permite guardar Documento
     *
     * @version 2.0, 01/12/2014
     * @author Jonathan Valdivia
     * @param documento
     * @throws java.lang.Exception
     */
    void removeDocumento(Documento documento) throws Exception;

    /**
     * Método que permite listar todos los documentos existentes en un tramite
     *
     * @version 2.0, 11/12/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return
     *
     */
    List<Documento> documentosPorTramite(Tramite tramite);

    /**
     * Método que elimina documentos de la lista de documentos digitalizados
     *
     * @param listaDocumentos
     * @param documento es el registro que quiere eliminarse de la lista
     * @return List<Documento> lista logica con el documento ya eliminado
     *
     */
    List<Documento> eliminaDocumentoDeListaLogica(List<Documento> listaDocumentos, Documento documento);

    /**
     * Método que lista todos los documentos por entregar de un Tramite
     *
     * @version 1.0, 29/01/2015
     * @author Gustavo Lizarraga
     * @param tramite
     * @return List<Documento> lista de documentos por entregar
     */
    List<Documento> listadoDocumentosAEntregarPorTramite(Tramite tramite);

    /**
     * método que permite recuperar el numero de impresiones de un Documeento de
     * TipoDocumentacion REG.
     *
     * @param tramite
     * @return Integer, valores enteros
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 10/02/2015
     * Descripcion: Se agrega el metodo documentoRegistroPorTramite, que recupera el numero de impresiones de  un documento
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Integer documentoRegistroPorTramite(Tramite tramite);

    /**
     * método que permite actualizar el numero d eimpresiones de un documento
     * asociado a un tramite.
     *
     * @param tramite
     * @param usuario
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo  adicionarImpresion, que actualiza el numero de impresiones de un documento
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    void adicionarImpresion(Tramite tramite, Usuario usuario);

    /**
     * método que permite recuperar Documeento por tramite.
     *
     * @param tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo encuentraDocumentoPorTramite, que recupera documento de TipoDocumentacion REGISTRO, por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Documento encuentraDocumentoPorTramite(Tramite tramite);

    /**
     * método que permite recuperar Documeento por tramite.
     *
     * @param tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Susana Escobar Paz
     * Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo encuentraDocumentoPorTramite, que recupera documento de TipoDocumentacion REGISTRO, por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Documento encuentraDocumentoDescripcionPorTramite(Tramite tramite);

    /**
     * método que permite recuperar modificar el archivo txt de descripcion de
     * logotipo por tramite.
     *
     * @param tramite
     * @param documento
     * @param dIGArchivoDocumento
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: chanoRojas04
     * Fecha: 14/04/2015
     * Descripcion: modificacion del archivo txt niza por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    void modificaDocumentoDescripcion(Tramite tramite, Documento documento, DIGArchivoDocumento dIGArchivoDocumento);

    /**
     * método que permite recuperar Documeento por tramite.
     *
     * @param tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado Por: Levi Laura
     * Fecha: 12/02/2015
     * Descripcion: Se agrega el metodo encuentraDocumentoPorTramite, que recupera documento de TipoDocumentacion REGISTRO, por tramite
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Documento encuentraDocumentoPorTramiteParaReporte(Tramite tramite);

    /**
     * Método que permite encontrar el listado de documentos de
     * TipoDocumentacion REGISTRO por tramite
     *
     * @param tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 12/08/2015
     * Descripcion: Método que permite encontrar el listado de documentos de TipoDocumentacion REGISTRO por tramite
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    public List<Documento> listadoDocumentosRegistroPorTramite(Tramite tramite);

    /**
     * Método que permite encontrar el listado de documentos de
     * TipoDocumentacion TITULO por tramite
     *
     * @param tramite
     * @return
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 12/08/2015
     * Descripcion: Método que permite encontrar el listado de documentos de TipoDocumentacion TITULO por tramite
     *
     * ----------------------------------------------------
     * </pre>
     *
     */
    public List<Documento> listadoDocumentosTituloPorTramite(Tramite tramite);

    /**
     * Método encargado de actualizar el estado de una lista de documentos a no
     * vigente
     *
     * @param lista
     * @param usuario
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 12/08/2015
     * Descripcion: Método encargado de actualizar el estado de una lista de documentos a no vigente
     * ----------------------------------------------------
     * </pre>
     *
     *
     *
     */
    void actualizarListaRegistroTitulo(List<Documento> lista, Usuario usuario) throws Exception;
}
