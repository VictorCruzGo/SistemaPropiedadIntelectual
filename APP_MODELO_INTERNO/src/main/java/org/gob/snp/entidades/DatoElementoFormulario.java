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
import org.gob.snp.entidades.vistas.TipoElementoHtml;

/**
 *
 * @author roco
 */
@Entity
@Table(name = "DatoElementoFormulario")
public class DatoElementoFormulario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDatoElementoFormulario")
    private Long idDatoElementoFormulario;

    @ManyToOne
    @JoinColumn(name = "IdAnalisisEtapa", referencedColumnName = "IdAnalisisEtapa")
    private AnalisisEtapa analisisEtapa;

    @ManyToOne
    @JoinColumn(name = "IdFormularioTramite", referencedColumnName = "IdFormularioTramite")
    private FormularioTramite formularioTramite;

    @Column(name = "IdTramite")
    private Long idTramite;

    @Column(name = "Pestania")
    private String pestania;

    @Column(name = "Seccion")
    private Integer seccion;

    @Column(name = "Fila")
    private Integer fila;

    @ManyToOne
    @JoinColumn(name = "TipoElemento", referencedColumnName = "Codigo")
    private TipoElementoHtml tipoElemento;

    @Column(name = "NombreElemento")
    private String nombreElemento;

    @Column(name = "Orden")
    private Integer orden;

    @Column(name = "IdPadre")
    private Long idPadre;

    @Column(name = "Respuesta")
    private String respuesta;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "Usuario")
    private Long usuario;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    @Column(name = "OpcionRespuesta")
    private String opcionRespuesta;

    public DatoElementoFormulario() {
    }

    public DatoElementoFormulario(Long idDatoElementoFormulario) {
        this.idDatoElementoFormulario = idDatoElementoFormulario;
    }

    public Long getIdDatoElementoFormulario() {
        return idDatoElementoFormulario;
    }

    public void setIdDatoElementoFormulario(Long idDatoElementoFormulario) {
        this.idDatoElementoFormulario = idDatoElementoFormulario;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

    public FormularioTramite getFormularioTramite() {
        return formularioTramite;
    }

    public void setFormularioTramite(FormularioTramite formularioTramite) {
        this.formularioTramite = formularioTramite;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public String getPestania() {
        return pestania;
    }

    public void setPestania(String pestania) {
        this.pestania = pestania;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getNombreElemento() {
        return nombreElemento;
    }

    public void setNombreElemento(String nombreElemento) {
        this.nombreElemento = nombreElemento;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
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
        hash += (idDatoElementoFormulario != null ? idDatoElementoFormulario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatoElementoFormulario)) {
            return false;
        }
        DatoElementoFormulario other = (DatoElementoFormulario) object;
        if ((this.idDatoElementoFormulario == null && other.idDatoElementoFormulario != null) || (this.idDatoElementoFormulario != null && !this.idDatoElementoFormulario.equals(other.idDatoElementoFormulario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.DatoElementoFormulario[ idDatoElementoFormulario=" + idDatoElementoFormulario + " ]";
    }

    public String getOpcionRespuesta() {
        return opcionRespuesta;
    }

    public void setOpcionRespuesta(String opcionRespuesta) {
        this.opcionRespuesta = opcionRespuesta;
    }

    public TipoElementoHtml getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoElementoHtml tipoElemento) {
        this.tipoElemento = tipoElemento;
    }
    

}
