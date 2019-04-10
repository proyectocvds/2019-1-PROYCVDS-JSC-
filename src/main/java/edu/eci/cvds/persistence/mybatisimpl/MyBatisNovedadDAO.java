package edu.eci.cvds.persistence.mybatisimpl;


import java.util.Date;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.persistence.NovedadDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.NovedadMapper;



public class MyBatisNovedadDAO implements NovedadDAO{
	@Inject 
	NovedadMapper novedadMapper;
	
	@Override 
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento) {
		novedadMapper.registrarNovedad(id,fecha, titulo,  usuario,  detalle, equipo, elemento);
	}

}
