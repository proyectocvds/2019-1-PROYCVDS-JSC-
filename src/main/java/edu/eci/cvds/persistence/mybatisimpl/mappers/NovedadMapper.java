package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Novedad;


public interface NovedadMapper {
	
	public void registrarNovedad(@Param("id")String id, @Param("fecha")Date fecha, @Param("titulo")String titulo, @Param("usuario")String usuario,@Param("detalle")String detalle, @Param("equipo")String equipo, @Param("elemento")String elemento);

}
