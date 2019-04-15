package edu.eci.cvds.persistence;

import java.util.Date;

import edu.eci.cvds.proyExcepcion;

public interface NovedadDAO {
	
	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento) throws proyExcepcion;
		
	

}
