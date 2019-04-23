package edu.eci.cvds.persistence;

import java.util.ArrayList;
import java.util.List;

import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;

public interface LaboratorioDAO {
	
	public void registarLaboratorio(String id , String nombre, ArrayList<Equipo> equipos, int cupos, String novedad );

	public List<Laboratorio> consultarLaboratorio();

}
