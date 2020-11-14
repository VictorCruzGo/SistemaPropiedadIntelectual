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
 *
 * @author eddy valero
 */
@Entity
@Table(name = "RegistroExistenteEF")
public class RegistroExistenteEF implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRegistroExistenteEF")
    private Long idRegistroExistenteEF;
    @Column(name = "IdTramite")
    private Long idTramite;
    @Column(name = "Tramite")
    private String tramite;
    @Column(name = "NumeroClaseNiza")
    private String numeroClaseNiza;
    @Lob
    @Column(name = "ListaProducto")
    private String listaProducto;
    @Column(name = "Registro")
    private String registro;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
    @JoinColumn(name = "IdAnalisisEtapa", referencedColumnName = "IdAnalisisEtapa")
    @ManyToOne(optional = false)
    private AnalisisEtapa analisisEtapa;

    public RegistroExistenteEF() {
    }

    public RegistroExistenteEF(Long idRegistroExistenteEF) {
        this.idRegistroExistenteEF = idRegistroExistenteEF;
    }

    public Long getIdRegistroExistenteEF() {
        return idRegistroExistenteEF;
    }

    public void setIdRegistroExistenteEF(Long idRegistroExistenteEF) {
        this.idRegistroExistenteEF = idRegistroExistenteEF;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public String getNumeroClaseNiza() {
        return numeroClaseNiza;
    }

    public void setNumeroClaseNiza(String numeroClaseNiza) {
        this.numeroClaseNiza = numeroClaseNiza;
    }

    public String getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(String listaProducto) {
        this.listaProducto = listaProducto;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistroExistenteEF != null ? idRegistroExistenteEF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroExistenteEF)) {
            return false;
        }
        RegistroExistenteEF other = (RegistroExistenteEF) object;
        if ((this.idRegistroExistenteEF == null && other.idRegistroExistenteEF != null) || (this.idRegistroExistenteEF != null && !this.idRegistroExistenteEF.equals(other.idRegistroExistenteEF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.RegistroExistenteEF[ idRegistroExistenteEF=" + idRegistroExistenteEF + " ]";
    }
    
}
