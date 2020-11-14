/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Susana
 */
public enum EnumEstadoRegistro {
    
    ACTIVO("ACTI"),
    ANULADO("ANUL"),
    REASIGNADO("REAS");
    
    
    private String codigo;
    
    private EnumEstadoRegistro(String codigo){
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
