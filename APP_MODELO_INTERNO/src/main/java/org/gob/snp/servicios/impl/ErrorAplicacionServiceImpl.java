/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.servicios.impl;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.gob.snp.GenericDaoImpl;
import org.gob.snp.entidades.ErrorAplicacion;
import org.gob.snp.servicios.ErrorAplicacionService;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Eddy Valero
 * @version 1.0 26/11/2014 Implementación del Servicio ErrorAplicacionService
 *
 * <pre>
 * -----------------------------------------------------------------------------
 * Modificado: Eddy Valero Fecha: 08/12/2014
 * Se programa el metodo guardarErrorAplicacion (Long idUsuario, Long idModulo, String claseMetodo, Exception e)
 * </pre>
 */
public class ErrorAplicacionServiceImpl extends GenericDaoImpl<ErrorAplicacion> implements ErrorAplicacionService {

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW)
    public String guardarErrorAplicacion(Long idUsuario, Long idModulo, String claseMetodo, Exception e) {
        ErrorAplicacion errorAplicacion = new ErrorAplicacion();
        errorAplicacion.setIdModulo(idModulo);
        errorAplicacion.setIdUsuario(idUsuario);
        errorAplicacion.setFecha(new Date());

        //Dar un formato a la descripcion de acuerdo a la Excepcion e
        String descripcionError = claseMetodo + ":::: \n " + e.getMessage() + ":::: \n " + Arrays.toString(e.getStackTrace());

        errorAplicacion.setDescripcion(descripcionError);
//        ErrorAplicacion errorAplicacionAux = super.persist(errorAplicacion);
        errorAplicacion = persist(errorAplicacion);
        return errorAplicacion.getIdErrorAplicacion().toString();
    }

    @Override
    public String obtenerErrorAplicacion(final Long idUsuario) {
        Long idErrorAplicacion = (Long) hibernateTemplate.execute(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                String q = "";
                
                //Se debe considerar el caso de que el usuario que se este ingresando no exista.
                if (idUsuario != null) {
                    q = ""
                            + "select max(e.idErrorAplicacion) from ErrorAplicacion e "
                            + "where "
                            + "e.idUsuario = " + idUsuario
                            + "order by e.idErrorAplicacion desc "
                            + "";
                } else {
                    q = ""
                            + "select max(e.idErrorAplicacion) from ErrorAplicacion e "
                            + " order by e.idErrorAplicacion desc "
                            + "";
                }
                Query query = session.createQuery(q);
                Long idError = (Long) query.uniqueResult();
                return idError;
            }

        });

        if (idErrorAplicacion != null){
            return idErrorAplicacion.toString();
            
        }
        return "error sin asignar";
        
    }

}
