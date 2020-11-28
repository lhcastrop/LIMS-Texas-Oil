package com.texasoil.lims.componentes.usuario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.texasoil.lims.componentes.usuario.modelo.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
