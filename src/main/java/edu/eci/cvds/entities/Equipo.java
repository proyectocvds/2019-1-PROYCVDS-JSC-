package edu.eci.cvds.entities;

import java.sql.Date;
import java.util.ArrayList;

public class Equipo {
	
	

	private String id;
	private boolean disponible;
	private ArrayList<Elemento> elementos;
	private Date fecha;
	
	public Equipo (String id, boolean disponible, ArrayList<Elemento> elementos, Date fecha) {
		super();
		this.id=id;
		this.disponible=disponible;
		this.elementos = new ArrayList<Elemento>();
		this.fecha = fecha;
	}
	
	public Equipo() {
		
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
