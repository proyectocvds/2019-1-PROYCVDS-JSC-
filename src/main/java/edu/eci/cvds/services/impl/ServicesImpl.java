package edu.eci.cvds.services.impl;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.Services;

public class ServicesImpl implements Services{
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Inject
	private ElementoDAO elementoDAO;

	@Override
	public Usuario getUsuario(String username) {
		return usuarioDAO.getUsuario(username);
	}

	public void registrarElemento(String id, boolean disponible, String tipo) {
		elementoDAO.registrarElemento(id, disponible, tipo);
		
	}
	
}
