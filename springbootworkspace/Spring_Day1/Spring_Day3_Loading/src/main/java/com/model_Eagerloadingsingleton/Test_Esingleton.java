package com.model_Eagerloadingsingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Esingleton {

	
	public static void main(String[] args) {
		
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean3.xml");
		
		Student s =  (Student) ac.getBean("s");
	}
	
	
}
