package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.service.SaludoService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

		// La clase que implementa a la interfaz se llama: SaludoServiceImp
		// esta clase tiene la anotacion @Service
		// para crear su bean, se utiliza el mismo nombre de la clase, solo que con la
		// primer letra en minuscula
		// Nombre de la clase: SaludoServiceImp
		// Obtener el bean con: saludoServiceImp
		
		SaludoService saludoService = contexto.getBean("saludoServiceImp", SaludoService.class);

		saludoService.mensaje();

		((ConfigurableApplicationContext) contexto).close();

	}

}
