package com.dls.common;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dls.model.fxlms_user;

public class HibernateHelper {

	static Session session=null;
	public static Session getSession(){
		if(session ==null){
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			SessionFactory sf=config.buildSessionFactory();
			session=sf.openSession();
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
