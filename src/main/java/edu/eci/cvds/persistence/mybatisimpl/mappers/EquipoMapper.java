package edu.eci.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Equipo;


public interface EquipoMapper {
	public void registrarEquipo(@Param("id")String id, @Param("disponible")boolean disponible);
	
}
