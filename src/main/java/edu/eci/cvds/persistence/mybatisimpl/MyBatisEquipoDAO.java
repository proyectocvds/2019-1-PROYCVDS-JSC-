package edu.eci.cvds.persistence.mybatisimpl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.persistence.EquipoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.EquipoMapper;

public class MyBatisEquipoDAO implements EquipoDAO{
	@Inject 
	EquipoMapper equipoMapper;
	
	@Override
	
	public Equipo getEquipo(String id) {
		return equipoMapper.getEquipo(id);
	}
	
	@Override
	public void registrarEquipo(String id, boolean disponible, Date fecha) throws proyExcepcion {
		
		equipoMapper.registrarEquipo(id,disponible, fecha);
	}
	
	@Override
	public List<Equipo> consultarEquipos(){
		return equipoMapper.consultarEquipo();
	}

	@Override
	public List<Equipo> equiposActivos(boolean valor) {
		return equipoMapper.equiposActivos(valor);
	}

	@Override
	public List<Equipo> EquiposSinElementos() {
		return equipoMapper.EquiposSinElementos();
	}

	@Override
	public void registrarEquipoALaboratorio(String id, String laboratorio) {
		equipoMapper.registrarEquipoALaboratorio(id,laboratorio);
		
	}

}
