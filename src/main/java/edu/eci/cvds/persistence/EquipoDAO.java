package edu.eci.cvds.persistence;

import java.util.ArrayList;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;

public interface EquipoDAO {
	
	public void registrarEquipo(String id, boolean disponible, ArrayList<Elemento> elementos) throws proyExcepcion;

	Equipo getEquipo(String id);
	
	public List<Equipo> consultarEquipos();

	public void registrarElementoAEquipo(String idElemento, String id);

	public List<Equipo> equiposActivos(boolean valor);


}
