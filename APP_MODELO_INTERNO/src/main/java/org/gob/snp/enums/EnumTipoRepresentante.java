/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Henrry
 */
public enum EnumTipoRepresentante {
    REPRESENTANTE_LEGAL("REPL"),
    APODERADO("APOR"),
    TUTOR("TUTO"),
    PADRE("PADR"),
    MADRE("MADR");
    
    
    private String codigo;
    
    private EnumTipoRepresentante(String codigo){
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
