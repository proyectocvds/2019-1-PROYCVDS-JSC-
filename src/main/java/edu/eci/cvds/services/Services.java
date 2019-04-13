package edu.eci.cvds.services;

import java.util.Date;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;

public interface Services {
	public Usuario getUsuario(String username);
	public void registrarElemento(String id, boolean disponible, String tipo);
	public void registrarEquipo(String id, boolean disponible);
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento);
	//public void validarUsuario();
	//public void consultarLogin(String username, String contrasena);
	



}
