/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Henrry
 */
public enum EnumTipoModificacion {

    MODIFICACION_NOMBRE("CANO"),
    MODIFICACION_DIRECCION("CADO"),
    TRANSFERENCIA("CATR"),
    FUSION("CAFU"),
    LICENCIA_DE_USO("CALU");
    
    private String codigo;

    private EnumTipoModificacion(String codigo) {
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
