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
 *
 * Entidad responsable del mapeo de la tabla MensajeAplicacion
 *
 * @author Eddy Valero
 * @version 1.0 18/11/2014
 *
 */
@Entity
@Table(name = "MensajeAplicacion")
public class MensajeAplicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdMensajeAplicacion")
    private Long idMensajeAplicacion;
    @Column(name="Orden")
    private int orden;
    @Column(name="Idioma")
    private String idioma;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "Estado")
    private String estado;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "Usuario")
    private Long usuario;

    @JoinColumn(name = "IdModulo", referencedColumnName = "IdModulo")
    @ManyToOne(optional = false)
    private Modulo modulo;

    public MensajeAplicacion() {
    }

    public MensajeAplicacion(Long idMensajeAplicacion) {
        this.idMensajeAplicacion = idMensajeAplicacion;
    }

    public MensajeAplicacion(Long idMensajeAplicacion, String descripcion, String estado) {
        this.idMensajeAplicacion = idMensajeAplicacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Long getIdMensajeAplicacion() {
        return idMensajeAplicacion;
    }

    public void setIdMensajeAplicacion(Long idMensajeAplicacion) {
        this.idMensajeAplicacion = idMensajeAplicacion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMensajeAplicacion != null ? idMensajeAplicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MensajeAplicacion)) {
            return false;
        }
        MensajeAplicacion other = (MensajeAplicacion) object;
        if ((this.idMensajeAplicacion == null && other.idMensajeAplicacion != null) || (this.idMensajeAplicacion != null && !this.idMensajeAplicacion.equals(other.idMensajeAplicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.MensajeAplicacion[ idMensajeAplicacion=" + idMensajeAplicacion + " ]";
    }

}
