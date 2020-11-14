package org.gob.snp.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.gob.snp.entidades.AnalisisEtapa;
import org.gob.snp.entidades.SMSignoMarca;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.entidades.vistas.TipoGenero;
import org.gob.snp.entidades.vistas.TipoSolicitudDeposito;
import org.gob.snp.servicios.AnalisisEtapaService;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class SmSignoMarcaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//         TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");
        SmSignoMarcaService smSignoMarcaService = (SmSignoMarcaService) context.getBean("smSignoMarcaService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        AnalisisEtapaService analisisEtapaService = (AnalisisEtapaService) context.getBean("analisisEtapaService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

//        SMSignoMarca signo = new SMSignoMarca();
//        
        
        Tramite tramite = tramiteService.find(Tramite.class, 10L);
        
        
//        signo.setTipoGenero((TipoGenero)clasificadorService.find(TipoGenero.class, "MP"));
//        signo.setMarca("NIKE");
//        signo.setTipoSolicitudDeposito((TipoSolicitudDeposito)clasificadorService.find(TipoSolicitudDeposito.class,"NOMC"));
//        signo.setTramite(tramite);
//        signo=smSignoMarcaService.persistSmsignoMarca(signo);
//        signo=smSignoMarcaService.mergeSmsignoMarca(signo);
//        System.out.println("se grabo correctamente "+signo.getTipoSolicitudDeposito().getDescripcion());
//        List<Smsignomarca>lista=smSignoMarcaService.listaSmSignoMarca();
//        for (SMSignoMarca smsignomarca : lista) {
//            System.out.println("el signo marca es"+smsignomarca.getMarca());
//            
//        }
        //Verificacion de Recuperacion de Registro
//        Tramite tramite = tramiteService.find(Tramite.class, 6L);
//        try {
//            SMSignoMarca signo = smSignoMarcaService.registroSmsignoMarcaXTramite(tramite);
//            if (signo != null) {
//                System.out.println("***" + signo);
//                System.out.println("***" + signo.getMarca());
//                System.out.println("***" + signo.getTipoGenero().getNombre());
//            } else {
//                System.out.println("*** NO EXISTE ");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        Tramite tramite = tramiteService.find(Tramite.class, 7L);
//        System.out.println("essss:::: "+smSignoMarcaService.encuentraSmSignoMarca(tramite).getMarca());
        //A partir de un AnalisisEtapa recuperar el SMSignoMarca solicitado
//        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 13L);
//        System.out.println(" ***");
//        
//        SMSignoMarca signo = new SMSignoMarca();
//        signo = smSignoMarcaService.encuentraSmSignoMarcaPorAnalisisEtapa(analisisEtapa);
//        
//        System.out.println(" *** "+ signo.getMarca());
//        List<SMSignoMarca> listaSignoMarca = smSignoMarcaService.encuentraListaSmSignoMarcaPorMarcaNoExistsRegistroExistenteEF("%", analisisEtapa);
//
//        for (SMSignoMarca sMSignoMarca : listaSignoMarca) {
//            System.out.println("***" + sMSignoMarca.getMarca());
//        }
        
        
        //System.out.println("verifica si existe:::::::"+smSignoMarcaService.verificaSiExisteSmSignoMarca(tramite));
        
        //Probar la busqueda de SMSignoMarca
//        AnalisisEtapa analisisEtapa = analisisEtapaService.find(AnalisisEtapa.class, 1L);
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        String marca= "";
//        Long claseNiza = 39L;
////        Long claseNiza = null;
//        
//        List<SMSignoMarca> listaClaseNiza =  smSignoMarcaService.encuentraListaSmSignoMarcaPorMarcaPorNizaNoExistsRegistroExistenteEF(marca, analisisEtapa, claseNiza, usuario);
//        for (SMSignoMarca sMSignoMarca : listaClaseNiza) {
//            System.out.println(" *** " + sMSignoMarca.getMarca() + "*** ");
//        }
        
        
        
        // Aplicar criterios de busqueda en SMSignoMarca
        
        HashMap parametros = new HashMap();
        Tramite tramiteAuxiliar = new Tramite();
        
//        tramiteAuxiliar = smSignoMarcaService.obtenerTramiteParaLicenciaUso(parametros, "asdfa", "", "", "", null);
        tramiteAuxiliar = smSignoMarcaService.obtenerTramiteParaLemaComercial(parametros, "", "", "63876", "", new Date());
        
        System.out.println(" *** " + parametros.get("mensaje"));
        
        System.out.println(" *** " + tramiteAuxiliar.getIdTramite() );
        
      

    }
}
