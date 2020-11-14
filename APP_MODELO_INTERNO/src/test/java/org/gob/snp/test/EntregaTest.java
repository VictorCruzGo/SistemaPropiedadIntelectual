/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gob.snp.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.gob.snp.entidades.Documento;
import org.gob.snp.entidades.Entrega;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.DocumentoService;
import org.gob.snp.servicios.EntregaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Gustavo Lizarraga
 */
public class EntregaTest {

    private static EntregaService entregaService;
    private static Entrega entrega;
    private static Tramite tramite;
    private static ApplicationContext context;
    private static DocumentoService documentoService;
    private static TramiteService tramiteService;
    private static UsuarioService usuarioService;
    private static Usuario usuario;

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ProyectoFinal//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        entregaService = (EntregaService) context.getBean("entregaService");
        documentoService = (DocumentoService) context.getBean("documentoService");
        tramiteService = (TramiteService) context.getBean("tramiteService");
        usuarioService = (UsuarioService) context.getBean("usuarioService");

        tramite = tramiteService.find(Tramite.class, 2L);
        usuario = usuarioService.find(Usuario.class, 1L);
        //entrega = entregaService.find(Entrega.class, 1L);
        //entrega = new Entrega();
        //listarEntregas ();
        //ADICION
        //adicionar Entrega(documento);
        //MODIFICACION
        //       
        //ELIMINACION
        //eliminarEntrega(entrega);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = df.parse("2015-07-02"); // for example, today's date
        Date d2 = df.parse("2015-07-02");
        Usuario usuario = null;
           
        
        //System.out.println("tam.."+le.size());
    }

    //LISTAR UNA ENTREGA
    public static void listarEntregas() {
        try {
            List<Entrega> lista = entregaService.listaEntrega();
            if (!lista.isEmpty()) {
                for (Entrega entregaa : lista) {
                    System.out.println("La lista de entregas es: " + entregaa.getLugarExpedicion());
                }
            }
        } catch (Exception e) {
            System.out.println("Hubo un error en el listado de resoluciones: " + e.getMessage());
        }
    }

    public static void adicionarEntrega(Documento documento) {
        Entrega ent = new Entrega();
        ent.setDocumento(documento);
        ent.setObservacion("Ninguna observacion");
        ent.setFechaEntrega(new Date());
        ent.setRecibidoPor("Pepito Lopez");
//        ent.setTipoDocumento();
//        ent.setNumeroDocumento("5768833");
        ent.setLugarExpedicion("LPZ");
        ent.setVigente(false);
        ent.setUsuario(1L);
        ent.setFechaUltimaModificacion(new Date());

        try {
            Entrega entreRes = entregaService.persistEntrega(ent);
            System.out.println("El registro adicionado es: " + entreRes.getRecibidoPor());
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

//    //MODIFICAR UNA RESOLUCION
    public static void modificarEntrega(Entrega ent) {
        ent.setRecibidoPor("Eddy");
        ent.setUsuario(1L);
        ent.setVigente(false);
        try {
            Entrega entre = entregaService.mergeEntrega(ent);
            System.out.println("Modificacion exitosa.");
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
//
//    //ELIMINAR UNA RESOLUCION

    public static void eliminarEntrega(Entrega r) {
        try {
            entregaService.removeEntrega(r);
            System.out.println("Eliminacion exitosa.");
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
}
