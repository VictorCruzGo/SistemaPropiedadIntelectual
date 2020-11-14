/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author roco
 */
@Entity
@Table(name = "FormularioTramite")
public class FormularioTramite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdFormularioTramite")
    private Long idFormularioTramite;
    
    @ManyToOne
    @JoinColumn(name = "IdFlujoEtapa", referencedColumnName = "IdFlujoEtapa")
    private FlujoEtapa flujoEtapa;
        
    @Column(name = "Codigo")
    private String codigo;
    
    @Column(name = "NombreFormulario")
    private String nombreFormulario;
    
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @Column(name = "Vigente")
    private Boolean vigente;
    
    @Column(name = "Usuario")
    private BigInteger usuario;
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
 
    public FormularioTramite() {
    }

    public FormularioTramite(Long idFormularioTramite) {
        this.idFormularioTramite = idFormularioTramite;
    }

    public Long getIdFormularioTramite() {
        return idFormularioTramite;
    }

    public void setIdFormularioTramite(Long idFormularioTramite) {
        this.idFormularioTramite = idFormularioTramite;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreFormulario() {
        return nombreFormulario;
    }

    public void setNombreFormulario(String nombreFormulario) {
        this.nombreFormulario = nombreFormulario;
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

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
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

    public FlujoEtapa getFlujoEtapa() {
        return flujoEtapa;
    }

    public void setFlujoEtapa(FlujoEtapa flujoEtapa) {
        this.flujoEtapa = flujoEtapa;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormularioTramite != null ? idFormularioTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormularioTramite)) {
            return false;
        }
        FormularioTramite other = (FormularioTramite) object;
        if ((this.idFormularioTramite == null && other.idFormularioTramite != null) || (this.idFormularioTramite != null && !this.idFormularioTramite.equals(other.idFormularioTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.FormularioTramite[ idFormularioTramite=" + idFormularioTramite + " ]";
    }
    
}
