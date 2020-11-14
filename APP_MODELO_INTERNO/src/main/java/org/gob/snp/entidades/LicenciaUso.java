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
 * @author Gustavo Lizárraga
 */
@Entity
@Table(name = "LicenciaUso")
public class LicenciaUso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdLicenciaUso")
    private Long idLicenciaUso;

    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;

    @Column(name = "IdPersona")
    private Long idPersona;
    @Column(name = "IdEmpresa")
    private Long idEmpresa;
    @Column(name = "FechaInicioLicencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioLicencia;
    @Column(name = "LicenciaIndefinida")
    private Boolean licenciaIndefinida;
    @Column(name = "FechaFinLicencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinLicencia;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public LicenciaUso() {
    }

    public LicenciaUso(Long idLicenciaUso) {
        this.idLicenciaUso = idLicenciaUso;
    }

    public Long getIdLicenciaUso() {
        return idLicenciaUso;
    }

    public void setIdLicenciaUso(Long idLicenciaUso) {
        this.idLicenciaUso = idLicenciaUso;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaInicioLicencia() {
        return fechaInicioLicencia;
    }

    public void setFechaInicioLicencia(Date fechaInicioLicencia) {
        this.fechaInicioLicencia = fechaInicioLicencia;
    }

    public Boolean getLicenciaIndefinida() {
        return licenciaIndefinida;
    }

    public void setLicenciaIndefinida(Boolean licenciaIndefinida) {
        this.licenciaIndefinida = licenciaIndefinida;
    }

    public Date getFechaFinLicencia() {
        return fechaFinLicencia;
    }

    public void setFechaFinLicencia(Date fechaFinLicencia) {
        this.fechaFinLicencia = fechaFinLicencia;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
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

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicenciaUso != null ? idLicenciaUso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LicenciaUso)) {
            return false;
        }
        LicenciaUso other = (LicenciaUso) object;
        if ((this.idLicenciaUso == null && other.idLicenciaUso != null) || (this.idLicenciaUso != null && !this.idLicenciaUso.equals(other.idLicenciaUso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.LicenciaUso[ idLicenciaUso=" + idLicenciaUso + " ]";
    }

}
