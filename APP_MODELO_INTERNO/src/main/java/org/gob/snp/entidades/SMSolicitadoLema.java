/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.entidades;

import java.io.Serializable;
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
 * @author eddy
 */
@Entity
@Table(name = "SMSolicitadoLema")
public class SMSolicitadoLema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSolicitadoLema")
    private Long idSolicitadoLema;
    @Column(name = "Frase")
    private String frase;
    @Column(name = "VigenteHasta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigenteHasta;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;
    

    public SMSolicitadoLema() {
    }

    public SMSolicitadoLema(Long idSolicitadoLema) {
        this.idSolicitadoLema = idSolicitadoLema;
    }

    public Long getIdSolicitadoLema() {
        return idSolicitadoLema;
    }

    public void setIdSolicitadoLema(Long idSolicitadoLema) {
        this.idSolicitadoLema = idSolicitadoLema;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Date getVigenteHasta() {
        return vigenteHasta;
    }

    public void setVigenteHasta(Date vigenteHasta) {
        this.vigenteHasta = vigenteHasta;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitadoLema != null ? idSolicitadoLema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMSolicitadoLema)) {
            return false;
        }
        SMSolicitadoLema other = (SMSolicitadoLema) object;
        if ((this.idSolicitadoLema == null && other.idSolicitadoLema != null) || (this.idSolicitadoLema != null && !this.idSolicitadoLema.equals(other.idSolicitadoLema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMSolicitadoLema[ idSolicitadoLema=" + idSolicitadoLema + " ]";
    }
    
}
