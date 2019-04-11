package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ElementoMapper;



public class MyBatisElementoDAO implements ElementoDAO {
	@Inject 
	ElementoMapper elementoMapper;



	@Override
	public void registrarElemento(String id, boolean disponible, String tipo) {
		System.out.println("///////////////////////////////////dao");
		elementoMapper.registrarElemento(id, disponible, tipo);
		
		
	}
}
