package com.revature.quizzard;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@ComponentScan
@EnableTransactionManagement
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Value("${db.driver}")
	private String dbDriver;

	@Value("${db.url}")
	private String dbUrl;

	@Value("${db.schema}")
	private String dbSchema;

	@Value("${db.username}")
	private String dbUsername;

	@Value("${db.password}")
	private String dbPassword;

	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(dbDriver);
		dataSource.setUrl(dbUrl);
		dataSource.setDefaultSchema(dbSchema);
		dataSource.setUsername(dbUsername);
		dataSource.setPassword(dbPassword);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("com.revature.quizzard.models");
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}

	@Bean
	public PlatformTransactionManager txManager(){
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}

	private Properties hibernateProperties(){
		Properties hibernateProps = new Properties();

		hibernateProps.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
		hibernateProps.setProperty(Environment.SHOW_SQL, "true");
		hibernateProps.setProperty(Environment.FORMAT_SQL, "true");
		hibernateProps.setProperty(Environment.HBM2DDL_AUTO, "create"); //create validate update create-drop
//		hibernateProps.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		hibernateProps.setProperty(Environment.HBM2DDL_IMPORT_FILES, "import.sql");

		return hibernateProps;
	}

}
