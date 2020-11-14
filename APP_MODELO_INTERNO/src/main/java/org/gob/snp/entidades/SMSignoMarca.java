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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.gob.snp.entidades.vistas.TipoGenero;
import org.gob.snp.entidades.vistas.TipoSolicitudDeposito;
import org.gob.snp.entidades.vistas.TipoSolicitudSigno;

/**
 *
 * @author Jonathan Valdivia
 */
@Entity
@Table(name = "SMSignoMarca")
public class SMSignoMarca implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    private Tramite tramite;

    @Column(name = "Marca")
    public String marca;
    
    @ManyToOne
    @JoinColumn(name = "TipoSolicitudSigno", referencedColumnName = "Codigo")
    private TipoSolicitudSigno tipoSolicitudSigno;
    
    @ManyToOne
    @JoinColumn(name = "TipoGenero", referencedColumnName = "Codigo")
    private TipoGenero tipoGenero;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "PrioridadAndina")
    private String prioridadAndina;

    @Column(name = "ProtegeColor")
    private Boolean protegeColor;

    @ManyToOne
    @JoinColumn(name = "TipoSolicitudDeposito", referencedColumnName = "Codigo")
    private TipoSolicitudDeposito TipoSolicitudDeposito;
    @Column(name = "IdSignoPadre")
    private Long idSignoPadre;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public SMSignoMarca() {
    }

    public SMSignoMarca(Tramite idTramite) {
        this.tramite = tramite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoSolicitudDeposito getTipoSolicitudDeposito() {
        return TipoSolicitudDeposito;
    }

    public void setTipoSolicitudDeposito(TipoSolicitudDeposito TipoSolicitudDeposito) {
        this.TipoSolicitudDeposito = TipoSolicitudDeposito;
    }

    public TipoSolicitudSigno getTipoSolicitudSigno() {
        return tipoSolicitudSigno;
    }

    public void setTipoSolicitudSigno(TipoSolicitudSigno tipoSolicitudSigno) {
        this.tipoSolicitudSigno = tipoSolicitudSigno;
    }

    public TipoGenero getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(TipoGenero tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public Long getIdSignoPadre() {
        return idSignoPadre;
    }

    public void setIdSignoPadre(Long idSignoPadre) {
        this.idSignoPadre = idSignoPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tramite != null ? tramite.hashCode() : 0);
        return hash;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getProtegeColor() {
        return protegeColor;
    }

    public void setProtegeColor(Boolean protegeColor) {
        this.protegeColor = protegeColor;
    }

    public String getPrioridadAndina() {
        return prioridadAndina;
    }

    public void setPrioridadAndina(String prioridadAndina) {
        this.prioridadAndina = prioridadAndina;
    }

    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SMSignoMarca)) {
            return false;
        }
        SMSignoMarca other = (SMSignoMarca) object;
        if ((this.tramite == null && other.tramite != null) || (this.tramite != null && !this.tramite.equals(other.tramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMSignoMarca[ idTramite=" + tramite + " ]";
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }

}
