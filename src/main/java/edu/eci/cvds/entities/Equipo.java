package edu.eci.cvds.entities;

public class Equipo {
	private String id;
	private boolean disponible;
	
	public Equipo (String id, boolean disponible) {
		super();
		this.id=id;
		this.disponible=disponible;
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
	

}
