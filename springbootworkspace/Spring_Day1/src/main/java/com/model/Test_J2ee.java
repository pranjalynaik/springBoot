package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_J2ee {
  
	public static void main(String[] args) {
	
		//j2ee container
	  ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	  
	  Student1 s = (Student1) ac.getBean("s");
	     
	         s.add();
	         s.Student();
	  
	  
}
}
