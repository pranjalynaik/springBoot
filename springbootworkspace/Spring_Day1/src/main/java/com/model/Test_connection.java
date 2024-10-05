package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_connection {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanC.xml");
		
		Connection c= (Connection) ac.getBean("c");
		  c.open();
		  c.close();
		 
	}

}
