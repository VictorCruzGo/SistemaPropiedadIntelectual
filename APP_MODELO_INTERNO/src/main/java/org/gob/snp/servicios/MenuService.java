package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Menu;
import org.gob.snp.entidades.Rol;
import org.gob.snp.entidades.Usuario;
import org.primefaces.model.menu.MenuModel;

public interface MenuService extends GenericDao<Menu> {

    /**
     * método que permite listar todos los Menús
     *
     * @return List
     * @version 1.0, 20/06/2014
     * @author Jonathan
     */
    List<Menu> listaMenus();
    /**
     * método que permite listar todos los menus de nivel uno por Usuario
     *
     * @param usuario
     * @param idioma
     * @return List
     * @version 1.0, 23/06/2014
     * @author Jonathan
     */
    List<Menu> listaMenusPorUsuario(Usuario usuario, String idioma);
    
    /**
     * Método que permite listar todos los Menús de Nivel Dos por Menú de nivel uno
     *
     * @param menu
     * @param usuario
     * @return List<Menu>
     * @throws java.lang.Exception
     * 
     * <pre>
     * Creado: Jonathan Valdivia Fecha: 20/06/2014
     * Descripcion: Creación del método listaMenusDescendientesPorMenu 
     * -------------------------------------------------------------------------
     * Modificado: Eddy Valero Fecha: 03/06/2015
     * Descripcion: Modificar el método para que se muestre solo los menus vigentes
     * </pre>
     */
    List<Menu> listaMenusDescendientesPorMenu(Menu menu, Usuario usuario) throws Exception;

    /**
     * método que permite listar todos los Menus por Rol
     *
     * @param rol
     * @param idioma
     * @return List
     * @version 21.0, 23/06/2014
     * @author Jonathan
     */
    List<Menu> listaMenusPorRol(Rol rol, String idioma);

    /**
     * Método que permite listar todos los Menus de un Usuario en un 
     * objeto de tipo MenuModel, este comprime la direccion URL a la cual 
     * navegara cada uno de los menus
     *
     * @param usuario
     * @param idioma
     * @return MenuModel
     * @version 1.0, 24/06/2014
     * @author Jonathan
     */
    MenuModel listaMenusPorUsuarioEIdioma(Usuario usuario, String idioma) throws Exception;

    /**
     * Método que permite verificar si un menú tiene descendencia
     *
     * @param menu
     * @return MenuModel
     * @version 1.0, 24/06/2014
     * @author Jonathan
     */
    Boolean tieneDescendientes(Menu menu);
    
    
}
