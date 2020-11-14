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
import org.gob.snp.entidades.vistas.TipoRequisito;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "RequisitoFlujoVentanillaEForma")
public class RequisitoFlujoVentanillaEForma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRequisitoFlujoVentanillaEForma")
    private Long idRequisitoFlujoVentanillaEForma;
    @Column(name = "Codigo")
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "IdFlujoEtapa", referencedColumnName = "IdFlujoEtapa")
    private FlujoEtapa flujoEtapa;
    @Column(name = "TipoGenero")
    private String tipoGenero;
    @ManyToOne
    @JoinColumn(name = "TipoRequisito", referencedColumnName = "Codigo")
    private TipoRequisito TipoRequisito;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Posicion")
    private Integer posicion;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Dominio")
    private String dominio;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public RequisitoFlujoVentanillaEForma() {
    }

    public RequisitoFlujoVentanillaEForma(Long idRequisitoFlujoVentanillaEForma) {
        this.idRequisitoFlujoVentanillaEForma = idRequisitoFlujoVentanillaEForma;
    }

    public Long getIdRequisitoFlujoVentanillaEForma() {
        return idRequisitoFlujoVentanillaEForma;
    }

    public void setIdRequisitoFlujoVentanillaEForma(Long idRequisitoFlujoVentanillaEForma) {
        this.idRequisitoFlujoVentanillaEForma = idRequisitoFlujoVentanillaEForma;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public FlujoEtapa getFlujoEtapa() {
        return flujoEtapa;
    }

    public void setFlujoEtapa(FlujoEtapa flujoEtapa) {
        this.flujoEtapa = flujoEtapa;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public TipoRequisito getTipoRequisito() {
        return TipoRequisito;
    }

    public void setTipoRequisito(TipoRequisito TipoRequisito) {
        this.TipoRequisito = TipoRequisito;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
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
        hash += (idRequisitoFlujoVentanillaEForma != null ? idRequisitoFlujoVentanillaEForma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequisitoFlujoVentanillaEForma)) {
            return false;
        }
        RequisitoFlujoVentanillaEForma other = (RequisitoFlujoVentanillaEForma) object;
        if ((this.idRequisitoFlujoVentanillaEForma == null && other.idRequisitoFlujoVentanillaEForma != null) || (this.idRequisitoFlujoVentanillaEForma != null && !this.idRequisitoFlujoVentanillaEForma.equals(other.idRequisitoFlujoVentanillaEForma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.RequisitoFlujoVentanillaEForma[ idRequisitoFlujoVentanillaEForma=" + idRequisitoFlujoVentanillaEForma + " ]";
    }

}
