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
 * @author Roberto Santivañes
 */
@Entity
@Table(name = "ModificacionDatosContacto")

public class ModificacionDatosContacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdModificacionDatosContacto")
    private Long idModificacionDatosContacto;
    
    @ManyToOne
    @JoinColumn(name = "OtSolicitudModificacion", referencedColumnName = "IdOTSolicitadoModificacion")
    private OTSolicitadoModificacion otSolicitudModificacion;
    
    @Column(name = "IdPersona")
    private BigInteger idPersona;
    @Column(name = "IdEmpresa")
    private BigInteger idEmpresa;
    @Column(name = "Notificar")
    private Boolean notificar;
    @Column(name = "Dato")
    private String dato;
    @Column(name = "TipoContacto")
    private String tipoContacto;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private BigInteger usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public ModificacionDatosContacto() {
    }

    public ModificacionDatosContacto(Long idModificacionDatosContacto) {
        this.idModificacionDatosContacto = idModificacionDatosContacto;
    }

    public Long getIdModificacionDatosContacto() {
        return idModificacionDatosContacto;
    }

    public void setIdModificacionDatosContacto(Long idModificacionDatosContacto) {
        this.idModificacionDatosContacto = idModificacionDatosContacto;
    }

    public BigInteger getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(BigInteger idPersona) {
        this.idPersona = idPersona;
    }

    public BigInteger getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(BigInteger idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Boolean getNotificar() {
        return notificar;
    }

    public void setNotificar(Boolean notificar) {
        this.notificar = notificar;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public BigInteger getUsuario() {
        return usuario;
    }

    public void setUsuario(BigInteger usuario) {
        this.usuario = usuario;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public OTSolicitadoModificacion getOtSolicitudModificacion() {
        return otSolicitudModificacion;
    }

    public void setOtSolicitudModificacion(OTSolicitadoModificacion otSolicitudModificacion) {
        this.otSolicitudModificacion = otSolicitudModificacion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModificacionDatosContacto != null ? idModificacionDatosContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModificacionDatosContacto)) {
            return false;
        }
        ModificacionDatosContacto other = (ModificacionDatosContacto) object;
        if ((this.idModificacionDatosContacto == null && other.idModificacionDatosContacto != null) || (this.idModificacionDatosContacto != null && !this.idModificacionDatosContacto.equals(other.idModificacionDatosContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ModificacionDatosContacto[ idModificacionDatosContacto=" + idModificacionDatosContacto + " ]";
    }
    
}
