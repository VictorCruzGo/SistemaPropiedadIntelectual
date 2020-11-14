/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.RegistroExistenteEF;
import org.gob.snp.entidades.Usuario;

/**
 *
 * @author eddy
 */
public interface RegistroExistenteEFService extends GenericDao<RegistroExistenteEF> {

    /**
     * metodo que permite guardar RegistroExistenteEFService
     *
     * @param registroExistenteEF
     * @return RegistroExistenteEF
     * @version 1.0, 15/07/2014
     * @author eddy valero
     * @throws java.lang.Exception
     */
    RegistroExistenteEF persistRegistroExistenteEF(RegistroExistenteEF registroExistenteEF) throws Exception;

    /**
     * metodo que modifica RegistroExistenteEF
     *
     * @param registroExistenteEF
     * @return RegistroExistenteEF
     * @version 1.0, 15/07/2014
     * @author eddy valero
     * @throws java.lang.Exception
     */
    RegistroExistenteEF mergeRegistroExistenteEF(RegistroExistenteEF registroExistenteEF) throws Exception;

    /**
     * metodo que elimina RegistroExistenteEF
     *
     * @param registroExistenteEF
     * @version 1.0, 15/07/2014
     * @author eddy valero
     * @throws java.lang.Exception
     */
    void removeRegistroExistenteEF(RegistroExistenteEF registroExistenteEF) throws Exception;
    
    /**
     * método que realiza las validaciones de acuerdo al SM introducido
     * Se devolvera la cadena de acuerdo a lo siguiente
       opcion 1: El codigo SM Introducido no existe
       opcion 2: El codigo SM existe pero no tiene finalizado su tramite (Aun no esta en registro)
       opcion 3: El codigo SM es el mismo con el que se esta realizando la solicitud
       opcion 4: El codigo SM ya esta asociado a este analisisetapa
            por lo que no puede volverse a asociar nuevamente
       opcion 5: El codigo SM ya esta asociado a este analisisetapa, pero se realizó
            la anulación de sus registros, por lo que se debe tener
            la opcion de volver a habilitar estos registros
     * 
     *
     * @param SM Codigo con el que se realiza la búsqueda
     * @param analisisEtapa con el que se relacionara el registro insertado
     * @return int
     * @version 1.0, 31/10/2014
     * @author Eddy Valero
     * @throws java.lang.Exception
     */
    int validacionesAnalisisEtapaPorSM(String SM, AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * método que almacena un determinado registro a RegistroExistenteEFpermite
     * de acuerdo al SM introducido
     *
     * @param SM Codigo con el que se realiza la búsqueda
     * @param analisisEtapa con el que se relacionara el registro insertado
     * @param idUsuario el id del Usuario que realiza la operación
     * @return String
     * @version 1.0, 16/10/2014
     * @author eddy valero
     * -------------------------------------------------------------------------
     *  Modificado: Eddy Valero,  Fecha: 17/11/2014,
     *  Descripcion: En el caso que hubieran registros asociados al RegistroExistenteEF, y que no hubieran generado registros
     *  en la tabla DatoElementoFormulario de la pestania de AnalisisDeDenominaciones (que implica que no se generaron datos, 
     *  del resto de las pestanias), se cambia el estado como iniciado "IN"
     * 
     * @throws java.lang.Exception
     * 
     */
    String guardarRegistroExistenteEFPorSM(String SM, AnalisisEtapa analisisEtapa, Long idUsuario) throws Exception;

    /**
     * método que recupera el listado de todos los registros de RegistroExistenteEF 
     * de acuerdo al Analisis Etapa, sin importar el estado 
     *
     * @version 1.0, 17/10/2014
     * @author Eddy Valero
     * @param analisisEtapa AnalisisEtapa padre de todos los tramites asociado
     * a este objeto
     * @return List<RegistroExistenteEF>
     * @exception Exception
     */
    List<RegistroExistenteEF> recuperaRegistroExistenteEFPorAnalisisEtapa(AnalisisEtapa analisisEtapa) throws Exception;

    /**
     * método que almacena un determinado registro a RegistroExistenteEFpermite
     * de acuerdo a la busqueda realizada por palabra parecida
     *
     * @param marca con el que se realiza la búsqueda
     * @param analisisEtapa
     * @return List la lista de registros existentes con los cuales puede compararse con el registro solicitado
     */
    List<RegistroExistenteEF> generarRegistrosExistentesEFPorMarca(String marca, AnalisisEtapa analisisEtapa);
    
    /**
     * método que modifica el estado del registro RegistroExistenteEFPorMarca
     * asociado a un determinado AnalisisEtapa
     *
     * @param registroExistenteEF del objeto se recuperar el idTramite a anularse
     * @version 1.0, 29/10/2014
     * @author Eddy Valero
     */
    void anularRegistroExistenteEFPorMarca(RegistroExistenteEF registroExistenteEF);

    /**
     * Método que elimina un registro de una lista logica
     *     
     * @version 1.0, 20/10/2014
     * @author Eddy Valero
     * @param listaRegistroExistenteEF
     * @param registroExistenteEF
     * @return 
     */
    List<RegistroExistenteEF> eliminaRegistroExistenteEFdeListado(List<RegistroExistenteEF> listaRegistroExistenteEF, RegistroExistenteEF registroExistenteEF);
    
    /**
     * Método que obtiene una Lista de objetos RegistroExistenteEF a partir de
     * la Marca y Clase Niza enviados
     *
     * @param marca
     * @param analisisEtapa
     * @param claseNiza
     * @param usuario
     * @return List<RegistroExistenteEF>
     * @throws java.lang.Exception
     * 
     * <pre>
     * Creado: Eddy Valero Fecha: 20/05/2015
     * Descripcion: creación del método generarRegistrosExistentesEFPorClaseNizaYMarca
     * </pre>
     */
    List<RegistroExistenteEF> generarRegistrosExistentesEFPorClaseNizaYMarca(String marca, AnalisisEtapa analisisEtapa, Long claseNiza, Usuario usuario) throws Exception;
        
}
