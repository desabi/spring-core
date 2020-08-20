package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Usuario;

public class Main {

	public static void main(String[] args) {

		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Usuario usuario = contexto.getBean("UsuarioBean", Usuario.class);
		
		usuario.imprimirDatos();
		
		((ConfigurableApplicationContext)contexto).close();
		

	}

}
