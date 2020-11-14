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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author chano,roberto
 */
@Entity
@Table(name = "ClaseNiza")
public class ClaseNiza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdClaseNiza")
    private Long idClaseNiza;
    @Column(name = "NumeroClaseNiza")
    private String numeroClaseNiza;
    @Column(name = "TiposClaseNiza")
    private String tiposClaseNiza;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "Tipo")
    private Boolean tipo;
    @Column(name = "NotaTipoClaseNiza")
    private String notaTipoClaseNiza;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public ClaseNiza() {
    }

    public ClaseNiza(Long idClaseNiza) {
        this.idClaseNiza = idClaseNiza;
    }

    public Long getIdClaseNiza() {
        return idClaseNiza;
    }

    public void setIdClaseNiza(Long idClaseNiza) {
        this.idClaseNiza = idClaseNiza;
    }

    public String getNumeroClaseNiza() {
        return numeroClaseNiza;
    }

    public void setNumeroClaseNiza(String numeroClaseNiza) {
        this.numeroClaseNiza = numeroClaseNiza;
    }

    public String getTiposClaseNiza() {
        return tiposClaseNiza;
    }

    public void setTiposClaseNiza(String tiposClaseNiza) {
        this.tiposClaseNiza = tiposClaseNiza;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public String getNotaTipoClaseNiza() {
        return notaTipoClaseNiza;
    }

    public void setNotaTipoClaseNiza(String notaTipoClaseNiza) {
        this.notaTipoClaseNiza = notaTipoClaseNiza;
    }

    public Long getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(Long usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClaseNiza != null ? idClaseNiza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaseNiza)) {
            return false;
        }
        ClaseNiza other = (ClaseNiza) object;
        if ((this.idClaseNiza == null && other.idClaseNiza != null) || (this.idClaseNiza != null && !this.idClaseNiza.equals(other.idClaseNiza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ClaseNiza[ idClaseNiza=" + idClaseNiza + " ]";
    }

}
