package com.repositorio.services.impl;


import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.repositorio.model.Archivo;
import com.repositorio.repository.impl.MultimediaRepositoryImpl;
import com.repositorio.services.MultimediaService;

@WebService (endpointInterface = "com.repositorio.services.MultimediaService")
public class MultimediaServicesImpl implements MultimediaService{
	
	@Autowired
	MultimediaRepositoryImpl reposity = new MultimediaRepositoryImpl();
	
	@Override
	public String subirArchivo(String nombre, String tipoArchivo, String duracion, String genero, String idArchivo) {
		return reposity.subirArchivo(nombre, tipoArchivo, duracion, genero, idArchivo);
	}

	@Override
	public Archivo consultarArchivo(String idArchivo) {
		return reposity.consultarArchivo(idArchivo);
	}

	@Override
	public String eliminarArchivo(String idArchivo) {
		return reposity.eliminarArchivo(idArchivo);
	}

	@Override
	public String modificarArchivo(String nombre, String tipoArchivo, String duracion, String genero,
			String idArchivo) {
		return reposity.modificarArchivo(nombre, tipoArchivo, duracion, genero, idArchivo);
	}

}
