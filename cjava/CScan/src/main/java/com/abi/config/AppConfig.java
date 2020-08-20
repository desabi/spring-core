package com.abi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.abi"})
@Configuration
public class AppConfig {
	
	/*
	 * Si los metodos estan activos (sin comentarios), en el main muestra null
	 * Ignora los datos establecidos dentro de los metodos
	 * ¿Entonces donde defino los datos? En el main, con los set
	 * 
	 * */
	
	/*
	
	En lugar de hacer estos metodos, ahora se agrega le anotacion @Component
	en la clase. 
	
	@Bean
	public Bateria getBateria() {
		Bateria bateria = new Bateria("AAA", 50);		
		bateria.setRecargable(true);	
		return bateria;		
	}
	
	@Bean
	public Disco getDisco() {
		Disco disco = new Disco("CD-RW", 25);
		disco.setCapacidad(700);
		return disco;
	}
	*/
}

/*
 * A configuration class can be used to read the annotated beans definitions as well.
 * In this case, because the bean’s definition configuration is part of the bean class, 
 * the class will no longer need any @Bean annotated methods.
 * But, to be able to look for bean definitions inside Java classes, component scanning has to be enabled. 
 * This is done by annotating the configuration class with an annotation that is the equivalent of the <context:component-scanning ../> element. 
 */
