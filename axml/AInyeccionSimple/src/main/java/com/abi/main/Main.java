package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.beans.Saludo;

public class Main {

	public static void main(String[] args) {

		/*Saludo saludo = new Saludo();
		
		saludo.setMensaje("Bienvenido a Spring");
		
		System.out.println(saludo.getMensaje());*/
		
		/*
		 * Llamamos al archivo beans.xml que es donde esta la creación del bean y 
		 * es en donde se le asigna los datos
		 * */
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		/* Obtenemos el bean, llamando al id especificado en beans.xml, en este caso
		 * el id es SaludoBean
		 * */
		Saludo saludo = contexto.getBean("SaludoBean", Saludo.class);
		
		System.out.println(saludo.getMensaje());
		
		((ConfigurableApplicationContext)contexto).close();
		
	}

}
