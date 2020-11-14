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
import org.gob.snp.entidades.vistas.AreaTramite;
import org.gob.snp.entidades.vistas.EstadoEtapa;
import org.gob.snp.entidades.vistas.TipoTramite;

/**
 *
 * @author eddyvalero
 */
@Entity
@Table(name = "Flujo")
public class Flujo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdFlujo")
    private Long idFlujo;
    @Column(name = "NombreFlujo")
    private String nombreFlujo;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
   
    @ManyToOne
    @JoinColumn(name = "AreaTramite", referencedColumnName = "Codigo")
    private AreaTramite areaTramite;
    
    @ManyToOne
    @JoinColumn(name = "TipoTramite", referencedColumnName = "Codigo")
    private TipoTramite tipoTramite;
   
    
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Flujo() {
    }

    public Flujo(Long idFlujo) {
        this.idFlujo = idFlujo;
    }

    public Long getIdFlujo() {
        return idFlujo;
    }

    public void setIdFlujo(Long idFlujo) {
        this.idFlujo = idFlujo;
    }

    public String getNombreFlujo() {
        return nombreFlujo;
    }

    public void setNombreFlujo(String nombreFlujo) {
        this.nombreFlujo = nombreFlujo;
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

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFlujo != null ? idFlujo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Flujo)) {
            return false;
        }
        Flujo other = (Flujo) object;
        if ((this.idFlujo == null && other.idFlujo != null) || (this.idFlujo != null && !this.idFlujo.equals(other.idFlujo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Flujo[ idFlujo=" + idFlujo + " ]";
    }

    public AreaTramite getAreaTramite() {
        return areaTramite;
    }

    public void setAreaTramite(AreaTramite areaTramite) {
        this.areaTramite = areaTramite;
    }

    
    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

}
