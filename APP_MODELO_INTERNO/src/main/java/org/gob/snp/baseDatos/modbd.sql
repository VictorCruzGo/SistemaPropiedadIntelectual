/******************************************
Actividad Modificaciones Generar Codigo SM
Responsable: Eddy Valero Fecha: 02/12/2015
*/


# 1. Crear la tabla RegionalCorrelativo
-- 
-- TABLE: RegionalCorrelativo
--
select 'Creacion Tabla RegionalCorrelativo';

CREATE TABLE RegionalCorrelativo(
    IdRegionalCorrelativo       BIGINT          AUTO_INCREMENT,
    IdRegional                  BIGINT,
    IdCorrelativo               BIGINT,
    TipoTramite                 VARCHAR(4),
    Estado                      VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRegionalCorrelativo)
)ENGINE=INNODB
;

ALTER TABLE RegionalCorrelativo ADD CONSTRAINT RefRegional526
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;

ALTER TABLE RegionalCorrelativo ADD CONSTRAINT RefCorrelativo527
    FOREIGN KEY (IdCorrelativo)
    REFERENCES Correlativo(IdCorrelativo);


# 2 Modificar la Tabla Correlativo

select 'Modificacion Tabla Correlativo';

ALTER TABLE Correlativo 
ADD COLUMN Gestion VARCHAR(5) NULL AFTER Separador;

delete from Correlativo where IdCorrelativo >= 2;

INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (2,'Decreto',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (3,'NumeroTitulo',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (4,'NumeroPublicacion',1,0, NULL, NULL, @IdUsuario, now());
INSERT INTO Correlativo (IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Usuario, FechaUltimaModificacion) VALUES (5,'NumeroResolucion',1,0, NULL, '-', @IdUsuario, now());


# 3 Crear el procedimiento generarregistrosgestion

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
          DECLARE vt_idCorrelativoInicial BIGINT DEFAULT vt_idCorrelativo;
          DECLARE cr_regional CURSOR FOR
            select IdRegional
            from Regional
            where IdRegional <= 4;

          DECLARE CONTINUE HANDLER FOR NOT FOUND SET finRegional = 1;

          OPEN cr_regional;

          recorre_cursor_regional:
          LOOP
            FETCH cr_regional INTO vt_idRegional;
            IF (finRegional = 1) THEN
              LEAVE recorre_cursor_regional;
            END IF;

            -- select vt_idRegional;


          -- Insertar un registro en Correlativo
          INSERT INTO Correlativo(IdCorrelativo, NombreTabla, Incremento, UltimoNumeroAsignado, Acronimo, Separador, Gestion, Usuario, FechaUltimaModificacion)
          VALUES (vt_idCorrelativo, vt_nombreTabla, 1, 1, vt_tipoTramite, '-', '2015', vt_idUsuario, now());

          -- Insertar un registro en RegionalCorrelativo
          INSERT INTO RegionalCorrelativo (IdRegional, IdCorrelativo, TipoTramite, Estado, Usuario, FechaUltimaModificacion)
          VALUES(vt_idRegional, vt_idCorrelativo, vt_tipoTramite, 'AC', vt_idUsuario, now());
          
          set vt_idCorrelativo := vt_idCorrelativo + 1;

          END LOOP recorre_cursor_regional;

          CLOSE cr_regional;

          -- Insertar un registro en RegionalCorrelativo
          INSERT INTO RegionalCorrelativo (IdRegional, IdCorrelativo, TipoTramite, Estado, Usuario, FechaUltimaModificacion)
          VALUES(5, vt_idCorrelativoInicial, vt_tipoTramite, 'AC', vt_idUsuario, now());

          INSERT INTO RegionalCorrelativo (IdRegional, IdCorrelativo, TipoTramite, Estado, Usuario, FechaUltimaModificacion)
          VALUES(6, vt_idCorrelativoInicial, vt_tipoTramite, 'AC', vt_idUsuario, now());


        END;
        
        


      END LOOP recorre_cursor;


  END;






DROP TEMPORARY TABLE tmpTiposTramite;




END;
//


DELIMITER ;


# 4 Crear el procedimiento generarregistrosgestion

select 'Ejecución procedimiento almacenado generarregistrosgestion gestión 2015';

CALL generarregistrosgestion(2015);




/******************************************************************************/

/******************************************
Actividad Creación de la tabla  PoderDepositado para verificación de poderes
Responsable: Levi Laura Fecha: 02-12-2015
*/


select 'Crear la tabla PoderDepositado';

# 3. Crear la tabla PoderDepositado
CREATE TABLE PoderDepositado(
    IdPoderDepositado      BIGINT          AUTO_INCREMENT,
    Tramite     	   VARCHAR(30),
    NumeroTestimonio           VARCHAR(50),
    FechaTestimonio            DATETIME,
    NombreNotario              VARCHAR(500),
    NombreTitular              TEXT,
    DomicilioTitular           TEXT,
    NombreApoderado            VARCHAR(500),
    PoderRevocado	       VARCHAR(10),
    Observaciones              TEXT,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPoderDepositado)
    
)ENGINE=INNODB
;

# 4. Crear la tabla Poderes efectuados exclusivos para mostrar datos migrados.
CREATE TABLE PoderesEfectuados(
    IdPoderEfectuado      BIGINT          AUTO_INCREMENT,
    TramiteEfectuado            VARCHAR(30),     
    TramiteDepositado     	   VARCHAR(30),
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPoderEfectuado)
    
)ENGINE=INNODB
;


