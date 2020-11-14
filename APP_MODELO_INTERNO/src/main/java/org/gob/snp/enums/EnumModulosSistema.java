/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Eddy Valero
 */
public enum EnumModulosSistema {
//    COMUN(1L),
//    ADMINISTRACIONENTORNO(2L),
//    USUARIOEXTERNO(3L),
//    VENTANILLA(4L),
//    EXAMEN_DE_FORMA(5L),
//    EXAMEN_DE_FONDO(6L),
    ADMINISTRACION_DE_MENSAJES(7L),
    ADMINISTRACION_DE_LOGS_SERVIDOR(8L),
    ADMINISTRACION_DE_ERRORES(9L),
    CONTROL_DE_FLUJO(10L),
    AUTENTICACION(11L),
    MENUS(12L),
    ADMINISTRACION_DE_USUARIOS(13L),
    REGISTRO_DE_USUARIO(14L),
    BANDEJA_TRAMITES_SOLICITUD(15L),
    BANDEJA_TRAMITES_PROCESO(16L),
//    SOLICITUDES(17L),
    BANDEJA_VENTANILLA(18L),
    RECEPCION_DOCUMENTOS(19L),
    BANDEJA_EXAMEN_DE_FORMA(20L),
    EXAMEN_DE_FORMA(21L),
    BANDEJA_EXAMEN_DE_FONDO(22L),
//    ANALISIS_DE_REGISTRABILIDAD(23L),
    REGISTRO_SOLICITANTE_TRAMITE(24L),
    REGISTRO_APODERADO_TRAMITE(25L),
    REGISTRO_DE_SIGNO_DISTINTIVO(26L),
    REGISTRO_PRIORIDAD(27L),
    REGISTRO_DIRECCION_NOTIFICACION(28L),
    ANALISIS_DE_REGISTRABILIDAD(29L),
    RELACION_DE_REGISTROS_EXISTENTES(30L),
    ANALISIS_DE_DENOMINACIONES(31L),
    ANALISIS_DE_CONFUNDIBILIDAD(32L),
    CONCLUSION(33L),
    ANALISIS_DE_CONEXION_COMPETITIVA(34L),
    ANALISIS_DE_IMAGENES_3D(35L)
    ;

    private Long idModulo;
    
    private EnumModulosSistema(Long idModulo){
        this.idModulo = idModulo;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }
    
    
    
    
}
