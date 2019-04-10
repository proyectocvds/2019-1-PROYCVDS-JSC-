package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {

	public void registrarElemento(String id, boolean disponible, String tipo);



}
