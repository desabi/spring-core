package com.abi.bean;

public class Taxi {
	
	private String sitio;
	private int numero;
	private Conductor conductor;
	
	public Taxi(String sitio, int numero, Conductor conductor) {
		this.sitio = sitio;
		this.numero = numero;
		this.conductor = conductor;
	}

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		return "Taxi [sitio=" + sitio + ", numero=" + numero + ", conductor=" + conductor + "]";
	}
	
	
}
