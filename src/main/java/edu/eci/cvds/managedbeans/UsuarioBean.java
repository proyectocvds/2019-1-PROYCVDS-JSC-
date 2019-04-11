package edu.eci.cvds.managedbeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.impl.ServicesImpl;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean extends BasePageBean{
	
	private String username;
	private String contrasena;
	private Usuario usuario;
	private ServicesImpl servicesImpl;
	
	
	private static final long serialVersionUID = 3594009161252782831L;
	
	@Inject
	private Services usuarioServices;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
		
	}
	
	
	
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void login() throws IOException {
		System.out.println(username+" /////"+contrasena);
		FacesContext.getCurrentInstance().getExternalContext().redirect("faces/menu.xhtml");
		if(usuario!=null) usuario = servicesImpl.getUsuario(username);
		
	}
	
	public void logOut() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("faces/usuario.xhtml");
	}
}
