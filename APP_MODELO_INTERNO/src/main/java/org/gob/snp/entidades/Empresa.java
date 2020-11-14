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
import org.gob.snp.entidades.vistas.TipoCiudad;
import org.gob.snp.entidades.vistas.TipoDocumento;
import org.gob.snp.entidades.vistas.TipoPais;

/**
 *
 * @author jonathanValdivia
 */
@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdEmpresa")
    private Long idEmpresa;
    @Basic(optional = false)
    @Column(name = "NombreRepresentante")
    private String nombreRepresentante;

    @ManyToOne
    @JoinColumn(name = "LugarExpedicion", referencedColumnName = "Codigo")
    private TipoCiudad lugarExpedicion;

    @ManyToOne
    @JoinColumn(name = "TipoDocumentoEmpresa", referencedColumnName = "Codigo")
    private TipoDocumento tipoDocumentoEmpresa;
    @Column(name = "NumeroDocumento")
    private String numeroDocumento;
    @ManyToOne
    @JoinColumn(name = "PaisEmpresa", referencedColumnName = "Codigo")
    private TipoPais tipoPais;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    
    @Column(name = "IdEmpresaModificar")
    private Long idEmpresaModificar;
    
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "Bloqueado")
    private Boolean bloqueado;

    public Empresa() {
    }

    public Empresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(Long idEmpresa, String nombreRepresentante, Date fechaModificacion) {
        this.idEmpresa = idEmpresa;
        this.nombreRepresentante = nombreRepresentante;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public TipoDocumento getTipoDocumentoEmpresa() {
        return tipoDocumentoEmpresa;
    }

    public void setTipoDocumentoEmpresa(TipoDocumento tipoDocumentoEmpresa) {
        this.tipoDocumentoEmpresa = tipoDocumentoEmpresa;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public TipoPais getTipoPais() {
        return tipoPais;
    }

    public void setTipoPais(TipoPais tipoPais) {
        this.tipoPais = tipoPais;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public TipoCiudad getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(TipoCiudad lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public Long getIdEmpresaModificar() {
        return idEmpresaModificar;
    }

    public void setIdEmpresaModificar(Long idEmpresaModificar) {
        this.idEmpresaModificar = idEmpresaModificar;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }

}
