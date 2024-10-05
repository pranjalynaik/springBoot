package com.model.Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Testc {
	public static void main(String[] args) {
		
		
		ApplicationContext ac =new ClassPathXmlApplicationContext ("cons.xml");
		  
	Student s= ac.getBean("s",Student.class);
		
		System.out.println(s);
		
		
		
	}

}
