/*
Usuario: invitado
password: Invitado12345
Regional: La Paz
Rol: UsuarioExterno
**/
delimiter //

#drop procedure regusuario//

create procedure regusuario() 

begin
	#Asignacion de variables genericas
	declare Usuario bigint(20);
	declare FechaUltimaModificacion datetime;
	declare FechaCreacion datetime;
	declare Vigente bit(1);
	
	#Asignacion de variables para persona
	declare secpersona bigint(20);
	declare Nombres varchar(50);
	declare ApellidoPaterno varchar(30);
	declare ApellidoMaterno varchar(30);
	declare TipoDocumento varchar(4);
	declare Bloqueado tinyint(1);
	declare LugarExpedicion varchar(4);
	declare Genero varchar(4);
	declare FechaNacimiento datetime;
	declare NumeroDocumento varchar(15);

	#Asignacion de variables para Usuario
	declare secusuario bigint(20);
	declare IdRegional bigint(20);
	declare Login varchar(20);
	declare Pass varchar(100);
	declare Activo bit(1);
	declare TipoUsuario varchar(4);

	#Asignacion de variables para UsuarioRol
	declare secusuariorol bigint(20);
	declare FechaInicio datetime;
	declare IdRol bigint(20);
	declare FechaFin datetime;
	
	#Inicializacion de variables
	set FechaCreacion := now();
	set Usuario := NULL;
	set FechaUltimaModificacion := now();

	set Nombres:='Invitado';
	set ApellidoPaterno := 'ApellidoPaterno';
	set ApellidoMaterno := 'ApellidoMaterno';
	set NumeroDocumento := '567';
	set TipoDocumento := 'CIDE';
	set Bloqueado := 0;
	set LugarExpedicion := 'LPZ';
	set Genero := 'MAS'; 
	set FechaNacimiento := '1965-09-15 09:20:57';
	set Vigente := 1;

	set IdRegional := 1;
	set Login := 'invitado';
	set Pass := 'P1uupU3YdqxEUbLnC67Lww==';
	set Activo := 1;
	set TipoUsuario := 'UEXT';
	
	set secpersona := (select max(IdPersona) from Persona);
	set secusuario := (select max(IdUsuario) from Usuario);
	set secusuariorol := (select max(IdUsuarioRol) from UsuarioRol);
	set FechaInicio := now();
	set IdRol := 1;
	set FechaFin := NULL;

	select secpersona;
	select secusuario;


	insert into Persona
	(IdPersona, Nombres, ApellidoPaterno, ApellidoMaterno, NumeroDocumento, TipoDocumento, Bloqueado, LugarExpedicion, Genero, FechaNacimiento, Vigente, FechaCreacion, Usuario, FechaUltimaModificacion)
	values
	(secpersona+1, Nombres, ApellidoPaterno, ApellidoMaterno, NumeroDocumento, TipoDocumento, Bloqueado, LugarExpedicion, Genero, FechaNacimiento, Vigente, FechaCreacion, Usuario, FechaUltimaModificacion);
	
	insert into Usuario
	(IdUsuario, IdPersona, IdRegional, Login, Password, Activo, TipoUsuario, FechaCreacion, Usuario, FechaUltimaModificacion)
	values
	(secusuario+1, secpersona+1, IdRegional, Login, Pass, Activo, TipoUsuario, FechaCreacion, Usuario, FechaUltimaModificacion);
	

	insert into UsuarioRol
	(IdUsuarioRol, IdRol, IdUsuario, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
	values
	(secusuariorol+1, IdRol, secusuario+1, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion);



end;

//

delimiter ;

call regusuario();

delimiter //

drop procedure regusuario//



#Esta linea siempre va al final para la configuracion del delimitador
delimiter ;