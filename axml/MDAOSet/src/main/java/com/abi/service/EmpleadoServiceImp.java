package com.abi.service;

import com.abi.dao.EmpleadoDAO;

public class EmpleadoServiceImp implements EmpleadoService {

	EmpleadoDAO empleadoDAO;

	/* inyeccion via set */
	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}
	
	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
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
