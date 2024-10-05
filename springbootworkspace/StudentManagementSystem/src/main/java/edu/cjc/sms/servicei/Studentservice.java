package edu.cjc.sms.servicei;

import java.util.List;

import edu.cjc.sms.model.Student;

public interface Studentservice {

	public void saveData( Student s);

	public List<Student> getAllStudents();
	
	public List <Student> getStudentByBatchNumber(String batchNumber);

	public Student getSingleStudent(int studentid);

	public void UpdateStudentfees(int studentid, float ammount);
	
}
