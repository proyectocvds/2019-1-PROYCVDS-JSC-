package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {
	
	public Usuario getUsuario(String username);
	
	public Usuario consultarLogin(String username, String contrasena);

}
