package org.gob.snp.test;

import java.util.Date;
import java.util.List;
import org.gob.snp.entidades.Tramite;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.servicios.TramiteService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class TramiteUsuarioTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branches//APP_SIUNO/src//main//webapp//WEB-INF//applicationContext.xml");

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        Usuario usuario = usuarioService.find(Usuario.class, 266L);
        System.out.println("id del usuario: " + usuario.getIdUsuario());

        TramiteService tramiteService = (TramiteService) context.getBean("tramiteService");
        
        List<Tramite> listaTramite = tramiteService.listaTramiteUsuarioExterno(usuario);
        
        
        for (Tramite tramite : listaTramite) {
            System.out.println(" *** " + tramite.getIdTramite());
            
        }

    }

}
