package com.abi.dao;

public class EmpleadoDAOImp implements EmpleadoDAO {

	@Override
	public void insertar() {
		System.out.println("DAO: insertar");
	}

	@Override
	public void leer() {
		System.out.println("DAO: leer");
	}

	@Override
	public void actualizar() {
		System.out.println("DAO: actualizar");
	}

	@Override
	public void eliminar() {
		System.out.println("DAO: eliminar");
	}

}
