/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumEstado {
    ACTIVO(true),
    INACTIVO(false);
    
    private Boolean codigo;
    
    private EnumEstado(Boolean codigo){
        this.codigo = codigo;
    }
    
    
    /**
     * @return the codigo
     */
    public Boolean getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Boolean codigo) {
        this.codigo = codigo;
    }
}
