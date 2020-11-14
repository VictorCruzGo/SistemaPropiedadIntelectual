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
 * Entidad que refiere a la Tabla RequisitoFlujoEtapaPlantilla
 *
 * @version 1.0, 01/09/2014
 * @author Eddy Valero
 */
@Entity
@Table(name = "RequisitoFlujoEtapaPlantilla")
public class RequisitoFlujoEtapaPlantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRequisitoFlujoEtapaPlantilla")
    private Long idRequisitoFlujoEtapaPlantilla;
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
    @JoinColumn(name = "tipoRespuestaRequisito", referencedColumnName = "Codigo")
    private TipoRespuestaRequisito tipoRespuestaRequisito;
    @Column(name = "TieneDetalle")
    private Boolean tieneDetalle;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "IdRequisitoFlujoEtapaPlantillaPadre")
    private Long idRequisitoFlujoEtapaPlantillaPadre;
    @JoinColumn(name = "IdFlujoEtapa", referencedColumnName = "IdFlujoEtapa")
    @ManyToOne(optional = false)
    private FlujoEtapa flujoEtapa;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public RequisitoFlujoEtapaPlantilla() {
    }

    public RequisitoFlujoEtapaPlantilla(Long idRequisitoFlujoEtapaPlantilla) {
        this.idRequisitoFlujoEtapaPlantilla = idRequisitoFlujoEtapaPlantilla;
    }

    public Long getIdRequisitoFlujoEtapaPlantilla() {
        return idRequisitoFlujoEtapaPlantilla;
    }

    public void setIdRequisitoFlujoEtapaPlantilla(Long idRequisitoFlujoEtapaPlantilla) {
        this.idRequisitoFlujoEtapaPlantilla = idRequisitoFlujoEtapaPlantilla;
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

    public Boolean getTieneDetalle() {
        return tieneDetalle;
    }

    public void setTieneDetalle(Boolean tieneDetalle) {
        this.tieneDetalle = tieneDetalle;
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



    public FlujoEtapa getFlujoEtapa() {
        return flujoEtapa;
    }

    public void setFlujoEtapa(FlujoEtapa flujoEtapa) {
        this.flujoEtapa = flujoEtapa;
    }

    public Long getIdRequisitoFlujoEtapaPlantillaPadre() {
        return idRequisitoFlujoEtapaPlantillaPadre;
    }

    public void setIdRequisitoFlujoEtapaPlantillaPadre(Long idRequisitoFlujoEtapaPlantillaPadre) {
        this.idRequisitoFlujoEtapaPlantillaPadre = idRequisitoFlujoEtapaPlantillaPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRequisitoFlujoEtapaPlantilla != null ? idRequisitoFlujoEtapaPlantilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequisitoFlujoEtapaPlantilla)) {
            return false;
        }
        RequisitoFlujoEtapaPlantilla other = (RequisitoFlujoEtapaPlantilla) object;
        if ((this.idRequisitoFlujoEtapaPlantilla == null && other.idRequisitoFlujoEtapaPlantilla != null) || (this.idRequisitoFlujoEtapaPlantilla != null && !this.idRequisitoFlujoEtapaPlantilla.equals(other.idRequisitoFlujoEtapaPlantilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.RequisitoFlujoEtapaPlantilla[ idRequisitoFlujoEtapaPlantilla=" + idRequisitoFlujoEtapaPlantilla + " ]";
    }

}
