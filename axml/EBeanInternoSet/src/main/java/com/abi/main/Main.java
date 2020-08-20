package com.abi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abi.bean.Individuo;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		Individuo individuo = contexto.getBean("IndividuoBean", Individuo.class);
		
		System.out.println(individuo);

		((ConfigurableApplicationContext)contexto).close();
		
	}

}
