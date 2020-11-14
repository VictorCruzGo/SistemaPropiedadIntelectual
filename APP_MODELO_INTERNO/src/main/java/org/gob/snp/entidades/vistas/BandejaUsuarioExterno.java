/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades.vistas;

import java.io.Serializable;
import java.math.BigInteger;
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
import org.gob.snp.entidades.Tramite;

/**
 *
 * @author chano
 */
@Entity
    @Table(name = "bandeja_usuario_externo")
public class BandejaUsuarioExterno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdExpediente")
    private long idExpediente;
    
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private long idUsuario;
    
 @Id
    @Basic(optional = false)
    @Column(name = "tramite")
    private String tramite;
    
    
//    @Basic(optional = false)
//    @Column(name = "IdTramite")
//    private long idTramite;
    
    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramiteObjeto;
    
    
    @Column(name = "CodigoDia")
    private String codigoDia;
    
    @Column(name = "Correlativo")
    private Long correlativo;
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @ManyToOne
    @JoinColumn(name = "TipoTramite", referencedColumnName = "Codigo")
    private TipoTramite tipoTramite;
    @ManyToOne
    @JoinColumn(name = "EtapaTramite", referencedColumnName = "Codigo")
    private EtapaTramite etapaTramite;
    @ManyToOne
    @JoinColumn(name = "codigo", referencedColumnName = "Codigo")
    private TipoSolicitud tipoSolicitud;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "EstadoProceso")
    private String estadoProceso;
    @Column(name = "NombreSolicitud")
    private String nombreSolicitud;

    public BandejaUsuarioExterno() {
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

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public Tramite getTramiteObjeto() {
        return tramiteObjeto;
    }

    public void setTramiteObjeto(Tramite tramiteObjeto) {
        this.tramiteObjeto = tramiteObjeto;
    }

    public String getCodigoDia() {
        return codigoDia;
    }

    public void setCodigoDia(String codigoDia) {
        this.codigoDia = codigoDia;
    }

    public Long getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Long correlativo) {
        this.correlativo = correlativo;
    }
    
    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
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


    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
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

}
