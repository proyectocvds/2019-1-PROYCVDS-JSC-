package edu.eci.cvds.managedbeans;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.impl.ServicesImpl;
@SuppressWarnings("deprecation")
@ManagedBean(name = "novedadBean")
@RequestScoped


public class NovedadBean extends BasePageBean{
	//@ManagedProperty(value = "#{param.equipo}")
	private String id;
	private Date fecha;
	private String titulo;
	private String usuario;
	private String detalle;
	private String equipo;
	private String elemento;
	private ServicesImpl servicesImpl;
	//private Elemento elemAgreg;
	
	
	private static final long serialVersionUID = 3594009161252782831L;

	@Inject
	private Services usuarioServices;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha=fecha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario=usuario;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public void setDetalle(String detalle) {
		this.detalle=detalle;
	}
	
	public String getEquipo() {
		return equipo;
	}
	
	public void setEquipo(String equipo) {
		this.equipo=equipo;
	}
	
	public String getElemento() {
		return elemento;
	}
	
	public void setElemento(String elemento){
		this.elemento=elemento;
	}
	
	public void registrarNovedad()throws proyExcepcion{
		Novedad novedad= new Novedad(id,fecha,titulo,detalle,usuario,elemento,equipo);
		usuarioServices.registrarNovedad(id, fecha, titulo, detalle, usuario,  elemento, equipo);
	}
	
	public List<Novedad> getData() throws proyExcepcion{
		return usuarioServices.listByNovedad();
	}
	
	public List<Novedad> novedadEquipo() throws proyExcepcion{
		
		return usuarioServices.novedadEquipo(equipo);
	}
	
	public List<Elemento> novedadElemento() throws proyExcepcion{
		//List<Elemento> novedadElem = new ArrayList();
		//novedadElem.add(elemAgreg);
		//System.out.println("NOVEDAD ELEMENTO"+ novedadElem);
		return usuarioServices.novedadElemento(elemento);
	}
}

