package edu.eci.cvds.services;

import java.util.ArrayList;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Novedad;

public interface ServicesEquipo {
	
	public void registrarEquipo(String id, boolean disponible, ArrayList<Elemento> elementos) throws proyExcepcion ;
	public List<Equipo> listByEquipo() throws proyExcepcion;
	public void nuevoEquipo(Equipo equipo) throws proyExcepcion;
	public void registrarElementoAEquipo(String idElemento, String id);
	

}
