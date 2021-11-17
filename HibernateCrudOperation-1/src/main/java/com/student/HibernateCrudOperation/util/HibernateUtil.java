package com.student.HibernateCrudOperation.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.student.HibernateCrudOperation.model.Student;

public class HibernateUtil {
	/*Properties p = new Properties();
	OutputStream os = new FileOutputStream("dataConfig.properties");
	p.setProperty("url", "jdbc:mysql://localhost:3306/hibernate_db?useSSL=false");
	p.setProperty("uname", "misterbabu");
	p.setProperty("pwd", "password");
	
	p.store(os, null);*/
	
	
	
	private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                //Properties settings = new Properties();
                //InputStream is = new FileInputStream("dataConfig.properties");
                //settings.load(is);
	
                /*settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_db?useSSL=false");
                settings.put(Environment.USER, "misterbabu");
                settings.put(Environment.PASS, "password");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "update");*/
                
                /*Properties settings = new Properties();
                OutputStream os = new FileOutputStream("sample.json");
                 */
                
                
                Properties settings = new Properties();
                InputStream is = new FileInputStream("dataConfig.properties");
                settings.load(is);
                settings.put(Environment.URL, settings.getProperty("url"));
                settings.put(Environment.USER, settings.getProperty("uname"));
                settings.put(Environment.PASS, settings.getProperty("pwd"));
                settings.put(Environment.DRIVER, settings.getProperty("driver"));
                settings.put(Environment.DIALECT, settings.getProperty("dialect"));
                settings.put(Environment.SHOW_SQL, settings.getProperty("sql_show"));
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, settings.getProperty("current_session"));
                settings.put(Environment.HBM2DDL_AUTO, settings.getProperty("dbm2ddl"));
                
                
                
                

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Student.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

}
