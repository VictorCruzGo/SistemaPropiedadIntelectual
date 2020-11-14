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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.gob.snp.entidades.vistas.TipoElementoHtml;

/**
 *
 * @author roco
 */
@Entity
@Table(name = "ElementoFormularioTramite")
public class ElementoFormularioTramite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdElementoFormularioTramite")
    private Long idElementoFormularioTramite;
        
    @ManyToOne(optional = false)
    @JoinColumn(name = "IdFormularioTramite", referencedColumnName = "IdFormularioTramite")
    private FormularioTramite formularioTramite;
    
    @Column(name = "Pestania")
    private String pestania;
    
    @Column(name = "Seccion")
    private Integer seccion;

    
    @ManyToOne
    @JoinColumn(name = "TipoElemento", referencedColumnName = "Codigo")
    private TipoElementoHtml tipoElemento;
    
    @Lob
    @Column(name = "NombreElemento")
    private String nombreElemento;
    
    @Column(name = "Orden")
    private Integer orden;
    
    @Column(name = "IdPadre")
    private Long idPadre;
    
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @Column(name = "Vigente")
    private Boolean vigente;
    
    @Column(name = "Usuario")
    private Long usuario;
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    

    public ElementoFormularioTramite() {
    }

    public ElementoFormularioTramite(Long idElementoFormularioTramite) {
        this.idElementoFormularioTramite = idElementoFormularioTramite;
    }

    public Long getIdElementoFormularioTramite() {
        return idElementoFormularioTramite;
    }

    public void setIdElementoFormularioTramite(Long idElementoFormularioTramite) {
        this.idElementoFormularioTramite = idElementoFormularioTramite;
    }

    public String getPestania() {
        return pestania;
    }

    public void setPestania(String pestania) {
        this.pestania = pestania;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

    public String getNombreElemento() {
        return nombreElemento;
    }

    public void setNombreElemento(String nombreElemento) {
        this.nombreElemento = nombreElemento;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
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

    public FormularioTramite getFormularioTramite() {
        return formularioTramite;
    }

    public void setFormularioTramite(FormularioTramite formularioTramite) {
        this.formularioTramite = formularioTramite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idElementoFormularioTramite != null ? idElementoFormularioTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElementoFormularioTramite)) {
            return false;
        }
        ElementoFormularioTramite other = (ElementoFormularioTramite) object;
        if ((this.idElementoFormularioTramite == null && other.idElementoFormularioTramite != null) || (this.idElementoFormularioTramite != null && !this.idElementoFormularioTramite.equals(other.idElementoFormularioTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ElementoFormularioTramite[ idElementoFormularioTramite=" + idElementoFormularioTramite + " ]";
    }

    public TipoElementoHtml getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoElementoHtml tipoElementoHtml) {
        this.tipoElemento = tipoElementoHtml;
    }        
}
