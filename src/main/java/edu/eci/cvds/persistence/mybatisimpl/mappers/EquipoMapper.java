package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;


public interface EquipoMapper {
	public void registrarEquipo(@Param("id")String id, @Param("disponible")boolean disponible, @Param("fecha")Date fecha);
	public Equipo getEquipo(@Param("id") String id);
	public List<Equipo> consultarEquipo();
	public List<Equipo> equiposActivos(@Param("valor")boolean valor);
	public List<Equipo> EquiposSinElementos();
}
