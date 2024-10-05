package com.modelautowirebymode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.modelautowirebymode.Student;


public class Testm {
	
	public static void main(String[] args) {
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Student  s = ac.getBean("s",Student.class);
	
	System.out.println(s.getAdr().getAreaname());
	
		
	}
	
	

}
