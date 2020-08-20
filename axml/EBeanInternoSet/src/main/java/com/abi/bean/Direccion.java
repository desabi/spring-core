package com.abi.bean;

public class Direccion {
	
	private String ciudad;
	private String colonia;
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getColonia() {
		return colonia;
	}
	
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	@Override
	public String toString() {
		return "Direccion [ciudad=" + ciudad + ", colonia=" + colonia + "]";
	}
	
	
}
