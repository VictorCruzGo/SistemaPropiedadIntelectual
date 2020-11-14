package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Modulo;

/**
 *
 * Interface responsable de las operaciones de Modulo
 * @author Eddy Valero
 * @version 1.0 18/11/2014
 * 
 */

public interface ModuloService extends GenericDao<Modulo> {

    /**
     * metodo que permite adicionar Modulos
     *
     * @param modulo
     * @return Modulo
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    Modulo persistModulo(Modulo modulo);

    /**
     * metodo que permite modifica Modulos
     *
     * @param modulo
     * @return Modulo
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    Modulo mergeModulo(Modulo modulo);

    /**
     * metodo que permite eliminar Modulos
     *
     *
     * @param modulo
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    void removeModulo(Modulo modulo);

    /**
     * metodo que permite listar todos los Modulos
     *
     * @return List
     * @version 1.0, 18/11/2014
     * @author Eddy Valero
     */
    List<Modulo> listaModulos();
    
    String generaCodigoNiveleAndSubNivel(Modulo modulo, String tipo, int numero);
    
    boolean verificaExistenciaMascaraNivelAndSubNivel(String mascaraGenerada);
    
    String verificaExistenciaCodigo(String mascaraGenerada);
    
    String generaCodigoNivelesSubAndPadre(Modulo getIdObjeto, String tipo);
    
    public int controlaLongitudNumero(Modulo modulo, String tipo);  
    
    public String generaNumeroSiguienteAutomatico(Modulo modulo, String nivel);
    
    String[] obtieneMascaraSeparada(Modulo modulo, String tipoNivel);
    
    int obtieneNiveleCuentaSubAndPadre(Modulo modulo, String tipo);
    
         
    /**
     * método que permite listar todos el Modulo ordenados
     *
     * @return List
     * @version 1.0, 21/11/2014
     * @author Jonathan Valdivia
     */
    List<Modulo> listaModulosOrdenados();
    
    /**
     * método que permite buscar todos los dependientes de un Modulo
     *
     * @param modulo 
     * @return List
     * @version 1.0, 21/11/2014
     * @author Jonathan Valdivia
     */
    List<Modulo> listaDependientesPorModulo(Modulo modulo);
    
}
