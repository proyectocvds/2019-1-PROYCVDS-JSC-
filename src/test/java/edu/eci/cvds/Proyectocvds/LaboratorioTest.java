package edu.eci.cvds.Proyectocvds;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Inject;

import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.Services;

import org.quicktheories.core.Gen;

import static org.quicktheories.QuickTheory.qt;


import static org.quicktheories.generators.SourceDSL.*;

public class LaboratorioTest extends TestBase{
	
	@Inject 
	Services services;
	
	@Test
	public void pruebaCeroTest() throws SQLException, ServicesException{
		qt().forAll(Generators.laboratorio()).check((equipo) -> {
			try {
				
				services.registrarEquipo(id, disponible);
				for(Equipo equi:services.listEquipos()) {
					if(equi.getId().equals(equi.getId())) {
						return true;
					}
				}
				
				return false;
				
			}
			
			catch(ServicesException ex) {
				ex.printStackTrace();
				return false;
			}
			
		});
	
	}

				
}
