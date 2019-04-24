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
					return new Equipo(id,disponible,null);
					
				});
	}
	
	//Probar primeros atributos de novedad
	
	static public Gen<Novedad> novedades(){
		return strings().basicLatinAlphabet().ofLengthBetween(50, 100).zip(
				dates().withMillisecondsBetween(0, 60), 
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				
				(id,fecha,titulo,usuario) -> {
					return new Novedad(id,fecha,titulo,usuario,null,null,null);
				});
		
				
	}
	
	// Probar mas tributos de novedad 
	
	static public Gen<Novedad>novedades2(){
		return strings().basicLatinAlphabet().ofLengthBetween(50, 100).zip(
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				(detalle,equipo,elemento)->{
					return new Novedad(null,null,null,null,detalle,equipo,elemento);
				}
				);
	}
	
	
	
	static public Gen<Elemento> elementos(){
		return strings().basicLatinAlphabet().ofLengthBetween(50, 100).zip(
				booleans().all(),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				(id,disponible,tipo,equipo) -> {
					return new Elemento(id,disponible,tipo,equipo);
				});
	}
	
	
	static public Gen<Usuario> usuarios(){
		return strings().basicLatinAlphabet().ofLengthBetween(50,100).zip(
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50,100),
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				strings().basicLatinAlphabet().ofLengthBetween(50,100),
				(username,estado,correo,contrasena,informacion) -> {
					return new Usuario(username,estado,correo,contrasena,informacion);
				});
		
	}
	
	static public Gen<Laboratorio> laboratorios(){
		return strings().basicLatinAlphabet().ofLengthBetween(50,100).zip(
				strings().basicLatinAlphabet().ofLengthBetween(50, 100),
				integers().allPositive(),
				(id,nombre,cupos)->{
					return new Laboratorio(id,nombre,null,cupos);
				});
				
	}
}
	
	
	
	


