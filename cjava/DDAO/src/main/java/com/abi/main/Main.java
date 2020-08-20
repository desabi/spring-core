package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abi.config.AppConfig;
import com.abi.service.EmpleadoService;

public class Main {

	public static void main(String[] args) {

		// Llamar al archivo de configuracion para obtener los beans
		ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Obtener el bean
		EmpleadoService empleadoService = contexto.getBean("empleadoServiceImp", EmpleadoService.class);
		
		empleadoService.insertar();
		empleadoService.leer();
		empleadoService.actualizar();
		empleadoService.eliminar();
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
