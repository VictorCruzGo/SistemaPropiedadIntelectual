/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumTipoPreferenciaPrioridad {
    PRIORIDAD("PRIO"),
    OPOSICION_ANDINA("ACAN"),
    PREFERENCIA("PREF");
    
    private String codigo;
    
    private EnumTipoPreferenciaPrioridad(String codigo){
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
