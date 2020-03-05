package com.repositorio.repository;

import com.repositorio.model.Archivo;

public interface MultimediaRepository {
	
	public String subirArchivo(String nombre, String tipoArchivo, String duracion, String genero, String idArchivo );
	public Archivo consultarArchivo(String idArchivo);
	public String eliminarArchivo(String idArchivo);
	public String modificarArchivo(String nombre, String tipoArchivo, String duracion, String genero, String idArchivo);

}
