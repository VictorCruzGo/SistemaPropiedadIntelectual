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
import org.gob.snp.entidades.vistas.EstadoEtapa;

/**
 *
 * @author chano, Roco
 */
@Entity
@Table(name = "AnalisisEtapa")
public class AnalisisEtapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdAnalisisEtapa")
    private Long idAnalisisEtapa;

    @ManyToOne
    @JoinColumn(name = "IdTramiteFlujoEtapa", referencedColumnName = "IdTramiteFlujoEtapa")
    private TramiteFlujoEtapa tramiteFlujoEtapa;

    @ManyToOne
    @JoinColumn(name = "EstadoEtapa", referencedColumnName = "Codigo")
    private EstadoEtapa estadoEtapa;

    @Column(name = "Titulo")
    private String titulo;
    @Lob
    @Column(name = "Pie")
    private String pie;
    @Column(name = "CodigoTramite")
    private String codigoTramite;
    @Column(name = "NombreTramite")
    private String nombreTramite;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "Plazo")
    private Integer plazo;

    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public AnalisisEtapa() {
    }

    public AnalisisEtapa(Long idAnalisisEtapa) {
        this.idAnalisisEtapa = idAnalisisEtapa;
    }

    public Long getIdAnalisisEtapa() {
        return idAnalisisEtapa;
    }

    public void setIdAnalisisEtapa(Long idAnalisisEtapa) {
        this.idAnalisisEtapa = idAnalisisEtapa;
    }

    public TramiteFlujoEtapa getTramiteFlujoEtapa() {
        return tramiteFlujoEtapa;
    }

    public void setTramiteFlujoEtapa(TramiteFlujoEtapa tramiteFlujoEtapa) {
        this.tramiteFlujoEtapa = tramiteFlujoEtapa;
    }

    public EstadoEtapa getEstadoEtapa() {
        return estadoEtapa;
    }

    public void setEstadoEtapa(EstadoEtapa estadoEtapa) {
        this.estadoEtapa = estadoEtapa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public String getCodigoTramite() {
        return codigoTramite;
    }

    public void setCodigoTramite(String codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
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
        hash += (idAnalisisEtapa != null ? idAnalisisEtapa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalisisEtapa)) {
            return false;
        }
        AnalisisEtapa other = (AnalisisEtapa) object;
        if ((this.idAnalisisEtapa == null && other.idAnalisisEtapa != null) || (this.idAnalisisEtapa != null && !this.idAnalisisEtapa.equals(other.idAnalisisEtapa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.AnalisisEtapa[ idAnalisisEtapa=" + idAnalisisEtapa + " ]";
    }

}
