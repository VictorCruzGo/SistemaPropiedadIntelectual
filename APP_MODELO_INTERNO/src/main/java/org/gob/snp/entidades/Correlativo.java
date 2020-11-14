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
 * Entidad que corresponde a la Tabla correlativo
 *
 * @author eddy valero
 * @version 1.0
 *
 */
@Entity
@Table(name = "Correlativo")
public class Correlativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdCorrelativo")
    private Long idCorrelativo;
    @Column(name = "NombreTabla")
    private String nombreTabla;
    @Column(name = "Acronimo")
    private String acronimo;
    @Column(name = "Separador")
    private String separador;
    @Column(name = "Gestion")
    private String gestion;
    @Column(name = "Incremento")
    private Long incremento;
    @Column(name = "UltimoNumeroAsignado")
    private Long ultimoNumeroAsignado;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Correlativo() {
    }

    public Correlativo(Long idCorrelativo) {
        this.idCorrelativo = idCorrelativo;
    }

    public Long getIdCorrelativo() {
        return idCorrelativo;
    }

    public void setIdCorrelativo(Long idCorrelativo) {
        this.idCorrelativo = idCorrelativo;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public Long getIncremento() {
        return incremento;
    }

    public void setIncremento(Long incremento) {
        this.incremento = incremento;
    }

    public Long getUltimoNumeroAsignado() {
        return ultimoNumeroAsignado;
    }

    public void setUltimoNumeroAsignado(Long ultimoNumeroAsignado) {
        this.ultimoNumeroAsignado = ultimoNumeroAsignado;
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

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCorrelativo != null ? idCorrelativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correlativo)) {
            return false;
        }
        Correlativo other = (Correlativo) object;
        if ((this.idCorrelativo == null && other.idCorrelativo != null) || (this.idCorrelativo != null && !this.idCorrelativo.equals(other.idCorrelativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Correlativo[ idCorrelativo=" + idCorrelativo + " ]";
    }

}
