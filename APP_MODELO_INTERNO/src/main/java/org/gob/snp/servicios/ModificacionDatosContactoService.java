package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.ModificacionDatosContacto;

public interface ModificacionDatosContactoService extends GenericDao<ModificacionDatosContacto> {
    
    /**
     * método que permite guardar las Modificacion de Datos de Contacto
     *
     * @return List
     * @version 1.0, 13/11/2014
     * @author Roberto Santivañes
     */
    public ModificacionDatosContacto persistModificacionDatosContacto(ModificacionDatosContacto modificacionDatosContacto) throws Exception;
    
    /**
     * método que permite Modificar las Modificacion de Datos de Contacto
     *
     * @return List
     * @version 1.0, 13/11/2014
     * @author Roberto Santivañes
     */
    public ModificacionDatosContacto mergeModificacionDatosContacto(ModificacionDatosContacto modificacionDatosContacto) throws Exception;
    
     /**
     * método que permite borrar las Modificacion de Datos de Contacto
     *
     * @return List
     * @version 1.0, 13/11/2014
     * @author Roberto Santivañes
     */
    public void removeModificacionDatosContacto(ModificacionDatosContacto modificacionDatosContacto) throws Exception;

     /**
     * método que permite listar todas las Modificacion de Datos de Contacto
     *
     ** @return List
     * @version 1.0, 13/11/2014
     * @author Roberto Santivañes
     */
    public List<ModificacionDatosContacto> listaModificacionDatosContacto();
    
    
}