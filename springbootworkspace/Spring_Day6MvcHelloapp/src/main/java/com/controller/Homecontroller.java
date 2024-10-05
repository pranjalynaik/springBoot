package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class Homecontroller {
    
	@RequestMapping("/")
	public ModelAndView hello() {
		
		ModelAndView v = new ModelAndView("welcome");
		
		return v;
		
	}
}
