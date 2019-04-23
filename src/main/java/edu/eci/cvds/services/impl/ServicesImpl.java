package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import java.sql.Date;

import edu.eci.cvds.proyExcepcion;

import java.util.ArrayList;
import java.util.List;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.persistence.EquipoDAO;
import edu.eci.cvds.persistence.NovedadDAO;

public class ServicesImpl implements Services{
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Inject
	private ElementoDAO elementoDAO;
	
	@Inject 
	private EquipoDAO equipoDAO;

	@Inject 
	private NovedadDAO novedadDAO;

	
	public Usuario getUsuario(String username) throws proyExcepcion {
		return usuarioDAO.getUsuario(username);
	}
	
	
	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion  {
		
		elementoDAO.registrarElemento(id, disponible, tipo);
		
		
	}
	
	
	public void registrarEquipo(String id, boolean disponible, ArrayList<Elemento> elementos) throws proyExcepcion {
		equipoDAO.registrarEquipo(id, disponible, elementos);
	}


	public void registrarNovedad(String id, java.util.Date fecha, String titulo, String detalle, String usuario, String elemento, String equipo) throws proyExcepcion {
		novedadDAO.registrarNovedad(id, fecha, titulo,detalle, usuario, elemento,  equipo);
		
	}
	
	public Usuario consultarLogin(String username, String contrasena) throws proyExcepcion {
		
		return usuarioDAO.consultarLogin(username, contrasena);
		
	}

	public List<Elemento> listByElemento() {
			return elementoDAO.consultarElementos();
	}
	
	public List <Novedad> listByNovedad(){
		return novedadDAO.consultarNovedad();
	}


	@Override
	public void nuevoElemento(Elemento elemento) throws proyExcepcion {
		// TODO Auto-generated method stub
		elementoDAO.save(elemento);
		
		
	}


	@Override
	public void nuevoEquipo(Equipo equipo) throws proyExcepcion {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void nuevoNovedad(Novedad novedad) throws proyExcepcion {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void nuevoUsuario(Usuario usuario) throws proyExcepcion {
		// TODO Auto-generated method stub
		
	}

	public List<Equipo> listByEquipo(){
		return equipoDAO.consultarEquipos();
	}


	@Override
	public List<Novedad> novedadEquipo(String equipo) throws proyExcepcion {
		return novedadDAO.novedadEquipo(equipo);
	}


	@Override
	public List<Elemento> novedadElemento(String elemento) {
		return novedadDAO.novedadElemento(elemento);
	}
	
	
	
	
}

	
	
	

