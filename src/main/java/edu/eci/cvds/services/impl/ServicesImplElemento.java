package edu.eci.cvds.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.services.ServicesElemento;

public class ServicesImplElemento implements ServicesElemento{
	@Inject
	private ElementoDAO elementoDAO;
	
	public void registrarElemento(String id, boolean disponible, String tipo,Date fecha,String marca,String estado) throws proyExcepcion  {
		elementoDAO.registrarElemento(id, disponible, tipo,fecha,marca,estado);
	}
	
	public List<Elemento> listByElemento() {
		return elementoDAO.consultarElementos();
	}

	@Override
	public void nuevoElemento(Elemento elemento) throws proyExcepcion {
		// TODO Auto-generated method stub
		elementoDAO.save(elemento);
	}

	@Override
	public void registrarElementoAEquipo(String idElemento, String equipo) {
		elementoDAO.registrarElementoAEquipo(idElemento, equipo);
		
	}

	@Override
	public void eliminarElemento(String id,String valor) {
		elementoDAO.eliminarElemento(id,valor);
	}

	@Override
	public List<Elemento> elementosSinEquipo() {
		return elementoDAO.elementosSinEquipo();
		
	}



  
}

