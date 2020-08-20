package com.abi.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoServiceImp implements SaludoService {

	@Override
	public void mensaje() {
		System.out.println("Spring con anotaciones");
	}

}
