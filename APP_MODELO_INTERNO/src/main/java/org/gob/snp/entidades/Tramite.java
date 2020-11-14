/*
 * To change this template, choose Tools | Templates
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
import org.gob.snp.entidades.vistas.EtapaTramite;
import org.gob.snp.entidades.vistas.EstadoProceso;
import org.gob.snp.entidades.vistas.TipoTramite;

/**
 *
 * @author chanorojas
 */
@Entity
@Table(name = "Tramite")
public class Tramite implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTramite")
    private Long idTramite;
    @Column(name = "Tramite")
    private String tramite;
    @ManyToOne
    @JoinColumn(name = "TipoTramite", referencedColumnName = "Codigo")
    private TipoTramite tipoTramite;
    @ManyToOne
    @JoinColumn(name = "EtapaTramite", referencedColumnName = "Codigo")
    private EtapaTramite etapaTramite;

    @Column(name = "EtapaPadre")
    private Long etapaPadre;

    @ManyToOne
    @JoinColumn(name = "EstadoProceso", referencedColumnName = "Codigo")
    private EstadoProceso estadoProceso;

    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;

    @Column(name = "Vigente")
    private Boolean vigente;

    @JoinColumn(name = "IdExpediente", referencedColumnName = "IdExpediente")
    @ManyToOne(optional = false)
    private Expediente expediente;
    @JoinColumn(name = "IdRegional", referencedColumnName = "IdRegional")
    @ManyToOne(optional = true)
    private Regional regional;
    @Column(name = "Correlativo")
    private Integer correlativo;
    @Column(name = "PDFRuta")
    private String PDFRuta;
    @Column(name = "CodigoDia")
    private String codigoDia;
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "NroFojas")
    private Integer nroFojas;
    @Column(name = "Usuario")
    private Long usuarioModificador;
    @Column(name = "FechaUltimaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaModificacion;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "TienePrioridad")
    private Boolean tienePrioridad;
    @Column(name = "TramiteUnipersonal")
    private Boolean tramiteUnipersonal;
    @Column(name = "EtapaValidacion")
    private String etapaValidacion;
    @Column(name = "NumeroPaginas")
    private Integer numeroPaginas;

    public Tramite() {
    }

    public Tramite(Long idTramite) {
        this.idTramite = idTramite;
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

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public EtapaTramite getEtapaTramite() {
        return etapaTramite;
    }

    public void setEtapaTramite(EtapaTramite etapaTramite) {
        this.etapaTramite = etapaTramite;
    }

    public EstadoProceso getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(EstadoProceso estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Boolean getVigente() {
        return vigente;
    }

    public void setVigente(Boolean vigente) {
        this.vigente = vigente;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public String getPDFRuta() {
        return PDFRuta;
    }

    public void setPDFRuta(String PDFRuta) {
        this.PDFRuta = PDFRuta;
    }

    public String getCodigoDia() {
        return codigoDia;
    }

    public void setCodigoDia(String codigoDia) {
        this.codigoDia = codigoDia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNroFojas() {
        return nroFojas;
    }

    public void setNroFojas(Integer nroFojas) {
        this.nroFojas = nroFojas;
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

    public Long getEtapaPadre() {
        return etapaPadre;
    }

    public void setEtapaPadre(Long etapaPadre) {
        this.etapaPadre = etapaPadre;
    }

    public Boolean getTienePrioridad() {
        return tienePrioridad;
    }

    public void setTienePrioridad(Boolean tienePrioridad) {
        this.tienePrioridad = tienePrioridad;
    }

    public Boolean getTramiteUnipersonal() {
        return tramiteUnipersonal;
    }

    public void setTramiteUnipersonal(Boolean tramiteUnipersonal) {
        this.tramiteUnipersonal = tramiteUnipersonal;
    }

    public String getEtapaValidacion() {
        return etapaValidacion;
    }

    public void setEtapaValidacion(String etapaValidacion) {
        this.etapaValidacion = etapaValidacion;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTramite != null ? idTramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.idTramite == null && other.idTramite != null) || (this.idTramite != null && !this.idTramite.equals(other.idTramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.Tramite[ idTramite=" + idTramite + " ]";
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
