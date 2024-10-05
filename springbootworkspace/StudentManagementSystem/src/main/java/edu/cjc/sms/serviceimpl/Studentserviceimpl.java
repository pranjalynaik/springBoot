package edu.cjc.sms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.model.Student;
import edu.cjc.sms.repository.StudentRepository;
import edu.cjc.sms.servicei.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
	   
	   @Autowired
       StudentRepository sr;
	
	@Override
	public void saveData(Student s) {
	  
		sr.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		
		sr.findAll();
		return 	sr.findAll();
	}

	@Override
	public List<Student> getStudentByBatchNumber (String batchNumber) {
		
		List <Student> batchStudent =sr.findAllByBatchNumber(batchNumber);
		
		return batchStudent;
	}

	@Override
	public Student getSingleStudent(int id) {

		Optional<Student> opStudent=sr.findAllByStudentid(id);
		
		return opStudent.get();
	}

	@Override
	public void UpdateStudentfees(int studentid, float ammount) {
	
		Optional<Student> opStudent=sr.findAllByStudentid(studentid);
		   
		Student st=opStudent.get();
		  
		st.setFeesPaid( st.getFeesPaid() +ammount);
		     
		sr.save(st);
	}

}
