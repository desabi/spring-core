package com.abi.bean;

public class Usuario {
	
	private String nombre;
	private String habilidad;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getHabilidad() {
		return habilidad;
	}
	
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", habilidad=" + habilidad + "]";
	}	

}
