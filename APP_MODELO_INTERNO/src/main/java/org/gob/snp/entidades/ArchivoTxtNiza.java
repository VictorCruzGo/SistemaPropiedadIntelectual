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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "ArchivoTxtNiza")
@NamedQueries({
    @NamedQuery(name = "ArchivoTxtNiza.findAll", query = "SELECT a FROM ArchivoTxtNiza a")})
public class ArchivoTxtNiza implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdArchivoTxtNiza")
    private Long idArchivoTxtNiza;
    @Lob
    @Column(name = "ArchivoTxt")
    private byte[] archivoTxt;
    @JoinColumn(name = "IdSMSignoClaseNiza", referencedColumnName = "IdSMSignoClaseNiza")
    @ManyToOne(optional = false)
    private SMSignoClaseNiza sMSignoClaseNiza;

    public ArchivoTxtNiza() {
    }

    public ArchivoTxtNiza(Long idArchivoTxtNiza) {
        this.idArchivoTxtNiza = idArchivoTxtNiza;
    }

    public Long getIdArchivoTxtNiza() {
        return idArchivoTxtNiza;
    }

    public void setIdArchivoTxtNiza(Long idArchivoTxtNiza) {
        this.idArchivoTxtNiza = idArchivoTxtNiza;
    }

    public byte[] getArchivoTxt() {
        return archivoTxt;
    }

    public void setArchivoTxt(byte[] archivoTxt) {
        this.archivoTxt = archivoTxt;
    }

    public SMSignoClaseNiza getsMSignoClaseNiza() {
        return sMSignoClaseNiza;
    }

    public void setsMSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) {
        this.sMSignoClaseNiza = sMSignoClaseNiza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArchivoTxtNiza != null ? idArchivoTxtNiza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArchivoTxtNiza)) {
            return false;
        }
        ArchivoTxtNiza other = (ArchivoTxtNiza) object;
        if ((this.idArchivoTxtNiza == null && other.idArchivoTxtNiza != null) || (this.idArchivoTxtNiza != null && !this.idArchivoTxtNiza.equals(other.idArchivoTxtNiza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ArchivoTxtNiza[ idArchivoTxtNiza=" + idArchivoTxtNiza + " ]";
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
