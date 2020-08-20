package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.service.EmpleadoService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		EmpleadoService empleadoService = contexto.getBean("empleadoService", EmpleadoService.class);
		
		empleadoService.insertar();
		empleadoService.leer();
		empleadoService.actualizar();
		empleadoService.eliminar();
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
