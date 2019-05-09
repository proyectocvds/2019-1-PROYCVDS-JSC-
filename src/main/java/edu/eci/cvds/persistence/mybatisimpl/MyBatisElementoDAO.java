package edu.eci.cvds.persistence.mybatisimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ElementoMapper;



public class MyBatisElementoDAO implements ElementoDAO {
	@Inject 
	ElementoMapper elementoMapper;
	
	@Override
	public Elemento getElemento(String id) {
		return elementoMapper.getElemento(id);
		
	}



	@Override
	public void registrarElemento(String id, boolean disponible, String tipo,Date fecha ,String marca ,String estado) throws proyExcepcion {
		
		//if(getElemento(id)==null) throw new proyExcepcion("El elemento no debe ser nulo");
		//if(getElemento(id)!=null) throw new proyExcepcion("El elemento ya existe");
		elementoMapper.registrarElemento(id, disponible, tipo,fecha,marca,estado);
		
	}



	@Override
	public List<Elemento> consultarElementos() {
		return elementoMapper.consultarElemento();
	}



	@Override
	public void save(Elemento elemento) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void registrarElementoAEquipo(String idElemento, String equipo) {
		elementoMapper.registrarElementoAEquipo(idElemento, equipo);
		
	}



	@Override
	public void eliminarElemento(String id ,String valor) {
		elementoMapper.eliminarElemento(id,valor);
		
	}



	@Override
	public List<Elemento> elementosSinEquipo() {
		return elementoMapper.elementosSinEquipo();
		
	}

	
	
	
	
}
