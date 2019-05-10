package edu.eci.cvds.persistence;

import edu.eci.cvds.proyExcepcion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {

	public void registrarElemento(String id, String nombre, boolean disponible, String tipo ,Date fecha, String marca , String estado) throws proyExcepcion;

	Elemento getElemento(String id);

	public List<Elemento> consultarElementos();
	
	public void save(Elemento elemento);

	public void registrarElementoAEquipo(String id, String equipo, String eliminado);

	public void eliminarElemento(String idElemento,String valor);

	public List<Elemento> elementosSinEquipo();
	
	public List<Elemento> administraElemento(String id);





}
