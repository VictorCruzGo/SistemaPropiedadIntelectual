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
import org.gob.snp.entidades.vistas.TipoPreferenciaPrioridad;
import org.gob.snp.entidades.vistas.TipoProteccionPrioridad;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "SMSolicitadoPrioridad")

public class SMSolicitadoPrioridad implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSolicitadoPrioridad")
    private Long idSolicitadoPrioridad;
    @ManyToOne
    @JoinColumn(name = "TipoPreferenciaPrioridad", referencedColumnName = "Codigo")
    private TipoPreferenciaPrioridad preferenciaPrioridad;
    @Column(name = "NumeroPrioridad")
    private String numeroPrioridad;
    @Column(name = "OficinaPrioridad")
    private String oficinaPrioridad;
    @Column(name = "CodigoClasificador")
    private String codigoClasificador;
    @Column(name = "Lugar")
    private String lugar;
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "FechaEmision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "Vigente")
    private Boolean vigente;
    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public SMSolicitadoPrioridad() {
    }

    public SMSolicitadoPrioridad(Long idSolicitadoPrioridad) {
        this.idSolicitadoPrioridad = idSolicitadoPrioridad;
    }

    public Long getIdSolicitadoPrioridad() {
        return idSolicitadoPrioridad;
    }

    public void setIdSolicitadoPrioridad(Long idSolicitadoPrioridad) {
        this.idSolicitadoPrioridad = idSolicitadoPrioridad;
    }

    public TipoPreferenciaPrioridad getPreferenciaPrioridad() {
        return preferenciaPrioridad;
    }

    public void setPreferenciaPrioridad(TipoPreferenciaPrioridad preferenciaPrioridad) {
        this.preferenciaPrioridad = preferenciaPrioridad;
    }

    public String getNumeroPrioridad() {
        return numeroPrioridad;
    }

    public void setNumeroPrioridad(String numeroPrioridad) {
        this.numeroPrioridad = numeroPrioridad;
    }

    public String getOficinaPrioridad() {
        return oficinaPrioridad;
    }

    public void setOficinaPrioridad(String oficinaPrioridad) {
        this.oficinaPrioridad = oficinaPrioridad;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
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

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCodigoClasificador() {
        return codigoClasificador;
    }

    public void setCodigoClasificador(String codigoClasificador) {
        this.codigoClasificador = codigoClasificador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitadoPrioridad != null ? idSolicitadoPrioridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMSolicitadoPrioridad)) {
            return false;
        }
        SMSolicitadoPrioridad other = (SMSolicitadoPrioridad) object;
        if ((this.idSolicitadoPrioridad == null && other.idSolicitadoPrioridad != null) || (this.idSolicitadoPrioridad != null && !this.idSolicitadoPrioridad.equals(other.idSolicitadoPrioridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMSolicitadoPrioridad[ idSolicitadoPrioridad=" + idSolicitadoPrioridad + " ]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }

}
