package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;


public interface EquipoMapper {
	public void registrarEquipo(@Param("id")String id, @Param("disponible")boolean disponible, @Param("elementos")ArrayList<Elemento> elementos);
	public Equipo getEquipo(@Param("id") String id);
	public List<Equipo> consultarEquipo();
	public void registrarElementoAEquipo(@Param("idElemento")String idElemento,@Param("id") String id);
	public ArrayList<Elemento> getElementos(@Param("tipo")String tipo);
}
