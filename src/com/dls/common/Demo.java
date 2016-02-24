package com.dls.common;

import java.util.List;

import com.dls.model.Course;
import com.dls.model.Student;

public class Demo {

	public static void main(String[] args) {
		List<Course> list=HibernateHelper.list(Course.class);
		if(list.size()>0){
			for (Course student : list) {
				System.out.println(student.getCourse_Name());
			}
			
		}else{
			System.out.println("no data");
		}
	}
}
