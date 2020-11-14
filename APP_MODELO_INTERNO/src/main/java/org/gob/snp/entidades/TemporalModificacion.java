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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mapeo de la Entidad a persistir Tabla TemporalModificacion
 * @author Susana Escobar Paz
 * @see TemporalModificacion
 * @see TemporalModificacionService
 * @version 1.0, 20/01/2015
 * <pre>
 * 
 * </pre>
 */

@Entity
@Table(name = "TemporalModificacion")
//@NamedQueries({
  //  @NamedQuery(name = "TemporalModificacion.findAll", query = "SELECT t FROM TemporalModificacion t")})
public class TemporalModificacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTemporalModificacion")
    private Long idTemporalModificacion;
     @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = true)
    private Tramite tramite;
    @Column(name = "NombreTabla")
    private String nombreTabla;
    @Column(name = "IdTabla")
    private Long idTabla;
    @Basic(optional = false)
    @Column(name = "CampoTabla")
    private String campoTabla;
    @Column(name = "DatoCampo")
    private String datoCampo;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public TemporalModificacion() {
    }

    public TemporalModificacion(Long idTemporalModificacion) {
        this.idTemporalModificacion = idTemporalModificacion;
    }

    public TemporalModificacion(Long idTemporalModificacion, String campoTabla) {
        this.idTemporalModificacion = idTemporalModificacion;
        this.campoTabla = campoTabla;
    }

    public Long getIdTemporalModificacion() {
        return idTemporalModificacion;
    }

    public void setIdTemporalModificacion(Long idTemporalModificacion) {
        this.idTemporalModificacion = idTemporalModificacion;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public Long getIdTabla() {
        return idTabla;
    }

    public void setIdTabla(Long idTabla) {
        this.idTabla = idTabla;
    }

    

    public String getCampoTabla() {
        return campoTabla;
    }

    public void setCampoTabla(String campoTabla) {
        this.campoTabla = campoTabla;
    }

    public String getDatoCampo() {
        return datoCampo;
    }

    public void setDatoCampo(String datoCampo) {
        this.datoCampo = datoCampo;
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
        hash += (idTemporalModificacion != null ? idTemporalModificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemporalModificacion)) {
            return false;
        }
        TemporalModificacion other = (TemporalModificacion) object;
        if ((this.idTemporalModificacion == null && other.idTemporalModificacion != null) || (this.idTemporalModificacion != null && !this.idTemporalModificacion.equals(other.idTemporalModificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.TemporalModificacion[ idTemporalModificacion=" + idTemporalModificacion + " ]";
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
    
}
