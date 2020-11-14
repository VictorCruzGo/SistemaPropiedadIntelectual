/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumTipoOperacionUsuario {
    
    INSERTAR("CREA"),
    ACTUALIZAR("UPDA"),
    ELIMINAR("DELE"),
    LISTAR("LIST")
    ;
    
    
    private String codigo;
    
    private EnumTipoOperacionUsuario(String codigo){
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
