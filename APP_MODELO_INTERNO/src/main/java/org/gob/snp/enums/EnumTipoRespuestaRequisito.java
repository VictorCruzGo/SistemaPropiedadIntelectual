/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author hguzman
 */
public enum EnumTipoRespuestaRequisito {
    
    TEXTO_OBSERVACION("TXT"),
    CHECK("CHK"),
    RADIOBUTTON("RBBT"),
    LISTA("LIST"),
    DETALLE("DET"),
    REQ_CHK_TXT("CTXT"),
    TABLA("TABL"),
    ;
    
    private String codigo;
    
    private EnumTipoRespuestaRequisito(String codigo){
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
