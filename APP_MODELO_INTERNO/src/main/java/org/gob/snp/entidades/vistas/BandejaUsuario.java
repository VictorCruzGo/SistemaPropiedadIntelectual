/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades.vistas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jonathanvaldivia
 */
@Entity
@Table(name = "bandeja_usuario")
public class BandejaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdExpediente")
    private long idExpediente;
    @Id
    @Basic(optional = false)
    @Column(name = "IdTramite")
    private long idTramite;
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private long idUsuario;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "EstadoProceso")
    private String estadoProceso;
    @Column(name = "NombreSolicitud")
    private String nombreSolicitud;
    @Column(name = "Tramite")
    private String tramite;
    @Column(name = "FechaAsignacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignacion;
    @Column(name = "DiasHabiles")
    private Integer diasHabiles;
    @Column(name = "Total")
    private Integer total;
    @Column(name = "Posicion")
    private Integer posicion;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name = "TipoTramite", referencedColumnName = "codigo")
    private TipoTramite tipoTramite;
    @ManyToOne
    @JoinColumn(name = "EtapaTramite", referencedColumnName = "codigo")
    private EtapaTramite etapaTramite;
    
    @Column(name = "Observacion")
    private String observacion;
    
    public BandejaUsuario() {
    }

    public long getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(long idExpediente) {
        this.idExpediente = idExpediente;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public EtapaTramite getEtapaTramite() {
        return etapaTramite;
    }

    public void setEtapaTramite(EtapaTramite etapaTramite) {
        this.etapaTramite = etapaTramite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }    

    public Integer getDiasHabiles() {
        return diasHabiles;
    }

    public void setDiasHabiles(Integer diasHabiles) {
        this.diasHabiles = diasHabiles;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(long idTramite) {
        this.idTramite = idTramite;
    }        

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
