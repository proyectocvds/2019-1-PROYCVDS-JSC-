package edu.eci.cvds.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.persistence.EquipoDAO;
import edu.eci.cvds.services.ServicesEquipo;

public class ServicesImplEquipo implements ServicesEquipo {
	@Inject 
	private EquipoDAO equipoDAO;
	
	public void registrarEquipo(String id, boolean disponible, ArrayList<Elemento> elementos) throws proyExcepcion {
		equipoDAO.registrarEquipo(id, disponible, elementos);
	}
	
	@Override
	public void nuevoEquipo(Equipo equipo) throws proyExcepcion {
		// TODO Auto-generated method stub
		
	}
	
	public List<Equipo> listByEquipo(){
		return equipoDAO.consultarEquipos();
	}
	
	



}
