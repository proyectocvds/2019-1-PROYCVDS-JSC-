package edu.eci.cvds.services.impl;

import com.google.inject.Inject;

import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.Services;

public class ServicesImpl implements Services{
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
}