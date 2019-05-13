package edu.eci.cvds.managedbeans;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesElemento;
import edu.eci.cvds.services.ServicesNovedad;
import edu.eci.cvds.services.impl.ServicesImpl;

@SuppressWarnings("deprecation")
@ManagedBean(name = "elementoBean")
@RequestScoped

public class ElementoBean extends BasePageBean {
	@ManagedProperty(value = "#{param.id}")
	private String id;
	private boolean disponible;
	private String tipo;
	private String username;
	private String contrasena;
	private String idEquipo;
	private Date fecha;
	private String marca;
	private String estado;
	private String valor;
	@ManagedProperty(value = "#{param.equipo}")
	private String equipo;
	private String nombre;

	public String getContrasena() {
		return contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	private static final long serialVersionUID = 3594009161252782831L;

	@Inject
	private ServicesElemento elementoServices;
	@Inject
	private ServicesNovedad novedadServices;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getTipo() {
		return tipo;

	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public String getContraseña() {
		return contrasena;
	}

	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<Elemento> getData() throws proyExcepcion {

		return elementoServices.listByElemento();
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void registrarElemento() throws proyExcepcion {
		elementoServices.registrarElemento(id, nombre, true, tipo, fecha, marca, null);

	}

	public void irNovedad() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("novedad.xhtml");
	}

	public void irElemento() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("elemento.xhtml");
	}

	public void irEquipo() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("equipo.xhtml");
	}

	public void irLaboratorio() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("laboratorio.xhtml");
	}

	public void logOut() throws IOException {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("username", username);
		session.setAttribute("contrasena", contrasena);
		FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
	}

	public void irRegistrarElemento() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("registroElemento.xhtml");
	}

	public void registrarElementoAEquipo(String idElemento, String equipo) throws proyExcepcion {
		String eliminado = "eliminado";
		FacesContext context = FacesContext.getCurrentInstance();
		elementoServices.registrarElementoAEquipo(idElemento, equipo, eliminado);
		context.addMessage(null, new FacesMessage("Succesfull", "Elemento Insertado."));
		// novedadServices.registrarNovedad("4486456165413251", fecha, "Registro", "Se
		// registro elemento a quipo", null, idElemento, equipo, null);

	}

	public String getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}

	public void irNovedadElemento() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("novedadElemento.xhtml");
	}

	public void eliminarElemento(String id) {
		valor = "Eliminado";
		elementoServices.eliminarElemento(id, valor);
	}

	public List<Elemento> elementosSinEquipo() {
		return elementoServices.elementosSinEquipo();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Elemento> administraElemento() throws proyExcepcion, IOException {
		return elementoServices.administraElemento(id);
	}

}
