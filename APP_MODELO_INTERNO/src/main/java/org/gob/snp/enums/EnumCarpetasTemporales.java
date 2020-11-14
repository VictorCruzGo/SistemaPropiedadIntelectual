/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Henrry Guzman
 */
public enum EnumCarpetasTemporales {

    CARPETA_IMAGENES("temp"),
    CARPETA_ARCHIVOS("tempFile");

    private String codigo;

    private EnumCarpetasTemporales(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
