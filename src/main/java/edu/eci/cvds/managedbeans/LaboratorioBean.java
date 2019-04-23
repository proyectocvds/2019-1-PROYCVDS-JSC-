package edu.eci.cvds.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.services.Services;

@SuppressWarnings("deprecation")
@ManagedBean(name = "laboratorioBean")
@RequestScoped

public class LaboratorioBean extends BasePageBean {
	private String id;
	private String nombre;
	private ArrayList<Equipo> equipos;
	private int cupos;
	private String novedad;
	
	private static final long serialVersionUID = 3594009161252782831L;
	@Inject
	private Services laboratorioServices;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	public int getCupos() {
		return cupos;
	}
	public void setCupos(int cupos) {
		this.cupos = cupos;
	}
	public String getNovedad() {
		return novedad;
	}
	public void setNovedad(String novedad) {
		this.novedad = novedad;
	}

	public void registrarLaboratorio() throws proyExcepcion{
		Laboratorio laboratorio =new Laboratorio(id,nombre,equipos,cupos,novedad);
		laboratorioServices.registarLaboratorio(id,nombre,equipos,cupos,novedad);
	}
	
	public List<Laboratorio> getData(){
		return laboratorioServices.listByLaboratorio();
	}
	
}
