package edu.cjc.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sms.model.Student;
import edu.cjc.sms.servicei.Studentservice;

@Controller
public class AdminController {
      
	   @Autowired	
       Studentservice ss;     
	
	@RequestMapping("/")
	public String preLogin()
	{
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String onlogin(@RequestParam("username")String username,@RequestParam("password")String password,Model m) 
	{
		if(username.equals("ADMIN")&&password.equals("ADMIN")) {
		
			List<Student> list=ss.getAllStudents();
		          m.addAttribute("data",list);
			
		          return "adminscreen";
		}
		else {
			
			m.addAttribute("login-fail","Enter valid login details");
			    
			return "login";
		}
	}
	@RequestMapping("/enroll_student")
	public String saveStudent(@ModelAttribute Student s,Model m ) {
		
		List<Student> list=ss.getAllStudents();
           m.addAttribute("data",list);
		  ss.saveData(s);
		return "adminscreen";
	}
	    @RequestMapping("/search")
	    public String getStudentByBatch(@RequestParam("batchNumber")String batchNumber,Model m) {
	  
	    List <Student> result=ss.getStudentByBatchNumber(batchNumber);
	    	if(result.size()>0) { 	
	    	  m.addAttribute("data",result);
	    	return "adminscreen";
	    	}
	    else {
	    	List<Student> list=ss.getAllStudents();
	           m.addAttribute("data",list);
	    m.addAttribute("message", "there is no recors for this batch number" +batchNumber);
	           return "adminscreen";
	    		
	    }
	    }
	    @RequestMapping("/fees")
	    public String onfees(@RequestParam int id,Model m) {
	    	
	    	Student st=ss.getSingleStudent(id);
	    	 
	    	m.addAttribute("st", st);
	    	
	    	  return "fees";
	    }
	    
	    @RequestMapping("/payfees")
	    public String payfess(@RequestParam int studentid,@RequestParam float ammount,Model m) {
	    	
	    	ss.UpdateStudentfees(studentid,ammount);
	    	
	    	List<Student> st =ss.getAllStudents();
	    	
	    	m.addAttribute("data", st);
	    	
	    	return "adminscreen";
	    }
	   
	    @RequestMapping("/remove")
	    public String onremove(@RequestParam int id,Model m) {
	    	
	    	Student st=ss.getSingleStudent(id);
	    	 
	    	m.addAttribute("st", st);
	    	
	    	  return "fees";
	    }
	    
	    
	    
   }