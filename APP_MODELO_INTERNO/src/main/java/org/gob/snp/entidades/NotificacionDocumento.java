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
 * Mapeo de la Entidad a persistir Tabla NotificacionDocumento
 * @author Eddy Valero
 * @see NotificacionDocumentoService
 * @see NotificacionDocumentoServiceImpl
 * @version 1.0, 13/02/2015
 * <pre>
 * ----------------------------------------------------
 * Creado: Eddy Valero Fecha: 13/02/2015
 * Descripcion: Tabla responsable de la relacion entre Documento y la Notificacion
 * </pre>
 */
@Entity
@Table(name = "NotificacionDocumento")
public class NotificacionDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdNotificacionDocumento")
    private Long idNotificacionDocumento;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "ObservacionNotificacionDocumento")
    private String observacionNotificacionDocumento;
    @JoinColumn(name = "IdNotificacion", referencedColumnName = "IdNotificacion")
    @ManyToOne(optional = false)
    private Notificacion notificacion;
    @JoinColumn(name = "IdDocumento", referencedColumnName = "IdDocumento")
    @ManyToOne(optional = false)
    private Documento documento;

    public NotificacionDocumento() {
    }

    public NotificacionDocumento(Long idNotificacionDocumento) {
        this.idNotificacionDocumento = idNotificacionDocumento;
    }

    public Long getIdNotificacionDocumento() {
        return idNotificacionDocumento;
    }

    public void setIdNotificacionDocumento(Long idNotificacionDocumento) {
        this.idNotificacionDocumento = idNotificacionDocumento;
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

    public String getObservacionNotificacionDocumento() {
        return observacionNotificacionDocumento;
    }

    public void setObservacionNotificacionDocumento(String observacionNotificacionDocumento) {
        this.observacionNotificacionDocumento = observacionNotificacionDocumento;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotificacionDocumento != null ? idNotificacionDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificacionDocumento)) {
            return false;
        }
        NotificacionDocumento other = (NotificacionDocumento) object;
        if ((this.idNotificacionDocumento == null && other.idNotificacionDocumento != null) || (this.idNotificacionDocumento != null && !this.idNotificacionDocumento.equals(other.idNotificacionDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.NotificacionDocumento[ idNotificacionDocumento=" + idNotificacionDocumento + " ]";
    }
    
}
