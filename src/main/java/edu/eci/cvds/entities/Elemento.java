package edu.eci.cvds.entities;

import java.util.Date;

public class Elemento {
	private String id;
	private boolean disponible;
	private String tipo;
	private String equipo;
	private Date fecha;
	private String marca;
	private String estado;
	private String nombre;

	public Elemento(String id, String nombre, boolean disponible, String tipo,String equipo , Date fecha, String marca, String estado ) {
		super();
		this.id=id;
		this.disponible=disponible;
		this.tipo=tipo;
		this.equipo=equipo;
		this.fecha=fecha;
		this.marca=marca;
		this.estado=estado;
		this.nombre=nombre;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	
	
	
	
	
	
	
}
