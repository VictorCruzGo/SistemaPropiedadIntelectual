/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonathan Valdivia
 */
public enum EnumRolesUsuario {
    USUARIO_EXTERNO("UEXT"),
    VENTANILLA("VENT"),
    TECNICO_DIGITALIZADOR("TDIG"),
    TECNICO_RECAUDACIONES("TREC"),
    TECNICO_EXAMEN_FONDO("TEXF"),
    RESPONSABLE_SIGNOS_DISTINTIVOS("RSDT"),
    DIRECTOR_PROPIEDAD_INDUSTRIAL("DPI"),
    TECNICO_NOTIFICACION("TNOT"),
    TECNICO_EN_PUBLICACION("TPUB"),
    RESPONSABLE_PUBLICACION("RPUB"),
    TECNICO_IMPRESION_TITULOS("TIMT"),
    TECNICO_RENOVACION("TREN"),
    TECNICO_ANALISIS_REGISTRABILIDAD_MS("TRAM"),
    TECNICO_SEGUIMIENTO("TSEG"),
    ;
    
    private String codigo;
    
    private EnumRolesUsuario(String codigo){
        this.codigo = codigo;
    }
    
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
