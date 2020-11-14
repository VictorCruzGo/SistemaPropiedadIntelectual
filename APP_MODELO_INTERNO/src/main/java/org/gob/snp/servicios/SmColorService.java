package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SMColor;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface SmColorService extends GenericDao<SMColor> {

    /**
     * método que permite adicionar un registro a la tabla SMColor
     *
     * @param sMColor
     * @return Correlativo
     * @version 1.0, 1/12/2014
     * @author chanoRojas12
     * @throws Exception
     */
    SMColor persistSmColor(SMColor sMColor) throws Exception;

    /**
     * método que permite modificar un registro a la tabla SMColor
     *
     * @param sMColor
     * @return SMColor
     * @version 1.0, 1/12/2014
     * @author chanoRojas12
     * @throws Exception
     */
    SMColor mergeSmColor(SMColor sMColor) throws Exception;

    /**
     * método que permite eliminar un registro a la tabla SMColor
     *
     * @param sMColor
     * @version 1.0, 1/12/2014
     * @author chanoRojas12
     * @throws Exception
     */
    void removeSmColor(SMColor sMColor) throws Exception;

    /**
     * Método para realizar el listado de los logotipos asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @return List
     */
    List<SMColor> listaSmColor();

    /**
     * Método para encontrar el listado de colores por tramite
     *
     * @version 1.0, 15/01/2015
     * @author chanoRojas
     * @param tramite
     * @param usuario
     * @return List
     */
    public List<String> listaColorPorTramite(Tramite tramite, Usuario usuario);

    /**
     * <pre>
     * Creado: chanoRojas
     * Fecha: 19/01/2015
     * Modulo: Modifcacion
     * Descripción: Listado de colores segun Tramite
     * </pre>
     *
     * @param tramite
     * @param usuario
     * @return *
     */
    List<SMColor> listaSMColorPorTramite(Tramite tramite, Usuario usuario);

    /**
     * <pre>
     * Creado: chanoRojas
     * Fecha: 19/01/2015
     * Modulo: Modifcacion
     * Descripción: Modificado del listado de colores
     * </pre>
     *
     * @param listaSmColor
     * @param tramite
     * @param sMSignoMarca
     * @param usuario
     * @throws java.lang.Exception
     */
    void modificaListaDeColores(List<SMColor> listaSmColor, Tramite tramite, SMSignoMarca sMSignoMarca, Usuario usuario) throws Exception;

    /**
     * <pre>
     * Creado: chanoRojas
     * Fecha: 19/01/2015
     * Modulo: Modifcacion
     * Descripción: Modificado del listado de colores
     * </pre>
     *
     * @param listaSMColor
     * @param sMcolor
     * @return
     */
    int encuentraPosicionListadoSmColor(List<SMColor> listaSMColor, SMColor sMcolor);
}
