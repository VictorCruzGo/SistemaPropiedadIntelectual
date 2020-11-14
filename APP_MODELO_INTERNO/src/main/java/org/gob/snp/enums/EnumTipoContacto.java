/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonathan Valdivia
 */
public enum EnumTipoContacto {
    CELULAR("CELN"),
    TELEFONO("TELE"),
    DIRECCION("DIRN"),
    CORREO_ELECTRONICO("MAIN"),
    FAX("FAXI")
    ;
    
    private String codigo;
    
    private EnumTipoContacto(String codigo){
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
