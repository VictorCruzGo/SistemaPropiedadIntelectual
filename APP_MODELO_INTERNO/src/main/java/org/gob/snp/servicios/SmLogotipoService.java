package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SMImagen;
import org.gob.snp.entidades.SMLogotipo;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface SmLogotipoService extends GenericDao<SMLogotipo> {

    /**
     * Método para realizar el registro de los Logotipo asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 01/12/2014
     * @author chanoRojas
     * @param sMLogotipo
     * @return List
     * @throws java.lang.Exception
     */
    SMLogotipo persistSmLogotipo(SMLogotipo sMLogotipo) throws Exception;

    /**
     * Método para realizar el modificado de los Logotipo asociados a un
     * registro de smsignomarca
     *
     * @version 1.0, 01/12/2014
     * @author chanoRojas
     * @param sMLogotipo
     * @return List
     * @throws java.lang.Exception
     */
    SMLogotipo mergeSmLogotipo(SMLogotipo sMLogotipo) throws Exception;

    /**
     * Método para realizar el eliminado de los Logotipo asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 01/12/2014
     * @author chanoRojas
     * @param sMLogotipo
     * @throws java.lang.Exception
     */
    void removeSmlogotipo(SMLogotipo sMLogotipo) throws Exception;

    /**
     * Método para realizar el listado de los Logotipo asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 01/12/2014
     * @author chanoRojas
     * @return
     */
    List<SMLogotipo> listaSmLogotipo();

    /**
     * Método para realizar el listado de los logotipos asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param smsignomarca
     * @return List
     */
    List<SMLogotipo> listaSmLogotipoXSmSignoMarca(SMSignoMarca smsignomarca);

    /**
     * Método para realizar el listado de los logotipos asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 29/07/2014
     * @author Eddy Valero
     * @param tramite
     * @return List
     */
    List<SMLogotipo> encuentraSmLogoTipoPorTramite(Tramite tramite);

    /**
     * Método para encontrar datos de un Tramite según el nombre de la Imagen
     * asignada
     *
     * @version 1.0, 29/07/2014
     * @author Jonathan Valdivia
     * @param imagen
     * @param listaTramites
     * @return List
     */
    Tramite encuentraTramitePorNombreImagen(String imagen, List<Tramite> listaTramites);

    /**
     * <pre>
     * Creado: Henrry Guzman
     * Fecha: 11/12/2014
     * Modulo: Registro Formulario PI100 Logo Tipo
     * Descripción: Permite encontrar la posicion a leliminar de la grilla de imagenes o logotipos
     * </pre>
     * @param listaSMLogotipo Lista de objetos de tipo SMLogotipo.
     * @param sMLogotipo
     * @return int Posicion encontrada.
     */
    int encuentraPosicionListadoLogoTipo(List<SMLogotipo> listaSMLogotipo, SMLogotipo sMLogotipo);
    
    
     /**
     * <pre>
     * Creado: Henrry Guzman
     * Fecha: 11/12/2014
     * Modulo: Registro Formulario PI100 Logo Tipo
     * Descripción: Permite encontrar la posicion a leliminar de la grilla de imagenes o logotipos
     * </pre>
     * @param listaSMLogotipoImagen
     * @param sMLogotipoImagen
     * @return int Posicion encontrada.
     */
    int encuentraPosicionListadoLogoTipoOriginal(List<SMImagen> listaSMLogotipoImagen, SMImagen sMLogotipoImagen);

    
     /**
     * <pre>
     * Creado: Henrry Guzman
     * Fecha: 16/12/2014
     * Modulo: Registro Formulario PI100 Logo Tipo
     * Descripción: Permite guardar en el listado la imagen principal
     * </pre>
     * @param listaSMLogotipo Lista de objetos de tipo SMLogotipo.
     * @param sMLogotipoSeleccionado Tipo de dato SMLogotipo
     * @return List SMLogotipo.
     */
    List<SMLogotipo> guardaImagenPrincipalEnLaListaDeImagenes(List<SMLogotipo> listaSMLogotipo, SMLogotipo sMLogotipoSeleccionado);
    
    /**
     * <pre>
     * Creado: Henrry Guzman
     * Fecha: 16/12/2014
     * Modulo: Registro Formulario PI100 Logo Tipo
     * Descripción: Permite guardar en el listado la imagen principal
     * </pre>
     * @param listaSMLogotipoImagen
     * @param logotipoImagenObjetoSelecciona
     * @return List SMLogotipo.
     */
    List<SMImagen> guardaImagenPrincipalEnLaListaDeImagenesOriginal(List<SMImagen> listaSMLogotipoImagen, SMImagen logotipoImagenObjetoSelecciona);      
  
    
   
}
