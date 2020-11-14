/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.enums;

/**
 *
 * @author Jonathan Valdivia
 */
public enum EnumEstadoProceso {
    
    /**
     * 
    *<pre>
    * ----------------------------------------------------
    * Modificado: Eddy Valero Fecha: 01/04/2014
    * Descripcion: De acuerdo a lo coordinado con la responsable de Sistemas, 
    * se agregan los estados: FE_ERRATAS, OMITIDO Y SUBSANADO, para manejar
    * los estados que se requieren en publicacion
    *</pre>
     */
    
    SOLICITADO("SOL"),
    EN_ANALISIS_PRELIMINAR("APRE"),
    OBSERVADO("OBS"),
    CONCEDIDO("CON"),
    DENEGADO("DEN"),
    DESISTIDO("DESI"),
    ABANDONADO("ABAN"),
    ARCHIVADO("ARCH"),
    INICIADO("INI"),
    OBSERVADO_PARA_USUARIO("OBUS"),
    ACTUALIZADO_USUARIO("ACTU"),
    ACTUALIZADO_TECNICO("ACTT"),
    PROCESO("PROC"),
    CONCLUIDO("CONC"),
    REVISADO("REV"),
    FE_ERRATAS("FER"),
    OMITIDO("OMI"),
    SUBSANADO("SUBS");
    
    private String codigo;
    
    private EnumEstadoProceso(String codigo){
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
