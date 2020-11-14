/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumTipoTramite {
   REGISTRO_EN_EL_AREA_DE_PATENTES("REGP"),
    OPOSICION("OPO"),
    MODIFICACION("MODI"),
    NULIDAD("NUL"),
    MEDIDAS_EN_FRONTERA("IMEF"),
    RECURSO_DE_REVOCATORIA("RECR"),
    RENUNCIA_A_REGISTRO("RENR"),
    REGISTRO_EN_EL_AREA_DE_SIGNOS_DISTINTIVOS("REGS"),
    REGISTRO_EN_EL_AREA_DE_DERECHOS_DE_AUTOR("REGD"),
    RENOVACION("RENO"),
    CANCELACION("CAN"),
    INFRACCION("INF"),
    ANOTACION_PREVENTIVA("ANOP"),
    RECURSO_JERARQUICO("RECJ"),
    CAMBIO_NOMBRE("CANO"),
    CAMBIO_DOMICILIO("CADO"),
    TRANSFERENCIA("CATR"),
    FUSION("CAFU"),
    LICENCIA_DE_USO("CALU"),
    RECURSOS_ADMINISTRATIVOS("RECA"),
    REGISTRO_LEMA_COMERCIAL("RELC"),
    REGISTRO_DEPOSITO_NOMBRE_COMERCIAL_ROTULOS_ENSENAS("RDNC")    
    ;

    
    private String codigo;
    
    private EnumTipoTramite(String codigo){
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
