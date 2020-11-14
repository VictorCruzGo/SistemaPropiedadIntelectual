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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.gob.snp.entidades.vistas.EstadoPublicacionTramite;

/**
 * Mapeo de la Entidad a persistir Tabla PublicacionTramite
 * @author Susana Escobar Paz
 * @see PublicacionTramite
 * @see PublicacionTramiteService
 * @version 1.0, 23/02/2015
 * <pre>
 * 
 * </pre>
 */

@Entity
@Table(name = "PublicacionTramite")

public class PublicacionTramite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPublicacionTramite")
    private Long idPublicacionTramite;
    
    
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = true)
    private Tramite tramite;

    @JoinColumn(name = "IdPublicacion", referencedColumnName = "IdPublicacion")
    @ManyToOne(optional = true)
    private Publicacion publicacion;

    @Column(name = "NumeroPublicacion")
    private Long numeroPublicacion;
    @Column(name = "Publicado")
    private Boolean publicado;
    @Column(name = "Observacion")
    private String observacion;
    
    
//    @Column(name = "EstadoPublicacionTramite")
//    private String estadoPublicacionTramite;
//    
    
    @ManyToOne
    @JoinColumn(name = "EstadoPublicacionTramite", referencedColumnName = "Codigo")
    private EstadoPublicacionTramite estadoPublicacionTramite;
    
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public PublicacionTramite() {
    }

    public PublicacionTramite(Long idPublicacionTramite) {
        this.idPublicacionTramite = idPublicacionTramite;
    }

    public Long getIdPublicacionTramite() {
        return idPublicacionTramite;
    }

    public void setIdPublicacionTramite(Long idPublicacionTramite) {
        this.idPublicacionTramite = idPublicacionTramite;
    }

    public Long getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(Long numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    public Boolean getPublicado() {
        return publicado;
    }

    public void setPublicado(Boolean publicado) {
        this.publicado = publicado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

//    public String getEstadoPublicacionTramite() {
//        return estadoPublicacionTramite;
//    }
//
//    public void setEstadoPublicacionTramite(String estadoPublicacionTramite) {
//        this.estadoPublicacionTramite = estadoPublicacionTramite;
//    }

    public EstadoPublicacionTramite getEstadoPublicacionTramite() {
        return estadoPublicacionTramite;
    }

    public void setEstadoPublicacionTramite(EstadoPublicacionTramite estadoPublicacionTramite) {
        this.estadoPublicacionTramite = estadoPublicacionTramite;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPublicacionTramite != null ? idPublicacionTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PublicacionTramite)) {
            return false;
        }
        PublicacionTramite other = (PublicacionTramite) object;
        if ((this.idPublicacionTramite == null && other.idPublicacionTramite != null) || (this.idPublicacionTramite != null && !this.idPublicacionTramite.equals(other.idPublicacionTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.PublicacionTramite[ idPublicacionTramite=" + idPublicacionTramite + " ]";
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

}
