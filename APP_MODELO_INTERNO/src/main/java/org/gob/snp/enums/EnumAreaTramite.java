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
public enum EnumAreaTramite {

    AREA_SIGNOS_MARCAS("MA"),
    AREA_PATENTES("PA"),
    AREA_DERECHOS_DE_AUTOR("DA");
        
    
    private String codigo;

    private EnumAreaTramite(String codigo) {
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
