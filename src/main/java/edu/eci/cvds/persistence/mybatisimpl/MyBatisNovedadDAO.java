package edu.eci.cvds.persistence.mybatisimpl;


import java.util.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.persistence.NovedadDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.NovedadMapper;



public class MyBatisNovedadDAO implements NovedadDAO{
	@Inject 
	NovedadMapper novedadMapper;
	
	@Override 
	public void registrarNovedad(String id, Date fecha, String titulo, String detalle, String usuario, String elemento, String equipo) {
		novedadMapper.registrarNovedad(id,fecha, titulo, detalle, usuario, elemento, equipo);
	}

	@Override
	public List<Novedad> consultarNovedad() {
		return novedadMapper.consultarNovedad();
	}

	@Override
	public List<Novedad> novedadEquipo(String equipo) {
		return novedadMapper.novedadEquipo(equipo);
	}

	@Override
	public List<Elemento> novedadElemento(String elemento) {
		return novedadMapper.novedadElemento(elemento);
	}

}
