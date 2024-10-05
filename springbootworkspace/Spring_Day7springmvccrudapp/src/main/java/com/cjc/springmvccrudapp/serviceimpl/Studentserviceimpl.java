package com.cjc.springmvccrudapp.serviceimpl;

import java.util.List;

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
	public void saveData (Student s) {
		
	    System.out.println("in service");
		   sdi.saveData(s);
		   System.out.println("out service");
      }
    @Override
	public List<Student> login(String username, String password) {
		
       List <Student> list = sdi.login(username, password);
		
		return list;
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
	
      List<Student>list=sdi.deleteStudent(rollno);
		
		return list;
	}

	@Override
	public Student editStudent(int rollno) {
		Student s = sdi.editStudent(rollno);
		return s;
	}

}