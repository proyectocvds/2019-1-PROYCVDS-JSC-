package edu.eci.cvds.persistence;

import java.sql.Date;

public interface NovedadDAO {
	
	public void registrarNovedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento);
		
	

}
