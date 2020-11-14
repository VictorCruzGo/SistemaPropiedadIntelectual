package org.gob.snp.test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.gob.snp.entidades.Deposito;
import org.gob.snp.entidades.DetalleTitulo;
import org.gob.snp.entidades.Recibo;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Tasa;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.EstadoRecibo;
import org.gob.snp.entidades.vistas.TipoTramite;
import org.gob.snp.enums.EnumTipoTramite;
import org.gob.snp.servicios.ClaseNizaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.DepositoService;
import org.gob.snp.servicios.DireccionService;
import org.gob.snp.servicios.ExpedienteService;
import org.gob.snp.servicios.ReciboService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.TasaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class ReciboTest {

    public static void main(String[] args) throws Exception {
    ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//sipi2//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        TasaService tasaService = (TasaService) context.getBean("tasaService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        ExpedienteService expedienteService = (ExpedienteService) context.getBean("expedienteService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        DireccionService direccionService = (DireccionService) context.getBean("direccionService");
        ClaseNizaService claseNizaService = (ClaseNizaService) context.getBean("claseNizaService");
        ReciboService reciboService = (ReciboService) context.getBean("reciboService");
        DepositoService depositoService = (DepositoService) context.getBean("depositoService");

//        Recibo recibo = new Recibo();
//        recibo.setNroRecibo(2L);
//        recibo.setRegional((Regional) regionalService.find(Regional.class, 1L));
//        recibo.setSerie(12L);
//        recibo.setTasa((Tasa) tasaService.find(Tasa.class, 2L));
//        recibo.setMonto(((Tasa)tasaService.find(Tasa.class, 2L)).getCosto());
//        recibo.setTramite((Tramite) tramiteService.find(Tramite.class, 1L));
//        recibo.setEstadoRecibo((EstadoRecibo) clasificadorService.find(EstadoRecibo.class, "REMI"));
//        reciboService.persistRecibo(recibo);
//        System.out.println("el id de la tabla recibo es"+recibo.getNroRecibo());
//        List<Deposito> listDeposito = depositoService.listaDepositoConSaldo();
//        for (Deposito deposito : listDeposito) {
//            System.out.println("el id recuperado);
//        }
//        
//        List<Recibo> reciboList = reciboService.listaReciboEmitidoAnuladoConTitulo();
//        if (!reciboList.isEmpty()) {
//            for (Recibo recibo : reciboList) {
//                System.out.println("el recibo encontrado es" + recibo.getIdRecibo());
//            }
//        } else {
//            System.out.println("la lista esta vacia");
//
//        }
//        
        
        Date fechaFinal = new Date();        
//        Date fechaFinal = null;        
        
//        List<DetalleTitulo> reciboList = reciboService.listadetalleTituloAnuladosPoRecibo();
//        if (!reciboList.isEmpty()) {
//            for (DetalleTitulo detalleTitulo : reciboList) {
//                System.out.println("el recibo encontrado es" + detalleTitulo.getRecibo().getIdRecibo());
//            }
//        } else {
//            System.out.println("la lista esta vacia");
//
//        }

//        Boolean dato=reciboService.activaGuardadoRecibo((Tasa)tasaService.find(Tasa.class,1L),listDeposito);
//        System.out.println("el valor de deposito"+dato);
//        System.out.println("la suma de saldos es" + reciboService.sumaMontosListado(listDeposito));
//        System.out.println("la posicion del saldo mayor es" + reciboService.encuentraSaldoMayor(listDeposito));
//
//        reciboService.guardaReciboDepositoTramite(recibo, listDeposito);
//        System.out.println("se guardo correctamente");
//        reciboService.anulaRecibo((Recibo)reciboService.find(Recibo.class,1L));
        
        
        Usuario usuario=(Usuario)usuarioService.find(Usuario.class, 6L);
        Regional regional=(Regional)regionalService.find(Regional.class, 1L);
        
        
//        List<Recibo>list=reciboService.listaReciboEmitidoPorFechaPorUsuarioYRegional(fechaFinal,usuario, regional );
//        System.out.println("entro a tamaño de la lista"+list.size());
//        for (Recibo recibo : list) {
//            System.out.println("listado de recibos por fecha"+recibo .getIdRecibo());
//        }
//       
        
        List<DetalleTitulo>lista=reciboService.listadetalleTituloAnuladosPoRecibo(usuario);
        for (DetalleTitulo detalleTitulo : lista) {
            System.out.println("id de tramites recuperados"+detalleTitulo.getIdDetalleTitulo());
            System.out.println("id de tramites recuperados"+detalleTitulo.getRecibo().getIdRecibo());
        }
        
        
       
        
        
        /*****************/
//        try {
//            
//            FTPClient client = new FTPClient();
//            String sFTP = "192.168.139.5";
//            String sUser = "UsrFtpJava";
//            String sPassword = "IaPOI569N16vbEW7z6E]";
//            client.connect(sFTP);
//            boolean login = client.login(sUser,sPassword);
//            System.out.println("logeado?"+login);
//         
//            System.out.println("donde esta:: "+client.printWorkingDirectory());      
//            System.out.println("Listado de archivos..");
//            for (String f : client.listNames()){
//                  System.out.println(f);            
//            }
//            
//            System.out.println("----------------------------------------");
//            FTPFile[] archivosFTP = client.listFiles();
//            
//            boolean cambioDirec=client.changeWorkingDirectory("/Adjuntos");
//            System.out.println("cambio directorio?"+cambioDirec);
//           // System.out.println("donde esta ahora:: "+client.printWorkingDirectory());      
//           for (String f : client.listNames()){
//                  System.out.println(f);            
//            }
//            
//            
//           
//            byte[] bytes = new byte[] { (byte)0xe0, 0x4f, (byte)0xd0,0x20, (byte)0xea, 0x3a, 0x69, 0x10, (byte)0xa2, (byte)0xd8, 0x08, 0x00, 0x2b,
//                            0x30, 0x30, (byte)0x9d };
//            //File archivo = new File("pruebaHoy.pdf");
//            InputStream input = new ByteArrayInputStream(bytes);
//            client.storeFile("Pruebita.pdf",input);
//            client.logout();
//            client.disconnect();
//            input.close();
//            
//            
//          
//             } catch (Exception e) {
//               e.printStackTrace();
//        }
//            
           /* 
             byte[] bytes = new byte[] { (byte)0xe0, 0x4f, (byte)0xd0,
    0x20, (byte)0xea, 0x3a, 0x69, 0x10, (byte)0xa2, (byte)0xd8, 0x08, 0x00, 0x2b,
    0x30, 0x30, (byte)0x9d };
             int repetir = 0;
             
             System.out.println("host "+new URL("http://192.168.139.64").getHost());
             System.out.println("path "+new URL("http://192.168.139.64").getRef());
             
              // El coidigo muestra la ruta real
             //File ruta = new File("/home/roco/Documentos/prueba/");
             File ruta = new File("192.168.139.64/home/gusn8/Desktop/Compartido Gus/prueba/");
             //El codigo de abajo muestra ruta relativa
             //File ruta = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("../../../../../prueba/"));
             //System.out.println("Ruta Original:: "+FacesContext.getCurrentInstance().getExternalContext().getRealPath("../../../../../prueba/"));
             File archivo = new File(ruta, "pruebaHoy.pdf");
              do {
                 repetir++;
                 if (ruta.exists()) {
                    if (archivo.exists()) {
                       FileOutputStream fileOuputStream = new FileOutputStream(archivo);
                       fileOuputStream.write(bytes);
                       fileOuputStream.close();
                
                         System.out.println("Crea.....en directorio");
                }
                else{
                    try {
                        archivo.createNewFile();
                         } catch (IOException ex) {
                          System.out.println("Ocurrió un error: " + ex.getMessage());
                       }
                     }
                  }
                else{
                      System.out.println("La ruta de principio no existe..");
                        ruta.mkdir();
                 }
               } while (repetir < 2);
        
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        /******************/
        /*
        String fi = "2015-09-01";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dateI = format.parse(fi);
        String ff = "2015-09-31";
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dateF = format1.parse(ff);
        List<String> listRecibo=reciboService.cuentaSumaXtasaXmesXDia("2015-08",new Long(1));
         System.out.println("TAM:: "+ listRecibo.size());
        for(int i=0;i<= listRecibo.size()-1;i++)
        {
            System.out.println("Fecha Emision Recibo:: "+listRecibo.get(i));
        }    
       */
        
        
        
        
    }
}
