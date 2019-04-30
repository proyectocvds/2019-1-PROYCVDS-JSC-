package edu.eci.cvds.persistence.mybatisimpl;


import java.util.ArrayList;
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
	public void registrarEquipo(String id, boolean disponible, ArrayList<Elemento> elementos) throws proyExcepcion {
		//if(getEquipo(id)!=null) throw new proyExcepcion("Ya existe el Equipo");
		//if(getEquipo(id)==null) throw new proyExcepcion("El equipo no debe ser nulo");
		
		equipoMapper.registrarEquipo(id,disponible, elementos);
	}
	
	@Override
	public List<Equipo> consultarEquipos(){
		return equipoMapper.consultarEquipo();
	}

	@Override
	public void registrarElementoAEquipo(String idElemento, String id) {
		equipoMapper.registrarElementoAEquipo(idElemento,id);
		
	}

	@Override
	public List<Equipo> equiposActivos(boolean valor) {
		return equipoMapper.equiposActivos(valor);
	}
	
	

}
