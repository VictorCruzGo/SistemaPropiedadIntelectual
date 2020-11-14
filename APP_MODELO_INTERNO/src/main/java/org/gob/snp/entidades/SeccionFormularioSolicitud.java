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
 * Mapeo de la Entidad a persistir Tabla SeccionFormularioSolicitud 
 * @author Eddy Valero
 * @see SeccionFormulariosolicitudService
 * @see SeccionFormulariosolicitudServiceImpl
 * @version 1.0, 01/10/2015
 */

@Entity
@Table(name = "SeccionFormularioSolicitud")
public class SeccionFormularioSolicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSeccionFormularioSolicitud")
    private Long idSeccionFormularioSolicitud;
    @Basic(optional = false)
    @Column(name = "NumeroSeccion")
    private long numeroSeccion;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
    @JoinColumn(name = "IdFlujo", referencedColumnName = "IdFlujo")
    @ManyToOne(optional = true)
    private Flujo flujo;

    public SeccionFormularioSolicitud() {
    }

    public SeccionFormularioSolicitud(Long idSeccionFormularioSolicitud) {
        this.idSeccionFormularioSolicitud = idSeccionFormularioSolicitud;
    }

    public SeccionFormularioSolicitud(Long idSeccionFormularioSolicitud, long numeroSeccion) {
        this.idSeccionFormularioSolicitud = idSeccionFormularioSolicitud;
        this.numeroSeccion = numeroSeccion;
    }

    public Long getIdSeccionFormularioSolicitud() {
        return idSeccionFormularioSolicitud;
    }

    public void setIdSeccionFormularioSolicitud(Long idSeccionFormularioSolicitud) {
        this.idSeccionFormularioSolicitud = idSeccionFormularioSolicitud;
    }

    public long getNumeroSeccion() {
        return numeroSeccion;
    }

    public void setNumeroSeccion(long numeroSeccion) {
        this.numeroSeccion = numeroSeccion;
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

    public Flujo getFlujo() {
        return flujo;
    }

    public void setFlujo(Flujo flujo) {
        this.flujo = flujo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeccionFormularioSolicitud != null ? idSeccionFormularioSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeccionFormularioSolicitud)) {
            return false;
        }
        SeccionFormularioSolicitud other = (SeccionFormularioSolicitud) object;
        if ((this.idSeccionFormularioSolicitud == null && other.idSeccionFormularioSolicitud != null) || (this.idSeccionFormularioSolicitud != null && !this.idSeccionFormularioSolicitud.equals(other.idSeccionFormularioSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SeccionFormularioSolicitud[ idSeccionFormularioSolicitud=" + idSeccionFormularioSolicitud + " ]";
    }
    
}
