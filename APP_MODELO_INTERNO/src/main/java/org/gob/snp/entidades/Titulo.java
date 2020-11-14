/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author RobertoSantivañez
 */
@Entity
@Table(name = "Titulo")
public class Titulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "NroTitulo")
    private Long nroTitulo;
    
    @ManyToOne
    @JoinColumn(name = "NroRecibo", referencedColumnName = "NroRecibo")
    private Recibo recibo;
    
    @Column(name = "SerieTitulo")
    private BigInteger serieTitulo;
    
    @Column(name = "Usuario")
    private Long usuarioModificador;
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Titulo() {
    }

    public Titulo(Long nroTitulo) {
        this.nroTitulo = nroTitulo;
    }

    public Long getNroTitulo() {
        return nroTitulo;
    }

    public void setNroTitulo(Long nroTitulo) {
        this.nroTitulo = nroTitulo;
    }

    public BigInteger getSerieTitulo() {
        return serieTitulo;
    }

    public void setSerieTitulo(BigInteger serieTitulo) {
        this.serieTitulo = serieTitulo;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroTitulo != null ? nroTitulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titulo)) {
            return false;
        }
        Titulo other = (Titulo) object;
        if ((this.nroTitulo == null && other.nroTitulo != null) || (this.nroTitulo != null && !this.nroTitulo.equals(other.nroTitulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Titulo[ nroTitulo=" + nroTitulo + " ]";
    }

}
