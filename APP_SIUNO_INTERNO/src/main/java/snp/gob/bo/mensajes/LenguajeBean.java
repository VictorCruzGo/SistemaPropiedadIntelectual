/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snp.gob.bo.mensajes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import snp.gob.bo.entidades.bean.common.AbstractManagedBean;

/**
 *
 * @author eddy
 */
@ManagedBean(name = "language")
@SessionScoped
public class LenguajeBean extends AbstractManagedBean implements Serializable {

//    private static final long serialVersionUID = 1L;

//    private String localeCode;

//    private String eligeIdioma;

    public LenguajeBean() {
    }

    private static Map<String, Object> countries;

    static {
        countries = new LinkedHashMap<String, Object>();
        countries.put("English", new Locale("en")); //label, value
        countries.put("Español", new Locale("es"));
    }

    public Map<String, Object> getCountriesInMap() {
        return countries;
    }

    public void modificaidioma(ValueChangeEvent e) {
        String newLocaleValue = getIdiomaSession();
        //loop country map to compare the locale code
        for (Map.Entry<String, Object> entry : countries.entrySet()) {
            if (entry.getValue().toString().equals(newLocaleValue)) {
                FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale) entry.getValue());
            }
        }

    }
    

}
