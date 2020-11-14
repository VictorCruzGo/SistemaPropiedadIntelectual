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
 * Entidad NotificadorZona responsable de realizar operaciones de Altas, Bajas y Modificaciones 
 * en la Tabla NotificadorZona
 *
 * @author Eddy Valero
 * @see NotificadorZonaServiceImpl
 * @see NotificadorZona
 * @version 1.0, 22/05/2015
 *
 */

@Entity
@Table(name = "NotificadorZona")
public class NotificadorZona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdNotificadorZona")
    private Long idNotificadorZona;
    @Basic(optional = false)
    @Column(name = "IdNotificador")
    private Long idNotificador;
    @Column(name = "CodigoZona")
    private String codigoZona;
    @Column(name = "NumeroNotificaciones")
    private Long numeroNotificaciones;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public NotificadorZona() {
    }

    public NotificadorZona(Long idNotificadorZona) {
        this.idNotificadorZona = idNotificadorZona;
    }

    public NotificadorZona(Long idNotificadorZona, long idNotificador) {
        this.idNotificadorZona = idNotificadorZona;
        this.idNotificador = idNotificador;
    }

    public Long getIdNotificadorZona() {
        return idNotificadorZona;
    }

    public void setIdNotificadorZona(Long idNotificadorZona) {
        this.idNotificadorZona = idNotificadorZona;
    }

    public Long getIdNotificador() {
        return idNotificador;
    }

    public void setIdNotificador(Long idNotificador) {
        this.idNotificador = idNotificador;
    }

    public String getCodigoZona() {
        return codigoZona;
    }

    public void setCodigoZona(String codigoZona) {
        this.codigoZona = codigoZona;
    }

    public Long getNumeroNotificaciones() {
        return numeroNotificaciones;
    }

    public void setNumeroNotificaciones(Long numeroNotificaciones) {
        this.numeroNotificaciones = numeroNotificaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean isVigente() {
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
        hash += (idNotificadorZona != null ? idNotificadorZona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificadorZona)) {
            return false;
        }
        NotificadorZona other = (NotificadorZona) object;
        if ((this.idNotificadorZona == null && other.idNotificadorZona != null) || (this.idNotificadorZona != null && !this.idNotificadorZona.equals(other.idNotificadorZona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.NotificadorZona[ idNotificadorZona=" + idNotificadorZona + " ]";
    }
    
}
