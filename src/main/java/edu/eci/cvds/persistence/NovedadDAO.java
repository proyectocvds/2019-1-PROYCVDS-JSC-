package edu.eci.cvds.persistence;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Novedad;

import edu.eci.cvds.proyExcepcion;

public interface NovedadDAO {
	

	

	public List<Novedad> consultarNovedad();

	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String detalle, String usuario, String elemento, String equipo,String laboratorio) throws proyExcepcion;

	public List<Novedad> novedadEquipo(String equipo);

	public List<Novedad> novedadElemento(String elemento);
	
	public List<Novedad> novedadLaboratorio(String laboratorio);

	public List<Novedad> laboratorio();

	public List<Novedad> elemento();

	public List<Novedad> equipo();


	

}
