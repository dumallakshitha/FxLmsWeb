package com.dls.struts.action;


import java.io.InputStream;
import java.io.StringBufferInputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.dls.common.EmailUtility;
import com.dls.common.HibernateHelper;
import com.dls.model.Lecturer;
import com.dls.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class SendMailAction extends ActionSupport implements
		ServletContextAware {

	public String recipient;
	public String fName;
	public String lName;
	public String course_Name;
	
	private ServletContext servletContext;
	private String host, port, user, pass;
	
	public String email;
	public int country;
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

	private InputStream inputStream;
	public InputStream getInputStream() {
	    return inputStream;
	} 

	
	public String execute() {
		
		email = recipient;
		f_Name = fName;
		l_Name = lName;
		
		Student ob = new Student();
	
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
		ob.setStatus("Pending");

		System.out.println("title"+title);
		System.out.println("country"+country);

		String host = "smtp.gmail.com";
		// String host = "smtp.mail.yahoo.com";
		String port = "587";

		String mailFrom = "dumallakshitha@gmail.com";// ube mail eka
		String password = "bc2009@asnaeb";// ube password eka
		String subject = "Student Register";

		String mailTo = recipient;// send karana mail eka
		//String mailTo ="gihansoon@gmail.com";// send karana mail eka
		
		// String subject = "New email with attachments";
		String message = "Dear " + fName + " " + lName + "<br><br>"
				+ "you have selected " + course_Name + "<br><br>"
				+ "Thanks.<br><br>" + "Best regards,<br><br>" + "Registry Team";
		
		try {
			HibernateHelper.create(ob);
			String msg=EmailUtility.sendEmail(host, port, mailFrom, password, mailTo,
					"Student Register", message);
			System.out.println(msg);
			if(msg.equals("success")){
				inputStream = new StringBufferInputStream("success");
			}else{
				inputStream = new StringBufferInputStream("error");
			}
			
			return msg;
		} catch (Exception ex) {
			System.out.println("Could not send email.");
			inputStream = new StringBufferInputStream("error");
			ex.printStackTrace();
			return "error";
		}

		

	}

	@Override
	public void setServletContext(ServletContext arg0) {
		servletContext = arg0;

	}

}
