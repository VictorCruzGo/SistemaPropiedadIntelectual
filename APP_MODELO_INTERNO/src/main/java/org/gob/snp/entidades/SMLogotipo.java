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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "SMLogotipo")
public class SMLogotipo implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSMLogotipo")
    private Long idSMLogotipo;
   
    @Column(name = "NombreArchivo")
    private String nombreArchivo;

    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private SMSignoMarca sMSignoMarca;

    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
   
    @Column(name = "Principal")
    private Boolean principal;
    
    public SMLogotipo() {
    }

    public SMLogotipo(Long idSMLogotipo) {
        this.idSMLogotipo = idSMLogotipo;
    }

  
    public SMSignoMarca getsMSignoMarca() {
        return sMSignoMarca;
    }

    public void setsMSignoMarca(SMSignoMarca sMSignoMarca) {
        this.sMSignoMarca = sMSignoMarca;
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

    public Long getIdSMLogotipo() {
        return idSMLogotipo;
    }

    public void setIdSMLogotipo(Long idSMLogotipo) {
        this.idSMLogotipo = idSMLogotipo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSMLogotipo != null ? idSMLogotipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMLogotipo)) {
            return false;
        }
        SMLogotipo other = (SMLogotipo) object;
        if ((this.idSMLogotipo == null && other.idSMLogotipo != null) || (this.idSMLogotipo != null && !this.idSMLogotipo.equals(other.idSMLogotipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMLogotipo[ idSMLogotipo=" + idSMLogotipo + " ]";
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
