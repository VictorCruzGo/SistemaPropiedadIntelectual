/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 *  Enum relacionada a la vista tipo_notificacion
 * @author Eddy Valero
 * @version 1.0 11/02/2014
 */
public enum EnumEstadoNotificacion {

    SOLICITADO("SOL"),
    REALIZADO("REA"),
    NO_REALIZADO("NREA")
    ;
    
    private String codigo;

    private EnumEstadoNotificacion(String codigo) {
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
