package com.texasoil.lims.componentes.usuario.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.texasoil.lims.componentes.usuario.modelo.Usuario;
import com.texasoil.lims.componentes.usuario.servicio.UsuarioServicio;



@RestController
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;
	@GetMapping("/usuarios")
	public ResponseEntity <List<Usuario>> obtenerTodosUsuario(){
				return ResponseEntity.ok().body(usuarioServicio.obtenerTodosUsuario());
	}

	@GetMapping("/usuarios/{id}")
	public ResponseEntity <Usuario> obtenerUsuarioPorId(@PathVariable long id){
				return ResponseEntity.ok().body(usuarioServicio.obtenerUsuarioPorId(id));
	}
	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.ok().body(usuarioServicio.crearUsuario(usuario));
}
	
	@PutMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> actualizarUsuario(@PathVariable long id, @RequestBody Usuario usuario){
		usuario.setId(id);
		return ResponseEntity.ok().body(usuarioServicio.actualizarUsuario(usuario));
}
	@DeleteMapping("/usuarios/{id}")
	public ResponseEntity<Void> eliminarUsuario(@PathVariable long id){
		this.usuarioServicio.eliminarUsuario(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
	
}
