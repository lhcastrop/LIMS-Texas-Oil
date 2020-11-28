package com.texasoil.lims.componentes.usuario.servicio;

import java.util.List;

import com.texasoil.lims.componentes.usuario.modelo.Usuario;


public interface UsuarioServicio {

    Usuario crearUsuario(Usuario usuario);
	
	Usuario actualizarUsuario(Usuario usuario);
	
	List<Usuario> obtenerTodosUsuario();
	
	Usuario obtenerUsuarioPorId(long usuarioId);
	
	void eliminarUsuario(long id);
}
