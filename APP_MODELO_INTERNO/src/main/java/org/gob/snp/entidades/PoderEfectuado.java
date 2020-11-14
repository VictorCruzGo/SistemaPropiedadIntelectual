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
@Table(name = "PoderEfectuado")

public class PoderEfectuado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPoderEfectuado")
    private Long idPoderEfectuado;
    @Column(name = "TramiteEfectuado")
    private String tramiteEfectuado;
    @Column(name = "TramiteDepositado")
    private String tramiteDepositado;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public PoderEfectuado() {
    }

    public PoderEfectuado(Long idPoderEfectuado) {
        this.idPoderEfectuado = idPoderEfectuado;
    }

    public Long getIdPoderEfectuado() {
        return idPoderEfectuado;
    }

    public void setIdPoderEfectuado(Long idPoderEfectuado) {
        this.idPoderEfectuado = idPoderEfectuado;
    }

    public String getTramiteEfectuado() {
        return tramiteEfectuado;
    }

    public void setTramiteEfectuado(String tramiteEfectuado) {
        this.tramiteEfectuado = tramiteEfectuado;
    }

    public String getTramiteDepositado() {
        return tramiteDepositado;
    }

    public void setTramiteDepositado(String tramiteDepositado) {
        this.tramiteDepositado = tramiteDepositado;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPoderEfectuado != null ? idPoderEfectuado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PoderEfectuado)) {
            return false;
        }
        PoderEfectuado other = (PoderEfectuado) object;
        if ((this.idPoderEfectuado == null && other.idPoderEfectuado != null) || (this.idPoderEfectuado != null && !this.idPoderEfectuado.equals(other.idPoderEfectuado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.PoderEfectuado[ idPoderEfectuado=" + idPoderEfectuado + " ]";
    }
    
}
