package edu.eci.cvds.Proyectocvds;

import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Inject;

import edu.eci.cvds.proyExcepcion;
import edu.eci.cvds.entities.*;
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesElemento;
import edu.eci.cvds.services.ServicesNovedad;

import org.quicktheories.core.Gen;

import static org.quicktheories.QuickTheory.qt;


import static org.quicktheories.generators.SourceDSL.*;

public class LaboratorioTest extends TestBase{
	
	@Inject 
	Services services;
	@Inject 
	ServicesElemento servicesElemento;
	@Inject 
	ServicesNovedad servicesNovedad;
	
	
	@Test
	
	public void pruebaCeroTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.elementos()).check((elemento) -> {
			try {
				
				
				servicesElemento.nuevoElemento(elemento);
				for(Elemento ele :servicesElemento.listByElemento()) {
					if(ele.getId().equals(ele.getId())) {
						return true;
					}
				}
				
				return false;
				
			}
			
			catch(proyExcepcion ex) {
				ex.printStackTrace();
				return false;
			}
			
		});
	
	}
	
	/*
	public void pruebaUnoTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.equipos()).check((equipo) ->  {
			try {
				
				services.nuevoEquipo(equipo);
				for(Equipo equi : services.listByEquipo()) {
					if(equi.getId().equals(equi.getId())) {
						return true;
					}
					
				}
					
				return false; 
			}
			catch(proyExcepcion ex) {
				ex.printStackTrace();
				return false;
			}
		});
	}*/
	
	
	public void pruebaDosTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.novedades()).check((novedad)-> {
			try {
				
				servicesNovedad.nuevoNovedad(novedad);
				for(Novedad nov :servicesNovedad.listByNovedad()) {
					if(nov.getId().equals(nov.getId())) {
						return true;
					}
				}
					return false;
				}
				catch(proyExcepcion ex) {
					ex.printStackTrace();
					return false;
				}
			});
		}
	
	}	
	

				

