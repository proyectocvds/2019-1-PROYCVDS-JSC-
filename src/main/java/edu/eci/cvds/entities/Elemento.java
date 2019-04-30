package edu.eci.cvds.entities;

import java.util.ArrayList;

public class Elemento {
	private String id;
	private boolean disponible;
	private String tipo;
	private String equipo;

	public Elemento(String id, boolean disponible, String tipo,String equipo) {
		super();
		this.id=id;
		this.disponible=disponible;
		this.tipo=tipo;
		this.equipo=equipo;
		
		
	}
	
	public Elemento(String id, boolean disponible, String tipo) {
		
	}
	
	public Elemento() {
		
	}
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public boolean getDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	

	
	
	
	
	
	
	
}
