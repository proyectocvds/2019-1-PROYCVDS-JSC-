package edu.eci.cvds.services;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.entities.Usuario;

public interface Services {
	public Usuario getUsuario(String username);
	public void registrarElemento(String id, boolean disponible, String tipo);
	public void registrarEquipo(String id, boolean disponible);
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento);
	public List<Elemento> listByElemento();
	public List<Novedad> listByNovedad();
	
	
	//public void validarUsuario();
	//public void consultarLogin(String username, String contrasena);
	



}
