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
 * @author eddy
 */
@Entity
@Table(name = "ErrorAplicacion")
@NamedQueries({
    @NamedQuery(name = "ErrorAplicacion.findAll", query = "SELECT e FROM ErrorAplicacion e")})
public class ErrorAplicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdErrorAplicacion")
    private Long idErrorAplicacion;
    @Column(name = "IdUsuario")
    private Long idUsuario;
    @Column(name = "IdModulo")
    private Long idModulo;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;

    public ErrorAplicacion() {
    }

    public Long getIdErrorAplicacion() {
        return idErrorAplicacion;
    }

    public void setIdErrorAplicacion(Long idErrorAplicacion) {
        this.idErrorAplicacion = idErrorAplicacion;
    }

   

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

   

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idErrorAplicacion != null ? idErrorAplicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ErrorAplicacion)) {
            return false;
        }
        ErrorAplicacion other = (ErrorAplicacion) object;
        if ((this.idErrorAplicacion == null && other.idErrorAplicacion != null) || (this.idErrorAplicacion != null && !this.idErrorAplicacion.equals(other.idErrorAplicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ErrorAplicacion[ idErroresAplicacion=" + idErrorAplicacion + " ]";
    }
    
}
