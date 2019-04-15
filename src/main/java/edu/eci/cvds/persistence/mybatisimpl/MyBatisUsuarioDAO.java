package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;

public class MyBatisUsuarioDAO implements UsuarioDAO {
	
	@Inject
	UsuarioMapper usuarioMapper;

	@Override
	public Usuario getUsuario(String username) {
		return usuarioMapper.getUsuario(username);
	}

	@Override
	public Usuario consultarLogin(String username, String contrasena) throws proyExcepcion {
		return usuarioMapper.consultarLogin(username, contrasena);
	}

}
