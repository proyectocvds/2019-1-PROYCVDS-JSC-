package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
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
import edu.eci.cvds.services.Services;
import edu.eci.cvds.services.ServicesElemento;
import edu.eci.cvds.services.ServicesEquipo;
import edu.eci.cvds.services.ServicesLaboratorio;
import edu.eci.cvds.services.ServicesNovedad;
import edu.eci.cvds.services.ServicesUsuario;
import edu.eci.cvds.services.impl.ServicesImpl;
import edu.eci.cvds.services.impl.ServicesImplElemento;
import edu.eci.cvds.services.impl.ServicesImplEquipo;
import edu.eci.cvds.services.impl.ServicesImplLaboratorio;
import edu.eci.cvds.services.impl.ServicesImplNovedad;
import edu.eci.cvds.services.impl.ServicesImplUsuario;

public class GuiceContextListener implements ServletContextListener{
	
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}
	
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {

				install(JdbcHelper.PostgreSQL);
				setEnvironmentId("development");
				setClassPathResource("mybatis-config.xml");
				
				bind(Services.class).to(ServicesImpl.class);
				bind(ServicesElemento.class).to(ServicesImplElemento.class);
				bind(ServicesEquipo.class).to(ServicesImplEquipo.class);
				bind(ServicesNovedad.class).to(ServicesImplNovedad.class);
				bind(ServicesUsuario.class).to(ServicesImplUsuario.class);
				bind(ServicesLaboratorio.class).to(ServicesImplLaboratorio.class);
				bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
				bind(ElementoDAO.class).to(MyBatisElementoDAO.class);
				bind(EquipoDAO.class).to(MyBatisEquipoDAO.class);
				bind(NovedadDAO.class).to(MyBatisNovedadDAO.class);
				bind(LaboratorioDAO.class).to(MyBatisLaboratorioDAO.class);
				
			}
		}

		);

		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}
	
}
