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
import org.gob.snp.entidades.vistas.TipoGeneroPersona;

/**
 *
 * @author chanorojas
 */
@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private Long idUsuario;
    @Column(name = "Login")
    private String login;
    @Column(name = "Password")
    private String password;
    @Column(name = "Activo")
    private Boolean activo;
    @Column(name = "TipoUsuario")
    private String tipoUsuario;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "RutaImagenFirma")
    private String rutaImagenFirma;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @JoinColumn(name = "IdRegional", referencedColumnName = "IdRegional")
    @ManyToOne(optional = true)
    private Regional regional;
//    @JoinColumn(name = "IdPersona", referencedColumnName = "IdPersona")
//    @ManyToOne(optional = false)
//    private Persona persona;
    @Column(name = "Nombres", nullable = false, length = 50)
    private String nombres;
    @Column(name = "PrimerApellido", length = 30)
    private String primerApellido;
    @Column(name = "SegundoApellido", length = 30)
    private String segundoApellido;
    @Column(name = "NumeroDocumento", length = 15)
    private String numeroDocumento;
    @ManyToOne
    @JoinColumn(name = "LugarExpedicion", referencedColumnName = "Codigo")
    private TipoCiudad lugarExpedicion;
  
    @ManyToOne
    @JoinColumn(name = "Genero", referencedColumnName = "Codigo")
    private TipoGeneroPersona tipoGeneroPersona;
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @ManyToOne
    @JoinColumn(name = "TipoDocumento", referencedColumnName = "Codigo")
    private TipoDocumento tipoDocumento;
    @Basic(optional = false)
    @Column(name = "CorreoElectronico")
    private String correoElectronico;
 
    public Usuario() {
    }

    public Usuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public String getRutaImagenFirma() {
        return rutaImagenFirma;
    }

    public void setRutaImagenFirma(String rutaImagenFirma) {
        this.rutaImagenFirma = rutaImagenFirma;
    }

    public Long getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(Long usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
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

    public TipoGeneroPersona getTipoGeneroPersona() {
        return tipoGeneroPersona;
    }

    public void setTipoGeneroPersona(TipoGeneroPersona tipoGeneroPersona) {
        this.tipoGeneroPersona = tipoGeneroPersona;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return (this.idUsuario != null || other.idUsuario == null) && (this.idUsuario == null || this.idUsuario.equals(other.idUsuario));
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Usuario[ idUsuario=" + idUsuario + " ]";
    }

}
