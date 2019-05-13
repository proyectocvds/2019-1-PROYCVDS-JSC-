package edu.eci.cvds.managedbeans;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.crypto.hash.Sha256Hash;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesUsuario;
import edu.eci.cvds.services.impl.ServicesImpl;
import edu.eci.cvds.services.impl.ServicesImplUsuario;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuarioBean")
@RequestScoped
@SessionScoped

public class UsuarioBean extends BasePageBean{

private String username;
private String contrasena;
private Usuario user;
private ServicesUsuario servicio;
private String nombre;
private String apellido;


public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellido() {
	return apellido;
}



public void setApellido(String apellido) {
	this.apellido = apellido;
}

private static final long serialVersionUID = 3594009161252782831L;

@Inject 

private ServicesImplUsuario serImplUsu;

public void validarUsuario () {
 
 try {
  /*Subject currentUser =SecurityUtils.getSubject();
  String hex =new Sha256Hash(contrasena).toHex();
  UsernamePasswordToken token=new UsernamePasswordToken(username,hex);
  token.setRememberMe(true);
  currentUser.login(token);*/
  FacesContext fc =FacesContext.getCurrentInstance();

  Usuario user= serImplUsu.consultarLogin(username, contrasena);
  if(user!= null) {
   HttpSession session=(HttpSession) fc.getExternalContext().getSession(true);
   session.setAttribute("username",username);
   session.setAttribute("contrasena",contrasena);
   fc.getExternalContext().redirect("faces/menu.xhtml");
  
	}
  
  else {
	  FacesContext context= FacesContext.getCurrentInstance();
	  context.addMessage(null, new FacesMessage("Warning", "Datos Inválidos" ) );
	  
  }
 }
  
 
 
 
 catch(Exception e) {
  
 /* FacesContext context = FacesContext.getCurrentInstance();
  context.addMessage(null, new FacesMessage("ERROR", "Datos incorrectos para iniciar sesión, intentelo de nuevo!"));
  addMessage("System Error", "Please try again later.");*/

	/*FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ds" ,null);
	FacesContext.getCurrentInstance().addMessage("componentForm:javaText", javaTextMsg);*/
  
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
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Succesfull", "Cerrando sesión"));
	}
	
	/*public void addMessage(String mensaje, String detalle) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, detalle);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}*/
	
	
}
