package com.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootcrudoperation.model.Student;
import com.springbootcrudoperation.service.Studentservice;

@Controller
public class HomeController {
	
	  
	@Autowired
	Studentservice ssi;
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("in login");
		return "login";
	}

	
	@RequestMapping("/openregister")
	public String preRegister()
	{
		System.out.println("in register");
		return "register";
	}
	
	
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute Student s)
	{
		System.out.println("in save");
		ssi.saveStudent(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginStudent(@RequestParam("username")String username,@RequestParam("password")String password,Model m)
	{
		List<Student> list= ssi.loginStudent(username,password);
		  
		m.addAttribute("data",list);
		if(!list.isEmpty()) {
			System.out.println("in preloginStudent");
				
		  return "success";
	   }else {
		
		   return "login";
	}
}
	@RequestMapping("/paging")
	public String paging(@RequestParam("pageno")int pageno,Model m)
	{
		List<Student> list=ssi.pagingStudent(pageno);
		System.out.println("in paging");
		
		m.addAttribute("data", list);
		return"success";
	}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rollno")int rollno,Model m)
	{
		System.out.println("in delete");
		List<Student> list= ssi.deleteStudent(rollno);
		 m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("rollno")int rollno,Model m) {
		
		Student s =ssi.editStudent(rollno);
	
		m.addAttribute("stu", s);
		return "edit";
	}
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s, Model m) {
		
	List <Student> list= ssi.updateStudent(s);
		m.addAttribute("data", list);
		return "success";
	}
	
}