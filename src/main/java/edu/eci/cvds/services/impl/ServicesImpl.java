package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import java.sql.Date;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.persistence.EquipoDAO;
import edu.eci.cvds.persistence.NovedadDAO;

public class ServicesImpl implements Services{
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Inject
	private ElementoDAO elementoDAO;
	
	@Inject 
	private EquipoDAO equipoDAO;

	@Inject 
	private NovedadDAO novedadDAO;

	
	public Usuario getUsuario(String username) {
		return usuarioDAO.getUsuario(username);
	}
	
	
	public void registrarElemento(String id, boolean disponible, String tipo) {
		System.out.println("///////////////////////////////////SERVICES");
		elementoDAO.registrarElemento(id, disponible, tipo);
		
		
	}
	
	
	public void registrarEquipo(String id, boolean disponible) {
		equipoDAO.registrarEquipo(id, disponible);
	}


	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String usuario, String detalle,
			String equipo, String elemento) {
		novedadDAO.registrarNovedad(id, fecha, titulo, usuario, detalle, equipo, elemento);
		
	}


	
	
	
}
