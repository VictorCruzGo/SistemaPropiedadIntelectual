--
-- ER/Studio 8.0 SQL Code Generation
-- Company :      SENAPI
-- Project :      ModeloBDPI final_ver001.dm1
-- Author :       SENAPI
--
-- Date Created : Thursday, December 17, 2015 10:51:08
-- Target DBMS : MySQL 5.x
--

-- 
-- TABLE: AnalisisEtapa 
--

CREATE TABLE AnalisisEtapa(
    IdAnalisisEtapa            BIGINT          AUTO_INCREMENT,
    IdTramiteFlujoEtapa        BIGINT,
    Titulo                     VARCHAR(250),
    Pie                        TEXT,
    CodigoTramite              VARCHAR(10),
    NombreTramite              VARCHAR(10),
    FechaRegistro              DATETIME,
    Plazo                      INT,
    EstadoEtapa                VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdAnalisisEtapa)
)ENGINE=INNODB
;



-- 
-- TABLE: AnalisisEtapaPlanilla 
--

CREATE TABLE AnalisisEtapaPlanilla(
    IdAnalisisEtapa            BIGINT      AUTO_INCREMENT,
    IdFlujoEtapa               BIGINT      NOT NULL,
    VistoBueno                 BIT(1),
    NecesitaDerivacion         BIT(1),
    NecesitaAprobacion         BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdAnalisisEtapa)
)ENGINE=INNODB
;



-- 
-- TABLE: AnalisisPersona 
--

CREATE TABLE AnalisisPersona(
    IdAnalisisPersona          BIGINT        AUTO_INCREMENT,
    IdAnalisisEtapa            BIGINT        NOT NULL,
    IdPersona                  INT,
    TipoPersonaAnalisis        VARCHAR(4),
    EstadoExamen               VARCHAR(4),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdAnalisisPersona)
)ENGINE=INNODB
;



-- 
-- TABLE: AnotacionPreventiva 
--

CREATE TABLE AnotacionPreventiva(
    IdAnotacionPreventiva      BIGINT      AUTO_INCREMENT,
    IdTramite                  BIGINT      NOT NULL,
    FechaSolicitud             DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdAnotacionPreventiva)
)ENGINE=INNODB
;



-- 
-- TABLE: ArchivoTxtNiza 
--

CREATE TABLE ArchivoTxtNiza(
    IdArchivoTxtNiza      BIGINT    AUTO_INCREMENT,
    IdSMSignoClaseNiza    BIGINT    NOT NULL,
    ArchivoTxt            BLOB,
    PRIMARY KEY (IdArchivoTxtNiza)
)ENGINE=INNODB
;



-- 
-- TABLE: Auditoria 
--

CREATE TABLE Auditoria(
    IdAuditoria      BIGINT          AUTO_INCREMENT,
    Tabla            VARCHAR(100),
    IdRegistro       BIGINT,
    Etapa            VARCHAR(4),
    IdUsuario        BIGINT,
    Fecha            DATETIME,
    TipoOperacion    VARCHAR(4),
    DireccionIP      VARCHAR(50),
    Dato             VARCHAR(255),
    Detalle          VARCHAR(255),
    Estado           VARCHAR(2),
    PRIMARY KEY (IdAuditoria)
)ENGINE=INNODB
;



-- 
-- TABLE: ClaseContrato 
--

CREATE TABLE ClaseContrato(
    IdClaseContrato            BIGINT        AUTO_INCREMENT,
    IdContratos                BIGINT        NOT NULL,
    TipoClaseContrato          VARCHAR(4),
    Otro                       TEXT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdClaseContrato)
)ENGINE=INNODB
;



-- 
-- TABLE: ClaseNiza 
--

CREATE TABLE ClaseNiza(
    IdClaseNiza                BIGINT           AUTO_INCREMENT,
    NumeroClaseNiza            VARCHAR(20),
    TiposClaseNiza             VARCHAR(500),
    Vigente                    BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Tipo                       BIT(1),
    NotaTipoClaseNiza          VARCHAR(1000),
    NumeroEdicion              VARCHAR(10),
    Version                    VARCHAR(10),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdClaseNiza)
)ENGINE=INNODB
;



-- 
-- TABLE: ClaseViena 
--

CREATE TABLE ClaseViena(
    IdClaseViena               BIGINT          AUTO_INCREMENT,
    Categoria                  VARCHAR(2),
    Division                   VARCHAR(2),
    Seccion                    VARCHAR(2),
    Nombre                     VARCHAR(150),
    Descripcion                VARCHAR(255),
    Vigente                    BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdClaseViena)
)ENGINE=INNODB
;



-- 
-- TABLE: Clasificador 
--

CREATE TABLE Clasificador(
    IdClasificador             BIGINT          AUTO_INCREMENT,
    Idioma                     VARCHAR(5),
    Dominio                    VARCHAR(100),
    Codigo                     VARCHAR(4),
    DominioPadre               VARCHAR(100),
    Nombre                     VARCHAR(100),
    Descripcion                VARCHAR(255),
    Orden                      INT,
    Vigente                    BIT(1),
    FechaCreacion              DATETIME,
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdClasificador)
)ENGINE=INNODB
;



-- 
-- TABLE: Correlativo 
--

CREATE TABLE Correlativo(
    IdCorrelativo              BIGINT          AUTO_INCREMENT,
    NombreTabla                VARCHAR(100),
    Incremento                 BIGINT,
    UltimoNumeroAsignado       BIGINT,
    Acronimo                   VARCHAR(5),
    Separador                  VARCHAR(5),
    Gestion                    VARCHAR(5),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdCorrelativo)
)ENGINE=INNODB
;



-- 
-- TABLE: DAAutorFonograma 
--

CREATE TABLE DAAutorFonograma(
    IdArtistas                 BIGINT        AUTO_INCREMENT,
    IdFonograma                BIGINT        NOT NULL,
    TipoAutor                  VARCHAR(4),
    IdPersona                  INT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdArtistas)
)ENGINE=INNODB
;



-- 
-- TABLE: DACaracterObra 
--

CREATE TABLE DACaracterObra(
    IdCaracterObra             BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    CaracterObra               VARCHAR(4)      NOT NULL,
    Especificar                VARCHAR(100),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdCaracterObra)
)ENGINE=INNODB
;



-- 
-- TABLE: DACategoriaArtistica 
--

CREATE TABLE DACategoriaArtistica(
    IdCategoriaArtistica       BIGINT          AUTO_INCREMENT,
    IdObraArtistica            BIGINT          NOT NULL,
    CategoriaArtistica         VARCHAR(4),
    Otro                       VARCHAR(150),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdCategoriaArtistica)
)ENGINE=INNODB
;



-- 
-- TABLE: DAClaseFonograma 
--

CREATE TABLE DAClaseFonograma(
    IdClaseFonograma           BIGINT          AUTO_INCREMENT,
    IdFonograma                BIGINT          NOT NULL,
    ClaseIdentificacion        VARCHAR(4),
    Otro                       VARCHAR(100),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdClaseFonograma)
)ENGINE=INNODB
;



-- 
-- TABLE: DAContratos 
--

CREATE TABLE DAContratos(
    IdContratos                BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Objeto                     TEXT,
    ObraContratosValor         VARCHAR(4),
    Valor                      FLOAT(8, 0),
    DuracionContrato           VARCHAR(100),
    PaisContrato               VARCHAR(4),
    CiudadContrato             VARCHAR(4),
    FechaContrato              DATE,
    Aclaracion                 TEXT,
    EspecificarClase           TEXT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdContratos)
)ENGINE=INNODB
;



-- 
-- TABLE: DAContratosPartes 
--

CREATE TABLE DAContratosPartes(
    IdContratosPartes          BIGINT      AUTO_INCREMENT,
    IdContratos                BIGINT      NOT NULL,
    Parte                      CHAR(1)     NOT NULL,
    Empresa                    BIT(1),
    IdEmpresa                  INT,
    IdPersona                  INT,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdContratosPartes)
)ENGINE=INNODB
;



-- 
-- TABLE: DADerechosAutor 
--

CREATE TABLE DADerechosAutor(
    IdTramite                  BIGINT          NOT NULL,
    TituloCompilacion          VARCHAR(200),
    TipoObra                   VARCHAR(4)      NOT NULL,
    Titulo                     VARCHAR(255)    NOT NULL,
    AnioCreacion               INT,
    AutorizaExibicion          BIT(1),
    AutoizaReproduccion        BIT(1),
    DocumentacionAdjunta       TEXT,
    ObservacionGeneral         TEXT,
    FechaCreacion              DATE,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME        NOT NULL,
    PRIMARY KEY (IdTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: DAFonograma 
--

CREATE TABLE DAFonograma(
    IdFonograma                BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Observaciones              TEXT,
    TituloObra                 VARCHAR(150),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFonograma)
)ENGINE=INNODB
;



-- 
-- TABLE: DAObraArtistica 
--

CREATE TABLE DAObraArtistica(
    IdObraArtistica            BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Genero                     VARCHAR(100),
    Ritmo                      VARCHAR(100),
    Duracion                   VARCHAR(100),
    TipoPublicacionObra        VARCHAR(4),
    AnioPublicacion            DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdObraArtistica)
)ENGINE=INNODB
;



-- 
-- TABLE: DAObraAudiovisual 
--

CREATE TABLE DAObraAudiovisual(
    IdObraAudiovisual          BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    TituloEspaniol             VARCHAR(150),
    Nacionalidad               VARCHAR(4),
    Genero                     VARCHAR(150),
    Clasificacion              VARCHAR(100),
    FechaTerminacion           DATETIME,
    Duracion                   VARCHAR(50),
    Metraje                    VARCHAR(50),
    Formato                    VARCHAR(100),
    FechaExibicion             DATETIME,
    Sinopsis                   TEXT,
    Titularidad                TEXT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdObraAudiovisual)
)ENGINE=INNODB
;



-- 
-- TABLE: DAObraLiteraria 
--

CREATE TABLE DAObraLiteraria(
    IdObraLiteraria            BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    AmbitoLiterario            VARCHAR(4),
    Especificaciones           VARCHAR(255),
    ObraEditada                BIT(1),
    FechaEdicion               DATETIME,
    Pais                       VARCHAR(4),
    NumeroEdicion              VARCHAR(100),
    Tiraje                     VARCHAR(100),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdObraLiteraria)
)ENGINE=INNODB
;



-- 
-- TABLE: DAPersonaDatos 
--

CREATE TABLE DAPersonaDatos(
    IdPersona                  BIGINT         NOT NULL,
    NombrePublicacion          VARCHAR(10),
    Nacionalidad               VARCHAR(4),
    FechaDefuncion             DATETIME,
    Seudonimo                  VARCHAR(40),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPersona)
)ENGINE=INNODB
;



-- 
-- TABLE: DAProgramaComputacion 
--

CREATE TABLE DAProgramaComputacion(
    IdProgramaComputacion      BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Pais                       VARCHAR(4),
    TipoObraPrograma           VARCHAR(4),
    AnioPublicacion            DATETIME,
    Descripcion                VARCHAR(255),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdProgramaComputacion)
)ENGINE=INNODB
;



-- 
-- TABLE: DASoporteAportado 
--

CREATE TABLE DASoporteAportado(
    IdSoporteAportado          BIGINT        AUTO_INCREMENT,
    IdProgramaComputacion      BIGINT        NOT NULL,
    TipoSoporte                VARCHAR(4),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSoporteAportado)
)ENGINE=INNODB
;



-- 
-- TABLE: DATipoPersona 
--

CREATE TABLE DATipoPersona(
    IdPersonaInterviene        BIGINT        AUTO_INCREMENT,
    IdTramite                  BIGINT        NOT NULL,
    TipoArtistaAutor           VARCHAR(4),
    TipoEspecifico             VARCHAR(4),
    IdPersona                  INT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPersonaInterviene)
)ENGINE=INNODB
;



-- 
-- TABLE: DatoElementoFormulario 
--

CREATE TABLE DatoElementoFormulario(
    IdDatoElementoFormulario    BIGINT          AUTO_INCREMENT,
    IdAnalisisEtapa             BIGINT          NOT NULL,
    IdFormularioTramite         BIGINT,
    IdTramite                   BIGINT,
    Pestania                    VARCHAR(150),
    Seccion                     INT,
    Fila                        INT,
    TipoElemento                VARCHAR(10),
    NombreElemento              TEXT,
    Orden                       INT,
    IdPadre                     BIGINT,
    Respuesta                   TEXT,
    OpcionRespuesta             TEXT,
    Estado                      VARCHAR(2),
    Usuario                     BIGINT,
    FechaUltimaModificacion     DATETIME,
    PRIMARY KEY (IdDatoElementoFormulario)
)ENGINE=INNODB
;



-- 
-- TABLE: DatosContacto 
--

CREATE TABLE DatosContacto(
    IdContacto                 BIGINT          AUTO_INCREMENT,
    IdPersona                  BIGINT,
    IdEmpresa                  BIGINT,
    Notificar                  BIT(1),
    Dato                       VARCHAR(200),
    TipoContacto               VARCHAR(10),
    Vigente                    BIT(1),
    IdDatoContactoModificar    BIGINT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdContacto)
)ENGINE=INNODB
;



-- 
-- TABLE: DatoTramiteVentanillaEForma 
--

CREATE TABLE DatoTramiteVentanillaEForma(
    IdDatoTramiteVentanillaEForma    BIGINT          AUTO_INCREMENT,
    IdAnalisisEtapa                  BIGINT          NOT NULL,
    TipoRequisito                    VARCHAR(5),
    Codigo                           VARCHAR(5),
    Descripcion                      TEXT,
    Presento                         BIT(1),
    Observacion                      VARCHAR(250),
    Posicion                         INT,
    Usuario                          BIGINT,
    FechaUltimaModificacion          DATETIME,
    PRIMARY KEY (IdDatoTramiteVentanillaEForma)
)ENGINE=INNODB
;



-- 
-- TABLE: Deposito 
--

CREATE TABLE Deposito(
    IdDeposito                 BIGINT            AUTO_INCREMENT,
    NumeroDeposito             VARCHAR(25),
    Banco                      VARCHAR(50),
    Monto                      DECIMAL(19, 2),
    FechaDeposito              DATETIME,
    PersonaDeposito            VARCHAR(250),
    Saldo                      DECIMAL(19, 2),
    EstadoDeposito             CHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdDeposito)
)ENGINE=INNODB
;



-- 
-- TABLE: DetalleRequisitoPlantilla 
--

CREATE TABLE DetalleRequisitoPlantilla(
    IdDetalleRequisitoPlantilla       BIGINT          AUTO_INCREMENT,
    IdRequisitoFlujoEtapaPlantilla    BIGINT          NOT NULL,
    Requisito                         TEXT,
    Seccion                           VARCHAR(200),
    Orden                             INT,
    TipoRespuestaRequisito            VARCHAR(4),
    Valores                           VARCHAR(50),
    Fila                              VARCHAR(50),
    TieneDetalle                      BIT(1),
    FechaCreacion                     DATETIME,
    Vigente                           BIT(1),
    FechaInicio                       DATETIME,
    FechaFin                          DATETIME,
    Usuario                           BIGINT,
    FechaUltimaModificacion           DATETIME,
    PRIMARY KEY (IdDetalleRequisitoPlantilla)
)ENGINE=INNODB
;



-- 
-- TABLE: DetalleTitulo 
--

CREATE TABLE DetalleTitulo(
    IdDetalleTitulo    BIGINT         AUTO_INCREMENT,
    IdRecibo           BIGINT         NOT NULL,
    Serie              VARCHAR(15),
    NroTitulo          INT,
    PRIMARY KEY (IdDetalleTitulo)
)ENGINE=INNODB
;



-- 
-- TABLE: DIGArchivoDocumento 
--

CREATE TABLE DIGArchivoDocumento(
    IdDIGArchivoDocumento    BIGINT      AUTO_INCREMENT,
    IdDocumento              BIGINT      NOT NULL,
    Imagen                   LONGBLOB,
    PRIMARY KEY (IdDIGArchivoDocumento)
)ENGINE=INNODB
;



-- 
-- TABLE: Direccion 
--

CREATE TABLE Direccion(
    IdDireccion                BIGINT            AUTO_INCREMENT,
    IdTramite                  BIGINT            NOT NULL,
    Pais                       VARCHAR(4),
    TipoCiudadNotificacion     VARCHAR(4),
    ReferenciaDireccion        VARCHAR(250),
    ZonaBarrio                 VARCHAR(150),
    AvenidaCalle               VARCHAR(200),
    Numero                     VARCHAR(10),
    Edificio                   VARCHAR(100),
    Piso                       INT,
    Dpto                       VARCHAR(10),
    CoordenadaX                DOUBLE(20, 18),
    CoordenadaY                DOUBLE(20, 18),
    FechaCreacion              DATETIME,
    Vigente                    BIT(1),
    Prioridad                  VARCHAR(100),
    CorreoElectronico          VARCHAR(100)      NOT NULL,
    TelefonoReferencia         VARCHAR(100),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdDireccion)
)ENGINE=INNODB
;



-- 
-- TABLE: Documento 
--

CREATE TABLE Documento(
    IdDocumento                BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    IdAnalisisEtapa            BIGINT,
    NombreArchivo              VARCHAR(250),
    Descripcion                VARCHAR(255),
    NroFolios                  INT,
    FechaCreacion              DATETIME,
    TipoDocumentacion          VARCHAR(4),
    TipoArchivo                VARCHAR(4),
    NumeroImpresiones          INT,
    Vigente                    BIT(1),
    FechaUltimaModificacion    DATETIME,
    Usuario                    BIGINT,
    PRIMARY KEY (IdDocumento)
)ENGINE=INNODB
;



-- 
-- TABLE: DocumentoPublicacion 
--

CREATE TABLE DocumentoPublicacion(
    IdDocumentoPublicacion    BIGINT          AUTO_INCREMENT,
    IdPublicacion             BIGINT          NOT NULL,
    NombreArchivo             VARCHAR(100),
    ArchivoPublicacion        LONGBLOB,
    EstadoPublicacion         VARCHAR(4),
    PRIMARY KEY (IdDocumentoPublicacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Dosificacion 
--

CREATE TABLE Dosificacion(
    IdDosificacion             BIGINT      AUTO_INCREMENT,
    ValorInicial               INT,
    ValorFinal                 INT,
    FechaDosificacion          DATETIME,
    Siguiente                  INT,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdDosificacion)
)ENGINE=INNODB
;



-- 
-- TABLE: DosificacionTasa 
--

CREATE TABLE DosificacionTasa(
    IdDosificacionTasa         BIGINT         AUTO_INCREMENT,
    IdTasa                     BIGINT         NOT NULL,
    IdDosificacion             BIGINT         NOT NULL,
    IdRegional                 BIGINT         NOT NULL,
    Vigente                    BIT(1),
    FechaCreacion              DATETIME,
    Serie                      VARCHAR(15),
    TipoRecibo                 VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdDosificacionTasa)
)ENGINE=INNODB
;



-- 
-- TABLE: ElementoFormularioTramite 
--

CREATE TABLE ElementoFormularioTramite(
    IdElementoFormularioTramite    BIGINT          AUTO_INCREMENT,
    IdFormularioTramite            BIGINT          NOT NULL,
    Pestania                       VARCHAR(150),
    Seccion                        INT,
    Fila                           INT,
    TipoElemento                   VARCHAR(50),
    NombreElemento                 TEXT,
    Orden                          INT,
    IdPadre                        BIGINT,
    FechaInicio                    DATETIME,
    FechaFin                       DATETIME,
    Vigente                        BIT(1),
    Usuario                        BIGINT,
    FechaUltimaModificacion        DATETIME,
    PRIMARY KEY (IdElementoFormularioTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: Empresa 
--

CREATE TABLE Empresa(
    IdEmpresa                  BIGINT          AUTO_INCREMENT,
    NombreRepresentante        VARCHAR(150)    NOT NULL,
    TipoDocumentoEmpresa       VARCHAR(4),
    NumeroDocumento            VARCHAR(200),
    LugarExpedicion            VARCHAR(4),
    PaisEmpresa                VARCHAR(4),
    Bloqueado                  BIT(1),
    Vigente                    BIT(1),
    FechaCreacion              DATETIME,
    IdEmpresaModificar         BIGINT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdEmpresa)
)ENGINE=INNODB
;



-- 
-- TABLE: Entrega 
--

CREATE TABLE Entrega(
    IdEntrega                  BIGINT          AUTO_INCREMENT,
    IdDocumento                BIGINT          NOT NULL,
    Observacion                VARCHAR(250),
    FechaEntrega               DATETIME,
    RecibidoPor                VARCHAR(100),
    TipoDocumento              VARCHAR(4),
    NumeroDocumento            VARCHAR(15),
    LugarExpedicion            VARCHAR(4),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdEntrega)
)ENGINE=INNODB
;



-- 
-- TABLE: ErrorAplicacion 
--

CREATE TABLE ErrorAplicacion(
    IdErrorAplicacion    BIGINT      AUTO_INCREMENT,
    IdUsuario            BIGINT,
    IdModulo             BIGINT,
    Fecha                DATETIME,
    Descripcion          TEXT,
    PRIMARY KEY (IdErrorAplicacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Expediente 
--

CREATE TABLE Expediente(
    IdExpediente               BIGINT          AUTO_INCREMENT,
    CodigoTramite              VARCHAR(20),
    NumeroRegistro             VARCHAR(20),
    NumeroPublicacion          VARCHAR(20),
    AreaTramite                VARCHAR(4),
    Observacion                VARCHAR(255),
    FechaCreacionRegistro      DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdExpediente)
)ENGINE=INNODB
;



-- 
-- TABLE: ExpedienteAnotacion 
--

CREATE TABLE ExpedienteAnotacion(
    IdExpedienteAnotacion      BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    IdAnotacionPreventiva      BIGINT          NOT NULL,
    Observacion                VARCHAR(255),
    EstadoAnotacion            VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdExpedienteAnotacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Flujo 
--

CREATE TABLE Flujo(
    IdFlujo                    BIGINT          AUTO_INCREMENT,
    NombreFlujo                VARCHAR(100),
    Vigente                    BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    AreaTramite                VARCHAR(4)      NOT NULL,
    TipoTramite                VARCHAR(4)      NOT NULL,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFlujo)
)ENGINE=INNODB
;



-- 
-- TABLE: FlujoEtapa 
--

CREATE TABLE FlujoEtapa(
    IdFlujoEtapa               BIGINT          AUTO_INCREMENT,
    IdFlujo                    BIGINT          NOT NULL,
    IdRol                      BIGINT          NOT NULL,
    Orden                      INT,
    EtapaTramite               VARCHAR(4),
    Plazo                      INT,
    UnidadTiempo               VARCHAR(4),
    Vigente                    BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Titulo                     VARCHAR(250),
    Pie                        TEXT,
    CodigoTramite              VARCHAR(10),
    NombreTramite              VARCHAR(10),
    Padre                      BIGINT,
    EstadoEtapa                VARCHAR(4),
    Revision                   BIT(1),
    CrearNuevoAnalisis         BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFlujoEtapa)
)ENGINE=INNODB
;



-- 
-- TABLE: FlujoEtapaProrroga 
--

CREATE TABLE FlujoEtapaProrroga(
    IdFlujoEtapaProrroga         BIGINT        AUTO_INCREMENT,
    IdFlujoEtapa                 BIGINT        NOT NULL,
    UnidadTiempo                 VARCHAR(4),
    CantidadTiempo               INT,
    FechaInicio                  DATE          NOT NULL,
    FechaFinalizacion            DATE          NOT NULL,
    FechaCreacionRegistro        DATETIME,
    FechaModificacionRegistro    DATETIME,
    Usuario                      BIGINT,
    FechaUltimaModificacion      DATETIME,
    PRIMARY KEY (IdFlujoEtapaProrroga)
)ENGINE=INNODB
;



-- 
-- TABLE: FlujoPagina 
--

CREATE TABLE FlujoPagina(
    IdFlujoPagina              BIGINT        AUTO_INCREMENT,
    IdFlujo                    BIGINT        NOT NULL,
    IdPagina                   BIGINT        NOT NULL,
    Orden                      INT,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFlujoPagina)
)ENGINE=INNODB
;



-- 
-- TABLE: FlujoTasa 
--

CREATE TABLE FlujoTasa(
    IdFlujoTasa                BIGINT         AUTO_INCREMENT,
    IdFlujo                    BIGINT         NOT NULL,
    IdRegional                 BIGINT         NOT NULL,
    ConceptoPago               VARCHAR(4),
    Monto                      FLOAT(8, 0),
    Observacion                TEXT,
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFlujoTasa)
)ENGINE=INNODB
;



-- 
-- TABLE: FormularioTramite 
--

CREATE TABLE FormularioTramite(
    IdFormularioTramite        BIGINT          AUTO_INCREMENT,
    IdFlujoEtapa               BIGINT          NOT NULL,
    Codigo                     VARCHAR(10),
    NombreFormulario           VARCHAR(100),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFormularioTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: FusionFracionamiento 
--

CREATE TABLE FusionFracionamiento(
    IdFusionFraccionamiento    BIGINT         AUTO_INCREMENT,
    IdTramiteUno               VARCHAR(20),
    IdTramiteDos               VARCHAR(20),
    FusionFraccionamiento      VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFusionFraccionamiento)
)ENGINE=INNODB
;



-- 
-- TABLE: HistoricoDocumento 
--

CREATE TABLE HistoricoDocumento(
    IdHistoricoDocumento       BIGINT        AUTO_INCREMENT,
    IdDocumento                BIGINT        NOT NULL,
    Fecha                      DATETIME,
    EstadoDocumento            VARCHAR(4),
    Observacion                TEXT,
    IdPersona                  INT           NOT NULL,
    IdTramiteFlujoEtapa        INT           NOT NULL,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdHistoricoDocumento)
)ENGINE=INNODB
;



-- 
-- TABLE: Horario 
--

CREATE TABLE Horario(
    IdHorario                  BIGINT          AUTO_INCREMENT,
    Nombre                     VARCHAR(100),
    Descripcion                VARCHAR(255),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdHorario)
)ENGINE=INNODB
;



-- 
-- TABLE: HorarioDia 
--

CREATE TABLE HorarioDia(
    IdHorarioDia               BIGINT        AUTO_INCREMENT,
    IdHorario                  BIGINT        NOT NULL,
    DiaSemana                  VARCHAR(4),
    HoraInicio                 DATETIME,
    HoraFin                    DATETIME,
    Tolerancia                 INT,
    TipoHora                   VARCHAR(4),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdHorarioDia)
)ENGINE=INNODB
;



-- 
-- TABLE: Infraccion 
--

CREATE TABLE Infraccion(
    IdInfraccion               BIGINT          AUTO_INCREMENT,
    IdTramiteInfraccion        BIGINT          NOT NULL,
    TipoInfraccion             VARCHAR(4),
    NombreDenunciado           VARCHAR(200),
    MedidasFrontera            BIT(1),
    Lugar                      VARCHAR(200),
    Departamento               VARCHAR(4),
    EstadoProceso              VARCHAR(4),
    EstadoRegistroTabla        VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdInfraccion)
)ENGINE=INNODB
;



-- 
-- TABLE: Institucion 
--

CREATE TABLE Institucion(
    IdInstitucion              BIGINT          AUTO_INCREMENT,
    Codigo                     VARCHAR(3),
    Nombre                     VARCHAR(200),
    Acronimo                   VARCHAR(30),
    SerieRegistroVigente       VARCHAR(2)      NOT NULL,
    CorrelativoRegistro        BIGINT,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdInstitucion)
)ENGINE=INNODB
;



-- 
-- TABLE: Mascara 
--

CREATE TABLE Mascara(
    IdMascara                  BIGINT         AUTO_INCREMENT,
    TamanioNivel               INT,
    Mascara                    VARCHAR(50),
    GrupoNivel                 VARCHAR(4),
    FechaCreacion              DATETIME,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdMascara)
)ENGINE=INNODB
;



-- 
-- TABLE: MensajeAplicacion 
--

CREATE TABLE MensajeAplicacion(
    IdMensajeAplicacion        BIGINT          AUTO_INCREMENT,
    IdModulo                   BIGINT          NOT NULL,
    Orden                      BIGINT,
    Idioma                     VARCHAR(50),
    Descripcion                VARCHAR(200),
    FechaCreacion              DATETIME,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdMensajeAplicacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Menu 
--

CREATE TABLE Menu(
    IdMenu                     BIGINT          AUTO_INCREMENT,
    IdPagina                   BIGINT          NOT NULL,
    Idioma                     VARCHAR(5),
    IdMenuPadre                BIGINT,
    Codigo                     CHAR(20),
    Nombre                     VARCHAR(255),
    Descripcion                VARCHAR(255),
    Nivel                      INT,
    Orden                      INT,
    Vigente                    BIT(1),
    Visible                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdMenu)
)ENGINE=INNODB
;



-- 
-- TABLE: Modificacion 
--

CREATE TABLE Modificacion(
    IdModificacion             BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    TipoModificacion           VARCHAR(4),
    NombreTitular              VARCHAR(500),
    DomicilioTitular           VARCHAR(200),
    SignoDistintivoTitular     VARCHAR(200),
    TipoSignoTitular           VARCHAR(4),
    ClaseTitular               VARCHAR(10),
    NuevaDireccion             VARCHAR(200),
    NuevaNacionalidad          VARCHAR(4),
    FusionParticipante         TEXT,
    FechaInicioLicencia        DATETIME,
    FechaFinLicencia           DATETIME,
    LicenciaIndefinida         BIT(1),
    NumeroRegistro             VARCHAR(20),
    SerieNumeroRegistro        VARCHAR(4),
    CodigoSM                   VARCHAR(20),
    NumeroPublicacion          INT,
    NumeroUltimaRenovacion     VARCHAR(20),
    LemaMarca                  VARCHAR(200),
    RegistroLemaMarca          VARCHAR(20),
    SerieRegistroLemaMarca     VARCHAR(4),
    FechaRegistroLemaMarca     DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdModificacion)
)ENGINE=INNODB
;



-- 
-- TABLE: ModificacionDatosContacto 
--

CREATE TABLE ModificacionDatosContacto(
    IdModificacionDatosContacto    BIGINT          AUTO_INCREMENT,
    IdOTSolicitadoModificacion     BIGINT          NOT NULL,
    IdPersona                      BIGINT,
    IdEmpresa                      BIGINT,
    Notificar                      BIT(1),
    Dato                           VARCHAR(200),
    TipoContacto                   VARCHAR(10),
    Vigente                        BIT(1),
    Usuario                        BIGINT,
    FechaUltimaModificacion        DATETIME,
    PRIMARY KEY (IdModificacionDatosContacto)
)ENGINE=INNODB
;



-- 
-- TABLE: Modulo 
--

CREATE TABLE Modulo(
    IdModulo                   BIGINT          AUTO_INCREMENT,
    IdMascara                  BIGINT          NOT NULL,
    IdPadreModulo              BIGINT,
    CodigoModulo               VARCHAR(50),
    Descripcion                VARCHAR(200),
    Nivel                      INT,
    FechaCreacion              DATETIME,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdModulo)
)ENGINE=INNODB
;



-- 
-- TABLE: NoLaboral 
--

CREATE TABLE NoLaboral(
    IdNoLaboral                BIGINT          AUTO_INCREMENT,
    Fecha                      DATETIME        NOT NULL,
    Feriado                    BIT(1),
    Vigente                    BIT(1),
    IdRegional                 BIGINT,
    Descripcion                VARCHAR(250),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdNoLaboral)
)ENGINE=INNODB
;



-- 
-- TABLE: Notificacion 
--

CREATE TABLE Notificacion(
    IdNotificacion                BIGINT          AUTO_INCREMENT,
    IdTramite                     BIGINT,
    TipoNotificacion              VARCHAR(4),
    FechaSolicitudNotificacion    DATETIME,
    FechaNotificacion             DATETIME,
    EstadoNotificacion            VARCHAR(4),
    PersonaNotificada             VARCHAR(150),
    Observacion                   TEXT,
    UsuarioSolicitante            BIGINT,
    IdUsuarioAsignado             BIGINT,
    FechaCreacion                 DATETIME,
    FechaConclusion               DATETIME,
    FechaRecepcion                DATETIME,
    Vigente                       BIT(1),
    Usuario                       BIGINT,
    FechaUltimaModificacion       DATETIME,
    PRIMARY KEY (IdNotificacion)
)ENGINE=INNODB
;



-- 
-- TABLE: NotificacionDocumento 
--

CREATE TABLE NotificacionDocumento(
    IdNotificacionDocumento             BIGINT          AUTO_INCREMENT,
    IdNotificacion                      BIGINT          NOT NULL,
    IdDocumento                         BIGINT          NOT NULL,
    ObservacionNotificacionDocumento    VARCHAR(400),
    Usuario                             BIGINT,
    FechaUltimaModificacion             DATETIME,
    PRIMARY KEY (IdNotificacionDocumento)
)ENGINE=INNODB
;



-- 
-- TABLE: NotificacionEdicto 
--

CREATE TABLE NotificacionEdicto(
    IdNotificacionEdicto       BIGINT          AUTO_INCREMENT,
    IdNotificacion             BIGINT          NOT NULL,
    DetalleEdicto              TEXT,
    FechaEdicto                DATE,
    FechaJuramento             DATETIME,
    IdPersonaJuramento         INT,
    DetalleJuramento           VARCHAR(255),
    FechaCreacion              DATE,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdNotificacionEdicto)
)ENGINE=INNODB
;



-- 
-- TABLE: NotificadorZona 
--

CREATE TABLE NotificadorZona(
    IdNotificadorZona          BIGINT        AUTO_INCREMENT,
    IdNotificador              BIGINT,
    CodigoZona                 VARCHAR(4),
    NumeroNotificaciones       BIGINT,
    Estado                     VARCHAR(2),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdNotificadorZona)
)ENGINE=INNODB
;



-- 
-- TABLE: ObservacionTramite 
--

CREATE TABLE ObservacionTramite(
    IdObservacionTramite       BIGINT        AUTO_INCREMENT,
    IdTramite                  BIGINT        NOT NULL,
    IdUsuario                  BIGINT,
    EtapaTramite               VARCHAR(4),
    Descripcion                TEXT,
    FechaObservacion           DATETIME,
    Editable                   BIT(1),
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdObservacionTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: Oposicion 
--

CREATE TABLE Oposicion(
    IdOposicion                      BIGINT   AUTO_INCREMENT,
    IdTramiteAOponer           BIGINT          NOT NULL,
    NroGaceta                  VARCHAR(20),
    NroSolicitud               VARCHAR(20),
    Motivo                     VARCHAR(250),
    FechaCreacion              DATETIME,
    IdPersonaAprobo            INT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME
PRIMARY KEY (IdOposicion)
)ENGINE=INNODB
;

-- 
-- TABLE: OposicionTramite 
--

CREATE TABLE OposicionTramite(
    IdOposicionTramite              BIGINT   AUTO_INCREMENT,
    IdOposicion          BIGINT          NOT NULL,
    IdTramite          BIGINT          NOT NULL,
    NroGaceta                  VARCHAR(20),
    NroSolicitud               VARCHAR(20),
    Motivo                     VARCHAR(250),
    FechaCreacion              DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME
   PRIMARY KEY (IdOposicionTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: OTCancelacion 
--

CREATE TABLE OTCancelacion(
    IdCancelacion              BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Clase                      INT,
    Observacion                VARCHAR(255),
    EstadoProceso              DATETIME,
    EstadoRegistroTabla        VARCHAR(4),
    FechaCreacion              DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdCancelacion)
)ENGINE=INNODB
;



-- 
-- TABLE: OTDesistimiento 
--

CREATE TABLE OTDesistimiento(
    IdDesistimiento              BIGINT          AUTO_INCREMENT,
    IdTramite                    BIGINT          NOT NULL,
    FechaInicio                  DATETIME,
    Motivo                       VARCHAR(250),
    TipoDesistimiento            VARCHAR(4),
    EstadoProceso                VARCHAR(4),
    EstadoRegistroTabla          VARCHAR(4),
    FechaCreacionRegistro        DATETIME,
    FechaModificacionRegistro    DATETIME,
    Usuario                      BIGINT,
    FechaUltimaModificacion      DATETIME,
    PRIMARY KEY (IdDesistimiento)
)ENGINE=INNODB
;



-- 
-- TABLE: OTNulidad 
--

CREATE TABLE OTNulidad(
    IdNulidad                  BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    TipoNulidad                VARCHAR(4),
    Observacion                VARCHAR(255),
    EstadoProceso              DATETIME,
    EstadoRegistroTabla        VARCHAR(4),
    FechaCreacion              DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdNulidad)
)ENGINE=INNODB
;



-- 
-- TABLE: OTSolicitadoModificacion 
--

CREATE TABLE OTSolicitadoModificacion(
    IdOTSolicitadoModificacion    BIGINT          AUTO_INCREMENT,
    IdTramite                     BIGINT          NOT NULL,
    TipoModificacion              VARCHAR(4),
    TipoSolicitante               VARCHAR(4),
    Genero                        VARCHAR(4),
    NombreFusion                  VARCHAR(120),
    FechaNacimiento               DATETIME,
    NumeroDocumento               VARCHAR(10),
    LugarExpedicion               VARCHAR(4),
    Nombre                        VARCHAR(40),
    ApellidoPaterno               VARCHAR(40),
    ApellidoMaterno               VARCHAR(40),
    UltimaRenovacion              VARCHAR(20),
    Vigente                       BIT(1),
    Usuario                       BIGINT,
    FechaUltimaModificacion       DATETIME,
    PRIMARY KEY (IdOTSolicitadoModificacion)
)ENGINE=INNODB
;



-- 
-- TABLE: PADepositoCertificacion 
--

CREATE TABLE PADepositoCertificacion(
    IdDepositoCertificacion    BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Descripcion                VARCHAR(255),
    Fecha                      DATETIME,
    Lugar                      VARCHAR(255),
    EsExplotacion              BIT(1),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdDepositoCertificacion)
)ENGINE=INNODB
;



-- 
-- TABLE: PADibujoPatente 
--

CREATE TABLE PADibujoPatente(
    IdDibujoInvencion          BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Archivo                    VARCHAR(255),
    Importante                 BIT(1),
    TipoDibujo                 VARCHAR(4),
    Otro                       VARCHAR(255),
    Tamanio                    FLOAT(8, 0),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdDibujoInvencion)
)ENGINE=INNODB
;



-- 
-- TABLE: PAFormatoPatente 
--

CREATE TABLE PAFormatoPatente(
    IdFormatoInvencion         BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Archivo                    VARCHAR(255),
    Tipo                       VARCHAR(4),
    Tamanio                    FLOAT(8, 0),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdFormatoInvencion)
)ENGINE=INNODB
;



-- 
-- TABLE: Pagina 
--

CREATE TABLE Pagina(
    IdPagina                   BIGINT          AUTO_INCREMENT,
    IdFlujo                    BIGINT,
    Nombre                     VARCHAR(100),
    RutaNavegacion             VARCHAR(200),
    Activo                     BIT(1),
    FechaCreacion              DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPagina)
)ENGINE=INNODB
;



-- 
-- TABLE: PAPatente 
--

CREATE TABLE PAPatente(
    IdTramite                  BIGINT          NOT NULL,
    Tipo                       VARCHAR(4),
    Nombre                     VARCHAR(150),
    Resumen                    TEXT,
    Area                       VARCHAR(200),
    ClasificadorPatente        VARCHAR(4),
    Clasificacion              VARCHAR(200),
    Dibujo                     LONGBLOB,
    TipoDibujo                 VARCHAR(4),
    AnioCreacion               INT,
    GeneroProductos            VARCHAR(150),
    Clase                      VARCHAR(10),
    SubClase                   VARCHAR(10),
    Vigente                    BIT(1),
    IdPadre                    VARCHAR(20),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: PAReinvindicacion 
--

CREATE TABLE PAReinvindicacion(
    IdReinvindicacion          BIGINT        AUTO_INCREMENT,
    IdTramite                  BIGINT        NOT NULL,
    Numero                     INT,
    Fecha                      DATETIME,
    FechaRevision              DATETIME,
    Estado                     VARCHAR(4),
    Vigente                    BIT(1),
    Pais                       VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdReinvindicacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Persona 
--

CREATE TABLE Persona(
    IdPersona                  BIGINT          AUTO_INCREMENT,
    Nombres                    VARCHAR(150)    NOT NULL,
    ApellidoPaterno            VARCHAR(150),
    ApellidoMaterno            VARCHAR(150),
    NumeroDocumento            VARCHAR(100),
    TipoDocumento              VARCHAR(4),
    PaisPersona                VARCHAR(4),
    Bloqueado                  BIT(1),
    LugarExpedicion            VARCHAR(4),
    Genero                     VARCHAR(4),
    FechaNacimiento            DATETIME,
    Vigente                    BIT(1),
    FechaCreacion              DATETIME,
    IdPersonaModificar         BIGINT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPersona)
)ENGINE=INNODB
;



-- 
-- TABLE: PersonaEmpresaTramite 
--

CREATE TABLE PersonaEmpresaTramite(
    IdPersonaSolicitud         BIGINT        AUTO_INCREMENT,
    IdTramite                  BIGINT        NOT NULL,
    IdPersona                  BIGINT,
    IdEmpresa                  BIGINT,
    IdPoder                    BIGINT,
    TipoPersonaSolicitud       VARCHAR(4),
    FechaCreacion              DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPersonaSolicitud)
)ENGINE=INNODB
;



-- 
-- TABLE: Poder 
--

CREATE TABLE Poder(
    IdPoder                    BIGINT          AUTO_INCREMENT,
    TipoRepresentante          VARCHAR(4),
    NumeroPoder                VARCHAR(30),
    Lugar                      VARCHAR(100),
    FechaExpiracionPoder       DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPoder)
)ENGINE=INNODB
;



-- 
-- TABLE: PoderDepositado 
--

CREATE TABLE PoderDepositado(
    IdPoderDepositado          BIGINT          AUTO_INCREMENT,
    Tramite                    VARCHAR(20),
    NumeroTestimonio           VARCHAR(50),
    FechaTestimonio            DATETIME,
    NombreNotario              VARCHAR(500),
    NombreTitular              TEXT,
    DomicilioTitular           TEXT,
    NombreApoderado            VARCHAR(500),
    PoderRevocado              VARCHAR(10),
    Observaciones              TEXT,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPoderDepositado)
)ENGINE=INNODB
;



-- 
-- TABLE: PoderEfectuado 
--

CREATE TABLE PoderEfectuado(
    IdPoderEfectuado           BIGINT         AUTO_INCREMENT,
    TramiteEfectuado           VARCHAR(30),
    TramiteDepositado          VARCHAR(30),
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPoderEfectuado)
)ENGINE=INNODB
;



-- 
-- TABLE: PruebaOposicion 
--

CREATE TABLE PruebaOposicion(
    IdPruebaOposicion          BIGINT          AUTO_INCREMENT,
    NombrePrueba               VARCHAR(150),
    Descripcion                VARCHAR(255),
    TipoPrueba                 VARCHAR(100),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdPruebaOposicion)
)ENGINE=INNODB
;



-- 
-- TABLE: Publicacion 
--

CREATE TABLE Publicacion(
    IdPublicacion               BIGINT          AUTO_INCREMENT,
    Fecha                       DATETIME,
    FechaPublicacionGaceta      DATETIME,
    FechaPublicacionWeb         DATETIME,
    PublicadoWeb                BIT(1),
    InicioNumeroPublicacion     BIGINT,
    FinNumeroPublicacion        BIGINT,
    Observacion                 VARCHAR(250),
    NroGaceta                   INT,
    EstadoPublicacion           VARCHAR(4),
    EstadoProcesoPublicacion    VARCHAR(4),
    FechaCreacionRegistro       DATETIME,
    Usuario                     BIGINT,
    FechaUltimaModificacion     DATETIME,
    PRIMARY KEY (IdPublicacion)
)ENGINE=INNODB
;



-- 
-- TABLE: PublicacionTramite 
--

CREATE TABLE PublicacionTramite(
    IdPublicacionTramite        BIGINT          AUTO_INCREMENT,
    IdPublicacion               BIGINT          NOT NULL,
    IdTramite                   BIGINT          NOT NULL,
    NumeroPublicacion           BIGINT,
    Publicado                   BIT(1),
    Observacion                 VARCHAR(250),
    EstadoPublicacionTramite    VARCHAR(4),
    Usuario                     BIGINT,
    FechaUltimaModificacion     DATETIME,
    PRIMARY KEY (IdPublicacionTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: Recibo 
--

CREATE TABLE Recibo(
    IdRecibo                   BIGINT            AUTO_INCREMENT,
    IdRegional                 BIGINT            NOT NULL,
    IdTasa                     BIGINT            NOT NULL,
    IdTramite                  BIGINT,
    NroRecibo                  INT               NOT NULL,
    FechaEmisionRecibo         DATETIME,
    Serie                      VARCHAR(15)       NOT NULL,
    Monto                      DECIMAL(19, 2),
    EstadoRecibo               VARCHAR(4),
    DatoRecibo                 VARCHAR(250),
    Cantidad                   INT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRecibo)
)ENGINE=INNODB
;



-- 
-- TABLE: ReciboDeposito 
--

CREATE TABLE ReciboDeposito(
    IdReciboDeposito           BIGINT            AUTO_INCREMENT,
    IdRecibo                   BIGINT            NOT NULL,
    IdDeposito                 BIGINT            NOT NULL,
    Monto                      DECIMAL(19, 2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdReciboDeposito)
)ENGINE=INNODB
;



-- 
-- TABLE: Recurso 
--

CREATE TABLE Recurso(
    IdRecurso                  BIGINT          AUTO_INCREMENT,
    IdDocumento                BIGINT          NOT NULL,
    TipoRecurso                VARCHAR(4)      NOT NULL,
    Fecha                      DATETIME,
    Concedido                  BIT(1),
    Observacion                VARCHAR(250),
    FechaAprobacion            DATETIME,
    Aprobado                   BIT(1),
    EstadoProceso              VARCHAR(4),
    FechaCreacionRegistro      DATETIME,
    FechaModificacion          DATETIME,
    IdInmediatoSuperior        INT             NOT NULL,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRecurso)
)ENGINE=INNODB
;



-- 
-- TABLE: Regional 
--

CREATE TABLE Regional(
    IdRegional                 BIGINT          AUTO_INCREMENT,
    Central                    BIT(1)          NOT NULL,
    Nombre                     VARCHAR(100),
    Direccion                  VARCHAR(200),
    Telefono                   VARCHAR(10),
    Fax                        VARCHAR(10),
    TipoCiudadNotificacion     VARCHAR(4)      NOT NULL,
    FechaCreacion              DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRegional)
)ENGINE=INNODB
;



-- 
-- TABLE: RegionalCorrelativo 
--

CREATE TABLE RegionalCorrelativo(
    IdRegionalCorrelativo      BIGINT        AUTO_INCREMENT,
    IdRegional                 BIGINT        NOT NULL,
    IdCorrelativo              BIGINT        NOT NULL,
    TipoTramite                VARCHAR(4),
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRegionalCorrelativo)
)ENGINE=INNODB
;



-- 
-- TABLE: Registro 
--

CREATE TABLE Registro(
    IdRegistro                 BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT,
    NroTitulo                  VARCHAR(20),
    Serie                      VARCHAR(4),
    Registro                   VARCHAR(20),
    SerieRegistro              VARCHAR(4),
    Resolucion                 VARCHAR(100),
    GestionResolucion          VARCHAR(20),
    FechaResolucionRegistro    DATETIME,
    EstadoRegistro             VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRegistro)
)ENGINE=INNODB
;



-- 
-- TABLE: RegistroExistenteEF 
--

CREATE TABLE RegistroExistenteEF(
    IdRegistroExistenteEF      BIGINT          AUTO_INCREMENT,
    IdAnalisisEtapa            BIGINT          NOT NULL,
    IdTramite                  BIGINT,
    Tramite                    VARCHAR(20),
    NumeroClaseNiza            VARCHAR(10),
    ListaProducto              TEXT,
    Registro                   VARCHAR(20),
    FechaIngreso               DATETIME,
    Marca                      VARCHAR(150),
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRegistroExistenteEF)
)ENGINE=INNODB
;



-- 
-- TABLE: Regla 
--

CREATE TABLE Regla(
    IdRegla                    BIGINT          NOT NULL,
    Codigo                     VARCHAR(20),
    Nombre                     VARCHAR(150),
    Descripcion                VARCHAR(255),
    Activo                     BIT(1),
    IdUsuario                  BINARY(16),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRegla)
)ENGINE=INNODB
;



-- 
-- TABLE: RenovacionTramite 
--

CREATE TABLE RenovacionTramite(
    IdRenovacionTramite           BIGINT          AUTO_INCREMENT,
    IdTramite                     BIGINT          NOT NULL,
    NombreRazonSocialTitular      TEXT,
    Domicilio                     TEXT,
    SignoDistintivo               VARCHAR(250),
    TipoGenero                    VARCHAR(4),
    NumeroClaseNiza               VARCHAR(20),
    Registro                      VARCHAR(20),
    SerieRegistro                 VARCHAR(4),
    FechaOtorgacionMarca          DATETIME,
    NumeroUltimaRenovacion        VARCHAR(20),
    NumeroPenultimaRenovacion     VARCHAR(20),
    ListaProductosServicios       TEXT,
    ClaseActualNiza               VARCHAR(20),
    NombreArchivoListaProducto    VARCHAR(250),
    ArchivoListaProducto          BLOB,
    Estado                        VARCHAR(2),
    Usuario                       BIGINT,
    FechaUltimaModificacion       DATETIME,
    PRIMARY KEY (IdRenovacionTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: Renuncia 
--

CREATE TABLE Renuncia(
    IdRenuncia                   BIGINT          AUTO_INCREMENT,
    IdTramite                    BIGINT          NOT NULL,
    IdPersona                    INT             NOT NULL,
    TipoRenuncia                 VARCHAR(4),
    Registro                     VARCHAR(20),
    FechaRenovacion              DATETIME,
    NombreRegistro               VARCHAR(150),
    TipoSigno                    VARCHAR(4),
    Genero                       VARCHAR(4),
    ClaseNiza                    INT,
    Observacion                  VARCHAR(250),
    Productos                    TEXT,
    AdjuntaArchivoProductos      BIT(1),
    RutaArchivo                  VARCHAR(200),
    EstadoProceso                VARCHAR(4),
    FechaCreacionRegistro        DATETIME,
    FechaModificacionRegistro    DATETIME,
    Usuario                      BIGINT,
    FechaUltimaModificacion      DATETIME,
    PRIMARY KEY (IdRenuncia)
)ENGINE=INNODB
;



-- 
-- TABLE: RequisitoFlujoEtapaPlantilla 
--

CREATE TABLE RequisitoFlujoEtapaPlantilla(
    IdRequisitoFlujoEtapaPlantilla    BIGINT          AUTO_INCREMENT,
    IdFlujoEtapa                      BIGINT          NOT NULL,
    Requisito                         TEXT,
    Pestania                          VARCHAR(150),
    Seccion                           VARCHAR(250),
    SubSeccion                        VARCHAR(250),
    Orden                             INT,
    TipoRequisito                     VARCHAR(4),
    TipoRespuestaRequisito            VARCHAR(4),
    TieneDetalle                      BIT(1),
    Vigente                           BIT(1),
    FechaInicio                       DATETIME,
    FechaFin                          DATETIME,
    Usuario                           BIGINT,
    FechaUltimaModificacion           DATETIME,
    PRIMARY KEY (IdRequisitoFlujoEtapaPlantilla)
)ENGINE=INNODB
;



-- 
-- TABLE: RequisitoFlujoVentanillaEForma 
--

CREATE TABLE RequisitoFlujoVentanillaEForma(
    IdRequisitoFlujoVentanillaEForma    BIGINT          AUTO_INCREMENT,
    IdFlujoEtapa                        BIGINT          NOT NULL,
    TipoGenero                          VARCHAR(4),
    Codigo                              VARCHAR(5),
    TipoRequisito                       VARCHAR(5),
    FechaCreacion                       DATETIME,
    Posicion                            INT,
    Vigente                             BIT(1),
    Descripcion                         TEXT,
    Dominio                             VARCHAR(100),
    Usuario                             BIGINT,
    FechaUltimaModificacion             DATETIME,
    PRIMARY KEY (IdRequisitoFlujoVentanillaEForma)
)ENGINE=INNODB
;



-- 
-- TABLE: Resolucion 
--

CREATE TABLE Resolucion(
    IdResolucion               BIGINT      AUTO_INCREMENT,
    IdTramite                  BIGINT      NOT NULL,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdResolucion)
)ENGINE=INNODB
;



-- 
-- TABLE: Rol 
--

CREATE TABLE Rol(
    IdRol                      BIGINT          AUTO_INCREMENT,
    Codigo                     VARCHAR(20),
    Nombre                     VARCHAR(100),
    Estado                     BIT(1),
    FechaCreacion              DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRol)
)ENGINE=INNODB
;



-- 
-- TABLE: RolMenu 
--

CREATE TABLE RolMenu(
    IdRolMenu                  BIGINT      AUTO_INCREMENT,
    IdRol                      BIGINT      NOT NULL,
    IdMenu                     BIGINT      NOT NULL,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRolMenu)
)ENGINE=INNODB
;



-- 
-- TABLE: RolReglaPagina 
--

CREATE TABLE RolReglaPagina(
    IdRolReglaPagina           BIGINT      AUTO_INCREMENT,
    IdRol                      BIGINT      NOT NULL,
    IdRegla                    BIGINT      NOT NULL,
    IdPagina                   BIGINT      NOT NULL,
    Activo                     BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdRolReglaPagina)
)ENGINE=INNODB
;



-- 
-- TABLE: SeccionFormularioSolicitud 
--

CREATE TABLE SeccionFormularioSolicitud(
    IdSeccionFormularioSolicitud    BIGINT        AUTO_INCREMENT,
    IdFlujo                         BIGINT        NOT NULL,
    NumeroSeccion                   BIGINT,
    Estado                          VARCHAR(2),
    Usuario                         BIGINT,
    FechaUltimaModificacion         DATETIME,
    PRIMARY KEY (IdSeccionFormularioSolicitud)
)ENGINE=INNODB
;



-- 
-- TABLE: Sistema 
--

CREATE TABLE Sistema(
    IdSistema                  BIGINT        AUTO_INCREMENT,
    IdRegional                 BIGINT,
    Fecha                      DATE,
    Estado                     VARCHAR(2),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSistema)
)ENGINE=INNODB
;



-- 
-- TABLE: SMColor 
--

CREATE TABLE SMColor(
    IdSMColor                  BIGINT         AUTO_INCREMENT,
    IdTramite                  BIGINT         NOT NULL,
    TipoColor                  VARCHAR(4),
    Dato                       VARCHAR(20),
    FechaCreacion              DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSMColor)
)ENGINE=INNODB
;



-- 
-- TABLE: SMConvenio 
--

CREATE TABLE SMConvenio(
    IdConvenio                 BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Institucion                VARCHAR(150),
    TipoEmpresa                VARCHAR(4),
    NumeroRegistro             VARCHAR(20),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdConvenio)
)ENGINE=INNODB
;



-- 
-- TABLE: SMImagen 
--

CREATE TABLE SMImagen(
    IdSMImagen      BIGINT      AUTO_INCREMENT,
    IdSMLogotipo    BIGINT      NOT NULL,
    Imagen          LONGBLOB,
    PRIMARY KEY (IdSMImagen)
)ENGINE=INNODB
;



-- 
-- TABLE: SMLogotipo 
--

CREATE TABLE SMLogotipo(
    IdSMLogotipo               BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    NombreArchivo              VARCHAR(250),
    Principal                  BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSMLogotipo)
)ENGINE=INNODB
;



-- 
-- TABLE: SMSignoClaseNiza 
--

CREATE TABLE SMSignoClaseNiza(
    IdSMSignoClaseNiza         BIGINT          AUTO_INCREMENT,
    IdClaseNiza                BIGINT          NOT NULL,
    IdTramite                  BIGINT          NOT NULL,
    Observaciones              VARCHAR(255),
    NumeroClaseNiza            VARCHAR(10),
    Vigente                    BIT(1),
    ListaProducto              TEXT,
    ArchivoProducto            VARCHAR(255),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSMSignoClaseNiza)
)ENGINE=INNODB
;



-- 
-- TABLE: SMSignoMarca 
--

CREATE TABLE SMSignoMarca(
    IdTramite                  BIGINT          NOT NULL,
    Marca                      VARCHAR(500),
    TipoSolicitudSigno         VARCHAR(4),
    TipoGenero                 VARCHAR(4),
    TipoSolicitudDeposito      VARCHAR(4),
    IdSignoPadre               BIGINT,
    Descripcion                TEXT,
    ProtegeColor               BIT(1),
    PrioridadAndina            VARCHAR(80),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: SMSolicitadoLema 
--

CREATE TABLE SMSolicitadoLema(
    IdSolicitadoLema           BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    Frase                      VARCHAR(255),
    VigenteHasta               DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSolicitadoLema)
)ENGINE=INNODB
;



-- 
-- TABLE: SMSolicitadoPrioridad 
--

CREATE TABLE SMSolicitadoPrioridad(
    IdSolicitadoPrioridad       BIGINT          AUTO_INCREMENT,
    IdTramite                   BIGINT          NOT NULL,
    CodigoClasificador          VARCHAR(4),
    TipoPreferenciaPrioridad    VARCHAR(4),
    NumeroPrioridad             VARCHAR(20),
    OficinaPrioridad            VARCHAR(255),
    FechaEmision                DATETIME,
    Vigente                     BIT(1),
    Lugar                       VARCHAR(100),
    Observacion                 VARCHAR(255),
    Usuario                     BIGINT,
    FechaUltimaModificacion     DATETIME,
    PRIMARY KEY (IdSolicitadoPrioridad)
)ENGINE=INNODB
;



-- 
-- TABLE: SMTipoSignoSolicitado 
--

CREATE TABLE SMTipoSignoSolicitado(
    IdSMTipoSignoSolicitado    BIGINT         AUTO_INCREMENT,
    IdTramite                  BIGINT         NOT NULL,
    Otro                       VARCHAR(50),
    TipoSigno                  VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSMTipoSignoSolicitado)
)ENGINE=INNODB
;



-- 
-- TABLE: SMTramiteClaseViena 
--

CREATE TABLE SMTramiteClaseViena(
    IdTramiteClaseViena        BIGINT      AUTO_INCREMENT,
    IdClaseViena               BIGINT      NOT NULL,
    IdTramite                  BIGINT      NOT NULL,
    Orden                      INT,
    Vigente                    BIT(1),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramiteClaseViena)
)ENGINE=INNODB
;



-- 
-- TABLE: SolicitadoInspeccion 
--

CREATE TABLE SolicitadoInspeccion(
    IdSolicitadoInspeccion     BIGINT          AUTO_INCREMENT,
    IdInfraccion               BIGINT          NOT NULL,
    TipoEstablecimiento        VARCHAR(100),
    Direccion                  VARCHAR(255),
    Zona                       VARCHAR(200),
    Barrio                     VARCHAR(100),
    Calle                      VARCHAR(100),
    Edificio                   VARCHAR(100),
    Piso                       VARCHAR(10),
    Nro                        VARCHAR(10),
    Departamento               VARCHAR(4),
    Ciudad                     VARCHAR(150),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSolicitadoInspeccion)
)ENGINE=INNODB
;



-- 
-- TABLE: SolicitudPrioridadPreferencia 
--

CREATE TABLE SolicitudPrioridadPreferencia(
    IdSolicitudPrioridadPreferencia    BIGINT          AUTO_INCREMENT,
    IdTramite                          BIGINT          NOT NULL,
    CodigoClasificador                 VARCHAR(4),
    TipoPreferenciaPrioridad           VARCHAR(4),
    NumeroPrioridad                    VARCHAR(250),
    OficinaPrioridad                   VARCHAR(255),
    FechaEmision                       DATETIME,
    Vigente                            BIT(1),
    Lugar                              VARCHAR(100),
    Observacion                        VARCHAR(255),
    Usuario                            BIGINT,
    FechaUltimaModificacion            DATETIME,
    PRIMARY KEY (IdSolicitudPrioridadPreferencia)
)ENGINE=INNODB
;



-- 
-- TABLE: Subsanacion 
--

CREATE TABLE Subsanacion(
    IdSubsanacion              BIGINT        AUTO_INCREMENT,
    IdTramiteFlujoEtapa        BIGINT        NOT NULL,
    EstadoSubsanacion          VARCHAR(4),
    IdPersona                  INT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdSubsanacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Tasa 
--

CREATE TABLE Tasa(
    IdTasa                     BIGINT            AUTO_INCREMENT,
    TipoTramite                VARCHAR(4),
    Costo                      DECIMAL(19, 2),
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Descripcion                VARCHAR(250),
    Descuento                  INT,
    TipoRecibo                 VARCHAR(4),
    TipoTasa                   VARCHAR(4),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTasa)
)ENGINE=INNODB
;



-- 
-- TABLE: TemporalModificacion 
--

CREATE TABLE TemporalModificacion(
    IdTemporalModificacion     BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT,
    NombreTabla                VARCHAR(100),
    IdTabla                    BIGINT,
    CampoTabla                 VARCHAR(100)    NOT NULL,
    DatoCampo                  VARCHAR(100),
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTemporalModificacion)
)ENGINE=INNODB
;



-- 
-- TABLE: Titulo 
--

CREATE TABLE Titulo(
    NroTitulo                  BIGINT      AUTO_INCREMENT,
    IdRecibo                   BIGINT      NOT NULL,
    SerieTitulo                BIGINT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (NroTitulo)
)ENGINE=INNODB
;



-- 
-- TABLE: Tramite 
--

CREATE TABLE Tramite(
    IdTramite                  BIGINT          AUTO_INCREMENT,
    IdExpediente               BIGINT,
    IdRegional                 BIGINT,
    Observacion                VARCHAR(250),
    NroFojas                   INT,
    CodigoDia                  VARCHAR(25),
    PDFRuta                    VARCHAR(200),
    Correlativo                INT,
    Tramite                    VARCHAR(20),
    TipoTramite                VARCHAR(4),
    EtapaTramite               VARCHAR(4),
    EtapaPadre                 BIGINT,
    EstadoProceso              VARCHAR(4),
    FechaCreacion              DATETIME,
    FechaIngreso               DATETIME,
    TienePrioridad             BIT(1),
    TramiteUnipersonal         BIT(1),
    EtapaValidacion            VARCHAR(20),
    NumeroPaginas              INT,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramite)
)ENGINE=INNODB
;



-- 
-- TABLE: TramiteFlujoEtapa 
--

CREATE TABLE TramiteFlujoEtapa(
    IdTramiteFlujoEtapa        BIGINT          AUTO_INCREMENT,
    IdTramite                  BIGINT          NOT NULL,
    IdUsuario                  BIGINT          NOT NULL,
    TipoAsignacion             VARCHAR(4),
    EstadoTarea                VARCHAR(5),
    FechaAsignacion            DATETIME,
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    NumeroIngreso              INT,
    EtapaTramite               VARCHAR(4),
    Codigo                     VARCHAR(25),
    CodigoDia                  VARCHAR(25),
    UltimaHoraIniciada         DATETIME,
    TiempoTotal                VARCHAR(10),
    VecesRevision              INT,
    Observacion                VARCHAR(250),
    TipoRevision               VARCHAR(4),
    DiasHabiles                INT,
    Posicion                   INT,
    FechaUltimaModificacion    DATETIME,
    Usuario                    BIGINT,
    PRIMARY KEY (IdTramiteFlujoEtapa)
)ENGINE=INNODB
;



-- 
-- TABLE: TramitePlazoExtra 
--

CREATE TABLE TramitePlazoExtra(
    IdTramitePlazoExtra        BIGINT          AUTO_INCREMENT,
    IdTramiteFlujoEtapa        BIGINT          NOT NULL,
    PlazoAdicional             INT,
    UnidadTiempo               VARCHAR(4),
    Motivo                     VARCHAR(100),
    IdAutorizador              INT,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramitePlazoExtra)
)ENGINE=INNODB
;



-- 
-- TABLE: TramiteProrroga 
--

CREATE TABLE TramiteProrroga(
    IdTramiteProrroga            BIGINT          AUTO_INCREMENT,
    IdFlujoEtapaProrroga         BIGINT          NOT NULL,
    IdTramiteFlujoEtapa          BIGINT          NOT NULL,
    FechaInicio                  DATE            NOT NULL,
    FechaFinalizacion            DATE            NOT NULL,
    Motivo                       VARCHAR(250),
    EstadoProceso                VARCHAR(4),
    IdAprobador                  INT,
    FechaModificacionRegistro    DATETIME,
    Usuario                      BIGINT,
    FechaUltimaModificacion      DATETIME,
    PRIMARY KEY (IdTramiteProrroga)
)ENGINE=INNODB
;



-- 
-- TABLE: TramiteTablas 
--

CREATE TABLE TramiteTablas(
    IdTramiteTablas            BIGINT          AUTO_INCREMENT,
    TipoTamite                 VARCHAR(4),
    NombreTabla                VARCHAR(100),
    Vigente                    BIT(1),
    FechaInicio                DATETIME,
    FechaFinal                 DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramiteTablas)
)ENGINE=INNODB
;



-- 
-- TABLE: TramiteUsuario 
--

CREATE TABLE TramiteUsuario(
    IdTramiteUsuario           BIGINT      AUTO_INCREMENT,
    IdUsuario                  BIGINT      NOT NULL,
    IdTramite                  BIGINT,
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdTramiteUsuario)
)ENGINE=INNODB
;



-- 
-- TABLE: Usuario 
--

CREATE TABLE Usuario(
    IdUsuario                  BIGINT          AUTO_INCREMENT,
    IdRegional                 BIGINT,
    Login                      VARCHAR(50),
    Password                   VARCHAR(100),
    Activo                     BIT(1),
    TipoUsuario                VARCHAR(4),
    FechaCreacion              DATETIME,
    RutaImagenFirma            VARCHAR(250),
    Nombres                    VARCHAR(150),
    PrimerApellido             VARCHAR(150),
    SegundoApellido            VARCHAR(150),
    NumeroDocumento            VARCHAR(25),
    TipoDocumento              VARCHAR(4),
    LugarExpedicion            VARCHAR(4),
    FechaNacimiento            DATETIME,
    CorreoElectronico          VARCHAR(50),
    Genero                     VARCHAR(4),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdUsuario)
)ENGINE=INNODB
;



-- 
-- TABLE: UsuarioHorario 
--

CREATE TABLE UsuarioHorario(
    IdUsuarioHorario           BIGINT      AUTO_INCREMENT,
    IdUsuario                  BIGINT      NOT NULL,
    IdHorario                  BIGINT      NOT NULL,
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Vigente                    BIT(1),
    FechaCreacion              DATETIME,
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdUsuarioHorario)
)ENGINE=INNODB
;



-- 
-- TABLE: UsuarioRol 
--

CREATE TABLE UsuarioRol(
    IdUsuarioRol               BIGINT      AUTO_INCREMENT,
    IdRol                      BIGINT      NOT NULL,
    IdUsuario                  BIGINT      NOT NULL,
    FechaInicio                DATETIME,
    FechaFin                   DATETIME,
    Vigente                    BIT(1),
    Usuario                    BIGINT,
    FechaUltimaModificacion    DATETIME,
    PRIMARY KEY (IdUsuarioRol)
)ENGINE=INNODB
;



-- 
-- TABLE: ValorTramiteVentanillaEForma 
--

CREATE TABLE ValorTramiteVentanillaEForma(
    IdValorTramiteVentanillaEForma    BIGINT          AUTO_INCREMENT,
    IdDatoTramiteVentanillaEForma     BIGINT          NOT NULL,
    Presento                          BIT(1),
    Codigo                            VARCHAR(5),
    DominioOpcion                     VARCHAR(100),
    Observacion                       VARCHAR(250),
    Usuario                           BIGINT,
    FechaUltimaModificacion           DATETIME,
    PRIMARY KEY (IdValorTramiteVentanillaEForma)
)ENGINE=INNODB
;



-- 
-- TABLE: AnalisisEtapa 
--

ALTER TABLE AnalisisEtapa ADD CONSTRAINT RefTramiteFlujoEtapa545 
    FOREIGN KEY (IdTramiteFlujoEtapa)
    REFERENCES TramiteFlujoEtapa(IdTramiteFlujoEtapa)
;


-- 
-- TABLE: AnalisisEtapaPlanilla 
--

ALTER TABLE AnalisisEtapaPlanilla ADD CONSTRAINT RefFlujoEtapa418 
    FOREIGN KEY (IdFlujoEtapa)
    REFERENCES FlujoEtapa(IdFlujoEtapa)
;


-- 
-- TABLE: AnalisisPersona 
--

ALTER TABLE AnalisisPersona ADD CONSTRAINT RefAnalisisEtapa559 
    FOREIGN KEY (IdAnalisisEtapa)
    REFERENCES AnalisisEtapa(IdAnalisisEtapa)
;


-- 
-- TABLE: AnotacionPreventiva 
--

ALTER TABLE AnotacionPreventiva ADD CONSTRAINT RefTramite446 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: ArchivoTxtNiza 
--

ALTER TABLE ArchivoTxtNiza ADD CONSTRAINT RefSMSignoClaseNiza599 
    FOREIGN KEY (IdSMSignoClaseNiza)
    REFERENCES SMSignoClaseNiza(IdSMSignoClaseNiza)
;


-- 
-- TABLE: ClaseContrato 
--

ALTER TABLE ClaseContrato ADD CONSTRAINT RefDAContratos488 
    FOREIGN KEY (IdContratos)
    REFERENCES DAContratos(IdContratos)
;


-- 
-- TABLE: DAAutorFonograma 
--

ALTER TABLE DAAutorFonograma ADD CONSTRAINT RefDAFonograma464 
    FOREIGN KEY (IdFonograma)
    REFERENCES DAFonograma(IdFonograma)
;


-- 
-- TABLE: DACaracterObra 
--

ALTER TABLE DACaracterObra ADD CONSTRAINT RefDADerechosAutor462 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DACategoriaArtistica 
--

ALTER TABLE DACategoriaArtistica ADD CONSTRAINT RefDAObraArtistica486 
    FOREIGN KEY (IdObraArtistica)
    REFERENCES DAObraArtistica(IdObraArtistica)
;


-- 
-- TABLE: DAClaseFonograma 
--

ALTER TABLE DAClaseFonograma ADD CONSTRAINT RefDAFonograma465 
    FOREIGN KEY (IdFonograma)
    REFERENCES DAFonograma(IdFonograma)
;


-- 
-- TABLE: DAContratos 
--

ALTER TABLE DAContratos ADD CONSTRAINT RefTramite459 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: DAContratosPartes 
--

ALTER TABLE DAContratosPartes ADD CONSTRAINT RefDAContratos489 
    FOREIGN KEY (IdContratos)
    REFERENCES DAContratos(IdContratos)
;


-- 
-- TABLE: DADerechosAutor 
--

ALTER TABLE DADerechosAutor ADD CONSTRAINT RefTramite479 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: DAFonograma 
--

ALTER TABLE DAFonograma ADD CONSTRAINT RefDADerechosAutor466 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DAObraArtistica 
--

ALTER TABLE DAObraArtistica ADD CONSTRAINT RefDADerechosAutor467 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DAObraAudiovisual 
--

ALTER TABLE DAObraAudiovisual ADD CONSTRAINT RefDADerechosAutor463 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DAObraLiteraria 
--

ALTER TABLE DAObraLiteraria ADD CONSTRAINT RefDADerechosAutor461 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DAPersonaDatos 
--

ALTER TABLE DAPersonaDatos ADD CONSTRAINT RefPersona334 
    FOREIGN KEY (IdPersona)
    REFERENCES Persona(IdPersona)
;


-- 
-- TABLE: DAProgramaComputacion 
--

ALTER TABLE DAProgramaComputacion ADD CONSTRAINT RefDADerechosAutor468 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DASoporteAportado 
--

ALTER TABLE DASoporteAportado ADD CONSTRAINT RefDAProgramaComputacion487 
    FOREIGN KEY (IdProgramaComputacion)
    REFERENCES DAProgramaComputacion(IdProgramaComputacion)
;


-- 
-- TABLE: DATipoPersona 
--

ALTER TABLE DATipoPersona ADD CONSTRAINT RefDADerechosAutor469 
    FOREIGN KEY (IdTramite)
    REFERENCES DADerechosAutor(IdTramite)
;


-- 
-- TABLE: DatoElementoFormulario 
--

ALTER TABLE DatoElementoFormulario ADD CONSTRAINT RefAnalisisEtapa563 
    FOREIGN KEY (IdAnalisisEtapa)
    REFERENCES AnalisisEtapa(IdAnalisisEtapa)
;


-- 
-- TABLE: DatosContacto 
--

ALTER TABLE DatosContacto ADD CONSTRAINT RefPersona507 
    FOREIGN KEY (IdPersona)
    REFERENCES Persona(IdPersona)
;

ALTER TABLE DatosContacto ADD CONSTRAINT RefEmpresa508 
    FOREIGN KEY (IdEmpresa)
    REFERENCES Empresa(IdEmpresa)
;


-- 
-- TABLE: DatoTramiteVentanillaEForma 
--

ALTER TABLE DatoTramiteVentanillaEForma ADD CONSTRAINT RefAnalisisEtapa548 
    FOREIGN KEY (IdAnalisisEtapa)
    REFERENCES AnalisisEtapa(IdAnalisisEtapa)
;


-- 
-- TABLE: DetalleRequisitoPlantilla 
--

ALTER TABLE DetalleRequisitoPlantilla ADD CONSTRAINT RefRequisitoFlujoEtapaPlantilla416 
    FOREIGN KEY (IdRequisitoFlujoEtapaPlantilla)
    REFERENCES RequisitoFlujoEtapaPlantilla(IdRequisitoFlujoEtapaPlantilla)
;


-- 
-- TABLE: DetalleTitulo 
--

ALTER TABLE DetalleTitulo ADD CONSTRAINT RefRecibo600 
    FOREIGN KEY (IdRecibo)
    REFERENCES Recibo(IdRecibo)
;


-- 
-- TABLE: DIGArchivoDocumento 
--

ALTER TABLE DIGArchivoDocumento ADD CONSTRAINT RefDocumento573 
    FOREIGN KEY (IdDocumento)
    REFERENCES Documento(IdDocumento)
;


-- 
-- TABLE: Direccion 
--

ALTER TABLE Direccion ADD CONSTRAINT RefTramite510 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: Documento 
--

ALTER TABLE Documento ADD CONSTRAINT RefTramite475 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: DocumentoPublicacion 
--

ALTER TABLE DocumentoPublicacion ADD CONSTRAINT RefPublicacion590 
    FOREIGN KEY (IdPublicacion)
    REFERENCES Publicacion(IdPublicacion)
;


-- 
-- TABLE: DosificacionTasa 
--

ALTER TABLE DosificacionTasa ADD CONSTRAINT RefTasa596 
    FOREIGN KEY (IdTasa)
    REFERENCES Tasa(IdTasa)
;

ALTER TABLE DosificacionTasa ADD CONSTRAINT RefDosificacion597 
    FOREIGN KEY (IdDosificacion)
    REFERENCES Dosificacion(IdDosificacion)
;

ALTER TABLE DosificacionTasa ADD CONSTRAINT RefRegional598 
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;


-- 
-- TABLE: ElementoFormularioTramite 
--

ALTER TABLE ElementoFormularioTramite ADD CONSTRAINT RefFormularioTramite562 
    FOREIGN KEY (IdFormularioTramite)
    REFERENCES FormularioTramite(IdFormularioTramite)
;


-- 
-- TABLE: Entrega 
--

ALTER TABLE Entrega ADD CONSTRAINT RefDocumento585 
    FOREIGN KEY (IdDocumento)
    REFERENCES Documento(IdDocumento)
;


-- 
-- TABLE: ExpedienteAnotacion 
--

ALTER TABLE ExpedienteAnotacion ADD CONSTRAINT RefAnotacionPreventiva322 
    FOREIGN KEY (IdAnotacionPreventiva)
    REFERENCES AnotacionPreventiva(IdAnotacionPreventiva)
;

ALTER TABLE ExpedienteAnotacion ADD CONSTRAINT RefTramite396 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: FlujoEtapa 
--

ALTER TABLE FlujoEtapa ADD CONSTRAINT RefRol550 
    FOREIGN KEY (IdRol)
    REFERENCES Rol(IdRol)
;

ALTER TABLE FlujoEtapa ADD CONSTRAINT REL_40 
    FOREIGN KEY (IdFlujo)
    REFERENCES Flujo(IdFlujo)
;


-- 
-- TABLE: FlujoEtapaProrroga 
--

ALTER TABLE FlujoEtapaProrroga ADD CONSTRAINT RefFlujoEtapa324 
    FOREIGN KEY (IdFlujoEtapa)
    REFERENCES FlujoEtapa(IdFlujoEtapa)
;


-- 
-- TABLE: FlujoPagina 
--

ALTER TABLE FlujoPagina ADD CONSTRAINT RefPagina579 
    FOREIGN KEY (IdPagina)
    REFERENCES Pagina(IdPagina)
;

ALTER TABLE FlujoPagina ADD CONSTRAINT RefFlujo581 
    FOREIGN KEY (IdFlujo)
    REFERENCES Flujo(IdFlujo)
;


-- 
-- TABLE: FlujoTasa 
--

ALTER TABLE FlujoTasa ADD CONSTRAINT RefRegional494 
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;

ALTER TABLE FlujoTasa ADD CONSTRAINT RefFlujo259 
    FOREIGN KEY (IdFlujo)
    REFERENCES Flujo(IdFlujo)
;


-- 
-- TABLE: FormularioTramite 
--

ALTER TABLE FormularioTramite ADD CONSTRAINT RefFlujoEtapa561 
    FOREIGN KEY (IdFlujoEtapa)
    REFERENCES FlujoEtapa(IdFlujoEtapa)
;


-- 
-- TABLE: HistoricoDocumento 
--

ALTER TABLE HistoricoDocumento ADD CONSTRAINT RefDocumento405 
    FOREIGN KEY (IdDocumento)
    REFERENCES Documento(IdDocumento)
;


-- 
-- TABLE: HorarioDia 
--

ALTER TABLE HorarioDia ADD CONSTRAINT REL_50 
    FOREIGN KEY (IdHorario)
    REFERENCES Horario(IdHorario)
;


-- 
-- TABLE: Infraccion 
--

ALTER TABLE Infraccion ADD CONSTRAINT RefTramite443 
    FOREIGN KEY (IdTramiteInfraccion)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: MensajeAplicacion 
--

ALTER TABLE MensajeAplicacion ADD CONSTRAINT RefModulo578 
    FOREIGN KEY (IdModulo)
    REFERENCES Modulo(IdModulo)
;


-- 
-- TABLE: Menu 
--

ALTER TABLE Menu ADD CONSTRAINT RefPagina523 
    FOREIGN KEY (IdPagina)
    REFERENCES Pagina(IdPagina)
;


-- 
-- TABLE: Modificacion 
--

ALTER TABLE Modificacion ADD CONSTRAINT RefTramite565 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: ModificacionDatosContacto 
--

ALTER TABLE ModificacionDatosContacto ADD CONSTRAINT RefOTSolicitadoModificacion566 
    FOREIGN KEY (IdOTSolicitadoModificacion)
    REFERENCES OTSolicitadoModificacion(IdOTSolicitadoModificacion)
;


-- 
-- TABLE: Modulo 
--

ALTER TABLE Modulo ADD CONSTRAINT RefMascara569 
    FOREIGN KEY (IdMascara)
    REFERENCES Mascara(IdMascara)
;


-- 
-- TABLE: NotificacionDocumento 
--

ALTER TABLE NotificacionDocumento ADD CONSTRAINT RefDocumento587 
    FOREIGN KEY (IdDocumento)
    REFERENCES Documento(IdDocumento)
;

ALTER TABLE NotificacionDocumento ADD CONSTRAINT RefNotificacion588 
    FOREIGN KEY (IdNotificacion)
    REFERENCES Notificacion(IdNotificacion)
;


-- 
-- TABLE: NotificacionEdicto 
--

ALTER TABLE NotificacionEdicto ADD CONSTRAINT RefNotificacion586 
    FOREIGN KEY (IdNotificacion)
    REFERENCES Notificacion(IdNotificacion)
;


-- 
-- TABLE: ObservacionTramite 
--

ALTER TABLE ObservacionTramite ADD CONSTRAINT RefTramite609 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: Oposicion 
--

ALTER TABLE Oposicion ADD CONSTRAINT RefTramite457 
    FOREIGN KEY (IdTramiteAOponer)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: OTCancelacion 
--

ALTER TABLE OTCancelacion ADD CONSTRAINT RefTramite445 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: OTDesistimiento 
--

ALTER TABLE OTDesistimiento ADD CONSTRAINT RefTramite450 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: OTNulidad 
--

ALTER TABLE OTNulidad ADD CONSTRAINT RefTramite441 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: OTSolicitadoModificacion 
--

ALTER TABLE OTSolicitadoModificacion ADD CONSTRAINT RefTramite448 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: PADepositoCertificacion 
--

ALTER TABLE PADepositoCertificacion ADD CONSTRAINT RefPAPatente387 
    FOREIGN KEY (IdTramite)
    REFERENCES PAPatente(IdTramite)
;


-- 
-- TABLE: PADibujoPatente 
--

ALTER TABLE PADibujoPatente ADD CONSTRAINT RefPAPatente286 
    FOREIGN KEY (IdTramite)
    REFERENCES PAPatente(IdTramite)
;


-- 
-- TABLE: PAFormatoPatente 
--

ALTER TABLE PAFormatoPatente ADD CONSTRAINT RefPAPatente287 
    FOREIGN KEY (IdTramite)
    REFERENCES PAPatente(IdTramite)
;


-- 
-- TABLE: PAPatente 
--

ALTER TABLE PAPatente ADD CONSTRAINT RefTramite481 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: PAReinvindicacion 
--

ALTER TABLE PAReinvindicacion ADD CONSTRAINT RefPAPatente289 
    FOREIGN KEY (IdTramite)
    REFERENCES PAPatente(IdTramite)
;


-- 
-- TABLE: PersonaEmpresaTramite 
--

ALTER TABLE PersonaEmpresaTramite ADD CONSTRAINT RefEmpresa497 
    FOREIGN KEY (IdEmpresa)
    REFERENCES Empresa(IdEmpresa)
;

ALTER TABLE PersonaEmpresaTramite ADD CONSTRAINT RefPoder575 
    FOREIGN KEY (IdPoder)
    REFERENCES Poder(IdPoder)
;

ALTER TABLE PersonaEmpresaTramite ADD CONSTRAINT RefTramite452 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;

ALTER TABLE PersonaEmpresaTramite ADD CONSTRAINT RefPersona269 
    FOREIGN KEY (IdPersona)
    REFERENCES Persona(IdPersona)
;


-- 
-- TABLE: PublicacionTramite 
--

ALTER TABLE PublicacionTramite ADD CONSTRAINT RefPublicacion490 
    FOREIGN KEY (IdPublicacion)
    REFERENCES Publicacion(IdPublicacion)
;

ALTER TABLE PublicacionTramite ADD CONSTRAINT RefTramite491 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: Recibo 
--

ALTER TABLE Recibo ADD CONSTRAINT RefTasa591 
    FOREIGN KEY (IdTasa)
    REFERENCES Tasa(IdTasa)
;

ALTER TABLE Recibo ADD CONSTRAINT RefTramite594 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;

ALTER TABLE Recibo ADD CONSTRAINT RefRegional595 
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;


-- 
-- TABLE: ReciboDeposito 
--

ALTER TABLE ReciboDeposito ADD CONSTRAINT RefDeposito553 
    FOREIGN KEY (IdDeposito)
    REFERENCES Deposito(IdDeposito)
;

ALTER TABLE ReciboDeposito ADD CONSTRAINT RefRecibo593 
    FOREIGN KEY (IdRecibo)
    REFERENCES Recibo(IdRecibo)
;


-- 
-- TABLE: Recurso 
--

ALTER TABLE Recurso ADD CONSTRAINT RefDocumento477 
    FOREIGN KEY (IdDocumento)
    REFERENCES Documento(IdDocumento)
;


-- 
-- TABLE: RegionalCorrelativo 
--

ALTER TABLE RegionalCorrelativo ADD CONSTRAINT RefCorrelativo615 
    FOREIGN KEY (IdCorrelativo)
    REFERENCES Correlativo(IdCorrelativo)
;

ALTER TABLE RegionalCorrelativo ADD CONSTRAINT RefRegional617 
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;


-- 
-- TABLE: Registro 
--

ALTER TABLE Registro ADD CONSTRAINT RefTramite451 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: RenovacionTramite 
--

ALTER TABLE RenovacionTramite ADD CONSTRAINT RefTramite437 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: Renuncia 
--

ALTER TABLE Renuncia ADD CONSTRAINT RefTramite454 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: RequisitoFlujoEtapaPlantilla 
--

ALTER TABLE RequisitoFlujoEtapaPlantilla ADD CONSTRAINT RefFlujoEtapa409 
    FOREIGN KEY (IdFlujoEtapa)
    REFERENCES FlujoEtapa(IdFlujoEtapa)
;


-- 
-- TABLE: RequisitoFlujoVentanillaEForma 
--

ALTER TABLE RequisitoFlujoVentanillaEForma ADD CONSTRAINT RefFlujoEtapa544 
    FOREIGN KEY (IdFlujoEtapa)
    REFERENCES FlujoEtapa(IdFlujoEtapa)
;


-- 
-- TABLE: Resolucion 
--

ALTER TABLE Resolucion ADD CONSTRAINT RefTramite583 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: RolMenu 
--

ALTER TABLE RolMenu ADD CONSTRAINT REL_55 
    FOREIGN KEY (IdRol)
    REFERENCES Rol(IdRol)
;

ALTER TABLE RolMenu ADD CONSTRAINT REL_56 
    FOREIGN KEY (IdMenu)
    REFERENCES Menu(IdMenu)
;


-- 
-- TABLE: RolReglaPagina 
--

ALTER TABLE RolReglaPagina ADD CONSTRAINT REL_105 
    FOREIGN KEY (IdPagina)
    REFERENCES Pagina(IdPagina)
;

ALTER TABLE RolReglaPagina ADD CONSTRAINT REL_106 
    FOREIGN KEY (IdRegla)
    REFERENCES Regla(IdRegla)
;

ALTER TABLE RolReglaPagina ADD CONSTRAINT REL_107 
    FOREIGN KEY (IdRol)
    REFERENCES Rol(IdRol)
;


-- 
-- TABLE: SeccionFormularioSolicitud 
--

ALTER TABLE SeccionFormularioSolicitud ADD CONSTRAINT RefFlujo613 
    FOREIGN KEY (IdFlujo)
    REFERENCES Flujo(IdFlujo)
;


-- 
-- TABLE: SMColor 
--

ALTER TABLE SMColor ADD CONSTRAINT RefSMSignoMarca571 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMConvenio 
--

ALTER TABLE SMConvenio ADD CONSTRAINT RefSMSignoMarca473 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMImagen 
--

ALTER TABLE SMImagen ADD CONSTRAINT RefSMLogotipo574 
    FOREIGN KEY (IdSMLogotipo)
    REFERENCES SMLogotipo(IdSMLogotipo)
;


-- 
-- TABLE: SMLogotipo 
--

ALTER TABLE SMLogotipo ADD CONSTRAINT RefSMSignoMarca529 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMSignoClaseNiza 
--

ALTER TABLE SMSignoClaseNiza ADD CONSTRAINT RefClaseNiza478 
    FOREIGN KEY (IdClaseNiza)
    REFERENCES ClaseNiza(IdClaseNiza)
;

ALTER TABLE SMSignoClaseNiza ADD CONSTRAINT RefSMSignoMarca531 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMSignoMarca 
--

ALTER TABLE SMSignoMarca ADD CONSTRAINT RefTramite480 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: SMSolicitadoLema 
--

ALTER TABLE SMSolicitadoLema ADD CONSTRAINT RefSMSignoMarca276 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMSolicitadoPrioridad 
--

ALTER TABLE SMSolicitadoPrioridad ADD CONSTRAINT RefSMSignoMarca472 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMTipoSignoSolicitado 
--

ALTER TABLE SMTipoSignoSolicitado ADD CONSTRAINT RefSMSignoMarca530 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;


-- 
-- TABLE: SMTramiteClaseViena 
--

ALTER TABLE SMTramiteClaseViena ADD CONSTRAINT RefSMSignoMarca260 
    FOREIGN KEY (IdTramite)
    REFERENCES SMSignoMarca(IdTramite)
;

ALTER TABLE SMTramiteClaseViena ADD CONSTRAINT REL_98 
    FOREIGN KEY (IdClaseViena)
    REFERENCES ClaseViena(IdClaseViena)
;


-- 
-- TABLE: SolicitadoInspeccion 
--

ALTER TABLE SolicitadoInspeccion ADD CONSTRAINT RefInfraccion474 
    FOREIGN KEY (IdInfraccion)
    REFERENCES Infraccion(IdInfraccion)
;


-- 
-- TABLE: SolicitudPrioridadPreferencia 
--

ALTER TABLE SolicitudPrioridadPreferencia ADD CONSTRAINT RefTramite603 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;


-- 
-- TABLE: Subsanacion 
--

ALTER TABLE Subsanacion ADD CONSTRAINT RefTramiteFlujoEtapa265 
    FOREIGN KEY (IdTramiteFlujoEtapa)
    REFERENCES TramiteFlujoEtapa(IdTramiteFlujoEtapa)
;


-- 
-- TABLE: Titulo 
--

ALTER TABLE Titulo ADD CONSTRAINT RefRecibo592 
    FOREIGN KEY (IdRecibo)
    REFERENCES Recibo(IdRecibo)
;


-- 
-- TABLE: Tramite 
--

ALTER TABLE Tramite ADD CONSTRAINT RefRegional503 
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;

ALTER TABLE Tramite ADD CONSTRAINT RefExpediente428 
    FOREIGN KEY (IdExpediente)
    REFERENCES Expediente(IdExpediente)
;


-- 
-- TABLE: TramiteFlujoEtapa 
--

ALTER TABLE TramiteFlujoEtapa ADD CONSTRAINT RefTramite415 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;

ALTER TABLE TramiteFlujoEtapa ADD CONSTRAINT RefUsuario524 
    FOREIGN KEY (IdUsuario)
    REFERENCES Usuario(IdUsuario)
;


-- 
-- TABLE: TramitePlazoExtra 
--

ALTER TABLE TramitePlazoExtra ADD CONSTRAINT REL_54 
    FOREIGN KEY (IdTramiteFlujoEtapa)
    REFERENCES TramiteFlujoEtapa(IdTramiteFlujoEtapa)
;


-- 
-- TABLE: TramiteProrroga 
--

ALTER TABLE TramiteProrroga ADD CONSTRAINT RefTramiteFlujoEtapa484 
    FOREIGN KEY (IdTramiteFlujoEtapa)
    REFERENCES TramiteFlujoEtapa(IdTramiteFlujoEtapa)
;

ALTER TABLE TramiteProrroga ADD CONSTRAINT RefFlujoEtapaProrroga325 
    FOREIGN KEY (IdFlujoEtapaProrroga)
    REFERENCES FlujoEtapaProrroga(IdFlujoEtapaProrroga)
;


-- 
-- TABLE: TramiteUsuario 
--

ALTER TABLE TramiteUsuario ADD CONSTRAINT RefTramite520 
    FOREIGN KEY (IdTramite)
    REFERENCES Tramite(IdTramite)
;

ALTER TABLE TramiteUsuario ADD CONSTRAINT RefUsuario521 
    FOREIGN KEY (IdUsuario)
    REFERENCES Usuario(IdUsuario)
;


-- 
-- TABLE: Usuario 
--

ALTER TABLE Usuario ADD CONSTRAINT RefRegional551 
    FOREIGN KEY (IdRegional)
    REFERENCES Regional(IdRegional)
;


-- 
-- TABLE: UsuarioHorario 
--

ALTER TABLE UsuarioHorario ADD CONSTRAINT RefUsuario525 
    FOREIGN KEY (IdUsuario)
    REFERENCES Usuario(IdUsuario)
;

ALTER TABLE UsuarioHorario ADD CONSTRAINT REL_14 
    FOREIGN KEY (IdHorario)
    REFERENCES Horario(IdHorario)
;


-- 
-- TABLE: UsuarioRol 
--

ALTER TABLE UsuarioRol ADD CONSTRAINT REL_103 
    FOREIGN KEY (IdUsuario)
    REFERENCES Usuario(IdUsuario)
;

ALTER TABLE UsuarioRol ADD CONSTRAINT REL_104 
    FOREIGN KEY (IdRol)
    REFERENCES Rol(IdRol)
;


-- 
-- TABLE: ValorTramiteVentanillaEForma 
--

ALTER TABLE ValorTramiteVentanillaEForma ADD CONSTRAINT RefDatoTramiteVentanillaEForma549 
    FOREIGN KEY (IdDatoTramiteVentanillaEForma)
    REFERENCES DatoTramiteVentanillaEForma(IdDatoTramiteVentanillaEForma)
;


