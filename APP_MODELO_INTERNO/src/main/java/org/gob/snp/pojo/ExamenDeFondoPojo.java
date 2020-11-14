/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.pojo;

import java.util.ArrayList;
import java.util.List;
import org.gob.snp.entidades.DatoElementoFormulario;

/**
 *
 * @author Jonathan Valdivia
 */
public class ExamenDeFondoPojo {
    DatoElementoFormulario texto = new DatoElementoFormulario();
    List<DatoElementoFormulario> listaSelectOne = new ArrayList<DatoElementoFormulario>();
    String selectOneRespuesta = null;
    List<DatoElementoFormulario> listaCheckBox = new ArrayList<DatoElementoFormulario>();
    List<String> checkBoxRespuestas = null;
    List<DatoElementoFormulario> listaRadioButton = new ArrayList<DatoElementoFormulario>();
    String radioButtonRespuesta = null  ;

    public DatoElementoFormulario getTexto() {
        return texto;
    }

    public void setTexto(DatoElementoFormulario texto) {
        this.texto = texto;
    }

    public List<DatoElementoFormulario> getListaSelectOne() {
        return listaSelectOne;
    }

    public void setListaSelectOne(List<DatoElementoFormulario> listaSelectOne) {
        this.listaSelectOne = listaSelectOne;
    }

    public List<DatoElementoFormulario> getListaCheckBox() {
        return listaCheckBox;
    }

    public void setListaCheckBox(List<DatoElementoFormulario> listaCheckBox) {
        this.listaCheckBox = listaCheckBox;
    }

    public List<DatoElementoFormulario> getListaRadioButton() {
        return listaRadioButton;
    }

    public void setListaRadioButton(List<DatoElementoFormulario> listaRadioButton) {
        this.listaRadioButton = listaRadioButton;
    }

    public String getSelectOneRespuesta() {
        return selectOneRespuesta;
    }

    public void setSelectOneRespuesta(String selectOneRespuesta) {
        this.selectOneRespuesta = selectOneRespuesta;
    }

    public List<String> getCheckBoxRespuestas() {
        return checkBoxRespuestas;
    }

    public void setCheckBoxRespuestas(List<String> checkBoxRespuestas) {
        this.checkBoxRespuestas = checkBoxRespuestas;
    }

    public String getRadioButtonRespuesta() {
        return radioButtonRespuesta;
    }

    public void setRadioButtonRespuesta(String radioButtonRespuesta) {
        this.radioButtonRespuesta = radioButtonRespuesta;
    }
    
}
