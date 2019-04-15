package edu.eci.cvds.persistence.mybatisimpl;


import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
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
	public void registrarEquipo(String id, boolean disponible) throws proyExcepcion {
		if(getEquipo(id)!=null) throw new proyExcepcion("Ya existe el equipo");
		if(getEquipo(id)==null) throw new proyExcepcion("El equipo no debe ser nulo");
		
		equipoMapper.registrarEquipo(id,disponible);
	}
	

}
