package com.revature.util;

import com.revature.model.Employee;
import com.revature.model.Location;
import com.revature.model.Project;
import com.revature.model.Team;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HibernateSessionFactory {
	private static SessionFactory sessionFactory;
	private static Properties props = new Properties();
	static{

		try {
			props.load(new FileReader("./src/main/resources/application.properties"));
			if(props.isEmpty()){
				props.load(new FileReader("./application.properties"));
			}
		} catch (IOException e) {
			System.out.println("Failed to load application properties. ");
//			e.printStackTrace();
		}
	}

	private HibernateSessionFactory(){
	}

	public static SessionFactory getInstance(){
		if(sessionFactory != null){
			return sessionFactory;
		}

		try{
			Configuration config = new Configuration()
				.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
				.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
				.setProperty("hibernate.connection.url", "jdbc:" +
						"postgresql://" +
						props.getProperty("url") +
						":5432" +
						"/postgres")
				.setProperty("hibernate.connection.username", props.getProperty("username"))
				.setProperty("hibernate.connection.password", props.getProperty("password"))
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Location.class)
				.addAnnotatedClass(Project.class)
				.addAnnotatedClass(Team.class);

			config.setImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE);

			System.out.println("Configuration: " + config);

			sessionFactory = config.buildSessionFactory();

			System.out.println("SessionFactory: " + sessionFactory);

			return sessionFactory;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		    e.printStackTrace();
		    return null;
		}
	}
}
