package edu.eci.cvds.entities;

import java.util.ArrayList;

public class Laboratorio {

	private String id;
	private String nombre;
	private ArrayList<Equipo> equipos;
	private int cupos;
	private String novedad;
	
	
	public Laboratorio(String id, String nombre, ArrayList<Equipo> equipos, int cupos, String novedad) {
		super();
		this.id=id;
		this.nombre=nombre;
		this.equipos=new ArrayList<Equipo>();
		this.cupos=cupos;
		this.novedad=novedad;
	}


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
}
