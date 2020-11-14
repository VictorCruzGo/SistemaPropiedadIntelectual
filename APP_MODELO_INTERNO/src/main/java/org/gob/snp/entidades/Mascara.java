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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eddy
 */
@Entity
@Table(name = "Mascara")
public class Mascara implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdMascara")
    private Long idMascara;
    @Column(name = "TamanioNivel")
    private Integer tamanioNivel;
    @Basic(optional = false)
    @Column(name = "Mascara")
    private String mascara;
    @Basic(optional = false)
    @Column(name = "GrupoNivel")
    private String grupoNivel;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "Usuario")
    private Long usuario;

    public Mascara() {
    }

    public Mascara(Long idMascara) {
        this.idMascara = idMascara;
    }

    public Mascara(Long idMascara, String mascara, String grupoNivel) {
        this.idMascara = idMascara;
        this.mascara = mascara;
        this.grupoNivel = grupoNivel;
    }

    public Long getIdMascara() {
        return idMascara;
    }

    public void setIdMascara(Long idMascara) {
        this.idMascara = idMascara;
    }

    public Integer getTamanioNivel() {
        return tamanioNivel;
    }

    public void setTamanioNivel(Integer tamanioNivel) {
        this.tamanioNivel = tamanioNivel;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getGrupoNivel() {
        return grupoNivel;
    }

    public void setGrupoNivel(String grupoNivel) {
        this.grupoNivel = grupoNivel;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        hash += (idMascara != null ? idMascara.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mascara)) {
            return false;
        }
        Mascara other = (Mascara) object;
        if ((this.idMascara == null && other.idMascara != null) || (this.idMascara != null && !this.idMascara.equals(other.idMascara))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Mascara[ idMascara=" + idMascara + " ]";
    }
    
}
