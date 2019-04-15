package edu.eci.cvds.persistence;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.entities.Novedad;

public interface NovedadDAO {
	
	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento);
	
	public List<Novedad> consultarNovedad();
	

}
