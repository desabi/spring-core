package com.abi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abi.bean.Bateria;
import com.abi.bean.Disco;

@Configuration
public class AppConfig {
	
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
	
}
