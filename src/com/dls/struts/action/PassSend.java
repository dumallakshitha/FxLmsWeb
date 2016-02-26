package com.dls.struts.action;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.dls.common.EmailUtility;
import com.dls.common.HibernateHelper;
import com.dls.model.Student;
import com.opensymphony.xwork2.ActionSupport;



public class PassSend extends ActionSupport implements
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


public String execute(String email,String pass,String fname1,String lname1) {
	

	String host = "smtp.gmail.com";
	// String host = "smtp.mail.yahoo.com";
	String port = "587";

	String mailFrom = "dumallakshitha@gmail.com";// ube mail eka
	String password = "bc2009@asnaeb";// ube password eka
	String subject = "Student Register";

	String mailTo = email;// send karana mail eka
	//String mailTo ="gihansoon@gmail.com";// send karana mail eka
	
	// String subject = "New email with attachments";
	String message = "Dear " + fname1 + " " + lname1 + "<br><br>"
			+ "your password is " + pass + "<br><br>"
			+ "Thanks.<br><br>" + "Best regards,<br><br>" + "Registry Team";
	
	try {

		String msg=EmailUtility.sendEmail(host, port, mailFrom, password, mailTo,
				"Lecturer Register", message);
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
	
	
	

