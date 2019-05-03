package edu.eci.cvds.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Novedad;

public interface ServicesEquipo {
	
	public void registrarEquipo(String id, boolean disponible, Date fecha) throws proyExcepcion ;
	public List<Equipo> listByEquipo() throws proyExcepcion;
	public void nuevoEquipo(Equipo equipo) throws proyExcepcion;
	public List<Equipo> equiposActivos(boolean valor);
	public List<Equipo> EquiposSinElementos();
	
	

}
