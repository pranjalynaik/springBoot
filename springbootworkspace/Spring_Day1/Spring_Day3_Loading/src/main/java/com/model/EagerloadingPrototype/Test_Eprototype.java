package com.model.EagerloadingPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Eprototype {

	
	public static void main(String[] args) {
		
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean4.xml");
		
	          ac.getBean("s");
	}
	
	
}
