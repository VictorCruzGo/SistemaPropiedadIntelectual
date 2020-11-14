package org.gob.snp;

import java.util.Date;

/**
 * <pre>
 * ----------------------------------------------------------------------------
 * Modificado: Eddy Valero Fecha: 24/11/2014
 * Descripcion: se  agrega el metodo LogServidor, con el objetivo de agregar el
 * log de operaciones realizadas en la aplicacion
 * ----------------------------------------------------------------------------
 * Modificado: Eddy Valero Fecha: 25/11/2014
 * Descripcion: se  agrega el metodo obtenerMensaje a partir de la Tabla MensajesAplicacion
 * Implementándose en el modelo, para mensajes de validación o mensajes que sean
 * necesarios desplegar en la aplicación asociados a un determinado módulo
 * ----------------------------------------------------------------------------
 * Modificado: Eddy Valero Fecha: 26/11/2014
 * Descripcion: se  agrega el metodo guardarErrorAplicacion, con el objetivo de
 * almacenar los diferentes errores que se esten dando en la aplicación
 * </pre>
 */
public interface GenericDao<T> {
    
    /**
     * Metodo que realiza la generación del log, de las diferentes Operaciones
     *
     * @param tipoOperacionUsuario: Cadena cuyo valor puede tomar las siguientes
     * valores INSERTAR, ACTUALIZAR, ELIMINAR, LISTAR
     * @param idUsuario: Long que es el valor del Usuario que esta realizando la
     * operación
     * @param mensajeOperacion: Cadena que referencia el mensaje de la
     * Operacion.
     * @param metodoYClase: Cadena con el nombre de la Clase y el Método que se
     * están utilizando.
     */

    T persist(T t);
    
    T merge(T t);
    
    void remove(T t);

    T find(Class clazz, Long id);

    /**
     * Metodo que realiza la generación del log, de las diferentes Operaciones
     *
     * @param tipoOperacionUsuario: Cadena cuyo valor puede tomar las siguientes
     * valores INSERTAR, ACTUALIZAR, ELIMINAR, LISTAR
     * @param idUsuario: Long que es el valor del Usuario que esta realizando la
     * operación
     * @param mensajeOperacion: Cadena que referencia el mensaje de la
     * Operacion.
     * @param metodoYClase: Cadena con el nombre de la Clase y el Método que se
     * están utilizando.
     */
    void guardarLogServidor(String tipoOperacionUsuario, Long idUsuario, String mensajeOperacion, String metodoYClase);

    /**
     * Metodo que permite obtener el Mensaje asociado a un determinado Modulo
     *
     * @param idModulo: identificación del Modulo
     * @param orden: numero del Mensaje que se desea obtener
     * @param idioma: idioma del mensaje que se desplegara
     * @return String, el numero del mensaje asociado al modulo y en un
     * determinado idioma
     */
    String obtenerMensaje(Long idModulo, int orden, String idioma);
    
    
    /**
     * Metodo que permite obtener el Mensaje asociado a un determinado Modulo
     *
     * @param idRegistro
     * @param Etapa
     * @param idUsuario
     * @param Fecha
     * @param direccionIP
     * @param dato
     * @param detalle
     */
    void iniciarDatos(Long idRegistro, String Etapa, Long idUsuario, Date Fecha, String direccionIP, String dato, String detalle);
    

}
