package edu.eci.cvds.persistence;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Equipo;

public interface EquipoDAO {
	
	public void registrarEquipo(String id, boolean disponible) throws proyExcepcion;

	Equipo getEquipo(String id);
}
