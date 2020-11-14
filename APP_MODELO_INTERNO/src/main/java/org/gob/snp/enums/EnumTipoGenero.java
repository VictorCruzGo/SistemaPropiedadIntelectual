/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Henrry Guzman
 */
public enum EnumTipoGenero {
    MARCA_DE_PRODUCTO("MP"),
    MARCA_DE_SERVICIO("MS"),
    CERTIFICACION("CER"),
    MARCO_COLECTIVA("MC"),
    DENOMINACION_DE_ORIGEN("DOR"),
    LEMA_COMERCIAL("LC"),
    NOMBRE_COMERCIAL("NC"),
    ROTULO_COMERCIAL_ENSENA("RC")
    ;
    
    private String codigo;
    
    private EnumTipoGenero(String codigo){
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
