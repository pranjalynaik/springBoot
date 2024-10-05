package com.springbootcrudoperation.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springbootcrudoperation.Repository.StudentRepository;
import com.springbootcrudoperation.model.Student;
import com.springbootcrudoperation.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
     @Autowired
	StudentRepository sr;
     
     
	
	@Override
	public void saveStudent(Student s) {
		
		sr.save(s);
		System.out.println("in student service impl");
	}

	@Override
	public List<Student> loginStudent(String username, String password) {

		if(username.equals("admin")&& password.equals("admin")) 
		{
			return (List<Student>) sr.findAll();
		}else {
			 List<Student> list=sr.findByUsernameAndPassword(username, password);
		}
		return null;
	}

	@Override
	public List<Student> pagingStudent(int pageno) {
		
		Pageable  pageable=PageRequest.of(pageno,2,Sort.by("name").ascending());
		
		return  sr.findAll(pageable).toList();
	}

	@Override
	public List<Student> deleteStudent(int rollno) {
		 sr.deleteData(rollno);
		return sr.findAll();
	}

	@Override
	public List<Student> updateStudent(Student s) {
		
		sr.updateData(s.getName(),s.getUsername(),s.getPassword(),s.getRollno());
		
		return sr.findAll();
	}

	@Override
	public Student editStudent(int rollno) {
	
		Optional <Student> op = sr.findById(rollno);
		
		return op.get();
	}
}


