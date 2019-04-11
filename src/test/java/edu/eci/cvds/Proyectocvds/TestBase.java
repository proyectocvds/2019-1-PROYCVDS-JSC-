package edu.eci.cvds.Proyectocvds;


import org.junit.Before;
import org.mybatis.guice.XMLMyBatisModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.eci.cvds.persistence.*;
import edu.eci.cvds.persistence.mybatisimpl.*;
import edu.eci.cvds.services.*;
import edu.eci.cvds.services.impl.*;

public class TestBase {
	protected Injector injector = Guice.createInjector(new XMLMyBatisModule() {
        @Override
        protected void initialize() {
            setEnvironmentId("test");
            setClassPathResource("mybatis-config-h2.xml");
            
            bind(Services.class).to(ServicesImpl.class);
            bind(ElementoDAO.class).to(MyBatisElementoDAO.class);
            bind(EquipoDAO.class).to(MyBatisEquipoDAO.class);
            bind(NovedadDAO.class).to(MyBatisNovedadDAO.class);
            bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
            
        }
       

});
	
	@Before
	public void setup() {
		injector.injectMembers(this);
	}
	
	
	
	
	
	
}

	


