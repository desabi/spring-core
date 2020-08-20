package com.abi.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abi.bean.Producto;
import com.abi.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Producto bateria = contexto.getBean("bateria", Producto.class);
		Producto disco = contexto.getBean("disco", Producto.class);
		
		bateria.setNombre("AAA");
		bateria.setPrecio(50);
		// bateria.setRecargable(true) no se puede porque se esta
		// usando la clase abstracta al crear el objeto: Producto bateria
		
		disco.setNombre("CD-RW");
		disco.setPrecio(25);
		// disco.setCapacidad(700) no se puede usar porque se esta
		// usando la clase abstracta al crear el objeto: Producto disco
		
		System.out.println(bateria);
		System.out.println(disco);
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
