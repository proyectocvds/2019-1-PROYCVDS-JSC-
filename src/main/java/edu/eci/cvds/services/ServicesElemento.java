package edu.eci.cvds.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;

public interface ServicesElemento {
	
	public void registrarElemento(String id,String nombre, boolean disponible, String tipo,Date fecha, String marca,String estado) throws proyExcepcion;
	public List<Elemento> listByElemento() throws proyExcepcion;
	public void nuevoElemento(Elemento elemento) throws proyExcepcion;
	public void registrarElementoAEquipo(String idElemento, String equipo, String eliminado);
	public void eliminarElemento(String id ,String valor);
	public List<Elemento> elementosSinEquipo();
	public List<Elemento> administraElemento(String id);
	

}
