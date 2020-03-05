package com.repositorio.model;

public class Archivo {

	private String nombre;
	private String tipoArchivo;
	private String duracion;
	private String genero;
	private String idArchivo;
	
	public Archivo() {
		super();
	}
	
	public Archivo(String nombre, String tipoArchivo, String duracion, String genero, String idArchivo) {
		super();
		this.nombre = nombre;
		this.tipoArchivo = tipoArchivo;
		this.duracion = duracion;
		this.genero = genero;
		this.idArchivo = idArchivo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoArchivo() {
		return tipoArchivo;
	}
	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdArchivo() {
		return idArchivo;
	}
	public void setIdArchivo(String idArchivo) {
		this.idArchivo = idArchivo;
	}
	
	
}
