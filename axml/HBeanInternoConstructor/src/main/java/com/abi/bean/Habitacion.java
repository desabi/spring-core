package com.abi.bean;

public class Habitacion {

	private int numero;
	private double costo;
	private Inquilino inquilino;

	public Habitacion(int numero, double costo, Inquilino inquilino) {
		this.numero = numero;
		this.costo = costo;
		this.inquilino = inquilino;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", costo=" + costo + ", inquilino=" + inquilino + "]";
	}

}
