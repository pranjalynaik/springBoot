package com.cjc.springmvccrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import java.sql.DriverManager;
import java.util.List;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.hibernate.dialect.MySQL8Dialect;

import com.cjc.springmvccrudapp.model.Student;
import com.cjc.springmvccrudapp.servicei.StudentserviceI;

@Controller 
public  class HomeController {
	
	@Autowired 
	StudentserviceI ssi;

	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("openfirst page");
		return  "login";
	}
	
	@RequestMapping("/openregister")
	public String preRegister()
	{
		System.out.println("open register page");
		return "register";
	}
	@RequestMapping("/saveData")
	public String saveData(@ModelAttribute Student s)
	{
		 System.out.println("in controller");
		   ssi.saveData(s);
	     System.out.println("out controller");
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginStudent(@RequestParam("username") String username,@RequestParam("password")String password,Model m )
	{
 
	List <Student> list =ssi.login(username, password);
	
	if(!list.isEmpty())
	{
	 m.addAttribute("data", list);
	   
	 return "success";
	}
	else {
		// m.addAttribute("message","username and password not match");
		return "login";
	}
}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rollno")int rollno,Model m)
	{
		List<Student> list= ssi.deleteStudent(rollno);
		
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("rollno")int rollno,Model m) {
		
	      Student s =ssi.editStudent(rollno);
	     
	      m.addAttribute("stu",s);
		
		    return "edit";
	}
	
	
	
}	
	

