package edu.eci.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;

public interface ElementoMapper {

	public void registrarElemento(@Param("id") String id, @Param("disponible")boolean disponible, @Param("tipo")String tipo);

}
