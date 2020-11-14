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
import org.gob.snp.entidades.vistas.TipoRequisito;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "DatoTramiteVentanillaEForma")
public class DatoTramiteVentanillaEForma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDatoTramiteVentanillaEForma")
    private Long idDatoTramiteVentanillaEForma;

    @ManyToOne
    @JoinColumn(name = "IdAnalisisEtapa", referencedColumnName = "IdAnalisisEtapa")
    private AnalisisEtapa analisisEtapa;

    @ManyToOne
    @JoinColumn(name = "TipoRequisito", referencedColumnName = "Codigo")
    private TipoRequisito tipoRequisito;
    @Column(name = "Codigo")
    private String codigo;
    @Lob
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Presento")
    private Boolean presento;
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "Posicion")
    private Integer posicion;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
   

    public DatoTramiteVentanillaEForma() {
    }

    public DatoTramiteVentanillaEForma(Long idDatoTramiteVentanillaEForma) {
        this.idDatoTramiteVentanillaEForma = idDatoTramiteVentanillaEForma;
    }

    public Long getIdDatoTramiteVentanillaEForma() {
        return idDatoTramiteVentanillaEForma;
    }

    public void setIdDatoTramiteVentanillaEForma(Long idDatoTramiteVentanillaEForma) {
        this.idDatoTramiteVentanillaEForma = idDatoTramiteVentanillaEForma;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

  
    public TipoRequisito getTipoRequisito() {
        return tipoRequisito;
    }

    public void setTipoRequisito(TipoRequisito tipoRequisito) {
        this.tipoRequisito = tipoRequisito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getPresento() {
        return presento;
    }

    public void setPresento(Boolean presento) {
        this.presento = presento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
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
        hash += (idDatoTramiteVentanillaEForma != null ? idDatoTramiteVentanillaEForma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatoTramiteVentanillaEForma)) {
            return false;
        }
        DatoTramiteVentanillaEForma other = (DatoTramiteVentanillaEForma) object;
        if ((this.idDatoTramiteVentanillaEForma == null && other.idDatoTramiteVentanillaEForma != null) || (this.idDatoTramiteVentanillaEForma != null && !this.idDatoTramiteVentanillaEForma.equals(other.idDatoTramiteVentanillaEForma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.DatoTramiteVentanillaEForma[ idDatoTramiteVentanillaEForma=" + idDatoTramiteVentanillaEForma + " ]";
    }

         

}
