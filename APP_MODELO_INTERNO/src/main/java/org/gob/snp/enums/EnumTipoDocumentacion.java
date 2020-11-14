/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Gustavo Lizarraga
 */
public enum EnumTipoDocumentacion {

    DIBUJO("DIB"),
    RESUMEN("RESU"),
    RESOLUCION("RES"),
    DECRETO("DEC"),
    FORMULARIO("FORM"),
    CLASE_NIZA("NIZA"),
    DESCRIPCION("DES"),
    REGISTRO("REG"),
    TITULO("TITU"),
    OTRO("OTRO");

    private String codigo;

    private EnumTipoDocumentacion(String codigo) {
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
