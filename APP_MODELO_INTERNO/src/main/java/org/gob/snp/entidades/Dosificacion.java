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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author roco
 */
@Entity
@Table(name = "Dosificacion")
public class Dosificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDosificacion")
    private Long idDosificacion;

     
    @Column(name = "ValorInicial")
    private Integer valorInicial;
    
    @Column(name = "ValorFinal")
    private Integer valorFinal;
    
    @Column(name = "FechaDosificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDosificacion;
    
    @Column(name = "Siguiente")
    private Integer siguiente;
    
    @Column(name = "Vigente")
    private Boolean vigente;
    
    @Column(name = "Usuario")
    private Long usuarioModificador;
    
      
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
    public Dosificacion() {
    }

    public Dosificacion(Long idDosificacion) {
        this.idDosificacion = idDosificacion;
    }

    public Long getIdDosificacion() {
        return idDosificacion;
    }

    public void setIdDosificacion(Long idDosificacion) {
        this.idDosificacion = idDosificacion;
    }


    public Integer getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Integer valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Integer getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Integer valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Date getFechaDosificacion() {
        return fechaDosificacion;
    }

    public void setFechaDosificacion(Date fechaDosificacion) {
        this.fechaDosificacion = fechaDosificacion;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Integer getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Integer siguiente) {
        this.siguiente = siguiente;
    }

    public Long getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(Long usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    public Boolean isVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDosificacion != null ? idDosificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosificacion)) {
            return false;
        }
        Dosificacion other = (Dosificacion) object;
        if ((this.idDosificacion == null && other.idDosificacion != null) || (this.idDosificacion != null && !this.idDosificacion.equals(other.idDosificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Dosificacion[ idDosificacion=" + idDosificacion + " ]";
    }

}
