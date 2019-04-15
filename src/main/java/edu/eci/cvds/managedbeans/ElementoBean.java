package edu.eci.cvds.managedbeans;
import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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
	private String username;
	private String contrasena;
	
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
	
	public String getTipo() {
		return tipo;
		
	}
	
	public List<Elemento> getData() throws Exception {
		return usuarioServices.listByElemento();
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public void registrarElemento() throws IOException {
		Elemento elemento = new Elemento(id, disponible, tipo);
		usuarioServices.registrarElemento(id, true, tipo);
		
	}
	
	public void irNovedad() throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("novedad.xhtml");
	}
	
	public void irElemento() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("elemento.xhtml");
	}
	
	public void logOut() throws IOException {
		FacesContext fc =FacesContext.getCurrentInstance();
		HttpSession session=(HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("username",username);
		session.setAttribute("contrasena",contrasena);
		FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
	}
}
