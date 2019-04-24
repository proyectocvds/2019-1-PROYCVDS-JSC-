package edu.eci.cvds.entities;

public class Elemento {
	private String id;
	private boolean disponible;
	private String tipo;
	
	public Elemento(String id, boolean disponible, String tipo) {
		super();
		this.id=id;
		this.disponible=disponible;
		this.tipo=tipo;
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
	
	
	
	
	
}
