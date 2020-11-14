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
import org.gob.snp.entidades.vistas.EstadoProcesoPublicacion;
import org.gob.snp.entidades.vistas.EstadoPublicacion;

/**
 * Mapeo de la Entidad a persistir Tabla Publicacion
 * @author Susana Escobar Paz
 * @see Publicacion
 * @see PublicacionService
 * @version 1.0, 23/02/2015
 * <pre>
 * 
 * </pre>
 */

@Entity
@Table(name = "Publicacion")

public class Publicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPublicacion")
    private Long idPublicacion;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FechaPublicacionGaceta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPublicacionGaceta;
    @Column(name = "FechaPublicacionWeb")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPublicacionWeb;
    @Column(name = "PublicadoWeb")
    private Boolean publicadoWeb;
    @Column(name = "InicioNumeroPublicacion")
    private Long inicioNumeroPublicacion;
    @Column(name = "FinNumeroPublicacion")
    private Long finNumeroPublicacion;
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "NroGaceta")
    private Long nroGaceta;
    
    @ManyToOne
    @JoinColumn(name = "EstadoPublicacion", referencedColumnName = "Codigo")
    private EstadoPublicacion estadoPublicacion;
    
    @ManyToOne
    @JoinColumn(name = "EstadoProcesoPublicacion", referencedColumnName = "Codigo")
    private EstadoProcesoPublicacion estadoProcesoPublicacion;
    
    @Column(name = "FechaCreacionRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacionRegistro;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Publicacion() {
    }

    public Publicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaPublicacionGaceta() {
        return fechaPublicacionGaceta;
    }

    public void setFechaPublicacionGaceta(Date fechaPublicacionGaceta) {
        this.fechaPublicacionGaceta = fechaPublicacionGaceta;
    }

    public Date getFechaPublicacionWeb() {
        return fechaPublicacionWeb;
    }

    public void setFechaPublicacionWeb(Date fechaPublicacionWeb) {
        this.fechaPublicacionWeb = fechaPublicacionWeb;
    }

    public Boolean getPublicadoWeb() {
        return publicadoWeb;
    }

    public void setPublicadoWeb(Boolean publicadoWeb) {
        this.publicadoWeb = publicadoWeb;
    }

    public Long getInicioNumeroPublicacion() {
        return inicioNumeroPublicacion;
    }

    public void setInicioNumeroPublicacion(Long inicioNumeroPublicacion) {
        this.inicioNumeroPublicacion = inicioNumeroPublicacion;
    }

    public Long getFinNumeroPublicacion() {
        return finNumeroPublicacion;
    }

    public void setFinNumeroPublicacion(Long finNumeroPublicacion) {
        this.finNumeroPublicacion = finNumeroPublicacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getNroGaceta() {
        return nroGaceta;
    }

    public void setNroGaceta(Long nroGaceta) {
        this.nroGaceta = nroGaceta;
    }

    public EstadoPublicacion getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(EstadoPublicacion estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }
   
    public Date getFechaCreacionRegistro() {
        return fechaCreacionRegistro;
    }

    public void setFechaCreacionRegistro(Date fechaCreacionRegistro) {
        this.fechaCreacionRegistro = fechaCreacionRegistro;
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

    public EstadoProcesoPublicacion getEstadoProcesoPublicacion() {
        return estadoProcesoPublicacion;
    }

    public void setEstadoProcesoPublicacion(EstadoProcesoPublicacion estadoProcesoPublicacion) {
        this.estadoProcesoPublicacion = estadoProcesoPublicacion;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPublicacion != null ? idPublicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.idPublicacion == null && other.idPublicacion != null) || (this.idPublicacion != null && !this.idPublicacion.equals(other.idPublicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Publicacion[ idPublicacion=" + idPublicacion + " ]";
    }
    
}
