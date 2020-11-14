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

/**
 *
 * @author chano, roco
 */
@Entity
@Table(name = "ReciboDeposito")
public class ReciboDeposito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdReciboDeposito")
    private Long idReciboDeposito;

    @ManyToOne
    @JoinColumn(name = "IdDeposito", referencedColumnName = "IdDeposito")
    private Deposito deposito;

    @ManyToOne
    @JoinColumn(name = "idRecibo", referencedColumnName = "idRecibo")
    private Recibo recibo;
     
    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public ReciboDeposito() {
    }

    public ReciboDeposito(Long idReciboDeposito) {
        this.idReciboDeposito = idReciboDeposito;
    }

    public Long getIdReciboDeposito() {
        return idReciboDeposito;
    }

    public void setIdReciboDeposito(Long idReciboDeposito) {
        this.idReciboDeposito = idReciboDeposito;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
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

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReciboDeposito != null ? idReciboDeposito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReciboDeposito)) {
            return false;
        }
        ReciboDeposito other = (ReciboDeposito) object;
        if ((this.idReciboDeposito == null && other.idReciboDeposito != null) || (this.idReciboDeposito != null && !this.idReciboDeposito.equals(other.idReciboDeposito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ReciboDeposito[ idReciboDeposito=" + idReciboDeposito + " ]";
    }

}
