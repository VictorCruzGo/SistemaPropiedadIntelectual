insert into menu#Agregar el Id del Usuario de la Base de Datos que sera el Administrador de la Base de Datos para tener el log de las parametricas
set @IdUsuario = 1;


insert into Sistema (IdRegional, Fecha, Estado)
 values(0, date_format(now(),'%Y-%m-%d'), 'AC');

insert into Sistema (IdRegional, Fecha, Estado)
 values(1, date_format(now(),'%Y-%m-%d'), 'AC');


#Clasificador
select 'Clasificador';
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','REGP',NULL,'Registro en el área de Patentes','Registro en el área de Patentes',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','OPO',NULL,'Oposición','Oposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','MODI',NULL,'Modificación','Modificación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','NUL',NULL,'Nulidad','Nulidad',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','IMEF',NULL,'Medidas en Frontera','Medidas en Frontera',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RECR',NULL,'Recurso de Revocatoria','Recurso de Revocatoria',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RENR',NULL,'Renuncia a Registro','Renuncia a Registro',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','REGS',NULL,'Registro en el área de Signos Distintivos','Registro en el área de Signos Distintivos',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','REGD',NULL,'Registro en el área de Derechos de Autor','Registro en el área de Derechos de Autor',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RENO',NULL,'Renovación','Renovación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','CAN',NULL,'Cancelación','Cancelación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','INF',NULL,'Infracción','Infracción',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','ANOP',NULL,'Anotación Preventiva','Anotación Preventiva',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RECJ',NULL,'Recurso Jerárquico','Recurso Jerárquico',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','CANO',NULL,'Cambio de Nombre','Cambio de Nombre',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','CATR',NULL,'Transferencia','Transferencia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 20042015 Agregar parametrica para el tipo de Tramite Transferencia TRAN y Fusión FUS
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','CADO',NULL,'Cambio de Domicilio','Transferencia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','CAFU',NULL,'Fusión','Fusión',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 21042015 Agregar parametrica para el tipo de Tramite Licencia de Uso
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','CALU',NULL,'Licencia de Uso','Licencia de Uso',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 21042015 Agregar parametrica para el tipo de Tramite Recurso Administrativo
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RECA',NULL,'Recursos Administrativos','Recursos Administrativos',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 22042015 Agregar parametrica para el tipo de Tramite Registro de Lema Comercial
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RELC',NULL,'Registro de Lema Comercial','Registro de Lema Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 22042015 Agregar parametrica para el tipo de Tramite Registro de Registro de Depósito de Nombre Comercial, rótulos o enseñas
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTramite','RDNC',NULL,'Registro de Depósito de Nombre Comercial, rótulos  enseñas','Registro de Depósito de Nombre Comercial, rótulos o enseñas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitud','SIGD',NULL,'Signo distintivo','Signo distintivo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitud','NOMC',NULL,'Nombre Comercial o Rotulo Comercial','Nombre Comercial o Rotulo Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitud','LEMC',NULL,'Lema Comercial','Lema Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitud','CNOM',NULL,'Cambio de Nombre','Cambio de Nombre',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitud','CDIR',NULL,'Cambio de Direccion','Cambio de Direccion',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','ART',NULL,'Artísticas','Artísticas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','MUS',NULL,'Musical','Musical',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','ESCE',NULL,'Escénica','Escénica',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','LIT',NULL,'Literaria','Literaria',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','LITT',NULL,'Literaria Tesis','Literaria Tesis',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','COMP',NULL,'Programa de Computación','Programa de Computación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','FONO',NULL,'Fonograma','Fonograma',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoObra','AUDV',NULL,'Audiovisual','Audiovisual',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoInvencion','PAT',NULL,'Patente de Invención','Patente de Invención',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoInvencion','MODU',NULL,'Modelo de Utilidad','Modelo de Utilidad',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoInvencion','ESCE',NULL,'Esquema de Trazado de Circuitos Integrados','Esquema de Trazado de Circuitos Integrados',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoInvencion','DISI',NULL,'Diseño Industrial','Diseño Industrial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','LPZ',NULL,'La Paz','La Paz',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','ORU',NULL,'Oruro','Oruro',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','CBA',NULL,'Cochabamba','Cochabamba',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','SCZ',NULL,'Santa Cruz','Santa Cruz',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','PTS',NULL,'Potosi','Potosi',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','PND',NULL,'Pando','Pando',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','CQH',NULL,'Chuquisaca','Chuquisaca',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','TJA',NULL,'Tarija','Tarija',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudad','BEN','','Beni','Beni',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','VEN',NULL,'Ventanilla','Ventanilla',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','DIG',NULL,'Digitalización','Digitalización',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','RECA',NULL,'Recaudación','Recaudación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXFM',NULL,'Examen de Forma','Examen de Forma',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','PUBL',NULL,'Publicación','Publicación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXFF',NULL,'Examen de Fondo','Examen de Fondo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','OPO',NULL,'Oposición','Oposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','REG',NULL,'Registro','Registro',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','REC',NULL,'Recurso','Recurso',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','ENT',NULL,'Entrega','Entrega',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','NOT',NULL,'Notificación','Notificación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','REV1',NULL,'Revisión Responsable Examen de Forma','Revisión Responsable Examen de Forma',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','REV2',NULL,'Revisión Director de Propiedad Industrial','Revisión Director de Propiedad Industrial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','IMTI',NULL,'Impresión de Títulos','Impresión de Títulos',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitante','JURI',NULL,'Jurídica','Jurídica',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitante','NATU',NULL,'Natural','Natural',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','CIDE','NATU','Carnet de Identidad','Carnet de Identidad',1,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','DNNN','NATU','D.N.I.','D.N.I.',5,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','PASA','NATU','Pasaporte','Pasaporte',3,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','LMIL','NATU','Libreta Militar','Libreta Militar',4,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','OTNN','NATU','Otro','Otro',6,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','NITN','NATU','NIT - Número de Identificación Tributaria','Numero de Identificación Tributaria',2,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','NITJ','JURI','NIT - Numero de Identificación Tributaria ','Numero de Identificación Tributaria',1,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumento','OTNJ','JURI','Otro','Otro',2,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','MP',NULL,'Marca de Producto','Marca de Producto',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','MS',NULL,'Marca de Servicio','Marca de Servicio',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','CER',NULL,'Marca de Certificación','Marca de Certificación',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','MC',NULL,'Marca Colectiva','Marca Colectiva',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','DOR',NULL,'Denominación de Origen','Denominación de Origen',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 24022015 Aumentar registros en TipoGenero para lema comercial enseña y rotulo comercial
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','LC',NULL,'Lema Comercial','Lema Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','NOMC',NULL,'Nombre Comercial','Nombre Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','ROTC',NULL,'Rótulo Comercial o Enseñas','Rótulo Comercial o Enseñas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 091115 Aumentar registros en TipoGenero para rotulo comercial y Enseña Comercial
-- INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','EC',NULL,'Enseña Comercial','Enseña Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
-- INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','RC',NULL,'Rótulo Comercial','Rótulo Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','DESC',NULL,'Desconocido','Desconocido',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
# INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGenero','REGS',NULL,'REGS','REGS',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoContacto','CELN',NULL,'Celular','Celular',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoContacto','TELE',NULL,'Teléfono','Teléfono',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoContacto','DIRN',NULL,'Dirección','Dirección',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoContacto','MAIN',NULL,'Correo Electrónico','Correo Electrónico',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
#evalero 24022015 agregar la parametrica de fax para TipoContacto
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoContacto','FAXI',NULL,'Fax','Fax',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridad','EXTR',NULL,'Extranjera','Extranjera',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridad','EXPO',NULL,'Exposición','Exposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridad','OPOA',NULL,'Oposición Andina','Oposición Andina',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridad','MICR',NULL,'Pro Bolivia - Micro','Pro Bolivia - Micro',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridad','PEQE',NULL,'Pro Bolivia - Pequeña','Pro Bolivia - Pequeña',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridad','ARTE',NULL,'Pro Bolivia - Artesanal','Pro Bolivia - Artesanal',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGeneroPersona','MAS',NULL,'Masculino','Masculino',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoGeneroPersona','FEM',NULL,'Femenino','Femenino',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPersonaSolicitud','SOLI',NULL,'Solicitante','Solicitante',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPersonaSolicitud','APOD',NULL,'Apoderado','Apoderado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPersonaSolicitud','LICE',NULL,'Licenciatario','Licenciatario',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPersonaSolicitud','NTIT',NULL,'Nuevo Titular','Nuevo Titular',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PENS','EXTR','Prioridad Extranjera - Número de Solicitud','Prioridad Extranjera - Número de Solicitud',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PEFS','EXTR','Prioridad Extranjera - Fecha de Solicitud','Prioridad Extranjera - Fecha de Solicitud',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PELE','EXTR','Prioridad Extranjera - Lugar de Emisión','Prioridad Extranjera - Lugar de Emisión',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PPNE','EXPO','Prioridad de Exposición - Nombre de la Exposición','Prioridad de Exposición - Nombre de la Exposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PPFE','EXPO','Prioridad de Exposición - Fecha de  Exposición','Prioridad de Exposición - Fecha de Exposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PPLC','EXPO','Prioridad de Exposición - Lugar de Celebración','Prioridad de Exposición - Lugar de Celebración',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PAOA','OPOA','Interés Real para la  Oposición Andina- Número de Expediente','Interes Real para la  Opsición Andina- Número de Expediente',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PMNR','MICR','Pro Bolivia Micro - Número de Registro Pro Bolivia','Pro Bolivia Micro - Número de Registro Pro Bolivia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PPNR','PEQE','Pro Bolivia Pequeña - Número de Registro Pro Bolivia','Pro Bolivia Pequeña - Número de Registro Pro Bolivia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoProteccionPrioridadDatos','PANR','ARTE','Pro Bolivia Artesano - Número de Registro Pro Bolivia','Pro Bolivia Artesano - Lugar de Celebración Pro Bolivia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitudDeposito','NOMC',NULL,'Nombre Comercial','Nombre Comercial',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitudDeposito','ROTC',NULL,'Rótulo Comercial o Enseñas','Rótulo Comercial o Enseñas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','DES',NULL,'Denominativo','Denominativo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','DESG',NULL,'Denominativo con grafía','Denominativo con grafía',NULL,0,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','FIG',NULL,'Figurativo','Figurativo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','TRI',NULL,'Tridimensional','Tridimensional',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','AUD',NULL,'Auditivo','Auditivo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','OTRO',NULL,'Otro','Otro',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSigno','DENO',NULL,'Denominación de Origen','Denominación de Origen',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','USU',NULL,'Usuario','Usuario',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','SOL',NULL,'Solicitado','Solictado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','APRE',NULL,'En Análisis Preliminar','En Análisis Preliminar',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','OBS',NULL,'Observado','Observado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','CON',NULL,'Concedido','Concedido',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','DEN',NULL,'Denegado','Denegado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','DESI',NULL,'Desistido','Desistido',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','ABAN',NULL,'Abandonado','Abandonado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','ARCH',NULL,'Archivado','Archivado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','INI',NULL,'Iniciado','Iniciado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','OBUS',NULL,'Observado Usuario','Observado Usuario',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','ACTU',NULL,'Actualizado Usuario','Actualizado Usuario',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','ACTT',NULL,'Actualizado Tecnico','Actualizado Tecnico',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','PROC',NULL,'Proceso','Proceso',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','CONC',NULL,'Concluido','Concluido',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','REV',NULL,'Revisado','Revisado',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','FER',NULL,'Fe de Erratas','Fe de Erratas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','OMI',NULL,'Omitidas','Omitidas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','SUBS',NULL,'Subsanadas','Subsanadas',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','OPO',NULL,'Oposición','Oposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','RET',NULL,'Retirada','Retirada',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','REG',NULL,'Registrada','Registrada',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','CAN',NULL,'Cancelada','Cancelada',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProceso','REVO',NULL,'Revocatoria','Revocatoria',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudadNotificacion','LPZ',NULL,'La Paz','La Paz',0,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudadNotificacion','SCZ','','Santa Cruz','Santa Cruz',0,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudadNotificacion','CBA','','Cochabamba','Cochabamba',0,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudadNotificacion','ALT','','El Alto','El Alto',0,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudadNotificacion','TJA','','Tarija','Tarija',0,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoCiudadNotificacion','CQH','','Chuquisaca','Chuquisaca',0,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'AreaTramite','MA',NULL,'Area de Signos Distintivos','Area de Signos Distintivos',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'AreaTramite','PA',NULL,'Area de Patentes','Area de Patentes',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'AreaTramite','DA',NULL,'Area de Derechos de Autor','Area de Derechos de Autor',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoBanco','BMSC',NULL,'Banco Mercantil Santa Cruz','Banco Mercantil Santa Cruz',NULL,false,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoBanco','BUNI',NULL,'Banco Union S.A.','Banco Union S.A.',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRecibo','RECI',NULL,'Recibo','Recibo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRecibo','TITU',NULL,'Titulo','Titulo',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTasa','NACI',NULL,'Nacional','Nacional',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoTasa','INTE',NULL,'Internacional','Internacional',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPreferenciaPrioridad','PRIO',NULL,'Prioridad','Prioridad',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPreferenciaPrioridad','PREF',NULL,'Preferencia','Preferencia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPreferenciaPrioridad','ACAN',NULL,'Acreditación Andina','Acreditación Andina',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPreferencia','PEQE',NULL,'Pro Bolivia - Micro','Pro Bolivia - Micro',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPreferencia','ARTE',NULL,'Pro Bolivia - Pequeño','Pro Bolivia - Pequeño',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPreferencia','PANR',NULL,'Pro Bolivia - Artesano','Pro Bolivia - Artesano',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPrioridad','EXTR',NULL,'Extranjera','Extranjera',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPrioridad','EXPO',NULL,'Exposición','Exposición',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);

select 'Clasificador 2doBloque';
#Parametricas Jonas  01092014
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRequisito','MIN',NULL,'Minimo','Minimo',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRequisito','ADC',NULL,'Adicional','Adicional',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRequisito','OPC',NULL,'Opcional','Opcional',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRequisito','ANE',NULL,'Anexos','Anexos',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','TXT',NULL,'Texto, Observación','Texto, Observación',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','CHK',NULL,'Check','Check',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','RBBT',NULL,'Radio botón','Radio botón',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','LIST',NULL,'Lista','Lista',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','DET',NULL,'Detalle','Detalle',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','CTXT',NULL,'Requisito con check y caja de texto','Requisito con check y caja de texto',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRespuestaRequisito','TABL',NULL,'Tabla','Tabla',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoExamen','VEN',NULL,'Ventanilla','Ventanilla',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoExamen','PRE',NULL,'Análisis Preliminar','Análisis Preliminar',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoExamen','FOR',NULL,'Examen de Forma','Examen de Forma',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoExamen','FON',NULL,'Examen de Fondo','Examen de Fondo',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoDocumento','REA',NULL,'Realizado','Realizado',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoDocumento','PAPR',NULL,'Por Aprobar','Por Aprobar',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoDocumento','APRO',NULL,'Aprobado','Aprobado',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRegistro','ESPE',NULL,'En Espera','En Espera',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRegistro','RECI',NULL,'Recibido','Recibido',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRegistro','INI',NULL,'Iniciado','Iniciado',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRegistro','OBS',NULL,'Observado','Observado',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRegistro','TERM',NULL,'Terminado','Terminado',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRegistro','ACTI',NULL,'Activo','Activo',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoAsignacion','AUT',NULL,'Automatica','Asignación Automática',NULL,1, now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoAsignacion','MAN',NULL,'Manual','Asignación Manual',NULL,1,now(),now(), NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','ASIG',NULL,'Asignada','Asignada',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','RASI',NULL,'Re Asignada','Re asignada',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','RECI',NULL,'Recibida','Recibida',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','INI',NULL,'Iniciada','Iniciada',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','ERES',NULL,'Esperando Respuesta','Esperando Respuesta',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','CONC',NULL,'Concluida','Concluida',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
#Estado  Observado Prepublicacion agregado por Susana Escobar 19052015
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoTarea','OPRE',NULL,'Observado Prepublicacion','Observado Prepublicacion',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','ASIG',NULL,'Asignado','Asignado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','SOL',NULL,'Solicitado','Solicitado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','INI',NULL,'Iniciado','Iniciado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','APRE',NULL,'En Analisis Preliminar','En Analisis Preliminar',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','OBS',NULL,'Observado','Observado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','CONC',NULL,'Concedido','Concedido',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','DEN',NULL,'Denegado','Denegado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','DESI',NULL,'Desistido','Desistido',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','ABAN',NULL,'Abandonado','Abandonado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','ARCH',NULL,'Archivado','Archivado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoEtapa','REV',NULL,'Revisado','Revisado',NULL,1,now(),now(),NULL, @IdUsuario, FechaUltimaModificacion);

#Parametricas evalero 19112014
#Parametricas TipoPais, referentes a la nacionalidad del Solicitante
select 'Clasificador TipoPais';
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AF',NULL, 'Afganistan', 'Afganistan', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AL',NULL, 'Albania', 'Albania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'DE',NULL, 'Alemania', 'Alemania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'HV',NULL, 'Alto Volta', 'Alto Volta', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AD',NULL, 'Andorra', 'Andorra', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AO',NULL, 'Angola', 'Angola', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AI',NULL, 'Anguilla', 'Anguilla', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AG',NULL, 'Antigua y Barbuda', 'Antigua y Barbuda', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AN',NULL, 'Antillas Holandezas o Neerlandesas', 'Antillas Holandezas o Neerlandesas', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SA',NULL, 'Arabia Saudita', 'Arabia Saudita', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'DZ',NULL, 'Argelia', 'Argelia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AR',NULL, 'Argentina', 'Argentina', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AM',NULL, 'Armenia', 'Armenia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AW',NULL, 'Aruba', 'Aruba', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AU',NULL, 'Australia', 'Australia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AT',NULL, 'Austria', 'Austria', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AZ',NULL, 'Azerbaiyán', 'Azerbaiyán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BS',NULL, 'Bahamas', 'Bahamas', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BH',NULL, 'Bahrein', 'Bahrein', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BD',NULL, 'Bangladesh', 'Bangladesh', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BB',NULL, 'Barbados', 'Barbados', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BE',NULL, 'Belgica', 'Belgica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BZ',NULL, 'Belice', 'Belice', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BL',NULL, 'Benelux', 'Benelux', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BJ',NULL, 'Benin', 'Benin', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BM',NULL, 'Bermuda', 'Bermuda', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BT',NULL, 'Bhután', 'Bhután', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BY',NULL, 'Bielorrusia, Belarús', 'Bielorrusia, Belarús', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BU',NULL, 'Birmania', 'Birmania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BO',NULL, 'Bolivia', 'Bolivia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BA',NULL, 'Bosnia y Herzegovina', 'Bosnia y Herzegovina', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BW',NULL, 'Botswana', 'Botswana', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BR',NULL, 'Brasil', 'Brasil', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BN',NULL, 'Brunei Darussalam', 'Brunei Darussalam', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BG',NULL, 'Bulgaria', 'Bulgaria', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BF',NULL, 'Burkina Faso', 'Burkina Faso', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BI',NULL, 'Burundi', 'Burundi', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CV',NULL, 'Cabo Verde', 'Cabo Verde', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KH',NULL, 'Camboya', 'Camboya', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CM',NULL, 'Camerún', 'Camerún', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CA',NULL, 'Canadá', 'Canadá', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TD',NULL, 'Chad', 'Chad', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CL',NULL, 'Chile', 'Chile', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CN',NULL, 'China', 'China', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CY',NULL, 'Chipre', 'Chipre', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CO',NULL, 'Colombia', 'Colombia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KM',NULL, 'Comoras', 'Comoras', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CG',NULL, 'Congo', 'Congo', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CI',NULL, 'Costa de Marfil, Côte D''ivoire', 'Costa de Marfil, Côte D''ivoire', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CR',NULL, 'Costa Rica', 'Costa Rica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'HR',NULL, 'Croacia', 'Croacia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CU',NULL, 'Cuba', 'Cuba', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'DK',NULL, 'Dinamarca', 'Dinamarca', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'DJ',NULL, 'Djibounti', 'Djibounti', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'DM',NULL, 'Dominica', 'Dominica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EC',NULL, 'Ecuador', 'Ecuador', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EG',NULL, 'Egipto', 'Egipto', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SV',NULL, 'El Salvador', 'El Salvador', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AE',NULL, 'Emiratos Arabes Unidos', 'Emiratos Arabes Unidos', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ER',NULL, 'Eritrea', 'Eritrea', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EI',NULL, 'Escocia', 'Escocia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SK',NULL, 'Eslovaquia', 'Eslovaquia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SI',NULL, 'Eslovenia', 'Eslovenia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ES',NULL, 'España', 'España', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'US',NULL, 'Estados Unidos de América', 'Estados Unidos de América', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EE',NULL, 'Estonia', 'Estonia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ET',NULL, 'Etiopia', 'Etiopia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MK',NULL, 'Ex República Yugoslava de Macedonia', 'Ex República Yugoslava de Macedonia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'RU',NULL, 'Federación de Rusia', 'Federación de Rusia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'FJ',NULL, 'Fiji', 'Fiji', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PH',NULL, 'Filipinas', 'Filipinas', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'FI',NULL, 'Finlandia', 'Finlandia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'FR',NULL, 'Francia', 'Francia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GA',NULL, 'Gabón', 'Gabón', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GM',NULL, 'Gambia', 'Gambia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GE',NULL, 'Georgia', 'Georgia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GH',NULL, 'Ghana', 'Ghana', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GI',NULL, 'Gibraltar', 'Gibraltar', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GD',NULL, 'Granada', 'Granada', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GR',NULL, 'Grecia', 'Grecia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GL',NULL, 'Groenlandia', 'Groenlandia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GT',NULL, 'Guatemala', 'Guatemala', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GN',NULL, 'Guinea', 'Guinea', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GQ',NULL, 'Guinea Ecuatorial', 'Guinea Ecuatorial', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GW',NULL, 'Guinea-Bissau', 'Guinea-Bissau', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GY',NULL, 'Guyana', 'Guyana', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'HT',NULL, 'Haití', 'Haití', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NL',NULL, 'Holanda, Netherlands, Países Bajos', 'Holanda, Netherlands, Países Bajos', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'HN',NULL, 'Honduras', 'Honduras', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'HK',NULL, 'Hong-Kong, ', 'Hong-Kong, ', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'HU',NULL, 'Hungría', 'Hungría', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IN',NULL, 'India', 'India', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ID',NULL, 'Indonesia', 'Indonesia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IR',NULL, 'Iran, Republica Islamica', 'Iran, Republica Islamica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IQ',NULL, 'Iraq', 'Iraq', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IE',NULL, 'Irlanda', 'Irlanda', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BV',NULL, 'Isla Bouvet', 'Isla Bouvet', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IS',NULL, 'Islandia', 'Islandia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IA',NULL, 'Islas Antillas', 'Islas Antillas', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KY',NULL, 'Islas Caiman', 'Islas Caiman', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CK',NULL, 'Islas Cook', 'Islas Cook', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'FK',NULL, 'Islas Falkland (Malvinas)', 'Islas Falkland (Malvinas)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'FO',NULL, 'Islas Feroe', 'Islas Feroe', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GS',NULL, 'Islas Georgia del Sur e Islas Sandwich del Sur', 'Islas Georgia del Sur e Islas Sandwich del Sur', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MP',NULL, 'Islas Marianas Septentrionales', 'Islas Marianas Septentrionales', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SB',NULL, 'Islas Salomón', 'Islas Salomón', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TC',NULL, 'Islas Turcos y Caicos', 'Islas Turcos y Caicos', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'VG',NULL, 'Islas Vírgenes (Británicas)', 'Islas Vírgenes (Británicas)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IL',NULL, 'Israel', 'Israel', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IT',NULL, 'Italia', 'Italia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LY',NULL, 'Jamahiriya Arabe Libia', 'Jamahiriya Arabe Libia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'JM',NULL, 'Jamaica', 'Jamaica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'JP',NULL, 'Japon', 'Japon', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'JO',NULL, 'Jordania', 'Jordania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KZ',NULL, 'Kazajstán', 'Kazajstán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KE',NULL, 'Kenya', 'Kenya', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KG',NULL, 'Kirguistán', 'Kirguistán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KI',NULL, 'Kiribati', 'Kiribati', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KW',NULL, 'Kuwait', 'Kuwait', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LS',NULL, 'Lesotho', 'Lesotho', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LV',NULL, 'Letonia', 'Letonia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LB',NULL, 'Líbano', 'Líbano', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LR',NULL, 'Liberia', 'Liberia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LI',NULL, 'Liechtenstein', 'Liechtenstein', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LT',NULL, 'Lituania', 'Lituania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LU',NULL, 'Luxemburgo', 'Luxemburgo', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MO',NULL, 'Macao', 'Macao', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MG',NULL, 'Magadascar', 'Magadascar', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MY',NULL, 'Malasia', 'Malasia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MW',NULL, 'Malawi', 'Malawi', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MV',NULL, 'Maldivas', 'Maldivas', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ML',NULL, 'Malí', 'Malí', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MT',NULL, 'Malta', 'Malta', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MA',NULL, 'Marruecos', 'Marruecos', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MU',NULL, 'Mauricio', 'Mauricio', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MR',NULL, 'Mauritania', 'Mauritania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MX',NULL, 'México', 'México', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MC',NULL, 'Mónaco', 'Mónaco', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MN',NULL, 'Mongolia', 'Mongolia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MS',NULL, 'Montserrat', 'Montserrat', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MZ',NULL, 'Mozambique', 'Mozambique', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MM',NULL, 'Myanmar', 'Myanmar', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NA',NULL, 'Namibia', 'Namibia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NR',NULL, 'Nauru', 'Nauru', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NP',NULL, 'Nepal', 'Nepal', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NI',NULL, 'Nicaragua', 'Nicaragua', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NE',NULL, 'Níger', 'Níger', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NG',NULL, 'Nigeria', 'Nigeria', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NO',NULL, 'Noruega', 'Noruega', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'NZ',NULL, 'Nueva Zelandia', 'Nueva Zelandia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'BX',NULL, 'Oficina Benelux de Marcas (BBM) y Oficina Benelux de Dibujos y Modelos (BBDM)', 'Oficina Benelux de Marcas (BBM) y Oficina Benelux de Dibujos y Modelos (BBDM)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GC',NULL, 'Oficina de Patentes del Consejo de Cooperación de los Estados Arabes del Golfo (CCG)', 'Oficina de Patentes del Consejo de Cooperación de los Estados Arabes del Golfo (CCG)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EM',NULL, 'Oficina Europea de la Marca Comunitaria, Oficina para la Armonización del Mercado Interior (Marcas, Dibujos y Modelos)  OHIM', 'Oficina Europea de la Marca Comunitaria, Oficina para la Armonización del Mercado Interior (Marcas, Dibujos y Modelos)  OHIM', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EP',NULL, 'Oficina Europea de Patentes (OEP)', 'Oficina Europea de Patentes (OEP)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'WO',NULL, 'Oficina Internacional de la Organización Mundial de Propiedad Intelectual (OMPI)', 'Oficina Internacional de la Organización Mundial de Propiedad Intelectual (OMPI)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'OM',NULL, 'Oman', 'Oman', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'OA',NULL, 'Organización Africana de la Propiedad Intelectual (OAPI)', 'Organización Africana de la Propiedad Intelectual (OAPI)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EA',NULL, 'Organización Eurasiática de Patentes', 'Organización Eurasiática de Patentes', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'AP',NULL, 'Organización Regional Africana de la Propiedad Industrial (ARIPO)', 'Organización Regional Africana de la Propiedad Industrial (ARIPO)', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PK',NULL, 'Pakistán', 'Pakistán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PW',NULL, 'Palau', 'Palau', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PA',NULL, 'Panamá', 'Panamá', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PG',NULL, 'Papua Nueva Guinea', 'Papua Nueva Guinea', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PY',NULL, 'Paraguay', 'Paraguay', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PE',NULL, 'Peru', 'Peru', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PL',NULL, 'Polonia', 'Polonia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PT',NULL, 'Portugal', 'Portugal', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PR',NULL, 'Puerto Rico', 'Puerto Rico', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'QA',NULL, 'Qatar', 'Qatar', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GB',NULL, 'Reino Unido, Gran Bretaña, Inglaterra', 'Reino Unido, Gran Bretaña, Inglaterra', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CF',NULL, 'República Centroafricana', 'República Centroafricana', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CZ',NULL, 'República Checa, Checoslovaquia', 'República Checa, Checoslovaquia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KR',NULL, 'República de Corea', 'República de Corea', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MD',NULL, 'República de Moldova', 'República de Moldova', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CD',NULL, 'República Democrática del Congo', 'República Democrática del Congo', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LA',NULL, 'República Democrática Popular Lao', 'República Democrática Popular Lao', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'DO',NULL, 'República Dominicana', 'República Dominicana', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KP',NULL, 'República Popular Democrática de Corea', 'República Popular Democrática de Corea', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'RK',NULL, 'Republica Slovaka', 'Republica Slovaka', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TZ',NULL, 'República Unida de Tanzania', 'República Unida de Tanzania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'RH',NULL, 'Rhodesia del Sur', 'Rhodesia del Sur', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'RO',NULL, 'Rumania', 'Rumania', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'RW',NULL, 'Rwanda', 'Rwanda', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EH',NULL, 'Sahara Occidental', 'Sahara Occidental', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'KN',NULL, 'Saint Kitts y Nevis', 'Saint Kitts y Nevis', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'WS',NULL, 'Samoa', 'Samoa', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SM',NULL, 'San Marino', 'San Marino', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'VC',NULL, 'San Vicente y la Granadinas', 'San Vicente y la Granadinas', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SH',NULL, 'Santa Helena', 'Santa Helena', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LC',NULL, 'Santa Lucía', 'Santa Lucía', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'VA',NULL, 'Santa Sede, Vaticano', 'Santa Sede, Vaticano', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ST',NULL, 'Santo Tomé y Príncipe', 'Santo Tomé y Príncipe', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SN',NULL, 'Senegal', 'Senegal', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'YU',NULL, 'Serbia y Montenegro, Yugoeslavia, Yugoslavia', 'Serbia y Montenegro, Yugoeslavia, Yugoslavia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SC',NULL, 'Seychelles', 'Seychelles', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SL',NULL, 'Sierra Leona', 'Sierra Leona', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SG',NULL, 'Singapur', 'Singapur', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SY',NULL, 'Siria, República Arabe Siria', 'Siria, República Arabe Siria', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SO',NULL, 'Somalia', 'Somalia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'WS',NULL, 'Somoa', 'Somoa', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'LK',NULL, 'Sri Lanka', 'Sri Lanka', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ZA',NULL, 'Sudáfrica', 'Sudáfrica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SD',NULL, 'Sudán', 'Sudán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SE',NULL, 'Suecia', 'Suecia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'CH',NULL, 'Suiza', 'Suiza', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SR',NULL, 'Suriname', 'Suriname', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SZ',NULL, 'Swazilandia', 'Swazilandia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TH',NULL, 'Tailandia', 'Tailandia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TW',NULL, 'Taiwán, Provincia de China', 'Taiwán, Provincia de China', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TJ',NULL, 'Tayikistán', 'Tayikistán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TL',NULL, 'Timor-Leste', 'Timor-Leste', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TG',NULL, 'Togo', 'Togo', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TO',NULL, 'Tonga', 'Tonga', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TT',NULL, 'Trinidad y Tobago', 'Trinidad y Tobago', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TN',NULL, 'Túnez', 'Túnez', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TM',NULL, 'Turkmenistán', 'Turkmenistán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TR',NULL, 'Turquia', 'Turquia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'TV',NULL, 'Tuvalu', 'Tuvalu', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'SU',NULL, 'U.R.S.S.', 'U.R.S.S.', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'UA',NULL, 'Ucrania RSS', 'Ucrania RSS', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'UG',NULL, 'Uganda', 'Uganda', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'EU',NULL, 'Unión Europea', 'Unión Europea', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'UY',NULL, 'Uruguay', 'Uruguay', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'UZ',NULL, 'Uzbekistán', 'Uzbekistán', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'VU',NULL, 'Vanuato', 'Vanuato', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'VE',NULL, 'Venezuela', 'Venezuela', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'VM',NULL, 'Viet Nam', 'Viet Nam', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'YE',NULL, 'Yemen', 'Yemen', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'YD',NULL, 'Yemen Democratico', 'Yemen Democratico', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ZR',NULL, 'Zaire', 'Zaire', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ZM',NULL, 'Zambia', 'Zambia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'ZW',NULL, 'Zimbabwe', 'Zimbabwe', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'GG',NULL, 'Guernsey', 'Guernsey', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'MH',NULL, 'República de las Islas Marshall', 'República de las Islas Marshall', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'PS',NULL, 'Estado de Palestina', 'Estado de Palestina', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'IC',NULL, 'Islas del Canal', 'Islas del Canal', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'JE',NULL, 'Jersey', 'Jersey', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoPais', 'S/P',NULL, 'Sin País', 'Sin País', NULL, 1, now(), now(), NULL, @IdUsuario, now());

#Parametricas evalero 05092014
#Hijos del Formulario de Examen De forma

INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','PB01','R010','Sección 1 (Pro Bolivia)','Sección 1 (Pro Bolivia)',1,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','IS01','R010','Sección 2 (Identificación Solicitante)','Sección 2 (Identificación Solicitante)',2,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','IR01','R010','Sección 3 (Identificación Representante Legal)','Sección 3 (Identificación Representante Legal)',3,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','DS01','R010','Sección 4 (Datos del Signo)','Sección 4 (Datos del Signo)',4,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','PE01','R010','Sección 5 (Prioridad Extranjera)','Sección 5 (Prioridad Extranjera)',5,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','PX01','R010','Sección 6 (Prioridad de Exposiciones)','Sección 6 (Prioridad de Exposiciones)',6,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','IRO1','R010','Sección 7 (Interes Real para la Oposición Andina)','Sección 7 (Interes real para la oposición Andina)',7,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','DN01','R010','Sección 8 (Domicilio para Efectos de Notificación)','Sección 8 (Domicilio para efectos de Notificación)',8,1,now(),now(),NULL, @IdUsuario, now());

#Parametricas jvaldivia 04122014
#Dominio TipoRevision para los estados de No_Revisado, Aprobado, Reprobado

INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRevision','APRO',NULL,'Aprobado','Aprobado',1,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRevision','NREV',NULL,'No Revisado','No Revisado',1,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoRevision','REPR',NULL,'Reprobado','Reprobado',1,1,now(),now(),NULL, @IdUsuario, now());

#valores para el clasificador 08092014
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'NOS1','SRS1', 'Nota', 'Nota', 1, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'MES1','SRS1', 'Memorial', 'Memorial', 2, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'PAN1','PCS1', 'Nacional', 'Nacional', 1, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'PAE1','PCS1', 'Extranjera', 'Extranjera', 2, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'PNO1','PNR1', 'Original', 'Original', 1, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'PFL1','PNR1', 'Fotocopia Legalizada', 'Fotocopia Legalizada', 2, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'PFS1','PNR1', 'Fotocopia Simple', 'Fotocopia Simple', 3, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'EUO1','EUR1', 'Original', 'Original', 1, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'EFL1','EUR1', 'Fotocopia Legalizada', 'Fotocopia Legalizada', 2, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'EFS1','EUR1', 'Fotocopia Simple', 'Fotocopia Simple', 3, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'PFC1','PNA1', 'Fotocopia CI', 'Fotocopia CI', 1, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoFormularioVentanillaEForma', 'POT1','PNA1', 'Otro', 'Otro', 2, 1, now(), now(), null, @IdUsuario, now());


#valores de padres para tipoDosificacion 08092014
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoDosificacion', 'RENA', NULL, 'Recibo Nacional', 'Recibo Nacional', null, 1, now(), now(),null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoDosificacion', 'REIN', NULL, 'Recibo Internacional', 'Recibo Internacional', null, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion)
VALUES (null, 'TipoDosificacion', 'TINA', NULL, 'Título Nacional', 'Título Nacional', null, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoDosificacion', 'TIIN', NULL, 'Título Internacional', 'Título Internacional', null, 1, now(), now(), null, @IdUsuario, now());

#valores de padres para estadoDeposito 08092014
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'EstadoDeposito', 'DVEN', NULL, 'Deposito Vencido', 'Deposito Vencido', null, 1, now(), now(),null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'EstadoDeposito', 'DVIG', NULL, 'Deposito Vigente', 'Deposito Vigente', null, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'EstadoDeposito', 'DDEV', NULL, 'Deposito Devolucion', 'Deposito Devolucion', null, 1, now(), now(), null, @IdUsuario, now());


/** Insercion de registros al Clasificador correspondiente a TipoElementoHTML
Fecha: Martes 07 Octubre del 2014
*/
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoElementoHTML', 'TEH1',null, 'InputText', 'InputText', 1, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoElementoHTML', 'TEH2',null, 'OutputText', 'OutputText', 2, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoElementoHTML', 'TEH3',null, 'Checkbox', 'Checkbox', 3, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoElementoHTML', 'TEH4',null, 'SelectOneMenu', 'SelectOneMenu', 4, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoElementoHTML', 'TEH5',null, 'RadioButton', 'RadioButton', 5, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoElementoHTML', 'TEH6',null, 'TextArea', 'TextArea', 6, 1, now(), now(), null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES  (null, 'TipoElementoHTML', 'TEH7',null, 'Checkbox/InputText', 'Checkbox/InputText', 7, 1, now(), now(), null, @IdUsuario, now());

#valores para tipoModificacion 05112014
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoModificacion', 'CANO', NULL, 'Cambio de Nombre', 'Cambio de Nombre', null, 1, now(), now(), null, @IdUsuario,now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoModificacion', 'CADO', NULL, 'Cambio de Domicilio', 'Cambio de Domicilio', null, 1, now(), now(), null, @IdUsuario,now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoModificacion', 'CATR', NULL, 'Transferencia', 'Transferencia', null, 1, now(), now(), null, @IdUsuario,now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoModificacion', 'CAFU', NULL, 'Fusión', 'Fusión', null, 1, now(), now(), null, @IdUsuario,now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
VALUES (null, 'TipoModificacion', 'CALU', NULL, 'Licencia de Uso', 'Licencia de Uso', null, 1, now(), now(), null, @IdUsuario,now());

 #valores para tipoRepresentante 27112014 Autor Chano Rojas
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) 
VALUES (null, 'TipoRepresentante', 'REPL', NULL, 'Representante Legal', 'Representante Legal', null, 1, now(), now(),null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) 
VALUES (null, 'TipoRepresentante', 'APOR', NULL, 'Apoderado', 'Apoderado', null, 1, now(), now(),null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) 
VALUES (null, 'TipoRepresentante', 'TUTO', NULL, 'Tutor', 'Tutor', null, 1, now(), now(),null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) 
VALUES (null, 'TipoRepresentante', 'PADR', NULL, 'Padre', 'Padre', null, 1, now(), now(),null, @IdUsuario, now());
INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) 
VALUES (null, 'TipoRepresentante', 'MADR', NULL, 'Madre', 'Madre', null, 1, now(), now(), null, @IdUsuario, now());

select 'TipoArchivo';
#TipoArchivo 16122014 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'pdf',NULL, 'pdf', 'pdf', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'png',NULL, 'png', 'png', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'doc',NULL, 'doc', 'doc', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'gif',NULL, 'gif', 'gif', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'docx',NULL, 'docx', 'docx', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'xlsx',NULL, 'xlsx', 'xlsx', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'txt',NULL, 'txt', 'txt', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'jpg',NULL, 'jpg', 'jpg', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoArchivo', 'jpeg',NULL, 'jpeg', 'jpeg', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'EstadoRecibo';
#EstadoRecibo 19022015 Autor Chano Rojas
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'GEN',NULL, 'Generado', 'Generado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'IMPR',NULL, 'Impreso', 'Impreso', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'RANU',NULL, 'Anulado', 'Anulado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'REMI',NULL, 'Emitido', 'Emitido', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'RREA',NULL, 'Reasignado', 'Reasignado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'REIM',NULL, 'Reimpreso', 'Reimpreso', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoRecibo', 'RELI',NULL, 'Eliminado', 'Eliminado', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'Clasificador TipoDocumentacion';
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'DIB',NULL, 'Dibujo', 'Dibujo', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'RESU',NULL, 'Resumen', 'Resumen', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'RES',NULL, 'Resolución', 'Resolución', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'DEC',NULL, 'Decreto', 'Decreto', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'FORM',NULL, 'Formulario', 'Formulario', NULL, 1, now(), now(), NULL, @IdUsuario, now());
#evalero 10/02/2015
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'NIZA',NULL, 'Clase Niza', 'Clase Niza', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'DES',NULL, 'Descripcion', 'Descripcion', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'REG',NULL, 'Registro', 'Registro', NULL, 1, now(), now(), NULL, @IdUsuario, now());
#evalero 11/08/2015
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'TITU',NULL, 'Titulo', 'Titulo', NULL, 1, now(), now(), NULL, @IdUsuario, now());
#evalero 10/02/2015
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoDocumentacion', 'OTRO',NULL, 'Otros', 'Otros', NULL, 1, now(), now(), NULL, @IdUsuario, now());

#evalero 11/02/2015 Agregar el Dominio TipoNotificacion
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoNotificacion','PER',NULL,'Personal','Personal',NULL,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoNotificacion','EMAI',NULL,'Email','Email',NULL,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoNotificacion','SMS',NULL,'Por SMS','Por SMS',NULL,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoNotificacion','EDIC',NULL,'Por Edicto','Por Edicto',NULL,1,now(),now(),NULL, @IdUsuario, now());
#evalero 11/02/2015 Agregar el Dominio EstadoNotificacion
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoNotificacion','SOL',NULL,'Solicitada','Solicitada',NULL,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoNotificacion','REA',NULL,'Realizada','Realizada',NULL,1,now(),now(),NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoNotificacion','NREA',NULL,'No Realizada','No Realizada',NULL,1,now(),now(),NULL, @IdUsuario, now());

select 'EstadoPublicacion';
#TipoArchivo 25022015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoPublicacion', 'PUBL',NULL, 'Publicado', 'Publicado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoPublicacion', 'PREP',NULL, 'Prepublicado', 'Prepublicado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoPublicacion', 'ENVI',NULL, 'Enviado', 'Enviado', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'EstadoPublicacionTramite';
#TipoArchivo 25022015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoPublicacionTramite', 'ASIG',NULL, 'Asignado', 'Asignado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoPublicacionTramite', 'ELIM',NULL, 'Eliminado', 'Eliminado', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'NotaMemo';
#NotaMemo 20042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'NotaMemo', 'NOT',NULL, 'Nota', 'Nota', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'NotaMemo', 'MEMO',NULL, 'Memorial', 'Memorial', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'NalInter';
#NotaMemo 20042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'NalInter', 'NAL',NULL, 'Nacional', 'Nacional', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'NalInter', 'INT',NULL, 'Internacional', 'Internacional', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'OrigenTestimonio';
#OrigenTestimonio 20042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'OrigenTestimonio', 'ORI',NULL, 'Original', 'Original', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'OrigenTestimonio', 'FLE',NULL, 'Fotocopia Legalizada', 'Fotocopia Legalizada', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'OrigenTestimonio', 'FSI',NULL, 'Fotocopia Simple', 'Fotocopia Simple', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'RegComercio';
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegComercio', 'ORI',NULL, 'Original', 'Original', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegComercio', 'FLE',NULL, 'Fotocopia Legalizada', 'Fotocopia Legalizada', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegComercio', 'FSI',NULL, 'Fotocopia Simple', 'Fotocopia Simple', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'FotOtro';
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'FotOtro', 'FOTC',NULL, 'Fotocopia C.I.', 'Fotocopia C.I.', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'FotOtro', 'OTR',NULL, 'Otro', 'Otro', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'RegTestimonio';
#OrigenTestimonio 20042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegTestimonio', 'ORI',NULL, 'Original', 'Original', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegTestimonio', 'FLE',NULL, 'Fotocopia Legalizada', 'Fotocopia Legalizada', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'MemoriaDescriptiva';
#OrigenTestimonio 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'MemoriaDescriptiva', 'DESC',NULL, 'Descripcion', 'Descripcion', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'MemoriaDescriptiva', 'REIV',NULL, 'Reivindicaciones', 'Reivindicaciones', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'MemoriaDescriptiva', 'RESU',NULL, 'Resumen', 'Resumen', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'MemoriaDescriptiva', 'DIBU',NULL, 'Dibujo', 'Dibujo', NULL, 1, now(), now(), NULL, @IdUsuario, now());


select 'CiNitOtros';
#OrigenTestimonio 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'CiNitOtros', 'DESC',NULL, 'Fotocopia de C.I.', 'Fotocopia de C.I.', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'CiNitOtros', 'REIV',NULL, 'Fotocopia NIT', 'Fotocopia NIT', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'CiNitOtros', 'RESU',NULL, 'Otros', 'Otros', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionArte';
#PresentacionArte 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionArte', 'COP',NULL, 'Copia', 'Copia', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionArte', 'MUE',NULL, 'Muestra', 'Muestra', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionMusica';
#PresentacionMusica 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionMusica', 'CD',NULL, 'Cd', 'Cd', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionMusica', 'LETR',NULL, 'Letra del Tema', 'Letra del Tema', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionMusica', 'PART',NULL, 'Partitura', 'Partitura', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionMusica', 'TABL',NULL, 'Tablatura', 'Tablatura', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionMusica', 'CIFR',NULL, 'Cifrado', 'Cifrado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionMusica', 'ACOR',NULL, 'Acordes', 'Acordes', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionCine';
#PresentacionCine 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionCine', 'OCD',NULL, 'Obra en Cd', 'Obra en Cd', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionCine', 'GUIO',NULL, 'Guion', 'Guion', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionPrograma';
#PresentacionPrograma 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionPrograma', 'EJEC',NULL, 'Copia ejecutable del programa', 'Copia ejecutable del programa', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionPrograma', 'DESC',NULL, 'Descripcion', 'Descripcion', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionObra';
#PresentacionObra 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionObra', 'COBR',NULL, 'Copia de la obra', 'Copia de la obra', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionContrato';
#PresentacionContrato 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionContrato', 'CONT',NULL, 'Contrato', 'Contrato', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionContrato', 'PJ',NULL, 'Personeria Jurídica', 'Personeria Jurídica', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'PresentacionSociedad';
#PresentacionSociedad 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionSociedad', 'RPJ',NULL, 'Reconocimiento de Personería Jurídica', 'Reconocimiento de Personería Jurídica', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionSociedad', 'EO',NULL, 'Estatuto Organico', 'Estatuto Organico', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionSociedad', 'RI',NULL, 'Reglamento Interno', 'Reglamento Interno', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionSociedad', 'LA',NULL, 'Lista de Asociados', 'Lista de Asociados', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'PresentacionSociedad', 'REG',NULL, 'Regalías', 'Regalías', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'RegPersona';
#RegPersona 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegPersona', 'ORI',NULL, 'Original', 'Original', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegPersona', 'FLEG',NULL, 'Fotocopia Legalizada', 'Fotocopia Legalizada', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegPersona', 'FSIM',NULL, 'Fotocopia Simple', 'Fotocopia Simple', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'RegJuridica';
#RegJuridica 21042015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegJuridica', 'FCI',NULL, 'Fotocopia de C.I.', 'Fotocopia de C.I.', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'RegJuridica', 'FNIT',NULL, 'Fotocopia NIT', 'Fotocopia NIT', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'EstadoProcesoPublicacion';
#EstadoProcesoPublicacion 22062015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProcesoPublicacion', 'INI',NULL, 'Iniciado', 'Iniciado', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EstadoProcesoPublicacion', 'CONC',NULL, 'Concluido', 'Concluido', NULL, 1, now(), now(), NULL, @IdUsuario, now());


select 'TipoSolicitudSigno';
#TipoSolicitudSigno 06102015 Autor Eddy Valero
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitudSigno', 'REGS',NULL, 'Registro de Signo y Marca', 'Registro de Signo y Marca', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitudSigno', 'RELC',NULL, 'Registro de Lema Comercial', 'Registro de Lema Comercial', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitudSigno', 'RDNC',NULL, 'Registro de Nombre Comercial', 'Registro de Nombre Comercial', NULL, 1, now(), now(), NULL, @IdUsuario, now());
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoSolicitudSigno', 'DESC',NULL, 'Desconocido', 'Desconocido', NULL, 1, now(), now(), NULL, @IdUsuario, now());

select 'TipoReferenciaFTP';
/**
TipoReferenciaFTP la direccion ip 192.168.139.75 es la de pruebas y es la que por defecto viene deshabilitada en la configuracion inicial
*/
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','IP',NULL,'IP','192.168.139.75',1,TRUE,now(),now(), now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','USU',NULL,'Usuario','UsrFtpJava',2,TRUE,now(),now(),now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','PASS',NULL,'Password','IaPOI569N16vbEW7z6E]',3,TRUE,now(),now(),now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','DIREPO',NULL,'Direccion Reportes','/Formularios',4,TRUE,now(),now(), now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','DIRIMAG',NULL,'Direccion Imagenes','/Adjuntos',5,TRUE,now(),now(), now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','IP',NULL,'IP','192.168.139.5',1,FALSE,now(),now(), now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','USU',NULL,'Usuario','UsrFtpJava',2,FALSE,now(),now(),now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','PASS',NULL,'Password','IaPOI569N16vbEW7z6E',3,FALSE,now(),now(),now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','DIREPO',NULL,'Direccion Reportes','/Formularios',4,FALSE,now(),now(), now(), 1, null);
INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio, FechaFin,Usuario,FechaUltimaModificacion) VALUES (NULL,'TipoReferenciaFTP','DIRIMAG',NULL,'Direccion Imagenes','/Adjuntos',5,FALSE,now(),now(), now(), 1, null);

/*
Agregar registros
-- Date: 2014-08-28 17:53
*/

INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'ABAN', 'Abandonado', 'Abandonado', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'ANPR', 'Anotación Preventiva', 'Anotación Preventiva', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'ANUL', 'Anulado', 'Anulado', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'ARCH', 'Archivado', 'Archivado', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'CADU', 'Caducado', 'Caducado', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'CANC', 'Cancelada', 'Cancelada', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'CON', 'Concedida', 'Concedida', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'DCAN', 'Demanda de Cancelación', 'Demanda de Cancelación', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'DEN', 'Denegada', 'Denegada', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'DESC', 'Desconocida', 'Desconocida', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'DESE', 'Desistimada', 'Desistimada', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'DESI', 'Desistida', 'Desistida', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'DEVU', 'Devuelto', 'Devuelto', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'FER', 'FER', 'FER', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'GHIP', 'GHIP', 'GHIP', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'INI', 'INI', 'INI', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'JER', 'JER', 'JER', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'NUL', 'NUL', 'NUL', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'OBS', 'OBS', 'OBS', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'OMI', 'OMI', 'OMI', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'PPRI', 'PPRI', 'PPRI', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'PROC', 'PROC', 'PROC', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'RECH', 'RECH', 'RECH', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'REN', 'REN', 'REN', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'RENU', 'RENU', 'RENU', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'REP', 'REP', 'REP', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'RET', 'RET', 'RET', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'REV', 'REV', 'REV', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'SOL', 'SOL', 'SOL', TRUE, now(), now(), 1, now());
INSERT INTO Clasificador (Dominio, Codigo, Nombre, Descripcion, Vigente, FechaCreacion, FechaInicio, Usuario, FechaUltimaModificacion) VALUES ('EtapaTramite', 'SUBS', 'SUBS', 'SUBS', TRUE, now(), now(), 1, now());

/*
Agregar registros de EtapaTramite para la etapa de modificación
-- Date: 18/12/2015
*/

INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXCN',NULL,'Examen Cambio de Nombre','Examen Cambio de Nombre',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXCD',NULL,'Examen Cambio de Domicilio','Examen Cambio de Domicilio',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXTR',NULL,'Examen Transferencia','Examen Transferencia',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXFU',NULL,'Examen Fusión','Examen Fusión',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXLU',NULL,'Examen Licencia de Uso','Examen Licencia de Uso',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'EtapaTramite','EXRE',NULL,'Examen Renovacion','Examen Renovacion',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);




#ClaseNiza
/*
-- Query: select idClaseNiza, NumeroClaseNiza, TiposClaseNiza, Vigente, now() as FechaInicio, NULL as FechaFin, Tipo, NotaTipoClaseNiza
from claseniza
-- Date: 2014-08-28 17:53
*/
select 'ClaseNiza';


INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (1,'1','Productos químicos para la industria, la ciencia y la fotografía, así como para la agricultura, la horticultura y la silvicultura; resinas artificiales en bruto, materias plásticas en bruto; abonos para el suelo; composiciones extintoras; preparaciones para templar y soldar metales; productos químicos para conservar alimentos; materias curtientes; adhesivos (pegamentos) para la industria.','1',now(),NULL,'1','La clase 1 comprende principalmente los productos químicos que se utilizan en la industria, la ciencia y la agricultura, incluidos los que entran en la composición de productos comprendidos en otras clases.;Esta clase comprende en particular:;- el compost y los abonos orgánicos;- la sal de conservación que no sea para conservar alimentos;- ciertos aditivos destinados a la industria alimentaria (consultar la lista alfabética de productos).;Esta clase no comprende en particular:;- las resinas naturales en bruto (cl. 2);- los productos químicos para las ciencias médicas (cl. 5);- los fungicidas, los herbicidas y los productos para eliminar animales dañinos (cl. 5);- los adhesivos (pegamentos) de papelería o para uso doméstico (cl. 16);- la sal para conservar alimentos (cl. 30);- el pajote (cobertura de humus) (cl. 31).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (2,'2','Pinturas, barnices, lacas; productos antioxidantes y productos para conservar la madera; materias tintóreas; mordientes; resinas naturales en bruto; metales en hojas y en polvo para pintores, decoradores, impresores y artistas.','1',now(),NULL,'1','La clase 2 comprende principalmente las pinturas, los colorantes y los productos anticorrosivos.;Esta clase comprende en particular:;- las pinturas, los barnices y las lacas para la industria, la artesanía y el arte;- los tintes para prendas de vestir;- los colorantes para alimentos y bebidas.;Esta clase no comprende en particular:;- las resinas artificiales en bruto (cl. 1);- los colorantes para lavar y blanquear la ropa (cl. 3);- los tintes cosméticos (cl. 3);- las cajas de pinturas (material escolar) (cl. 16);- las pinturas y los barnices aislantes (cl. 17).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (3,'3','Preparaciones para blanquear y otras sustancias para lavar la ropa; preparaciones para limpiar, pulir, desengrasar y raspar; jabones; productos de perfumería, aceites esenciales, cosméticos, lociones capilares; dentífricos.','1',now(),NULL,'1','La clase 2 comprende principalmente las pinturas, los colorantes y los productos anticorrosivos.;Esta clase comprende en particular:;- las pinturas, los barnices y las lacas para la industria, la artesanía y el arte;- los tintes para prendas de vestir;- los colorantes para alimentos y bebidas.;Esta clase no comprende en particular:;- las resinas artificiales en bruto (cl. 1);- los colorantes para lavar y blanquear la ropa (cl. 3);- los tintes cosméticos (cl. 3);- las cajas de pinturas (material escolar) (cl. 16);- las pinturas y los barnices aislantes (cl. 17).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (4,'4','Aceites y grasas para uso industrial; lubricantes; composiciones para absorber, rociar y asentar el polvo; combustibles (incluida la gasolina para motores) y materiales de alumbrado; velas y mechas de iluminación.','1',now(),NULL,'1','La clase 4 comprende principalmente los aceites y las grasas para uso industrial, los combustibles y los materiales de alumbrado.;Esta clase no comprende en particular:;- ciertos aceites y grasas industriales especiales (consultar la lista alfabética de productos).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (5,'5','Productos farmacéuticos y veterinarios; productos higiénicos y sanitarios para uso médico; alimentos y sustancias dietéticas para uso médico o veterinario, alimentos para bebés; complementos alimenticios para personas o animales; emplastos, material para apósitos; material para empastes e improntas dentales; desinfectantes; productos para eliminar animales dañinos; fungicidas, herbicidas.','1',now(),NULL,'1','La clase 5 comprende principalmente los productos farmacéuticos y otros productos para uso médico o veterinario.;Esta clase comprende en particular:;- los productos de higiene personal que no sean de tocador;- los pañales para bebés e incontinentes;- los desodorizantes que no sean para personas o animales;- los complementos alimenticios destinados a completar una dieta normal o a beneficiar la salud;- los sustitutos de comidas, alimentos y bebidas dietéticas para uso médico o veterinario;- los cigarrillos sin tabaco para uso médico.;Esta clase no comprende en particular:;- los productos de higiene personal que sean de tocador (cl. 3);- los desodorantes para personas o animales (productos de perfumería) (cl. 3);- las vendas ortopédicas (cl. 10);- los sustitutos de comidas, alimentos y bebidas dietéticas que no sean para uso médico o veterinario (cl. 29, 30, 31, 32 ó 33).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (6,'6','Metales comunes y sus aleaciones; materiales de construcción metálicos; construcciones transportables metálicas; materiales metálicos para vías férreas; cables e hilos metálicos no eléctricos; artículos de cerrajería y ferretería metálicos; tubos y tuberías metálicos; cajas de caudales; productos metálicos no comprendidos en otras clases;* minerales metalíferos.','1',now(),NULL,'1','La clase 6 comprende principalmente los metales comunes en bruto y semielaborados, así como los productos simples fabricados a partir de éstos.Esta clase no comprende en particular:- la bauxita (cl. 1);- el mercurio, el antimonio, los metales alcalinos y los metales alcalinotérreos (cl. 1);- los metales en hojas y en polvo para pintores, decoradores, impresores y artistas (cl. 2).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (7,'7','Máquinas y* máquinas herramientas; motores (excepto motores para vehículos terrestres); acoplamientos y elementos de transmisión (excepto para vehículos terrestres); instrumentos agrícolas que no sean accionados manualmente; incubadoras de huevos; distribuidores automáticos.','1',now(),NULL,'1','La clase 7 comprende principalmente las máquinas, las máquinas herramientas y los motores.;Esta clase comprende en particular:;- las partes de motores (de todo tipo);- las máquinas y aparatos eléctricos de limpieza.;Esta clase no comprende en particular:;- ciertas máquinas y máquinas herramientas especiales (consultar la lista alfabética de productos);- las herramientas e instrumentos de mano accionados manualmente (cl. 8);- los motores para vehículos terrestres (cl. 12).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (8,'8','Herramientas e instrumentos de mano accionados manualmente; artículos de cuchillería, tenedores y cucharas; armas blancas; maquinillas de afeitar.','1',now(),NULL,'1','La clase 8 comprende principalmente las herramientas e instrumentos de mano accionados manualmente.;Esta clase comprende en particular:;- los cuchillos, tenedores y cucharas de metales preciosos;- las navajas y maquinillas de afeitar, las esquiladoras y cortadoras de pelo (instrumentos de mano) y los cortaúñas eléctricos.;Esta clase no comprende en particular:- ciertos instrumentos especiales (consultar la lista alfabética de productos);- las herramientas e instrumentos accionados por motor (cl. 7);- los instrumentos cortantes para uso quirúrgico (cl. 10);- los cortapapeles (cl. 16);- las armas de esgrima (cl. 28).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (9,'9','Aparatos e instrumentos científicos, náuticos, geodésicos, fotográficos, cinematográficos, ópticos, de pesaje, de medición, de señalización, de control (inspección), de salvamento y de enseñanza; aparatos e instrumentos de conducción, distribución, transformación, acumulación, regulación o control de la electricidad; aparatos de grabación, transmisión o reproducción de sonido o imágenes; soportes de registro magnéticos, discos acústicos; discos compactos, DVD y otros soportes de grabación digita','1',now(),NULL,'1','La Clase 9 comprende en particular:;- los aparatos e instrumentos de investigación científica para laboratorios;- los aparatos e instrumentos de control para embarcaciones, tales como los aparatos de medición y transmisión de órdenes;- los transportadores de ángulos;- las máquinas de tarjetas perforadas para oficinas;- los programas informáticos y el software de todo tipo, independientemente de su soporte de grabación o medio de difusión, incluido el software grabado en soportes magnéticos o descargado de una red informática remota.;Esta clase no comprende en particular:;- los siguientes aparatos eléctricos:a) los aparatos electromecánicos para uso culinario (trituradoras y batidoras de alimentos, exprimidores de fruta, molinillos de café eléctricos, etc.) y otros aparatos e instrumentos accionados por motor eléctrico, todos ellos clasificados en la clase 7;b) los aparatos de bombeo o distribución de combustibles (cl. 7);c) las navajas y maquinillas de afeitar, las esquiladoras y corta', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (10,'10','Aparatos e instrumentos quirúrgicos, médicos, odontológicos y veterinarios, así como miembros, ojos y dientes artificiales; artículos ortopédicos; material de sutura.','1',now(),NULL,'1','La clase 10 comprende principalmente los aparatos, instrumentos y artículos médicos.;Esta clase comprende en particular:;- el mobiliario especial para uso médico;- ciertos artículos sanitarios de caucho (consultar la lista alfabética de productos);- las vendas ortopédicas.', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (11,'11','Aparatos de alumbrado, calefacción, producción de vapor, cocción, refrigeración, secado, ventilación y distribución de agua, así como instalaciones sanitarias.','1',now(),NULL,'1','La clase 11 comprende en particular:;- los aparatos de aire acondicionado;- los calentadores de cama, las bolsas de agua caliente, los calientacamas, eléctricos o no;- las almohadillas y mantas eléctricas que no sean para uso médico;- los hervidores eléctricos;- los utensilios de cocción eléctricos.;Esta clase no comprende en particular:- los aparatos de producción de vapor (partes de máquinas) (cl. 7);- la vestimenta electrotérmica (cl. 9).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (12,'12','Vehículos; aparatos de locomoción terrestre, aérea o acuática.','1',now(),NULL,'1','La clase 12 comprende en particular:;- los motores para vehículos terrestres;- los acoplamientos y elementos de transmisión para vehículos terrestres;- los aerodeslizadores.Esta clase no comprende en particular:;- ciertas partes de vehículos (consultar la lista alfabética de productos);- los materiales metálicos para vías férreas (cl. 6);- los motores, acoplamientos y elementos de transmisión que no sean para vehículos terrestres (cl. 7);- las partes de motores (de todo tipo) (cl. 7).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (13,'13','Armas de fuego; municiones y proyectiles; explosivos; fuegos artificiales.','1',now(),NULL,'1','La clase 13 comprende principalmente las armas de fuego y los productos pirotécnicos.;Esta clase no comprende en particular:;- las cerillas (cl. 34).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (14,'14','Metales preciosos y sus aleaciones, así como productos de estas materias o chapados no comprendidos en otras clases*; artículos de joyería, bisutería, piedras preciosas; artículos de relojería e instrumentos cronométricos.','1',now(),NULL,'1','La clase 14 comprende principalmente los metales preciosos, los productos fabricados con estas materias que no estén comprendidos en otras clases y, en general, los artículos de joyería, bisutería y relojería.;lista clase comprende en particular:;- los artículos de joyería, auténticos y de imitación;- los gemelos y los alfileres de corbata.;Esta clase no comprende en particular:;- los productos de metales preciosos clasificados según su función o destino, por ejemplo, los metales en hojas o en polvo para pintores, decoradores, impresores y artistas (cl. 2), las amalgamas dentales de oro (cl. 5), los artículos de cuchillería, los tenedores y cucharas (cl. 8), los contactos eléctricos (cl. 9), los plumines de oro para escribir (cl. 16), las teteras (cl. 21), los bordados en oro y plata (cl. 26), las cajas para puros (cl. 34);- los objetos de arte que no sean de metales preciosos (clasificados según la materia de la que están constituidos).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (15,'15','Instrumentos musicales.','1',now(),NULL,'1','La Clase 15 comprende en particular:;- los pianos mecánicos y sus accesorios;- las cajas de música;- los instrumentos musicales eléctricos y electrónicos.Esta clase no comprende en particular:;- los aparatos de grabación, transmisión, amplificación y reproducción de sonido (cl. 9).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (16,'16','Papel, cartón y artículos de estas materias no comprendidos en otras clases*; productos de imprenta; material de encuadernación; fotografías; artículos de papelería; adhesivos (pegamentos) de papelería o para uso doméstico; material para artistas; pinceles; máquinas de escribir y artículos de oficina (excepto muebles); material de instrucción o material didáctico (excepto aparatos); materias plásticas para embalar (no comprendidas en otras clases); caracteres de imprenta; clichés de imprenta.','1',now(),NULL,'1','La clase 16 comprende principalmente el papel, los productos de papel y los artículos de oficina.Esta clase comprende en particular:;- los cortapapeles;- las multicopistas;- las hojas o bolsas de materias plásticas para embalar.;Esta clase no comprende en particular:;- ciertos productos de papel o cartón (consultar la lista alfabética de productos);- las pinturas (cl. 2);- las herramientas de mano para artistas (por ejemplo: las espátulas y cinceles de escultor) (cl. 8).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (17,'17','Caucho, gutapercha, goma, amianto, mica y productos de estas materias no comprendidos en otras clases*; productos de materias plásticas semielaborados; materiales para calafatear, estopar y aislar; tubos flexibles no metálicos.','1',now(),NULL,'1','La clase 17 comprende principalmente los aislantes eléctricos, térmicos o acústicos, así como las materias plásticas semielaboradas en forma de hojas, placas o varillas.;Esta clase comprende en particular:;- la goma para recauchutar neumáticos;- los materiales de relleno de caucho o materias plásticas;- las barreras flotantes anticontaminación.', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (18,'18','Cuero y cuero de imitación, productos de estas materias no comprendidos en otras clases*; pieles de animales; baúles y maletas; paraguas y sombrillas; bastones; fustas y artículos de guarnicionería.','1',now(),NULL,'1','La clase 18 comprende principalmente el cuero, el cuero de imitación, los artículos de viaje no comprendidos en otras clases y los artículos de guarnicionería.;Esta clase no comprende en particular:;- las prendas de vestir, el calzado y los artículos de sombrerería (consultar la lista alfabética de productos).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (19,'19','Materiales de construcción no metálicos; tubos rígidos no metálicos para la construcción; asfalto, pez y betún; construcciones transportables no metálicas; monumentos no metálicos.','1',now(),NULL,'1','La clase 19 comprende principalmente los materiales de construcción no metálicos.;Esta clase comprende en particular:;- las maderas semielaboradas (por ejemplo: vigas, tablas, paneles);- las maderas contrachapadas;- el vidrio de construcción (por ejemplo: losas, tejas de vidrio);- las microesferas de vidrio para la señalización de carreteras;- los buzones de obra.;Esta clase no comprende en particular:;- los productos para conservar o impermeabilizar cemento (cl. 1);- los productos ignífugos (cl. 1);- la pez negra de zapatero (cl. 3).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (20,'20',' Muebles, espejos, marcos; productos de madera, corcho, caña, junco, mimbre, cuerno, hueso, marfil, ballena, concha, ámbar, nácar, espuma de mar, sucedáneos de todos estos materiales o de materias plásticas, no comprendidos en otras clases*.','1',now(),NULL,'1','La clase 20 comprende principalmente los muebles y sus partes, así como los productos de materias plásticas no comprendidos en otras clases.;Esta clase comprende en particular:;- los muebles metálicos y los muebles de camping;- los accesorios para camas (por ejemplo: colchones, somieres, almohadas);- los espejos de mobiliario o de tocador;- las placas de matriculación no metálicas;- los buzones de correo no metálicos ni de obra.;Esta clase no comprende en particular:;- ciertos espejos especiales clasificados según su función o destino (consultar la lista alfabética de productos);- el mobiliario especial de laboratorio (cl. 9);- el mobiliario especial para uso médico (cl. 10);- la ropa de cama (cl. 24);- los edredones (cl. 24).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (21,'21','Utensilios y recipientes para uso doméstico y culinario; peines y esponjas; cepillos; materiales para fabricar cepillos; material de limpieza; lana de acero; vidrio en bruto o semielaborado (excepto el vidrio de construcción); artículos de cristalería, porcelana y loza no comprendidos en otras clases.','1',now(),NULL,'1','La clase 21 comprende principalmente los pequeños aparatos y utensilios accionados manualmente para uso doméstico y culinario, así como los utensilios de tocador, los artículos de cristalería y porcelana.;Esta clase comprende en particular:;- los utensilios y recipientes para uso doméstico y culinario, por ejemplo: las baterías de cocina, los baldes, los barreños de hojalata, aluminio, materias plásticas u otras materiales y los aparatos pequeños para picar, moler o exprimir, accionados manualmente;- los peines eléctricos;- los cepillos de dientes eléctricos;- los salvamanteles, posabotellas y posavasos (vajilla).;Esta clase no comprende en particular:;- ciertos artículos de cristal, porcelana y loza (consultar la lista alfabética de productos);- los productos de limpieza, los jabones, etc. (cl. 3);- los aparatos pequeños para cortar, moler o exprimir, accionados eléctricamente (cl. 7);- las navajas y maquinillas de afeitar, las esquiladoras y cortadoras de pelo, los instrumentos metál', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (22,'22','Cuerdas, cordeles, redes, tiendas de campaña, lonas, velas de navegación,sacos y bolsas (no comprendidos en otras clases); materiales textiles fibrosas en bruto.','1',now(),NULL,'1','La clase 22 comprende principalmente la cordelería y el velamen, los materiales de acolchado y relleno, así como las materias textiles fibrosas en bruto.;Esta clase comprende en particular:;- las cuerdas y cordeles de fibra textil natural o artificial, de papel o de materias plásticas.;Esta clase no comprende en particular:;- ciertas, redes, sacos y bolsas especiales (consultar la lista alfabética de productos);- las cuerdas para instrumentos musicales (cl. 15).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (23,'23','Hilos para uso textil.','1',now(),NULL,'1','', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (24,'24','Tejidos y productos textiles no comprendidos en otras clases; ropa de cama; ropa de mesa.','1',now(),NULL,'1',NULL, '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (25,'25','Prendas de vestir, calzado, artículos de sombrerería.','1',now(),NULL,'1','La clase 24 comprende principalmente los tejidos y los cobertores.;Esta clase comprende en particular:;- la ropa de cama de papel.;Esta clase no comprende en particular:;- ciertos tejidos especiales (consultar la lista alfabética de productos);- las mantas eléctricas para uso médico (cl. 10) y no médico (cl. 11);- las mantelerías de papel (cl. 16);- las mantas para caballos (cl. 18).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (26,'26','Encajes y bordados, cintas y cordones; botones, ganchos y ojetes, alfileres y agujas; flores artificiales.','1',now(),NULL,'1','La clase 23 comprende, en particular:;- cierta ropa y calzado especiales (consultar la lista alfabética de productos).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (27,'27','Alfombras, felpudos, esteras, linóleo y otros revestimientos de suelos; tapices murales que no sean de materias textiles.','1',now(),NULL,'1','La clase 26 comprende principalmente los artículos de mercería y pasamanería.;Esta clase comprende en particular:;- las cremalleras (cierres).;Esta clase no comprende en particular:;- ciertos ganchos especiales (consultar la lista alfabética de productos);- ciertas agujas especiales (consultar la lista alfabética de productos);- los hilos para uso textil (cl. 23).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (28,'28','Juegos y juguetes; artículos de gimnasia y deporte no comprendidos en otras clases; adornos para árboles de Navidad.','1',now(),NULL,'1','La clase 27 comprende principalmente los productos destinados a recubrir o revestir, con el fin de acondicionar, los suelos o paredes ya construidos.;Esta clase no comprende en particular:;- los parqués.', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (29,'29','Carne, pescado, carne de ave y carne de caza; extractos de carne; frutas y verduras, hortalizas y legumbres en conserva, congeladas, secas y cocidas; jaleas, confituras, compotas; huevos; leche y productos lácteos; aceites y grasas comestibles.','1',now(),NULL,'1','La clase 29 comprende principalmente los productos alimenticios de origen animal, así como las verduras, hortalizas y legumbres, y otros productos hortícolas comestibles preparados para su consumo o conservación.;Esta clase comprende en particular:;- las bebidas lacteadas en las que predomine la leche.;Esta clase no comprende en particular:;- ciertos productos alimenticios de origen vegetal (consultar la lista alfabética de productos);- los alimentos para bebés (cl. 5);- los alimentos y sustancias dietéticas para uso médico (cl. 5);- los complementos alimenticios (cl. 5);- los aliños para ensaladas (cl. 30);- los huevos para incubar (cl. 31);- los alimentos para animales (cl. 31);- los animales vivos (cl. 31).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (30,'30','Café, té, cacao y sucedáneos del café; arroz; tapioca y sagú; harinas y preparaciones a base de cereales; pan, productos de pastelería y confitería; helados comestibles; azúcar, miel, jarabe de melaza; levadura, polvos de hornear; sal; mostaza; vinagre, salsas (condimentos); especias; hielo.','1',now(),NULL,'1','La clase 30 comprende principalmente los productos alimenticios de origen vegetal preparados para su consumo o conservación, así como los aditivos para realzar el sabor de los alimentos.;Esta clase comprende en particular:;- las bebidas a base de café, cacao, chocolate o té;- los cereales preparados para la alimentación humana (por ejemplo: copos de avena o de otros cereales).;Esta clase no comprende, en particular:;- ciertos productos alimenticios de origen vegetal (consultar la lista alfabética de productos);- la sal de conservación que no sea para conservar alimentos (cl. 1);- las infusiones medicinales y los alimentos y sustancias dietéticas para uso médico (cl. 5);- los alimentos para bebés (cl. 5);- los complementos alimenticios (cl. 5);- los cereales sin procesar (cl. 31);- los alimentos para animales (cl. 31).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (31,'31','Granos y productos agrícolas, hortícolas y forestales, no comprendidos en otras clases; animales vivos; frutas y verduras, hortalizas y legumbres frescas; semillas; plantas y flores naturales; alimentos para animales; malta.','1',now(),NULL,'1','La clase 31 comprende principalmente los productos de la tierra que no hayan sido procesados para su consumo, los animales vivos y las plantas vivas, así como los alimentos para animales.;Esta clase comprende en particular:;- las maderas en bruto;- los cereales sin procesar;- los huevos para incubar;- los moluscos y crustáceos vivos.;Esta clase no comprende en particular:;- los cultivos de microorganismos y las sanguijuelas para uso médico (cl. 5);- los complementos alimenticios para animales (cl. 5);- las maderas semielaboradas (cl. 19);- los cebos de pesca artificiales (cl. 28);- el arroz (cl. 30);- el tabaco (cl. 34).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (32,'32','Cervezas; aguas minerales y gaseosas, y otras bebidas sin alcohol; bebidas a base de frutas y zumos de frutas; siropes y otras preparaciones para elaborar bebidas.','1',now(),NULL,'1','La clase 32 comprende principalmente las bebidas sin alcohol, así como las cervezas.;Esta clase comprende en particular:;- las bebidas desalcoholizadas.;Esta clase no comprende en particular:;- las bebidas para uso médico (cl. 5);- las bebidas lacteadas en las que predomine la leche (cl. 29);- las bebidas a base de café, cacao, chocolate o té (cl. 30).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (33,'33','Bebidas alcohólicas (excepto cervezas).','1',now(),NULL,'1','La clase 33 comprende en particular:;- las pociones medicinales (cl. 5);- las bebidas desalcoholizadas (cl. 32).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (34,'34','Tabaco; artículos para fumadores; cerillas.','1',now(),NULL,'1','La clase 34 comprende en particular:;- los sucedáneos del tabaco (que no sean para uso médico).;Esta clase no comprende en particular:;- los cigarrillos sin tabaco para uso médico (cl. 5).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (35,'35','Publicidad; gestión de negocios comerciales; administración comercial; trabajos de oficina.','1',now(),NULL,'0','La clase 35 comprende principalmente los servicios prestados por personas u organizaciones cuyo objetivo primordial es prestar asistencia en:\n1) la explotación o dirección de una empresa comercial,; 2) la dirección de los negocios o actividades comerciales de una empresa industrial o comercial, así como los servicios prestados por empresas publicitarias cuya actividad principal consiste en publicar, en cualquier medio de difusión, comunicaciones, declaraciones o anuncios relacionados con todo tipo de productos o servicios.;Esta clase comprende en particular:;- el agrupamiento, en beneficio de terceros, de productos diversos (excepto su transporte), para que los consumidores puedan examinarlos y comprarlos a su conveniencia; este servicio puede ser prestado por comercios minoristas o mayoristas, o mediante catálogos de venta por correo o medios de comunicación electrónicos, por ejemplo, sitios web o programas de televenta;- los servicios que comprenden el registro, transcripción, compos', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (36,'36','Seguros; operaciones financieras; operaciones monetarias; negocios inmobiliarios.','1',now(),NULL,'0','La clase 36 comprende principalmente los servicios prestados en el marco de operaciones financieras y monetarias, así como los servicios relacionados con contratos de seguros de todo tipo.;Esta clase comprende en particular:;- los servicios relacionados con operaciones financieras o monetarias, a saber:a) los servicios de instituciones bancarias o instituciones afines, tales como las operaciones de cambio o de compensación;b) los servicios de instituciones de crédito que no sean bancos, tales como las cooperativas de crédito, las compañías financieras individuales, los prestamistas, etc.;c) los servicios de sociedades de inversión y de sociedades de cartera;d) los servicios de corredores de bienes y valores;e) los servicios relacionados con operaciones monetarias con garantía de agentes fiduciarios;f) los servicios relacionados con la emisión de cheques de viaje y de cartas de crédito.;- los servicios de arrendamiento con opción de compra (leasing);- los servicios de administradores de', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (37,'37','Servicios de construcción; servicios de reparación; servicios de instalación*.','1',now(),NULL,'0','La clase 37 comprende principalmente los servicios prestados por empresarios o subcontratistas para la construcción o fabricación de edificios permanentes, así como los servicios prestados por personas u organizaciones que se encargan de restablecer el estado original de objetos o de preservarlos sin alterar sus propiedades físicas o químicas.;Esta clase comprende en particular:;- los servicios relacionados con la construcción de edificios, carreteras, puentes, presas o líneas de transmisión, así como los servicios de empresas especializadas en el campo de la construcción, tales como las empresas de pintura, fontanería, instalación de calefacción o techado;- los servicios anexos a los servicios de construcción, tales como la inspección de proyectos de construcción;- los servicios de construcción naval;- los servicios de alquiler de herramientas o de materiales de construcción;- los servicios de reparación, a saber, los servicios que consisten en dejar en buen estado cualquier objeto de', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (38,'38','Telecomunicaciones.','1',now(),NULL,'0','La clase 38 comprende principalmente los servicios que permitan la comunicación, por medios sensoriales, entre dos o más personas, en particular:;1) la conversación entre dos personas;2) la transmisión de mensajes entre dos personas;3) la comunicación oral o visual (radio y televisión).;Esta clase comprende en particular:;- los servicios que consisten principalmente en la difusión de programas radiofónicos o de televisión.;Esta clase no comprende en particular:;- los servicios de publicidad radiofónica (cl. 35);- los servicios de marketing telefónico (telemarketing) (cl. 35).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (39,'39','Transporte; embalaje y almacenamiento de mercancías; organización de viajes.','1',now(),NULL,'0','La clase 39 comprende principalmente los servicios relacionados con el transporte de personas o mercancías de un lugar a otro (por ferrocarril, carretera, agua, aire o conducto) y los servicios afines, así como los servicios relacionados con el almacenamiento de mercancías en depósitos u otros edificios para su preservación o custodia.;Esta clase comprende en particular:- los servicios prestados por compañías que explotan estaciones, puentes, transbordadores (ferris), etc., utilizados por transportistas;- los servicios relacionados con el alquiler de vehículos de transporte;- los servicios relacionados con el remolque marítimo, la descarga de mercancías, el funcionamiento de puertos y muelles, así como el salvamento de buques en peligro y de sus cargamentos;- los servicios relacionados con el embalaje y empaquetado de productos previa expedición;- los servicios de información sobre viajes o transporte de mercancías prestados por intermediarios y agencias de turismo, así como los servicios de información sobre tarifas , horarios y medios de transporte;- los servicios relacionados con la inspección de vehículos o mercancías previo su transporte. Esta clase no comprende en particular:- los servicios relacionados con la publicidad de empresas de transporte, tales como la distribución de folletos o la publicidad radiofónica (cl. 35);- los servicios relacionados con la emisión de cheques de viaje o de cartas de crédito a través de intermediarios o de agencias de viaje (cl. 36);- los servicios relacionados con seguros (comerciales, de incendio o de vida) durante el transporte de personas o de mercancías (cl. 36);- los servicios relacionados con el mantenimiento y la reparación de vehículos, excepto el mantenimiento y la reparación de objetos vinculados con el transporte de personas y de mercancías (cl. 37);- los servicios relacionados con reservas de habitaciones de hotel a través de agencias de viajes o de intermediarios (cl. 43).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (40,'40','Tratamiento de materiales.','1',now(),NULL,'0','La clase 40 comprende principalmente los servicios prestados en el marco del tratamiento o transformación mecánica o química de objetos o sustancias orgánicas o inorgánicas, no comprendidos en otras clases.;A efectos de clasificación, la marca se considera marca de servicio únicamente en los casos en que el tratamiento o la transformación sean efectuados por cuenta de terceros. Asimismo, la marca se considera marca de fábrica siempre que la persona que haya tratado o transformado el objeto o la sustancia también se encargue de su comercialización.;Esta clase comprende en particular:;- los servicios relacionados con la transformación de un objeto o sustancia y cualquier tratamiento que implique una modificación de sus propiedades esenciales (por ejemplo, el teñido de una prenda de vestir); por lo tanto, los servicios de mantenimiento que impliquen tal modificación se clasificarán en la clase 40, a pesar de que suelan estar comprendidos en la clase 37 (por ejemplo, el cromado del paracho', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (41,'41','Educación; formación; servicios de entretenimiento; actividades deportivas y culturales.','1',now(),NULL,'0','La clase 41 comprende principalmente los servicios prestados por personas o instituciones para desarrollar las facultades mentales de personas o animales, así como los servicios destinados a divertir o entretener.;Esta clase comprende en particular:;- todos los servicios relacionados con la educación de personas o la doma y adiestramiento de animales;- los servicios cuyos principales propósitos son el recreo, diversión y entretenimiento de personas;- los servicios de presentación al público de obras de artes plásticas o de literatura con fines culturales o educativos.', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (42,'42','Servicios científicos y tecnológicos, así como servicios de investigación y diseño en estos ámbitos; servicios de análisis e investigaciones industriales; diseño y desarrollo de equipos informáticos y de software.','1',now(),NULL,'0','La clase 42 comprende principalmente los servicios prestados por personas, a título individual o colectivo, relacionados con aspectos teóricos o prácticos de sectores de actividades de alta complejidad; dichos servicios son prestados por profesionales, tales como químicos, físicos, ingenieros, programadores informáticos, etc.;Esta clase comprende en particular:;- los servicios de ingenieros encargados de efectuar evaluaciones, estimaciones, investigaciones e informes en los ámbitos científico y tecnológico;- los servicios de investigación científica con fines médicos.;Esta clase no comprende en particular:;- la investigación y evaluación de negocios comerciales (cl. 35);- los servicios de tratamiento de texto y de gestión de archivos informáticos (cl. 35);- la evaluación fiscal y financiera (cl. 36);- los servicios de extracción minera y petrolera (cl. 37);- los servicios de instalación y reparación de ordenadores (cl. 37);- los servicios prestados por profesionales, tales como médicos', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (43,'43','Servicios de restauración (alimentación); hospedaje temporal.','1',now(),NULL,'0','La clase 43 comprende principalmente los servicios que consisten en preparar alimentos y bebidas para el consumo, prestados por personas o establecimientos, así como los servicios de alojamiento, albergue y abastecimiento de comida en hoteles, pensiones u otros establecimientos que proporcionen hospedaje temporal.;Esta clase comprende en particular:;- los servicios de reserva de alojamiento para viajeros, prestados principalmente por agencias de viajes o corredores;- las residencias para animales.;Esta clase no comprende en particular:;- los servicios de alquiler de bienes inmuebles, tales como casas, apartamentos, etc., para la ocupación permanente (cl. 36);- los servicios de organización de viajes prestados por agencias de turismo (cl. 39);- los servicios de conservación de alimentos y bebidas (cl. 40);- los servicios de discotecas (cl. 41);- los servicios de internados (cl. 41);- los servicios de casas de reposo y convalecencia (cl. 44).', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (44,'44','Servicios médicos; servicios veterinarios; tratamientos de higiene y de belleza para personas o animales; servicios de agricultura, horticultura y silvicultura.','1',now(),NULL,'0','La clase 44 comprende principalmente los tratamientos médicos, de higiene corporal y de belleza destinados a personas o animales, prestados por personas o establecimientos; comprende asimismo los servicios relacionados con los sectores de la agricultura, la horticultura y la silvicultura.\nEsta clase comprende en particular:\n- los servicios de análisis médicos relacionados con el tratamiento de personas (tales como los exámenes radiográficos y las extracciones de sangre);- los servicios de inseminación artificial;- las consultas farmacéuticas;- la cría de animales;- los servicios relacionados con el cultivo de plantas, tales como la jardinería;- los servicios relacionados con el arte floral, tales como los arreglos florales, y los servicios prestados por jardineros paisajistas.;Esta clase no comprende en particular:;- los servicios de eliminación de animales dañinos (que no estén relacionados con la agricultura, la horticultura y la silvicultura) (cl. 37);- los servicios de instalación ', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (45,'45','Servicios jurídicos; servicios de seguridad para la protección de bienes y personas; servicios personales y sociales prestados por terceros para satisfacer necesidades individuales*.','1',now(),NULL,'0','La clase 45 comprende en particular:- los servicios prestados por juristas a personas, grupos de personas, organizaciones o empresas;- los servicios de investigación y vigilancia relacionados con la seguridad de personas y colectividades;- los servicios prestados a personas en relación con acontecimientos sociales, tales como los servicios de acompañamiento en sociedad, las agencias matrimoniales y los servicios funerarios.;Esta clase no comprende en particular:;- los servicios profesionales de asistencia directa en operaciones o actividades de una empresa comercial (cl. 35);- los servicios relacionados con operaciones financieras o monetarias y los servicios relacionados con seguros (cl. 36);- los servicios de acompañamiento de viajeros (cl. 39);- los servicios de transporte de seguridad (cl. 39);- todos los servicios relacionados con la educación de personas (cl. 41);- los servicios de cantantes o bailarines (cl. 41);- los servicios informáticos relacionados con la protección de soft', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (46,'0','Sin Clase Niza','1',now(),NULL,'1','', '10','2015', @IdUsuario, now());
INSERT INTO ClaseNiza (IdClaseNiza,NumeroClaseNiza,TiposClaseNiza,Vigente,FechaInicio,FechaFin,Tipo,NotaTipoClaseNiza, NumeroEdicion, Version, Usuario, FechaUltimaModificacion) VALUES (47,'-1','Ninguno','1',now(),NULL,'1','', '10','2015', @IdUsuario, now());

#Regional
select 'Regional';

#evalero modificaciones 26022015 se eliminan los campos de regional en la Base de Datos
INSERT INTO Regional(IdRegional, Central, Nombre, Direccion, Telefono, Fax, TipoCiudadNotificacion, FechaCreacion, Vigente, Usuario, FechaUltimaModificacion) VALUES (1, TRUE, 'Oficina Central - La Paz', 'Calle Potosí­ Esq. Colon No 1278 Edif. Atalaya - Piso 1', '2115700', '2115700', 'LPZ', now(), TRUE, @IdUsuario, NULL);
INSERT INTO Regional(IdRegional, Central, Nombre, Direccion, Telefono, Fax, TipoCiudadNotificacion, FechaCreacion, Vigente, Usuario, FechaUltimaModificacion) VALUES (2, FALSE, 'Oficina Distrital - El Alto', 'Av. 6 de Marzo No 80 entre calles 2 y 3 Galeria Armendia - Piso 2 Of. 205 Zona 12 de Octubre', '2141001', 'NULL', 'ALT', now(), TRUE, @IdUsuario, now());
INSERT INTO Regional(IdRegional, Central, Nombre, Direccion, Telefono, Fax, TipoCiudadNotificacion, FechaCreacion, Vigente, Usuario, FechaUltimaModificacion) VALUES (3, FALSE, 'Oficina Distrital - Cochabamba', 'Calle Chuquisaca No 649 entre Antezana y Lanza - Piso 2 Zona Central - Noreste', '4141403', 'NULL', 'CBA', now(), TRUE, @IdUsuario, now());
INSERT INTO Regional(IdRegional, Central, Nombre, Direccion, Telefono, Fax, TipoCiudadNotificacion, FechaCreacion, Vigente, Usuario, FechaUltimaModificacion) VALUES (4, FALSE, 'Oficina Distrital - Santa Cruz', 'Prolongación Quijarro, Esq. Uruguay No 29 Edif. Bicentenario - 1er Anillo', '3121752', 'NULL', 'SCZ', now(), TRUE, @IdUsuario, now());
INSERT INTO Regional(IdRegional, Central, Nombre, Direccion, Telefono, Fax, TipoCiudadNotificacion, FechaCreacion, Vigente, Usuario, FechaUltimaModificacion) VALUES (5, FALSE, 'Ventanilla Única - Tarija', 'Calle Ingavi No 156 entre Colón y Suipacha Edif. Coronado - Piso 2 Of. 202 Zona Central', '70451020', 'NULL', 'TJA', now(), TRUE, @IdUsuario, now());
INSERT INTO Regional(IdRegional, Central, Nombre, Direccion, Telefono, Fax, TipoCiudadNotificacion, FechaCreacion, Vigente, Usuario, FechaUltimaModificacion) VALUES (6, FALSE, 'Ventanilla Única - Chuquisaca', 'Calle Luis Paz Arce (ex Pilinco) No 182 esq. G. Mendizabal - Piso 1 Of. 1 Zona Central', '72873611', 'NULL', 'CQH', now(), TRUE, @IdUsuario, now());


#Pagina
select 'Pagina';

INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (1, NULL, 'UsuarioExterno', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (2, NULL, 'PaginaBandeja', '/faces/usuario/bandejaTramitesSolicitudUsuario.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (3, NULL, 'PaginaFormulariosSignosYMarcas', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (4, 1, 'PaginaSolicitudRegistroSignoDistintivo', '/faces/solicitudGeneral/solicitudGeneral.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (5, 14, 'PaginaSolicitudRegistroLemaComercial', '/faces/solicitudLemaComercial/solicitudLemaComercial.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (6, NULL, 'AreaVentanilla', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (7, NULL, 'BandejaSolicitudesVentanilla', '/faces/ventanilla/solicitud/busquedaTramiteSolicitud.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (8, NULL, 'AreaExamendeForma', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (9, NULL, 'PaginaBandejaExamendeForma', '/faces/modificacionGeneral/busquedaModificacionGeneral.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (10, NULL, 'AreaDerechosDeAutor', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (11, NULL, 'PaginaBandejaDerechosDeAutor', '/faces/usuarioInterno/bandeja.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (12, NULL, 'AreaPatentes', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (13, NULL, 'PaginaBandejaPatentes', '/faces/usuarioInterno/bandeja.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (14, NULL, 'AreaExamenFondo', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (15, NULL, 'PaginaBandejaExamenFondo', '/faces/usuarioInterno/bandeja.xhtml?req=EXFF', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (16, NULL, 'UsuarioExternoModificaciones', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (17, 2, 'PaginaUsuarioExternoModificaciones', '/faces/modificacion/busquedaModificacion.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (18, NULL, 'AreaRecaudaciones', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (19, NULL, 'PaginaDosificacionRecaudaciones', '/faces/recaudaciones/dosificacion.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (20, NULL, 'PaginaDepositoRecaudaciones', '/faces/recaudaciones/deposito.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (21, NULL, 'AreaDigitalizacion', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (22, NULL, 'PaginaBandejaDigitalizacion', '/faces/digitalizacion/digitalizacionBusqueda.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 12012015 Menú de Navegacion de las Paginas
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (23, NULL, 'Datos del Solicitante', '/faces/solicitudGeneral/identificacionSolicitanteGeneral.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (24, NULL, 'Datos del Apoderado', '/faces/solicitudGeneral/identificacionRepresentanteGeneral.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (25, NULL, 'Registro Datos Signo Distintivo', '/faces/solicitudGeneral/datosSignoDistintivoGeneral.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (26, NULL, 'Registro Preferencias', '/faces/solicitudGeneral/prioridadRegistroGeneral.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (27, NULL, 'Registro Direccion Notificacion', '/faces/solicitudGeneral/direccionNotificacionGeneral.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 14012015 Menú de navegacion ModificacionUsuario
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (28, 2, 'Listado Datos de Solicitantes', '/faces/modificacion/listadoModificacionNombre.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 26012015 Configuracion del Rol de Entrega
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (29, NULL, 'AreaPublicacion', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (30, NULL, 'PaginaBandejaPublicacion', '/faces/publicacion/publicacion.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (31, NULL, 'AreaNotificacion', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (32, NULL, 'PaginaBandejaNotificacion', '/faces/notificacion/bandejaNotificacion.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (33, NULL, 'AreaImpresionesTitulo', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (34, NULL, 'PaginaBandejaImpresionesTitulo', '/faces/usuarioInterno/bandeja.xhtml?req=IMTI', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (35, NULL, 'AreaEntrega', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (36, NULL, 'PaginaBandejaEntrega', '/faces/usuarioInterno/bandeja.xhtml?req=ENT', TRUE, now(), @IdUsuario, now());
#sescobar 30012015 (Configuracion de Navegacion Flujo Cambio de Direccion)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (37, 3, 'Modificacion Direccion', '/faces/modificacion/formularioModificacionDireccion.xhtml', TRUE, now(), @IdUsuario, now());
#evalero  17042015 (Creacion de parametricas para renovación en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (38, NULL, 'Plantilla Renovacion', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=RENO', TRUE, now(), @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para modificacion de nombre en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (39, NULL, 'Plantilla Modificacion de Nombre', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=CNOM', TRUE, now(), @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para modificacion de direccion en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (40, NULL, 'Plantilla Modificacion de Direccion', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=CDIR', TRUE, now(), @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para transferencia en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (41, NULL, 'Plantilla Transferencia', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=TRAN', TRUE, now(), @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para fusión en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (42, NULL, 'Plantilla Fusión', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=FUSI', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para licencias de uso en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (43, NULL, 'Plantilla Licencia de Uso', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=LU', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para Infraccion en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (44, NULL, 'Plantilla Infraccion', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=INF', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para Recursos Administrativos en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (45, NULL, 'Plantilla Recursos Administrativos', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=RECA', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para Nulidad y Cancelacion en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (46, NULL, 'Plantilla Nulidad y Cancelacion', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=NUL', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para Oposicion en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (47, NULL, 'Plantilla Oposicion', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=OPO', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para Registro de Patentes en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (48, NULL, 'Plantilla Registro de Patentes', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=REGP', TRUE, now(), @IdUsuario, now());
#evalero  21042015 (Creacion de parametricas para Registro de Derechos de Autor en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (49, NULL, 'Plantilla Registro de Derechos de Autor', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=REGD', TRUE, now(), @IdUsuario, now());
#evalero  22042015 (Creacion de parametricas para Registro de Derechos de Autor en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (50, NULL, 'PaginaSolicitudRegistroNombreComercialRotulosYEnseñas', '/solicitudGeneral/solicitudGeneralMenu.xhtml', TRUE, now(), @IdUsuario, now());
#evalero  28042015 (Creacion de parametricas para Registro de Derechos de Autor en pagina y menu)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (51, NULL, 'PaginaSolicitudLemaComercial', '/solicitudLemaComercial/datosLemaComercial.xhtml', TRUE, now(), @IdUsuario, now());
#evalero  29042015 (Pagina para realizar la insercion de Registro de Preferencias Lema Comercial)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (52, NULL, 'Registro Preferencias Lema Comercial', '/solicitudLemaComercial/prioridadRegistroLema.xhtml', TRUE, now(), @IdUsuario, now());
#evalero  20052015 (Pagina para realizar la insercion de Registro de Otros)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (53, NULL, 'Plantilla Registro Otros', '/faces/ventanilla/solicitud/plantillarecepcion.xhtml?req=OTRO', TRUE, now(), @IdUsuario, now());
#evalero  08062015 (Paginas para los usuarios responsables)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (54, NULL, 'Pagina  Responsables', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (55, NULL, 'HistorialTramite', '/faces/examenDeFondo/responsables/buscarTramiteHistorialResponsable.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 10062015 (pagina para los usuarios responsables)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (56, NULL, 'BandejaResponsable', '/faces/usuarioInterno/bandejaResponsables.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 15062015 (pagina para flujo de Nombre)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (57, NULL, 'Modificar Datos', '/faces/modificacion/formularioModificacionNombre.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 29062015 (pagina para agregar el item de impresion de Entregas en el rol de Entrega)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (58, NULL, 'Impresión de Entregas', '/faces/entregaDocumentos/impresionEntregaDocumentos.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 03072015 (pagina para agregar el item de Solicitud de Deposito de Solicitud de Deposito de Nombre Comercial, Rótulos y Enseñas)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (59, 15, 'Solicitud de Deposito de Solicitud de Deposito de NC, Rótulos y Enseñas', '/faces/solicitudDepositoDeNombreComercialRotulo/depositoDeNombreComercialRotulo.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 03072015 (pagina para agregar el item de FlujoPagina Datos de Nombre Comercial)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (60, NULL, 'Datos de Nombre Comercial, Rótulos o Enseñas', '/faces/solicitudDepositoDeNombreComercialRotulo/depositoDeNombreComercialRotulo.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 28072015 (pagina para realizar el registro de Datos de Uso Comercial)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (61, NULL, 'Datos de Licenciatario', '/faces//modificacion/licenciasDeUso/licenciasDeUso.xhtml', TRUE, now(), @IdUsuario, now());
#evalero 28072015 (pagina relacionado con el rol de reportes)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (62, NULL, 'Seguimiento', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (63, NULL, 'ReporteEtapa', '/faces/seguimiento/reporEtapa.xhtml', TRUE, now(), @IdUsuario, now());
#evalero Fechas de Produccion (pagina relacionado con el rol de reportes)
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (64, NULL, 'ReporteBusquedas', '/faces/busqueda/bandejaBusqueda.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (65, NULL, 'ReporteBusquedasBasica', '/faces/busqueda/bandejaBusquedaMarcaClase.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (66, 4, 'Solicitud de Renovaciones', '/faces/renovacion/solicitudRenovacion.xhtml',TRUE,now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (67, 4, 'Solicitud de Renovaciones', '/faces/renovacion/busquedaRenovacion.xhtml',TRUE,now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (68, NULL, 'AreaRenovacion', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (69, NULL, 'ExamenRenovacion', '/faces/ventanilla/solicitud/busquedaTramiteSolicitud.xhtml', TRUE, now(), @IdUsuario, now());

INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (70, NULL, 'AreaModificacion', '', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES (71, NULL, 'ExamenModificacion', '/faces/examenModificacion/busquedaExamenModificacion.xhtml', TRUE, now(), @IdUsuario, now());
INSERT INTO Pagina(IdPagina, IdFlujo, Nombre, RutaNavegacion, Activo, FechaCreacion, Usuario, FechaUltimaModificacion)VALUES(72, 11, 'Solicitud de Oposicion', '/faces/oposiciones/solicitudOposicion.xhtml', TRUE, now(),@IdUsuario,now());

#Menu
select 'Menu';
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(1, 1, 'es', NULL, 'MENUEXT', ' *** Formularios de Solicitud', ' *** Formularios de Solicitud', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(2, 1, 'en', NULL, 'MENUEXT', ' *** Application forms', ' *** Application forms', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(3, 2, 'es', 1, 'NULL', 'Bandeja', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(4, 2, 'en', 2, 'NULL', 'Inbox', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(5, 3, 'es', 1, 'NULL', 'Formularios Signos y Marcas', 'Formularios Signos y Marcas', 0, 2, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(6, 3, 'en', 2, 'NULL', 'Form Sign and Mark', 'Form Sign and Mark', 0, 2, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(7, 4, 'es', 5, 'NULL', 'Solicitud de Registro de Signo Distintivo (PI-100)', 'Solicitud de Registro de Signo Distintivo (PI-100)', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(8, 4, 'en', 6, 'NULL', 'Request of Register of Sign and Mark (PI-100)', 'Request of Register of Sign and Mark (PI-100)', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(9, 5, 'es', 5, 'NULL', 'Solicitud de Registro de Lema Comercial (PI 102)', 'Solicitud de Registro de Lema Comercial (PI-102)', 0, 3, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(10, 5, 'en', 6, 'NULL', 'Request of Register of Advertising Slogan (PI 102)', 'Request of Register of Advertising Slogan (PI-102)', 0, 3, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(11, 6, 'es', NULL, 'MENUVEN', 'Ventanilla', 'Ventanilla', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(12, 6, 'en', NULL, 'MENUVEN', 'Reception', 'Reception', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(13, 7, 'es', 11, 'NULL', 'Ingreso tramite', 'Ingreso tramite', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(14, 7, 'en', 12, 'NULL', 'Processed income', 'Processed income', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(15, 8, 'es', NULL, 'MENUSIG', 'Examen de Forma', 'Examen de Forma', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(16, 8, 'en', NULL, 'MENUSIG', 'Examination Form', 'Examination Form', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(17, 9, 'es', 15, 'NULL', 'Examen de Forma', 'Examen de Forma', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(18, 9, 'en', 16, 'NULL', 'Test of form', 'Test of form', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(19, 8, 'es', NULL, 'MENUDAU', 'Derechos de Autor', 'Derechos de Autor', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(20, 8, 'en', NULL, 'MENUDAU', 'Right Autor', 'Right Autor', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(21, 9, 'es', 19, 'NULL', 'Bandeja', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(22, 9, 'en', 20, 'NULL', 'Inbox', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(23, 10, 'es', NULL, 'MENUDAU', 'Patentes', 'Patentes', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(24, 10, 'en', NULL, 'MENUDAU', 'Patent', 'Patent', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(25, 11, 'es', 23, 'NULL', 'Bandeja', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(26, 11, 'en', 24, 'NULL', 'Inbox', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(27, 14, 'es', NULL, 'MENUEXFON', 'Examen de Fondo', 'Examen de Fondo', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(28, 14, 'en', NULL, 'MENUEXFON', 'Fondus Exam', 'Fondus Exam', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(29, 15, 'es', 27, 'NULL', 'Bandeja', 'Bandeja', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(30, 15, 'en', 28, 'NULL', 'Inbox', 'Inbox', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(31, 16, 'es', 0, 'MENUMODEXT', 'Modificaciones', 'Modificaciones', 0, 4, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(32, 16, 'en', 0, 'MENUMODEXT', 'Modification', 'Modification', 0, 4, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(33, 17, 'es', 5, 'MENUMODEXT', 'Solicitud de Modificación de Registro (PI-103)', 'Solicitud de Modificación de Registro (PI-103)', 0, 4, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(34, 17, 'en', 6, 'MENUMODEXT', 'Record Change Request (PI-103)', 'Record Change Request (PI-103)', 0, 4, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(35, 18, 'es', NULL, 'MENURECA', 'Recaudaciones', 'Recaudaciones', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(36, 18, 'en', NULL, 'MENURECA', 'Collections', 'Collections', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(37, 19, 'es', 35, 'NULL', 'Dosificación', 'Dosificación', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(38, 19, 'en', 36, 'NULL', 'Dosage', 'Dosage', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(39, 20, 'es', 35, 'NULL', 'Canje Depósito', 'Canje Depósito', 1, 2, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(40, 20, 'en', 36, 'NULL', 'Value swap', 'Value swap', 1, 2, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(41, 21, 'es', NULL, 'MENUDIG', 'Digitalización', 'Digitalización', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(42, 21, 'en', NULL, 'MENUDIG', 'Digitalización', 'Digitalización', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(43, 22, 'es', 41, 'NULL', 'Digitalizar documentos', 'Digitalizar documentos', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(44, 22, 'en', 42, 'NULL', 'Scan documents', 'Scan documents', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero 26012015 Agregar las demas etapas
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(45, 29, 'es', NULL, 'MENUPUB', 'Publicación', 'Publicación', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(46, 29, 'en', NULL, 'MENUPUB', 'Publish', 'Publish', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(47, 30, 'es', 45, 'NULL', 'Bandeja', 'Bandeja', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(48, 30, 'en', 46, 'NULL', 'Inbox', 'Inbox', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(49, 31, 'es', NULL, 'MENUNOT', 'Notificación', 'Notificación', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(50, 31, 'en', NULL, 'MENUNOT', 'Notify', 'Notify', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(51, 32, 'es', 49, 'NULL', 'Bandeja', 'Bandeja', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(52, 32, 'en', 50, 'NULL', 'Inbox', 'Inbox', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(53, 33, 'es', NULL, 'MENUIMPTIT', 'Impresiones Titulo', 'Impresiones Titulo', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(54, 33, 'en', NULL, 'MENUIMPTIT', 'Poster title', 'Poster title', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(55, 34, 'es', 53, 'NULL', 'Bandeja', 'Bandeja', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(56, 34, 'en', 54, 'NULL', 'Inbox', 'Inbox', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(57, 35, 'es', NULL, 'MENUENT', 'Entrega Documentos', 'Entrega Documentos', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(58, 35, 'en', NULL, 'MENUENT', 'Delivery Documents', 'Delivery Documents', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(59, 36, 'es', 57, 'NULL', 'Bandeja', 'Bandeja', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(60, 36, 'en', 58, 'NULL', 'Inbox', 'Inbox', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  17042015 (Creacion de parametricas para renovación en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(61, 38, 'es', 11, 'NULL', 'Renovación', 'Renovación', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(62, 38, 'en', 12, 'NULL', 'Renovation', 'Renovation', 1, 1, FALSE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para modificacion de nombre en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(63, 39, 'es', 11, 'NULL', 'Modificación de Nombre', 'Modificación de Nombre', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(64, 39, 'en', 12, 'NULL', 'Name Modification', 'Name Modification', 1, 1, FALSE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para modificacion de direccion en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(65, 40, 'es', 11, 'NULL', 'Modificación de Dirección', 'Modificación de Dirección', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(66, 40, 'en', 12, 'NULL', 'Adress Modification', 'Adress Modification', 1, 1, FALSE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para transferencia en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(67, 41, 'es', 11, 'NULL', 'Transferencia', 'Transferencia', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(68, 41, 'en', 12, 'NULL', 'Transfer', 'Transfer', 1, 1, FALSE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para fusión en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(69, 42, 'es', 11, 'NULL', 'Fusión', 'Fusión', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(70, 42, 'en', 12, 'NULL', 'Fusion', 'Fusion', 1, 1, FALSE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para licencias de uso en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(71, 43, 'es', 11, 'NULL', 'Licencia de Uso', 'Licencia de Uso', 1, 1, FALSE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(72, 43, 'en', 12, 'NULL', 'Licence', 'Licence', 1, 1, FALSE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para Infracción en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(73, 44, 'es', 11, 'NULL', 'Infracción', 'Infracción', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(74, 44, 'en', 12, 'NULL', 'Infraction', 'Infraction', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para Recursos Administrativos en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(75, 45, 'es', 11, 'NULL', 'Recursos Administrativos', 'Recursos Administrativos', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(76, 45, 'en', 12, 'NULL', 'Administrative Resources', 'Administrative Resources', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para Nulidad y Cancelacion en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(77, 46, 'es', 11, 'NULL', 'Nulidad y Cancelacion', 'Nulidad y Cancelacion', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(78, 46, 'en', 12, 'NULL', 'Nullity and Cancellation', 'Nullity and Cancellation', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para Oposicion en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(79, 47, 'es', 11, 'NULL', 'Oposición', 'Oposición', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(80, 47, 'en', 12, 'NULL', 'Oposition', 'Oposition', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para Registro de Patentes en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(81, 48, 'es', 11, 'NULL', 'Registro de Patentes', 'Registro de Patentes', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(82, 48, 'en', 12, 'NULL', 'Patent Register', 'Patent Register', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  20042015 (Creacion de parametricas para Registro de Derechos de Autor en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(83, 49, 'es', 11, 'NULL', 'Registro de Derechos de Autor', 'Registro de Derechos de Autor', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(84, 49, 'en', 12, 'NULL', 'Register of Copyrights', 'Register of Copyrights', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  22042015 (Creacion de parametricas para Registro de Nombre Comercial Rótulos y Enseñas)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(85, 50, 'es', 0, 'NULL', 'Registro de Solicitud de Depósito de Nombre Comercial Rótulos o Enseñas', 'Registro de Nombre Comercial Rótulos y Enseñas', 1, 3, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(86, 50, 'en', 0, 'NULL', 'Business Name Registration Signs or Ensigns', 'Business Name Registration Signs or Ensigns', 1, 3, TRUE, TRUE, @IdUsuario, now());
#evalero  20052015 (Creacion de parametricas para Registro de Otros en pagina y menu)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(87, 53, 'es', 11, 'NULL', 'Otros Tramites', 'Otros Tramites', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(88, 53, 'en', 12, 'NULL', 'Other Documents', 'Other Documents', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  08062015 (Menus raiz y menu Ver historial tramite para los usuarios responsables)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(89, 54, 'es', NULL, NULL, 'Menu Responsables', 'Menu Responsables', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(90, 54, 'en', NULL, NULL, 'Responsible Menu', 'Responsible Menu', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(91, 55, 'es', 89, NULL, 'Ver historial tramite', 'Ver historial tramite', 1, 2, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(92, 55, 'en', 90, NULL, 'View History processed', 'View History processed', 1, 2, TRUE, TRUE, @IdUsuario, now());
#evalero 10062015 (Menu bandeja para los usuarios responsables)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(93, 56, 'es', 89, NULL, 'Bandeja Responsable', 'Bandeja Responsable', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(94, 56, 'en', 90, NULL, 'Responsible tray', 'Responsible tray', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero 10062015 (Menu bandeja para el item impresion Titulos del Rol de Entrega)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(95, 58, 'es', 57, NULL, 'Impresión de Entregas', 'Impresión de Entregas', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(96, 58, 'en', 58, NULL, 'Printing Delivery', 'Printing Delivery', 1, 1, TRUE, TRUE, @IdUsuario, now());
#evalero 10062015 (Menu bandeja para el item de Solicitud de Deposito de Solicitud de Deposito de Nombre Comercial, Rótulos y Enseñas)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(97, 59, 'es', 5, NULL, 'Solicitud de Registro de Nombre Comercial, Rotulo Comercial, Enseñas (PI-101)', 'Solicitud de Registro de Nombre Comercial, Rotulo Comercial, Enseñas (PI-101)', 1, 2, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(98, 59, 'en', 6, NULL, 'Application for Registration of commercial name, Commercial, Ensigns (PI-101)', 'Application for Registration of commercial name, Commercial, Ensigns (PI-101)', 1, 2, TRUE, TRUE, @IdUsuario, now());
#evalero 10062015 (Menu para el rol de Seguimiento)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(99, 62, 'es', NULL, 'MENUSEG', 'Seguimiento', 'Seguimiento', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(100, 62, 'en', NULL, 'MENUSEG', 'Follow up', 'Follow up', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(101, 63, 'es', 99, NULL, 'Reporte por etapa', 'Reporte por etapa', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(102, 63, 'en', 100, NULL, 'Report by stage', 'Report by stage', 0, 1, TRUE, TRUE, @IdUsuario, now());
#evalero  (Menu para el rol de Seguimiento)
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(103, 64, 'es', 89, NULL, 'Búsqueda', 'Búsqueda',1,3,TRUE, TRUE,@IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(104, 64, 'en', 90, NULL, 'Find', 'Find',1,3,TRUE, TRUE,@IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(105, 65, 'es', 89, NULL, 'Búsqueda Marca Clase', 'Búsqueda Marca Clase',1,4,TRUE, TRUE,@IdUsuario, now());
INSERT INTO Menu (IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(106, 65, 'en', 90, NULL, 'Find Mark Class', 'Find Mark Class',1,4,TRUE, TRUE,@IdUsuario, now());
#evalero  (Menu para la renovacion)
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(107, 67, 'es',5, NULL, 'Solicitud de Renovaciones (PI-104)', 'Solicitud de Renovaciones (PI-104)', 1, 5, TRUE, TRUE,@IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(108, 67, 'en',6, NULL, 'Request Renewals (PI-104)', 'Request Renewals (PI-104)', 1, 5, TRUE, TRUE,@IdUsuario, now());
#evalero  (Menu para la renovacion)
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(109, 68, 'es', NULL, NULL, 'Menu Renovacion', 'Menu Renovacion', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(110, 68, 'en', NULL, NULL, 'Menu Renovation', 'Menu Renovation', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(111, 69, 'es', 109, NULL, 'Examen Renovacion', 'Menu Renovacion', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(112, 69, 'en', 110, NULL, 'Test Renovation', 'Test Renovation', 1, 1, TRUE, TRUE, @IdUsuario, now());

INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(113, 70, 'es', NULL, NULL, 'Menu modificación', 'Menu modificación', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(114, 70, 'en', NULL, NULL, 'Menu modification', 'Menu modification', 0, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(115, 71, 'es', 113, NULL, 'Examen modificación', 'Examen modificación', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion) VALUES(116, 71, 'en', 114, NULL, 'Test modificacion', 'Test modificacion', 1, 1, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion)VALUES(117, 72, 'es', 5,NULL, 'Demanda de Oposición', 'Solicitud de Oposición', 1, 5, TRUE, TRUE, @IdUsuario, now());
INSERT INTO Menu(IdMenu, IdPagina, Idioma, IdMenuPadre, Codigo, Nombre, Descripcion, Nivel, Orden, Vigente, Visible, Usuario, FechaUltimaModificacion)VALUES(118, 72, 'en', 6,NULL, 'Oppositions Demand', 'Application for opposition', 1, 5, TRUE, TRUE, @IdUsuario, now());


select 'Rol';
#Rol
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(1, 'UEXT', 'Usuario Externo', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(2, 'VENT', 'Técnico Ventanilla', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(3, 'TDIG', 'Técnico Digitalizador', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(4, 'TREC', 'Técnico de Recaudaciones', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(5, 'TEXF', 'Técnico Examen de Forma', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(6, 'RSDT', 'Responsable de Signos Distintivos', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(7, 'DPI', 'Director de Propiedad Industrial', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(8, 'TNOT', 'Técnico de Notificacion', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(9, 'TPUB', 'Técnico de Publicacion', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(10, 'RPUB', 'Responsable de Publicacion', false, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(11, 'TREN', 'Técnico de Renovacion', false, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(12, 'TEFO', 'Técnico Examen de Fondo', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(13, 'TENT', 'Técnico de Entrega de Documentos', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(14, 'TIMT', 'Técnico de Impresión de Títulos', true, now(), @IdUsuario, now());
#evalero 12082015 agregar el Rol de Tecnico Seguimiento
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(15, 'TSEG', 'Técnico de Seguimiento', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(16, 'TECN', 'Técnico de Cambio de Nombre', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(17, 'TECD', 'Técnico de Cambio de Domicilio', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(18, 'TETR', 'Técnico de Transferencias', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(19, 'TEFU', 'Técnico de Fusión', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(20, 'TELU', 'Técnico de Licencias de Uso', true, now(), @IdUsuario, now());
INSERT INTO Rol(IdRol, Codigo, Nombre, Estado, FechaCreacion, Usuario, FechaUltimaModificacion) VALUES(21, 'TMOD', 'Técnico de Modificación', true, now(), @IdUsuario, now());



#RolMenu
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(1, 1, 1, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(2, 1, 2, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(3, 2, 11, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(4, 2, 12, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(5, 5, 15, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(6, 5, 16, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(7, 12, 27, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(8, 12, 28, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(9, 4, 35, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(10, 4, 36, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(11, 3, 41, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(12, 3, 42, TRUE, @IdUsuario, now());
#revalero 26012015 Agregar roles de publicacion notificacion, entrega documentos e impresión titulos
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(13, 9, 45, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(14, 9, 46, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(15, 8, 49, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(16, 8, 50, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(17, 14, 53, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(18, 14, 54, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(19, 13, 57, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(20, 13, 58, TRUE, @IdUsuario, now());
#evalero  08062015 (RolMenu para el usuario rquisbert)
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(21, 6, 89, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(22, 6, 90, TRUE, @IdUsuario, now());
#evalero  08062015 (RolMenu para el usuario jdaza)
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(23, 7, 89, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(24, 7, 90, TRUE, @IdUsuario, now());
#evalero  12082015 (RolMenu para seguimiento y el tecnico de seguimiento)
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(25, 15, 99, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(26, 15, 100, TRUE, @IdUsuario, now());

INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(27, 11, 109, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(28, 11, 110, TRUE, @IdUsuario, now());

INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(29, 21, 113, TRUE, @IdUsuario, now());
INSERT INTO RolMenu(IdRolMenu, IdRol, IdMenu, Vigente, Usuario, FechaUltimaModificacion) VALUES(30, 21, 114, TRUE, @IdUsuario, now());

#Correlativo


INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (1,'Tramite',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (2,'Decreto',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (3,'NumeroTitulo',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (4,'NumeroPublicacion',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (5,'NumeroResolucion',1,0, NULL, '-', @IdUsuario, now());



#Tablas relacionadas a la administración de Mensajes
select 'Mascara';

INSERT INTO Mascara
(IdMascara, TamanioNivel, Mascara, GrupoNivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario)
VALUES
(1, 6, '999.999.999.999.999.999','SIST', now(), 'AC', NULL,  @IdUsuario );

#Insercion de registros en Modulo
select 'Modulo';
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (1, 1, 0, '1.000.000.000.000.000', 'Comun', 6, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (2, 1, 0, '2.000.000.000.000.000', 'Administración de Entorno', 6, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (3, 1, 0, '3.000.000.000.000.000', 'Usuario Externo', 6, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (4, 1, 0, '4.000.000.000.000.000', 'Ventanilla', 6, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (5, 1, 0, '5.000.000.000.000.000', 'Examen de Forma', 6, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (6, 1, 0, '6.000.000.000.000.000', 'Examen de Fondo', 6, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (7, 1, 1, '1.001.000.000.000.000', 'Administración de Mensajes', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (8, 1, 1, '1.002.000.000.000.000', 'Administración de logs Servidor', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (9, 1, 1, '1003.000.000.000.000', 'Administración de Errores', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (10, 1, 1, '1.004.000.000.000.000', 'Control de Flujo', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (11, 1, 2, '2.001.000.000.000.000', 'Autenticación', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (12, 1, 2, '2.002.000.000.000.000', 'Menus', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (13, 1, 2, '2.003.000.000.000.000', 'Administracion de Usuarios', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (14, 1, 2, '2.004.000.000.000.000', 'Registro de Usuario', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (15, 1, 3, '3.001.000.000.000.000', 'Bandeja Tramites Solicitud', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (16, 1, 3, '3.002.000.000.000.000', 'Bandeja Tramites Proceso', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (17, 1, 3, '3.003.000.000.000.000', 'Solicitudes', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (18, 1, 4, '4.001.000.000.000.000', 'Bandeja Ventanilla', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (19, 1, 4, '4.002.000.000.000.000', 'Recepcion Documentos', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (20, 1, 5, '5.001.000.000.000.000', 'Bandeja Examen de Forma', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (21, 1, 5, '5.002.000.000.000.000', 'Examen de Forma', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (22, 1, 6, '6.001.000.000.000.000', 'Bandeja Examen de Fondo', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (23, 1, 6, '6.002.000.000.000.000', 'Analisis de Registrabilidad', 5, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (24, 1, 17, '3.003.001.000.000.000', 'Registro Solicitante Tramite', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (25, 1, 17, '3.003.002.000.000.000', 'Registro Apoderado Tramite', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (26, 1, 17, '3.003.003.000.000.000', 'Registro de Signo Distintivo', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (27, 1, 17, '3.003.004.000.000.000', 'Registro Prioridad', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (28, 1, 17, '3.003.005.000.000.000', 'Registro Direccion Notificacion', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (29, 1, 23, '6.002.001.000.000.000', 'Analisis de Registrabilidad', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (30, 1, 23, '6.002.002.000.000.000', 'Relacion de Registros Existentes', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (31, 1, 23, '6.002.003.000.000.000', 'Analisis de Denominaciones', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (32, 1, 23, '6.002.004.000.000.000', 'Analisis de Confundibilidad', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (33, 1, 23, '6.002.005.000.000.000', 'Conclusion', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (34, 1, 23, '6.002.006.000.000.000', 'Analisis de Conexión Competitiva', 4, now(), 'AC', now(), @IdUsuario);
INSERT INTO Modulo(IdModulo, IdMascara, IdPadreModulo, CodigoModulo, Descripcion, Nivel, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) VALUES (35, 1, 23, '6.002.007.000.000.000', 'Análisis de Imágenes 3D', 4, now(), 'AC', now(), @IdUsuario);


/** Insercion de mensajes al MensajeAplicacion
Fecha: Martes 26 Noviembre del 2014
*/
select 'MensajeAplicacion';
insert into MensajeAplicacion (IdModulo, Orden, Idioma, Descripcion, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) values (30, 1, 'es', 'El codigo SM introducido es el mismo que se esta solicitando', now(), 'AC', now(), @IdUsuario);
insert into MensajeAplicacion (IdModulo, Orden, Idioma, Descripcion, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) values (30, 2,     'es', 'El codigo SM, no existe en la Base de Datos', now(), 'AC', now(), @IdUsuario);
insert into MensajeAplicacion (IdModulo, Orden, Idioma, Descripcion, FechaCreacion, Estado, FechaUltimaModificacion, Usuario) values (30, 3, 'es', 'El tramite asociado a este codigo SM no esta vigente, sin embargo existe el SM', now(), 'AC', now(), @IdUsuario);

select 'Flujo';

#Parametricas evalero 05092014
#Tablas Flujo FlujoEtapa
set @IdFlujo = 1;

INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (1, 'Registro de Signos Distintivos', true, now(), NULL, 'MA', 'REGS', @IdUsuario, now());
#evalero Agregar el flujo Modificacion 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (2, 'Modificaciones de Signos Distintivos', true, now(), NULL, 'MA', 'MODI', @IdUsuario, now());
#evalero Agregar el flujo Cambio de Nombre 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (3, 'Cambio de Nombre', true, now(), NULL, 'MA', 'CANO', @IdUsuario, now());
#evalero  Agregar el flujo Renovacion de Registro 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (4, 'Renovación de Registro', true, now(), NULL, 'MA', 'RENO', @IdUsuario, now());
#evalero  Agregar el flujo Cambio de Domicilio 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (5, 'Cambio de Domicilio', true, now(), NULL, 'MA', 'CADO', @IdUsuario, now());
#evalero  Agregar el flujo Transferencia 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (6, 'Transferencia', true, now(), NULL, 'MA', 'CATR', @IdUsuario, now());
#evalero  Agregar el flujo Fusion 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (7, 'Fusión', true, now(), NULL, 'MA', 'CAFU', @IdUsuario, now());
#evalero  Agregar el flujo Licencia de Uso 09122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (8, 'Licencia de Uso', true, now(), NULL, 'MA', 'CALU', @IdUsuario, now());
#evalero  Agregar el flujo de Recurso Administrativo 21042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (9, 'Recursos Administrativos', true, now(), NULL, 'MA', 'RECA', @IdUsuario, now());
#evalero  Agregar el flujo de Nulidad y Cancelacion 21042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (10, 'Nulidad y Cancelacion', true, now(), NULL, 'MA', 'NUL', @IdUsuario, now());
#evalero  Agregar el flujo de Oposicion 21042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (11, 'Demanda de Oposiciones', true, now(), NULL, 'MA', 'OPO', @IdUsuario, now());
#evalero  Agregar el flujo de Patentes 21042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (12, 'Registro de Patentes', true, now(), NULL, 'MA', 'REGP', @IdUsuario, now());
#evalero  Agregar el flujo de Derechos de Autor 21042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (13, 'Registro de Derechos de Autor', true, now(), NULL, 'MA', 'REGD', @IdUsuario, now());
#evalero  Agregar el flujo de Lema Comercial 22042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (14, 'Registro de Lema Comercial', true, now(), NULL, 'MA', 'RELC', @IdUsuario, now());
#evalero  Agregar el flujo de depósito de nombre comercial rótulos y enseñas 22042015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (15, 'Registro de Depósito de Nombre Comercial, rótulos y enseñas', true, now(), NULL, 'MA', 'RDNC', @IdUsuario, now());
#evalero  Agregar el flujo de depósito de infracción 14122015
INSERT INTO Flujo(IdFlujo, NombreFlujo, Vigente, FechaInicio, FechaFin, AreaTramite, TipoTramite, Usuario, FechaUltimaModificacion) VALUES (16, 'Infracción', true, now(), NULL, 'MA', 'INF', @IdUsuario, now());


select 'FlujoEtapa Registro de Signo Distintivo';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(1, 1, 2, 10, 'VEN', 0, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(2, 1, 4, 20, 'RECA', 1, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(3, 1, 3, 30, 'DIG', 0, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(4, 1, 5, 40, 'EXFM', 14, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(5, 1, 9, 50, 'PUBL', 45, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(6, 1, 12, 60, 'EXFF', 100, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', TRUE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(7, 1, 8, 70, 'NOT', 5, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(8, 1, 14, 80, 'IMTI', 10, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(9, 1, 13, 90, 'ENT', 365, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(10, 1, 5, 10, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(11, 1, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(12, 1, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(13, 1, 5, 40, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(14, 1, 5, 10, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(15, 1, 6, 20, 'REV1', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(16, 1, 7, 30, 'REV2', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(17, 1, 5, 40, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 4, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(18, 1, 5, 10, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(19, 1, 6, 20, 'REV1', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(20, 1, 7, 30, 'REV2', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(22, 1, 5, 10, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(23, 1, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(24, 1, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(25, 1, 5, 40, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 6, 'OBS', FALSE, TRUE, @IdUsuario, now());

#evalero 14012015 Etapas para el Flujo Modificacion
select 'FlujoEtapa Modificación';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(26, 2, 2, 10, 'VEN', 0, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(27, 2, 4, 20, 'RECA', 1, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(28, 2, 3, 30, 'DIG', 0, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(29, 2, 5, 40, 'EXFM', 14, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(30, 2, 9, 50, 'PUBL', 45, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(31, 2, 12, 60, 'EXFF', 100, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(32, 2, 8, 70, 'NOT', 5, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(33, 2, 14, 80, 'IMTI', 10, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(34, 2, 13, 90, 'ENT', 365, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 14012015 Etapas para el Flujo Cambio de Nombre
select 'FlujoEtapa Cambio de Nombre';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(35, 3, 2, 10, 'VEN', 0, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(36, 3, 4, 20, 'RECA', 1, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(37, 3, 3, 30, 'DIG', 0, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(38, 3, 5, 40, 'EXCN', 14, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(39, 3, 9, 50, 'PUBL', 45, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(40, 3, 12, 60, 'EXFF', 100, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(41, 3, 8, 70, 'NOT', 5, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(42, 3, 14, 80, 'IMTI', 10, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(43, 3, 13, 90, 'ENT', 365, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 17042015 Etapas para el Flujo Renovación de Registro
select 'FlujoEtapa Renovación de Registro';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(44, 4, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(45, 4, 4, 20, 'RECA', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(46, 4, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(47, 4, 5, 40, 'EXRE', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(48, 4, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(49, 4, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(50, 4, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(51, 4, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(52, 4, 13, 90, 'ENT', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Cambio de Domicilio
select 'FlujoEtapa Cambio de Domicilio';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(53, 5, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(54, 5, 4, 20, 'RECA', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(55, 5, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(56, 5, 5, 40, 'EXCD', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(57, 5, 9, 50, 'PUBL', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(58, 5, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(59, 5, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(60, 5, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(61, 5, 13, 90, 'ENT', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Transferencia
select 'FlujoEtapa Transferencia';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(62, 6, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(63, 6, 4, 20, 'RECA', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(64, 6, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(65, 6, 5, 40, 'EXTR', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(66, 6, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(67, 6, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(68, 6, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(69, 6, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(70, 6, 13, 90, 'ENT', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Fusión
select 'FlujoEtapa Cambio de Fusión';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(71, 7, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(72, 7, 4, 20, 'RECA', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(73, 7, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(74, 7, 5, 40, 'EXFU', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(75, 7, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(76, 7, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(77, 7, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(78, 7, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(79, 7, 13, 90, 'ENT', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Licencia de Uso
select 'FlujoEtapa Licencia de Uso';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(80, 8, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(81, 8, 4, 20, 'RECA', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(82, 8, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(83, 8, 5, 40, 'EXLU', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(84, 8, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(85, 8, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(86, 8, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(87, 8, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(88, 8, 13, 90, 'ENT', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Recursos Administrativos
select 'FlujoEtapa RecursosAdministrativos';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(89, 9, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(90, 9, 4, 20, 'RECA', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(91, 9, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(92, 9, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(93, 9, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(94, 9, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(95, 9, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(96, 9, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(97, 9, 13, 90, 'ENT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Nulidad y Cancelación
select 'FlujoEtapa Nulidad y Cancelación';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(98, 10, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(99, 10, 4, 20, 'RECA', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(100, 10, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(101, 10, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(102, 10, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(103, 10, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(104, 10, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(105, 10, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(106, 10, 13, 90, 'ENT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Oposicion
select 'FlujoEtapa Oposición';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(107, 11, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(108, 11, 4, 20, 'RECA', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(109, 11, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(110, 11, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(111, 11, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(112, 11, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(113, 11, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(114, 11, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(115, 11, 13, 90, 'ENT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Patentes
select 'FlujoEtapa Patentes';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(116, 12, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(117, 12, 4, 20, 'RECA', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(118, 12, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(119, 12, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(120, 12, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(121, 12, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(122, 12, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(123, 12, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(124, 12, 13, 90, 'ENT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
#evalero 20042015 Etapas para el Flujo Derechos de Autor
select 'FlujoEtapa Derechos de Autor';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(125, 13, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(126, 13, 4, 20, 'RECA', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(127, 13, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(128, 13, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(129, 13, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(130, 13, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(131, 13, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(132, 13, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(133, 13, 13, 90, 'ENT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());


select 'FlujoEtapa Lema Comercial';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(134, 14, 2, 10, 'VEN', 0, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(135, 14, 4, 20, 'RECA', 1, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(136, 14, 3, 30, 'DIG', 0, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(137, 14, 5, 40, 'EXFM', 14, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(138, 14, 9, 50, 'PUBL', 45, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(139, 14, 12, 60, 'EXFF', 100, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', TRUE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(140, 14, 8, 70, 'NOT', 5, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(141, 14, 14, 80, 'IMTI', 10, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(142, 14, 13, 90, 'ENT', 365, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(143, 14, 5, 10, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(144, 14, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(145, 14, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(146, 14, 5, 40, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(147, 14, 5, 10, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(148, 14, 6, 20, 'REV1', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(149, 14, 7, 30, 'REV2', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(150, 14, 5, 40, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 137, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(151, 14, 5, 10, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(152, 14, 6, 20, 'REV1', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(153, 14, 7, 30, 'REV2', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(154, 14, 5, 10, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(155, 14, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(156, 14, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(157, 14, 5, 40, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 139, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa Registro de Depósito de Nombre Comercial, rótulos o enseñas';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(158, 15, 2, 10, 'VEN', 0, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(159, 15, 4, 20, 'RECA', 1, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(160, 15, 3, 30, 'DIG', 0, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(161, 15, 5, 40, 'EXFM', 14, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(162, 15, 9, 50, 'PUBL', 45, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(163, 15, 12, 60, 'EXFF', 100, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', TRUE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(164, 15, 8, 70, 'NOT', 5, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(165, 15, 14, 80, 'IMTI', 10, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(166, 15, 13, 90, 'ENT', 365, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(167, 15, 5, 10, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(168, 15, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(169, 15, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(170, 15, 5, 40, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(171, 15, 5, 10, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(172, 15, 6, 20, 'REV1', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(173, 15, 7, 30, 'REV2', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(174, 15, 5, 40, 'EXFM', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 161, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(175, 15, 5, 10, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(176, 15, 6, 20, 'REV1', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(177, 15, 7, 30, 'REV2', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'REV', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(178, 15, 5, 10, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(179, 15, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(180, 15, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(181, 15, 5, 40, 'EXFF', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 163, 'OBS', FALSE, TRUE, @IdUsuario, now());


select 'FlujoEtapa para el submodulo de observaciones de Modificaciones de Signo Distintivo';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(182, 2, 5, 10, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 29, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(183, 2, 2, 20, 'VEN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 29, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(184, 2, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 29, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(185, 2, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 29, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa para el submodulo de observaciones de Cambio de Nombre';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(186, 3, 5, 10, 'EFCN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 38, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(187, 3, 2, 20, 'VEN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 38, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(188, 3, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 38, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(189, 3, 5, 40, 'EFCN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 38, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa para el submodulo de Renovaciones';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(190, 4, 5, 10, 'EFRE', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 47, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(191, 4, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 47, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(192, 4, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 47, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(193, 4, 5, 40, 'EFRE', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 47, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa para el submodulo de observaciones de Cambio de Domicilio';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(194, 5, 5, 10, 'EFCD', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 56, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(195, 5, 2, 20, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 56, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(196, 5, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 56, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(197, 5, 5, 40, 'EFCD', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 56, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa para el submodulo de observaciones de Cambio de Transferencia';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(198, 6, 5, 10, 'EXTR', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 65, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(199, 6, 2, 20, 'VEN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 65, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(200, 6, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 65, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(201, 6, 5, 40, 'EXTR', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 65, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa para el submodulo de observaciones de Fusión';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(202, 7, 5, 10, 'EXFU', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 74, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(203, 7, 2, 20, 'VEN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 74, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(204, 7, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 74, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(205, 7, 5, 40, 'EXFU', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 74, 'OBS', FALSE, TRUE, @IdUsuario, now());

select 'FlujoEtapa para el submodulo de observaciones de Licencias de Uso';

INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(206, 8, 5, 10, 'EXLU', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 83, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(207, 8, 2, 20, 'VEN', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 83, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(208, 8, 8, 30, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 83, 'OBS', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(209, 8, 5, 40, 'EXLU', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 83, 'OBS', FALSE, TRUE, @IdUsuario, now());


#evalero 14122015 Etapas para el Flujo Infracción
select 'FlujoEtapa Infracción';
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(210, 16, 2, 10, 'VEN', 30, 'dia', TRUE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(211, 16, 4, 20, 'RECA', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(212, 16, 3, 30, 'DIG', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(213, 16, 5, 40, 'EXFM', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(214, 16, 9, 50, 'PUBL', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(215, 16, 12, 60, 'EXFF', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(216, 16, 8, 70, 'NOT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(217, 16, 14, 80, 'IMTI', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());
INSERT INTO FlujoEtapa (idFlujoEtapa, IdFlujo, IdRol, Orden, EtapaTramite, Plazo, UnidadTiempo, Vigente, FechaInicio, FechaFin, Titulo, Pie, CodigoTramite, NombreTramite, Padre, EstadoEtapa, Revision, CrearNuevoAnalisis, Usuario, FechaUltimaModificacion) VALUES(218, 16, 13, 90, 'ENT', 30, 'dia', FALSE, now(), NULL, NULL, NULL, NULL, NULL, 0, 'ASIG', FALSE, TRUE, @IdUsuario, now());

#FlujoPagina
select 'FlujoPagina';
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (1, 1, 23, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (2, 1, 24, 2, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (3, 1, 25, 3, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (4, 1, 26, 4, 'NV', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (5, 1, 27, 5, 'AC', @IdUsuario, now());
#evalero 14012015 flujosPagina para Cambio de Nombre
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (6, 2, 28, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (7, 2, 57, 2, 'NV', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (8, 2, 24, 3, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (9, 2, 27, 4, 'AC', @IdUsuario, now());
#sescobar 30012015
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (10, 3, 28, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (11, 3, 37, 2, 'NV', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (12, 3, 24, 3, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (13, 3, 27, 4, 'AC', @IdUsuario, now());
#evalero 22042015
select 'FlujoPagina Lema Comercial';
# INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (14, 14, 23, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (15, 14, 24, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (16, 14, 51, 2, 'NV', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (17, 14, 52, 3, 'NV', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (18, 14, 27, 4, 'AC', @IdUsuario, now());
#evalero 22042015
select 'FlujoPagina de Nombre Comercial, rótulos o enseñas';
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (19, 15, 23, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (20, 15, 24, 2, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (21, 15, 60, 3, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (22, 15, 26, 4, 'NV', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujoPagina, IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (23, 15, 27, 5, 'AC', @IdUsuario, now());
#evalero 22042015 Parametricas para Licencias de Uso
select 'FlujoPagina de Licencias de Uso';
INSERT INTO  FlujoPagina(IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (7, 61, 1, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (7, 24, 2, 'AC', @IdUsuario, now());
INSERT INTO  FlujoPagina(IdFlujo, IdPagina, Orden, Estado, Usuario, FechaUltimaModificacion) VALUES (7, 27, 4, 'AC', @IdUsuario, now());



select 'Configuracion RequisitoFlujoVentanillaEForma';

INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MP', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de una Marca de Producto', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R010', 'MIN', now(), 10, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MP', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MP', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MS', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de una Marca de Producto', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R010', 'MIN', now(), 10, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MS', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MS', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'CER', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de una Marca de Certificación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R091', 'MIN', now(), 10, TRUE, 'Reglamento de uso de la marca', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R010', 'MIN', now(), 11, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'CER', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'CER', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'MC', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de Marca Colectiva', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R091', 'MIN', now(), 10, TRUE, 'Copia de los estatutos de la asociación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R092', 'MIN', now(), 11, TRUE, 'Lista de integrantes de la asociación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R093', 'MIN', now(), 12, TRUE, 'Condiciones y forma de uso de la marca colectiva', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R010', 'MIN', now(), 13, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'MC', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'MC', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'JUL1', 'OPC', now(), 4, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'PNR1', 'OPC', now(), 5, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'EUR1', 'OPC', now(), 6, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'PNA1', 'OPC', now(), 7, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 1, 'DOR', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de Denominación de Origen', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial por concepto de Solicitud de Declaración de Denominación de origen', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R091', 'MIN', now(), 10, TRUE, 'Lista de datos de los solicitantes, con demostración de legítimo interés', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R092', 'MIN', now(), 11, TRUE, 'Zona geográfica que se designa con su denominación de origen', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R093', 'MIN', now(), 12, TRUE, 'Listado de productos designados por la denominación de origen', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R094', 'MIN', now(), 13, TRUE, 'Reseña de calidades, u otras características esenciales de los productos', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R010', 'MIN', now(), 14, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 4, 'DOR', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'JUL1', 'OPC', now(), 2, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'PNR1', 'OPC', now(), 3, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'EUR1', 'OPC', now(), 4, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'PNA1', 'OPC', now(), 5, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 11, 'DOR', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 26, 'MODI', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 29, 'MODI', 'NULL', 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de cambio de Nombre del titular de la solicitud o registro de un signo distintivo o de una patente, en la cual se identifiquen los datos del solicitante y de la solicitud o del registro.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 29, 'MODI', 'NULL', 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 29, 'MODI', 'NULL', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de la Solicitud de Modificación respectiva.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 29, 'MODI', 'NULL', 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 29, 'MODI', 'NULL', 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Cambio de Nombre ante Notaria de Fe pública que acredite la Modificación que se desea (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 29, 'MODI', 'RMOD', 'MIN', now(), 5, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 183, 'MODI', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 35, 'CANO', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 38, 'CANO', 'NULL', 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de Cambio de Nombre del titular de la solicitud o registro de un signo distintivo o de una patente, en el cual se identifiquen los datos del solicitante y de la solicitud o del registro.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 38, 'CANO', 'NULL', 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 38, 'CANO', 'NULL', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de la Solicitud de Modificación respectiva.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 38, 'CANO', 'NULL', 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 38, 'CANO', 'NULL', 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Cambio de Nombre ante Notaria de Fe pública que acredite la Modificación que se desea (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 38, 'CANO', 'RMOD', 'MIN', now(), 6, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 187, 'CANO', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'FRS1', 'MIN', now(), 1, TRUE, 'Formulario de solicitud de Renovación de Registro, con un ejemplar', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Renovación de Registro, a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'SRS1', 'OPC', now(), 1, TRUE, 'Solicitud de Renovación mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'PNR1', 'OPC', now(), 2, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'PNA1', 'OPC', now(), 3, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 44, 'RENO', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 47, 'RENO', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de renovación de signo distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 47, 'RENO', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Renovación de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 47, 'RENO', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Renovación de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 47, 'RENO', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Renovación de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 47, 'RENO', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 47, 'RENO', 'R008', 'MIN', now(), 6, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'FRS1', 'MIN', now(), 1, TRUE, 'Formulario de solicitud de Renovación de Registro, con un ejemplar', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Renovación de Registro, a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'PNR1', 'MIN', now(), 3, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'SRS1', 'OPC', now(), 1, TRUE, 'Solicitud de Renovación mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'PNA1', 'OPC', now(), 2, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 191, 'RENO', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 53, 'CADO', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 56, 'CADO', 'NULL', 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de Cambio de Domicilio del titular de solicitud o registro de un signo distintivo o de una patente, en el cual se identifiquen los datos del solicitante y de la solicitud o registro respecto al cual se solicita la modificación.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 56, 'CADO', 'NULL', 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 56, 'CADO', 'NULL', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de Solicitud de Registro de Cambio de Domicilio, cuya suma este de acuerdo a la nacionalidad del solicitante del registro.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 56, 'CADO', 'NULL', 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 56, 'CADO', 'NULL', 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Cambio de Domicilio ante Notaria de Fe pública que acredite el Cambio de Domicilio del Titular de la solicitud o del registro sobre el cual se solicita la inscripción (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 56, 'CADO', 'RMOD', 'MIN', now(), 6, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 195, 'CADO', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 62, 'CATR', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'NULL', 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de Transferencia de solicitud o registro de un signo distintivo o patente, en el cual se identifiquen los datos del solicitante y de la solicitud o registro de un signo distintivo  respecto al cual se solicita la modificación.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'NULL', 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'NULL', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de Solicitud de Registro de Cambio de Transferencia, cuya suma este de acuerdo a la nacionalidad del solicitante del registro.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'NULL', 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'NULL', 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Transferencia ante Notaria de Fe pública que acredite la Transferencia de la solicitud o del registro sobre el cual se solicita la inscripción (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'NULL', 'MIN', now(), 6, TRUE, 'Formulario de Impuesto a la transferencia correspondiente al registro sobre el cual se solicita la inscripción.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 65, 'CATR', 'RMOD', 'MIN', now(), 7, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 199, 'CATR', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 71, 'CAFU', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 74, 'CAFU', 'NULL', 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de Fusión de solicitud o registro de un signo distintivo o patente, en el cual se identifiquen los datos del solicitante y de la solicitud o registro respecto al cual se solicita la modificación.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 74, 'CAFU', 'NULL', 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 74, 'CAFU', 'NULL', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de Solicitud de Fusión, cuya suma este de acuerdo a la nacionalidad del solicitante del registro.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 74, 'CAFU', 'NULL', 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 74, 'CAFU', 'NULL', 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Fusión ante Notaria de Fe pública que acredite la Fusión de la solicitud o del registro sobre el cual se solicita la inscripción (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 74, 'CAFU', 'RMOD', 'MIN', now(), 6, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 203, 'CAFU', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'SRS1', 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 80, 'CALU', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 83, 'CALU', 'NULL', 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de Licencia de Uso de la  solicitud o registro de un signo distintivo o patente, en el cual se identifiquen los datos del solicitante y de la solicitud o registro respecto al cual se solicita la modificación.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 83, 'CALU', 'NULL', 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 83, 'CALU', 'NULL', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de Solicitud de Licencia de Uso, cuya suma este de acuerdo a la nacionalidad del solicitante del registro.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 83, 'CALU', 'NULL', 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 83, 'CALU', 'NULL', 'MIN', now(), 5, TRUE, 'Testimonio protocolizado  ante Notaria de Fe pública que acredite la Licencia de Uso de la solicitud o del registro sobre el cual se solicita la inscripción que señale claramente la fecha de inicio y la fecha final de la licencia, además del nombre de la marca o invención, número de registro y la clase correspondiente (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 83, 'CALU', 'RMOD', 'MIN', now(), 6, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'SRS2', 'MIN', now(), 1, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'SRS1', 'OPC', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'PNR1', 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'EUR1', 'OPC', now(), 3, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'PNA1', 'OPC', now(), 4, TRUE, 'Persona Natural (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 207, 'CALU', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 134, 'LC', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de una Marca de Producto', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R010', 'MIN', now(), 10, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 137, 'LC', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 144, 'LC', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 158, 'RDNC', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R001', 'MIN', now(), 1, TRUE, 'Escrito de solicitud de registro de una Marca de Producto', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R002', 'MIN', now(), 2, TRUE, 'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R003', 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R004', 'MIN', now(), 4, TRUE, 'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R005', 'MIN', now(), 5, TRUE, 'Titulo respectivo acorde a la nacionalidad del solicitante', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R006', 'MIN', now(), 6, TRUE, 'Recibo original del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R007', 'MIN', now(), 7, TRUE, 'Fotocopia simple del depósito bancario para la publicación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R008', 'MIN', now(), 8, TRUE, 'Testimonio de poder de representación', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R009', 'MIN', now(), 9, TRUE, 'Documento que declare la veracidad de la Prioridad invocada', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R010', 'MIN', now(), 10, TRUE, 'Errores en el formulario de solicitud (Marque las secciones que tienen error)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R011', 'OPC', now(), 1, TRUE, 'Fotocopia del Numero de Identificación Tributaria', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R012', 'OPC', now(), 2, TRUE, 'Certificado de FUNDEMPRESA', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 161, 'RDNC', 'R013', 'OPC', now(), 3, TRUE, 'Testimonio de Constitución de la Empresa', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'FRS1', 'MIN', now(), 1, TRUE, 'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'PCS1', 'MIN', now(), 2, TRUE, 'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'PPG1', 'MIN', now(), 3, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia simple (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'SRS1', 'OPC', now(), 4, TRUE, 'La solicitud de registro de signos distintivos mediante nota o memorial', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'JUL1', 'OPC', now(), 5, TRUE, 'Juego de Logo 4x4 en tres ejemplares (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'PNR1', 'OPC', now(), 6, TRUE, 'Poderes necesarios en caso de representación (Testimonios) (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'EUR1', 'OPC', now(), 7, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'PNA1', 'OPC', now(), 8, TRUE, 'Persona Natural', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'FJ', 'ANE', now(), 1, TRUE, 'Numero Fojas', NULL, @IdUsuario, now());
INSERT INTO RequisitoFlujoVentanillaEForma ( IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion,Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) VALUES ( 168, 'RDNC', 'OBS', 'ANE', now(), 2, TRUE, 'Observaciones', NULL, @IdUsuario, now());


-- #evalero 17042015 Modificaciones RequisitoFlujoVentanillaEFormar para Renovación Ventanilla
-- select 'RequisitoFlujoVentanillaEForma para Renovación Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 4
--             and fe.EtapaTramite = 'VEN'
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La solicitud de Renovación de Registro mediante Nota o Memorial', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'El formulario de solicitud de Renovación de Registro, con un ejemplar (ver pagina web del SENAPI)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'La solicitud de Renovación de Registro mediante Nota o Memorial', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación (testimonios)', 'OrigenTestimonio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Persona Natural', 'FotOtro', @IdUsuario, now());

-- #evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Modificacion de Nombre Ventanilla
-- select 'RequisitoFlujoVentanillaEForma para Cambio de Nombre Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 2
--             and fe.EtapaTramite = 'VEN'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'SRS1', 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R002', 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PCS1', 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNR1', 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'EUR1', 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNA1', 'OPC', now(), 3, TRUE, 'Persona Natural', 'FotOtro', @IdUsuario, now());
-- 
-- #evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Modificacion de Direccion Ventanilla
-- select 'RequisitoFlujoVentanillaEForma para Modificacion de Direccion Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 3
--             and fe.EtapaTramite = 'VEN'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'SRS1', 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R002', 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PCS1', 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNR1', 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'EUR1', 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNA1', 'OPC', now(), 3, TRUE, 'Persona Natural', 'FotOtro', @IdUsuario, now());
-- 
-- #evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Transferencia
-- select 'RequisitoFlujoVentanillaEForma para Transferencia Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 5
--             and fe.EtapaTramite = 'VEN'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 3, TRUE, 'Persona Natural', 'FotOtro', @IdUsuario, now());
-- 
-- #evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Fusión Ventanilla
-- select 'RequisitoFlujoVentanillaEForma para Fusión Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 6
--             and fe.EtapaTramite = 'VEN'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 3, TRUE, 'Persona Natural', 'FotOtro', @IdUsuario, now());
-- 
-- #evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Licencia de Uso Ventanilla
-- select 'RequisitoFlujoVentanillaEForma para Licencias de Uso Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 7
--             and fe.EtapaTramite = 'VEN'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 3, TRUE, 'Persona Natural', 'FotOtro', @IdUsuario, now());

#evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Infracción Ventanilla
select 'RequisitoFlujoVentanillaEForma para Infracción Ventanilla';

set @IdFlujoEtapa = 
        (
        select fe.IdFlujoEtapa
        from FlujoEtapa fe
        where fe.IdFlujo = 16
            and fe.EtapaTramite = 'VEN'
	    and fe.Padre = 0
        );

insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'Presentación de un memorial dirigido a la Dirección de Asuntos Jurídicos del SENAPI', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Pago por concepto de una Acción de Demanda de Infracción a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de Notificación a la cuenta del SENAPI', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Pruebas que se considere pertinente', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representacion (testimonios)', 'RegTestimonio', @IdUsuario, now());

#evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Recursos Administrativos
select 'RequisitoFlujoVentanillaEForma para Recursos Administrativos Ventanilla';

set @IdFlujoEtapa = 
        (
        select fe.IdFlujoEtapa
        from FlujoEtapa fe
        where fe.IdFlujo = 9
            and fe.EtapaTramite = 'VEN'
	    and fe.Padre = 0
        );

insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La presentación deL Recurso de Impugnación mediante  memorial o escrito', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Pago por concepto de Recurso de Impugnación a la cuenta del SENAPI', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de Notificación', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Poderes de representacion.', 'OrigenTestimonio', @IdUsuario, now());

#evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Nulidad y Cancelación
select 'RequisitoFlujoVentanillaEForma para Nulidad y Cancelacion Ventanilla';

set @IdFlujoEtapa = 
        (
        select fe.IdFlujoEtapa
        from FlujoEtapa fe
        where fe.IdFlujo = 10
            and fe.EtapaTramite = 'VEN'
	    and fe.Padre = 0
        );

insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La presentación de Nulidad y Cancelación mediante  memorial o escrito al Director de Propiedad Industrial', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Pago por concepto de Nulidad y Cancelación a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de Notificación', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Prueba presentada', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Poderes de representacion', 'OrigenTestimonio', @IdUsuario, now());

#evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Oposicion
select 'RequisitoFlujoVentanillaEForma para Oposición Ventanilla';

set @IdFlujoEtapa = 
        (
        select fe.IdFlujoEtapa
        from FlujoEtapa fe
        where fe.IdFlujo = 11
            and fe.EtapaTramite = 'VEN'
	    and fe.Padre = 0
        );

insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La presentación de Demanda de Oposiciones, mediante  memorial o escrito al Director de Propiedad Industrial', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Pago por concepto de Demanda de Oposiciones, a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de Notificación', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'El recorte original de publicación  de la Gaceta Oficial de Bolivia, sobre la solicitud de registro, objeto de oposición', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Prueba presentada', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 3, TRUE, 'Poderes de representacion', 'OrigenTestimonio', @IdUsuario, now());

#evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Registro de Patente
select 'RequisitoFlujoVentanillaEForma para Registro de Patente Ventanilla';

set @IdFlujoEtapa = 
        (
        select fe.IdFlujoEtapa
        from FlujoEtapa fe
        where fe.IdFlujo = 12
            and fe.EtapaTramite = 'VEN'
	    and fe.Padre = 0
        );

insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La solicitud de registro de Patentes mediante nota o memorial', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Los formularios de registro de  Patentes  con tres copias anverso y reverso (ver pagina web del SENAPI)', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de registro de Patentes a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 4, TRUE, 'Pago por concepto de publicacion a la cuenta de la Gaceta Oficial de Bolivia, con copia  simple', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 5, TRUE, 'Memoria Descriptiva (Impreso)', 'MemoriaDescriptiva', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Pago por concepto  de anualidad', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Los poderes necesarios en caso de representacion', 'OrigenTestimonio', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 3, TRUE, 'Persona Natural', 'CiNitOtros', @IdUsuario, now());


#evalero 20042015 Modificaciones RequisitoFlujoVentanillaEFormar para Registro de Patente
select 'RequisitoFlujoVentanillaEForma para Registro de Derechos de Autor';

set @IdFlujoEtapa = 
        (
        select fe.IdFlujoEtapa
        from FlujoEtapa fe
        where fe.IdFlujo = 13
            and fe.EtapaTramite = 'VEN'
	    and fe.Padre = 0
        );


insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'La solicitud de registro de derechos de Autor mediante nota o memorial', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Los formularios de registro de Derechos de Autor  un ejemplar por cada obra  (ver pagina web del SENAPI)', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de registro de Derechos de Autor a la cuenta del SENAPI', 'NalInter', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 4, TRUE, 'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Bolivia, con copia  simple', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 5, TRUE, 'Requisitos Especiales', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 6, TRUE, 'Obra Literarias  (2 Ejemplares)', NULL, @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 7, TRUE, 'Obra Artística o Arte Aplicado', 'PresentacionArte', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 8, TRUE, 'Obras Musicales y Fonogramas', 'PresentacionMusica', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 9, TRUE, 'Obras Cinematográficas', 'PresentacionCine', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 10, TRUE, 'Programas de Computación', 'PresentacionPrograma', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 11, TRUE, 'Obras Escénicas, Dramaticas, Coreograficas, Pantomimicas y Otros', 'PresentacionObra', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 12, TRUE, 'Contratos y Otros Actos', 'PresentacionContrato', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 13, TRUE, 'Registro de Sociedades de Gestión Colectiva', 'PresentacionSociedad', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 1, TRUE, 'Persona Natural', 'RegPersona', @IdUsuario, now());
insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'OPC', now(), 2, TRUE, 'Personería Jurídica', 'RegJuridica', @IdUsuario, now());

-- #valores de padres para requisitoFlujoVentanillaEForma 23042014
-- select 'RequisitoFlujoVentanillaEForma Ventanilla Solicitud de Lema Comercial Ventanilla';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 14
--             and fe.EtapaTramite = 'VEN'
--             and fe.Padre = 0
--         );
-- 
-- -- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'SRS2','MIN',now(),1,TRUE,'Solicitud de registro de Signos Distintivos mediante Nota o Memorial',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'FRS2','MIN',now(),1,TRUE,'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'PCS2','MIN',now(),2,TRUE,'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'PPG2','MIN',now(),3,TRUE,'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Boliva, con copia simple',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'JUL2','OPC',now(),1,TRUE,'Juego de Logo 4x4 en tres ejemplares',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'PNR2','OPC',now(),2,TRUE,'Poderes necesarios en caso de representación (Testimonios)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'EUR2','OPC',now(),3,TRUE,'Empresa Unipersonal (NIT) o Registro de Comercio',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'LC', 'PNA2','OPC',now(),4,TRUE,'Persona Natural',NULL, @IdUsuario, now());

/**
Configuraciones para el Examen de Forma en Cambio de Nombre: La parametrica
RMOD se utilizará para los demas tramites de Mod direccion, transferencia, fusión y
licencias de uso para el bloque de Errores.
Creado: Eddy Valero Fecha: 10/07/2015
La creación de parametricas se realiza en base al Documento Guía para la Implementación.
*/

-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 2
--             and fe.EtapaTramite = 'EXFM'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de cambio de Nombre del titular de la solicitud o registro de un signo distintivo o de una patente, en la cual se identifiquen los datos del solicitante y de la solicitud o del registro.', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado).', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de la Solicitud de Modificación respectiva.', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Cambio de Nombre ante Notaria de Fe pública que acredite la Modificación que se desea (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RMOD', 'MIN', now(), 5, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());
-- 
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','MN01','RMOD','Sección 1 (Identificación Solicitante)','Sección 1 (Identificación Solicitante)',1,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','MN02','RMOD','Sección 2 (Representante o Apoderado)','Sección 2 (Representante o Apoderado)',2,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','MN03','RMOD','Sección 3 (Datos para Notificación)','Sección 3 (Datos para Notificación)',3,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','MN04','RMOD','Sección 4 (Datos del Registro)','Sección 4 (Datos del Registro)',4,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','MN05','RMOD','Sección 5 (Datos de la Modificación)','Sección 5 (Datos de la Modificación)',5,1,now(),now(),NULL, @IdUsuario, now());
-- 


/******************************************************************************/

/**
Configuraciones para el Examen de Forma en Cambio de Dirección:
Creado: Eddy Valero Fecha: 10/07/2015
La creación de parametricas se realiza en base al Documento Guía para la Implementación.
*/

-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 3
--             and fe.EtapaTramite = 'EXFM'
-- 	    and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 1, TRUE, 'Memorial o carta de solicitud de Inscripción de Cambio de Domicilio del titular de solicitud o registro de un signo distintivo o de una patente, en el cual se identifiquen los datos del solicitante y de la solicitud o registro respecto al cual se solicita la modificación.', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 2, TRUE, 'Formulario de solicitud de modificación de registro (debidamente llenado.', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 3, TRUE, 'Recibo Oficial SENAPI, por concepto de Solicitud de Registro de Cambio de Domicilio, cuya suma este de acuerdo a la nacionalidad del solicitante del registro.', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 4, TRUE, 'En caso de ser el solicitante una persona jurídica o un representante, Testimonio de Poder de representación (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Deposito en el SENAPI).', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, NULL, 'MIN', now(), 5, TRUE, 'Testimonio protocolizado de Cambio de Domicilio ante Notaria de Fe pública que acredite el Cambio de Domicilio del Titular de la solicitud o del registro sobre el cual se solicita la inscripción (Original o Fotocopia Legalizada o Fotocopia simple en caso de tener Nº de Depósito en el SENAPI).', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RMOD', 'MIN', now(), 6, TRUE, 'Errores en el formulario de Solicitud.', NULL, @IdUsuario, now());

/******************************************************************************/

/**
Configuraciones para ventanilla con Observaciones para el flujo de Cambio de Nombre:
Creado: Eddy Valero Fecha: 21/07/2015
*/

-- select 'RequisitoFlujoVentanillaEForma para Ventanilla con Observaciones para el flujo de Modificación de Nombre';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 2
--             and fe.EtapaTramite = 'VEN'
-- 			and fe.EstadoEtapa = 'OBS'
--             and fe.Padre in (
-- 				select fe.IdFlujoEtapa
-- 				from FlujoEtapa fe
-- 				where fe.IdFlujo = 2
-- 				  and fe.EtapaTramite = 'EXFM'
-- 				  and fe.Padre = 0
-- 			) 
--         );
-- 
-- select 'RequisitoFlujoVentanillaEForma';
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'SRS1', 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R002', 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PCS1', 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNR1', 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'EUR1', 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNA1', 'OPC', now(), 3, TRUE, 'Persona Natural (Subsanado)', 'FotOtro', @IdUsuario, now());

/******************************************************************************/

/**
Configuraciones para ventanilla con Observaciones para el flujo de Cambio de Direccion:
Creado: Eddy Valero Fecha: 21/07/2015
*/

-- select 'RequisitoFlujoVentanillaEForma para Ventanilla con Observaciones para el flujo de Modificación de Nombre';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 3
--             and fe.EtapaTramite = 'VEN'
-- 			and fe.EstadoEtapa = 'OBS'
--             and fe.Padre in (
-- 				select fe.IdFlujoEtapa
-- 				from FlujoEtapa fe
-- 				where fe.IdFlujo = 3
-- 				  and fe.EtapaTramite = 'EXFM'
-- 				  and fe.Padre = 0
-- 			) 
--         );
-- 
-- select 'RequisitoFlujoVentanillaEForma';
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'SRS1', 'MIN', now(), 1, TRUE, 'La solicitud de modificación de registro de signo distintivo mediante carta o memorial (Subsanado)', 'NotaMemo', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R002', 'MIN', now(), 2, TRUE, 'El formulario de solicitud de modificación de registro una copia de la primera hoja (Subsanado)', NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PCS1', 'MIN', now(), 3, TRUE, 'Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI (Subsanado)', 'NalInter', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNR1', 'OPC', now(), 1, TRUE, 'Los poderes necesarios en caso de representación o testimonio (Subsanado)', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'EUR1', 'OPC', now(), 2, TRUE, 'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)', 'RegComercio', @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNA1', 'OPC', now(), 3, TRUE, 'Persona Natural (Subsanado)', 'FotOtro', @IdUsuario, now());
-- 
-- 
-- 
-- #valores para el clasificador 23042014 evalero
-- select 'Clasificador Ventanilla Lema Comercial Ventanilla';
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'NOS2','SRS2', 'Nota', 'Nota', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'MES2','SRS2', 'Memorial', 'Memorial', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PAN2','PCS2', 'Nacional', 'Nacional', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PAE2','PCS2', 'Extranjera', 'Extranjera', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PNO2','PNR2', 'Original', 'Original', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PFL2','PNR2', 'Fotocopia Legalizada', 'Fotocopia Legalizada', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PFS2','PNR2', 'Fotocopia Simple', 'Fotocopia Simple', 3, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'EUO2','EUR2', 'Original', 'Original', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'EFL2','EUR2', 'Fotocopia Legalizada', 'Fotocopia Legalizada', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'EFS2','EUR2', 'Fotocopia Simple', 'Fotocopia Simple', 3, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PFC2','PNA2', 'Fotocopia CI', 'Fotocopia CI', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'POT2','PNA2', 'Otro', 'Otro', 2, 1, now(), now(), null, @IdUsuario, now());
-- 
-- 
-- #valores de padres para requisitoFlujoVentanillaEForma 23042014
-- select 'RequisitoFlujoVentanillaEForma Ventanilla Solicitud de Depósito de Nombre Comercial, Rótulos y Enseñas';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 15
--             and fe.EtapaTramite = 'VEN'
--             and fe.Padre = 0
--         );
-- 
-- -- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'SRS3','MIN',now(),1,TRUE,'Solicitud de registro de Signos Distintivos mediante Nota o Memorial',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'FRS3','MIN',now(),1,TRUE,'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'PCS3','MIN',now(),2,TRUE,'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'PPG3','MIN',now(),3,TRUE,'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Boliva, con copia simple',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'JUL3','OPC',now(),1,TRUE,'Juego de Logo 4x4 en tres ejemplares',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'PNR3','OPC',now(),2,TRUE,'Poderes necesarios en caso de representación (Testimonios)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'EUR3','OPC',now(),3,TRUE,'Empresa Unipersonal (NIT) o Registro de Comercio',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, TipoGenero, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'RDNC', 'PNA3','OPC',now(),4,TRUE,'Persona Natural',NULL, @IdUsuario, now());
-- 
-- 
-- #valores para el clasificador 23042014 evalero hijos de requisitoFlujoVentanillaEForma
-- select 'Ventanilla Solicitud de Depósito de Nombre Comercial, Rótulos y Enseñas';
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'NOS3','SRS3', 'Nota', 'Nota', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion)
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'MES3','SRS3', 'Memorial', 'Memorial', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PAN3','PCS3', 'Nacional', 'Nacional', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PAE3','PCS3', 'Extranjera', 'Extranjera', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PNO3','PNR3', 'Original', 'Original', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PFL3','PNR3', 'Fotocopia Legalizada', 'Fotocopia Legalizada', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PFS3','PNR3', 'Fotocopia Simple', 'Fotocopia Simple', 3, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'EUO3','EUR3', 'Original', 'Original', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'EFL3','EUR3', 'Fotocopia Legalizada', 'Fotocopia Legalizada', 2, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'EFS3','EUR3', 'Fotocopia Simple', 'Fotocopia Simple', 3, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'PFC3','PNA3', 'Fotocopia CI', 'Fotocopia CI', 1, 1, now(), now(), null, @IdUsuario, now());
-- INSERT INTO Clasificador (idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) 
-- VALUES (null, 'TipoFormularioVentanillaEForma', 'POT3','PNA3', 'Otro', 'Otro', 2, 1, now(), now(), null, @IdUsuario, now());
-- 
-- 
-- 
-- select 'RequisitoFlujoVentanillaEForma Examen de Forma para Solicitud de Depósito de Nombre Comercial, Rótulos o enseñas';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 15
--             and fe.EtapaTramite = 'EXFM'
--             and fe.Padre = 0
--         );
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R027','MIN',now(),1,TRUE,'Escrito de solicitud de registro de una Marca de Producto',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R028','MIN',now(),2,TRUE,'Formulario de Solicitud de Registro de Signo Distintivo S-NPI/SERV/P/301 PI-100',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R029','MIN',now(),3,TRUE,'Recibo Oficial SENAPI por concepto de Solicitud de Registro de Signo Distintivo',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R030','MIN',now(),4,TRUE,'Recibo Oficial SENAPI por concepto de Titulo  de Registro de Signo Distintivo',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R031','MIN',now(),5,TRUE,'Titulo respectivo acorde a la nacionalidad solicitante',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R032','MIN',now(),6,TRUE,'Recibo original del deposito bancario para la publicación',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R033','MIN',now(),7,TRUE,'Fotocopia Simple del deposito bancario para la publicación',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R034','MIN',now(),8,TRUE,'Testimonio de poder de representación',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R035','MIN',now(),9,TRUE,'Documento que declare la veracidad de la Prioridad invocada',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R036','MIN',now(),10,TRUE,'Errores en el formulario de Solicitud',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R037','OPC',now(),1,TRUE,'Fotocopia del Numero de Identificación Tributaria',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R038','OPC',now(),2,TRUE,'Certificado de FUNDAEMPRESA',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'R039','OPC',now(),3,TRUE,'Testimonio de Constitución de la Empresa',NULL, @IdUsuario, now());
--                                                                                                                                                                                     
-- # Parametricas evalero 05092014 Hijos del Formulario de Examen De forma para Solicitud de Depósito de Nombre Comercial, Rótulos o enseñas
-- 
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','PB03','R039','Sección 1 (Pro Bolivia)','Sección 1 (Pro Bolivia)',1,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','IS03','R039','Sección 2 (Identificación Solicitante)','Sección 2 (Identificación Solicitante)',2,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','IR03','R039','Sección 3 (Identificación Representante Legal)','Sección 3 (Identificación Representante Legal)',3,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','DS03','R039','Sección 4 (Datos del Signo)','Sección 4 (Datos del Signo)',4,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','PE03','R039','Sección 5 (Prioridad Extranjera)','Sección 5 (Prioridad Extranjera)',5,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','PX03','R039','Sección 6 (Prioridad de Exposiciones)','Sección 6 (Prioridad de Exposiciones)',6,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','IRO3','R039','Sección 7 (Interes real para la oposición Andina)','Sección 7 (Interes real para la oposición Andina)',7,1,now(),now(),NULL, @IdUsuario, now());
-- INSERT INTO Clasificador (Idioma,Dominio,Codigo,DominioPadre,Nombre,Descripcion,Orden,Vigente,FechaCreacion,FechaInicio,FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoFormularioVentanillaEForma','DN03','R039','Sección 8 (Domicilio para efectos de Notificación)','Sección 8 (Domicilio para efectos de Notificación)',8,1,now(),now(),NULL, @IdUsuario, now());
-- 
-- 
-- select 'RequisitoFlujoVentanillaEForma Ventanilla con observaciones para Solicitud de Depósito de Nombre Comercial, Rótulos o enseñas';
-- 
-- set @IdFlujoEtapa = 
--         (
--         select fe.IdFlujoEtapa
--         from FlujoEtapa fe
--         where fe.IdFlujo = 15
--             and fe.EtapaTramite = 'VEN'
-- 			and fe.EstadoEtapa = 'OBS'
--             and fe.Padre in (
-- 				select fe.IdFlujoEtapa
-- 				from FlujoEtapa fe
-- 				where fe.IdFlujo = 15
-- 				  and fe.EtapaTramite = 'EXFM'
-- 				  and fe.Padre = 0
-- 			) 
--         );
-- 
-- 
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'SRS1','MIN',now(),1,TRUE,'Solicitud de registro de Signos Distintivos mediante Nota o Memorial (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'FRS1','MIN',now(),2,TRUE,'Tres copias de la primera hoja y una sola copia de las páginas; dos, tres cuatro y cinco (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PCS1','MIN',now(),3,TRUE,'Pago por concepto de solicitud de registro de Signos Distintivos a la cuenta del SENAPI (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PPG1','MIN',now(),4,TRUE,'Pago por concepto de publicación a la cuenta de la Gaceta Oficial de Boliva, con copia simple (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'JUL1','OPC',now(),1,TRUE,'Juego de Logo 4x4 en tres ejemplares (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNR1','OPC',now(),2,TRUE,'Poderes necesarios en caso de representación (Testimonios) (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'EUR1','OPC',now(),3,TRUE,'Empresa Unipersonal (NIT) o Registro de Comercio (Subsanado)',NULL, @IdUsuario, now());
-- insert into RequisitoFlujoVentanillaEForma (IdFlujoEtapa, Codigo, TipoRequisito, FechaCreacion, Posicion, Vigente, Descripcion, Dominio, Usuario, FechaUltimaModificacion) values (@IdFlujoEtapa, 'PNA1','OPC',now(),4,TRUE,'Persona Natural',NULL, @IdUsuario, now());


select 'Obtener IdFlujoEtapa para Examen de Forma';

set @IdFlujoetapa = (
                        select IdFlujoEtapa from FlujoEtapa where Padre = 0 and EtapaTramite = 'EXFF' and IdFlujo = 1
                    );
select 'FormularioTramite';

insert into FormularioTramite
(IdFormularioTramite, idFlujoEtapa, Codigo, NombreFormulario, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(1, @IdFlujoEtapa ,'MS','REGISTRO DE MARCA Y SIGNO', now(), null, 1, null, now());


select 'ElementoFormularioTramite';

set @IdFormularioTramite = (
					select IdFormularioTramite from FormularioTramite where IdFormularioTramite = 1
				);


select 'Registrabilidad';

#Formulario: Registrabilidad
#1ra Seccion

set @IdElementoFormularioTramite = 1;
set @secunoRegisFormUno = 1;
set @OrdensecunoRegisFormUno = 1;

insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', '1. Verificación de la Solicitud', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', '¿El expediente contempla faltas, errores u omisiones en el Examen de Forma?',@OrdensecunoRegisFormUno ,null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', '2. Requisitos', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', '2.1 Susceptibilidad de Representación gráfica (Art. 134 Decisión 486)', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'las palabras o combinación de palabras', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'las imágenes, figuras, símbolos, gráficos, logotipos, monogramas, retratos, etiquetas, emblemas y escudos', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'los sonidos y los olores', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'las letras y los números', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'un color delimitado por una forma, o una combinación de colores', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'la forma de los productos, sus envases o envolturas', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', '2.2 Distintividad Intrínseca. Identificar e individualizar productos o servicios sin confundirse con él o con sus propiedades o características Artículo 135 Decisión 486. No podran registrarse como marcas los signos que:', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'No pueden constituir marca conforme al primer párrafo del artículo anterior', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Carezcan de distintividad', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan exclusivamente en formas usuales de los productos o de sus envases, o en formas o características impuestas por la naturaleza o la función de dicho producto o del servicio de que se trate', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan exclusivamente en formas u otros elementos que den una ventaja funcional o técnica al producto o al servicio al cual se aplican', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan exclusivamente en un signo o indicación que pueda servir en el comercio para describir la calidad, la cantidad, el destino, el valor, la procedencia geográfica, la época de producción u otros datos, características o informaciones de los productos o de los servicios para los cuales ha de usarse dicho signo o indicación, incluidas las expresiones laudatorias referidas a esos productos o servicios.', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan exclusivamente en un signo o indicación que sea el nombre genérico o técnico del producto o servicio de que se trate', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan exclusivamente o se hubieran convertido en una designación común o usual del producto o servicio de que se trate en el lenguaje corriente o en la usanza del país', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan en un color aisladamente considerado, sin que se encuentre delimitado por una forma específica', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Puedan engañar a los medios comerciales o al público, en particular sobre la procedencia geográfica, la naturaleza, el modo de fabricación, las características, cualidades o aptitud para el empleo de los productos o servicios de que se trate', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Reproduzcan, imiten o contengan una denominación de origen protegida para los mismos productos o para productos diferentes, cuando su uso pudiera causar un riesgo de confusión o de asociación con la denominación; o implicase un aprovechamiento injusto de su notoriedad', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Contengan una denominación de origen protegida para vinos y bebidas', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan en una indicación geográfica nacional o extranjera susceptible de inducir a confusión respecto a los productos o servicios a los cuales se aplique', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Reproduzcan o imiten, sin permiso de las autoridades competentes, bien sea como marcas, bien como elementos de las referidas marcas, los escudos de armas, banderas, emblemas, signos y punzones oficiales de control y de garantía de los Estados y toda imitación desde el punto de vista heráldico, así como los escudos de armas, banderas y otros emblema, siglas o denominaciones de cualquier organización internacional', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Reproduzcan o imiten signos de conformidad con normas técnicas, a menos que su registro sea solicitado por el organismo nacional competente en normas y calidades en los países miembros', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Reproduzcan, imiten o incluyan la denominación de una variedad vegetal protegida en un País Miembro o en el extranjero, si el signo se destinara a productos o servicios relativos a esa variedad o su uso fuere susceptible de causar confusión o asociación con la variedad', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Sean contrarios a la ley, a la moral, al orden público o a las buenas costumbres', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', '2.3 Distintividad Extrinseca', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', 'Artículo 136 Desición 486.- No podrán registrarse como marcas aquellos signos cuyo uso en el comercio afectara indebidamente un derecho de tercero, en particular cuando: ', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Sean idénticos o se asemejen, a una marca anteriormente solicitada para registro o registrada por un tercero, para los mismos productos o servicios, o para productos o servicios respecto de los cuales el uso de la marca pueda causar un riesgo de confusión o de asociación', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Sean idénticos o se asemejen a un lema comercial solicitado o registrado, siempre que dadas las circunstancias, su uso pudiera originar un riesgo de confusión o de asociación', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Sean idénticos o se asemejen a un signo distintivo de un tercero, siempre que dadas las circunstancias su uso pudiera originar un riesgo de confusión o de asociación, cuando el solicitante sea o haya sido un respresentante, un distribuidor o una persona expresamente autorizado por el titular del signo protegido en el País Miembro o en el extranjero', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan en un signo que afecte la identidad o prestigio de personas jurídicas con o sin fines de lucro, o personas naturales, en especial, tratándose del nombre, apellido, firma, título, hipocoristico, seudónimo, imagen, retrato o caricatura de una persona distinta del solicitante o identificada por el sector pertinente del público como una persona distinta del solicitante, salvo que se acredite el consentimiento de esa persona o, si hubieses fallecido, el de quienes fueran declarados sus herederos', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan en un signo que infrinja el derecho de propiedad industrial o el derecho de autor de un tercero, salvo que medie el consentimiento de éste', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Consistan en el nombre de las comunidades indígenas, afroamericanas o locales, o las denominaciones, las palabras, letras, caracteres o signos utilizados para distinguir sus productos, sus servicios o la forma de procesarlos, o que constituyan la expresión de su cultura o práctica, salvo que la solicitud sea presentada por la propia comunidad o cn su consentimiento expreso.', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Constituyan una reproducción, imitación, traducción, transiteración o transcripción, total o parcial, de un signo distintivo notoriamente conocido cuyo titular sea un tercero, cualesquiera que sean los productos o servicios a los que se aplique el signo, cuando su uso fuese susceptible de acusar un riesgo de confusión o de asociación con ese tercero o con sus productos o servicios; u aprovechamiento injusto del prestigio del signo; o la dilución de su fuerza distintiva o de su valor comercial o publicitario', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH2', '2.4 Mala fé', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoRegisFormUno=@OrdensecunoRegisFormUno+1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Registrabilidad', @secunoRegisFormUno, 'TEH7', 'Artículo 137 Desición 486.- Cuando la oficina nacional competente tenga indicios razonables que le permitan inferir que un registro se hubiese solicitado para perpetrar, facilitar o consolidar un acto de competencia desleal, podrá denegar dicho registro.', @OrdensecunoRegisFormUno, null, now(), null, 1, null, now());

/*************************************************/
select 'Relacion de Registros Existentes';

#Formulario: Relacion de Registros Existentes
#1ra Seccion

set @secunoRelRegFormUno = 1;
set @OrdensecunoRelRegFormUno = 1;

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'RelacionRegistroExistente', @secunoRelRegFormUno, 'TEH6', 'Observaciones:',@OrdensecunoRelRegFormUno, null, now(), null, 1, null, now());

/************************************************/
select 'Analisis de Denominaciones';

#Formulario Analisis de Denominaciones
#1ra Seccion

set @secunoAnaDenFormUno = 1;
set @OrdensecunoAnaDenFormUno = 1;

#Registrado
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH2', 'Registrado', @OrdensecunoAnaDenFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaDenFormUno = @OrdensecunoAnaDenFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH2', 'Marca', @OrdensecunoAnaDenFormUno, null, now(), null, 1, null, now());

#Visual
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaDenFormUno = @OrdensecunoAnaDenFormUno + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH4', 'Visual', @OrdensecunoAnaDenFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH4', 'SI', 1, @IdPadre, now(), null, 1, null, now());
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH4', 'NO', 2, @IdPadre, now(), null, 1, null, now());


#Fonetica
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaDenFormUno = @OrdensecunoAnaDenFormUno + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH4', 'Fonetica', @OrdensecunoAnaDenFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH4', 'SI', 1, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', @secunoAnaDenFormUno, 'TEH4', 'NO', 2, @IdPadre, now(), null, 1, null, now());

#2da Seccion
#Solicitado
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH6', 'Solicitado', 1, null, now(), null, 1, null, now());

#Registrado
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH6', 'Registrado', 2, null, now(), null, 1, null, now());

#Descriptivo
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Descripcion', 3, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Descriptivo', 1, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Genérico', 2, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Evocativo', 3, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Común', 4, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Fantasía', 5, @IdPadre, now(), null, 1, null, now());

#Relacion
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Relación', 4, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Diluido', 1, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Débil', 2, @IdPadre, now(), null, 1, null, now());

#Confundibilidad
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Confundibilidad', 5, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Ortográfica/Visual', 1, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Fonética/Auditivo', 2, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH3', 'Ideológica/Conceptivos', 3, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH4', 'Aceptado', 6, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH4', 'SI', 1, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 2, 'TEH4', 'NO', 2, @IdPadre, now(), null, 1, null, now());


#3ra Seccion
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeDenominaciones', 3, 'TEH6', 'Observaciones', 1, null, now(), null, 1, null, now());
/*****************************/
select 'Analisis de Marcas Tridimensionales';
#Formulario: "Analisis Tridimensional"
set @secunoAnaTrimFormUno = 1;
set @OrdensecunoAnaTrimFormUno = 1;


set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeMarcasTridimensionales', @secunoAnaTrimFormUno, 'TEH6', 'IdMarcaRegistrada',@OrdensecunoAnaTrimFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaTrimFormUno = @OrdensecunoAnaTrimFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeMarcasTridimensionales', @secunoAnaTrimFormUno, 'TEH6', 'Observaciones:',@OrdensecunoAnaTrimFormUno, null, now(), null, 1, null, now());

/****************************/
select 'Analisis de Conexion Competitiva';
set @secunoAnaConCompFormUno = 1;
set @OrdensecunoAnaConCompFormUno = 1;

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH2', 'Marca Solicitada', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaConCompFormUno = @OrdensecunoAnaConCompFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH2', 'Marca Registrada', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaConCompFormUno = @OrdensecunoAnaConCompFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH1', 'Clase Solicitada', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaConCompFormUno = @OrdensecunoAnaConCompFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH1', 'Clase Registrada', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaConCompFormUno = @OrdensecunoAnaConCompFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH6', 'Producto Solicitado', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaConCompFormUno = @OrdensecunoAnaConCompFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH6', 'Producto Registrado', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());


set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensecunoAnaConCompFormUno = @OrdensecunoAnaConCompFormUno + 1;
set @IdPadre = @IdElementoFormularioTramite;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH3', '', @OrdensecunoAnaConCompFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; 
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH3', 'Mismos Canales de Comercialización', 1, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; 
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH3', 'Mismos Medios de Publicidad', 2, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; 
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH3', 'Relación o vinculación entre productos o servicios', 3, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; 
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH3', 'Uso conjunto o complementario', 4, @IdPadre, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; 
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secunoAnaConCompFormUno, 'TEH3', 'Mismo Género', 5, @IdPadre, now(), null, 1, null, now());

set @secdosAnaConCompFormUno = @secunoAnaConCompFormUno + 1;
set @OrdensecdosAnaConCompFormUno = 1;

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConexionCompetitiva', @secdosAnaConCompFormUno, 'TEH6', 'Principio de Especialidad', @OrdensecdosAnaConCompFormUno, null, now(), null, 1, null, now());

/****************************/
select 'Análisis de Confundibilidad';
#Formulario: "Analisis de Confundibilidad"

#1ra Seccion
#Denominativo
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', 1, 'TEH1', 'Denominativo', 1, null, now(), null, 1, null, now());

#Figurativo
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', 1, 'TEH1', 'Figurativo', 2, null, now(), null, 1, null, now());

#2da Seccion
#Denominativo
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', 2, 'TEH1', 'Denominativo', 1, null, now(), null, 1, null, now());

#Figurativo
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', 2, 'TEH1', 'Figurativo', 2, null, now(), null, 1, null, now());

#3ra Seccion Semejanzas grafico
set @sectresAnaConfuFormUno = 3;
set @OrdensectresAnaConfuFormUno = 1;
set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Semejanzas - Gráfico', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Gráfico', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El gráfico en el solicitado es similar o tiene imágenes similares al gráfico registrado, o La imagen tiene los mismos o similares características en aspecto de línea, contorno y colores', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Ortográfico', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El signo solicitado utiliza letras o palabras iguales a las del registrado', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Trazado', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El trazado del solicitado representa en imagen o en rasgo lo mismo; o una similar representación que en el gráfico registrado, o El trazado tiene las mismas características en aspecto de línea, contorno y colores', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Semejanzas - Concepto', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Gráfico', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El gráfico le evoca la misma imagen en el solicitado que en el evocado', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Similitud Ortográfica.- Se da por la semejanza de las letras entre los signos a compararse. La sucesión de vocales, la longitud de la palabra o palabras, el número de sílabas, las raíces o las terminaciones iguales, pueden incrementar la confusión', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'Las letras o palabras evocan el mismo o los mismos productos o servicios en el solicitado que en el registrado', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Similitud Fonética.- Se presenta entre signos que al ser pronunciados tienen un sonido similar. La determinación de tal similitud depende, entre otros elementos, de la indentidad en la sílaba tónica o de la coincidencia en las raíces o terminaciones; sin embargo, deben tenerse también en cuenta las particularidades de cada caso, con el fin de determinar si existe la posibilidad real de confusión entre los signos confrontados', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'La lectura del signo registrado y solicitado se escucha y/o pronuncia  de manera similar', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Similitud Ideológica.- Se configura entre signos que evocan la misma o similar idea, que deriva del contenido o del parecido conceptual de los signos', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Directa', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El signo induce al comprador a adquirir productos o servicios con la creencia que está comprando otro', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Indirecta', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El signo se atribuye un origen empresarial, a los productos o servicios, pero en realidad tiene otro origen', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH2', 'Riesgo de Asociación', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH7', 'El signo da la posibilidad al consumidor al adquirirlo, que aunque diferencie los productos de este signo con otro en conflicto y con diferente origen empresarial, que piense que el productor de dicho producto y otra empresa tiene una relación o vinculación económica', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1; set @OrdensectresAnaConfuFormUno = @OrdensectresAnaConfuFormUno + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'AnalisisDeConfundibilidad', @sectresAnaConfuFormUno, 'TEH6', 'Observaciones:', @OrdensectresAnaConfuFormUno, null, now(), null, 1, null, now());

/****************************/
select 'Conclusión';

#Formulario: Conclusion

#1ra Seccion
#Observacion

set @IdElementoFormularioTramite = @IdElementoFormularioTramite + 1;
insert into ElementoFormularioTramite
(IdElementoFormularioTramite, IdFormularioTramite, Pestania, Seccion, TipoElemento, NombreElemento, Orden, IdPadre, FechaInicio, FechaFin, Vigente, Usuario, FechaUltimaModificacion)
values
(@IdElementoFormularioTramite, @IdFormularioTramite, 'Conclusion', 1, 'TEH6', 'Observaciones:', 1, null, now(), null, 1, null, now());

/*************PARAMETRICAS IMPRESION TITULOS*************/

#datos tabla Tasa
select 'Tasa';

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('REGS',1000,true,now(),now(),'Solicitud de Marca o Signo Internacional', 0,'RECI','INTE', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('REGS',500,true,now(),now(),'Solicitud de Marca o Signo Nacional', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('RENO',500,true,now(),now(),'Solicitud de Renovacion de Signo Distintivo Internacional', 0,'RECI','INTE', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('RENO',250,true,now(),now(),'Solicitud de Renovacion de Signo Distintivo Nacional', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('RENO',500,true,now(),now(),'Titulo de Renovacion de Marcas Internacional', 0,'TITU','INTE', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('RENO',250,true,now(),now(),'Titulo de Renovacion de Marcas Nacional', 0,'TITU','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('REGS',500,true,now(),now(),'Titulo de Concesion de Marca Internacional', 0,'TITU','INTE', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('REGS',250,true,now(),now(),'Titulo de Concesion de Marca Nacional', 0,'TITU','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Desarchivo (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,true,now(),now(),'Desarchivo (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Registro de Folletos y Otras Obras', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,1,true,now(),now(),'Reintegro', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,0,true,now(),now(),'Denominación de Origen', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,10,true,now(),now(),'Fotocopia Legalizadas por Hoja (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,10,true,now(),now(),'Fotocopia Legalizada por Hoja (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Notificaciones (Nacionales)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Notificaciones (Internacionales)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,400,true,now(),now(),'Infracción (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Infracción (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,400,true,now(),now(),'Registro de Libros (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Registro de Libros (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,true,now(),now(),'Registro de Folletos y otras Obras (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,true,now(),now(),'Registro de Tesis (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Registro de Tesis (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Registro de Obras Artisticas (Musicales, Dramaticas, Coreográficas, Pantomimicas, Pintura, Dibujos y Otras)(Internacionales) ', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,true,now(),now(),'Registro de Obras Artisticas (Musicales, Dramaticas, Coreográficas, Pantomimicas, Pintura, Dibujos y Otras)(Nacionales)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,300,true,now(),now(),'Cinematograficas (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Cinematograficas (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,300,true,now(),now(),'Registro de Programas de Ordenador (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Registro de Programas de Ordenador (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Registro de Contratos y Otros Actos (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,true,now(),now(),'Registro de Contratos y Otros Actos (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,1000,true,now(),now(),'Autorización de Funcionamiento de Sociedades Colectivas', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,480,true,now(),now(),'Actualización Anual de Sociedades Colectivas', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Certificación Derechos de Autor (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Certificación Derechos de Autor (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Copia Legalizada Derechos de Autor (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Copia Legalizada Derechos de Autor (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Acta de Conciliación (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Acta de Conciliación (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,300,true,now(),now(),'Modificación de Forma (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Modificación de Forma (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,300,true,now(),now(),'Modificación de Fondo (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Modificación de Fondo (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Certificacion Propiedad Industrial (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,75,true,now(),now(),'Certificación Propiedad Industrial (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CANO',400,true,now(),now(),'Solicitud de Registro de Cambio de Nombre (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CANO',200,true,now(),now(),'Solicitud de Registro de Cambio de Nombre (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CADO',400,true,now(),now(),'Solicitud de Cambio de Dirección (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CADO',200,true,now(),now(),'Solicitud de Cambio de Dirección (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CATR',500,true,now(),now(),'Solicitud de Transferencia (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CATR',250,true,now(),now(),'Solicitud de Transferencia (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CAFU',400,true,now(),now(),'Solicitud de Fusión (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CAFU',200,true,now(),now(),'Solicitud de Fusión (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,500,true,now(),now(),'Solicitud de Inscripción de Uso de Licencia (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,250,true,now(),now(),'Solicitud de Inscripción de USo de Licencia (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,400,true,now(),now(),'Nulidad de Registro de Marcas, Patentes, Diseños Industriales Modelos de Utilidad (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Nulidad de Registro de Marcas, Patentes, Diseños Industriales Modelos de Utilidad (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,500,true,now(),now(),'Oposición a Solicitudes de Marcas, Patentes, Diseños Industriales Modelos de Utilidad (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,250,true,now(),now(),'Oposición a Solicitudes de Marcas, Patentes, Diseños Industriales Modelos de Utilidad (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Recurso de Impugnación (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,true,now(),now(),'Recurso de Impugnación (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,true,now(),now(),'Busqueda de Anterioridades (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,75,true,now(),now(),'Busqueda de Anterioridades (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,400,true,now(),now(),'Cancelación Registro de Marca (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Cancelación Registro de Marca (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,500,true,now(),now(),'Declaración de Denominación de Origen', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,1000,true,now(),now(),'Declaración de Protección de Denominación de Origen Comunitaria', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,2000,true,now(),now(),'Declaración de Protección de Denominación de Origen Extra Comunitario (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,800,true,now(),now(),'Solicitud de Registro de Patentes de Invención (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,400,true,now(),now(),'Solicitud de Registro de Patentes de Invencion (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,700,true,now(),now(),'Solicitud de Registro de Utilidad (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,350,true,now(),now(),'Solicitud de Registro de Utilidad (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,600,true,now(),now(),'Solicitud de Registro de Diseño Industrial (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,300,true,now(),now(),'Solicitud de Registro de Diseño Industrial (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,1000,true,now(),now(),'Segunda Parte, Examen de Fondo de Patentabilidad (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,500,true,now(),now(),'Segunda Parte, Examen de Fondo de Patentabilidad (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,1000,true,now(),now(),'Vigencia Anual de Patentes (Internacional)', 0,'RECI','NACI', @IdUsuario, now());
INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,500,true,now(),now(),'Vigencia Anual de Patentes (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,200,true,now(),now(),'Busqueda en Invenciones y Nuevas Tecnologías (Internacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,true,now(),now(),'Busqueda en Invenciones y Nuevas Tecnologías (Nacional)', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Formulario Registro de Patentes', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,350,false,now(),now(),'Segunda Parte Patentes', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Vigencia Anual Patentes', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Registro de Modelo de Utilidad', 100,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Transferencia', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Cambio Nombre y/o Domicilio', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Fusiones', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Rectificación Modificaciones de Forma', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Rectificación Modificaciones de Fondo', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Desarchivos', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Certificaciones Propiedad Intelectual', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,20,false,now(),now(),'Certificados Derechos de Autor', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,10,false,now(),now(),'Fotocopia Legalizada por Cada Hoja', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Copias Legalizadas de Propiedad Industrial', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,20,false,now(),now(),'Copias Legalizadas Derechos de Autor', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES ('CALU',50,false,now(),now(),'Licencia de Uso', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Apelación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Oposición de Marcas', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Oposición de Patentes', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Oposición Modelo de Utilidad', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Oposición Diseño Industrial', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Nulidad de Marcas', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Nulidad de Patentes', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Nulidad Diseño Industrial', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Nulidad Modelos de Utilidad', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Busqueda', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Acta de Conciliación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,17,false,now(),now(),'Formulario Solicitud y Resolución de Inscripción', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,10,false,now(),now(),'Formulario de Notificación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Cancelación de Marca', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Acta de Conciliación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Anualidad', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,60,false,now(),now(),'Anualidad y Recargo', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Apelación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,450,false,now(),now(),'Boletin', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Busqueda', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Cambio de Domicilio', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Cambio de Nombre', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Cancelacion de Marca de Patenete', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,20,false,now(),now(),'Certificación Derechos de Autor', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Certificación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,20,false,now(),now(),'Copia Legalizada Derecho de Autor', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Copia Legalizada Marca', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Desarchivo', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,30,false,now(),now(),'Duplicado Registro de Marca', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,17,false,now(),now(),'Formualrio No.', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,10,false,now(),now(),'Fotocopia Legalizada', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Fusión', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,250,false,now(),now(),'Licencia de Uso', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,25,false,now(),now(),'Multa por Anualidad', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,10,false,now(),now(),'Notificación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Nulidad', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Oposición', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Rectificación y Modificación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Registro de Marca', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,100,false,now(),now(),'Registro de Patenete', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,false,now(),now(),'Segunda Parte Marca', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,350,false,now(),now(),'Segunda Parte Patente', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,150,false,now(),now(),'Tarjeta de Renovación', 0,'RECI','NACI', @IdUsuario, now());

INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Titulos de Concesión', 0,'RECI','NACI', @IdUsuario, now());
 
INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
 VALUES (null,50,false,now(),now(),'Titulos de Renovacion', 0,'RECI','NACI', @IdUsuario, now());
 
 INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
 VALUES (null,50,false,now(),now(),'Transferencia', 0,'RECI','NACI', @IdUsuario, now());
 
 INSERT INTO Tasa (TipoTramite, Costo, Vigente, FechaInicio, FechaFin, Descripcion, Descuento,TipoRecibo,TipoTasa,Usuario, FechaUltimaModificacion) 
VALUES (null,50,false,now(),now(),'Revocatoria', 0,'RECI','NACI', @IdUsuario, now());




#datos para la tabla Dosificacion 
select 'Dosificacion';
INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true,@IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());

INSERT INTO Dosificacion (ValorInicial, ValorFinal, FechaDosificacion, Siguiente, Vigente,Usuario, FechaUltimaModificacion) 
VALUES (1,100,now(),1,true, @IdUsuario, now());



#datos para la tabla DosificacionTasa
select 'DosificacionTasa';
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (1, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (2, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 5, 2,TRUE, now(), 'G-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 6, 2,TRUE, now(), 'H-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (9, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (10, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (11, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (12, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (13, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (14, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (15, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (16, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (17, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (18, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (19, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (20, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (21, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (22, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (23, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (24, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (25, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (26, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (27, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (28, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (29, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (30, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (31, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (32, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (33, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (34, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (35, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (36, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (37, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (38, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (39, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (40, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (41, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (42, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (43, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (44, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (45, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (46, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (47, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (48, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (49, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (50, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (51, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (52, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (53, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (54, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (55, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (56, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (57, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (58, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (59, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (60, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (61, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (62, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (63, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (64, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (65, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (66, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (67, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (68, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (69, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (70, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (71, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (72, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (73, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (74, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (75, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (76, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (77, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (78, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (79, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (80, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (81, 4, 2,TRUE, now(), 'E', 'RECI', @IdUsuario, now() );


INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (1, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (2, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 8, 3,TRUE, now(), 'E-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 9, 3,TRUE, now(), 'F-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (9, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (10, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (11, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (12, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (13, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (14, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (15, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (16, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (17, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (18, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (19, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (20, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (21, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (22, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (23, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (24, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (25, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (26, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (27, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (28, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (29, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (30, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (31, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (32, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (33, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (34, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (35, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (36, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (37, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (38, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (39, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (40, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (41, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (42, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (43, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (44, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (45, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (46, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (47, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (48, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (49, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (50, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (51, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (52, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (53, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (54, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (55, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (56, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (57, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (58, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (59, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (60, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (61, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (62, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (63, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (64, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (65, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (66, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (67, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (68, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (69, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (70, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (71, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (72, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (73, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (74, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (75, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (76, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (77, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (78, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (79, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (80, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (81, 7, 3,TRUE, now(), 'D', 'RECI', @IdUsuario, now() );


INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (1, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (2, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 11, 4,TRUE, now(), 'C-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 12, 4,TRUE, now(), 'D-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (9, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (10, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (11, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (12, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (13, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (14, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (15, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (16, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (17, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (18, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (19, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (20, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (21, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (22, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (23, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (24, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (25, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (26, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (27, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (28, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (29, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (30, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (31, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (32, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (33, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (34, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (35, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (36, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (37, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (38, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (39, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (40, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (41, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (42, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (43, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (44, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (45, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (46, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (47, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (48, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (49, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (50, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (51, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (52, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (53, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (54, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (55, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (56, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (57, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (58, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (59, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (60, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (61, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (62, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (63, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (64, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (65, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (66, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (67, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (68, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (69, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (70, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (71, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (72, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (73, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (74, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (75, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (76, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (77, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (78, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (79, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (80, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (81, 10, 4,TRUE, now(), 'C', 'RECI', @IdUsuario, now() );

INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (1, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (2, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (7, 2, 1,TRUE, now(), 'A-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 3, 1,TRUE, now(), 'B-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (8, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (9, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (10, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (11, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (12, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (13, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (14, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (15, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (16, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (17, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (18, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (19, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (20, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (21, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (22, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (23, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (24, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (25, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (26, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (27, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (28, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (29, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (30, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (31, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (32, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (33, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (34, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (35, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (36, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (37, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (38, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (39, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (40, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (41, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (42, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (43, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (44, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (45, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (46, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (47, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (48, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (49, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (50, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (51, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (52, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (53, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (54, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (55, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (56, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (57, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (58, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (59, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (60, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (61, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (62, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (63, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (64, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (65, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (66, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (67, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (68, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (69, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (70, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (71, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (72, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (73, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (74, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (75, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (76, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (77, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (78, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (79, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (80, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (81, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (3, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (4, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (5, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (5, 13, 1,TRUE, now(), 'A-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (6, 14, 1,TRUE, now(), 'B-01', 'TITU', @IdUsuario, now() );
INSERT INTO  DosificacionTasa(IdTasa, IdDosificacion,IdRegional, Vigente, FechaCreacion, Serie, TipoRecibo, Usuario, FechaUltimaModificacion) VALUES (6, 1, 1,TRUE, now(), 'B', 'RECI', @IdUsuario, now() );


#datos para la tabla Institucion
INSERT INTO Institucion (Codigo, Nombre, Acronimo, SerieRegistroVigente, CorrelativoRegistro,Vigente,Usuario, FechaUltimaModificacion) 
VALUES ('SNP','Servicio Nacional de Propiedad Intelectual','SENAPI','C',0,true, @IdUsuario, now());


select 'NoLaboral';
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-08-29 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-08-30 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-05 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-06 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-12 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-13 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-19 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-20 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-26 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-09-27 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-03 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-04 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-10 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-11 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-17 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-18 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-24 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-25 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-10-31 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-01 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-07 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-08 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-14 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-15 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-21 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-22 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-28 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-11-29 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-05 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-06 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-12 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-13 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-19 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-20 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-26 12:00:00'), FALSE, TRUE, 0, 'SABADO', @IdUsuario, now());
INSERT INTO NoLaboral (Fecha, Feriado, Vigente, IdRegional, Descripcion, Usuario, FechaUltimaModificacion) VALUES (DATE('2015-12-27 12:00:00'), FALSE, TRUE, 0, 'DOMINGO', @IdUsuario, now());



#datos tipoColor
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoColor','PANT',NULL,'Pantone','Pantone',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoColor','HEXA',NULL,'Hexadecimal','Hexadecimal',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);
INSERT INTO Clasificador (Idioma, Dominio, Codigo, DominioPadre, Nombre, Descripcion, Orden, Vigente, FechaCreacion, FechaInicio, FechaFin, Usuario, FechaUltimaModificacion) VALUES (NULL,'TipoColor','COLO',NULL,'Color','Color',NULL,1,now(),now(),now(), @IdUsuario, FechaUltimaModificacion);


#evalero 19102015, creación del expediente generico para solicitudes de lema comercial inicial
INSERT INTO Expediente (CodigoTramite, NumeroRegistro, NumeroPublicacion, AreaTramite, Observacion, FechaCreacionRegistro, Usuario, FechaUltimaModificacion)
VALUES("0", "0", "0", "MA", "0", now(), @IdUsuario, now());

