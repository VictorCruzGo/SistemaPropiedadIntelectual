

-- Scripts de modificación

-- 0. Iniciar el correlativo a partir del 100



-- 1. para actualizar el TipoGenero de SMSignoMarca

update SMSignoMarca
set TipoGenero = trim(TipoGenero);

-- 2 para colocar vigente = true

update SMSignoClaseNiza set Vigente = true;


-- 3 eliminar el registro de REGS, que se inserto en el Clasificador
delete from Clasificador where Dominio = 'TipoGenero' and Nombre='REGS';



-- Como seran las impresiones de los reportes en hojas discontinuas o continuas.
-- porque cambian los ids de la secuencia del IdRegistro.
-- Susana debe ir a definir urgente lo de la modificacion de SM.
-- Preguntar por la direccion de Notificacion las etiquetas de avenida o calle.


--Tareas comunes
--verificar la fecha del Sistema


--ver el clasificador TipoReferenciaFTP


--ultimo tramite registrado 151264


