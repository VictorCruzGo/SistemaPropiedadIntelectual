/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.pojo;

import java.util.ArrayList;
import java.util.List;
import org.gob.snp.entidades.Clasificador;

/**
 *
 * @author chano
 */
public class FormularioIngresoPojo implements Cloneable {

    private Boolean valorCheckBoxPadre;
    private List<Clasificador> listaClasificadorHijos = new ArrayList<Clasificador>();
    private List<String> listahijosRespuesta = new ArrayList<String>();
    String observacion;
    String estado;

    public Boolean getValorCheckBoxPadre() {
        return valorCheckBoxPadre;
    }

    public void setValorCheckBoxPadre(Boolean valorCheckBoxPadre) {
        this.valorCheckBoxPadre = valorCheckBoxPadre;
    }

    public List<Clasificador> getListaClasificadorHijos() {
        return listaClasificadorHijos;
    }

    public void setListaClasificadorHijos(List<Clasificador> listaClasificadorHijos) {
        this.listaClasificadorHijos = listaClasificadorHijos;
    }

    public List<String> getListahijosRespuesta() {
        return listahijosRespuesta;
    }

    public void setListahijosRespuesta(List<String> listahijosRespuesta) {
        this.listahijosRespuesta = listahijosRespuesta;
    }

     public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
