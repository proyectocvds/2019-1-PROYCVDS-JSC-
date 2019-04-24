package edu.eci.cvds.services;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Novedad;

public interface ServicesNovedad {
	
	public void registrarNovedad(String id, Date fecha, String titulo, String detalle, String usuario, String elemento, String equipo) throws proyExcepcion;
	
	public List<Novedad> listByNovedad() throws proyExcepcion;
	public void nuevoNovedad(Novedad novedad) throws proyExcepcion;
	List<Novedad> novedadEquipo(String equipo) throws proyExcepcion;
	List<Novedad> novedadElemento(String elemento) throws proyExcepcion;


}
