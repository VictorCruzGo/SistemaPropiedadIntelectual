/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonas
 */
public enum EnumEstadoEtapa {
    
    SOLICITADO("SOL"),
    ANALISIS_PRELIMINAR("APRE"),
    OBSERVADO("OBS"),
    CONCEDIDO("CONC"),
    DENEGADO("DEN"),
    PROCESO("PROC"),
    DESISTIDO("DESI"),
    ABANDONADO("ABAN"),
    ARCHIVADO("ARCH"),
    ASIGNADO("ASIG"),
    ACTUALIZACION("ACTU"),
    ACTUALIZADO("ACTT"),
    INICIADO("INI"),
    REVISADO("REV");
    
    private String codigo;
    
    private EnumEstadoEtapa(String codigo){
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
