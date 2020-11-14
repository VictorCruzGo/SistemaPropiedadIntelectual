/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.pojo;

import org.gob.snp.entidades.ArchivoTxtNiza;
import org.gob.snp.entidades.SMSignoClaseNiza;

/**
 *
 * @author chanoRojas
 */
public class ArchivoNizaPojo {
    
    private SMSignoClaseNiza sMSignoClaseNiza=new SMSignoClaseNiza(); //    Objeto que almacena a la tabla relacional de tramite y clae niza
    private ArchivoTxtNiza archivoTxtNiza=new ArchivoTxtNiza(); //    objeto que tendra los archivos de cada clase niza

    public SMSignoClaseNiza getsMSignoClaseNiza() {
        return sMSignoClaseNiza;
    }

    public void setsMSignoClaseNiza(SMSignoClaseNiza sMSignoClaseNiza) {
        this.sMSignoClaseNiza = sMSignoClaseNiza;
    }

    public ArchivoTxtNiza getArchivoTxtNiza() {
        return archivoTxtNiza;
    }

    public void setArchivoTxtNiza(ArchivoTxtNiza archivoTxtNiza) {
        this.archivoTxtNiza = archivoTxtNiza;
    }
    
}

