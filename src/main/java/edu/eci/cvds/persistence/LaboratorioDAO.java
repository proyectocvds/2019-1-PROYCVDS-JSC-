package edu.eci.cvds.persistence;

import java.util.ArrayList;
import java.util.List;

import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;

public interface LaboratorioDAO {
	
	public void registrarLaboratorio(String id , String nombre, int cupos );

	public List<Laboratorio> consultarLaboratorio();

}
