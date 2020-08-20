package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Taxi;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Taxi taxi = contexto.getBean("TaxiBean", Taxi.class);
		
		System.out.println(taxi);
		
		((ConfigurableApplicationContext)contexto).close();

	}

}
