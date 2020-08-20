package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Cuenta cuenta = contexto.getBean("CuentaBean", Cuenta.class);
		
		System.out.println(cuenta);
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
