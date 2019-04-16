package edu.eci.cvds.services;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.entities.Usuario;

public interface Services {

	/*public Usuario getUsuario(String username);
	public void registrarElemento(String id, boolean disponible, String tipo);
	public void registrarEquipo(String id, boolean disponible);
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento);
	public List<Elemento> listByElemento();
	public List<Novedad> listByNovedad();
	*/
	
	
	//public void validarUsuario();
	//public void consultarLogin(String username, String contrasena);

	public Usuario getUsuario(String username) throws proyExcepcion ;
	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;
	public void registrarEquipo(String id, boolean disponible) throws proyExcepcion ;
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento) throws proyExcepcion;
	public List<Elemento> listByElemento() throws proyExcepcion;
	public List<Novedad> listByNovedad() throws proyExcepcion;
	public List<Equipo> listByEquipo() throws proyExcepcion;



	}
