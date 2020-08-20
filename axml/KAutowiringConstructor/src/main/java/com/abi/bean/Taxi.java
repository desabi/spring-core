package com.abi.bean;

public class Taxi {
	
	private int numero;
	private Conductor conductor;
	
	public Taxi(int numero, Conductor conductor) {
		this.numero = numero;
		this.conductor = conductor;
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
		return "Taxi [ numero=" + numero + ", conductor=" + conductor + "]";
	}
	
	
}
