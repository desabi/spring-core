package com.abi.bean;

public class Gato implements Animal {

	@Override
	public void emitirSonido() {
		System.out.println("### GATO ##");
		System.out.println("Miau");
	}

}
