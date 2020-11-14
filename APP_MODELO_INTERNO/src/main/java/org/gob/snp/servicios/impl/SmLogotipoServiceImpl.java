/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.SMImagen;
import org.gob.snp.entidades.SMLogotipo;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.ErrorAplicacionService;
import org.gob.snp.servicios.SmLogotipoService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.TramiteService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jonathanvaldivia
 */
public class SmLogotipoServiceImpl extends GenericDaoImpl<SMLogotipo> implements SmLogotipoService {

    @Autowired
    private TramiteService tramiteService;
    @Autowired
    private SmSignoMarcaService smSignoMarcaService;
    @Autowired
    private ErrorAplicacionService errorAplicacionService;

    @Override
    public SMLogotipo persistSmLogotipo(SMLogotipo sMLogotipo) throws Exception {
        try {
            super.persist(sMLogotipo);
        } catch (Exception e) {

            throw e;
        }
        return sMLogotipo;
    }

    @Override
    public SMLogotipo mergeSmLogotipo(SMLogotipo sMLogotipo) throws Exception {
        try {
            super.merge(sMLogotipo);
        } catch (Exception e) {
            throw e;
        }
        return sMLogotipo;
    }

    @Override
    public void removeSmlogotipo(SMLogotipo sMLogotipo) throws Exception {
        try {
            super.remove(sMLogotipo);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<SMLogotipo> listaSmLogotipo() {
        List<SMLogotipo> lista = hibernateTemplate.find(
                "SELECT s FROM SMLogotipo s");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.emptyList();
    }

    @Override
    public List<SMLogotipo> listaSmLogotipoXSmSignoMarca(SMSignoMarca sMSignoMarca) {
        List<SMLogotipo> lista = hibernateTemplate.find(
                "SELECT e FROM SMLogotipo e "
                + " where e.sMSignoMarca.tramite = " + sMSignoMarca.getTramite().getIdTramite());
        if (!lista.isEmpty()) {
            System.out.println("encontro la lista del tramite----->" + sMSignoMarca.getTramite().getIdTramite());
            return lista;
        }
        return Collections.emptyList();
    }

    @Override
    public List<SMLogotipo> encuentraSmLogoTipoPorTramite(Tramite tramite) {
        List<SMLogotipo> lista = hibernateTemplate.find(""
                + "select j "
                + "from SMLogotipo j "
                + "where j.sMSignoMarca.tramite.idTramite = " + tramite.getIdTramite() + "");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
    }
    
    @Override
    public Tramite encuentraTramitePorNombreImagen(String imagen, List<Tramite> listaTramites) {
        if (!imagen.equals("")) {
            List<SMLogotipo> listaLogoTipo = hibernateTemplate.find(""
                    + "select j "
                    + "from SMLogotipo j "
                    + "where j.uRLLogotipo = '" + imagen + "' ");
            for (Tramite tramite : listaTramites) {
                for (SMLogotipo sMSLogotipo : listaLogoTipo) {
                    if (sMSLogotipo.getsMSignoMarca().getTramite().getIdTramite().equals(tramite.getIdTramite())) {
                        return tramite;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public int encuentraPosicionListadoLogoTipo(List<SMLogotipo> listaSMLogotipo, SMLogotipo sMLogotipo) {
        int posicion = 0;
        int cont = 0;
        for (SMLogotipo logotipo : listaSMLogotipo) {
            if (logotipo.getNombreArchivo().equals(sMLogotipo.getNombreArchivo())) {
                posicion = cont;
            }
            cont++;
        }
        return posicion;
    }

    @Override
    public int encuentraPosicionListadoLogoTipoOriginal(List<SMImagen> listaSMLogotipoImagen, SMImagen sMLogotipoImagen) {
        int posicion = 0;
        int cont = 0;
        for (SMImagen sMImagen : listaSMLogotipoImagen) {
            if (sMImagen.getIdSMLogotipo().getNombreArchivo().equals(sMLogotipoImagen.getIdSMLogotipo().getNombreArchivo())) {
                posicion = cont;
            }
            cont++;
        }
        return posicion;
    }

    @Override
    public List<SMLogotipo> guardaImagenPrincipalEnLaListaDeImagenes(List<SMLogotipo> listaSMLogotipo, SMLogotipo sMLogotipoSeleccionado) {
        List<SMLogotipo> listaSMLogotipoAux = new ArrayList<SMLogotipo>();
        for (SMLogotipo logotipo : listaSMLogotipo) {
            logotipo.setPrincipal(logotipo.getNombreArchivo().equals(sMLogotipoSeleccionado.getNombreArchivo()));
            listaSMLogotipoAux.add(logotipo);
        }
        return listaSMLogotipoAux;
    }

    @Override
    public List<SMImagen> guardaImagenPrincipalEnLaListaDeImagenesOriginal(List<SMImagen> listaSMLogotipoImagen, SMImagen logotipoImagenObjetoSelecciona) {
        List<SMImagen> listaSMImagenTipoAux = new ArrayList<SMImagen>();
        for (SMImagen sMImagen : listaSMLogotipoImagen) {
            if (sMImagen.getIdSMLogotipo().getNombreArchivo().equals(logotipoImagenObjetoSelecciona.getIdSMLogotipo().getNombreArchivo())) {
                sMImagen.getIdSMLogotipo().setPrincipal(Boolean.TRUE);
            } else {
                sMImagen.getIdSMLogotipo().setPrincipal(Boolean.FALSE);
            }
            listaSMImagenTipoAux.add(sMImagen);
        }
        for (SMImagen sMImagen : listaSMImagenTipoAux) {
            System.out.println("el valor de smimagen-------------------------------->" + sMImagen.getIdSMLogotipo().getPrincipal() + "");
        }
        return listaSMImagenTipoAux;
    }

    


}
