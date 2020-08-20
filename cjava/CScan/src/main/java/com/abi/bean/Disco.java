package com.abi.bean;

import org.springframework.stereotype.Component;

@Component
public class Disco extends Producto {

	private int capacidad;
	
	public Disco() {
		
	}
	
	public Disco(String nombre, double precio) {
		super(nombre, precio);
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
		
}
