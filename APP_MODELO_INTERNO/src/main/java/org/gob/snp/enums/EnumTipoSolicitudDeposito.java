/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Eddy Valero
 * @version 1.0 13/08/2014
 * 
 */
public enum EnumTipoSolicitudDeposito {
    
    NOMBRE_COMERCIAL("NOMC"),
    ROTULO_COMERCIAL("ROTC");
    
    private String codigo;
    
    private EnumTipoSolicitudDeposito(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
