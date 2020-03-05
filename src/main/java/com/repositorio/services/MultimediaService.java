package com.repositorio.services;

import javax.jws.WebParam;
import javax.jws.WebService;
import com.repositorio.model.Archivo;

@WebService
public interface MultimediaService {
	
	public String subirArchivo(@WebParam(name = "nombre", partName = "nombre") String nombre, @WebParam(name = "tipoArchivo", partName = "tipoArchivo") String tipoArchivo, @WebParam(name = "duracion", partName = "duracion") String duracion, @WebParam(name = "genero", partName = "genero") String genero, @WebParam(name = "idArchivo", partName = "idArchivo") String idArchivo );
	public Archivo consultarArchivo(@WebParam(name = "idArchivo", partName = "idArchivo")String idArchivo);
	public String eliminarArchivo(@WebParam(name = "idArchivo", partName = "idArchivo") String idArchivo);
	public String modificarArchivo(@WebParam(name = "nombre", partName = "nombre") String nombre, @WebParam(name = "tipoArchivo", partName = "tipoArchivo") String tipoArchivo, @WebParam(name = "duracion", partName = "duracion") String duracion, @WebParam(name = "genero", partName = "genero") String genero, @WebParam(name = "idArchivo", partName = "idArchivo") String idArchivo);

}
