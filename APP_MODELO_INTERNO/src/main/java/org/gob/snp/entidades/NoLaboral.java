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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Mapeo de la Entidad a persistir Tabla NoLaboral 
 * @author Eddy Valero
 * @see NoLaboralService
 * @see NoLaboralServiceImpl
 * @version 1.0, 03/07/2014
 * <pre>
 * ----------------------------------------------------
 * Modificado: Eddy Valero Fecha: 24/12/2014
 * Descripcion: Se agrega el campo Usuario y FechaUltimaModificacion
 * con el objetivo de guardar el usuario y la fecha de ultima modificación
 * que se realiza en la base de datos
 * ---------------------------------------------
 * Modficado: xxxxx Fecha: yyyyy
 * Descripcion: zzzzzzzzzzzzzzzzzzzzzzzzzzz
 * </pre>
 */
@Entity
@Table(name = "NoLaboral")
public class NoLaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdNoLaboral")
    private Long idNoLaboral;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Feriado")
    private Boolean feriado;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "IdRegional")
    private BigInteger idRegional;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public NoLaboral() {
    }

    public NoLaboral(Long idNoLaboral) {
        this.idNoLaboral = idNoLaboral;
    }

    public NoLaboral(Long idNoLaboral, Date fecha) {
        this.idNoLaboral = idNoLaboral;
        this.fecha = fecha;
    }

    public Long getIdNoLaboral() {
        return idNoLaboral;
    }

    public void setIdNoLaboral(Long idNoLaboral) {
        this.idNoLaboral = idNoLaboral;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getFeriado() {
        return feriado;
    }

    public void setFeriado(Boolean feriado) {
        this.feriado = feriado;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public BigInteger getIdRegional() {
        return idRegional;
    }

    public void setIdRegional(BigInteger idRegional) {
        this.idRegional = idRegional;
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
        hash += (idNoLaboral != null ? idNoLaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NoLaboral)) {
            return false;
        }
        NoLaboral other = (NoLaboral) object;
        if ((this.idNoLaboral == null && other.idNoLaboral != null) || (this.idNoLaboral != null && !this.idNoLaboral.equals(other.idNoLaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.NoLaboral[ idNoLaboral=" + idNoLaboral + " ]";
    }

}
