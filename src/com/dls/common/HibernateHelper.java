package com.dls.common;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.dls.model.Course;
import com.dls.model.Lecturer;
import com.dls.model.Student;
import com.dls.model.fxlms_user;

public class HibernateHelper {

	static Session session=null;
	private static SessionFactory sessionJavaConfigFactory;
	private static SessionFactory sessionAnnotationFactory;
	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            System.out.println("Hibernate Configuration loaded");
             
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            System.out.println("Hibernate serviceRegistry created");
             
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
             
            return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
	
	private static SessionFactory buildSessionJavaConfigFactory() {
        try {
        Configuration configuration = new Configuration();
         
        //Create Properties, can be read from property files too
        Properties props = new Properties();
        props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        props.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/fxlmsapp");
        props.put("hibernate.connection.username", "root");
        props.put("hibernate.connection.password", "asnaeb");
        props.put("hibernate.current_session_context_class", "thread");
        props.put("hibernate.hbm2ddl.auto", "update");
         
        configuration.setProperties(props);
         
        //we can set mapping file or class with annotation
        //addClass(Employee1.class) will look for resource
        // com/journaldev/hibernate/model/Employee1.hbm.xml (not good)
        configuration.addAnnotatedClass(fxlms_user.class);
        configuration.addAnnotatedClass(Student.class); 
        configuration.addAnnotatedClass(Course.class);
        configuration.addAnnotatedClass(Lecturer.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        System.out.println("Hibernate Java Config serviceRegistry created");
         
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
        return sessionFactory;
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
	
	private static SessionFactory buildSessionAnnotationFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure("hibernate-annotation.cfg.xml");
            System.out.println("Hibernate Annotation Configuration loaded");
             
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            System.out.println("Hibernate Annotation serviceRegistry created");
             
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
             
            return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
	public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
	public static SessionFactory getSessionAnnotationFactory() {
        if(sessionAnnotationFactory == null) sessionAnnotationFactory = buildSessionAnnotationFactory();
        return sessionAnnotationFactory;
    }
     
	public static SessionFactory getSessionJavaConfigFactory() {
        if(sessionJavaConfigFactory == null) sessionJavaConfigFactory = buildSessionJavaConfigFactory();
        return sessionJavaConfigFactory;
    }
	
	public static Session getSession(){
		if(session ==null){
			try {
				//AnnotationConfiguration config=new AnnotationConfiguration();
				//config.configure();
				//SessionFactory sf=config.buildSessionFactory();
				SessionFactory sf=getSessionJavaConfigFactory();
				session=sf.openSession();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return session;
	}
	
	public static void create(Object obj){
		Session session = getSession();
		Transaction transaction = null;
		try {
		   transaction = session.beginTransaction();
		   session.save(obj);
		   transaction.commit();
		   session.clear();
		}
		catch (Exception e) {
		   if (transaction !=null){
			 transaction.rollback();
		   }
		   e.printStackTrace();
		}

	}
	
	public static void delete(Object obj){
		Session session = getSession();
		Transaction transaction = null;
		try {
		   transaction = session.beginTransaction();
		   session.delete(obj);
		   transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null){
			 transaction.rollback();
		   }
		}finally {
		   session.close();
		}

	}
	
	public static void update(Object obj){
		Session session = getSession();
		Transaction transaction = null;
		try {
		   transaction = session.beginTransaction();
		   session.update(obj);
		   transaction.commit();
		}
		catch (Exception e) {
		   if (transaction !=null){
			 transaction.rollback();
		   }
		}finally {
		   session.close();
		}

	}
	
	public static Object Retrieve(Class cls,String username){
		Object obj=getSession().get(cls, username);
		return obj;
	}
	
	public static boolean find(String name, String password) {
        
        //session.beginTransaction();
        String SQL_QUERY = " from fxlms_user u where u.username='" + name + "' and u.password='" + password + "'";
        System.out.println(SQL_QUERY);
        Query query = getSession().createQuery(SQL_QUERY);
        Iterator<fxlms_user> it = query.iterate();
        List<fxlms_user> list = query.list();
        if (list.size() > 0) {
      
            return true;
        }
        return false;
    }
	
	public static List list(Class cls){
		List obj=getSession().createCriteria(cls).list();
		return obj;
	}
	
	public static List list(String query){
		List obj=getSession().createQuery(query).list();
		return obj;
	}
}
