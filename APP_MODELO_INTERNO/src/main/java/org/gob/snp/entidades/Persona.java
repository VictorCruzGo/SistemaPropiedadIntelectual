/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.entidades;

import java.io.Serializable;
import java.util.Date;
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
import org.gob.snp.entidades.vistas.TipoGeneroPersona;
import org.gob.snp.entidades.vistas.TipoPais;

/**
 *
 * @author Eddy Valero
 */
@Entity
@Table(name = "Persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersona", nullable = false)
    private Long idPersona;
    @Column(name = "Nombres", nullable = false, length = 50)
    private String nombres;
    @Column(name = "ApellidoMaterno", length = 30)
    private String apellidoMaterno;
    @Column(name = "ApellidoPaterno", length = 30)
    private String apellidoPaterno;
    @Column(name = "NumeroDocumento", length = 25)
    private String numeroDocumento;
    @ManyToOne
    @JoinColumn(name = "LugarExpedicion", referencedColumnName = "Codigo")
    private TipoCiudad lugarExpedicion;
    @ManyToOne
    @JoinColumn(name = "PaisPersona", referencedColumnName = "Codigo")
    private TipoPais tipoPais;
    @ManyToOne
    @JoinColumn(name = "Genero", referencedColumnName = "Codigo")
    private TipoGeneroPersona tipoGeneroPersona;

    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Bloqueado")
    private Boolean bloqueado;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "IdPersonaModificar")
    private Long idPersonaModificar ;
    @ManyToOne
    @JoinColumn(name = "TipoDocumento", referencedColumnName = "Codigo")
    private TipoDocumento tipoDocumento;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Persona() {
    }

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Long idPersona, String nombres) {
        this.idPersona = idPersona;
        this.nombres = nombres;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoCiudad getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(TipoCiudad lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
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

    public Long getIdPersonaModificar() {
        return idPersonaModificar;
    }

    public void setIdPersonaModificar(Long idPersonaModificar) {
        this.idPersonaModificar = idPersonaModificar;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Persona[ idPersona=" + idPersona + " ]";
    }

    public TipoGeneroPersona getTipoGeneroPersona() {
        return tipoGeneroPersona;
    }

    public void setTipoGeneroPersona(TipoGeneroPersona tipoGeneroPersona) {
        this.tipoGeneroPersona = tipoGeneroPersona;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

}
