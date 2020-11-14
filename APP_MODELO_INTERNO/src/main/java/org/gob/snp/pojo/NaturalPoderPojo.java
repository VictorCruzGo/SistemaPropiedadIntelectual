/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.pojo;

import java.util.ArrayList;
import java.util.List;
import org.gob.snp.entidades.DatosContacto;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Poder;

/**
 *
 * @author susana
 */
public class NaturalPoderPojo {
    Persona personaPojo = new Persona();
    Poder poderPojo = new Poder();
    List<DatosContacto>listDatoContactoApoderadoPojo=new ArrayList<DatosContacto>();

    public Persona getPersonaPojo() {
        return personaPojo;
    }

    public void setPersonaPojo(Persona personaPojo) {
        this.personaPojo = personaPojo;
    }

    public Poder getPoderPojo() {
        return poderPojo;
    }

    public void setPoderPojo(Poder poderPojo) {
        this.poderPojo = poderPojo;
    }

    public List<DatosContacto> getListDatoContactoApoderadoPojo() {
        return listDatoContactoApoderadoPojo;
    }

    public void setListDatoContactoApoderadoPojo(List<DatosContacto> listDatoContactoApoderadoPojo) {
        this.listDatoContactoApoderadoPojo = listDatoContactoApoderadoPojo;
    }

     
}
