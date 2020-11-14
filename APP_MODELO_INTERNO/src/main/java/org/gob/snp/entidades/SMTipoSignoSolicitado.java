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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.gob.snp.entidades.vistas.EstadoProceso;
import org.gob.snp.entidades.vistas.TipoSigno;

/**
 *
 * @author jonas
 */
@Entity
@Table(name = "SMTipoSignoSolicitado")
public class SMTipoSignoSolicitado implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSMTipoSignoSolicitado")
    private Long idSMTipoSignoSolicitado;

    @JoinColumn(name = "IdTramite", referencedColumnName = "IdTramite")
    @ManyToOne(optional = false)
    private SMSignoMarca sMSignoMarca;

    @Column(name = "Otro")
    private String otro;

    @ManyToOne
    @JoinColumn(name = "TipoSigno", referencedColumnName = "Codigo")
    private TipoSigno tipoSigno;

    @Column(name = "Usuario")
    private Long usuarioModificador;

    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;

    public SMTipoSignoSolicitado() {
    }

    public SMTipoSignoSolicitado(Long idSMTipoSignoSolicitado) {
        this.idSMTipoSignoSolicitado = idSMTipoSignoSolicitado;
    }

    public Long getIdSMTipoSignoSolicitado() {
        return idSMTipoSignoSolicitado;
    }

    public void setIdSMTipoSignoSolicitado(Long idSMTipoSignoSolicitado) {
        this.idSMTipoSignoSolicitado = idSMTipoSignoSolicitado;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public TipoSigno getTipoSigno() {
        return tipoSigno;
    }

    public void setTipoSigno(TipoSigno tipoSigno) {
        this.tipoSigno = tipoSigno;
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
        hash += (idSMTipoSignoSolicitado != null ? idSMTipoSignoSolicitado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMTipoSignoSolicitado)) {
            return false;
        }
        SMTipoSignoSolicitado other = (SMTipoSignoSolicitado) object;
        if ((this.idSMTipoSignoSolicitado == null && other.idSMTipoSignoSolicitado != null) || (this.idSMTipoSignoSolicitado != null && !this.idSMTipoSignoSolicitado.equals(other.idSMTipoSignoSolicitado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.SMTipoSignoSolicitado[ idSMTipoSignoSolicitado=" + idSMTipoSignoSolicitado + " ]";
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

    public SMSignoMarca getsMSignoMarca() {
        return sMSignoMarca;
    }

    public void setsMSignoMarca(SMSignoMarca sMSignoMarca) {
        this.sMSignoMarca = sMSignoMarca;
    }

}
