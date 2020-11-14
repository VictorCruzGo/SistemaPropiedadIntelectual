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
@Table(name = "SMSignoClaseNiza")

public class SMSignoClaseNiza implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSMSignoClaseNiza")
    private Long idSMSignoClaseNiza;
    @Column(name = "NumeroClaseNiza")
    private String numeroClaseNiza;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Lob
    @Column(name = "ListaProducto")
    private String listaProducto;
    @Column(name = "ArchivoProducto")
    private String archivoProducto;
    @JoinColumn(name = "IdClaseNiza", referencedColumnName = "IdClaseNiza")
    @ManyToOne(optional = false)
    private ClaseNiza claseNiza;
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private SMSignoMarca sMSignoMarca;
    @Column(name = "Observaciones")
    private String observaciones;
      @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
    

    public SMSignoClaseNiza() {
    }

    public SMSignoClaseNiza(Long idSMSignoClaseNiza) {
        this.idSMSignoClaseNiza = idSMSignoClaseNiza;
    }

    public Long getIdSMSignoClaseNiza() {
        return idSMSignoClaseNiza;
    }

    public void setIdSMSignoClaseNiza(Long idSignoClaseNiza) {
        this.idSMSignoClaseNiza = idSignoClaseNiza;
    }

    public String getNumeroClaseNiza() {
        return numeroClaseNiza;
    }

    public void setNumeroClaseNiza(String numeroClaseNiza) {
        this.numeroClaseNiza = numeroClaseNiza;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public String getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(String listaProducto) {
        this.listaProducto = listaProducto;
    }

    public String getArchivoProducto() {
        return archivoProducto;
    }

    public void setArchivoProducto(String archivoProducto) {
        this.archivoProducto = archivoProducto;
    }

    public ClaseNiza getClaseNiza() {
        return claseNiza;
    }

    public void setClaseNiza(ClaseNiza claseNiza) {
        this.claseNiza = claseNiza;
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

  

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSMSignoClaseNiza != null ? idSMSignoClaseNiza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMSignoClaseNiza)) {
            return false;
        }
        SMSignoClaseNiza other = (SMSignoClaseNiza) object;
        if ((this.idSMSignoClaseNiza == null && other.idSMSignoClaseNiza != null) || (this.idSMSignoClaseNiza != null && !this.idSMSignoClaseNiza.equals(other.idSMSignoClaseNiza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMSignoClaseNiza[ idSMSignoClaseNiza=" + idSMSignoClaseNiza + " ]";
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
