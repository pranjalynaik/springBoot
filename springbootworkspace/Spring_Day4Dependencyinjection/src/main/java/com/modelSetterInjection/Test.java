package com.modelSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
	        Student s = (Student)  ac.getBean("s");  //or ac.getBean("s",student.class);
	        System.out.println(s.getRollno());
	         System.out.println(s.getAdr().getAreaname());
	         System.out.println(s.getNames());
		
		
		
		
	}

}
