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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "OTRenovacion")
public class OTRenovacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRenovacion")
    private Long idRenovacion;
    
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = true)
    private Tramite tramite;

    @Column(name = "ReclasificacionMultiple")
    private Boolean reclasificacionMultiple;
    @Column(name = "ReclasificacionClase")
    private Integer reclasificacionClase;
    @Lob
    @Column(name = "LimitarProductosServicios")
    private String limitarProductosServicios;
    @Column(name = "ArchivoLimitacionProductos")
    private String archivoLimitacionProductos;
    @Column(name = "OrdenRenovacion")
    private Integer ordenRenovacion;
    @Column(name = "NumeroResolucion")
    private Long numeroResolucion;
    @Column(name = "FechaResolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaResolucion;
    @Lob
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public OTRenovacion() {
    }

    public OTRenovacion(Long idRenovacion) {
        this.idRenovacion = idRenovacion;
    }

    public Long getIdRenovacion() {
        return idRenovacion;
    }

    public void setIdRenovacion(Long idRenovacion) {
        this.idRenovacion = idRenovacion;
    }

    public Boolean getReclasificacionMultiple() {
        return reclasificacionMultiple;
    }

    public void setReclasificacionMultiple(Boolean reclasificacionMultiple) {
        this.reclasificacionMultiple = reclasificacionMultiple;
    }

    public Integer getReclasificacionClase() {
        return reclasificacionClase;
    }

    public void setReclasificacionClase(Integer reclasificacionClase) {
        this.reclasificacionClase = reclasificacionClase;
    }

    public String getLimitarProductosServicios() {
        return limitarProductosServicios;
    }

    public void setLimitarProductosServicios(String limitarProductosServicios) {
        this.limitarProductosServicios = limitarProductosServicios;
    }

    public String getArchivoLimitacionProductos() {
        return archivoLimitacionProductos;
    }

    public void setArchivoLimitacionProductos(String archivoLimitacionProductos) {
        this.archivoLimitacionProductos = archivoLimitacionProductos;
    }

    public Integer getOrdenRenovacion() {
        return ordenRenovacion;
    }

    public void setOrdenRenovacion(Integer ordenRenovacion) {
        this.ordenRenovacion = ordenRenovacion;
    }

    public Long getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(Long numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRenovacion != null ? idRenovacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OTRenovacion)) {
            return false;
        }
        OTRenovacion other = (OTRenovacion) object;
        if ((this.idRenovacion == null && other.idRenovacion != null) || (this.idRenovacion != null && !this.idRenovacion.equals(other.idRenovacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.OTRenovacion[ idRenovacion=" + idRenovacion + " ]";
    }

}
