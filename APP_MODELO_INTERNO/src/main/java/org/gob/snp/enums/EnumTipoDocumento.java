/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.enums;

/**
 *
 * @author roco
 */
public enum EnumTipoDocumento {
     CARNET_IDENTIDAD("CIDE"),
     DNI("DNNN"),
     PASAPORTE("PASA"),
     LIBRETA_MILITAR("LMIL"),
     OTRO_NATURAL("OTNN"),
     NUMERO_IDENTIFICACION_TRIBUTARIA_NATURAL("NITN"),
     NUMERO_IDENTIFICACION_TRIBUTARIA_JURIDICO("NITJ"),
     OTRO_JURIDICO("OTNJ");
     private String codigo;

    private EnumTipoDocumento(String codigo) {
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


