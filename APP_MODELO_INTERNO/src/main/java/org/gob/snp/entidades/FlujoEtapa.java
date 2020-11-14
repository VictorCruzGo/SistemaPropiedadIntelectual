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
import org.gob.snp.entidades.vistas.EstadoEtapa;
import org.gob.snp.entidades.vistas.EtapaTramite;

/**
 * Entidad que refiere a la Tabla FlujoEtapa
 *
 * @version 1.0, 01/09/2014
 * @author Eddy Valero
 * @author Jonathan Valdivia Ramos
 * 
 */
@Entity
@Table(name = "FlujoEtapa")
public class FlujoEtapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "IdFlujoEtapa")
    private Long idFlujoEtapa;

    @JoinColumn(name = "IdFlujo", referencedColumnName = "IdFlujo")
    @ManyToOne(optional = false)
    private Flujo flujo;

    @JoinColumn(name = "IdRol", referencedColumnName = "IdRol")
    @ManyToOne(optional = false)
    private Rol rol;
    
    @Column(name = "Orden")
    private Integer orden;

    @JoinColumn(name = "EtapaTramite", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private EtapaTramite etapaTramite;
    
    @Column(name = "Plazo")
    private Integer plazo;

    @Column(name = "UnidadTiempo")
    private String unidadTiempo;

    @Column(name = "Vigente")
    private Boolean vigente;
    
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Pie")
    private String pie;

    @Column(name = "CodigoTramite")
    private String codigoTramite;

    @Column(name = "NombreTramite")
    private String nombreTramite;
       
    @Column(name = "Padre")
    private Long padre;  

    @JoinColumn(name = "EstadoEtapa", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private EstadoEtapa estadoEtapa;

    @Column(name = "Revision")
    private Boolean revision;
    
    @Column(name = "CrearNuevoAnalisis")
    private Boolean crearNuevoAnalisis;
        
    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public FlujoEtapa() {
    }

    public FlujoEtapa(Long idFlujoEtapa) {
        this.idFlujoEtapa = idFlujoEtapa;
    }

    public Long getIdFlujoEtapa() {
        return idFlujoEtapa;
    }

    public void setIdFlujoEtapa(Long idFlujoEtapa) {
        this.idFlujoEtapa = idFlujoEtapa;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public EtapaTramite getEtapaTramite() {
        return etapaTramite;
    }

    public void setEtapaTramite(EtapaTramite etapaTramite) {
        this.etapaTramite = etapaTramite;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public String getUnidadTiempo() {
        return unidadTiempo;
    }

    public void setUnidadTiempo(String unidadTiempo) {
        this.unidadTiempo = unidadTiempo;
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

    public Flujo getFlujo() {
        return flujo;
    }

    public void setFlujo(Flujo flujo) {
        this.flujo = flujo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public Long getPadre() {
        return padre;
    }

    public void setPadre(Long padre) {
        this.padre = padre;
    }
       
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFlujoEtapa != null ? idFlujoEtapa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlujoEtapa)) {
            return false;
        }
        FlujoEtapa other = (FlujoEtapa) object;
        if ((this.idFlujoEtapa == null && other.idFlujoEtapa != null) || (this.idFlujoEtapa != null && !this.idFlujoEtapa.equals(other.idFlujoEtapa))) {
            return false;
        }
        return true; 
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.FlujoEtapa[ idFlujoEtapa=" + idFlujoEtapa + " ]";
    }

    public EstadoEtapa getEstadoEtapa() {
        return estadoEtapa;
    }

    public void setEstadoEtapa(EstadoEtapa estadoEtapa) {
        this.estadoEtapa = estadoEtapa;
    }

    public Boolean getRevision() {
        return revision;
    }

    public void setRevision(Boolean revision) {
        this.revision = revision;
    }

    public Boolean getCrearNuevoAnalisis() {
        return crearNuevoAnalisis;
    }

    public void setCrearNuevoAnalisis(Boolean crearNuevoAnalisis) {
        this.crearNuevoAnalisis = crearNuevoAnalisis;
    }
    
}
