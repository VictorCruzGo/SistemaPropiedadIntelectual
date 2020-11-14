/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.entidades.vistas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eddy Valero
 */
@Entity
@Table(name = "busqueda_marcas")
public class BusquedaMarcas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdTramite")
    private long idTramite;
    @Basic(optional = false)
    @Id
    @Column(name = "IdSolicitante")
    private long idSolicitante;
    @Id
    @Basic(optional = false)
    @Column(name = "IdPersonaEmpresaTramite")
    private long idPersonaEmpresaTramite;
    @Column(name = "CodigoSM")
    private String codigoSM;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "Clase")
    private String clase;
    @Column(name = "Solicitante")
    private String solicitante;
    @Column(name = "NumeroDocumento")
    private String numeroDocumento;
    @Column(name = "Pais")
    private String pais;
    @Basic(optional = false)
    @Id
    @Column(name = "IdApoderado")
    private long idApoderado;
    @Column(name = "Apoderado")
    private String apoderado;

    public BusquedaMarcas() {
    }

    public long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(long idTramite) {
        this.idTramite = idTramite;
    }

    public long getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public long getIdPersonaEmpresaTramite() {
        return idPersonaEmpresaTramite;
    }

    public void setIdPersonaEmpresaTramite(long idPersonaEmpresaTramite) {
        this.idPersonaEmpresaTramite = idPersonaEmpresaTramite;
    }

    public String getCodigoSM() {
        return codigoSM;
    }

    public void setCodigoSM(String codigoSM) {
        this.codigoSM = codigoSM;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(long idApoderado) {
        this.idApoderado = idApoderado;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }

    
    
}
