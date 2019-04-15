package edu.eci.cvds.services;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;

public interface Services {
	public Usuario getUsuario(String username) throws proyExcepcion ;
	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;
	public void registrarEquipo(String id, boolean disponible) throws proyExcepcion ;
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento) throws proyExcepcion;
	public List<Elemento> listByElemento() throws proyExcepcion;


	}
