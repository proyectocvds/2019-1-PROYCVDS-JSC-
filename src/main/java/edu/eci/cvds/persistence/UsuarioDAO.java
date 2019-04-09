package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {
	
	Usuario getUsuario(String username);

}
