/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Eddy Valero
 * @version 1.0 06/10/2015
 */
public enum EnumTipoSolicitudSigno {

    REGISTRO_SIGNO_MARCA("REGS"),
    REGISTRO_LEMA_COMERCIAL("RELC"),
    REGISTRO_NOMBRE_COMERCIAL("RDNC");
        
    
    private String codigo;

    private EnumTipoSolicitudSigno(String codigo) {
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
