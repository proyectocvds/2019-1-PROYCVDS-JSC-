package edu.eci.cvds.managedbeans;

import java.io.IOException;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.google.inject.Injector;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesElemento;
import edu.eci.cvds.services.ServicesEquipo;
import edu.eci.cvds.services.impl.ServicesImpl;

@SuppressWarnings("deprecation")
@ManagedBean(name = "equipoBean")
@RequestScoped

public class EquipoBean extends BasePageBean {
	private String id;
	private boolean disponible;
	private ArrayList<Elemento> elementos= new ArrayList<Elemento>();
	private String laboratorio;
	private Date fecha;
	

	private static final long serialVersionUID = 3594009161252782831L;
	@Inject
	private ServicesEquipo equipoServices;
	@Inject
	ServicesElemento elementoServices;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public List<Equipo> getData() throws proyExcepcion {
		return equipoServices.listByEquipo();
	}

	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}

	public void registrarEquipo() throws proyExcepcion {
		FacesContext context = FacesContext.getCurrentInstance();
		equipoServices.registrarEquipo(id, false, fecha);
	}

	

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void add(Elemento elemento) {
		System.out.println(elementos.size());
		elementos.add(elemento);
	}

	public void irEquiposActivos() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("equiposActivos.xhtml");
	}

	public List<Equipo> equiposActivos() {
		return equipoServices.equiposActivos(true);
	}
	
	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public List<Equipo> EquiposSinElementos(){
		return equipoServices.EquiposSinElementos();
	}

}
