/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.FlujoPagina;
import org.gob.snp.entidades.Pagina;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;

/**
 * Interface responsable de realizar operaciones de persistencia a la Clase
 * FlujoPagina
 *
 * @author Eddy Valero
 * @see FlujoPaginaServiceImpl
 * @see FlujoPagina
 * @version 1.0, 12/01/2015
 *
 */
public interface FlujoPaginaService extends GenericDao<FlujoPagina> {

    /**
     * Método que permite realizar el almacenamiento en FlujoPagina
     *
     * @param flujoPagina
     * @return FlujoPagina
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    FlujoPagina persistFlujoPagina(FlujoPagina flujoPagina) throws Exception;

    /**
     * Método que permite realizar la actualización en FlujoPagina
     *
     * @param flujoPagina
     * @return FlujoPagina
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    FlujoPagina mergeFlujoPagina(FlujoPagina flujoPagina) throws Exception;

    /**
     * Método que permite guardar FlujoPagina
     *
     * @param flujoPagina
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    void removeFlujoPagina(FlujoPagina flujoPagina) throws Exception;

    /**
     * Método que permite listar todas las Paginas de acuerdo a un determinado
     * Flujo
     *
     * @param flujo el flujo del cual se requieren recuperar
     * @return List
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     */
    List<Pagina> listaFlujoPagina(Flujo flujo);

    /**
     * Método que de acuerdo a la pagina ingresada y al sentido (atras o
     * adelante) devuelve la pagina actual que corresponde
     *
     * @param flujo el flujo del cual se requieren recuperar
     * @param pagina la pagina actual en la que se encuentra
     * @param sentido cadena que puede tomar los siguientes valores: adelante o
     * atras
     * @param usuario el usuario responsable que realiza la transacción
     * @return List
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    Pagina NavegaPaginaFlujo(Flujo flujo, Pagina pagina, String sentido, Usuario usuario) throws Exception;
    /**
     * Metodo que permite rescatar el numero de flujo de un determinado tramite
     * @param flujo
     * @param usuario el usuario responsable que realiza la transacción
     * @return List
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     */
     int numeroPaginasSolicitud(Flujo flujo, Usuario usuario);
    /**
     * Metodo que permite encontrar la posicion de una pagina en la tabla FlujoPagina
     * @param flujo
     * @param idPagina
     * @param usuario el usuario responsable que realiza la transacción
     * @return List
     * @version 1.0, 12/01/2015
     * @author Eddy Valero
     */
    int encuentraPosicionPagina(Flujo flujo,Long idPagina,Usuario usuario);
    /**
     * Metodo que permite las paginas vigentes de un determinado tramite
     * @param flujo
     * @param pagina
     * @return List
     * @version 1.0, 11/02/2015
     * @author chanoRojas02
     * @throws java.lang.Exception
     */
    Boolean verificaPaginaActivaMenu(Flujo flujo, Pagina pagina) throws Exception;
    /**
     * Metodo que permite verificar si el formulario esta lleno para habilitar el mensaje en el menu de formulario lleno
     * @param flujoBase
     * @param paginaSeleccionada
     * @param tramite
     * @param usuario
     * @return List
     * @version 1.0, 11/02/2015
     * @author chanoRojas02
     * @throws java.lang.Exception
     */
     Boolean habilitaImagenFormularioLleno(Flujo flujoBase, Pagina paginaSeleccionada, Tramite tramite, Usuario usuario) throws Exception;
    
}
