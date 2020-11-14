package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Tramite;

public interface EmpresaService extends GenericDao<Empresa> {

    /**
     * método que permite listar todos las Empresas
     *
     * @return List
     * @version 2.0, 09/07/2014
     * @author Jonathan
     */
    List<Empresa> listaEmpresa();      
     /**
     * método que permite adicionar Empresas
     *     
     * @param empresa
     * @return 
     * @version 1.0, 10/07/2014
     * @author Jonathan
     * @throws java.lang.Exception
     */
    Empresa persistEmpresa(Empresa empresa) throws Exception;

    /**
     * metodo que permite modifica Empresa
     *     
     * @param empresa
     * @return Empresa
     * @version 1.0, 10/07/2014
     * @author Jonathan
     * @throws java.lang.Exception
     */
    Empresa mergeEmpresa(Empresa empresa) throws Exception;

    /**
     * metodo que permite eliminar Empresa
     *
     * @version 1.0, 10/07/2014
     * @author Jonathan
     * @param empresa
     
     * @throws java.lang.Exception

     */
    void removeEmpresa(Empresa empresa) throws Exception;
    
    /**
     * Metodo que verifica si la empresa tiene Tramites
     *
     * @version 1.0, 15/08/2014
     * @author Jonathan Valdivia 
     * @param empresa          
     * @param tramite          
     * @return           
     */
    Boolean verificaSiEmpresaTieneTramites(Empresa empresa, Tramite tramite);
    
    
    /**
     * Metodo que verifica si el titular del tramite es una Entidad persona
     * @param tramite
     * @return Boolean
     * @version 1.0, 13/10/2014
     * @author Eddy Valero
     */
    Boolean titularEsEmpresa(Tramite tramite);
    
    /**
     * Recuperar los datos de la persona que esta asociado
     * a un tramite como solicitante
     * @param tramite
     * @return Empresa
     * @version 1.0, 13/10/2014
     * @author Eddy Valero
     */
    Empresa encuentraEmpresaTramite(Tramite tramite);
    /**
     * Recuoera los datos de las empresas ligadas a un tramite 
     * @param tramite
     * @return List Empresa
     * @version 1.0, 17/11/2014
     * @author chanoRojas
     */
    List<Empresa> encuentraListadoEmpresasTramite(Tramite tramite);
    /**
     * Recupera los datos de las empresas ligadas a un tramite que tengan em PersonaEmpresaTramite el codigo NTIT usado para modificaciones
     * @param tramite
     * @return List Empresa
     * @version 1.0, 17/11/2014
     * @author Levi Laura
     */
     List<Empresa> encuentraListadoEmpresasTramiteTitular(Tramite tramite);
    
    /**
     * Recupera los datos de las empresas ligadas a un tramite que tengan em PersonaEmpresaTramite el codigo LICE usado para modificaciones
     * @param tramite
     * @return List Empresa
     * @version 1.0, 17/11/2014
     * @author Levi Laura
     */ 
     List<Empresa> encuentraListadoEmpresasTramiteLicenciatario(Tramite tramite);
     
      
    /**
     * método que permite verificar si el idModificar de empresa ya esta asociadol a un tramite de Modificacion de Nombre
     * @param tramite
     * @param empresa
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Susana Escobar Paz
     * Fecha: 24/07/2015
     * Descripcion: Se agrega el metodo verificaIdEmpresaModificarExistteEnTramite, que permite verificar si el idModificar de empresa ya esta asociadol a un tramite de Modificacion de Nombre
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
    Boolean verificaIdEmpresaModificarExistteEnTramite(Tramite tramite, Empresa empresa);
    /**
     * método que permite verificar si el idModificar de empresa ya esta asociadol a un tramite de Modificacion de Nombre
     * @param nit
     * @return Boolean
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: chanoRojas
     * Fecha: 24/07/2015
     * Descripcion: listado de empresas con el mismo numero de nit
     * ----------------------------------------------------
     * Modificado:
     * Descripcion:
     * </pre>
     */
     List<Empresa> listaDeEmpresasMismoNit(String nit);
}