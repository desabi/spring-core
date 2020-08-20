package com.abi.bean;

public class Cuenta {
	
	private String banco;
	private Propietario propietario;
	private double saldo;
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public Propietario getPropietario() {
		return propietario;
	}
	
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [banco=" + banco + ", propietario=" + propietario + ", saldo=" + saldo + "]";
	}
	
	
}
