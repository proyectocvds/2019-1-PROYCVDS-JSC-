package edu.eci.cvds.persistence;

import edu.eci.cvds.proyExcepcion;

import java.util.ArrayList;
import java.util.List;
import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {

	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;

	Elemento getElemento(String id);

	public List<Elemento> consultarElementos();
	
	public void save(Elemento elemento);

	public void registrarElementoAEquipo(String id, String idElemento);

	public void eliminarElemento(String id);





}
