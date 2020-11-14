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

/**
 *
 * @author eddy
 */
@Entity
@Table(name = "DIGArchivoDocumento")
public class DIGArchivoDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDIGArchivoDocumento")
    private Long idDIGArchivoDocumento;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    
    @JoinColumn(name = "IdDocumento", referencedColumnName = "IdDocumento")
    @ManyToOne(optional = false)
    private Documento documento;
    
    public DIGArchivoDocumento() {
    }

    public DIGArchivoDocumento(Long idDIGArchivoDocumento) {
        this.idDIGArchivoDocumento = idDIGArchivoDocumento;
    }

    public Long getIdDIGArchivoDocumento() {
        return idDIGArchivoDocumento;
    }

    public void setIdDIGArchivoDocumento(Long idDIGArchivoDocumento) {
        this.idDIGArchivoDocumento = idDIGArchivoDocumento;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDIGArchivoDocumento != null ? idDIGArchivoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DIGArchivoDocumento)) {
            return false;
        }
        DIGArchivoDocumento other = (DIGArchivoDocumento) object;
        if ((this.idDIGArchivoDocumento == null && other.idDIGArchivoDocumento != null) || (this.idDIGArchivoDocumento != null && !this.idDIGArchivoDocumento.equals(other.idDIGArchivoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gob.snp.entidades.DIGArchivoDocumento[ idDIGArchivoDocumento=" + idDIGArchivoDocumento + " ]";
    }
    
}
