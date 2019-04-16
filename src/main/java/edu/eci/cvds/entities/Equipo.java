package edu.eci.cvds.entities;

import java.util.ArrayList;

public class Equipo {
	
	

	private String id;
	private boolean disponible;
	private ArrayList<Elemento> elementos;
	
	
	public Equipo (String id, boolean disponible, ArrayList<Elemento> elementos) {
		super();
		this.id=id;
		this.disponible=disponible;
		this.elementos = new ArrayList<Elemento>();
	}
	
	public Equipo (String id, boolean disponible) {
		
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
	
	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}
	
	

}
