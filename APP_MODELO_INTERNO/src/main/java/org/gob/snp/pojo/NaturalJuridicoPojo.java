/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.pojo;

import java.util.ArrayList;
import java.util.List;
import org.gob.snp.entidades.DatoElementoFormulario;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.Persona;

/**
 *
 * @author ChanoRojas  
 */
public class NaturalJuridicoPojo {
    Persona personaPojo = new Persona();
    Empresa empresaPojo =new Empresa();
    List<DatosContacto>listDatoContactoPojo=new ArrayList<DatosContacto>();

    public Persona getPersonaPojo() {
        return personaPojo;
    }

    public void setPersonaPojo(Persona personaPojo) {
        this.personaPojo = personaPojo;
    }

    public Empresa getEmpresaPojo() {
        return empresaPojo;
    }

    public void setEmpresaPojo(Empresa empresaPojo) {
        this.empresaPojo = empresaPojo;
    }

    public List<DatosContacto> getListDatoContactoPojo() {
        return listDatoContactoPojo;
    }

    public void setListDatoContactoPojo(List<DatosContacto> listDatoContactoPojo) {
        this.listDatoContactoPojo = listDatoContactoPojo;
    }
    

    

    
}
