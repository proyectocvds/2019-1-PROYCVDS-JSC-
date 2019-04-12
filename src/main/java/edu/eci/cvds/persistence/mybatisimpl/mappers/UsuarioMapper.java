package edu.eci.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioMapper {

	public Usuario getUsuario(@Param("username") String username);
	public Usuario consultarLogin(@Param("username") String username, @Param ("contrasena") String contrasena);   

}
