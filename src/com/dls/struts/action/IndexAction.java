package com.dls.struts.action;

import java.util.List;

import com.dls.common.HibernateHelper;
import com.dls.model.Course;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<Course> list;
	@SuppressWarnings("unchecked")
	public String execute(){
		list=HibernateHelper.list(Course.class);
		return "success";
	}
}
