/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonathan Valdivia
 */
public enum EnumTipoPersonaSolicitud {

    SOLICITANTE("SOLI"),
    APODERADO("APOD"),
    LICENCIATARIO("LICE"),
    NUEVOTITULAR("NTIT");

    private String codigo;

    private EnumTipoPersonaSolicitud(String codigo) {
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
