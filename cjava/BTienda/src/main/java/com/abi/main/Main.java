package com.abi.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abi.bean.Producto;
import com.abi.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Producto bateria = contexto.getBean("getBateria", Producto.class);
		Producto disco = contexto.getBean("getDisco", Producto.class);
		
		System.out.println(bateria);
		System.out.println(disco);
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
