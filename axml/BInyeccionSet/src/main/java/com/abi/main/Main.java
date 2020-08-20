package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Persona;

public class Main {

	public static void main(String[] args) {		
		
		// Llamar al archivo donde se configuraron los datos del bean
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		// obtener el bean, indicando el id especificado en beans.xml
		Persona persona = contexto.getBean(Persona.class);
		
		System.out.println(persona);
		
		((ConfigurableApplicationContext)contexto).close();
	}

}
