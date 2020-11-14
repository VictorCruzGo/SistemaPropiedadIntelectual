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
import org.gob.snp.entidades.vistas.TipoGenero;
import org.gob.snp.entidades.vistas.TipoModificacion;

/**
 *
 * @author Gustavo Lizárraga
 */
@Entity
@Table(name = "Modificacion")
public class Modificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdModificacion")
    private Long idModificacion;
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = true)
    private Tramite tramite;
    @ManyToOne
    @JoinColumn(name = "tipoModificacion", referencedColumnName = "Codigo")
    private TipoModificacion tipoModificacion;
    @Column(name = "NombreTitular")
    private String nombreTitular;
    @Column(name = "DomicilioTitular")
    private String domicilioTitular;
    @Column(name = "SignoDistintivoTitular")
    private String signoDistintivoTitular;
    @ManyToOne
    @JoinColumn(name = "tipoSignoTitular", referencedColumnName = "Codigo")
    private TipoGenero tipoSignoTitular;
    @Column(name = "ClaseTitular")
    private String claseTitular;
    @Column(name = "NuevaDireccion")
    private String nuevaDireccion;
    @Column(name = "NuevaNacionalidad")
    private String nuevaNacionalidad;
    @Column(name = "FusionParticipante")
    private String fusionParticipante;
    @Column(name = "FechaInicioLicencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioLicencia;
    @Column(name = "FechaFinLicencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinLicencia;
    @Column(name = "LicenciaIndefinida")
    private Boolean licenciaIndefinida;
    @Column(name = "NumeroRegistro")
    private String numeroRegistro;
    @Column(name = "SerieNumeroRegistro")
    private String serieNumeroRegistro;
    @Column(name = "CodigoSM")
    private String codigoSM;
    @Column(name = "NumeroPublicacion")
    private Long numeroPublicacion;
    @Column(name = "NumeroUltimaRenovacion")
    private String numeroUltimaRenovacion;
    @Column(name = "LemaMarca")
    private String lemaMarca;
    @Column(name = "RegistroLemaMarca")
    private String registroLemaMarca;
    @Column(name = "SerieRegistroLemaMarca")
    private String serieRegistroLemaMarca;
    @Column(name = "FechaRegistroLemaMarca")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroLemaMarca;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Modificacion() {
    }

    public Modificacion(Long idModificacion) {
        this.idModificacion = idModificacion;
    }

    public Long getIdModificacion() {
        return idModificacion;
    }

    public void setIdModificacion(Long idModificacion) {
        this.idModificacion = idModificacion;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public TipoModificacion getTipoModificacion() {
        return tipoModificacion;
    }

    public void setTipoModificacion(TipoModificacion tipoModificacion) {
        this.tipoModificacion = tipoModificacion;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getDomicilioTitular() {
        return domicilioTitular;
    }

    public void setDomicilioTitular(String domicilioTitular) {
        this.domicilioTitular = domicilioTitular;
    }

    public String getSignoDistintivoTitular() {
        return signoDistintivoTitular;
    }

    public void setSignoDistintivoTitular(String signoDistintivoTitular) {
        this.signoDistintivoTitular = signoDistintivoTitular;
    }

    public TipoGenero getTipoSignoTitular() {
        return tipoSignoTitular;
    }

    public void setTipoSignoTitular(TipoGenero tipoSignoTitular) {
        this.tipoSignoTitular = tipoSignoTitular;
    }

    public String getClaseTitular() {
        return claseTitular;
    }

    public void setClaseTitular(String claseTitular) {
        this.claseTitular = claseTitular;
    }

    public String getNuevaDireccion() {
        return nuevaDireccion;
    }

    public void setNuevaDireccion(String nuevaDireccion) {
        this.nuevaDireccion = nuevaDireccion;
    }

    public String getNuevaNacionalidad() {
        return nuevaNacionalidad;
    }

    public void setNuevaNacionalidad(String nuevaNacionalidad) {
        this.nuevaNacionalidad = nuevaNacionalidad;
    }

    public String getFusionParticipante() {
        return fusionParticipante;
    }

    public void setFusionParticipante(String fusionParticipante) {
        this.fusionParticipante = fusionParticipante;
    }

    public Date getFechaInicioLicencia() {
        return fechaInicioLicencia;
    }

    public void setFechaInicioLicencia(Date fechaInicioLicencia) {
        this.fechaInicioLicencia = fechaInicioLicencia;
    }

    public Date getFechaFinLicencia() {
        return fechaFinLicencia;
    }

    public void setFechaFinLicencia(Date fechaFinLicencia) {
        this.fechaFinLicencia = fechaFinLicencia;
    }

    public Boolean getLicenciaIndefinida() {
        return licenciaIndefinida;
    }

    public void setLicenciaIndefinida(Boolean licenciaIndefinida) {
        this.licenciaIndefinida = licenciaIndefinida;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getSerieNumeroRegistro() {
        return serieNumeroRegistro;
    }

    public void setSerieNumeroRegistro(String serieNumeroRegistro) {
        this.serieNumeroRegistro = serieNumeroRegistro;
    }

    public String getCodigoSM() {
        return codigoSM;
    }

    public void setCodigoSM(String codigoSM) {
        this.codigoSM = codigoSM;
    }

    public Long getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(Long numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    public String getNumeroUltimaRenovacion() {
        return numeroUltimaRenovacion;
    }

    public void setNumeroUltimaRenovacion(String numeroUltimaRenovacion) {
        this.numeroUltimaRenovacion = numeroUltimaRenovacion;
    }

    public String getLemaMarca() {
        return lemaMarca;
    }

    public void setLemaMarca(String lemaMarca) {
        this.lemaMarca = lemaMarca;
    }

    public String getRegistroLemaMarca() {
        return registroLemaMarca;
    }

    public void setRegistroLemaMarca(String registroLemaMarca) {
        this.registroLemaMarca = registroLemaMarca;
    }

    public String getSerieRegistroLemaMarca() {
        return serieRegistroLemaMarca;
    }

    public void setSerieRegistroLemaMarca(String serieRegistroLemaMarca) {
        this.serieRegistroLemaMarca = serieRegistroLemaMarca;
    }

    public Date getFechaRegistroLemaMarca() {
        return fechaRegistroLemaMarca;
    }

    public void setFechaRegistroLemaMarca(Date fechaRegistroLemaMarca) {
        this.fechaRegistroLemaMarca = fechaRegistroLemaMarca;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
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
        hash += (idModificacion != null ? idModificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modificacion)) {
            return false;
        }
        Modificacion other = (Modificacion) object;
        if ((this.idModificacion == null && other.idModificacion != null) || (this.idModificacion != null && !this.idModificacion.equals(other.idModificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Modificacion[ idModificacion=" + idModificacion + " ]";
    }

}
