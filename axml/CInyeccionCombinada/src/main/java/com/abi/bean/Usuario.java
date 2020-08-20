package com.abi.bean;

import java.util.Date;

public class Usuario {
	
	private String nombre;
	private Date fecha;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void imprimirDatos() {
		System.out.println("USUARIO");
		System.out.println("Nombre: " + nombre);
		fecha = new Date();
		System.out.println("Fecha: " +  fecha );
	}	
	
}
