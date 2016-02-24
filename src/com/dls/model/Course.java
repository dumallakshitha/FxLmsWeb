package com.dls.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fxlms_course")
public class Course {

	@Id
	private String course_Id;
	private String course_Name;
	public String getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(String course_Id) {
		this.course_Id = course_Id;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	
}
