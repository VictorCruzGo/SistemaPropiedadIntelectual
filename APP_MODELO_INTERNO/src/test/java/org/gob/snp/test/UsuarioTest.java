package org.gob.snp.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.gob.snp.entidades.FlujoEtapa;
import org.gob.snp.entidades.Persona;
import org.gob.snp.entidades.Regional;
import org.gob.snp.entidades.Usuario;
import org.gob.snp.enums.EnumRolesUsuario;
import org.gob.snp.servicios.ClasificadorService;
import org.gob.snp.servicios.FlujoEtapaService;
import org.gob.snp.servicios.PersonaService;
import org.gob.snp.servicios.RegionalService;
import org.gob.snp.servicios.RolService;
import org.gob.snp.servicios.UsuarioRolService;
import org.gob.snp.servicios.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author henrry
 */
public class UsuarioTest {

    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//eddy//ProyectosSI//branches//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//henrry//HENRRY//Henrry//SVN PROYECTO SENAPI CONEJO//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("//home//susana//ProyectoSI//branchesInterno//APP_SIUNO_INTERNO//src//main//webapp//WEB-INF//applicationContext.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("//home//jonas//NetBeansProjects//ProyectoSI//APP_SIUNO//src//main//webapp//WEB-INF//applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");

        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioService");
        PersonaService personaService = (PersonaService) context.getBean("personaService");
        UsuarioRolService usuarioRolService = (UsuarioRolService) context.getBean("usuarioRolService");
        ClasificadorService clasificadorService = (ClasificadorService) context.getBean("clasificadorService");
        FlujoEtapaService flujoEtapaService = (FlujoEtapaService) context.getBean("flujoEtapaService");
        RegionalService regionalService = (RegionalService) context.getBean("regionalService");
        RolService rolService = (RolService) context.getBean("rolService");

//        Usuario usuario = (Usuario) usuarioService.find(Usuario.class, 3L);
//        System.out.println("EL USUARIO ES***********"+usuario.getLogin());
//        Persona persona = (Persona) personaService.find(Persona.class, 17L);
//        Persona persona = new Persona();
//        persona.setNombres("Ana Maria");
//        persona.setApellidoPaterno("Mariaca");
//        persona.setApellidoMaterno("Mena");
//        persona.setFechaNacimiento(new Date());
//        persona.setLugarExpedicion((TipoCiudad) clasificadorService.find(TipoCiudad.class, "LPZ"));
//        persona.setNumeroDocumento("123456");
//        persona.setTipoDocumento((TipoDocumentoIdentidad) clasificadorService.find(TipoDocumentoIdentidad.class, "CIDE"));
//        persona.setTipoGeneroPersona((TipoGeneroPersona) clasificadorService.find(TipoGeneroPersona.class, "MAS"));
//        persona.setVigente(true);
//        Usuario usu = new Usuario();
//        usu.setUsuario("jvaldivia");
//        usu.setPassword("12345");
//        try {
//            usuarioService.guardaPersonaUsuario(persona, usu);
//
//        } catch (Exception e) {
//           e.printStackTrace();
//        }
//        System.out.println("USUARIO:"+usuario.getUsuario());
//        System.out.println("PASSWORD:"+usuario.getPassword());
//        System.out.println("TIPO:"+usuario.getTipoUsuario());
//        System.out.println("PERSONA:"+usuario.getPersona().getNombres());
//        System.out.println("PERSONA AP PATERNO:"+usuario.getPersona().getApellidoPaterno());
//        
//        Usuario u=new Usuario();
//        u.setUsuario("mquispe");
//        u.setPassword("12345");
//        
        System.out.println("ENCRIPTADO 1:" + usuarioService.encriptarContrasena("maria", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("psanchez", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("rmichme", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("jdaza", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("rquisbert", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("aticona", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("tchinori", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("nsoria", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("tchocamani", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("movando", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("ebuitrago", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("czurita", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("aiturri", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("dmaiser", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("rgallegos", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("lcallisaya", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("mmontero", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("mmujica", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("eruiz", "12345"));
        System.out.println("ENCRIPTADO 2:" + usuarioService.encriptarContrasena("dmayser", "12345"));

//        
//        System.out.println("VERIFICA:"+usuarioService.verificaExistenciaUsuario(u));
//        System.out.println("el usuario es:::"+usuarioService.encuentraUsuarioPorLogin("jvaldivia"));
//        usuarioService.guardaUsuarioPersonaConfirmado(usuario);
//        System.out.println("El CI ya esta REGISTRADO::::"+usuarioService.verificaNumeroDocumento(persona.getNumeroDocumento()));
//        String correo="chan32432&/@hotmail.com";
//        System.out.println("EL CORREO ES VALIDO::::::::::"+usuarioService.correoValido(correo));
//        Persona persona = personaService.find(Persona.class, 1L);        
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        usuario.setIdUsuario(null
//        Usuario usuario = usuarioService.find(Usuario.class, 1L);
//        for (int i = 0; i < 100; i++) {
//            usuario.setIdUsuario(null);
//            usuarioService.persistUsuario(usuario);
//            List<Usuario> lista = usuarioService.listaUsuario();
//        for (Usuario usuario : lista) {
//                usuario.setIdUsuario(null);
//                usuarioService.persistUsuario(usuario);                
//            System.out.println("usuario " + usuario.getUsuario());
//        }
//        }
//         for (int i = 0; i < 10; i++) {
//            List<Usuario> lista = usuarioService.listaUsuario();
//            for (Usuario usuario : lista) {
//                usuario.setIdUsuario(null);
//                usuarioService.persistUsuario(usuario);
//
//            }
//        }
//        System.out.println("ENCONTRO:" + usuarioRolService.findRolPorCodigo("EXT"));        
//        Regional regional = regionalService.find(Regional.class, 1L);
//        FlujoEtapa flujoEtapa = flujoEtapaService.find(FlujoEtapa.class, 12L);
//        System.out.println("El Usuario es:::::::::::::::::::::::::: "+usuarioService.encuentraUsuarioParaAsignarTramite(flujoEtapa, regional));
//        Rol rol = rolService.find(Rol.class, 5L);
//        
//        List<UsuarioRol> lista = usuarioRolService.listaRolesPorRegional(rol, regional);
//        for (UsuarioRol usuarioRol : lista) {
//            System.out.println("Roles por Regional**********"+usuarioRol.getUsuario().getLogin());
//        }
//        System.out.println("El USUARIO ES::::::::::.."+usuarioService.encuentraUsuarioConMenorCargaLaboral(lista));
//        System.out.println("regional central****************"+regionalService.encuentraRegionalSede());
//        Regional regional=usuarioService.obtieneRegionalPorUsuario((Usuario)usuarioService.find(Usuario.class,1L));
//        System.out.println("el id regional es"+regional.getIdRegional());
//        Usuario usuario = usuarioService.find(Usuario.class, 16L);
////        
////        if (usuarioService.verificaRolRevisorUsuario(usuario)){
////            System.out.println("Tiene roles asignados *** ");
////        }else{
////            System.out.println("No Tiene roles asignados *** ");
////        }
////            
////        
////        Persona persona = personaService.find(Persona.class, 19L);
////        try {
////            usuarioService.guardaPersonaUsuario(persona, usuario, 2L);
////        } catch (Exception e) {
////            e.getMessage();
////        }
//        System.out.println("es director????------------ "+usuarioRolService.verificaSiUsuarioEsDirector(usuario));
        //Verificar la carga al usuario notificador
//        FlujoEtapa flujoEtapa = flujoEtapaService.find(FlujoEtapa.class, 8L);
//        Regional regional = regionalService.find(Regional.class, 1L);
//        Usuario usuarioSolicitante = usuarioService.find(Usuario.class, 1L);
//        
//        try {
//            Usuario usuario = usuarioService.encuentraUsuarioParaNotificarTramite(flujoEtapa, regional, usuarioSolicitante);            
//            System.out.println("Usuario asignado "+ usuario.getIdUsuario());
//        } catch (Exception ex) {
//            Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        Usuario usuario = usuarioService.find(Usuario.class, 16L);
//        
//        
//        if (usuarioService.verificaSiUsuarioTieneRolIngresado(usuario, EnumRolesUsuario.TECNICO_EN_PUBLICACION)){
//            System.out.println("Tiene roles asignados ... ");
//        }else{
//            System.out.println("No tiene roles asignados ... ");
//        }
//        String url = usuarioService.derivaALasBandejasSegunaElUsuario(usuario);
//        System.out.println(" *** "+ url);
//                
    }

}