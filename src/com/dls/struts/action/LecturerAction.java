package com.dls.struts.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.dls.common.HibernateHelper;
import com.dls.model.Lecturer;
import com.dls.model.Student;
import com.dls.model.fxlms_user;
import com.opensymphony.xwork2.ActionSupport;

public class LecturerAction extends ActionSupport implements SessionAware {
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
	private Map<String, Object> sessionMap;




	public String execute(){	
		return "success";
	}


	public String create(){
		System.out.println("yes");
		Lecturer ob=new Lecturer();
		ob.setEmail(email);
		ob.setTitle(title);
		ob.setCountry(country);
		ob.setFName(f_Name);
		ob.setLName(l_Name);
		ob.setAddress1(address1);
		ob.setAddress2(address2);
		ob.setState(state);
		ob.setZipcode(zipcode);
		ob.setTp1(tp1);
		ob.setTp2(tp2);
		ob.setMobile(mobile);

		HibernateHelper.create(ob);
		
		System.out.println(f_Name);
		Random r = new Random();
		int Low = 1000;
		int High = 9999;
		int R = r.nextInt(High-Low) + Low;
		String ran=Integer.toString(R);
		
		String pass=email.substring(0,4)+ran;
		PassSend p=new PassSend();
		p.execute(email,pass,f_Name,l_Name);
		createPass(pass);

		return "success";
	}



	private void createPass(String pass){
	
		fxlms_user f=new fxlms_user();
		f.setUsername(email);
		f.setUser_type("lecturer");
		f.setUser_status("active");
		f.setPassword(pass);
		HibernateHelper.create(f);
		System.out.println("email "+email);

	}



	public String addLec(){
		return "success";
	}




	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;

	}

}
