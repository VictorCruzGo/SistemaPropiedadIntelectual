select '**** Creacion de Funciones y Procedimientos ****';

select 'creacion función diashabiles';



delimiter //

create function diashabiles(fechaInicio datetime, fechaFin datetime)
    /***
    * Creado: Eddy Valero Fecha:
    * Funcion que determina el numero de dias habiles entre una fechaInicio y una fechaFin
    * -------------------------------------------------------------------------
    * Modificado: Eddy Valero Fecha: 06/05/2015
    * se realiza la modificación para que modificar el formato de la fecha de Inicio
    **/
  returns int(11)
begin
  declare cont int(11);
  declare contnolaboral int(11);
  declare fechaI datetime;
  declare fechaF datetime;
  
  #inicializar variables
  set cont:=0;
  set fechaI:=date_add(Date_format(fechaInicio,'%Y-%m-%d'), interval 1 day);
  set fechaF:=fechaFin;
  set contnolaboral:=0;
  
  
  #por si ingresa a la condicion y ejecuta las condiciones
  
  while fechaI<=fechaF do
    #if (cont>=0) then
    set contnolaboral := (select count(*) from NoLaboral where fecha = fechaI);
    if (contnolaboral = 0) then
        set cont:=cont+1;
    end if;
    
    SET FechaI = date_add(FechaI, interval 1 day);
  end while;
  return cont;
end;

//

select 'creacion función devposicion' //


create function devposicion(nrodias int, total int)
    /*
    *
    */
    returns int
    begin
      declare posicion int;
      set posicion:=0;
      
      if ((total*0.6)>nrodias) then
          #si numero de dias esta en el intervalo es verde
          set posicion:=2;
        elseif((total*0.9)>nrodias) then
          #si numero de dias esta a punto de salir del intervalo es amarillo
          set posicion:=3;
        elseif(total>=nrodias) then
          #si numero de dias esta en el limite es rojo
          set posicion:=1;
        else
          #si numero de dias esta fuera de rango es negro
          set posicion:=4;
      end if;
       
      return posicion;
    end;

//

delimiter ;

/************************************************************************************/
/**
* Creacion de la función diashabilesregional
* Creado: Eddy Valero  Fecha: 21 de Agosto
* Descripcion: Funcion que determina el numero de dias habiles entre una
* fechaInicio y una fechaFin para una determinada regional
*
*/


delimiter //

create function diashabilesregional(fechaInicio datetime, fechaFin datetime, idReg long)
    /***
    *
    **/
  returns int(11)
begin
  declare cont int(11);
  declare contnolaboral int(11);
  declare fechaI datetime;
  declare fechaF datetime;
  
  #inicializar variables
  set cont:=0;
  set fechaI:=date_add(Date_format(fechaInicio,'%Y-%m-%d'), interval 1 day);
  set fechaF:=fechaFin;
  set contnolaboral:=0;
  
  #Determinar la regional

  
  #por si ingresa a la condicion y ejecuta las condiciones
  while fechaI<=fechaF do
    #if (cont>=0) then
    set contnolaboral := (select count(*) from NoLaboral where fecha = fechaI and vigente is true and (IdRegional = 0 or IdRegional = idReg));
    if (contnolaboral = 0) then
        set cont:=cont+1;
    end if;
    
    SET FechaI = date_add(FechaI, interval 1 day);
  end while;
  return cont;
end;

//


delimiter ;

/************************************************************************************/
select 'creacion de la funcion obspornotificacion';

delimiter //

create function obspornotificacion(idnotificacionValor long)
/**
* Creacion de la funcion obspornotificacion
* Creado: Eddy Valero  Fecha: 23 de Febrero del 2015
* Devolver todas las observaciones correspondientes a un determinada Notificacion
*/
  returns text
begin

  DECLARE vt_tmpobn varchar(400) DEFAULT '';
  DECLARE vt_observacion text(4000) default '';

  DECLARE fin INTEGER DEFAULT 0;

  declare cr_observaciones CURSOR FOR 
  select ObservacionNotificacionDocumento
  from NotificacionDocumento
  where IdNotificacion = idnotificacionValor
  order by IdNotificacionDocumento, IdNotificacion asc;

  DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin=1;

  open cr_observaciones;

    recorre_cursor: LOOP

      fetch cr_observaciones into vt_tmpobn;
    
      if fin = 1 then
        leave recorre_cursor;
      end if;
      
      set vt_observacion :=  concat(vt_observacion,' | ' ,vt_tmpobn);

    end LOOP recorre_cursor;

  close cr_observaciones;


	set vt_observacion :=  concat(vt_observacion,' | ');
  
  return vt_observacion;

end;
//

delimiter ;
/************************************************************************************/

select 'creacion de la funcion contar_tfe';

delimiter //

create function contar_tfe(p_idusuario bigint)
/**
* Creacion de la funcion contartfetramite
* Creado: Eddy Valero  Fecha: 26 de Febrero del 2015
* Realizar el conteo de tramites asignados a un determinado usuario
* param: p_idusuario el id del usuario
* return: bigint
*/
/**
* Modificacion de la funcion contartfetramite por contar_tfe
* Modificacion: Susana Escobar Paz  Fecha: 27 de Marzo del 2015
* Realizar el conteo de tramites en etapa de Publicacion asignado a un usuario
* param: p_idusuario el id del usuario
* return: bigint
*/
  returns bigint
begin
  
  
  declare vt_resultado bigint;
  
  
  set vt_resultado := (
              select count(*) as numero
              from TramiteFlujoEtapa tfe
              where
                tfe.IdUsuario = p_idusuario               
              and tfe.EtapaTramite='EXFF'
              and tfe.FechaFin is null
               );
  
  return vt_resultado;
end;
//

delimiter ;

/************************************************************************************/
select 'creacion de la funcion usuario_exff';
delimiter //
create function usuario_exff(vp_regional bigint, vp_idRol bigint)
   /**
* Creacion de la funcion usuario_exff
* Creado: Susana Escobar Paz  Fecha: 27 de Marzo del 2015
* Encuentra el usuario de la regional vp_regional con el rol vp_idRol, con menos tareas por realizar.
* param: vp_regional el id de la regional
* param: vp_idRol el id del Rol
* return: bigint
*/
returns BIGINT 
begin
declare vt_id BIGINT DEFAULT 0;
declare contar_registro BIGINT DEFAULT 0;
  begin
  #Bloque de las Declaraciones ######
  declare vt_idusuario BIGINT DEFAULT 0;
  declare v_ctfe BIGINT DEFAULT 0;
  declare ve_minimo BIGINT DEFAULT 1000000;
  DECLARE done BOOL DEFAULT FALSE;
  declare cr_usuario CURSOR FOR  
                select u.IdUsuario as vt_idusuario  from
                                    Usuario u,
                                    UsuarioRol ur,
                                    Rol r
                                  where
                                    u.IdUsuario = ur.IdUsuario
                                    and r.IdRol = ur.IdRol
                                    and u.IdRegional = vp_regional
                                    and r.IdRol = vp_idRol
                                    ;
  DECLARE CONTINUE HANDLER FOR SQLSTATE '02000' SET done = TRUE;
  OPEN cr_usuario; myLoop: LOOP
    FETCH cr_usuario INTO vt_idusuario;
      IF done THEN
      CLOSE cr_usuario;
      LEAVE myLoop;
     END IF;          
         set v_ctfe:=contar_tfe(vt_idusuario);
         
         #select concat(' contador de tramite flujo etapa ',v_ctfe,' *****') as contTRAFLUETAPA;
         IF (v_ctfe<ve_minimo) THEN
          set ve_minimo:=v_ctfe;
          set vt_id:= vt_idusuario; 
            #select concat(' nuevo ,minimo  ',ve_minimo,' --- ') as minimo;
          #select concat(' id usuario ',vt_id,' *****') as idusuariominimo;
         end if;
         set contar_registro:=contar_registro+1;
   END LOOP;

end;

#select concat(' contador de registros ',contar_registro,' *****') as registros;

    IF (contar_registro =0)  THEN
        #select 'CREAR OTRO CURSOR LA PAZ';
          
          begin
      
      declare vt_idusuario_central BIGINT DEFAULT 0;
      declare v_ctfe_central BIGINT DEFAULT 0;
      declare ve_minimo_central BIGINT DEFAULT 1000000;
      DECLARE done1 BOOL DEFAULT FALSE;
      declare cr_usuario_central CURSOR FOR  
                  select u.IdUsuario as vt_idusuario_central  from
                                      Usuario u,
                                      UsuarioRol ur,
                                      Rol r
                                    where
                                      u.IdUsuario = ur.IdUsuario
                                      and r.IdRol = ur.IdRol
                                      and u.IdRegional = 1
                                      and r.IdRol = vp_idRol
                                      ;
      
      DECLARE CONTINUE HANDLER FOR SQLSTATE '02000' SET done1 = TRUE;
      OPEN cr_usuario_central; myLoop1: LOOP
        FETCH cr_usuario_central INTO vt_idusuario_central;
          IF done1 THEN
          CLOSE cr_usuario_central;
          LEAVE myLoop1;
        END IF;          
          set v_ctfe_central:=contar_tfe(vt_idusuario_central);
          #select concat(' contador de tramite flujo etapa ',v_ctfe_central,' *****') as contTRAFLUETAPA;
           IF (v_ctfe_central<ve_minimo_central) THEN
            set ve_minimo_central:=v_ctfe_central;
            set vt_id:= vt_idusuario_central; 
              #select concat(' nuevo ,minimo  ',ve_minimo_central,' --- ') as minimocentral;
            #select concat(' id usuario ',vt_id,' *****') as idusuariominimo;
           end if;
          set contar_registro:=contar_registro+1;
        END LOOP;
        END;
        END IF; 


#select concat(' contador de registros ',contar_registro,' *****') as registrosCENTRAL;
#select concat(' DEVOLVER ',vt_id,' *****') as DEVOLVER;

return vt_id;
end
//
delimiter ;

/************************************************************************************/
select 'creacion del procedimiento almacenado derivar_tramitespublicados';
delimiter //
create procedure derivar_tramitespublicados(idFlujoParametro BIGINT)
/**
* Creacion del procedimiento derivar_publicacion(idFlujoParametro)
* Creado: Eddy Valero  Fecha: 26 de Febrero del 2015
* Descripcion: Responsable de realizar la derivacion de publicacion,
* a todos los tramites que se encuentren en estado de publicacion
*
*******************************************************************************************
* Modificacion del procedimiento almacenado derivar_publicacion, por derivar_tramitespublicados
* Modificado: Susana Escobar Paz  Fecha: 27 de Marzo del 2015
* Para cada tramite en etapa de Publicacion terminada realizar la designacion de usuario, actualizacion de etapa de tramite, 
* actualizcion y creacion de registro en tabla TramiteFLujoEtapa, derivar tramite a siguiente etapa. 
* param: flujo
*******************************************************************************************
* Modificacion procedimiento derivar_tramitespublicados, para tomar en cuenta estado CONCLUIDO
* Modificado: Susana Escobar Paz  Fecha: 23 de junio del 2015
*/
begin

  #Bloque de las Declaraciones ######
  declare vt_idtramite BIGINT DEFAULT 0;
  declare vt_plazo int(11) default 0;
  declare vt_fechapublicacion datetime default now();
  declare vt_codigodia VARCHAR(25); 
  declare fin INTEGER DEFAULT 0;
  declare vt_nrodias int(11) default 0;
  declare cr_tramites_publicacion CURSOR FOR 
        select
          tr.IdTramite, p.FechaPublicacionGaceta, tr.CodigoDia
        from
          Tramite tr,
          PublicacionTramite pb,
          Publicacion p
        where
          tr.EtapaTramite = 'PUBL'
          and pb.IdTramite = tr.IdTramite
          and p.IdPublicacion = pb.IdPublicacion
          and pb.EstadoPublicacionTramite not in ('ELIM')
          and p.FechaPublicacionGaceta is not null
          and p.EstadoProcesoPublicacion = 'CONC'
        ;

  declare CONTINUE HANDLER FOR NOT FOUND SET fin=1;
  

  #De acuerdo al flujo obtener el numero de dias de la etapa de Publicacion
  set vt_plazo := (select Plazo from FlujoEtapa where IdFlujo = idFlujoParametro and EtapaTramite = 'PUBL');

    #Abrir el cursor
    open cr_tramites_publicacion;

    recorre_cursor:
      LOOP

          fetch cr_tramites_publicacion into vt_idtramite, vt_fechapublicacion, vt_codigodia;
    
          if fin = 1 then
            leave recorre_cursor;
          end if;
      
          #Obtener la regional del usuario de publicacion
          #set vt_nrodias := diashabiles(vt_fechapublicacion, now());


          #Se ingresara con esta configuracion considerando que solo Pamela Nava es la técnico de publicación
          set vt_nrodias := diashabilesregional(vt_fechapublicacion, now(),1);

      select vt_idtramite, vt_fechapublicacion, vt_nrodias, vt_plazo;

      if vt_nrodias >= vt_plazo then
        select 'el numero de dias es mayor al plazo';

        #Bloque de Modificacion de Tramite y creación de TramiteFlujoEtapa

        begin
          declare vt_idrol BIGINT default 12;
          declare vt_regional BIGINT default 1;

          declare vt_tipoasignacion VARCHAR(4) default 'AUT';
          declare vt_estadotarea VARCHAR(5) default 'ASIG' ;
          declare vt_fechaasignacion DATETIME default now();
          declare vt_fechainicio DATETIME default null;
          declare vt_fechafin DATETIME default null;
          declare vt_numeroingreso int(11) default 0;
          declare vt_etapatramite varchar(4) default 'EXFF';
          declare vt_estadoProceso varchar(4) default 'PROC';
          declare vt_codigo varchar(25) default null;

          #esta variable fue declarada en el inicio
          #declare vt_codigodia VARCHAR(25);


          declare vt_ultimahorainiciada VARCHAR(25) default null;
          declare vt_tiempototal VARCHAR(10) default null;
          declare vt_vecesrevision INT(11) default 0;
          declare vt_observacion VARCHAR(250) default null;
          declare vt_tiporevision VARCHAR(4) default 'NREV';
          declare vt_fechaultimamodificacion DATETIME default now();

          #se debe obtener el usuario del job, el que realizara estas tareas
          declare vt_usuario BIGINT default 1;
          declare vt_usuarioBD BIGINT default 1;

          #se debe obtener el usuario con menor carga laboral para realizar el examen de fondo
          declare vt_idusuario BIGINT default 5;

          /****************/
                                        set vt_regional =(select IdRegional from Tramite where IdTramite =vt_idtramite and Vigente=true);
                                        set vt_idrol=(select IdRol from Rol where Codigo='TARM' and Estado = true);

                                        set vt_idusuario = (select  usuario_exff(vt_regional,vt_idrol));   
                                        

                    

         update Tramite
          set EstadoProceso = vt_estadoProceso,  EtapaTramite = vt_etapatramite, Usuario = vt_usuarioBD, fechaUltimaModificacion = vt_fechaultimamodificacion
          where IdTramite = vt_idtramite; 

          
        
          update TramiteFlujoEtapa
            set FechaFin = now(),
              EstadoTarea='CONC'
            where IdTramite = vt_idtramite
              and EtapaTramite = 'PUBL'
              and FechaFin is null
              and EstadoTarea = 'ASIG';
          

          INSERT INTO TramiteFlujoEtapa
            (IdTramite, IdUsuario, TipoAsignacion, EstadoTarea, FechaAsignacion, FechaInicio, FechaFin, NumeroIngreso, EtapaTramite, Codigo, CodigoDia, UltimaHoraIniciada, TiempoTotal, VecesRevision, Observacion, TipoRevision, FechaUltimaModificacion, Usuario)
            VALUES
            (vt_idtramite, vt_idusuario, vt_tipoasignacion, vt_estadotarea, vt_fechaasignacion, vt_fechainicio, vt_fechafin, vt_numeroingreso, vt_etapatramite, vt_codigo, vt_codigodia, vt_ultimahorainiciada, vt_tiempototal, vt_vecesrevision, vt_observacion, vt_tiporevision, vt_fechaultimamodificacion, vt_usuario);
            select concat('se derivo a siguiente etapa, a IdUsuario  ',vt_idusuario,' --- ') as AsignarUsuario;
        end;
          
      else
        select 'el numero de dias es menor al plazo';
        
      end if;
      end LOOP recorre_cursor;

    #Cerrar el cursor
    close cr_tramites_publicacion;

  
  select idFlujoParametro;


    

end
//

delimiter ;

/************************************************************************************/
/**
* Creacion de la funcion contar_tfe_etapa
*/
select 'creacion de la función contar_tfe_etapa';

delimiter //

create function contar_tfe_etapa(p_idusuario bigint, p_etapatramite varchar(4))
/**
* Creacion de la funcion contar_tfe_etapa
* Creado: Eddy Valero  Fecha: 26 de Febrero del 2015
* Realizar el conteo de tramites asignados a un determinado usuario y por etapa
* param: p_idusuario el id del usuario
* param: p_etapatramite la etapaTramite que se desea comparar.
* return: bigint, numero de tramites asignados al usuario
*/
  returns bigint
begin
  
  
  declare vt_resultado bigint;
  
  
  set vt_resultado := (
              select count(*) as numero
              from TramiteFlujoEtapa tfe
              where
                tfe.IdUsuario = p_idusuario               
              and tfe.EtapaTramite = p_etapatramite
              and tfe.FechaFin is null
               );
  
  return vt_resultado;
end;
//

delimiter ;


/************************************************************************************/
select 'creacion del procedimiento actualizarfechasistema';
delimiter //
create procedure actualizarfechasistema()
/**
* Creacion del procedimiento actualizarfechasistema()
* Creado: Eddy Valero  Fecha: 24/10/2015
* Descripcion: Responsable de realizar la actualización
* de fechas en la tabla Sistema
******/
begin

	update Sistema
	set Fecha = date_format(now(),'%Y-%m-%d');

    

end
//

delimiter ;

/************************************************************************************/
select 'CreacionEventos';

/**
* Creacion del evento de prueba
CREATE event evento_prueba ON schedule every 5 minute do call derivar_tramitespublicados(1);
*/

/***********************************************************************************/
/**
Configurar el evento para que se dispare cada dia a las 03:00 de la mañana, este bloque se debe descomentar cuando se ingresa a produccion
*/

select 'evento evento_derivartramitespublicados';

CREATE event evento_derivartramitespublicados on schedule every 1 day starts '2015-06-29 00:15:00' do call derivar_tramitespublicados(1); 


/***
* Creado: Eddy Valero Fecha: 24/10/2015
* Funcion que determina el numero de dias habiles entre una fechaInicio y una fechaFin
*/

select 'evento evento_fechasistema';

CREATE event evento_fechasistema on schedule every 1 day starts '2015-10-24 00:15:00' do call actualizarfechasistema(); 


# Crear el procedimiento generarregistrosgestion

/************************************************************************************/
/**
* Creacion del procedimiento generarregistrosgestion
* Creado: Eddy Valero  Fecha: 01 de Diciembre
* Descripcion: Procedimiento que genera registros por gestion para todos los correlativos, acepta
* como parametro la gestión.
*
*/
select 'Creación procedimiento almacenado generarregistrosgestion';


DROP PROCEDURE IF EXISTS generarregistrosgestion;

DELIMITER //

CREATE PROCEDURE generarregistrosgestion(gestion VARCHAR(5))
BEGIN

	DECLARE vt_idUsuario BIGINT DEFAULT 1;
  DECLARE vt_idCorrelativo BIGINT;
  set vt_idCorrelativo := (select max(IdCorrelativo)+1 from Correlativo);

  # Crear una tabla temporal
  CREATE TEMPORARY TABLE IF NOT EXISTS tmpTiposTramite(
    IdTmp BIGINT,
    NombreTabla VARCHAR(100),
    TipoTramite VARCHAR(4)
    );


  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (1,'REGS', 'SM');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (2, 'CATR', 'ST');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (3, 'CADO', 'CD');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (4, 'CANO', 'CN');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (5, 'CAFU', 'SF');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (6, 'CALU', 'LU');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (7, 'RENO', 'SR');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (8, 'BUSQ', 'BQ');
  INSERT INTO tmpTiposTramite(IdTmp, NombreTabla, TipoTramite) VALUES (9, 'CERT', 'CE');
  
  
  BEGIN
    DECLARE vt_idTmp BIGINT;
    DECLARE vt_tipoTramite VARCHAR(5);
    DECLARE vt_nombreTabla VARCHAR(100);
    DECLARE fin INTEGER DEFAULT 0;

    DECLARE cr_tmp CURSOR FOR
      SELECT IdTmp, NombreTabla, TipoTramite
      FROM tmpTiposTramite;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin = 1;  
  

    OPEN cr_tmp;

    recorre_cursor:
      LOOP
        FETCH cr_tmp INTO vt_idTmp, vt_nombreTabla, vt_tipoTramite;
        IF (fin = 1) THEN
          LEAVE recorre_cursor;
        END IF;
      

        BEGIN
          DECLARE finRegional INTEGER DEFAULT 0;
          DECLARE vt_idRegional BIGINT;
          DECLARE vt_ultimoNumero BIGINT;
          DECLARE vt_idCorrelativoInicial BIGINT DEFAULT vt_idCorrelativo;
          DECLARE cr_regional CURSOR FOR
            select IdRegional
            from Regional
            where IdRegional <= 6;

          DECLARE CONTINUE HANDLER FOR NOT FOUND SET finRegional = 1;

          OPEN cr_regional;

          recorre_cursor_regional:
          LOOP
            FETCH cr_regional INTO vt_idRegional;
            IF (finRegional = 1) THEN
              LEAVE recorre_cursor_regional;
            END IF;

            IF (vt_idRegional = 1) THEN
              set vt_ultimoNumero = 1;
            END IF;

            IF (vt_idRegional = 2) THEN
              set vt_ultimoNumero = 300001;
            END IF;

            IF (vt_idRegional = 3) THEN
              set vt_ultimoNumero = 100001;
            END IF;

            IF (vt_idRegional = 4) THEN
              set vt_ultimoNumero = 200001;
            END IF;

            IF (vt_idRegional = 5) THEN
              set vt_ultimoNumero = 400001;
            END IF;

            IF (vt_idRegional = 6) THEN
              set vt_ultimoNumero = 500001;
            END IF;


--             select vt_tipoTramite, vt_idRegional, vt_incremento;




          -- Insertar un registro en Correlativo
           INSERT INTO Correlativo(IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Gestion, Usuario, FechaUltimaModificacion)
           VALUES (vt_idCorrelativo, vt_nombreTabla, 1, vt_ultimoNumero, vt_tipoTramite, '-', gestion, vt_idUsuario, now());
 
           -- Insertar un registro en RegionalCorrelativo
           INSERT INTO RegionalCorrelativo (IdRegional, IdCorrelativo, TipoTramite, Estado, Usuario, FechaUltimaModificacion)
           VALUES(vt_idRegional, vt_idCorrelativo, vt_tipoTramite, 'AC', vt_idUsuario, now());
           
           set vt_idCorrelativo := vt_idCorrelativo + 1;

          END LOOP recorre_cursor_regional;

          CLOSE cr_regional;

          -- Insertar un registro en RegionalCorrelativo
          -- INSERT INTO RegionalCorrelativo (IdRegional, IdCorrelativo, TipoTramite, Estado, Usuario, FechaUltimaModificacion)
          -- VALUES(5, vt_idCorrelativoInicial, vt_tipoTramite, 'AC', vt_idUsuario, now());

          -- INSERT INTO RegionalCorrelativo (IdRegional, IdCorrelativo, TipoTramite, Estado, Usuario, FechaUltimaModificacion)
          -- VALUES(6, vt_idCorrelativoInicial, vt_tipoTramite, 'AC', vt_idUsuario, now());


        END;
        
        


      END LOOP recorre_cursor;


  END;






DROP TEMPORARY TABLE tmpTiposTramite;




END;
//


DELIMITER ;

select 'ejecutar Procedimiento generarregistrosgestion';
call generarregistrosgestion(2015);