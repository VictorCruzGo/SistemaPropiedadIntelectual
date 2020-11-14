/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Susana
 */
public enum EnumEstadoPublicacion {
    
    PUBLICADO("PUBL"),
    PREPUBLICADO("PREP"),
    ENVIADO("ENVI");
    
    
    private String codigo;
    
    private EnumEstadoPublicacion(String codigo){
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
