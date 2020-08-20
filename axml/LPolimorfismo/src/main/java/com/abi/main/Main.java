package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Animal;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Animal animal1 = contexto.getBean("GatoBean", Animal.class);
		Animal animal2 = contexto.getBean("PerroBean", Animal.class);
		
		animal1.emitirSonido();
		animal2.emitirSonido();
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
