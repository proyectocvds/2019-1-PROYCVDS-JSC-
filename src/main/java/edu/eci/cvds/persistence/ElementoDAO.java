package edu.eci.cvds.persistence;

<<<<<<< HEAD
import edu.eci.cvds.proyExcepcion;
=======
import java.util.List;

>>>>>>> 0561e3341e896dd028a3f5449654965bede1c83d
import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {

	public void registrarElemento(String id, boolean disponible, String tipo) throws proyExcepcion;

	Elemento getElemento(String id);

	public List<Elemento> consultarElementos();



}
