package com.dls.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.dls.common.HibernateHelper;
import com.dls.model.fxlms_user;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = -6822644371549303202L;
	public String username, password;
	public static Map<String,Object> sessionMap;
	
	public String execute() {
		System.out.println("Login action");
			if(sessionMap.containsKey("Username")){
				return "success";
			}else{
				if (HibernateHelper.find(username, password)) {
					sessionMap.put("Username", username);
					return "success";
				} else {
					return "error";
				}
			}
			
		
	}

	@Override
	public void validate() {
		if (username.equals("")) {
			System.out.println("email eoor");
			addFieldError(username, "username must fill!");
		} else if (this.password.equals("")) {
			System.out.println("pw error");
			addFieldError(password, "Password must fill");
		}
	}
	
	

	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
		
	}
}
