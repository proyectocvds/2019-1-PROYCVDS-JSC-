package edu.eci.cvds.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.services.Services;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean extends BasePageBean{
	
	private String username;
	private String contrasena;
	
	
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
		this.contrasena=contrasena;
	}
	
	public void login() {
		
	}
}
