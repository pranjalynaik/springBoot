package com.cjc.springmvccrudapp.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.springmvccrudapp.daoi.StudentDaoI;
import com.cjc.springmvccrudapp.model.Student;

@Repository
public class Studentdaoimpl implements StudentDaoI{
    @Autowired
	SessionFactory sf;

    @Override
	public void saveStudent(Student s) {
		
		System.out.println("in dao");
	Session  ss = 	sf.openSession();
		ss.save(s);
	  ss.beginTransaction().commit();
	  System.out.println("out dao");
	}
	

}
