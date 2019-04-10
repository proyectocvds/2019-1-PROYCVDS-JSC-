package edu.eci.cvds.managedbeans;
import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.impl.ServicesImpl;
@SuppressWarnings("deprecation")
@ManagedBean(name = "elementoBean")
@RequestScoped

public class ElementoBean extends BasePageBean{
	private String id;
	private boolean disponible;
	private String tipo;
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
	
	public boolean getDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}
	
	public String gettipo() {
		return tipo;
		
	}
	
	public void setTipo() {
		this.tipo=tipo;
	}
	
	public void registrarElemento() throws IOException {
		Elemento elemento = new Elemento(id, disponible, tipo);
		servicesImpl.registrarElemento(id, disponible, tipo);
		FacesContext.getCurrentInstance().getExternalContext().redirect("elemento.xhtml");
		
	}
}
