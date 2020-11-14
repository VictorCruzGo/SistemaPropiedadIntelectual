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
import org.gob.snp.entidades.vistas.EstadoProceso;
import org.gob.snp.entidades.vistas.TipoRepresentante;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "Poder")
public class Poder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPoder")
    private Long idPoder;

    @ManyToOne
    @JoinColumn(name = "TipoRepresentante", referencedColumnName = "Codigo")
    private TipoRepresentante tipoRepresentante;

    @Column(name = "NumeroPoder")
    private String numeroPoder;
    @Column(name = "Lugar")
    private String lugar;
    @Column(name = "FechaExpiracionPoder")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExpiracionPoder;
    @Column(name = "Vigente")
    private Boolean vigente;
    
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Poder() {
    }

    public Poder(Long idPoder) {
        this.idPoder = idPoder;
    }

    
        
    public Long getIdPoder() {
        return idPoder;
    }

    public void setIdPoder(Long idPoder) {
        this.idPoder = idPoder;
    }

       
    
    public TipoRepresentante getTipoRepresentante() {
        return tipoRepresentante;
    }

    public void setTipoRepresentante(TipoRepresentante tipoRepresentante) {
        this.tipoRepresentante = tipoRepresentante;
    }

      
    
    public String getNumeroPoder() {
        return numeroPoder;
    }

    public void setNumeroPoder(String numeroPoder) {
        this.numeroPoder = numeroPoder;
    }

    
    
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    
    
    public Date getFechaExpiracionPoder() {
        return fechaExpiracionPoder;
    }

    public void setFechaExpiracionPoder(Date fechaExpiracionPoder) {
        this.fechaExpiracionPoder = fechaExpiracionPoder;
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

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPoder != null ? idPoder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poder)) {
            return false;
        }
        Poder other = (Poder) object;
        if ((this.idPoder == null && other.idPoder != null) || (this.idPoder != null && !this.idPoder.equals(other.idPoder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Apoderado[ idApoderado=" + idPoder + " ]";
    }

}
