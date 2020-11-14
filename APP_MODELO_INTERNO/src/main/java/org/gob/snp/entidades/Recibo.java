/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
import org.gob.snp.entidades.vistas.EstadoRecibo;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "Recibo")
public class Recibo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRecibo")
    private Long idRecibo;

    
    @Column(name = "NroRecibo")
    private Integer nroRecibo;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "IdRegional", referencedColumnName = "IdRegional")
    private Regional regional;
    
    @ManyToOne
    @JoinColumn(name = "IdTasa", referencedColumnName = "IdTasa")
    private Tasa tasa;
    
    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;

    @Basic(optional = false)
    @Column(name = "Serie")
    private String serie;
    
    @Basic(optional = false)
    @Column(name = "DatoRecibo")
    private String datoRecibo;
    
    @Column(name = "Monto")
    private BigDecimal monto;
    
    @ManyToOne
    @JoinColumn(name = "EstadoRecibo", referencedColumnName = "Codigo")
    private EstadoRecibo estadoRecibo;

    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaEmisionRecibo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmisionRecibo;    
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;    

    public Long getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(Long idRecibo) {
        this.idRecibo = idRecibo;
    }

    
    public Recibo() {
    }

    public Integer getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(Integer nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public EstadoRecibo getEstadoRecibo() {
        return estadoRecibo;
    }

    public void setEstadoRecibo(EstadoRecibo estadoRecibo) {
        this.estadoRecibo = estadoRecibo;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public Tasa getTasa() {
        return tasa;
    }

    public void setTasa(Tasa tasa) {
        this.tasa = tasa;
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

    public Date getFechaEmisionRecibo() {
        return fechaEmisionRecibo;
    }

    public void setFechaEmisionRecibo(Date fechaEmisionRecibo) {
        this.fechaEmisionRecibo = fechaEmisionRecibo;
    }

    public String getDatoRecibo() {
        return datoRecibo;
    }

    public void setDatoRecibo(String datoRecibo) {
        this.datoRecibo = datoRecibo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecibo != null ? idRecibo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recibo)) {
            return false;
        }
        Recibo other = (Recibo) object;
        if ((this.idRecibo == null && other.idRecibo != null) || (this.idRecibo != null && !this.idRecibo.equals(other.idRecibo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Recibo[ idRecibo=" + idRecibo + " ]";
    }

}
