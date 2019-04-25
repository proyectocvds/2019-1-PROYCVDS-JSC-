package edu.eci.cvds.managedbeans;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.impl.ServicesImpl;
import edu.eci.cvds.services.impl.ServicesImplUsuario;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuarioBean")
@RequestScoped
@SessionScoped

public class UsuarioBean extends BasePageBean{

private String username;
private String contrasena;


private static final long serialVersionUID = 3594009161252782831L;

@Inject 

private ServicesImplUsuario serImplUsu;

public void validarUsuario () {
 
 try {
  FacesContext fc =FacesContext.getCurrentInstance();
  Usuario user= serImplUsu.consultarLogin(username, contrasena);
  if(user!= null) {
   HttpSession session=(HttpSession) fc.getExternalContext().getSession(true);
   session.setAttribute("username",username);
   session.setAttribute("contrasena",contrasena);
   fc.getExternalContext().redirect("faces/menu.xhtml");
  }
  
 
 }
 
 catch(Exception e) {
  FacesContext context = FacesContext.getCurrentInstance();
  context.addMessage(null, new FacesMessage("ERROR", "Datos incorrectos para iniciar sesión, intentelo de nuevo!"));
  addMessage("System Error", "Please try again later.");
 }

} 
	
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
	
	public void logOut() throws IOException {
		FacesContext fc =FacesContext.getCurrentInstance();
		HttpSession session=(HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("username",username);
session.setAttribute("contrasena",contrasena);
FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
	}
	
	public void addMessage(String mensaje, String detalle) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, detalle);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	
}
