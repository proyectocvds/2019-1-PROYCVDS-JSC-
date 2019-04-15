package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;

public interface ElementoMapper {
	
	public Elemento getElemento(@Param("id") String id);

	public void registrarElemento(@Param("id") String id, @Param("disponible")boolean disponible, @Param("tipo")String tipo);

	public List<Elemento> consultarElemento();

}
