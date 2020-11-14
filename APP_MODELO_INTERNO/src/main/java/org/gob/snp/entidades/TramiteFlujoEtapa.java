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
import org.gob.snp.entidades.vistas.EstadoTarea;
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.TipoAsignacion;
import org.gob.snp.entidades.vistas.TipoRevision;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "TramiteFlujoEtapa")

public class TramiteFlujoEtapa implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTramiteFlujoEtapa")
    private Long idTramiteFlujoEtapa;

    @JoinColumn(name = "TipoAsignacion", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private TipoAsignacion tipoAsignacion;

    @JoinColumn(name = "EstadoTarea", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private EstadoTarea estadoTarea;

    @Column(name = "FechaAsignacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;

    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @Column(name = "NumeroIngreso")
    private Integer numeroIngreso;

    @JoinColumn(name = "EtapaTramite", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private EtapaTramite etapaTramite;

    @Column(name = "CodigoDia")
    private String codigoDia;
    @Column(name = "UltimaHoraIniciada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaHoraIniciada;
    @Column(name = "TiempoTotal")
    private String tiempoTotal;
    @Column(name = "VecesRevision")
    private Integer vecesRevision;
    @Column(name = "Observacion")
    private String observacion;

    @JoinColumn(name = "TipoRevision", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private TipoRevision tipoRevision;
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "Usuario")
    private Long usuarioModificador;

    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private Tramite tramite;

    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public TramiteFlujoEtapa() {
    }

    public TramiteFlujoEtapa(Long idTramiteFlujoEtapa) {
        this.idTramiteFlujoEtapa = idTramiteFlujoEtapa;
    }

    public Long getIdTramiteFlujoEtapa() {
        return idTramiteFlujoEtapa;
    }

    public void setIdTramiteFlujoEtapa(Long idTramiteFlujoEtapa) {
        this.idTramiteFlujoEtapa = idTramiteFlujoEtapa;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
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

    public Integer getNumeroIngreso() {
        return numeroIngreso;
    }

    public void setNumeroIngreso(Integer numeroIngreso) {
        this.numeroIngreso = numeroIngreso;
    }

    public String getCodigoDia() {
        return codigoDia;
    }

    public void setCodigoDia(String codigoDia) {
        this.codigoDia = codigoDia;
    }

    public Date getUltimaHoraIniciada() {
        return ultimaHoraIniciada;
    }

    public void setUltimaHoraIniciada(Date ultimaHoraIniciada) {
        this.ultimaHoraIniciada = ultimaHoraIniciada;
    }

    public String getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(String tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public Integer getVecesRevision() {
        return vecesRevision;
    }

    public void setVecesRevision(Integer vecesRevision) {
        this.vecesRevision = vecesRevision;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public TipoRevision getTipoRevision() {
        return tipoRevision;
    }

    public void setTipoRevision(TipoRevision tipoRevision) {
        this.tipoRevision = tipoRevision;
    }

 

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public TipoAsignacion getTipoAsignacion() {
        return tipoAsignacion;
    }

    public void setTipoAsignacion(TipoAsignacion tipoAsignacion) {
        this.tipoAsignacion = tipoAsignacion;
    }

    public EstadoTarea getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(EstadoTarea estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public EtapaTramite getEtapaTramite() {
        return etapaTramite;
    }

    public void setEtapaTramite(EtapaTramite etapaTramite) {
        this.etapaTramite = etapaTramite;
    }

    public Long getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(Long usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    
    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTramiteFlujoEtapa != null ? idTramiteFlujoEtapa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TramiteFlujoEtapa)) {
            return false;
        }
        TramiteFlujoEtapa other = (TramiteFlujoEtapa) object;
        if ((this.idTramiteFlujoEtapa == null && other.idTramiteFlujoEtapa != null) || (this.idTramiteFlujoEtapa != null && !this.idTramiteFlujoEtapa.equals(other.idTramiteFlujoEtapa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.TramiteFlujoEtapa[ idTramiteFlujoEtapa=" + idTramiteFlujoEtapa + " ]";
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
    
    
}
