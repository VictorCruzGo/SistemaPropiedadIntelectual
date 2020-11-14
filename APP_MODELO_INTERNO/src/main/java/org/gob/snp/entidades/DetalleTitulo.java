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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "DetalleTitulo")

public class DetalleTitulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDetalleTitulo")
    private Long idDetalleTitulo;

    @ManyToOne
    @JoinColumn(name = "IdRecibo", referencedColumnName = "IdRecibo")
    private Recibo recibo;

    @Basic(optional = false)
    @Column(name = "Serie")
    private String serie;
    @Basic(optional = false)
    @Column(name = "NroTitulo")
    private int nroTitulo;

    public DetalleTitulo() {
    }

    public DetalleTitulo(Long idDetalleTitulo) {
        this.idDetalleTitulo = idDetalleTitulo;
    }

    public DetalleTitulo(Long idDetalleTitulo, String serie, int nroTitulo) {
        this.idDetalleTitulo = idDetalleTitulo;
        this.serie = serie;
        this.nroTitulo = nroTitulo;
    }

    public Long getIdDetalleTitulo() {
        return idDetalleTitulo;
    }

    public void setIdDetalleTitulo(Long idDetalleTitulo) {
        this.idDetalleTitulo = idDetalleTitulo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNroTitulo() {
        return nroTitulo;
    }

    public void setNroTitulo(int nroTitulo) {
        this.nroTitulo = nroTitulo;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleTitulo != null ? idDetalleTitulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleTitulo)) {
            return false;
        }
        DetalleTitulo other = (DetalleTitulo) object;
        if ((this.idDetalleTitulo == null && other.idDetalleTitulo != null) || (this.idDetalleTitulo != null && !this.idDetalleTitulo.equals(other.idDetalleTitulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.DetalleTitulo[ idDetalleTitulo=" + idDetalleTitulo + " ]";
    }

}
