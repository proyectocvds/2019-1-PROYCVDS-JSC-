package edu.eci.cvds.Proyectocvds;

import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;


import edu.eci.cvds.entities.*;

import static org.quicktheories.generators.SourceDSL.*;


public class Generators {
	
	//static private String nextUserID = "";
	
	static public Gen<Equipo> equipos(){
		return strings().basicLatinAlphabet().ofLengthBetween(50,100).zip(
				booleans().all(),
				(id,disponible) -> {
					//nextUserID++;
					return new Equipo(id,disponible);
					
				});
	}
	
	//Mas de  atributos
	
	/*static public Gen<Novedad> novedades(){
		return strings().basicLatinAlphabet().ofLengthBetween(50, 100).zip(
				dates().withMillisecondsBetween(0, 60), 
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				(id,fecha,titulo,usuario,detalle,equipo,elemento) -> {
					return new Novedad(id,fecha,titulo,usuario,detalle,equipo,elemento);
				});
		
				
	}
	*/
	
	
	static public Gen<Elemento> elementos(){
		return strings().basicLatinAlphabet().ofLengthBetween(50, 100).zip(
				booleans().all(),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				(id,disponible,tipo) -> {
					return new Elemento(id,disponible,tipo);
				});
	}
	
	
	
	

}
