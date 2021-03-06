package edu.eci.cvds.services;

import static com.google.inject.Guice.createInjector;

import java.util.Optional;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Injector;

import edu.eci.cvds.persistence.ElementoDAO;
import edu.eci.cvds.persistence.EquipoDAO;
import edu.eci.cvds.persistence.LaboratorioDAO;
import edu.eci.cvds.persistence.NovedadDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisElementoDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisEquipoDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisLaboratorioDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisNovedadDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisUsuarioDAO;
import edu.eci.cvds.services.impl.ServicesImpl;
import edu.eci.cvds.services.impl.ServicesImplElemento;
import edu.eci.cvds.services.impl.ServicesImplEquipo;
import edu.eci.cvds.services.impl.ServicesImplLaboratorio;
import edu.eci.cvds.services.impl.ServicesImplNovedad;
import edu.eci.cvds.services.impl.ServicesImplUsuario;


public class ServicesFactory {
	
	private static ServicesFactory instance = new ServicesFactory();
	
	private static Optional<Injector> optInjector = Optional.empty();
	
	private Injector myBatisInjector(String env, String pathResource, JdbcHelper jdbcHelper) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                install(jdbcHelper);
                setClassPathResource(pathResource);
  
   
				bind(Services.class).to(ServicesImpl.class);
				bind(ServicesElemento.class).to(ServicesImplElemento.class);
				bind(ServicesEquipo.class).to(ServicesImplEquipo.class);
				bind(ServicesNovedad.class).to(ServicesImplNovedad.class);
				bind(ServicesUsuario.class).to(ServicesImplUsuario.class);
				bind(ServicesLaboratorio.class).to(ServicesImplLaboratorio.class);
				bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
				bind(ElementoDAO.class).to(MyBatisElementoDAO.class);
				bind(NovedadDAO.class).to(MyBatisNovedadDAO.class);
				bind(EquipoDAO.class).to(MyBatisEquipoDAO.class);
				bind(LaboratorioDAO.class).to(MyBatisLaboratorioDAO.class);
                
            }
        });
    }
	
	private ServicesFactory() {
		
	}
	
	public Services getServices() {
		if(!optInjector.isPresent()) {
			optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml", JdbcHelper.MySQL));
		}
		
		return optInjector.get().getInstance(Services.class);
	}
	
	public Services getServicesTesting() {
		if(!optInjector.isPresent()) {
			optInjector = Optional.of(myBatisInjector("test","mybatis-config-h2.xml", JdbcHelper.H2_FILE));
		}
		
		return optInjector.get().getInstance(Services.class);
	}

	
	
	
	
	
	
	public static ServicesFactory getInstance() {
		return instance;
	}
}
