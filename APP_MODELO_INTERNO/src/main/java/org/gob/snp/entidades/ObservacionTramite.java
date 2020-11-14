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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mapeo de la Entidad a persistir Tabla ObservacionTramite 
 * @author Eddy Valero
 * @see ObservacionTramiteService
 * @see ObservacionTramiteServiceImpl
 * @version 1.0, 17/09/2015
 */

@Entity
@Table(name = "ObservacionTramite")
public class ObservacionTramite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdObservacionTramite")
    private Long idObservacionTramite;
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private Long idUsuario;
    @Column(name = "EtapaTramite")
    private String etapaTramite;
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "FechaObservacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaObservacion;
    @Column(name = "Editable")
    private Boolean editable;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "Usuario")
    private Long usuario;
    
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private Tramite tramite;

    public ObservacionTramite() {
    }

    public ObservacionTramite(Long idObservacionTramite) {
        this.idObservacionTramite = idObservacionTramite;
    }

    public Long getIdObservacionTramite() {
        return idObservacionTramite;
    }

    public void setIdObservacionTramite(Long idObservacionTramite) {
        this.idObservacionTramite = idObservacionTramite;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEtapaTramite() {
        return etapaTramite;
    }

    public void setEtapaTramite(String etapaTramite) {
        this.etapaTramite = etapaTramite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaObservacion() {
        return fechaObservacion;
    }

    public void setFechaObservacion(Date fechaObservacion) {
        this.fechaObservacion = fechaObservacion;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        hash += (idObservacionTramite != null ? idObservacionTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObservacionTramite)) {
            return false;
        }
        ObservacionTramite other = (ObservacionTramite) object;
        if ((this.idObservacionTramite == null && other.idObservacionTramite != null) || (this.idObservacionTramite != null && !this.idObservacionTramite.equals(other.idObservacionTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ObservacionTramite[ idObservacionTramite=" + idObservacionTramite + " ]";
    }
    
}
