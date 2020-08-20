package com.abi.service;

import org.springframework.stereotype.Service;

import com.abi.dao.EmpleadoDAO;

@Service
public class EmpleadoServiceImp implements EmpleadoService {

	EmpleadoDAO empleadoDAO;
	
	// inyeccion via constructor
	
	/*
	 * Se deberia colocar @Autowired
	 * Pero como solo hay un constructor, El autowired se hace automaticamente
	 * */
	public EmpleadoServiceImp(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}

	
	@Override
	public void insertar() {
		empleadoDAO.insertar();
		System.out.println("SERVICE: insertar\n");
	}

	@Override
	public void leer() {
		empleadoDAO.leer();
		System.out.println("SERVICE: leer\n");
	}

	@Override
	public void actualizar() {
		empleadoDAO.actualizar();
		System.out.println("SERVICE: actualizar\n");
	}

	@Override
	public void eliminar() {
		empleadoDAO.eliminar();
		System.out.println("SERVICE: eliminar\n");
	}

}
