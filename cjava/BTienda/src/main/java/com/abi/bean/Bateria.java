package com.abi.bean;

public class Bateria extends Producto {
	
	private boolean recargable;

	public Bateria(String nombre, double precio) {		
		super(nombre, precio);
	}

	public boolean isRecargable() {
		return recargable;
	}

	public void setRecargable(boolean recargable) {
		this.recargable = recargable;
	}
		
}
