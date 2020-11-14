/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades.vistas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mapeo de la Vista a persistir Tabla bandeja_notificacion
 * @author Gustavo Lizarraga    
 * @see BandejaNotificacionService
 * @see BandejaNotificacionServiceImpl
 * @version 1.0, 20/02/2015
 */
@Entity
@Table(name = "bandeja_notificacion")
public class BandejaNotificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdNotificacion")
    private Long idNotificacion;
    @Column(name = "CodigoTramite")
    private String codigoTramite;
    @Column(name = "NombreSolicitud")
    private String nombreSolicitud;
    @Column(name = "FechaSolicitudNotificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitudNotificacion;
    @Basic(optional = false)
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "IdUsuarioAsignado")
    private Long idUsuarioAsignado;
    @Basic(optional = false)
    @Column(name = "IdTramite")
    private Long idTramite;

    public BandejaNotificacion() {
    }

    public Long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getCodigoTramite() {
        return codigoTramite;
    }

    public void setCodigoTramite(String codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }

    public Date getFechaSolicitudNotificacion() {
        return fechaSolicitudNotificacion;
    }

    public void setFechaSolicitudNotificacion(Date fechaSolicitudNotificacion) {
        this.fechaSolicitudNotificacion = fechaSolicitudNotificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getIdUsuarioAsignado() {
        return idUsuarioAsignado;
    }

    public void setIdUsuarioAsignado(Long idUsuarioAsignado) {
        this.idUsuarioAsignado = idUsuarioAsignado;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

}
