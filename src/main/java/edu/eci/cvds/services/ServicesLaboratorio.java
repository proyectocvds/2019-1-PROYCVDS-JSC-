package edu.eci.cvds.services;

import java.util.ArrayList;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;

public interface ServicesLaboratorio {
void nuevoLaboratorio(Laboratorio laboratorio) throws proyExcepcion;
	
	
	public void registarLaboratorio(String id, String nombre, ArrayList<Equipo> equipos, int cupos, String novedad);
	public List<Laboratorio> listByLaboratorio();

}
