package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;

import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ElementoMapper;



public class MyBatisElementoDAO implements ElementoDAO {
	@Inject 
	ElementoMapper elementoMapper;
}
