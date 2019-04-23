package edu.eci.cvds.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.entities.Usuario;

public interface Services {

	public Usuario getUsuario(String username) throws proyExcepcion ;
	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;
	public void registrarEquipo(String id, boolean disponible, ArrayList<Elemento> elementos) throws proyExcepcion ;
	public void registrarNovedad(String id, Date fecha, String titulo, String detalle, String usuario, String elemento, String equipo) throws proyExcepcion;
	public List<Elemento> listByElemento() throws proyExcepcion;
	public List<Novedad> listByNovedad() throws proyExcepcion;
	public List<Equipo> listByEquipo() throws proyExcepcion;
	public void nuevoElemento(Elemento elemento) throws proyExcepcion;
	public void nuevoEquipo(Equipo equipo) throws proyExcepcion;
	public void nuevoNovedad(Novedad novedad) throws proyExcepcion;
	public void nuevoUsuario(Usuario usuario) throws proyExcepcion;
	void nuevoLaboratorio(Laboratorio laboratorio) throws proyExcepcion;
	public List<Novedad> novedadEquipo(String equipo) throws proyExcepcion;
	public List<Elemento> novedadElemento(String novedadElem)throws proyExcepcion;
	public void registarLaboratorio(String id, String nombre, ArrayList<Equipo> equipos, int cupos, String novedad);
	public List<Laboratorio> listByLaboratorio();
	



	}
