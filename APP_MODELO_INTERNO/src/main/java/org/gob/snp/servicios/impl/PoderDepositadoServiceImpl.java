/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gob.snp.servicios.impl;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.Empresa;
import org.gob.snp.entidades.PersonaEmpresaTramite;

import org.gob.snp.entidades.PoderDepositado;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.servicios.PoderDepositadoService;
import org.gob.snp.servicios.util.UtilitariosService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author roco
 */
public class PoderDepositadoServiceImpl extends GenericDaoImpl<PoderDepositado> implements PoderDepositadoService {
    @Autowired
    private UtilitariosService utilitariosService;
    @Override
    public List<PoderDepositado> listaPoderDepositado() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         List<PoderDepositado> lista = hibernateTemplate.find(""
                + "select p "
                + "from PoderDepositado p ");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
    }
    @Override
    public PoderDepositado persistPoderDepositado(PoderDepositado poderDepositado) throws Exception {
        try {
            super.persist(poderDepositado);
        } catch (Exception e) {

            throw e;
        }
        return poderDepositado;
    }
    @Override
    public List<PoderDepositado> encuentraPoderDepositadoPorTramite(Tramite tramite) throws Exception {
        
           List<PoderDepositado> lista = hibernateTemplate.find(""
                + "select p "
                + "from PoderDepositado p "
                + "where p.tramite='"+tramite.getTramite()+"'");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
      
    }
    @Override
    public void removePoderDepositado(PoderDepositado poderDepositado)throws Exception {
        try {
            super.remove(poderDepositado);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    @Override
    public void insertaPoderDepositadoPorTramite(Tramite tramite,List<PoderDepositado> listPoderDepo, Long idUsuario, String ip) throws Exception {
        try {
            
            List<PoderDepositado> lista=encuentraPoderDepositadoPorTramite(tramite);
            for(int i=0;i<=lista.size()-1;i++)
            {
                removePoderDepositado(lista.get(i)); 
            }  
           
            for(int i=0;i<=listPoderDepo.size()-1;i++)
            {
                System.out.println("A getIdPoderDepositado::"+listPoderDepo.get(i).getIdPoderDepositado());
                
                System.out.println("A getTramite::"+listPoderDepo.get(i).getTramite());
                System.out.println("A getNumeroTestimonio::"+listPoderDepo.get(i).getNumeroTestimonio());
                System.out.println("A getFechaTestimonio::"+listPoderDepo.get(i).getFechaTestimonio());
                System.out.println("A getNombreNotario::"+listPoderDepo.get(i).getNombreNotario());
                System.out.println("A getNombreTitular::"+listPoderDepo.get(i).getNombreTitular());
                System.out.println("A getDomicilioTitular::"+listPoderDepo.get(i).getDomicilioTitular());
                System.out.println("A getNombreApoderado::"+listPoderDepo.get(i).getNombreApoderado());
                System.out.println("A getPoderRevocado::"+listPoderDepo.get(i).getPoderRevocado());
                System.out.println("A getObservaciones::"+listPoderDepo.get(i).getObservaciones());
                
                PoderDepositado poderDepositado= new PoderDepositado();
                poderDepositado.setTramite(listPoderDepo.get(i).getTramite());
                poderDepositado.setNumeroTestimonio(listPoderDepo.get(i).getNumeroTestimonio());
                poderDepositado.setFechaTestimonio(listPoderDepo.get(i).getFechaTestimonio());
                poderDepositado.setNombreNotario(listPoderDepo.get(i).getNombreNotario());
                poderDepositado.setNombreTitular(listPoderDepo.get(i).getNombreTitular());
                poderDepositado.setDomicilioTitular(listPoderDepo.get(i).getDomicilioTitular());
                poderDepositado.setNombreApoderado(listPoderDepo.get(i).getNombreApoderado());
                poderDepositado.setPoderRevocado(listPoderDepo.get(i).getPoderRevocado());
                poderDepositado.setObservaciones(listPoderDepo.get(i).getObservaciones());
                poderDepositado.setFechaUltimaModificacion(utilitariosService.obtenerFechaServidor());
                poderDepositado.setUsuario(idUsuario);

                persistPoderDepositado(poderDepositado);
                super.iniciarDatos(listPoderDepo.get(i).getIdPoderDepositado(),
                        "LP",
                        idUsuario,
                        utilitariosService.obtenerFechaServidor(),
                        ip,
                        listPoderDepo.get(i).getNumeroTestimonio(), "Insertar un registro en tabla PoderDepositado");
            }
               
            
            
        } catch (Exception e) {
            throw e;
        }
    }
    @Override
    public List<PoderDepositado> encuentraPoderDepositadoPorTestimonio(PoderDepositado poderDepositado) throws Exception {
        
           List<PoderDepositado> lista = hibernateTemplate.find(""
                + "select p "
                + "from PoderDepositado p "
                + "where p.numeroTestimonio='"+poderDepositado.getNumeroTestimonio()+"'");
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
      
    }
     @Override
    public List<PoderDepositado> encuentraPoderDepositadoXFiltro(String opcion,String aBuscar)throws Exception {
         String cadena=" ";
         String fechaInicioConsulta="";
         SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");        
           if(opcion.equals("1"))
           {
               cadena="where p.numeroTestimonio='"+aBuscar+"'";
           }
           /*if(opcion.equals("2"))
           {   
              SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
              Date date = simpleDateFormat.parse(aBuscar+" 23:59:59");
              
              fechaInicioConsulta= formato.format(date.getTime());
              cadena="where p.fechaTestimonio='"+fechaInicioConsulta+"'";
              //cadena="where p.fechaTestimonio between STR_TO_DATE('"+aBuscar+"', '%d/%m/%Y') and STR_TO_DATE('"+aBuscar+" 23:59:59', '%d/%m/%Y %h:%i:%s')";
             //   cadena="where p.fechaTestimonio = STR_TO_DATE('"+aBuscar+"', '%d/%m/%Y')";
//                 cadena="where p.fechaTestimonio like '%STR_TO_DATE('"+aBuscar+"', '%d/%m/%Y')%'";
           } */
           if(opcion.equals("2"))
           {  cadena="where p.nombreNotario='"+aBuscar+"'";
           } 
           if(opcion.equals("3"))
           {  cadena="where p.nombreTitular='"+aBuscar+"'";
           }
           if(opcion.equals("4"))
           {  cadena="where p.nombreApoderado='"+aBuscar+"'";
           }
           List<PoderDepositado> lista = hibernateTemplate.find(""
                + "select p "
                + "from PoderDepositado p "
                + cadena);      
        if (!lista.isEmpty()) {
            return lista;
        }
        return Collections.EMPTY_LIST;
      
    }
}

