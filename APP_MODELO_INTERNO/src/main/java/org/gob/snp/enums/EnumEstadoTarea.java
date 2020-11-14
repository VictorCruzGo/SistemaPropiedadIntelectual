/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumEstadoTarea {
    
    ASIGNADA("ASIG"),
    RE_ASIGNADA("RASI"),
    RECIBIDA("RECI"),
    INICIADA("INI"),
    ESPERANDO_RESPUESTA("ERES"),    
    CONCLUIDA("CONC"),
    OBSERVADO_PREPUBLICACION("OPRE");
    
    private String codigo;
    
    private EnumEstadoTarea(String codigo){
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
