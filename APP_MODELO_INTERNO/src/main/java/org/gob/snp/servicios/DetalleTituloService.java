package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.DetalleTitulo;
import org.gob.snp.entidades.Recibo;
import org.gob.snp.entidades.Tramite;

public interface DetalleTituloService extends GenericDao<DetalleTitulo> {

    /**
     * metodo que permite adicionar DetalleTitulo
     *
     * @param detalleTitulo
     * @return DetalleTitulo
     * @version 1.0, 22/04/2015
     * @author Chano
     * @throws java.lang.Exception
     */
    DetalleTitulo persistDetalleTitulo(DetalleTitulo detalleTitulo) throws Exception;

    /**
     * metodo que permite modifica DetalleTitulo
     *
     * @param detalleTitulo
     * @return DetalleTitulo
     * @version 1.0, 22/04/2015
     * @author ChanoRojas
     * @throws java.lang.Exception
     */
    DetalleTitulo mergeDetalleTitulo(DetalleTitulo detalleTitulo) throws Exception;

    /**
     * metodo que permite eliminar DetalleTitulo
     *
     * @version 1.0, 22/04/2015
     * @author ChanoRojas
     * @param detalleTitulo
     * @throws java.lang.Exception
     *
     */
    void removeDetalleTitulo(DetalleTitulo detalleTitulo) throws Exception;

    /**
     * metodo que permite listar todos DetalleTitulos de un recibo
     *
     * @return List
     * @version 1.0, 21/04/2015
     * @author ChanoRojas
     */
    List<DetalleTitulo> listaDetalleTitulos();

    /**
     * metodo que permite encontrar un detalleTitulo por Recibo
     *
     * @param recibo
     * @return List
     * @version 1.0, 22/04/2015
     * @author ChanoRojas
     */
    DetalleTitulo encuentraDetalleTituloPorRecibo(Recibo recibo);
    }
