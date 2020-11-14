/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.DIGArchivoDocumento;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.enums.EnumTipoOperacionUsuario;
import org.gob.snp.servicios.DIGArchivoDocumentoService;
import org.gob.snp.servicios.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eddyvalero
 */
public class DIGArchivoDocumentoServiceImpl extends GenericDaoImpl<DIGArchivoDocumento> implements DIGArchivoDocumentoService {

    @Autowired
    private DocumentoService documentoService;

    @Override
    public DIGArchivoDocumento persistDIGArchivoDocumento(DIGArchivoDocumento dIGArchivoDocumento) throws Exception {
        try {
            super.persist(dIGArchivoDocumento);
            return dIGArchivoDocumento;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public DIGArchivoDocumento mergeDIGArchivoDocumento(DIGArchivoDocumento dIGArchivoDocumento) throws Exception {
        try {
            super.merge(dIGArchivoDocumento);
            return dIGArchivoDocumento;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void removeDIGArchivoDocumento(DIGArchivoDocumento dIGArchivoDocumento) throws Exception {
        try {
            super.remove(dIGArchivoDocumento);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<DIGArchivoDocumento> listaDIGArchivoDocumentoWeb() throws Exception {
        try {
            List<DIGArchivoDocumento> lista = hibernateTemplate.find(
                    "SELECT e "
                    + "FROM DIGArchivoDocumento e");
            if (!lista.isEmpty()) {
                return lista;
            }

            return Collections.emptyList();

        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * Método que guarda la lista de los Documentos y los DIGArchivoDocumentos
     * que se Digitalizaron
     *
     * @param listaDIGArchivoDocumento
     * @return String: retornar la regla de navegacion que permite volver al
     * formulario anterior
     *
     * <pre>
     * ----------------------------------------------------
     * Creado:  Fecha: 
     * ----------------------------------------------------
     * Modificado: Eddy Valero Fecha: 14/04/2015
     * Se modifica el metodo para que retorne a la misma pagina una vez
     * realizado el almacenamiento
     * </pre>
     *
     */    
    
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public String guardaListaDocumentosDigitalizados(List<DIGArchivoDocumento> listaDIGArchivoDocumento) {

        try {
            for (DIGArchivoDocumento dIGArchivoDocumento : listaDIGArchivoDocumento) {
                Documento documento = new Documento();
                documento = dIGArchivoDocumento.getDocumento();
                              documentoService.persistDocumento(documento);
                dIGArchivoDocumento.setDocumento(documento);
                persistDIGArchivoDocumento(dIGArchivoDocumento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    /**
     * Método que guarda la lista de los Documentos y los DIGArchivoDocumentos
     * que se Digitalizaron
     *
     * @param listaDIGArchivoDocumento
     * @param usuario
     * @param reglaPaginaNavegacion
     * @return String: retornar la regla de navegacion que permite volver al
     * formulario anterior
     * @throws java.lang.Exception
     *
     * <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 20/02/2015
     * Descripcion: Se agrega el metodo guardaListaDocumentosDigitalizadosPorUsuario
     * si la fecha ingresada existe
     * ----------------------------------------------------
     * </pre>
     *
     */
    @Override
    public String guardaListaDocumentosDigitalizadosPorUsuario(List<DIGArchivoDocumento> listaDIGArchivoDocumento, Usuario usuario) throws Exception {
        try {
            guardarLogServidor(EnumTipoOperacionUsuario.INSERTAR.getCodigo(), usuario.getIdUsuario(), "Registro de Documentos Digitalizados desde la Digitalizacion por Usuario", "DIGArchivoDocumentoServiceImpl.guardaListaDocumentosDigitalizadosPorUsuario");

            for (DIGArchivoDocumento dIGArchivoDocumento : listaDIGArchivoDocumento) {
                Documento documento = new Documento();
                documento = dIGArchivoDocumento.getDocumento();
                documento.setFechaCreacion(new Date());
                documento.setFechaUltimaModificacion(new Date());
                if(documento.getNumeroImpresiones()==null){
                    documento.setNumeroImpresiones(1);
                }
                documentoService.persistDocumento(documento);
                dIGArchivoDocumento.setDocumento(documento);
                persistDIGArchivoDocumento(dIGArchivoDocumento);
            }

            return "null";
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
     public String extensionDeArchivo(String nombreArchivo) {
        int limite = nombreArchivo.length();
        if (nombreArchivo.substring(limite - 4, limite - 3).equals(".")) {
            return nombreArchivo.substring(limite - 3, limite);
        }
        return nombreArchivo.substring(limite - 4, limite);
    }

    @Override
    public List<DIGArchivoDocumento> actualizaListaDIGArchivoDocumento(List<DIGArchivoDocumento> listaAntigua, Documento documento) {
        List<DIGArchivoDocumento> listaDIGArchivoDocumentoFinal = new ArrayList<DIGArchivoDocumento>();
        for (DIGArchivoDocumento dIGArchivoDocumento : listaAntigua) {
            if (!documento.getFechaCreacion().equals(dIGArchivoDocumento.getDocumento().getFechaCreacion())) {
                listaDIGArchivoDocumentoFinal.add(dIGArchivoDocumento);
            }
        }
        return listaDIGArchivoDocumentoFinal;
    }

    /**
     * Método que obtiene el DIGArchivo por Documento
     *
     * @param documento
     * @return DIGArchivoDocumento de acuerdo al Documento introducido      <pre>
     * ----------------------------------------------------
     * Creado: Eddy Valero Fecha: 09/02/2015
     * Descripcion: Se agrega el metodo obtenerDIGArchivoDocumentoPorDocumento,
     * para obtener el objeto DIGArchivoDocumentoPorDocumento
     * </pre>
     */
    @Override
    public DIGArchivoDocumento obtenerDIGArchivoDocumentoPorDocumento(Documento documento) {
        DIGArchivoDocumento dIGArchivoDocumento = new DIGArchivoDocumento();
        List<DIGArchivoDocumento> lista = hibernateTemplate.find(
                "SELECT e "
                + "FROM DIGArchivoDocumento e "
                + " where "
                + " e.documento.idDocumento =  " + documento.getIdDocumento()
               //    + " e.documento.idDocumento =  8"
                + "");
        if (!lista.isEmpty()) {
            dIGArchivoDocumento = lista.get(0);
        }
        
        return dIGArchivoDocumento;
    }

}
