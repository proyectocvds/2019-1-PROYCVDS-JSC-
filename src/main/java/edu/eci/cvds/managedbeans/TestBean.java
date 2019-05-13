package edu.eci.cvds.managedbeans;

import java.util.ArrayList;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.eci.cvds.entities.Elemento;

@SuppressWarnings("deprecation")
@ManagedBean(name="testBean")
@SessionScoped
public class TestBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String equipo;
	private String id;
	private String estado;
	private ArrayList<Elemento> elementos= new ArrayList<Elemento>();
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TestBean() {}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
