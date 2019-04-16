package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Equipo;


public interface EquipoMapper {
	public void registrarEquipo(@Param("id")String id, @Param("disponible")boolean disponible);
	public Equipo getEquipo(@Param("id") String id);
	public List<Equipo> consultarEquipo();
}
