package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactory {
	private static SessionFactory sessionFactory;

	private HibernateSessionFactory(){

	}

	public static SessionFactory getInstance(){
		if(sessionFactory != null){
			return sessionFactory;
		}

		try{
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

			Metadata metadata = new MetadataSources(serviceRegistry)
					.getMetadataBuilder()
					.applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
					.build();

			sessionFactory = metadata.getSessionFactoryBuilder().build();
			return sessionFactory;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		    e.printStackTrace();
		    return null;
		}
	}
}
