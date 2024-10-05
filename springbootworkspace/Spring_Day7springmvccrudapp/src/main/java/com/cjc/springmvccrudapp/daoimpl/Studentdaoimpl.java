package com.cjc.springmvccrudapp.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.springmvccrudapp.daoi.StudentDaoI;
import com.cjc.springmvccrudapp.model.Student;

@Repository
public class Studentdaoimpl implements StudentDaoI{
   
	@Autowired
	SessionFactory sf;

    @Override
	public void saveData(Student s) {
		
		System.out.println("in dao");
	      Session  ss = 	sf.openSession();
	        ss.persist(s);
	        ss.beginTransaction().commit();
	  System.out.println("out dao");
	}
    
	@Override
	public List<Student> login(String username, String password) {
		     Session ss= sf.openSession();
		  if(username.equals("admin")&& password.equals("admin")) {
			 
		 List <Student>list= ss.createQuery("from Student").getResultList();
			  return getStudent();
       } 
		  else {
	 Query <Student> q = ss.createQuery("from Student where username=?1 and password=?2");
			   
			   q.setParameter(1, username);
			   
			   q.setParameter(2, password);
			  
			   List<Student>  list  = q.getResultList();
			   
			   return list;
			  }
	}
    @Override
	public List<Student> deleteStudent(int rollno) {
    	
    	   Session ss = sf.openSession();
    	   Transaction tx= ss.beginTransaction();
    	 Query <Student> q= ss.createQuery("delete from Student where rollno=?1") ; 
    	          q.setParameter(1, rollno);
    	          q.executeUpdate();
    	          tx.commit();
    	   
		return getStudent();
	}
    
     public List<Student>getStudent(){
    	
    	Session ss= sf.openSession();
    	
    	return ss.createQuery("from Student").getResultList();
    	
    }

	@Override
	public Student editStudent(int rollno) {
         
		Session ss=sf.openSession();
     Query <Student> q= ss.createQuery("from Student where rollno=?1");
          q.setParameter(1, rollno);
             Student s= q.getSingleResult();
		return s;
	}
 }

