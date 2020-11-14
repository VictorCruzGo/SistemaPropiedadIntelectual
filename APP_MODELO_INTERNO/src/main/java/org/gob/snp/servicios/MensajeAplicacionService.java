package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.MensajeAplicacion;
import org.gob.snp.entidades.Modulo;
import org.gob.snp.entidades.Usuario;

public interface MensajeAplicacionService extends GenericDao<MensajeAplicacion> {

    /**
     * metodo que permite adicionar MensajeAplicacion
     *
     * @param mensajeAplicacion
     * @return MensajeAplicacion
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    MensajeAplicacion persistMensajeAplicacionWeb(MensajeAplicacion mensajeAplicacion) throws Exception;

    /**
     * metodo que permite modifica MensajeAplicacion
     *
     * @param mensajeAplicacion
     * @return MensajeAplicacion
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    MensajeAplicacion mergeMensajeAplicacionWeb(MensajeAplicacion mensajeAplicacion);

    /**
     * metodo que permite eliminar un registro de MensajeAplicacion
     *
     * @param mensajeAplicacion
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    void removeMensajeAplicacionWeb(MensajeAplicacion mensajeAplicacion);

    /**
     * metodo que permite listar todos los registros de MensajeAplicacion
     *
     * @version 1.0, 18/11/2014
     * @return MensajeAplicacion
     * @author Eddy Valero
     */
    List<MensajeAplicacion> listaMensajeAplicacionWeb();
    
    /**
     * Devolver el mensaje asociado al Modulo y al Codigo Requeridos
     *
     * @param modulo
     * @param codigo
     * @version 1.0, 20/11/2014
     * @return String
     * @author Eddy Valero
     */
    String obtenerMensaje(String modulo, String codigo);
    
    /**
     * Método que devuelve el siguiente valor entero que corresponde a 
     *     
     * @version 1.0, 25/11/2014
     * @return String
     * @author Jonathan Valdivia
     */
    int obtieneSiguientePosicionParaOrden(Modulo modulo);
        
    /**
     * Método que devuelve un listado de todos los mensajes ordenados ascendentemente por el campo orden de acuerdo al modulo al que pertenecen
     *     
     * @version 1.0, 25/11/2014
     * @return List<MensajeAplicacion>
     * @author Jonathan Valdivia
     */
    List<MensajeAplicacion> listaMensajesPorModuloOrdenados(Modulo modulo);
    
    /**
     * Devuelve una cadena que será el script para la inserción en la base de datos para el mensaje enviado
     *     
     * @version 1.0, 25/11/2014
     * @return String script
     * @author Jonathan Valdivia
     */
    String scriptInsertDeMensaje(Usuario usuario, MensajeAplicacion mensajeAplicacion, String idioma)throws Exception;
   
}
