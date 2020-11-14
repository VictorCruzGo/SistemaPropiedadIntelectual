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
import org.gob.snp.entidades.vistas.TipoCiudad;
import org.gob.snp.entidades.vistas.TipoGeneroPersona;
import org.gob.snp.entidades.vistas.TipoModificacion;
import org.gob.snp.entidades.vistas.TipoSolicitante;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "OTSolicitadoModificacion")
public class OTSolicitadoModificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdOTSolicitadoModificacion")
    private Long idOTSolicitadoModificacion;

    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;
    
    @ManyToOne
    @JoinColumn(name = "TipoModificacion", referencedColumnName = "Codigo")
    private TipoModificacion tipoModificacion;

    @ManyToOne
    @JoinColumn(name = "TipoSolicitante", referencedColumnName = "Codigo")
    private TipoSolicitante tipoSolicitnate;

    @ManyToOne
    @JoinColumn(name = "Genero", referencedColumnName = "Codigo")
    private TipoGeneroPersona tipoGeneroPersona;

    @Column(name = "NombreFusion")
    private String nombreFusion;

    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

    @Column(name = "NumeroDocumento")
    private String numeroDocumento;

    @ManyToOne
    @JoinColumn(name = "LugarExpedicion", referencedColumnName = "Codigo")
    private TipoCiudad lugarExpedicion;

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "ApellidoPaterno")
    private String apellidoPaterno;
    @Column(name = "ApellidoMaterno")
    private String apellidoMaterno;
    @Column(name = "UltimaRenovacion")
    private String ultimaRenovacion;
    @Column(name = "Vigente")
    private Boolean vigente;

    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public OTSolicitadoModificacion() {
    }

    public OTSolicitadoModificacion(Long idOTSolicitadoModificacion) {
        this.idOTSolicitadoModificacion = idOTSolicitadoModificacion;
    }

    public Long getIdOTSolicitadoModificacion() {
        return idOTSolicitadoModificacion;
    }

    public void setIdOTSolicitadoModificacion(Long idOTSolicitadoModificacion) {
        this.idOTSolicitadoModificacion = idOTSolicitadoModificacion;
    }

    public String getNombreFusion() {
        return nombreFusion;
    }

    public void setNombreFusion(String nombreFusion) {
        this.nombreFusion = nombreFusion;
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

    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getUltimaRenovacion() {
        return ultimaRenovacion;
    }

    public void setUltimaRenovacion(String ultimaRenovacion) {
        this.ultimaRenovacion = ultimaRenovacion;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public TipoSolicitante getTipoSolicitnate() {
        return tipoSolicitnate;
    }

    public void setTipoSolicitnate(TipoSolicitante tipoSolicitnate) {
        this.tipoSolicitnate = tipoSolicitnate;
    }

    public TipoGeneroPersona getTipoGeneroPersona() {
        return tipoGeneroPersona;
    }

    public void setTipoGeneroPersona(TipoGeneroPersona tipoGeneroPersona) {
        this.tipoGeneroPersona = tipoGeneroPersona;
    }

    public TipoCiudad getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(TipoCiudad lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
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
        hash += (idOTSolicitadoModificacion != null ? idOTSolicitadoModificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OTSolicitadoModificacion)) {
            return false;
        }
        OTSolicitadoModificacion other = (OTSolicitadoModificacion) object;
        if ((this.idOTSolicitadoModificacion == null && other.idOTSolicitadoModificacion != null) || (this.idOTSolicitadoModificacion != null && !this.idOTSolicitadoModificacion.equals(other.idOTSolicitadoModificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.OTSolicitadoModificacion[ idOTSolicitadoModificacion=" + idOTSolicitadoModificacion + " ]";
    }

}
