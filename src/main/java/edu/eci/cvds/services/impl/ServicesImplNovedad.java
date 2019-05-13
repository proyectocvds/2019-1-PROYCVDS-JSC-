package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.persistence.NovedadDAO;
import edu.eci.cvds.services.ServicesNovedad;

public class ServicesImplNovedad implements ServicesNovedad {
	
	@Inject 
	private NovedadDAO novedadDAO;
	
	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String detalle, String usuario, String elemento, String equipo,String laboratorio) throws proyExcepcion {
		novedadDAO.registrarNovedad(id, fecha, titulo,detalle, usuario, elemento, equipo,laboratorio);
	}
	
	public List <Novedad> listByNovedad(){
		return novedadDAO.consultarNovedad();
	}
	
	@Override
	public void nuevoNovedad(Novedad novedad) throws proyExcepcion {
		// TODO Auto-generated method stu
	}
	
	@Override
	public List<Novedad> novedadEquipo(String equipo) throws proyExcepcion {
		return novedadDAO.novedadEquipo(equipo);
	}
	
	@Override
	public List<Novedad> novedadElemento(String elemento) throws proyExcepcion{
		return novedadDAO.novedadElemento(elemento);
	}

	@Override
	public List<Novedad> novedadLaboratorio(String laboratorio) throws proyExcepcion {
		return novedadDAO.novedadLaboratorio(laboratorio);
	}

	@Override
	public List<Novedad> laboratorio() {
		return novedadDAO.laboratorio();
	}

	@Override
	public List<Novedad> elemento() {
		return novedadDAO.elemento();
	}

	@Override
	public List<Novedad> equipo() {
		return novedadDAO.equipo();
	}
	

}
