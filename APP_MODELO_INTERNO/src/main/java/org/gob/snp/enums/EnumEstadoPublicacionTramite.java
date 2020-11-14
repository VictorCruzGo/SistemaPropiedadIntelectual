/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Susana
 */
public enum EnumEstadoPublicacionTramite {
    
    ASIGNADO("ASIG"),
    ELIMINADO("ELIM");
    
    
    private String codigo;
    
    private EnumEstadoPublicacionTramite(String codigo){
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
