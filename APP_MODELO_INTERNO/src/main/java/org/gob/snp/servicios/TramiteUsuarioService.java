package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.TramiteUsuario;
//import org.gob.snp.entidades.Tramiteweb;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoTramite;

public interface TramiteUsuarioService extends GenericDao<TramiteUsuario> {

    /**
     * metodo que permite adicionar TramiteUsuario
     *
     * @param tramiteUsuario
     * @return TramiteUsuario
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    TramiteUsuario persistTramiteUsuario(TramiteUsuario tramiteUsuario) throws Exception;

    /**
     * metodo que permite modifica TramiteUsuario
     *
     * @param tramiteUsuario
     * @return TramiteUsuario
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    TramiteUsuario mergeTramiteUsuario(TramiteUsuario tramiteUsuario) throws Exception;

    /**
     * metodo que permite eliminar TramiteUsuario
     *
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     * @param tramiteUsuario
     * @throws java.lang.Exception
     *
     */
    void removeTramiteUsuario(TramiteUsuario tramiteUsuario) throws Exception;

    /**
     * metodo que permite listar todos TramiteUsuario
     *
     * @return List
     * @version 1.0, 30/06/2014
     * @author ChanoRojas
     */
    List<TramiteUsuario> listaTramiteUsuario();

    /**
     * metodo que permite listar todos TramiteUsuario
     *
     * @param usuario
     * @return List Tramite usuario por idUsuario
     * @version 1.0, 30/06/2014
     * @author Chano
     */
    List<TramiteUsuario> listaTramiteUsuarioPorUsuario(Usuario usuario);

//    /**
//     * metodo elimina el registro de las tablas TramiteWeb y su relacional con
//     * la tabla TramiteUsuario como parametro de entrada solo TramiteWeb
//     *
//     * @param tramiteUsuario
//     * @version 1.0, 03/07/2014
//     * @author Henrry Guzman
//     * @throws java.lang.Exception
//     */
//    void eliminaTramiteUsuarioConTramiteWeb(TramiteUsuario tramiteUsuario) throws Exception;

    List<TipoTramite> listaTipoTramiteBandejaUsuario();
    
    /**
     * Metodo que recupera un TramiteUsuario por Tramite
     * 
     *     
     * @version 1.0, 15/08/2014
     * @author Jonathan Valdivia
     * @param tramite
     * @return 
     */
    TramiteUsuario obtieneTramiteUsuarioPorTramite(Tramite tramite);
    

}
