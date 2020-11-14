/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios;

import java.util.List;
import org.gob.snp.GenericDao;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.ElementoFormularioTramite;
import org.gob.snp.entidades.FormularioTramite;
import org.gob.snp.entidades.Usuario;

/**
 *
 * @author eddy
 */
public interface ElementoFormularioTramiteService extends GenericDao<ElementoFormularioTramite> {

    /**
     * método que permite guardar ElementoFormularioTramiteService
     *
     * @param elementoFormularioTramite
     * @return FormularioTramiteService
     * @version 1.0, 07/10/2014
     * @author roberto santivañez
     * @throws java.lang.Exception
     */
    ElementoFormularioTramite persistElementoFormularioTramite(ElementoFormularioTramite elementoFormularioTramite) throws Exception;

    /**
     * método que permite actualizar formularioTramite
     *
     * @param elementoFormularioTramite
     * @return FormularioTramiteService
     * @version 1.0, 07/10/2014
     * @author roberto santivañez
     * @throws java.lang.Exception
     */
    ElementoFormularioTramite mergeElementoFormularioTramite(ElementoFormularioTramite elementoFormularioTramite) throws Exception;

    /**
     * método que permite guardar formularioTramite
     *
     * @param elementoFormularioTramite
     * @version 1.0, 07/10/2014
     * @author roberto santivañez
     * @throws java.lang.Exception
     */
    void removeElementoFormularioTramite(ElementoFormularioTramite elementoFormularioTramite) throws Exception;

    /**
     * método que permite listar todos los registros de
     * ElementoFormularioTramite por un determinado FormularioTramite
     *
     * @param formularioTramite
     * @return List
     * @version 1.0, 07/10/2014
     * @author roberto santivañez
     * @throws java.lang.Exception
     */
    List<ElementoFormularioTramite> listaElementoFormularioTramite(FormularioTramite formularioTramite) throws Exception;

    /**
     * método que permite listar todos los registros de
     * ElementoFormularioTramite por un determinado FormularioTramite
     *
     * @param elementoFormularioTramite
     * @return List
     * @version 1.0, 09/10/2014
     * @author eddy valero
     * @throws java.lang.Exception
     */
    List<ElementoFormularioTramite> obtenerHijosDePadre(ElementoFormularioTramite elementoFormularioTramite) throws Exception;

    /**
     * método que permite copiar los registros de un determinado formulario y
     * clonar los mismos a partir de la tabla ElementoFormularioTramite en la
     * tabla DatoElementoFormulario
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @param pestania
     * @version 1.0, 08/10/2014
     * @author eddy valero
     */
    void vaciarRegistrosDatoElementoFormulario(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa, String pestania);

    /**
     * Método que permite generar la plantilla referente a la pestania
     * Registrabilidad en la tabla DatoElementoFormulario en la tabla
     * DatoElementoFormulario
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @param usuario
     * @throws java.lang.Exception
     * @version 1.0, 17/10/2014
     * @author eddy valero
     * 
     * <pre>
     * Creado:Eddy Valero Fecha: 17/10/2014
     * Descripcion: creación del método generarPlantillaRegistrabilidad
     * -----------------------------------------------------
     * Modificado:Eddy Valero Fecha: 21/05/2015
     * Descripcion: se agrega el atributo usuario, el control de la excepcion y
     * consumir la fecha desde el servicio utilitarios.
     * </pre>
     */
    void generarPlantillaRegistrabilidad(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa, Usuario usuario) throws Exception;

    /**
     * método que permite generar la plantilla referente a la pestania
     * Registrabilidad en la tabla DatoElementoFormulario en la tabla
     * DatoElementoFormulario
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @version 1.0, 17/10/2014
     * @author eddy valero
     */
    void generarPlantillaRelacionRegistroExistente(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa);

    /**
     * método que permite generar la plantilla referente a las pestanias:
     * Analisis de Denominaciones y Analisis de Confundibilidad, de acuerdo al
     * numero de Tramites que se tiene, en la tabla RegistroExistenteEF, también
     * en el método se guardan por defecto los siguientes datos en el armazon:
     * Pestania AnalisisDenominaciones, seccion 1: - Registrado: con el numero
     * de SM que se compara - Marca: con el nombre de la marca con el que se ha
     * de realizar la comparación Pestania AnalisisDenominaciones, seccion 2: -
     * Solicitado: el nombre de la marca del registro solicitado - Registrado:
     * el nombre de la marca con el que se esta solicitando Pestania
     * Tridimensional seccion 1: - El Id de la Imagen que se esta solicitando.
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @version 1.0, 29/10/2014
     * @author eddy valero
     */
    void generarPlantillaAnalisisDenominacionesConfundibilidad(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa);

    /**
     * método que permite generar la plantilla referente a la pestania
     * Conclusion en la tabla DatoElementoFormulario a partir de los registros
     * de la tabla armazón ElementoFormularioTramite
     *
     * @param formularioTramite
     * @param analisisEtapa
     * @version 1.0, 10/11/2014
     * @author eddy valero
     */
    void generarPlantillaConclusion(FormularioTramite formularioTramite, AnalisisEtapa analisisEtapa);
}
