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
import org.gob.snp.entidades.vistas.EstadoRegistro;

/**
 *
 * @author chano
 */
@Entity
@Table(name = "Registro")
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdRegistro")
    private Long idRegistro;
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = true)
    private Tramite tramite;
    
    @Column(name = "NroTitulo")
    private String nroTitulo;
    
    @Column(name = "Serie")
    private String serie;
    
    @Column(name = "Registro")
    private String registro;
    
    @Column(name = "SerieRegistro")
    private String serieRegistro;

    @Column(name = "Resolucion")
    private String resolucion;
    
    @Column(name = "GestionResolucion")
    private String gestionResolucion;

    @Column(name = "FechaResolucionRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResolucionRegistro;
    
    @Column(name = "Usuario")
    private Long usuario;
    
    @Column(name = "FechaUltimaModificacion")
     @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public Registro() {
    }

    public Registro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getSerieRegistro() {
        return serieRegistro;
    }
    
    public void setSerieRegistro(String serieRegistro) {
        this.serieRegistro = serieRegistro;
    }

    public String getNroTitulo() {
        return nroTitulo;
    }

    public void setNroTitulo(String nroTitulo) {
        this.nroTitulo = nroTitulo;
    }

    public Date getFechaResolucionRegistro() {
        return fechaResolucionRegistro;
    }

    public void setFechaResolucionRegistro(Date fechaResolucionRegistro) {
        this.fechaResolucionRegistro = fechaResolucionRegistro;
    }

     @ManyToOne
    @JoinColumn(name = "EstadoRegistro", referencedColumnName = "Codigo")
    private EstadoRegistro estadoRegistro;

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

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Registro[ idRegistro=" + idRegistro + " ]";
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getGestionResolucion() {
        return gestionResolucion;
    }

    public void setGestionResolucion(String gestionResolucion) {
        this.gestionResolucion = gestionResolucion;
    }

    public EstadoRegistro getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(EstadoRegistro estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }        
}
