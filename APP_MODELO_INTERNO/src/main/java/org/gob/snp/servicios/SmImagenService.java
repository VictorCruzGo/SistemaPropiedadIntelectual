package org.gob.snp.servicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.SMImagen;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

public interface SmImagenService extends GenericDao<SMImagen> {

    /**
     * Método para realizar el registro de los Logotipo asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 15/12/2014
     * @author chanoRojas
     * @param sMImagen
     * @return List
     * @throws java.lang.Exception
     */
    SMImagen persistSmImagen(SMImagen sMImagen) throws Exception;

    /**
     * Método para realizar el modificado de los Logotipo asociados a un
     * registro de smsignomarca
     *
     * @version 1.0, 15/12/2014
     * @author chanoRojas
     * @param sMImagen
     * @return List
     * @throws java.lang.Exception
     */
    SMImagen mergeSmImagen(SMImagen sMImagen) throws Exception;

    /**
     * Método para realizar el eliminado de los Logotipo asociados a un registro
     * de smsignomarca
     *
     * @version 1.0, 15/12/2014
     * @author chanoRojas
     * @param sMImagen
     * @throws java.lang.Exception
     */
    void removeSmImagen(SMImagen sMImagen) throws Exception;

    /**
     * Método para buscar las imagenes que estan en un tramite
     *
     * @version 1.0, 16/01/2015
     * @author chanoRojas
     * @param tramite
     * @param usuario
     * @return
     * @throws java.lang.Exception
     */
    List<SMImagen> listaImagenesPorTramite(Tramite tramite, Usuario usuario) throws Exception;

    /**
     * <pre>
     * Creado: chanoRojas
     * Fecha: 19/01/2015
     * Modulo: Modifcacion de listado de imagenes del registro PI100
     * Descripción: Permite modificar el listado ya existente en la vista
     * </pre>
     * @param listaImagenes
     * @param tramite
     * @param sMSignoMarca
     * @param usuario
     * @throws java.lang.Exception
     */
    void modificaLitadoDeImagenes(List<SMImagen> listaImagenes, Tramite tramite, SMSignoMarca sMSignoMarca, Usuario usuario) throws Exception;
   /**
     * <pre>
     * Creado: Levi Laura
     * Fecha: 01/04/2015
     * Modulo: Listado 
     * Descripción: Lista imagenes principales dado el tramite
     * </pre>
     * @param listaImagenes
     * @param tramite
     * @param sMSignoMarca
     
     * @throws java.lang.Exception
     */
    
    
    List<SMImagen> listaImagenPrincipalPorTramiteUsuario(Tramite tramite) throws Exception;
    
    
    
     void convierteImagenYGuardaCarpeta(SMImagen sMImagen);
     
     void crearArchivo(byte[] bytes, String arquivo);
     
      public List<SMImagen> listaImagenes() throws Exception;

    
    
    
}
