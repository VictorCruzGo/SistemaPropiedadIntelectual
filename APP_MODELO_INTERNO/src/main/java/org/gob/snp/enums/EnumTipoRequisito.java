/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author hguzman
 */
public enum EnumTipoRequisito {
    
    MINIMO("MIN"),
    ADICIONAL("ADC"),
    OPCIONAL("OPC"),
    ANEXO("ANE");
    
    private String codigo;
    
    private EnumTipoRequisito(String codigo){
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
