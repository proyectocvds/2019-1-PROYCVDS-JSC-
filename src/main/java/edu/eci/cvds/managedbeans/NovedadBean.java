package edu.eci.cvds.managedbeans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesElemento;
import edu.eci.cvds.services.ServicesEquipo;
import edu.eci.cvds.services.ServicesNovedad;
import edu.eci.cvds.services.impl.ServicesImpl;

@SuppressWarnings("deprecation")
@ManagedBean(name = "novedadBean")
@RequestScoped

public class NovedadBean extends BasePageBean {
	private String id;
	private Date fecha;
	private String titulo;
	private String usuario;
	private String detalle;
	@ManagedProperty(value = "#{param.laboratorio}")
	private String laboratorio;
	@ManagedProperty(value = "#{param.elemento}")
	private String elemento;
	@ManagedProperty(value = "#{param.equipo}")
	private String equipo;


	private static final long serialVersionUID = 3594009161252782831L;

	@Inject
	private ServicesNovedad novedadServices;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public void registrarNovedad() throws proyExcepcion {
		novedadServices.registrarNovedad(id, fecha, titulo, detalle, usuario, elemento, equipo, laboratorio);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Succesfull","Novedad registrada" ) );
	}

	public List<Novedad> getData() throws proyExcepcion {
		return novedadServices.listByNovedad();
	}

	public List<Novedad> novedadEquipo() throws proyExcepcion {
		return novedadServices.novedadEquipo(equipo);
	}

	public List<Novedad> novedadElemento() throws proyExcepcion, IOException {
		return novedadServices.novedadElemento(elemento);
	}

	public List<Novedad> novedadLaboratorio() throws proyExcepcion, IOException {
		return novedadServices.novedadLaboratorio(laboratorio);
	}
	
	public List<Novedad> laboratorio() {
		return novedadServices.laboratorio();
	}
	
	public List<Novedad> elemento() {
		return novedadServices.elemento();
	}
	
	public List<Novedad> equipo() {
		return novedadServices.equipo();
	}
}
