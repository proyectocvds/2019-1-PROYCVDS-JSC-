package edu.eci.cvds.services.impl;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ServicesUsuario;

public class ServicesImplUsuario implements ServicesUsuario{
	
	@Inject
	private UsuarioDAO usuarioDAO;
	

	public Usuario getUsuario(String username) throws proyExcepcion {
		return usuarioDAO.getUsuario(username);
	}
	
	public Usuario consultarLogin(String username, String contrasena) throws proyExcepcion {
		return usuarioDAO.consultarLogin(username, contrasena);	
	}
	
	@Override
	public void nuevoUsuario(Usuario usuario) throws proyExcepcion {
		// TODO Auto-generated method stub
		
	}
}
