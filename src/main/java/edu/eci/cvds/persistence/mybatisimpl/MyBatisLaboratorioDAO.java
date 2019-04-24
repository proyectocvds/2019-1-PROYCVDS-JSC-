package edu.eci.cvds.persistence.mybatisimpl;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.persistence.LaboratorioDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.EquipoMapper;
import edu.eci.cvds.persistence.mybatisimpl.mappers.LaboratorioMapper;

public class MyBatisLaboratorioDAO implements LaboratorioDAO{
	@Inject 
	LaboratorioMapper laboratorioMapper;
	
	public void registarLaboratorio(String id , String nombre, ArrayList<Equipo> equipos, int cupos ) {
		laboratorioMapper.registrarLaboratorio(id,nombre,equipos,cupos);
	}

	@Override
	public List<Laboratorio> consultarLaboratorio() {
		return laboratorioMapper.consultarLaboratorio();
	}

}
