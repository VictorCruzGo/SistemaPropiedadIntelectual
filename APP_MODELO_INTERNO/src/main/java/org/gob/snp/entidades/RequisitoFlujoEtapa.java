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
import org.gob.snp.entidades.vistas.TipoRespuestaRequisito;

/**
 * @author Jonathan Valdivia
 */
@Entity
@Table(name = "RequisitoFlujoEtapa")
public class RequisitoFlujoEtapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRequisitoFlujoEtapa")
    private Long idRequisitoFlujoEtapa;
    @Lob
    @Column(name = "Requisito")
    private String requisito;
    @Column(name = "Pestania")
    private String pestania;
    @Column(name = "Seccion")
    private String seccion;
    @Column(name = "SubSeccion")
    private String subSeccion;
    @Column(name = "Orden")
    private Integer orden;
    @ManyToOne
    @JoinColumn(name = "TipoRequisito", referencedColumnName = "Codigo")
    private TipoRequisito tipoRequisito;
    @ManyToOne
    @JoinColumn(name = "TipoRespuestaRequisito", referencedColumnName = "Codigo")
    private TipoRespuestaRequisito tipoRespuestaRequisito;
    @Column(name = "Valor")
    private String valor;
    @Column(name = "TieneDetalle")
    private Boolean tieneDetalle;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Vigente")
    private Boolean vigente;
    @JoinColumn(name = "IdAnalisisEtapa", referencedColumnName = "IdAnalisisEtapa")
    @ManyToOne(optional = false)
    private AnalisisEtapa analisisEtapa;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public RequisitoFlujoEtapa() {
    }

    public RequisitoFlujoEtapa(Long idRequisitoFlujoEtapa) {
        this.idRequisitoFlujoEtapa = idRequisitoFlujoEtapa;
    }

    public Long getIdRequisitoFlujoEtapa() {
        return idRequisitoFlujoEtapa;
    }

    public void setIdRequisitoFlujoEtapa(Long idRequisitoFlujoEtapa) {
        this.idRequisitoFlujoEtapa = idRequisitoFlujoEtapa;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public String getPestania() {
        return pestania;
    }

    public void setPestania(String pestania) {
        this.pestania = pestania;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSubSeccion() {
        return subSeccion;
    }

    public void setSubSeccion(String subSeccion) {
        this.subSeccion = subSeccion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean getTieneDetalle() {
        return tieneDetalle;
    }

    public void setTieneDetalle(Boolean tieneDetalle) {
        this.tieneDetalle = tieneDetalle;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
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
        hash += (idRequisitoFlujoEtapa != null ? idRequisitoFlujoEtapa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequisitoFlujoEtapa)) {
            return false;
        }
        RequisitoFlujoEtapa other = (RequisitoFlujoEtapa) object;
        if ((this.idRequisitoFlujoEtapa == null && other.idRequisitoFlujoEtapa != null) || (this.idRequisitoFlujoEtapa != null && !this.idRequisitoFlujoEtapa.equals(other.idRequisitoFlujoEtapa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.RequisitoFlujoEtapa[ idRequisitoFlujoEtapa=" + idRequisitoFlujoEtapa + " ]";
    }

    public TipoRequisito getTipoRequisito() {
        return tipoRequisito;
    }

    public void setTipoRequisito(TipoRequisito tipoRequisito) {
        this.tipoRequisito = tipoRequisito;
    }

    public TipoRespuestaRequisito getTipoRespuestaRequisito() {
        return tipoRespuestaRequisito;
    }

    public void setTipoRespuestaRequisito(TipoRespuestaRequisito tipoRespuestaRequisito) {
        this.tipoRespuestaRequisito = tipoRespuestaRequisito;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

}
