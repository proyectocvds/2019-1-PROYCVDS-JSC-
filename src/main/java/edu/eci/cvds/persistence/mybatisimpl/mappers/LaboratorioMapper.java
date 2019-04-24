package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;



public interface LaboratorioMapper {
	public void registrarLaboratorio(@Param("id")String id,@Param("nombre") String nombre,@Param("equipos") ArrayList<Equipo> equipos,@Param("cupos") int cupos);

	public List<Laboratorio> consultarLaboratorio();
	

}
