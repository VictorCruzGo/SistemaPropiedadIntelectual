/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumEstadoRecibo {
    
    RECIBO_ANULADO("RANU"),
    RECIBO_REASIGNADO("RREA"),
    RECIBO_IMPRESO("RIMPR"),
    RECIBO_ELIMINADO("RELI"),
    RECIBO_EMITIDO("REMI");
    
    
    
    private String codigo;
    
    private EnumEstadoRecibo(String codigo){
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
