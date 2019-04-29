package edu.eci.cvds.services;

import java.util.ArrayList;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;

public interface ServicesElemento {
	
	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;
	public List<Elemento> listByElemento() throws proyExcepcion;
	public void nuevoElemento(Elemento elemento) throws proyExcepcion;
	//public List<Elemento> novedadElemento(String novedadElem)throws proyExcepcion;
	public void registrarElementoAEquipo(String id, String idEquipo);

}
