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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author roco
 */
@Entity
@Table(name = "PoderDepositado")

public class PoderDepositado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPoderDepositado")
    private Long idPoderDepositado;
    @Column(name = "Tramite")
    private String tramite;
    @Column(name = "NumeroTestimonio")
    private String numeroTestimonio;
    @Column(name = "FechaTestimonio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTestimonio;
    @Column(name = "NombreNotario")
    private String nombreNotario;
    @Lob
    @Column(name = "NombreTitular")
    private String nombreTitular;
    @Lob
    @Column(name = "DomicilioTitular")
    private String domicilioTitular;
    @Column(name = "NombreApoderado")
    private String nombreApoderado;
    @Column(name = "PoderRevocado")
    private String poderRevocado;
    @Lob
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public PoderDepositado() {
    }

    public PoderDepositado(Long idPoderDepositado) {
        this.idPoderDepositado = idPoderDepositado;
    }

    public Long getIdPoderDepositado() {
        return idPoderDepositado;
    }

    public void setIdPoderDepositado(Long idPoderDepositado) {
        this.idPoderDepositado = idPoderDepositado;
    }
    public String getNumeroTestimonio() {
        return numeroTestimonio;
    }

    public void setNumeroTestimonio(String numeroTestimonio) {
        this.numeroTestimonio = numeroTestimonio;
    }

    public Date getFechaTestimonio() {
        return fechaTestimonio;
    }

    public void setFechaTestimonio(Date fechaTestimonio) {
        this.fechaTestimonio = fechaTestimonio;
    }

    public String getNombreNotario() {
        return nombreNotario;
    }

    public void setNombreNotario(String nombreNotario) {
        this.nombreNotario = nombreNotario;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getDomicilioTitular() {
        return domicilioTitular;
    }

    public void setDomicilioTitular(String domicilioTitular) {
        this.domicilioTitular = domicilioTitular;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public String getPoderRevocado() {
        return poderRevocado;
    }

    public void setPoderRevocado(String poderRevocado) {
        this.poderRevocado = poderRevocado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
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
        hash += (idPoderDepositado != null ? idPoderDepositado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoderDepositado)) {
            return false;
        }
        PoderDepositado other = (PoderDepositado) object;
        if ((this.idPoderDepositado == null && other.idPoderDepositado != null) || (this.idPoderDepositado != null && !this.idPoderDepositado.equals(other.idPoderDepositado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.PoderDepositado[ idPoderDepositado=" + idPoderDepositado + " ]";
    }
    
}
