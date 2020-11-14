/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.gob.snp.entidades.vistas.EstadoPublicacion;

/**
 * Mapeo de la Entidad a persistir Tabla DocumentoPublicacion
 * @author Susana Escobar Paz
 * @see DocumentoPublicacion
 * @see DocumentoPublicacionService
 * @version 1.0, 23/02/2015
 * <pre>
 * 
 * </pre>
 */

@Entity
@Table(name = "DocumentoPublicacion")

public class DocumentoPublicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDocumentoPublicacion")
    private Long idDocumentoPublicacion;
    
    @JoinColumn(name = "IdPublicacion", referencedColumnName = "IdPublicacion")
    @ManyToOne(optional = true)
    private Publicacion publicacion;
    
    @Column(name = "NombreArchivo")
    private String nombreArchivo;
    @Lob
    @Column(name = "ArchivoPublicacion")
    private byte[] archivoPublicacion;
    
      @ManyToOne
    @JoinColumn(name = "EstadoPublicacion", referencedColumnName = "Codigo")
    private EstadoPublicacion estadoPublicacion;
    
//    @Column(name = "EstadoPublicacion")
//    private String estadoPublicacion;

    public DocumentoPublicacion() {
    }

    public DocumentoPublicacion(Long idDocumentoPublicacion) {
        this.idDocumentoPublicacion = idDocumentoPublicacion;
    }

    public Long getIdDocumentoPublicacion() {
        return idDocumentoPublicacion;
    }

    public void setIdDocumentoPublicacion(Long idDocumentoPublicacion) {
        this.idDocumentoPublicacion = idDocumentoPublicacion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public byte[] getArchivoPublicacion() {
        return archivoPublicacion;
    }

    public void setArchivoPublicacion(byte[] archivoPublicacion) {
        this.archivoPublicacion = archivoPublicacion;
    }

    public EstadoPublicacion getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(EstadoPublicacion estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }
    
   

//    public String getEstadoPublicacion() {
//        return estadoPublicacion;
//    }
//
//    public void setEstadoPublicacion(String estadoPublicacion) {
//        this.estadoPublicacion = estadoPublicacion;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumentoPublicacion != null ? idDocumentoPublicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoPublicacion)) {
            return false;
        }
        DocumentoPublicacion other = (DocumentoPublicacion) object;
        if ((this.idDocumentoPublicacion == null && other.idDocumentoPublicacion != null) || (this.idDocumentoPublicacion != null && !this.idDocumentoPublicacion.equals(other.idDocumentoPublicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.DocumentoPublicacion[ idDocumentoPublicacion=" + idDocumentoPublicacion + " ]";
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    
}
