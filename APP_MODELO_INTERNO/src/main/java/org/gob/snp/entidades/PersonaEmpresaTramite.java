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
import org.gob.snp.entidades.vistas.TipoPersonaSolicitud;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "PersonaEmpresaTramite")

public class PersonaEmpresaTramite implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPersonaSolicitud")
    private Long idPersonaSolicitud;
    @ManyToOne
    @JoinColumn(name = "TipoPersonaSolicitud", referencedColumnName = "Codigo")
    private TipoPersonaSolicitud tipoPersonaSolicitud;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Vigente")
    private Boolean vigente;
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private Tramite tramite;
    @JoinColumn(name = "IdPersona", referencedColumnName = "IdPersona")
    @ManyToOne(optional = true)
    private Persona persona;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "IdEmpresa")
    @ManyToOne(optional = true)
    private Empresa empresa;
    @JoinColumn(name = "IdPoder", referencedColumnName = "IdPoder")
    @ManyToOne(optional = true)
    private Poder poder;

    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public PersonaEmpresaTramite() {
    }

    public PersonaEmpresaTramite(Long idPersonaSolicitud) {
        this.idPersonaSolicitud = idPersonaSolicitud;
    }

    public Long getIdPersonaSolicitud() {
        return idPersonaSolicitud;
    }

    public void setIdPersonaSolicitud(Long idPersonaSolicitud) {
        this.idPersonaSolicitud = idPersonaSolicitud;
    }

    public TipoPersonaSolicitud getTipoPersonaSolicitud() {
        return tipoPersonaSolicitud;
    }

    public void setTipoPersonaSolicitud(TipoPersonaSolicitud tipoPersonaSolicitud) {
        this.tipoPersonaSolicitud = tipoPersonaSolicitud;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(Long usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }
    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder apoderado) {
        this.poder = apoderado;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonaSolicitud != null ? idPersonaSolicitud.hashCode() : 0);
        return hash;
    }

       @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
    
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaEmpresaTramite)) {
            return false;
        }
        PersonaEmpresaTramite other = (PersonaEmpresaTramite) object;
        if ((this.idPersonaSolicitud == null && other.idPersonaSolicitud != null) || (this.idPersonaSolicitud != null && !this.idPersonaSolicitud.equals(other.idPersonaSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.PersonaEmpresaTramite[ idPersonaSolicitud=" + idPersonaSolicitud + " ]";
    }

}
