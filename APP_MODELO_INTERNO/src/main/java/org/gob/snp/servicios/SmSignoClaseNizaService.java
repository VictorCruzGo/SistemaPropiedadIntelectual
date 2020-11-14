package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SMSignoClaseNiza;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.pojo.ArchivoNizaPojo;

public interface SmSignoClaseNizaService extends GenericDao<SMSignoClaseNiza> {

    /**
     * metodo que permite adicionar SMSignoClaseNiza
     *
     * @param sMSignoClaseNiza
     * @return SMSignoClaseNiza
     * @version 1.0, 28/07/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    public SMSignoClaseNiza persistSmSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) throws Exception;

    /**
     * metodo que permite modificar SMSignoClaseNiza
     *
     * @param sMSignoClaseNiza
     * @return SMSignoClaseNiza
     * @version 1.0, 28/07/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    public SMSignoClaseNiza mergeSmSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) throws Exception;

    /**
     * metodo que permite eliminar SMSignoClaseNiza
     *
     * @param sMSignoClaseNiza
     * @version 1.0, 28/07/2014
     * @author chanoRojas
     * @throws java.lang.Exception
     */
    public void removeSmSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) throws Exception;

    /**
     * metodo que permite listar SMSignoClaseNiza
     *
     * @return List SMSignoClaseNiza
     * @version 1.0, 28/07/2014
     * @author chanoRojas
     */
    public List<SMSignoClaseNiza> listaSmSignoClaseNiza();

    /**
     * metodo que permite listar SMSignoClaseNiza por SmSignoMarca
     *
     * @return List SMSignoClaseNiza
     * @version 1.0, 29/07/2014
     * @param smsignomarca
     * @author Eddy Valero
     */
    public List<SMSignoClaseNiza> listaSmSignoClaseNizaXSmSignoMarca(SMSignoMarca smsignomarca);

    /**
     * Metodo que devuelve la posicion que ocupa un determinado registro a
     * partir de un listado de SMSignoClaseNiza
     *
     * @version 1.0, 13/08/2014
     * @author Eddy Valero
     * @param listaSignoClaseNiza
     * @param signoClaseNizaSeleccionada
     * @return
     */
    int encuentraPosicionListadoSignoClaseNiza(List<SMSignoClaseNiza> listaSignoClaseNiza, SMSignoClaseNiza signoClaseNizaSeleccionada);

    /**
     * Método que genera un listado de todos los Signos Clase Niza por Tramite
     *
     * @version 1.0, 19/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return List
     */
    List<SMSignoClaseNiza> listaSmSignoClaseNizaPorTramite(Tramite tramite);
     /**
     * Método que genera un listado de todos los Signos Clase Niza qeu contienen exclusivamente  u archivo .txt
     *
     * @version 1.0, 13/05/2015
     * @author Levi Laura
     * @param tramite
     * @return List
     */
    List<SMSignoClaseNiza> listaSmSignoClaseNizaConTxtPorTramite(Tramite tramite);
    /**
     * Método transaccional responsable de la eliminación de un tramite
     * solicitado.
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas Fecha: 21/01/2015
     * Descripcion: Modificar el listado de la clase niza ligado a un tramite
     * </pre>
     *
     * @param tramite
     * @param listaNuevaClaseNiza
     * @param usuario
     * @throws java.lang.Exception
     */

    /**
     * Método transaccional responsable de la eliminación de un tramite solicitado.<pre>
     * ----------------------------------------------------
     * Creado: chanoRojas Fecha: 21/01/2015
     * Descripcion: Modificar el listado de la clase niza ligado a un tramite
     * </pre>
     *
     * @param tramite
     * @param listarchivoNizaPojo
     * @param sMSignoMarca
     * @param usuario
     * @throws java.lang.Exception
     */
    void guardaClaseActualDarBajaAntigua(Tramite tramite, List<ArchivoNizaPojo> listarchivoNizaPojo, SMSignoMarca sMSignoMarca, Usuario usuario) throws Exception;

    /**
     * Método transaccional que devuelve la posicion de un elemento en un listado.<pre>
     * ----------------------------------------------------
     * Creado: chanoRojas042015 Fecha: 09/004/2015
     * Descripcion: Encuentra la posicion de un elemnto en un listado
     * </pre>
     *
     * @param listaArchivoNizaPojo
     * @param archivoNizaPojo
     * @return
     */
    int encuentraPosicionListadoPojo(List<ArchivoNizaPojo> listaArchivoNizaPojo, ArchivoNizaPojo archivoNizaPojo);
    /**
     * Método transaccional que verifica si existe un numero niza en la lista.<pre>
     * ----------------------------------------------------
     * Creado: chanoRojas042015 Fecha: 09/04/2015
     * Descripcion: Encuentra EXISTENCIA DE UN NUMERO NIZA REPETIDO
     * </pre>
     *
     * @param listaArchivoNizaPojo
     * @param numeroNiza
     * @return
     */
    int encuentraPosicionExiste(List<ArchivoNizaPojo> listaArchivoNizaPojo,String numeroNiza);

}
