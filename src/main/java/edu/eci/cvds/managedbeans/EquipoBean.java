package edu.eci.cvds.managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.impl.ServicesImpl;
@SuppressWarnings("deprecation")
@ManagedBean(name = "equipoBean")
@RequestScoped

public class EquipoBean extends BasePageBean{
	private String id;
	private boolean disponible;
	
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
	
	
}
