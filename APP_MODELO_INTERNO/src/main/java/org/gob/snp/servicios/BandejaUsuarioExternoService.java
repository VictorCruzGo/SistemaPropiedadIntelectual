package org.gob.snp.servicios;

import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.BandejaUsuarioExterno;

public interface BandejaUsuarioExternoService extends GenericDao<BandejaUsuarioExterno> {

    /**
     * método que permite listar todos los registros de la Vista creada para las
     * Bandejas de usuarios externos
     *
     * @return List
     * @version 2.0, 01/07/2014
     * @author chanorojas
     */
    List<BandejaUsuarioExterno> listaBandejaUsuarioExterno();

    /**
     * método que permite listar todos los registros de la Vista creada para las
     * Bandejas de usuarios externos por usuario
     *
     * @param usuario
     * @return List
     * @version 2.0, 01/07/2014
     * @author chanorojas
     */
    List<BandejaUsuarioExterno> listaBandejaPorUsuarioExterno(Usuario usuario);

    /**
     * método que permite listar todos los registros de la Vista creada para las
     * Bandejas de usuarios externos por usuario y por parametros de la busqueda
     *
     * @param usuario
     * @param fechaInicial
     * @param fechaFinal
     * @param area
     * @param tipoTramite
     * @param estado
     * @param nombreMarca
     * @return List BandejaUsuarioExterno
     * @version 2.0, 04/07/2014
     * @author chanorojas
     */
    List<BandejaUsuarioExterno> listaBandejaPorUsuarioExternoFiltradoParametros(Usuario usuario, Date fechaInicial, Date fechaFinal, String area, String tipoSolicitud, String estado, String nombreMarca, String codigoSegunda);

}
