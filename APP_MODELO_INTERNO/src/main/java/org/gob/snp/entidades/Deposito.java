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
import org.gob.snp.entidades.vistas.EstadoDeposito;
import org.gob.snp.entidades.vistas.TipoBanco;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "Deposito")

public class Deposito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "IdDeposito")
    private Long idDeposito;

    @Column(name = "NumeroDeposito")
    private String numeroDeposito;

    @ManyToOne
    @JoinColumn(name = "Banco", referencedColumnName = "Codigo")
    private TipoBanco tipoBanco;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "FechaDeposito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeposito;

    @Column(name = "PersonaDeposito")
    private String personaDeposito;

    @Column(name = "Saldo")
    private BigDecimal saldo;

    @ManyToOne
    @JoinColumn(name = "EstadoDeposito", referencedColumnName = "Codigo")
    private EstadoDeposito estadoDeposito;

    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Deposito() {
    }

    public Deposito(Long idDeposito) {
        this.idDeposito = idDeposito;
    }

    public Long getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(Long idDeposito) {
        this.idDeposito = idDeposito;
    }

    public String getNumeroDeposito() {
        return numeroDeposito;
    }

    public void setNumeroDeposito(String numeroDeposito) {
        this.numeroDeposito = numeroDeposito;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(Date fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }

    public String getPersonaDeposito() {
        return personaDeposito;
    }

    public void setPersonaDeposito(String personaDeposito) {
        this.personaDeposito = personaDeposito;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public EstadoDeposito getEstadoDeposito() {
        return estadoDeposito;
    }

    public void setEstadoDeposito(EstadoDeposito estadoDeposito) {
        this.estadoDeposito = estadoDeposito;
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

    public TipoBanco getTipoBanco() {
        return tipoBanco;
    }

    public void setTipoBanco(TipoBanco tipoBanco) {
        this.tipoBanco = tipoBanco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDeposito != null ? idDeposito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deposito)) {
            return false;
        }
        Deposito other = (Deposito) object;
        if ((this.idDeposito == null && other.idDeposito != null) || (this.idDeposito != null && !this.idDeposito.equals(other.idDeposito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Deposito[ idDeposito=" + idDeposito + " ]";
    }

}
