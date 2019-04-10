package edu.eci.cvds.services;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;

public interface Services {
	public Usuario getUsuario(String username);
	public void registrarElemento(String id, boolean disponible, String tipo);
	public void registrarEquipo(String id, boolean disponible);
}
