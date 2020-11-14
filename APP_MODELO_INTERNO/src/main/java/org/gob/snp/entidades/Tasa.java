/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
import org.gob.snp.entidades.vistas.TipoRecibo;
import org.gob.snp.entidades.vistas.TipoTasa;
import org.gob.snp.entidades.vistas.TipoTramite;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "Tasa")
public class Tasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTasa")
    private Long idTasa;

    @ManyToOne
    @JoinColumn(name = "TipoTramite", referencedColumnName = "Codigo")
    private TipoTramite tipoTramite;
    
    @ManyToOne
    @JoinColumn(name = "TipoRecibo", referencedColumnName = "Codigo")
    private TipoRecibo tipoRecibo;
    
    @ManyToOne
    @JoinColumn(name = "TipoTasa", referencedColumnName = "Codigo")
    private TipoTasa tipoTasa;

    @Column(name = "Costo")
    private BigDecimal costo;

    @Column(name = "Vigente")
    private Boolean vigente;

    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Descuento")
    private Integer descuento;

    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Tasa() {
    }

    public Tasa(Long idTasa) {
        this.idTasa = idTasa;
    }

    public Long getIdTasa() {
        return idTasa;
    }

    public void setIdTasa(Long idTasa) {
        this.idTasa = idTasa;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
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

    public TipoRecibo getTipoRecibo() {
        return tipoRecibo;
    }

    public void setTipoRecibo(TipoRecibo tipoRecibo) {
        this.tipoRecibo = tipoRecibo;
    }

    public TipoTasa getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(TipoTasa tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTasa != null ? idTasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tasa)) {
            return false;
        }
        Tasa other = (Tasa) object;
        if ((this.idTasa == null && other.idTasa != null) || (this.idTasa != null && !this.idTasa.equals(other.idTasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Tasa[ idTasa=" + idTasa + " ]";
    }

}
