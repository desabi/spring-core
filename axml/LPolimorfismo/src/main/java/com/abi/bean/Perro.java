package com.abi.bean;

public class Perro implements Animal {
	
	private String nombre;	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void emitirSonido() {
		System.out.println("### PERRO ##");
		System.out.println("Nombre: " + nombre);
		System.out.println("Guau");
	}

}
