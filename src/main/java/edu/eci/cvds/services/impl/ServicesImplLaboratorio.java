package edu.eci.cvds.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.persistence.LaboratorioDAO;
import edu.eci.cvds.services.ServicesLaboratorio;

public class ServicesImplLaboratorio implements ServicesLaboratorio{
	@Inject 
	private LaboratorioDAO laboratorioDAO;

	
	@Override
	public void nuevoLaboratorio(Laboratorio laboratorio) throws proyExcepcion{
		// TODO Auto-generated method stub
	}





	@Override
	public List<Laboratorio> listByLaboratorio() {
		return laboratorioDAO.consultarLaboratorio();
	}





	@Override
	public void registrarLaboratorio(String id, String nombre, int cupos) {
		laboratorioDAO.registrarLaboratorio(id, nombre, cupos);
		
	}


	

}
