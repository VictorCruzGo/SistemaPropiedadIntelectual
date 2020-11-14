/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.pojo;

import org.gob.snp.entidades.Documento;

/**
 * Pojo responsable de tener el Documento y la observacion
 * @author Eddy Valero
 * @version 1.0 12/02/2015
 * 
 */
public class DocumentoObservacionPojo {
    
    Boolean activo; 
    Documento documento;
    String observacion;

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
    
}
