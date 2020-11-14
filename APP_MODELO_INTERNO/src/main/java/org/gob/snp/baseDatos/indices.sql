create index i_tramiteusuario_idusuario_idtramite on TramiteUsuario (IdUsuario, IdTramite);

# drop index i_tramiteusuario_idusuario_idtramite on TramiteUsuario;



create index i_clasificador_dominio_vigente on Clasificador (Dominio, Vigente);


# drop index i_clasificador_dominio_vigente on Clasificador;