package com.dls.struts.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{
	private SessionMap< String, Object> sessionMap;
	public String logout(){
		if(sessionMap.containsKey("Username")){
			System.out.println("loging out");
			sessionMap.remove("Username");
		}
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap<String, Object>) map;
	}
}
