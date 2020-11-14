/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "SMImagen")
public class SMImagen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSMImagen")
    private Long idSMImagen;

    @ManyToOne
    @JoinColumn(name = "IdSMLogotipo", referencedColumnName = "IdSMLogotipo")
    private SMLogotipo idSMLogotipo;

    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;

    public SMLogotipo getIdSMLogotipo() {
        return idSMLogotipo;
    }

    public void setIdSMLogotipo(SMLogotipo idSMLogotipo) {
        this.idSMLogotipo = idSMLogotipo;
    }

    public SMImagen() {
    }

    public SMImagen(Long idSMImagen) {
        this.idSMImagen = idSMImagen;
    }

    public Long getIdSMImagen() {
        return idSMImagen;
    }

    public void setIdSMImagen(Long idSMImagen) {
        this.idSMImagen = idSMImagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSMImagen != null ? idSMImagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMImagen)) {
            return false;
        }
        SMImagen other = (SMImagen) object;
        if ((this.idSMImagen == null && other.idSMImagen != null) || (this.idSMImagen != null && !this.idSMImagen.equals(other.idSMImagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMImagen[ idSMImagen=" + idSMImagen + " ]";
    }

}
