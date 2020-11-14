/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumEtapaTramite {

    USUARIO("USU"),
    VENTANILLA("VEN"),
    DIGITALIZACION("DIG"),
    RECAUDACIONES("RECA"),
    EXAMEN_DE_FORMA("EXFM"),
    PUBLICACION("PUBL"),
    EXAMEN_DE_FONDO("EXFF"),
    OPOSICION("OPO"),
    REGISTRO("REG"),
    RECURSO("REC"),
    ENTREGA("ENT"),
    NOTIFICACION("NOT"),
    REV_EXAMEN_FORMA_UNO("REV1"),
    REV_EXAMEN_FORMA_DOS("REV2"),
    IMPRESION_TITULOS("IMTI")
    ;

    private String codigo;

    private EnumEtapaTramite(String codigo) {
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
