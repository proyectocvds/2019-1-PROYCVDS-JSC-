package edu.eci.cvds.services;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Usuario;

public interface ServicesUsuario {
	public Usuario getUsuario(String username) throws proyExcepcion ;
	public void nuevoUsuario(Usuario usuario) throws proyExcepcion;
	
}
