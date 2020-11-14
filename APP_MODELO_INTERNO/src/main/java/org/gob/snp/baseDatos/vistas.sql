
/***
 CREACION DE VISTAS
**/

/**
Creacion de la vista bandeja_usuario_externo 
*/

CREATE VIEW bandeja_usuario_externo AS
    (select 
        `e`.`IdExpediente` AS `IdExpediente`,
        `u`.`IdUsuario` AS `IdUsuario`,
        `tr`.`Tramite` AS `tramite`,
        `tr`.`IdTramite` AS `IdTramite`,
        `tr`.`CodigoDia` AS `CodigoDia`,
        `tr`.`Correlativo` AS `Correlativo`,
        `tr`.`FechaUltimaModificacion` AS `FechaUltimaModificacion`,
        `tr`.`TipoTramite` AS `TipoTramite`,
        `tr`.`EtapaTramite` AS `EtapaTramite`,
        `cl`.`Codigo` AS `codigo`,
        `tr`.`FechaIngreso` AS `FechaIngreso`,
        `tr`.`EstadoProceso` AS `EstadoProceso`,
        `smsm`.`Marca` AS `NombreSolicitud`
    from
        (((((`Expediente` `e`
        join `Tramite` `tr`)
        join `TramiteUsuario` `tu`)
        join `SMSignoMarca` `smsm`)
        join `Usuario` `u`)
        join `Clasificador` `cl`)
    where
        ((`e`.`IdExpediente` = `tr`.`IdExpediente`)
            and (`tu`.`IdTramite` = `tr`.`IdTramite`)
            and (`smsm`.`IdTramite` = `tr`.`IdTramite`)
            and (`u`.`IdUsuario` = `tu`.`IdUsuario`)
            and (`tr`.`Tramite` <> 'null')
            and (`smsm`.`TipoSolicitudDeposito` = `cl`.`Codigo`)
            and (`cl`.`Dominio` = 'TipoSolicitud'))) union (select 
        `e`.`IdExpediente` AS `IdExpediente`,
        `u`.`IdUsuario` AS `IdUsuario`,
        `tr`.`Tramite` AS `tramite`,
        `tr`.`IdTramite` AS `IdTramite`,
        `tr`.`CodigoDia` AS `CodigoDia`,
        `tr`.`Correlativo` AS `Correlativo`,
        `tr`.`FechaUltimaModificacion` AS `FechaUltimaModificacion`,
        `tr`.`TipoTramite` AS `TipoTramite`,
        `tr`.`EtapaTramite` AS `EtapaTramite`,
        `cl`.`Codigo` AS `codigo`,
        `tr`.`FechaIngreso` AS `FechaIngreso`,
        `tr`.`EstadoProceso` AS `EstadoProceso`,
        `ddaut`.`Titulo` AS `NombreSolicitud`
    from
        (((((`Expediente` `e`
        join `Tramite` `tr`)
        join `TramiteUsuario` `tu`)
        join `DADerechosAutor` `ddaut`)
        join `Usuario` `u`)
        join `Clasificador` `cl`)
    where
        ((`e`.`IdExpediente` = `tr`.`IdExpediente`)
            and (`tu`.`IdTramite` = `tr`.`IdTramite`)
            and (`ddaut`.`IdTramite` = `tr`.`IdTramite`)
            and (`u`.`IdUsuario` = `tu`.`IdUsuario`)
            and (`ddaut`.`TipoObra` = `cl`.`Codigo`)
            and (`cl`.`Dominio` = 'TipoObra'))) union (select 
        `e`.`IdExpediente` AS `IdExpediente`,
        `u`.`IdUsuario` AS `IdUsuario`,
        `tr`.`Tramite` AS `tramite`,
        `tr`.`IdTramite` AS `IdTramite`,
        `tr`.`CodigoDia` AS `CodigoDia`,
        `tr`.`Correlativo` AS `Correlativo`,
        `tr`.`FechaUltimaModificacion` AS `FechaUltimaModificacion`,
        `tr`.`TipoTramite` AS `TipoTramite`,
        `tr`.`EtapaTramite` AS `EtapaTramite`,
        `cl`.`Codigo` AS `codigo`,
        `tr`.`FechaIngreso` AS `FechaIngreso`,
        `tr`.`EstadoProceso` AS `EstadoProceso`,
        `ppat`.`Nombre` AS `NombreSolicitud`
    from
        (((((`Expediente` `e`
        join `Tramite` `tr`)
        join `TramiteUsuario` `tu`)
        join `PAPatente` `ppat`)
        join `Usuario` `u`)
        join `Clasificador` `cl`)
    where
        ((`e`.`IdExpediente` = `tr`.`IdExpediente`)
            and (`tu`.`IdTramite` = `tr`.`IdTramite`)
            and (`ppat`.`IdTramite` = `tr`.`IdTramite`)
            and (`u`.`IdUsuario` = `tu`.`IdUsuario`)
            and (`ppat`.`Tipo` = `cl`.`Codigo`)
            and (`cl`.`Dominio` = 'Tipo')))
union
(select 
        `e`.`IdExpediente` AS `IdExpediente`,
        `u`.`IdUsuario` AS `IdUsuario`,
        `tr`.`Tramite` AS `tramite`,
        `tr`.`IdTramite` AS `IdTramite`,
        `tr`.`CodigoDia` AS `CodigoDia`,
        `tr`.`Correlativo` AS `Correlativo`,
        `tr`.`FechaUltimaModificacion` AS `FechaUltimaModificacion`,
        `tr`.`TipoTramite` AS `TipoTramite`,
        `tr`.`EtapaTramite` AS `EtapaTramite`,
        `cl`.`Codigo` AS `codigo`,
        `tr`.`FechaIngreso` AS `FechaIngreso`,
        `tr`.`EstadoProceso` AS `EstadoProceso`,
      #  `cl`.`Nombre` AS `NombreSolicitud`
		 '' AS `NombreSolicitud`
    from
        ((((`Expediente` `e`
        join `Tramite` `tr`)
        join `TramiteUsuario` `tu`)
        join `Usuario` `u`)
        join `Clasificador` `cl`)
    where
        ((`e`.`IdExpediente` = `tr`.`IdExpediente`)
            and (`tu`.`IdTramite` = `tr`.`IdTramite`)
            and (tr.TipoTramite in ('CNOM', 'CDIR'))
            and (`u`.`IdUsuario` = `tu`.`IdUsuario`)
            and (`tr`.`Tramite` <> 'null')
            and (`tr`.`TipoTramite` = `cl`.`Codigo`)));

/**
Creacion de la vista etapa
*/
CREATE VIEW etapa_tramite AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'EtapaTramite'
            and Vigente = true
    );

/**
Creacion de la vista tipo_ciudad
*/
CREATE VIEW tipo_ciudad AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoCiudad'
            and Vigente = true
    );

/**
Creacion de la vista tipo_ciudad_notificacion
*/
CREATE VIEW tipo_ciudad_notificacion AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoCiudadNotificacion'
            and Vigente = true
    );

/**
Creacion de la vista tipo_contacto
*/

CREATE VIEW tipo_contacto AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoContacto'
            and Vigente = true
    );

/**
Creacion de la vista tipo_documento
*/

CREATE VIEW tipo_documento AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion,
            DominioPadre
        from
            Clasificador
        where
            Dominio = 'TipoDocumento'
            and Vigente = true
    );

/**
Creacion de la vista estado_proceso
*/
CREATE VIEW estado_proceso AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'EstadoProceso'
            and Vigente = true
    );

/**
Creacion de la vista tipo_genero
*/
CREATE VIEW tipo_genero AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoGenero'
            and Vigente = true
    );

/**
Creacion de la vista tipo_genero_persona
*/
CREATE VIEW tipo_genero_persona AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion
    from
        Clasificador
    where
        Dominio = 'TipoGeneroPersona'
	and Vigente = true
    );

/**
Creacion de la vista tipo_persona_solicitud
*/
CREATE VIEW tipo_persona_solicitud AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoPersonaSolicitud'
            and Vigente = true
    );

/**
Creacion de la vista tipo_proteccion_prioridad
*/
CREATE VIEW tipo_proteccion_prioridad AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoProteccionPrioridad'
            and Vigente = true
    );

/**
Creacion de la vista tipo_proteccion_prioridad_datos
*/

CREATE VIEW tipo_proteccion_prioridad_datos AS
    (
	select 
            Codigo,
            DominioPadre,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoProteccionPrioridadDatos'
            and Vigente = true
    );

/**
Creacion de la vista tipo_signo
*/
CREATE VIEW tipo_signo AS
    (
            select 
                    Codigo,
                    Nombre,
                    Descripcion
            from
                    Clasificador
            where
                    Dominio = 'TipoSigno'
                    and Vigente = true
    );
	
/**
Creacion de la vista tipo_solicitante
*/

CREATE VIEW tipo_solicitante AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion
    from
        Clasificador
    where
        Dominio = 'TipoSolicitante'
        and Vigente = true
    );


/**
Creacion de la vista tipo_solicitud
*/

CREATE VIEW tipo_solicitud AS
    (
        select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoSolicitud'
            and Vigente = true
    );


/**
Creacion de la vista tipo_tramite
*/

CREATE VIEW tipo_solicitud_deposito AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoSolicitudDeposito'
            and Vigente = true
    );


/**
Creacion de la vista tipo_tramite
*/
CREATE VIEW tipo_tramite AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoTramite'
            and Vigente = true
    );

/**
Creacion de la vista tipo_requisito
*/
create view tipo_requisito as 
    (
        select
            j.Codigo,
            j.Nombre,
            j.Descripcion
        from Clasificador as j
        where
            j.Dominio = 'TipoRequisito'
            and j.Vigente = true
    );

/**
Creacion de la vista tipo_respuesta_requisito
*/
create view tipo_respuesta_requisito as 
    (
    select j.Codigo, j.Nombre, j.Descripcion
    from Clasificador as j
    where
        j.Dominio = 'TipoRespuestaRequisito'
        and j.Vigente = true
    );

/**
Creacion de la vista tipo_examen
*/
create view tipo_examen as 
(
    select j.Codigo, j.Nombre, j.Descripcion
    from Clasificador as j
    where
        j.Dominio = 'TipoExamen'
        and j.Vigente = true
);

/**
Creacion de la vista estado_documento
*/
create view estado_documento as 
    (
        select j.Codigo, j.Nombre, j.Descripcion
        from Clasificador as j
        where
            j.Dominio = 'EstadoDocumento'
            and j.Vigente = true
    );

/**
Creacion de la vista estado_registro
*/
create view estado_registro as 
    (
        select j.Codigo, j.Nombre, j.Descripcion
        from Clasificador as j
        where
            j.Dominio = 'EstadoRegistro'
            and j.Vigente = true
    );

/**
Creacion de la vista estado_tarea
*/
create view estado_tarea as 
(
    select j.Codigo, j.Nombre, j.Descripcion
    from Clasificador as j
    where
        j.Dominio = 'EstadoTarea'
        and j.Vigente = true
);

/**
Creacion de la vista estado_etapa
*/
create view estado_etapa as 
(
    select j.Codigo, j.Nombre, j.Descripcion
    from Clasificador as j
    where
        j.Dominio = 'EstadoEtapa'
        and j.Vigente = true
);

/**
Creacion de la vista TipoFormularioVentanillaEForma
*/
create view tipo_formulario_ventanilla_e_forma as 
(
    select j.Codigo, j.DominioPadre, j.Nombre, j.Descripcion, j.Orden
    from Clasificador as j
    where
        j.Dominio = 'TipoFormularioVentanillaEForma'
        and j.Vigente = true
);

/**
Creacion de la vista TipoAsignacion
*/
create view tipo_asignacion as 
(
    select j.Codigo, j.DominioPadre, j.Nombre, j.Descripcion
    from Clasificador as j
    where
        j.Dominio = 'TipoAsignacion'
        and j.Vigente = true
);

/**
Creacion de la vista tipo_banco
*/
create view tipo_banco as 
(
    select r.Codigo, r.DominioPadre, r.Nombre, r.Vigente, r.Descripcion
    from Clasificador as r
    where
        r.Dominio = 'TipoBanco'
        and r.Vigente = true
);

/**
Creacion de la vista bandeja_usuario
*/
/*
create view bandeja_usuario
as
	(
		select 	e.IdExpediente AS IdExpediente,
				tr.IdTramite AS IdTramite,
				u.IdUsuario AS IdUsuario,
				tr.TipoTramite AS TipoTramite,
				tr.Tramite AS Tramite,
				tr.EtapaTramite AS EtapaTramite,
				tfe.FechaAsignacion AS FechaAsignacion,
				tfe.Observacion AS Observacion,
				cl.Nombre AS Nombre,
				tr.FechaIngreso AS FechaIngreso,
				tr.EstadoProceso AS EstadoProceso,
				smsm.Marca AS NombreSolicitud,diashabiles(cast(tfe.FechaAsignacion as date),now()) AS DiasHabiles,
				(select fe.Plazo from (Flujo f join FlujoEtapa fe)
						where ((f.TipoTramite = tr.TipoTramite)
							and (f.IdFlujo = fe.IdFlujo)
							and (fe.EtapaTramite = tr.EtapaTramite)
							and (fe.EstadoEtapa = 'ASIG'))) AS Total,
				devposicion(diashabiles(cast(tfe.FechaAsignacion as date),
				now()),
				(select fe.Plazo from (Flujo f join FlujoEtapa fe)
					where ((f.TipoTramite = tr.TipoTramite)
							and (f.IdFlujo = fe.IdFlujo)
							and (fe.EtapaTramite = tr.EtapaTramite)
							and (fe.EstadoEtapa = 'ASIG')))) AS Posicion,
				tfe.FechaFin AS FechaFin
						from (((((Expediente e join Tramite tr) join TramiteFlujoEtapa tfe) join SMSignoMarca smsm) join Usuario u) join Clasificador cl)
						where ((tr.IdExpediente = e.IdExpediente) and (tfe.IdTramite = tr.IdTramite) and (smsm.IdTramite = tr.IdTramite) and (u.IdUsuario = tfe.IdUsuario) and (smsm.TipoSolicitudDeposito = cl.Codigo) and (cl.Dominio = 'TipoSolicitud'))) union (select e.IdExpediente AS IdExpediente,tr.IdTramite AS IdTramite,u.IdUsuario AS IdUsuario,tr.TipoTramite AS TipoTramite,tr.Tramite AS Tramite,tr.EtapaTramite AS EtapaTramite,tfe.FechaAsignacion AS FechaAsignacion,tfe.Observacion AS Observacion,cl.Nombre AS Nombre,tr.FechaIngreso AS FechaIngreso,tr.EstadoProceso AS EstadoProceso,ddaut.Titulo AS NombreSolicitud,diashabiles(cast(tfe.FechaAsignacion as date),now()) AS DiasHabiles,(select fe.Plazo from (Flujo f join FlujoEtapa fe) where ((f.TipoTramite = tr.TipoTramite) and (f.IdFlujo = fe.IdFlujo) and (fe.EtapaTramite = tr.EtapaTramite) and (fe.EstadoEtapa = 'ASIG'))) AS Total,devposicion(diashabiles(cast(tfe.FechaAsignacion as date),now()),(select fe.Plazo from (Flujo f join FlujoEtapa fe) where ((f.TipoTramite = tr.TipoTramite) and (f.IdFlujo = fe.IdFlujo) and (fe.EtapaTramite = tr.EtapaTramite) and (fe.EstadoEtapa = 'ASIG')))) AS Posicion,tfe.FechaFin AS FechaFin from (((((Expediente e join Tramite tr) join TramiteFlujoEtapa tfe) join DADerechosAutor ddaut) join Usuario u) join Clasificador cl) where ((tr.IdExpediente = e.IdExpediente) and (tfe.IdTramite = tr.IdTramite) and (ddaut.IdTramite = tr.IdTramite) and (u.IdUsuario = tfe.IdUsuario) and (ddaut.TipoObra = cl.Codigo) and (cl.Dominio = 'TipoObra'))) union (select e.IdExpediente AS IdExpediente,tr.IdTramite AS IdTramite,u.IdUsuario AS IdUsuario,tr.TipoTramite AS TipoTramite,tr.Tramite AS Tramite,tr.EtapaTramite AS EtapaTramite,tfe.FechaAsignacion AS FechaAsignacion,tfe.Observacion AS Observacion,cl.Nombre AS Nombre,tr.FechaIngreso AS FechaIngreso,tr.EstadoProceso AS EstadoProceso,ppat.Nombre AS NombreSolicitud,diashabiles(cast(tfe.FechaAsignacion as date),now()) AS DiasHabiles,(select fe.Plazo from (Flujo f join FlujoEtapa fe) where ((f.TipoTramite = tr.TipoTramite) and (f.IdFlujo = fe.IdFlujo) and (fe.EtapaTramite = tr.EtapaTramite) and (fe.EstadoEtapa = 'ASIG'))) AS Total,devposicion(diashabiles(cast(tfe.FechaAsignacion as date),now()),(select fe.Plazo from (Flujo f join FlujoEtapa fe) where ((f.TipoTramite = tr.TipoTramite) and (f.IdFlujo = fe.IdFlujo) and (fe.EtapaTramite = tr.EtapaTramite) and (fe.EstadoEtapa = 'ASIG')))) AS Posicion,tfe.FechaFin AS FechaFin from (((((Expediente e join Tramite tr) join TramiteFlujoEtapa tfe) join PAPatente ppat) join Usuario u) join Clasificador cl) where ((tr.IdExpediente = e.IdExpediente) and (tfe.IdTramite = tr.IdTramite) and (ppat.IdTramite = tr.IdTramite) and (u.IdUsuario = tfe.IdUsuario) and (ppat.Tipo = cl.Codigo) and (cl.Dominio = 'TipoInvencion')));

*/

create view bandeja_usuario
as
	(
select
		e.IdExpediente, tr.IdTramite, u.IdUsuario,
		tr.TipoTramite, tr.Tramite, tfe.EtapaTramite, tfe.FechaAsignacion,
		tfe.Observacion AS 'Observacion',
		cl.Nombre, tr.FechaIngreso, tr.EstadoProceso, 
		smsm.Marca as 'NombreSolicitud',
		tfe.DiasHabiles,
		(select
				fe.plazo
		 from 	Flujo f,
				FlujoEtapa fe
		 where f.TipoTramite = tr.TipoTramite 
				and f.IdFlujo = fe.IdFlujo
				and fe.EtapaTramite = tr.EtapaTramite
				and fe.EstadoEtapa = 'ASIG') as Total,
		tfe.Posicion,
                tfe.FechaFin FechaFin
	from
		Expediente e,
		Tramite tr,
		TramiteFlujoEtapa tfe,
		SMSignoMarca smsm,
		Usuario u,
		Clasificador cl
	where
		tr.IdExpediente = e.IdExpediente
		and tfe.IdTramite = tr.IdTramite
		and smsm.IdTramite = tr.IdTramite
		and u.IdUsuario = tfe.IdUsuario
		and smsm.TipoSolicitudDeposito = cl.Codigo
		and cl.Dominio = 'TipoSolicitud'
)
union
(
	select
		e.IdExpediente, tr.IdTramite, u.IdUsuario,
		tr.TipoTramite, tr.Tramite, tfe.EtapaTramite, tfe.FechaAsignacion,
		tfe.Observacion AS 'Observacion',
		cl.Nombre, tr.FechaIngreso, tr.EstadoProceso, 
		ddaut.Titulo as 'NombreSolicitud',
		tfe.DiasHabiles,
		(select
				fe.plazo
		 from 	Flujo f,
				FlujoEtapa fe
		 where f.TipoTramite = tr.TipoTramite 
				and f.IdFlujo = fe.IdFlujo
				and fe.EtapaTramite = tr.EtapaTramite
				and fe.EstadoEtapa = 'ASIG') as Total,
		tfe.Posicion,
                tfe.FechaFin FechaFin
	from
		Expediente e,
		Tramite tr,
		TramiteFlujoEtapa tfe,
		DADerechosAutor ddaut,
		Usuario u,
		Clasificador cl
	where
		tr.IdExpediente = e.IdExpediente
		and tfe.IdTramite = tr.IdTramite
		and ddaut.IdTramite = tr.IdTramite
		and u.IdUsuario = tfe.IdUsuario
		and ddaut.TipoObra = cl.Codigo
		and cl.Dominio = 'TipoObra'
)
union
(
select
		e.IdExpediente, tr.IdTramite, u.IdUsuario,
		tr.TipoTramite, tr.Tramite, tfe.EtapaTramite, tfe.FechaAsignacion,
		tfe.Observacion AS 'Observacion',
		cl.Nombre, tr.FechaIngreso, tr.EstadoProceso, 
		ppat.nombre as 'NombreSolicitud',
		tfe.DiasHabiles,
		(select
				fe.plazo
		 from 	Flujo f,
				FlujoEtapa fe
		 where f.TipoTramite = tr.TipoTramite 
				and f.IdFlujo = fe.IdFlujo
				and fe.EtapaTramite = tr.EtapaTramite
				and fe.EstadoEtapa = 'ASIG') as Total,
		tfe.Posicion,
                tfe.FechaFin FechaFin
	from
		Expediente e,
		Tramite tr,
		TramiteFlujoEtapa tfe,
		PAPatente ppat,
		Usuario u,
		Clasificador cl
	where
		tr.IdExpediente = e.IdExpediente
		and tfe.IdTramite = tr.IdTramite
		and ppat.IdTramite = tr.IdTramite
		and u.IdUsuario = tfe.IdUsuario
		and ppat.Tipo = cl.Codigo
		and cl.Dominio = 'TipoInvencion'
)
union
(
select
		e.IdExpediente, tr.IdTramite, u.IdUsuario,
		tr.TipoTramite, tr.Tramite, tfe.EtapaTramite, tfe.FechaAsignacion,
		tfe.Observacion AS 'Observacion',
		cl.Nombre, tr.FechaIngreso, tr.EstadoProceso, 
		cl.Nombre as 'NombreSolicitud',
		#case tr.TipoTramite when 'CNOM' then 'Modifificación de Nombre' when 'CDIR'  then 'Modificación de Dirección' end as 'NombreSolicitud 2',
		tfe.DiasHabiles,
		(select
				fe.plazo
		 from 	Flujo f,
				FlujoEtapa fe
		 where f.TipoTramite = tr.TipoTramite 
				and f.IdFlujo = fe.IdFlujo
				and fe.EtapaTramite = tr.EtapaTramite
				and fe.EstadoEtapa = 'ASIG') as Total,
		tfe.Posicion,
                tfe.FechaFin FechaFin
	from
		Expediente e,
		Tramite tr,
		TramiteFlujoEtapa tfe,
		#SMSignoMarca smsm,
		Usuario u,
		Clasificador cl
	where
		tr.IdExpediente = e.IdExpediente
		and tfe.IdTramite = tr.IdTramite
		and u.IdUsuario = tfe.IdUsuario
		and tr.TipoTramite in ('CNOM', 'CDIR')
		and tr.TipoTramite= cl.Codigo
                and cl.Dominio = 'TipoSolicitud'
)
;

/**
Creacion de la vista TipoDosificacion
*/
create view tipo_dosificacion as 
(
    select j.Codigo, j.Nombre, j.Descripcion
    from Clasificador as j
    where 
        j.Dominio = 'TipoDosificacion'
        and j.Vigente = true
);


/**
Creacion de la vista EstadoDeposito
*/
create view estado_deposito as 
(
    select j.Codigo, j.Nombre, j.Descripcion, j.Vigente
    from Clasificador as j
    where
        j.Dominio = 'EstadoDeposito'
        and j.Vigente = true
);

/**
Creacion de la vista EstadoRecibo
*/
create view estado_recibo as 
(
    select j.Codigo, j.Nombre, j.Descripcion, j.Vigente
    from Clasificador as j
    where
        j.Dominio = 'EstadoRecibo'
        and j.Vigente = true
);

/**
Creacion de la vista TipoElementoHTML
*/
create view tipo_elemento_html as 
(
    select j.Codigo, j.Nombre, j.Descripcion, j.Vigente
    from Clasificador as j
    where
        j.Dominio = 'TipoElementoHTML'
        and j.Vigente = true
);

/**
Creacion de la vista grid_registro_existente: 
*/

create view grid_registro_existente
as
(
	select
		t.IdTramite,
		re.IdRegistro,
		t.Tramite SM,
		sn.NumeroClaseNiza Clase,
		sn.ListaProducto ListaProducto,
		re.Registro Registro,
		( select FechaAsignacion from TramiteFlujoEtapa
		where IdTramite = t.IdTramite
		and EtapaTramite = 'VEN'
		and EstadoTarea = 'CONC'
		order by FechaInicio asc
		limit 1) fechaIngreso,
		sm.Marca NombreMarca
	from Tramite t,
		 SMSignoMarca sm,
		 SMSignoClaseNiza sn,
		 Registro re
	where
		 t.vigente is true
		 and t.Tramite is not null
		 and t.IdTramite = sm.IdTramite
		 and sn.IdTramite = sm.IdTramite
		 and re.IdTramite = t.IdTramite
);
/**
Creacion de la vista tipoModificacion: 
*/
create view tipo_modificacion as 
(
    select j.Codigo, j.Nombre, j.Descripcion, j.Vigente
    from Clasificador as j
    where
        j.Dominio = 'TipoModificacion'
        and j.Vigente = true
);

/**
Creacion de la vista tipoPais: 
*/
CREATE VIEW tipo_pais AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoPais'
            and Vigente = true
    );


/**
 Creacion de la vista tipoRepresentante: 
*/
CREATE VIEW tipo_representante AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoRepresentante'
        and Vigente = true
	);

/**
 Creacion de la vista tipoRevision: 
*/
CREATE VIEW tipo_revision AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoRevision'
        and Vigente = true
    );


/**
 Creacion de la vista tipoRevision: 
*/
CREATE VIEW tipo_archivo AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoArchivo'
        and Vigente = true
    );

/**
 Creacion de la vista tipoDocumentacion
Responsable: Eddy Valero
Fecha: 28012015 
*/
CREATE VIEW tipo_documentacion AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoDocumentacion'
        and Vigente = true
    );


/**
 Creacion de la vista tipoNotificacion
Responsable: Eddy Valero
Fecha: 11022015
*/
CREATE VIEW tipo_notificacion AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoNotificacion'
        and Vigente = true
    );
/**
 Creacion de la vista EstadoNotificacion
Responsable: Eddy Valero
Fecha: 11022015
*/
CREATE VIEW estado_notificacion AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'EstadoNotificacion'
        and Vigente = true
    );

/**
 Creacion de la vista EstadoNotificacion
Responsable: Gustavo Lizarraga
Fecha: 19022015
*/
create view bandeja_notificacion as
(
	select 
		noti.IdNotificacion,
		tr.Tramite as 'CodigoTramite', 
		smsm.Marca as 'NombreSolicitud', 
		noti.FechaSolicitudNotificacion,
		'Observacion' as 'Observacion',
		noti.IdUsuarioAsignado,
		tr.IdTramite,
		noti.EstadoNotificacion
	from
		Tramite tr,
		Notificacion noti,
		SMSignoMarca smsm

	where 
		tr.IdTramite = noti.IdTramite
		and smsm.IdTramite = tr.IdTramite
		and noti.EstadoNotificacion='SOL'
)
union
(
	select 
		noti.IdNotificacion,
		tr.Tramite as 'CodigoTramite', 
		ddaut.Titulo as 'NombreSolicitud', 
		noti.FechaSolicitudNotificacion,
		'Observacion' as 'Observacion',
		noti.IdUsuarioAsignado,
		tr.IdTramite,
		noti.EstadoNotificacion
	from
		Tramite tr,
		Notificacion noti,
		DADerechosAutor ddaut

	where 
		tr.IdTramite = noti.IdTramite
		and ddaut.IdTramite = tr.IdTramite
		and noti.EstadoNotificacion='SOL'
)
union
(
	select 
		noti.IdNotificacion,
		tr.Tramite as 'CodigoTramite', 
		ppat.Nombre as 'NombreSolicitud', 
		noti.FechaSolicitudNotificacion,
		'Observacion' as 'Observacion',
		noti.IdUsuarioAsignado,
		tr.IdTramite,
		noti.EstadoNotificacion
	from
		Tramite tr,
		Notificacion noti,
		PAPatente ppat

	where 
		tr.IdTramite = noti.IdTramite
		and ppat.IdTramite = tr.IdTramite
		and noti.EstadoNotificacion='SOL'
);


/**
* Creacion de la vista EstadoPublicacion
* Creado: Eddy Valero  Fecha: 25022015
* Creacion de la vista estado_publicacion
*/
CREATE VIEW estado_publicacion AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'EstadoPublicacion'
        and Vigente = true
    );

/**
* Creacion de la vista EstadoPublicacionTramite
* Creado: Eddy Valero  Fecha: 25022015
* Creacion de la vista estado_publicacion_tramite
*/
CREATE VIEW estado_publicacion_tramite AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'EstadoPublicacionTramite'
        and Vigente = true
    );

/**
* Creacion de la vista TipoRecibo
* Creado: chanoRojas  Fecha: 21042015
* Creacion de la vista tipo_recibo
*/
CREATE VIEW tipo_recibo AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoRecibo'
        and Vigente = true
    );

/**
* Creacion de la vista TipoTasa
* Creado: chanoRojas  Fecha: 23042015
* Creacion de la vista tipo_tasa
*/
CREATE VIEW tipo_tasa AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoTasa'
        and Vigente = true
    );



/**
* Creacion de la vista numero_tramites_usuario
* Creado: Eddy Valero  Fecha: 04/05/2015
* Descripcion: Responsable de mostrar el listado de todos los Usuarios
* y el recuento de los tramites que tienen asignados
*/

select 'numero_tramites_usuario';

create view numero_tramites_usuario
as 
	select
		f.IdFlujo,
		fe.EtapaTramite,
		us.Login,
		us.IdRegional,
		contar_tfe_etapa(us.IdUsuario, fe.EtapaTramite),
		ro.IdRol
	from
		Usuario us,
		UsuarioRol uro,
		Rol ro,
		FlujoEtapa fe,
		Flujo f
	where
		us.IdUsuario = uro.IdUsuario
		and uro.IdRol = ro.IdRol
		and ro.Codigo not in ('UEXT')
		and fe.IdRol = ro.IdRol
		and fe.EstadoEtapa = 'ASIG'
		and fe.Padre = 0
		and f.IdFlujo = fe.IdFlujo
        order by f.IdFlujo, fe.IdFlujoEtapa asc
;
/**
* Creacion de la vista TipoPreferenciaPrioridad
* Creado: chanoRojas  Fecha: 12/05/2015
* Creacion de la vista tipo_preferencia_prioridad
*/
CREATE VIEW tipo_preferencia_prioridad AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoPreferenciaPrioridad'
        and Vigente = true
    );

/**
* Creacion de la vista TipoPrioridad
* Creado: chanoRojas  Fecha: 12/05/2015
* Creacion de la vista tipo_preferencia
*/

CREATE VIEW tipo_preferencia AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoPreferencia'
        and Vigente = true
    );
/**
* Creacion de la vista TipoPreferencia
* Creado: chanoRojas  Fecha: 12/05/2015
* Creacion de la vista tipo_prioridad
*/

CREATE VIEW tipo_prioridad AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoPrioridad'
        and Vigente = true
    );

/**
* Creacion de la vista HistorialTramite
* Creado: Susana Escobar Paz  Fecha: 25/05/2015
* Descripcion: Responsable de mostrar el listado de todos los tramiteFlujoEtapa y Notificaciones de los tramites.
* -------------------------------------------------------------------------------
* Modificado: Eddy Valero Fecha: 08/06/2015
* Descripcion: Eliminar la vista HistorialTramite y crear la vista historial_tramite, se agregan los campos
* Nombres y FechaFin para los trámites.
* -------------------------------------------------------------------------------
* Modificado: Eddy Valero Fecha: 10/08/2015
* Descripcion: Eliminar la Tabla Persona en la Consulta, los datos se sacan directamente de Usuario.
*/
select 'historial_tramite';

CREATE VIEW historial_tramite AS
    (
	select
			tfe.IdTramiteFlujoEtapa id,
			tfe.EtapaTramite as Etapa, tfe.FechaAsignacion as FechaAsignacion,
			tfe.IdUsuario as Usuario,
			u.Login as Login,
			concat(u.Nombres,' ', u.PrimerApellido) as Nombres,
			tfe.FechaFin as FechaFin,
			tfe.IdTramite as IdTramite, 
			tfe.EstadoTarea as EstadoTarea,
			cl.Descripcion as DescripcionEtapa,
			cla.Descripcion as DescripcionEstado
	from 	TramiteFlujoEtapa tfe,
			Clasificador cl,
			Clasificador cla,
			Usuario u
		where tfe.EtapaTramite = cl.codigo
		and cl.Dominio = 'EtapaTramite'
		and cla.Dominio = 'EstadoTarea'
		and tfe.EstadoTarea = cla.codigo 
		and u.IdUsuario = tfe.IdUsuario
	)	
	union all
	(
	select noti.IdNotificacion id,
			noti.EstadoNotificacion as Etapa,  noti.FechaSolicitudNotificacion as FechaAsignacion,
			noti.IdUsuarioAsignado as Usuario,
			u.login,
			concat(u.Nombres,' ', u.PrimerApellido) as Nombres,
			noti.FechaNotificacion as FechaFin,
			noti.IdTramite as IdTramite,
			noti.EstadoNotificacion as EstadoTarea, 
			'Notificación' as DescripcionEtapa,
			cla.Descripcion as DescripcionEstado
	from Notificacion noti, Clasificador cl, Clasificador cla, Usuario u
	where noti.EstadoNotificacion = cl.codigo
	and cl.Dominio = 'EstadoNotificacion'
	and cla.Dominio = 'EstadoNotificacion'
	and noti.EstadoNotificacion=cla.codigo 
	and u.IdUsuario = noti.IdUsuarioAsignado
	);

/**
Creacion de la vista estado_proceso_publicacion
Creado: Susana Escobar Paz Fecha: 22/06/2015
Descripcion: EstadoProcesoPublicacion, nuevo estado para publicacion
*/

CREATE VIEW estado_proceso_publicacion AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'EstadoProcesoPublicacion'
        and Vigente = true
    );

/**
Creacion de la vista area_tramite
Creado: Chano Rojas Maldonado Fecha: 22/06/2015
Descripcion: AreaTramite, nuevo estado para expediente
*/


CREATE VIEW area_tramite AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'AreaTramite'
        and Vigente = true
    );




-- 
-- CREATE 
--     ALGORITHM = UNDEFINED 
--     DEFINER = `root`@`192.168.6.68` 
--     SQL SECURITY DEFINER
-- VIEW `apoderado` AS
--     (select 
--         `pet1`.`IdTramite` AS `IdTramite`,
--         `p1`.`IdPersona` AS `IdPersona`,
--         `p1`.`Nombres` AS `Nombres`,
--         `p1`.`ApellidoPaterno` AS `ApellidoPaterno`,
--         `p1`.`ApellidoMaterno` AS `ApellidoMaterno`
--     from
--         (`sistemaintegrado`.`Persona` `p1`
--         join `sistemaintegrado`.`PersonaEmpresaTramite` `pet1`)
--     where
--         ((`p1`.`IdPersona` = `pet1`.`IdPersona`)
--             and (`pet1`.`TipoPersonaSolicitud` = 'APOD')));
-- 
-- 
-- CREATE 
--     ALGORITHM = UNDEFINED 
--     DEFINER = `root`@`192.168.6.68` 
--     SQL SECURITY DEFINER
-- VIEW `busqueda_marcas` AS
-- 
-- 
--     (select 
--         `tr`.`IdTramite` AS `IdTramite`,
--         `pe`.`IdPersona` AS `IdSolicitante`,
--         `pet`.`IdPersonaSolicitud` AS `IdPersonaEmpresaTramite`,
--         `tr`.`Tramite` AS `CodigoSM`,
--         `sm`.`Marca` AS `Marca`,
--         `cmsc`.`NumeroClaseNiza` AS `Clase`,
--         concat(`pe`.`Nombres`,
--                 ' ',
--                 `pe`.`ApellidoPaterno`,
--                 ' ',
--                 `pe`.`ApellidoMaterno`) AS `Solicitante`,
--         `pe`.`NumeroDocumento` AS `NumeroDocumento`,
--         `pe`.`PaisPersona` AS `Pais`,
--         `apo`.`IdPersona` AS `IdApoderado`,
--         concat(`apo`.`Nombres`,
--                 ' ',
--                 `apo`.`ApellidoPaterno`,
--                 ' ',
--                 `apo`.`ApellidoMaterno`) AS `Apoderado`
--     from
--         (((((`Tramite` `tr`
--         join `SMSignoMarca` `sm` ON ((`sm`.`IdTramite` = `tr`.`IdTramite`)))
--         join `SMSignoClaseNiza` `cmsc` ON ((`cmsc`.`IdTramite` = `sm`.`IdTramite`)))
--         join `PersonaEmpresaTramite` `pet` ON ((`pet`.`IdTramite` = `tr`.`IdTramite`)))
--         join `Persona` `pe` ON ((`pe`.`IdPersona` = `pet`.`IdPersona`)))
--         join `apoderado` `apo` ON ((`apo`.`IdTramite` = `tr`.`IdTramite`)))
--     where
--         (`pet`.`TipoPersonaSolicitud` <> 'APOD')) union (select 
--         `tr`.`IdTramite` AS `IdTramite`,
--         `e`.`IdEmpresa` AS `IdEmpresa`,
--         `pet`.`IdPersonaSolicitud` AS `IdPersonaEmpresaTramite`,
--         `tr`.`Tramite` AS `CodigoSM`,
--         `sm`.`Marca` AS `Marca`,
--         `cmsc`.`NumeroClaseNiza` AS `Clase`,
--         `e`.`NombreRepresentante` AS `Solicitante`,
--         `e`.`NumeroDocumento` AS `NumeroDocumento`,
--         `e`.`PaisEmpresa` AS `PaisEmpresa`,
--         `apo`.`IdPersona` AS `IdPersona`,
--         concat(`apo`.`Nombres`,
--                 ' ',
--                 `apo`.`ApellidoPaterno`,
--                 ' ',
--                 `apo`.`ApellidoMaterno`) AS `Apoderado`
--     from
--         (((((`Tramite` `tr`
--         join `SMSignoMarca` `sm` ON ((`sm`.`IdTramite` = `tr`.`IdTramite`)))
--         join `SMSignoClaseNiza` `cmsc` ON ((`cmsc`.`IdTramite` = `sm`.`IdTramite`)))
--         join `PersonaEmpresaTramite` `pet` ON ((`pet`.`IdTramite` = `tr`.`IdTramite`)))
--         join `Empresa` `e` ON ((`e`.`IdEmpresa` = `pet`.`IdEmpresa`)))
--         join `apoderado` `apo` ON ((`apo`.`IdTramite` = `tr`.`IdTramite`)))
--     where
--         (`pet`.`TipoPersonaSolicitud` <> 'APOD'));



/**
Creacion de la vista fecha_sistema
Creado: Eddy Valero Fecha: 18/09/2015
Descripcion: Obtener la fecha y Hora actual del sistema
*/
create view fecha_sistema
as 
select idSistema, idRegional, cast(concat(date(si.Fecha), ' ' , DATE_FORMAT(NOW(), "%H:%i:%S" )) as DateTime) as 'fechaActual'
	from Sistema si;



/**
Creacion de la vista tipoColor para el pantone, hexadecimal y color
Creado: Chano Rojas Maldonado Fecha: 22/06/2015
Descripcion: AreaTramite, nuevo estado para expediente
*/


CREATE VIEW tipo_color AS
    (
	select 
        Codigo,
        Nombre,
        Descripcion,
        Vigente
    from
        Clasificador
    where
        Dominio = 'TipoColor'
        and Vigente = true
    );

/**
Creacion de la vista TipoSolicitudSigno
Creado: Eddy Valero Fecha: 06/10/2015
Descripcion: TipoSolicitudSigno para SMSignoMarca
*/

CREATE VIEW tipo_solicitud_signo AS
    (
	select 
            Codigo,
            Nombre,
            Descripcion
        from
            Clasificador
        where
            Dominio = 'TipoSolicitudSigno'
            and Vigente = true
    );
