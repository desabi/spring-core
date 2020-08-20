package com.abi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abi.bean.Usuario;

@Configuration
public class AppConfig {

	@Bean
	public Usuario getUsuario() {
		
		Usuario usuario = new Usuario();
		
		usuario.setNombre("Merlin");
		usuario.setHabilidad("Mago");
		
		return usuario;
	}
}
