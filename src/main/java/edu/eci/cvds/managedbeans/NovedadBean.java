package edu.eci.cvds.managedbeans;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.impl.ServicesImpl;
@SuppressWarnings("deprecation")
@ManagedBean(name = "novedadBean")
@RequestScoped


public class NovedadBean extends BasePageBean{
	private String id;
	private Date fecha;
	private String titulo;
	private String usuario;
	private String detalle;
	private String equipo;
	private String elemento;
	private ServicesImpl servicesImpl;
	
	
	private static final long serialVersionUID = 3594009161252782831L;

	@Inject
	private Services usuarioServices;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setId(Date fecha) {
		this.fecha=fecha;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	
	
}

