package edu.eci.cvds.managedbeans;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesEquipo;
import edu.eci.cvds.services.impl.ServicesImpl;
@SuppressWarnings("deprecation")
@ManagedBean(name = "equipoBean")
@RequestScoped

public class EquipoBean extends BasePageBean{
	private String id;
	private boolean disponible;
	private ArrayList<Elemento> elementos;
	private String idElemento;
	
	private static final long serialVersionUID = 3594009161252782831L;
	@Inject
	private ServicesEquipo equipoServices;
	
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
	
	public List<Equipo> getData() throws proyExcepcion{
		return equipoServices.listByEquipo();
	}
	
	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}
	
	
	public void registrarEquipo() throws proyExcepcion{
		Equipo equipo = new Equipo(id, disponible,elementos);
		equipoServices.registrarEquipo(id, true, elementos);
	}
	
	public void registrarElementoAEquipo() {
		equipoServices.registrarElementoAEquipo(idElemento,id);
	}

	public String getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(String idElemento) {
		this.idElemento = idElemento;
	}
	
	
}
