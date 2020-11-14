package org.gob.snp;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Auditoria;
import org.gob.snp.enums.EnumTipoOperacionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    int pesoEnMB = (20 * 1024) * 1024;
    
    
    
    static Long idRegistroPadre = 0L;
    static String etapaPadre = "";
    static Long idUsuarioPadre = 0L;
    static Date fechaPadre = new Date();
    static String direccionIPPadre = "";
    static String datoPadre = "";
    static String detallePadre = "";
    
    Auditoria auditoriaPadre = new Auditoria();
    
    @Autowired
    protected HibernateTemplate hibernateTemplate;

//    private long tamanioArchivoMB = 50;
    @Override
    public T persist(T t) {
        
        hibernateTemplate.persist(t);
        
        auditoriaPadre = new Auditoria();
        
        auditoriaPadre.setTabla(t.getClass().getName());
        auditoriaPadre.setIdRegistro(idRegistroPadre);
        auditoriaPadre.setEtapa(etapaPadre);
        auditoriaPadre.setIdUsuario(idUsuarioPadre);
        auditoriaPadre.setFecha(fechaPadre);
        auditoriaPadre.setTipoOperacion(EnumTipoOperacionUsuario.INSERTAR.getCodigo());
        auditoriaPadre.setDireccionIP(direccionIPPadre);
        auditoriaPadre.setDato(t.toString());
        auditoriaPadre.setDetalle(detallePadre);
        auditoriaPadre.setEstado("AC");
        
        hibernateTemplate.persist(auditoriaPadre);

        return t;
    }

    @Override
    public T merge(T t) {
        auditoriaPadre = new Auditoria();
        auditoriaPadre.setTabla(t.getClass().getName());
        auditoriaPadre.setIdRegistro(idRegistroPadre);
        auditoriaPadre.setEtapa(etapaPadre);
        auditoriaPadre.setIdUsuario(idUsuarioPadre);
        auditoriaPadre.setFecha(fechaPadre);
        auditoriaPadre.setTipoOperacion(EnumTipoOperacionUsuario.ACTUALIZAR.getCodigo());
        auditoriaPadre.setDireccionIP(direccionIPPadre);
        auditoriaPadre.setDato(datoPadre);
        auditoriaPadre.setDetalle(detallePadre);
        auditoriaPadre.setEstado("AC");
        
        hibernateTemplate.persist(auditoriaPadre);
        hibernateTemplate.merge(t);
        return t;
    }

    @Override
    public void remove(T t) {
        auditoriaPadre = new Auditoria();
        auditoriaPadre.setTabla(t.getClass().getName());
        auditoriaPadre.setIdRegistro(idRegistroPadre);
        auditoriaPadre.setEtapa(etapaPadre);
        auditoriaPadre.setIdUsuario(idUsuarioPadre);
        auditoriaPadre.setFecha(fechaPadre);
        auditoriaPadre.setTipoOperacion(EnumTipoOperacionUsuario.ELIMINAR.getCodigo());
        auditoriaPadre.setDireccionIP(direccionIPPadre);
        auditoriaPadre.setDato(t.toString());
        auditoriaPadre.setDetalle(detallePadre);
        auditoriaPadre.setEstado("AC");
        hibernateTemplate.persist(auditoriaPadre);
        hibernateTemplate.delete(t);
    }

    @Override
    public T find(Class clazz, Long id) {
        return (T) hibernateTemplate.get(clazz, id);
    }

    @Override
    public void guardarLogServidor(String tipoOperacionUsuario, Long idUsuario, String mensajeOperacion, String metodoYClase) {
//        ServletContext sContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//        File ruta = new File(sContext.getRealPath("/temp/log"));

//        File ruta = new File("/home/gusn8/log/");
//        File ruta = new File("src/main/resources/log");
        File ruta = new File("/home/administrador/log/");
        File archivo = new File(ruta, "log.log");

        int repetir = 0;
        do {
            repetir++;
            if (ruta.exists()) {
                if (archivo.exists()) {
                    repetir = 2;
//                    System.out.println("Archivo: " + archivo.getName() + " SI existe");
//                    System.out.println("Tamaño: " + archivo.length() + " bytes");
                    if (archivo.length() < pesoEnMB) {
                        FileWriter w = null;
                        try {
                            w = new FileWriter(archivo, true);
                            Date fechaActual = new Date();
                            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                            String cadenaLog = "[INFO] [" + format.format(fechaActual) + "] [TIPO OPERACIÓN: " + tipoOperacionUsuario + "] [USUARIO: " + idUsuario + "] [MENSAJE: " + mensajeOperacion + "] [METODO/CLASE: " + metodoYClase + "]";
                            w.write(cadenaLog + "\n");
                        } catch (IOException ex) {
                            System.out.println("Ocurrió un error en: " + ex.getMessage());
                        } finally {
                            try {
                                w.flush();
                                w.close();
                            } catch (IOException exx) {
                                System.out.println("Ocurrió un error en: " + exx.getMessage());
                            }
                        }
                    } else {
                        String[] lista = ruta.list();
                        String nombreNuevoArchivo = "log" + lista.length + ".log";
                        File nuevoArchivo = new File(ruta, nombreNuevoArchivo);
                        if (archivo.renameTo(nuevoArchivo)) {
                            try {
                                archivo.createNewFile();
                            } catch (IOException ex) {
                                System.out.println("No se pudo crear: " + ex.getMessage());
                            }
                        } else {
                            System.out.println("Ocurrió un error al renombrar.");
                        }
                    }
                } else {
                    try {
                        archivo.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Ocurrió un error: " + ex.getMessage());
                    }
                }
            } else {
                ruta.mkdir();
            }
        } while (repetir < 2);

//        System.out.println("*** tipoOperacion: " + tipoOperacion + "*** idUsuario: " + idUsuario + "*** mensajeOperacion: " + mensajeOperacion + "*** metodoYClase: " + metodoYClase);
//        System.out.println("*** idUsuario: "+ idUsuario);
//        System.out.println("*** mensajeOperacion: "+ mensajeOperacion);
//        System.out.println("*** metodoYClase: "+ metodoYClase);
    }

    @Override
    public String obtenerMensaje(Long idModulo, int orden, String idioma) {
        String mensaje = "No se obtuvieron datos asociados al IdModulo: " + idModulo + ", con numero de codigo: " + orden + " e idioma: " + idioma;
        List<String> listaMensaje = hibernateTemplate.find("select e.descripcion from MensajeAplicacion e "
                + " where e.modulo.idModulo = " + idModulo
                + " and e.orden = " + orden + ""
                + " and e.idioma = '" + idioma + "' ");
        if (!listaMensaje.isEmpty()) {
            mensaje = listaMensaje.get(0);
        }
        return mensaje;
    }
    
    @Override
    public void iniciarDatos(Long idRegistro, String Etapa, Long idUsuario, Date Fecha, String direccionIP, String dato, String detalle){
        this.idRegistroPadre = idRegistro;
        this.etapaPadre = Etapa;
        this.idUsuarioPadre = idUsuario;
        this.fechaPadre = Fecha;
        this.direccionIPPadre = direccionIP;
        this.datoPadre = dato;
        this.detallePadre = detalle;
    }
    

    public Long getIdUsuarioPadre() {
        return idUsuarioPadre;
    }

    public void setIdUsuarioPadre(Long idUsuarioPadre) {
        this.idUsuarioPadre = idUsuarioPadre;
    }

    public Auditoria getAuditoriaPadre() {
        return auditoriaPadre;
    }

    public void setAuditoriaPadre(Auditoria auditoriaPadre) {
        this.auditoriaPadre = auditoriaPadre;
    }

    public Long getIdRegistroPadre() {
        return idRegistroPadre;
    }

    public void setIdRegistroPadre(Long idRegistroPadre) {
        this.idRegistroPadre = idRegistroPadre;
    }

    public String getEtapaPadre() {
        return etapaPadre;
    }

    public void setEtapaPadre(String etapaPadre) {
        this.etapaPadre = etapaPadre;
    }

    public Date getFechaPadre() {
        return fechaPadre;
    }

    public void setFechaPadre(Date fechaPadre) {
        this.fechaPadre = fechaPadre;
    }

    public String getDireccionIPPadre() {
        return direccionIPPadre;
    }

    public void setDireccionIPPadre(String direccionIPPadre) {
        this.direccionIPPadre = direccionIPPadre;
    }

    public String getDatoPadre() {
        return datoPadre;
    }

    public void setDatoPadre(String datoPadre) {
        this.datoPadre = datoPadre;
    }

    public String getDetallePadre() {
        return detallePadre;
    }

    public void setDetallePadre(String detallePadre) {
        this.detallePadre = detallePadre;
    }


}
