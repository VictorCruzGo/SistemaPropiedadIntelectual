/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author hguzman
 */
public enum EnumTipoSigno {
    DENOMINATIVO("DES"),
    DENOMINATIVO_GRAFICA("DESG"),
    FIGURATIVO("FIG"),
    TRIDIMENSIONAL("TRI"),
    AUDITIVO("AUD"),
    OTROS("OTRO"),
    DENOMINACION_ORIGEN("DENO");
    
    
    private String codigo;
    
    private EnumTipoSigno(String codigo){
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
