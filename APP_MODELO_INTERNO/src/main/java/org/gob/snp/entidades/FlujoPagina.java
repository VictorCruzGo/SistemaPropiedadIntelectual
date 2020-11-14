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
 * Mapeo de la Entidad a persistir Tabla FlujoPagina 
 * @author Eddy Valero
 * @see FlujoPaginaService
 * @see FlujoPaginaServiceImpl
 * @version 1.0, 12/01/2015
 */
@Entity
@Table(name = "FlujoPagina")
public class FlujoPagina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdFlujoPagina")
    private Long idFlujoPagina;
    @Column(name = "Orden")
    private Integer orden;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Usuario")
    private Long usuario;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    
    @JoinColumn(name = "IdPagina", referencedColumnName = "IdPagina")
    @ManyToOne(optional = true)
    private Pagina pagina;

    @JoinColumn(name = "IdFlujo", referencedColumnName = "IdFlujo")
    @ManyToOne(optional = true)
    private Flujo flujo;
    
    public FlujoPagina() {
    }

    public FlujoPagina(Long idFlujoPagina) {
        this.idFlujoPagina = idFlujoPagina;
    }

    public Long getIdFlujoPagina() {
        return idFlujoPagina;
    }

    public void setIdFlujoPagina(Long idFlujoPagina) {
        this.idFlujoPagina = idFlujoPagina;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
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

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    public Flujo getFlujo() {
        return flujo;
    }

    public void setFlujo(Flujo flujo) {
        this.flujo = flujo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFlujoPagina != null ? idFlujoPagina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlujoPagina)) {
            return false;
        }
        FlujoPagina other = (FlujoPagina) object;
        if ((this.idFlujoPagina == null && other.idFlujoPagina != null) || (this.idFlujoPagina != null && !this.idFlujoPagina.equals(other.idFlujoPagina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.FlujoPagina[ idFlujoPagina=" + idFlujoPagina + " ]";
    }
    
}
