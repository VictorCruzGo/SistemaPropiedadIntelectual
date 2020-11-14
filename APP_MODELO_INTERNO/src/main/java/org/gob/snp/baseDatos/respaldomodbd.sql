/*
-- Query: select * from RequisitoFlujoVentanillaEForma 
where IdFlujoEtapa= 26
-- Date: 2015-08-24 11:38
*/

Estas modificaciones se deben revisar cuando se suba cambio de nombre

/**
Estos se eliminaran
*/

INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (144,26,'CNOM','SRS1','MIN','2015-08-23 11:10:05',1,'1','La solicitud de modificación de registro de signo distintivo mediante carta o memorial',NULL,1,'2015-08-23 11:10:05');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (145,26,'CNOM','SRS2','MIN','2015-08-23 11:10:05',2,'1','El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)',NULL,1,'2015-08-23 11:10:05');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (146,26,'CNOM','PCS1','MIN','2015-08-23 11:10:05',3,'1','Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI',NULL,1,'2015-08-23 11:10:05');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (147,26,'CNOM','PNR1','OPC','2015-08-23 11:10:05',1,'1','Los poderes necesarios en caso de representación o testimonio',NULL,1,'2015-08-23 11:10:05');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (148,26,'CNOM','EUR1','OPC','2015-08-23 11:10:05',2,'1','Empresa Unipersonal (NIT) o Registro de Comercio',NULL,1,'2015-08-23 11:10:05');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (149,26,'CNOM','PNA1','OPC','2015-08-23 11:10:05',3,'1','Persona Natural',NULL,1,'2015-08-23 11:10:05');


/**
Estos se quedaran en la base
*/
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (212,26,NULL,'SRS1','MIN','2015-08-23 11:10:08',1,'1','La solicitud de modificación de registro de signo distintivo mediante carta o memorial','NotaMemo',1,'2015-08-23 11:10:08');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (213,26,NULL,'R002','MIN','2015-08-23 11:10:08',2,'1','El formulario de solicitud de modificación de registro una copia de la primera hoja (ver página del SENAPI)',NULL,1,'2015-08-23 11:10:08');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (214,26,NULL,'PCS1','MIN','2015-08-23 11:10:08',3,'1','Pago por concepto de solicitud de modificación de registro de signo distintivo a la cuenta del SENAPI','NalInter',1,'2015-08-23 11:10:08');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (215,26,NULL,'PNR1','OPC','2015-08-23 11:10:08',1,'1','Los poderes necesarios en caso de representación o testimonio','RegComercio',1,'2015-08-23 11:10:08');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (216,26,NULL,'EUR1','OPC','2015-08-23 11:10:08',2,'1','Empresa Unipersonal (NIT) o Registro de Comercio','RegComercio',1,'2015-08-23 11:10:08');
INSERT INTO `RequisitoFlujoVentanillaEForma` (`IdRequisitoFlujoVentanillaEForma`,`IdFlujoEtapa`,`TipoGenero`,`Codigo`,`TipoRequisito`,`FechaCreacion`,`Posicion`,`Vigente`,`Descripcion`,`Dominio`,`Usuario`,`FechaUltimaModificacion`) VALUES (217,26,NULL,'PNA1','OPC','2015-08-23 11:10:08',3,'1','Persona Natural','FotOtro',1,'2015-08-23 11:10:08');



