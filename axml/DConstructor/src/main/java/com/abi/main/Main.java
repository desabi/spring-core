package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Persona;

public class Main {

	public static void main(String[] args) {
		
		/* Llamar al archivo donde configuramos el bean y sus datos */
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		/* Obtener el bean indicando el id escrito en el archivo beans.xml */
		Persona persona = contexto.getBean("PersonaBean", Persona.class);
				
		System.out.println(persona.toString());
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
