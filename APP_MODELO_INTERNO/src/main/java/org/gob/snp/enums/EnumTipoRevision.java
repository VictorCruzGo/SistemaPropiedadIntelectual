/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author hguzman
 */
public enum EnumTipoRevision {
    
    APROBADO("APRO"),
    NO_REVISADO("NREV"),
    REPROBADO("REPR");
    
    private String codigo;
    
    private EnumTipoRevision(String codigo){
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
