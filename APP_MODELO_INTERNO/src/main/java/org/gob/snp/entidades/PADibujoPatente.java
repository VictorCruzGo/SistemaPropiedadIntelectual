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

/**
 *
 * @author chano
 */
@Entity
@Table(name = "PADibujoPatente")

public class PADibujoPatente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDibujoInvencion")
    private Long idDibujoInvencion;

    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = true)
    private Regional regional;

    @Column(name = "Archivo")
    private String archivo;
    @Column(name = "Importante")
    private Boolean importante;
    @Column(name = "TipoDibujo")
    private String tipoDibujo;
    @Column(name = "Otro")
    private String otro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Tamanio")
    private Float tamanio;
    @Column(name = "Vigente")
    private Boolean vigente;
    @Column(name = "Usuario")
    private BigInteger usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public PADibujoPatente() {
    }

    public PADibujoPatente(Long idDibujoInvencion) {
        this.idDibujoInvencion = idDibujoInvencion;
    }

    public Long getIdDibujoInvencion() {
        return idDibujoInvencion;
    }

    public void setIdDibujoInvencion(Long idDibujoInvencion) {
        this.idDibujoInvencion = idDibujoInvencion;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public Boolean getImportante() {
        return importante;
    }

    public void setImportante(Boolean importante) {
        this.importante = importante;
    }

    public String getTipoDibujo() {
        return tipoDibujo;
    }

    public void setTipoDibujo(String tipoDibujo) {
        this.tipoDibujo = tipoDibujo;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public BigInteger getUsuario() {
        return usuario;
    }

    public void setUsuario(BigInteger usuario) {
        this.usuario = usuario;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDibujoInvencion != null ? idDibujoInvencion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PADibujoPatente)) {
            return false;
        }
        PADibujoPatente other = (PADibujoPatente) object;
        if ((this.idDibujoInvencion == null && other.idDibujoInvencion != null) || (this.idDibujoInvencion != null && !this.idDibujoInvencion.equals(other.idDibujoInvencion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.PADibujoPatente[ idDibujoInvencion=" + idDibujoInvencion + " ]";
    }

}
