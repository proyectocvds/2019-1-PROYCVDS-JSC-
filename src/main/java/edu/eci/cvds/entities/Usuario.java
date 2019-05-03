package edu.eci.cvds.entities;

public class Usuario {
	
	private String username;
	private String estado;
	private String correo;
	private String contrasena;
	private String informacion;
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

	public Usuario(String username, String estado, String correo, String contrasena, String informacion ,String nombre , String apellido) {
		super();
		this.username=username;
		this.estado=estado;
		this.correo=correo;
		this.contrasena=contrasena;
		this.informacion=informacion;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Usuario() {}
	
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
	
	public void setInformacion(String informacion) {
		this.informacion=informacion;
	}

}
