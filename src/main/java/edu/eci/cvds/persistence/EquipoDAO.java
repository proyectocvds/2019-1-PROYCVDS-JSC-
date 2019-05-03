package edu.eci.cvds.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;

public interface EquipoDAO {
	
	public void registrarEquipo(String id, boolean disponible, Date fecha) throws proyExcepcion;

	Equipo getEquipo(String id);
	
	public List<Equipo> consultarEquipos();

	public List<Equipo> equiposActivos(boolean valor);

	public List<Equipo> EquiposSinElementos();


}
