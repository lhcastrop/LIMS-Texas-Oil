package com.texasoil.lims.componentes.usuario.modelo;


import javax.persistence.Column;



public class Empleado extends Usuario {

	@Column(name="Codigo")
	private long codigo;
	
	
	@Column(name="cargo")
	private String cargo;


	public long getCodigo() {
		return codigo;
	}


	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
