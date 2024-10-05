package com.cjc.springmvccrudapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springmvccrudapp.daoi.StudentDaoI;
import com.cjc.springmvccrudapp.model.Student;
import com.cjc.springmvccrudapp.servicei.StudentserviceI;

@Service
public class Studentserviceimpl implements StudentserviceI {
    @Autowired
    StudentDaoI sdi; 
	
	@Override
	public void saveStudent(Student s) {
		
	    System.out.println("in service");
		   sdi.saveStudent(s);
		   System.out.println("out service");

		
	}
}
