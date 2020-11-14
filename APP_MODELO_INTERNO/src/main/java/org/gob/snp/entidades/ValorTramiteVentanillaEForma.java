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
import org.gob.snp.entidades.vistas.TipoFormularioVentanillaEForma;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "ValorTramiteVentanillaEForma")
public class ValorTramiteVentanillaEForma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdValorTramiteVentanillaEForma")
    private Long idValorTramiteVentanillaEForma;

    @ManyToOne
    @JoinColumn(name = "IdDatoTramiteVentanillaEForma", referencedColumnName = "IdDatoTramiteVentanillaEForma")
    private DatoTramiteVentanillaEForma datoTramiteVentanillaEForma;

    @Column(name = "Presento")
    private Boolean presento;

    @ManyToOne
    @JoinColumn(name = "Codigo", referencedColumnName = "Codigo")
    private TipoFormularioVentanillaEForma tipoFormularioVentanillaEForma;

    @Column(name = "Observacion")
    private String observacion;
    
    @Column(name = "DominioOpcion")
    private String dominioOpcion;
    
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public ValorTramiteVentanillaEForma() {
    }

    public ValorTramiteVentanillaEForma(Long idValorTramiteVentanillaEForma) {
        this.idValorTramiteVentanillaEForma = idValorTramiteVentanillaEForma;
    }

    public Long getIdValorTramiteVentanillaEForma() {
        return idValorTramiteVentanillaEForma;
    }

    public void setIdValorTramiteVentanillaEForma(Long idValorTramiteVentanillaEForma) {
        this.idValorTramiteVentanillaEForma = idValorTramiteVentanillaEForma;
    }

    public Boolean getPresento() {
        return presento;
    }

    public void setPresento(Boolean presento) {
        this.presento = presento;
    }

    public TipoFormularioVentanillaEForma getTipoFormularioVentanillaEForma() {
        return tipoFormularioVentanillaEForma;
    }

    public void setTipoFormularioVentanillaEForma(TipoFormularioVentanillaEForma tipoFormularioVentanillaEForma) {
        this.tipoFormularioVentanillaEForma = tipoFormularioVentanillaEForma;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDominioOpcion() {
        return dominioOpcion;
    }

    public void setDominioOpcion(String dominioOpcion) {
        this.dominioOpcion = dominioOpcion;
    }

    public DatoTramiteVentanillaEForma getDatoTramiteVentanillaEForma() {
        return datoTramiteVentanillaEForma;
    }

    public void setDatoTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma) {
        this.datoTramiteVentanillaEForma = datoTramiteVentanillaEForma;
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
        hash += (idValorTramiteVentanillaEForma != null ? idValorTramiteVentanillaEForma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValorTramiteVentanillaEForma)) {
            return false;
        }
        ValorTramiteVentanillaEForma other = (ValorTramiteVentanillaEForma) object;
        if ((this.idValorTramiteVentanillaEForma == null && other.idValorTramiteVentanillaEForma != null) || (this.idValorTramiteVentanillaEForma != null && !this.idValorTramiteVentanillaEForma.equals(other.idValorTramiteVentanillaEForma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.ValorTramiteVentanillaEForma[ idValorTramiteVentanillaEForma=" + idValorTramiteVentanillaEForma + " ]";
    }

}
