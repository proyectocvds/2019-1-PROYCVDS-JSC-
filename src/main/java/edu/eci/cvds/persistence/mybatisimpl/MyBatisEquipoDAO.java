package edu.eci.cvds.persistence.mybatisimpl;


import com.google.inject.Inject;

import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.persistence.EquipoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.EquipoMapper;

public class MyBatisEquipoDAO implements EquipoDAO{
	@Inject 
	EquipoMapper equipoMapper;
	
	
	@Override
	public void registrarEquipo(String id, boolean disponible) {
		equipoMapper.registrarEquipo(id,disponible);
	}
	

}
