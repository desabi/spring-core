package com.abi.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abi.bean.Usuario;
import com.abi.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Usuario usuario = contexto.getBean("getUsuario", Usuario.class);
		
		System.out.println(usuario);
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
