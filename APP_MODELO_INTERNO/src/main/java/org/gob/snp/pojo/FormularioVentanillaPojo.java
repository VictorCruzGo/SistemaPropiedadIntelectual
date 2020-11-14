package org.gob.snp.pojo;

import java.util.ArrayList;
import java.util.List;
import org.gob.snp.entidades.DatoTramiteVentanillaEForma;
import org.gob.snp.entidades.ValorTramiteVentanillaEForma;

/**
 *
 * @author Henrry Guzman
 */
public class FormularioVentanillaPojo implements Cloneable {

    private DatoTramiteVentanillaEForma datoTramiteVentanillaEForma;
    private List<ValorTramiteVentanillaEForma> valorTramiteVentanillaEFormaLista = new ArrayList<ValorTramiteVentanillaEForma>();
    private List<String> valorTramiteVentanillaEFormaRespuestaLista = new ArrayList<String>();
    
    

    public DatoTramiteVentanillaEForma getDatoTramiteVentanillaEForma() {
        return datoTramiteVentanillaEForma;
    }

    public void setDatoTramiteVentanillaEForma(DatoTramiteVentanillaEForma datoTramiteVentanillaEForma) {
        this.datoTramiteVentanillaEForma = datoTramiteVentanillaEForma;
    }

    public List<ValorTramiteVentanillaEForma> getValorTramiteVentanillaEFormaLista() {
        return valorTramiteVentanillaEFormaLista;
    }

    public void setValorTramiteVentanillaEFormaLista(List<ValorTramiteVentanillaEForma> valorTramiteVentanillaEFormaLista) {
        this.valorTramiteVentanillaEFormaLista = valorTramiteVentanillaEFormaLista;
    }

    public List<String> getValorTramiteVentanillaEFormaRespuestaLista() {
        return valorTramiteVentanillaEFormaRespuestaLista;
    }

    public void setValorTramiteVentanillaEFormaRespuestaLista(List<String> valorTramiteVentanillaEFormaRespuestaLista) {
        this.valorTramiteVentanillaEFormaRespuestaLista = valorTramiteVentanillaEFormaRespuestaLista;
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
