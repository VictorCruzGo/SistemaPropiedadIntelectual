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
import org.gob.snp.entidades.vistas.EstadoNotificacion;
import org.gob.snp.entidades.vistas.TipoNotificacion;

/**
 *
 * @author gusn8
 */
@Entity
@Table(name = "Notificacion")
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdNotificacion")
    private Long idNotificacion;
    @Column(name = "IdTramite")
    private Long idTramite;
    @ManyToOne
    @JoinColumn(name = "TipoNotificacion", referencedColumnName = "Codigo")
    private TipoNotificacion tipoNotificacion;
    @Column(name = "FechaSolicitudNotificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitudNotificacion;
    @Column(name = "FechaNotificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNotificacion;
    @ManyToOne
    @JoinColumn(name = "EstadoNotificacion", referencedColumnName = "Codigo")
    private EstadoNotificacion estadoNotificacion;
    @Column(name = "PersonaNotificada")
    private String personaNotificada;
    @Lob
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "UsuarioSolicitante")
    private Long usuarioSolicitante;
    @Column(name = "IdUsuarioAsignado")
    private Long idUsuarioAsignado;
    @Column(name = "FechaConclusion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConclusion;
    @Column(name = "FechaRecepcion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRecepcion;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Notificacion() {
    }

    public Notificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public Date getFechaSolicitudNotificacion() {
        return fechaSolicitudNotificacion;
    }

    public void setFechaSolicitudNotificacion(Date fechaSolicitudNotificacion) {
        this.fechaSolicitudNotificacion = fechaSolicitudNotificacion;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public EstadoNotificacion getEstadoNotificacion() {
        return estadoNotificacion;
    }

    public void setEstadoNotificacion(EstadoNotificacion estadoNotificacion) {
        this.estadoNotificacion = estadoNotificacion;
    }

    public String getPersonaNotificada() {
        return personaNotificada;
    }

    public void setPersonaNotificada(String personaNotificada) {
        this.personaNotificada = personaNotificada;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(Long usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public Long getIdUsuarioAsignado() {
        return idUsuarioAsignado;
    }

    public void setIdUsuarioAsignado(Long idUsuarioAsignado) {
        this.idUsuarioAsignado = idUsuarioAsignado;
    }

    public Date getFechaConclusion() {
        return fechaConclusion;
    }

    public void setFechaConclusion(Date fechaConclusion) {
        this.fechaConclusion = fechaConclusion;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotificacion != null ? idNotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.idNotificacion == null && other.idNotificacion != null) || (this.idNotificacion != null && !this.idNotificacion.equals(other.idNotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Notificacion[ idNotificacion=" + idNotificacion + " ]";
    }

}
