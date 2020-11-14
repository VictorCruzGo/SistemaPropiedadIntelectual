package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Flujo;
import org.gob.snp.entidades.FlujoPagina;
import org.gob.snp.entidades.Pagina;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.FlujoPaginaService;
import org.gob.snp.servicios.FlujoService;
import org.gob.snp.servicios.PaginaService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class FlujoPaginaTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrollo_Senapi_1//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//roco//Documentos//SISE//ISSE 17-10-14-15-55//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        FlujoPaginaService flujoPaginaService = (FlujoPaginaService) context.getBean("flujoPaginaService");
        PaginaService paginaService = (PaginaService) context.getBean("paginaService");
        FlujoService flujoService = (FlujoService) context.getBean("flujoService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

        //Testear Basico
        //Testear el Almacenamiento
//        Pagina pagina = paginaService.find(Pagina.class, 1L);
//        Flujo flujo = flujoService.find(Flujo.class, 1L);
//        FlujoPagina flujoPagina = new FlujoPagina();
//        flujoPagina.setPagina(pagina);
//        flujoPagina.setFlujo(flujo);
//        flujoPagina.setOrden(6);
//        flujoPagina.setUsuario(1L);
//        flujoPagina.setEstado("AC");
//        flujoPagina.setFechaUltimaModificacion(new Date());
//        FlujoPagina flujoPaginaAux = flujoPaginaService.persist(flujoPagina);
//        System.out.println(" **** Pagina Uno  " + flujoPaginaAux.getOrden());
        //Testear la modificacion
//        FlujoPagina flujoPagina = flujoPaginaService.find(FlujoPagina.class, 6L);
//        flujoPagina.setOrden(10);
//        FlujoPagina flujoPaginaAux = flujoPaginaService.merge(flujoPagina);
//        System.out.println(" **** Flujo Pagina modificado  " + flujoPaginaAux.getOrden());
        //Testear la eliminacion
//        FlujoPagina flujoPagina = flujoPaginaService.find(FlujoPagina.class, 6L);
//        flujoPaginaService.remove(flujoPagina);
        //Probar el metodo de busqueda de paginas por flujo
//        Flujo flujo = flujoService.find(Flujo.class, 1L);
//        List<Pagina> listaPagina = flujoPaginaService.listaFlujoPagina(flujo);
//        for (Pagina pagina : listaPagina) {
//            System.out.println(" *** "+ pagina.getRutaNavegacion());
//        }
        //Probar el metodo NavegaPaginaFlujo
        Flujo flujo = flujoService.find(Flujo.class, 1L);
        Usuario usuario = usuarioService.find(Usuario.class, 1L);
        Pagina pagina = paginaService.find(Pagina.class, 26L);
//        try {
//            pagina = flujoPaginaService.NavegaPaginaFlujo(flujo, pagina, "adelante", usuario);
//            System.out.println(" pagina *** " + pagina.getIdPagina());
//        } catch (Exception e) {
//            System.out.println("ocurrio el error "+ e.toString());
//        }

//        try {
//            pagina = flujoPaginaService.NavegaPaginaFlujo(flujo, pagina, "atras", usuario);
//            System.out.println(" pagina *** " + pagina.getIdPagina());
//        } catch (Exception e) {
//
//        }
        
//        System.out.println("el valor del numero de tramite es"+flujoPaginaService.numeroPaginasSolicitud(flujo, usuario));
        
//        String[] numero = new String[flujoPaginaService.numeroPaginasSolicitud(flujo, usuario)];
//        for (int i = 0; i < ((numero.length)); i++) {
//            numero[i]="0";
//        }
//        
//        for (int i = 0; i < ((numero.length)); i++) {
//            System.out.println("numero"+numero[i]);
//        }
//        numero[1]="1";
//        
//        for (int i = 0; i < ((numero.length)); i++) {
//            System.out.println("numero"+numero[i]);
//        }
    
//        System.out.println("el orden de la pagina en el flujo es"+flujoPaginaService.encuentraPosicionPagina(flujo, 27L, usuario));
        
        
        
        System.out.println("la pagina es activa::::"+flujoPaginaService.verificaPaginaActivaMenu(flujo, pagina));
        
        

    }
}
