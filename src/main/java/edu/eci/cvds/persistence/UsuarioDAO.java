package edu.eci.cvds.persistence;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {
	
	public Usuario getUsuario(String username) throws proyExcepcion ;
	
	public Usuario consultarLogin(String username, String contrasena) throws proyExcepcion;
	

}
