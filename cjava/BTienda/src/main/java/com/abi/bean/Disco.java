package com.abi.bean;

public class Disco extends Producto {

	private int capacidad;
	
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
