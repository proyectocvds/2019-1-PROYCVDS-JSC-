package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Novedad;


public interface NovedadMapper {
	
	public void registrarNovedad(@Param("id")String id, @Param("fecha")Date fecha, @Param("titulo")String titulo,@Param("detalle")String detalle, @Param("usuario")String usuario, @Param("elemento")String elemento, @Param("equipo")String equipo);

	public List<Novedad> consultarNovedad();

	public List<Novedad> novedadEquipo(@Param("equipo")String equipo);

	public List<Novedad> novedadElemento(@Param("elemento") String elemento);
	
	public List<Novedad> novedadLaboratorio(@Param("laboratorio") String elemento);

}
