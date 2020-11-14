package org.gob.snp.test;

import java.util.Arrays;
import org.gob.snp.entidades.MensajeAplicacion;
import org.gob.snp.entidades.Modulo;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.ErrorAplicacionService;
import org.gob.snp.servicios.MensajeAplicacionService;
import org.gob.snp.servicios.ModuloService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class MensajeAplicacionTest {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//desarrolloSenapi//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        
        MensajeAplicacionService mensajesAplicacionService = (MensajeAplicacionService) context.getBean("mensajeAplicacionService");
        ModuloService moduloService = (ModuloService) context.getBean("moduloService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        ErrorAplicacionService erroresAplicacionService = (ErrorAplicacionService) context.getBean("errorAplicacionService");
        
//        MensajeAplicacion mensajeAplicacion = mensajesAplicacionService.find(MensajeAplicacion.class, 1L);
//        System.out.println(" **** "+ mensajeAplicacion.getDescripcion());
            
        //Obtener un modulo
        Modulo modulo = moduloService.find(Modulo.class, 2L);
//        MensajeAplicacion mensajeAplicacion = mensajesAplicacionService.find(MensajeAplicacion.class, 1L);
        Usuario usuario = usuarioService.find(Usuario.class, 17L);
        
        MensajeAplicacion mensajeAplicacion = new MensajeAplicacion();
        mensajeAplicacion.setDescripcion("Descripcion");
        
        
        
//        System.out.println("VALOR MASCAR GENERADA: "+moduloService.generaCodigoNiveleAndSubNivel(modulo, "S", 1));
//        
//        System.out.println("VERIFICA MASCAR GENERADA MENSAJE: "+moduloService.verificaExistenciaCodigo("1.00.0.000"));
//        
//        System.out.println("VERIFICA MASCAR GENERADA BOOLEAN: "+moduloService.verificaExistenciaMascaraNivelAndSubNivel("1.00.0.000"));
       
//        List<MensajeAplicacion> lista = mensajesAplicacionService.listaMensajesPorModuloOrdenados(modulo);
//        for (MensajeAplicacion mensajeAplicacion : lista) {
//            System.out.println("los mensajes son::::::::::"+mensajeAplicacion.getDescripcion());
//        }
//        System.out.println("el siguiente es****** "+mensajesAplicacionService.obtieneSiguientePosicionParaOrden(modulo));
//        System.out.println("---"+mensajesAplicacionService.scriptInsertDeMensaje(usuario, mensajeAplicacion, "en"));
        try{
            mensajesAplicacionService.persistMensajeAplicacionWeb(mensajeAplicacion);
        }catch(Exception e){
//            erroresAplicacionService.guardarErrorAplicacion(1L, 1L, "MensajeAplicacionTest", Arrays.toString(e.getStackTrace()));
            throw  e;
        }
        
        
    }

}
