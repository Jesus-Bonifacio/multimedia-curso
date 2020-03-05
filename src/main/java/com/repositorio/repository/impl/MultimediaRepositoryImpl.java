package com.repositorio.repository.impl;

import com.repositorio.repository.MultimediaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.stereotype.Repository;

import com.repositorio.model.Archivo;

@Repository
public class MultimediaRepositoryImpl implements MultimediaRepository{
	
	public static void main(String[] args) {
		archivosMultimedia.add(new Archivo("R2", "mp3", "05:00", "publicitario", "" + 11 ));
		for (int i = 0; i < 10; i++) {
			archivosMultimedia.add(new Archivo("R1", "mp4", "10:00", "publicitario", "" + i ));
		}
		System.out.println(consultar("11").getNombre());
	}
	
	
	public static Archivo consultar(String idArchivo) {
		return archivosMultimedia.stream()
				  .filter(multimedia -> idArchivo.equals(multimedia.getIdArchivo()))
				  .findAny()
				  .orElse(null);
	}
	
	public static List<Archivo> archivosMultimedia = new ArrayList<>();
	
	@Override
	public String subirArchivo(String nombre, String tipoArchivo, String duracion, String genero, String idArchivo) {
		archivosMultimedia.add(new Archivo(nombre, tipoArchivo, duracion, genero, idArchivo));
		return "Archivo multimedia almacenado con exito";
	}

	@Override
	public Archivo consultarArchivo(String idArchivo) {
		System.out.println(idArchivo);
		return archivosMultimedia.stream()
				  .filter(multimedia -> idArchivo.equals(multimedia.getIdArchivo()))
				  .findAny()
				  .orElse(null);
	}

	@Override
	public String eliminarArchivo(String idArchivo) {
		try {
			archivosMultimedia.remove(consultarArchivo(idArchivo));
			return "Eliminado con exito";
		} catch (Exception e) {
			e.printStackTrace();
			return "Usuario no encontrado";
		}
	}

	@Override
	public String modificarArchivo(String nombre, String tipoArchivo, String duracion, String genero,
			String idArchivo) {
		try {
			if(archivosMultimedia.contains(consultarArchivo(idArchivo))){
				archivosMultimedia.set(archivosMultimedia.indexOf(consultarArchivo(idArchivo)), new Archivo(nombre, tipoArchivo, duracion, genero, idArchivo));
			}
			return "Modificado con exito";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error al modificar el archivo";
		}
	}
}
