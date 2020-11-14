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
 * Mapeo de la Entidad RenovacionTramite
 * 
 * @author Eddy Valero
 * @version 1.0 23/10/2015
 */
@Entity
@Table(name = "RenovacionTramite")
public class RenovacionTramite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRenovacionTramite")
    private Long idRenovacionTramite;
    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;
    
    @Lob
    @Column(name = "NombreRazonSocialTitular")
    private String nombreRazonSocialTitular;
    @Lob
    @Column(name = "Domicilio")
    private String domicilio;
    @Column(name = "SignoDistintivo")
    private String signoDistintivo;
    @Column(name = "TipoGenero")
    private String tipoGenero;
    @Column(name = "NumeroClaseNiza")
    private String numeroClaseNiza;
    @Column(name = "Registro")
    private String registro;
    @Column(name = "SerieRegistro")
    private String serieRegistro;
    @Column(name = "FechaOtorgacionMarca")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOtorgacionMarca;
    @Column(name = "NumeroUltimaRenovacion")
    private String numeroUltimaRenovacion;
    @Column(name = "NumeroPenultimaRenovacion")
    private String numeroPenultimaRenovacion;
    @Lob
    @Column(name = "ListaProductosServicios")
    private String listaProductosServicios;
    @Column(name = "ClaseActualNiza")
    private String claseActualNiza;
    @Column(name = "NombreArchivoListaProducto")
    private String nombreArchivoListaProducto;
    @Lob
    @Column(name = "ArchivoListaProducto")
    private byte[] archivoListaProducto;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    
    
    public Long getIdRenovacionTramite() {
        return idRenovacionTramite;
    }

    public void setIdRenovacionTramite(Long idRenovacionTramite) {
        this.idRenovacionTramite = idRenovacionTramite;
    }
    
    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
    
    public String getNombreRazonSocialTitular() {
        return nombreRazonSocialTitular;
    }

    public void setNombreRazonSocialTitular(String nombreRazonSocialTitular) {
        this.nombreRazonSocialTitular = nombreRazonSocialTitular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSignoDistintivo() {
        return signoDistintivo;
    }

    public void setSignoDistintivo(String signoDistintivo) {
        this.signoDistintivo = signoDistintivo;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String getNumeroClaseNiza() {
        return numeroClaseNiza;
    }

    public void setNumeroClaseNiza(String numeroClaseNiza) {
        this.numeroClaseNiza = numeroClaseNiza;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getSerieRegistro() {
        return serieRegistro;
    }

    public void setSerieRegistro(String serieRegistro) {
        this.serieRegistro = serieRegistro;
    }

    public Date getFechaOtorgacionMarca() {
        return fechaOtorgacionMarca;
    }

    public void setFechaOtorgacionMarca(Date fechaOtorgacionMarca) {
        this.fechaOtorgacionMarca = fechaOtorgacionMarca;
    }

    public String getNumeroUltimaRenovacion() {
        return numeroUltimaRenovacion;
    }

    public void setNumeroUltimaRenovacion(String numeroUltimaRenovacion) {
        this.numeroUltimaRenovacion = numeroUltimaRenovacion;
    }

    public String getNumeroPenultimaRenovacion() {
        return numeroPenultimaRenovacion;
    }

    public void setNumeroPenultimaRenovacion(String numeroPenultimaRenovacion) {
        this.numeroPenultimaRenovacion = numeroPenultimaRenovacion;
    }

    public String getListaProductosServicios() {
        return listaProductosServicios;
    }

    public void setListaProductosServicios(String listaProductosServicios) {
        this.listaProductosServicios = listaProductosServicios;
    }

    public String getClaseActualNiza() {
        return claseActualNiza;
    }

    public void setClaseActualNiza(String claseActualNiza) {
        this.claseActualNiza = claseActualNiza;
    }

    public String getNombreArchivoListaProducto() {
        return nombreArchivoListaProducto;
    }

    public void setNombreArchivoListaProducto(String nombreArchivoListaProducto) {
        this.nombreArchivoListaProducto = nombreArchivoListaProducto;
    }
    
    public byte[] getArchivoListaProducto() {
        return archivoListaProducto;
    }

    public void setArchivoListaProducto(byte[] archivoListaProducto) {
        this.archivoListaProducto = archivoListaProducto;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
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
        hash += (idRenovacionTramite != null ? idRenovacionTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RenovacionTramite)) {
            return false;
        }
        RenovacionTramite other = (RenovacionTramite) object;
        if ((this.idRenovacionTramite == null && other.idRenovacionTramite != null) || (this.idRenovacionTramite != null && !this.idRenovacionTramite.equals(other.idRenovacionTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Renovacion[ idRenovacionTramite=" + idRenovacionTramite + " ]";
    }
    
}
