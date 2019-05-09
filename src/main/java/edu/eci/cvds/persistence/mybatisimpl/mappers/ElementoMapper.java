package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;

public interface ElementoMapper {
	
	public Elemento getElemento(@Param("id") String id);

	public void registrarElemento(@Param("id") String id, @Param("disponible")boolean disponible, @Param("tipo")String tipo, @Param("fecha") Date fecha, @Param("marca") String marca, @Param("estado") String estado);

	public List<Elemento> consultarElemento();

	public void registrarElementoAEquipo(@Param("idElemento")String idElemento, @Param("equipo")String equipo);

	public void eliminarElemento(@Param ("id") String id, @Param("valor") String valor);

	public List<Elemento> elementosSinEquipo();


}
