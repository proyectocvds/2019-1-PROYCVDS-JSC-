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
import edu.eci.cvds.services.ServicesEquipo;
import edu.eci.cvds.services.ServicesLaboratorio;
import edu.eci.cvds.services.ServicesNovedad;
import edu.eci.cvds.services.ServicesUsuario;

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
	@Inject 
	ServicesEquipo servicesEquipo;
	@Inject 
	ServicesLaboratorio servicesLaboratorio;
	@Inject 
	ServicesUsuario servicesUsuario;
	
	/* Pruebas cero uno dos y tres probar que no se puede registar un equipo, elemento, novedad 
	 * y laboratorio con un id repetido 
	 */
	@Test
	
	public void pruebaCeroTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.elementos()).check((elemento) -> {
			try {
				
				Elemento elep =new Elemento("8787",true,"Torre","dsad");
				servicesElemento.nuevoElemento(elemento);
				for(Elemento ele :servicesElemento.listByElemento()) {
					if(elep.getId().equals(ele.getId())) {
						return false;
					}
				}
				
				return true;
				
			}
			
			catch(proyExcepcion ex) {
				ex.printStackTrace();
				return false;
			}
			
		});
	
	}
	
	
	public void pruebaUnoTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.equipos()).check((equipo) ->  {
			try {
				Equipo equip=new Equipo("dsad",true,null);
				servicesEquipo.nuevoEquipo(equipo);
				for(Equipo equi : servicesEquipo.listByEquipo()) {
					if(equip.getId().equals(equi.getId())) {
						return false;
					}
					
				}
					
				return true; 
			}
			catch(proyExcepcion ex) {
				ex.printStackTrace();
				return false;
			}
		});
	}
	
	
	public void pruebaDosTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.novedades()).check((novedad)-> {
			try {
				Novedad novep=new Novedad("abc",null,"wd","de","juliana.garzon","dede","loi");
				servicesNovedad.nuevoNovedad(novedad);
				for(Novedad nov :servicesNovedad.listByNovedad()) {
					if(novep.getId().equals(nov.getId())) {
						return false;
					}
				}
					return true;
				}
				catch(proyExcepcion ex) {
					ex.printStackTrace();
					return false;
				}
			});
		}
}
	/*public void pruebaTresTest() throws SQLException,proyExcepcion{
		qt().forAll(Generators.laboratorios()).check((laboratorio)->{
			try {
				Laboratorio labp=new Laboratorio("abc",null,"wd","de","juliana.garzon","dede","loi");
				servicesLaboratorio.nuevoLaboratorio(laboratorio);
				for(Laboratorio lab :servicesLaboratorio.listByLaboratorio()) {
					if(labp.getId().equals(lab.getId())) {
						return false;
					}
				}
					return true;
				}
				catch(proyExcepcion ex) {
					ex.printStackTrace();
					return false;
				}
			});
		}
		}
		
	}
	}	
	
*/

				

