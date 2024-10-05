package com.springbootcrudoperation.service;

import java.util.List;

import com.springbootcrudoperation.model.Student;

public interface Studentservice {
	

public void saveStudent(Student s);

public List<Student> loginStudent(String username, String password);

public List<Student> pagingStudent(int pageno);

public List<Student> deleteStudent(int rollno);

public List<Student> updateStudent(Student s);

public Student editStudent(int rollno);

}
