package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {

	public void registrarElemento(String id, boolean disponible, String tipo);

	public List<Elemento> consultarElementos();



}
