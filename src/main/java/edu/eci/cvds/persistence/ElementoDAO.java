package edu.eci.cvds.persistence;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {

	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;

	Elemento getElemento(String id);



}
