package com.revature.quizzard;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.SpringSessionContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Properties;

@EnableWebMvc // lets Spring see web annotations
@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement // there are transactional annotations that Spring needs to see. Without this, Spring will ignore them
@PropertySource("classpath:app.properties")
public class AppConfig implements WebMvcConfigurer, WebApplicationInitializer {

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
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUrl(dbUrl);
        dataSource.setDefaultSchema(dbSchema);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.revature.quizzard.models");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public PlatformTransactionManager txManager() {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory().getObject());
        return txManager;
    }

    // routes url to appropriate "view" (this is server-side rendering, which we won't be doing for proj2)
    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/"); // sets the directory to views (it contains the jsps)
        viewResolver.setSuffix(".jsp"); // if you try to use HTML pages, it will not work! (HTML's are "already resolved"??)
        return viewResolver;
    }

    private Properties hibernateProperties() {
        Properties hibernateProps = new Properties();
        hibernateProps.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
        hibernateProps.setProperty(Environment.SHOW_SQL, "true");
        hibernateProps.setProperty(Environment.FORMAT_SQL, "true");
        hibernateProps.setProperty(Environment.HBM2DDL_AUTO, "create");
        hibernateProps.setProperty(Environment.HBM2DDL_IMPORT_FILES, "import.sql");
        return hibernateProps;
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException { // the content of this method is the equivalent of the entire xml file for the xml configuration

        AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
        container.register(AppConfig.class); // can register multiple classes!

        servletContext.addListener(new ContextLoaderListener(container));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(container));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

    }

    // this is optional. If you take this out, you won't have access to the index page, but
    // you will still have access to the home page through test/home in the TestController
    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("index");

        registry.addViewController("/home")
                .setViewName("home");
    }
}
