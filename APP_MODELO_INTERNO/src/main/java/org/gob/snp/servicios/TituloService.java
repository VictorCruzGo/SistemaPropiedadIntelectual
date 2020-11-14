package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Titulo;

public interface TituloService extends GenericDao<Titulo> {

    /**
     * metodo que permite adicionar los titulos
     *
     * @param titulo
     * @return titulo
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public Titulo persistTitulo(Titulo titulo) throws Exception;

    /**
     * metodo que permite modifica los titulos
     *
     * @param titulo
     * @return titulo
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     * @throws java.lang.Exception
     */
    public Titulo mergeTitulo(Titulo titulo) throws Exception;

    /**
     * metodo que permite eliminar los titulos
     *
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     * @param titulo
     * @throws java.lang.Exception
     *
     */
    public void removeTitulo(Titulo titulo) throws Exception;

    /**
     * metodo que permite listar todos los titulos
     *
     * @return List
     * @version 1.0, 01/10/2014
     * @author RobertoSantivañez
     */
    public List<Titulo> listaTitulo();
    
}
