package com.dls.struts.action;

import java.util.List;

import com.dls.common.HibernateHelper;
import com.dls.model.Course;
import com.dls.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport{

	public List<Course> list;
	public String execute(){
		list=HibernateHelper.list(Course.class);
		return "success";
	}
}
