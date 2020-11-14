/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.pojo;

import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.ValorTramiteVentanillaEForma;

/**
 *
 * @author Jonathan Valdivia
 */
public class ExamenFormaPojo {
    
    private DatoTramiteVentanillaEForma datoTramiteVentanillaEForma = new DatoTramiteVentanillaEForma(); //    objeto que almacenara los padres
    private ValorTramiteVentanillaEForma valorTramiteVentanillaEForma = new ValorTramiteVentanillaEForma(); //    objeto que almacenara los hijos

    public ValorTramiteVentanillaEForma getValorTramiteVentanillaEForma() {
        return valorTramiteVentanillaEForma;
    }

    public void setValorTramiteVentanillaEForma(ValorTramiteVentanillaEForma valorTramiteVentanillaEForma) {
        this.valorTramiteVentanillaEForma = valorTramiteVentanillaEForma;
    }

    public DatoTramiteVentanillaEForma getDatoTramiteVentanillaEForma() {
        return datoTramiteVentanillaEForma;
    }

    public void setDatoTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma) {
        this.datoTramiteVentanillaEForma = datoTramiteVentanillaEForma;
    }
    
}

