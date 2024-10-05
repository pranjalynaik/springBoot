package com.cjc.springmvccrudapp.servicei;

import java.util.List;

import com.cjc.springmvccrudapp.model.Student;

public interface StudentserviceI {
	
   public void saveData(Student s);
  
   public List <Student>login(String username, String password);

    public List<Student> deleteStudent(int rollno);
	
    public  Student editStudent(int rollno);

}
