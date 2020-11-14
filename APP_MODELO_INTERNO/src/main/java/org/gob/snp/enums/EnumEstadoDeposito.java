/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumEstadoDeposito {
    
    DEPOSITO_VENCIDO("DVEN"),
    DEPOSITO_DEVOLUCION("DDEV"),
    DEPOSITO_VIGENTE("DVIG");
    
    
    private String codigo;
    
    private EnumEstadoDeposito(String codigo){
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
