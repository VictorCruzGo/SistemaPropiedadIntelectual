package org.gob.snp.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.gob.snp.entidades.SMColor;
import org.gob.snp.entidades.SMImagen;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.SmColorService;
import org.gob.snp.servicios.SmImagenService;
import org.gob.snp.servicios.SmLogotipoService;
import org.gob.snp.servicios.SmSignoMarcaService;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jonathanvaldivia
 */
public class SmImagenTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//         TODO code application logic here
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//chano//sipi//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");

        SmImagenService sMImagenService = (SmImagenService) context.getBean("smImagenService");
        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");

//        Tramite tramite = tramiteService.find(Tramite.class, 25L);
//        Usuario usuario = usuarioService.find(Usuario.class, 5L);

        List<SMImagen> listImagen = sMImagenService.listaImagenes();
        System.out.println("el tamño de la imagen es" + listImagen.size());
        for (SMImagen sMImagen : listImagen) {
            System.out.println("el id del objeto es" + sMImagen.getIdSMImagen());
            System.out.println("el nombre de la imagen es" + sMImagen.getIdSMLogotipo().getNombreArchivo());
            sMImagenService.convierteImagenYGuardaCarpeta(sMImagen);
        }

    }
    

}
