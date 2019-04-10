package edu.eci.cvds.entities;
import java.util.Date;


public class Novedad {
	
	private String id;
	private Date fecha;
	private String titulo;
	private String usuario;
	private String detalle;
	private String equipo;
	private String elemento;
	
	public Novedad(String id, Date fecha, String titulo, String usuario, String detalle, String equipo, String elemento) {
		super();
		this.id=id;
		this.titulo=titulo;
		this.fecha=fecha;
		this.usuario=usuario;
		this.detalle=detalle;
		this.equipo=equipo;
		this.elemento=elemento;
	}
	
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
	
}
