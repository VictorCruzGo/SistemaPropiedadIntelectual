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
import org.gob.snp.entidades.vistas.TipoColor;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "SMColor")
public class SMColor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSMColor")
    private Long idSMColor;

    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private SMSignoMarca sMSignoMarca;

    @Column(name = "Dato")
    private String dato;

    @ManyToOne
    @JoinColumn(name = "TipoColor", referencedColumnName = "Codigo")
    private TipoColor tipoColor;

    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public SMColor() {
    }

    public SMColor(Long idSMColor) {
        this.idSMColor = idSMColor;
    }

    public Long getIdSMColor() {
        return idSMColor;
    }

    public void setIdSMColor(Long idSMColor) {
        this.idSMColor = idSMColor;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public TipoColor getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(TipoColor tipoColor) {
        this.tipoColor = tipoColor;
    }



    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public SMSignoMarca getsMSignoMarca() {
        return sMSignoMarca;
    }

    public void setsMSignoMarca(SMSignoMarca sMSignoMarca) {
        this.sMSignoMarca = sMSignoMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSMColor != null ? idSMColor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMColor)) {
            return false;
        }
        SMColor other = (SMColor) object;
        if ((this.idSMColor == null && other.idSMColor != null) || (this.idSMColor != null && !this.idSMColor.equals(other.idSMColor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMColor[ idSMColor=" + idSMColor + " ]";
    }
    
     @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
    

}
