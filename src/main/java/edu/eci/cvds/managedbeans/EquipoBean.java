package edu.eci.cvds.managedbeans;

import java.io.IOException;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.google.inject.Injector;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesElemento;
import edu.eci.cvds.services.ServicesEquipo;
import edu.eci.cvds.services.impl.ServicesImpl;

@SuppressWarnings("deprecation")
@ManagedBean(name = "equipoBean")
@RequestScoped

public class EquipoBean extends BasePageBean {
	private String id;
	private boolean disponible;
	private ArrayList<Elemento> elementos;
	private String idElemento;
	private Date fecha;

	private static final long serialVersionUID = 3594009161252782831L;
	@Inject
	private ServicesEquipo equipoServices;
	@Inject
	ServicesElemento elementoServices;
	
	/**
	public EquipoBean() {
		elementos = new ArrayList<Elemento>() {
			public boolean add(Elemento e) {
				if(e.getTipo()==null) {
					ArrayList<Elemento> el = new ArrayList();
					for(int i=0;i<size();i++) {
						if(get(i).getTipo().equals(e.getTipo())) el.add(get(i));
					}for(Elemento ele:el) {
						remove(ele);
					}return super.add(e);
				}else {
					return false;
				}
			}
		};
	}*/
	
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

	public List<Equipo> getData() throws proyExcepcion {
		return equipoServices.listByEquipo();
	}

	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}

	public void registrarEquipo() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			if (elementos.size() <= 4)
				throw new proyExcepcion("Hacen falta mas elementos para registrar el equipo");
			for (Elemento e : elementos) {
				elementoServices.registrarElementoAEquipo(id, e.getId());
			}
			context.addMessage(null, new FacesMessage("Succesfull", "Equipo Insertado."));
		} catch (Exception e) {
			context.addMessage(null, new FacesMessage("Error", e.getMessage()));
		}

	}

	public void registrarElementoAEquipo() {
		equipoServices.registrarElementoAEquipo(idElemento, id);
	}

	public String getIdElemento() {
		return idElemento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void add(Elemento elemento) {
		System.out.println(elementos.size());
		elementos.add(elemento);
	}

	public void irEquiposActivos() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("equiposActivos.xhtml");
	}

	public List<Equipo> equiposActivos() {
		return equipoServices.equiposActivos(true);
	}

}
