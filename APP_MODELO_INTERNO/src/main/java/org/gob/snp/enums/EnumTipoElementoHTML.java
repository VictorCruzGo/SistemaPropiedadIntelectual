/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author eddy valero
 * Creacion del enum correspondiente a los elementos: InputText, OutputText, Checkbox, SelectOneMenu, RadioButton, TextArea, Checkbox
 * 
 */
public enum EnumTipoElementoHTML {
    
    INPUTTEXT("TEH1"),
    OUTPUTTEXT("TEH2"),
    CHECKBOX("TEH3"),
    SELECTONEMENU("TEH4"),
    RADIOBUTTON("TEH5"),
    TEXTAREA("TEH6"),
    CHECKBOXINPUTTEXT("TEH7");
    
    private String codigo;
    
    private EnumTipoElementoHTML(String codigo){
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
