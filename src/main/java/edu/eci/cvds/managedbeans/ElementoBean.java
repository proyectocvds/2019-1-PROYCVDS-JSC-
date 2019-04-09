package edu.eci.cvds.managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import edu.eci.cvds.services.Services;
@SuppressWarnings("deprecation")
@ManagedBean(name = "elementoBean")
@RequestScoped

public class ElementoBean extends BasePageBean{
	private String id;
	private boolean disponible;
	private String tipo;
	
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
	
	public String gettipo() {
		return tipo;
		
	}
	
	public void setTipo() {
		this.tipo=tipo;
	}
	
	public void registrar() {
		
	}
	

}
