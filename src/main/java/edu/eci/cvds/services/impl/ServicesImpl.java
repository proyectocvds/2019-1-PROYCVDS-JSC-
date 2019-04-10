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

	@Override
	public Usuario getUsuario(String username) {
		return usuarioDAO.getUsuario(username);
	}
	
	@Override
	public void registrarElemento(String id, boolean disponible, String tipo) {
		elementoDAO.registrarElemento(id, disponible, tipo);
		
	}
	
	@Override
	public void registrarEquipo(String id, boolean disponible) {
		equipoDAO.registrarEquipo(id, disponible);
	}

	@Override
	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String usuario, String detalle,
			String equipo, String elemento) {
		novedadDAO.registrarNovedad(id, fecha, titulo, usuario, detalle, equipo, elemento);
		
	}


	
	
	
}
