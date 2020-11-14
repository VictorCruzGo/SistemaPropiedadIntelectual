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
import org.gob.snp.entidades.vistas.TipoRecibo;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "DosificacionTasa")
public class DosificacionTasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDosificacionTasa")
    private Long idDosificacionTasa;

    @JoinColumn(name = "IdRegional", referencedColumnName = "IdRegional")
    @ManyToOne(optional = false)
    private Regional regional;

    @JoinColumn(name = "IdDosificacion", referencedColumnName = "IdDosificacion")
    @ManyToOne(optional = false)
    private Dosificacion dosificacion;

    @JoinColumn(name = "IdTasa", referencedColumnName = "IdTasa")
    @ManyToOne(optional = false)
    private Tasa tasa;

    @Column(name = "Vigente")
    private Boolean vigente;

    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Usuario")
    private BigInteger usuario;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    @Column(name = "Serie")
    private String serie;

    @ManyToOne
    @JoinColumn(name = "TipoRecibo", referencedColumnName = "Codigo")
    private TipoRecibo tipoRecibo;

    public DosificacionTasa() {
    }

    public DosificacionTasa(Long idDosificacionTasa) {
        this.idDosificacionTasa = idDosificacionTasa;
    }

    public Long getIdDosificacionTasa() {
        return idDosificacionTasa;
    }

    public void setIdDosificacionTasa(Long idDosificacionTasa) {
        this.idDosificacionTasa = idDosificacionTasa;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigInteger getUsuario() {
        return usuario;
    }

    public void setUsuario(BigInteger usuario) {
        this.usuario = usuario;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public Dosificacion getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(Dosificacion dosificacion) {
        this.dosificacion = dosificacion;
    }

    public Tasa getTasa() {
        return tasa;
    }

    public void setTasa(Tasa tasa) {
        this.tasa = tasa;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public TipoRecibo getTipoRecibo() {
        return tipoRecibo;
    }

    public void setTipoRecibo(TipoRecibo tipoRecibo) {
        this.tipoRecibo = tipoRecibo;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDosificacionTasa != null ? idDosificacionTasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DosificacionTasa)) {
            return false;
        }
        DosificacionTasa other = (DosificacionTasa) object;
        if ((this.idDosificacionTasa == null && other.idDosificacionTasa != null) || (this.idDosificacionTasa != null && !this.idDosificacionTasa.equals(other.idDosificacionTasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.DosificacionTasa[ idDosificacionTasa=" + idDosificacionTasa + " ]";
    }

}
