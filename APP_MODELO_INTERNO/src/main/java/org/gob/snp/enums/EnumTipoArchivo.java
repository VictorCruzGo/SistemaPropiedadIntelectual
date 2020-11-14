/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Eddy Valero
 * @version 1.0 16/12/2014
 */
public enum EnumTipoArchivo {

    PDF("pdf"),
    PNG("png"),
    DOC("doc"),
    GIF("gif"),
    DOCX("docx"),
    TXT("txt"),
    XLSX("xlsx")
    ;
    
    private String codigo;

    private EnumTipoArchivo(String codigo) {
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
