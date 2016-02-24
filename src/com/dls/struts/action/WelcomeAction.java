package com.dls.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport implements SessionAware{

	public static Map<String,Object> sessionMap;
	public String execute(){
		
		if(sessionMap.containsKey("Username")){
			System.out.println("session has");
			return "success";
		}else{
			System.out.println("no session");
			return "error";
		}
		
	}
	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
		
	}
}
