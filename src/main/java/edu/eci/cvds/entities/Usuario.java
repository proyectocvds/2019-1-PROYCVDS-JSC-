package edu.eci.cvds.entities;

public class Usuario {
	
	private String username;
	private String estado;
	private String correo;
	private String contrasena;
	private String informacion;
	
	public Usuario(String username, String estado, String correo, String contrasena, String informacion) {
		super();
		this.username=username;
		this.estado=estado;
		this.correo=correo;
		this.contrasena=contrasena;
		this.informacion=informacion;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
		
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo( String correo) {
		this.correo=correo;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena=contrasena;
	}
	
	public String getInformacion() {
		return informacion;
	}
	
	public void setInformacion() {
		this.informacion=informacion;
	}

}
