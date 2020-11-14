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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author Eddy Valero
 * @version 1.0, 02/09/2015
 */
@Entity
@Table(name = "busqueda_smmarca")
public class BusquedaSmmarca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdTramite")
    private long idTramite;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "Genero")
    private String genero;
    @Lob
    @Column(name = "DescripcionMarca")
    private String descripcionMarca;
    @Id
    @Column(name = "ClaseNiza")
    private String claseNiza;
    @Column(name = "PrioridadAndina")
    private String prioridadAndina;
    @Column(name = "TipoDeSigno")
    private String tipoDeSigno;
    @Column(name = "Tramite")
    private String tramite;

    public BusquedaSmmarca() {
    }

    public long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(long idTramite) {
        this.idTramite = idTramite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }

    public String getClaseNiza() {
        return claseNiza;
    }

    public void setClaseNiza(String claseNiza) {
        this.claseNiza = claseNiza;
    }

    public String getPrioridadAndina() {
        return prioridadAndina;
    }

    public void setPrioridadAndina(String prioridadAndina) {
        this.prioridadAndina = prioridadAndina;
    }

    public String getTipoDeSigno() {
        return tipoDeSigno;
    }

    public void setTipoDeSigno(String tipoDeSigno) {
        this.tipoDeSigno = tipoDeSigno;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }
    
    
    
}
