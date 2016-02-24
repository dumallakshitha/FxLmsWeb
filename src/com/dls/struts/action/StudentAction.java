package com.dls.struts.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.dls.common.HibernateHelper;
import com.dls.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport implements SessionAware{
	public static Map<String,Object> sessionMap;
	public List<Student> list;
	public String email;
	public String country;
	public String title;
	public String f_Name;
	public String l_Name;
	public String address1;
	public String address2;
	public String state;
	public int zipcode;
	public int tp1;
	public int tp2;
	public int mobile;
	
	public String execute(){
		
		if(sessionMap.containsKey("Username")){
			list=HibernateHelper.list(Student.class);
			return "success";
		}else{
			return "error";
		}
		
	}
	
	public String create(){
		Student ob=new Student();
		ob.setEmail(email);
		ob.setTitle(title);
		ob.setCountry(country);
		ob.setF_Name(f_Name);
		ob.setL_Name(l_Name);
		ob.setAddress1(address1);
		ob.setAddress2(address2);
		ob.setState(state);
		ob.setZipcode(zipcode);
		ob.setTp1(tp1);
		ob.setTp2(tp2);
		ob.setMobile(mobile);
		
		
		HibernateHelper.create(ob);
		return "success";
	}
	
	public String addStu(){
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.sessionMap = map;
	}
	
	
	
}
