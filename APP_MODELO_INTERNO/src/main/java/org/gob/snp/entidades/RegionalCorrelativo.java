/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "RegionalCorrelativo")
public class RegionalCorrelativo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRegionalCorrelativo")
    private Long idRegionalCorrelativo;
 
    @JoinColumn(name = "IdRegional", referencedColumnName = "IdRegional")
    @ManyToOne(optional = true)
    private Regional regional;
    
    
    @JoinColumn(name = "IdCorrelativo", referencedColumnName = "IdCorrelativo")
    @ManyToOne(optional = true)
    private Correlativo correlativo;
    
    
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public RegionalCorrelativo() {
    }

    public RegionalCorrelativo(Long idRegionalCorrelativo) {
        this.idRegionalCorrelativo = idRegionalCorrelativo;
    }

    public Long getIdRegionalCorrelativo() {
        return idRegionalCorrelativo;
    }

    public void setIdRegionalCorrelativo(Long idRegionalCorrelativo) {
        this.idRegionalCorrelativo = idRegionalCorrelativo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }



    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public Correlativo getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Correlativo correlativo) {
        this.correlativo = correlativo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegionalCorrelativo != null ? idRegionalCorrelativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionalCorrelativo)) {
            return false;
        }
        RegionalCorrelativo other = (RegionalCorrelativo) object;
        if ((this.idRegionalCorrelativo == null && other.idRegionalCorrelativo != null) || (this.idRegionalCorrelativo != null && !this.idRegionalCorrelativo.equals(other.idRegionalCorrelativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.RegionalCorrelativo[ idRegionalCorrelativo=" + idRegionalCorrelativo + " ]";
    }
    
}
