package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Habitacion;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Habitacion habitacion = contexto.getBean("HabitacionBean", Habitacion.class);
		
		System.out.println(habitacion);
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
