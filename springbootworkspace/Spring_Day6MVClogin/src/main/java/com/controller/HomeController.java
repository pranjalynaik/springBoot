package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


       @Controller
        public class HomeController 
    {     
	
	    @RequestMapping("/log")
	    public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
	    {    
     	System.out.println("user"  +username+ "password"   +password);
     	m.addAttribute("username",username);
     	m.addAttribute("password", password);
     	m.addAttribute("intvalue", 10);
     	
     	Student s = new Student();
     	s.setName("pranjal");
     	s.setUsername("pranjalnaik");
     	s.setPassword("naik");
     	s.setEmail("pranjalnaik@hgamil.com");
     	
     	m.addAttribute("stu",s);
     	List <Student> l = new ArrayList <Student>();
    	  l.add(s);
         m.addAttribute("list", l);
    	
     	return "success";
	    }

	    @RequestMapping("/Openreg")
	    public String preRegister()
	    {
	    	return "register";
	    }   
	   
	    @RequestMapping("/savedata/{name}/{username}/{password}/{emailid}")
	    public String saveData(@PathVariable("name")String n,@PathVariable("username")String u,@PathVariable("Password")String p,
	    		@PathVariable("email")String e)
	    {
	    	System.out.println("name" +n+ "password" +p+ "emailid" +e);
	    	return "login";
	    }
	    
}
