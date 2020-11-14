/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Henrry
 */
public enum EnumTipoDosificacion {
    RECIBO_NACIONAL("RENA"),
    RECIBO_INTERNACIONAL("REIN"),
    TITULO_NACIONAL("TINA"),
    TITULO_INTERNACIONAL("TIIN");
    
    
    private String codigo;
    
    private EnumTipoDosificacion(String codigo){
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
