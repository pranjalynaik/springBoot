package com.model;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test_IOC {

	public static void main(String[] args) {
		
		//start of IOC container
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bf);
		
		reader.loadBeanDefinitions("bean.xml");
		
		Student s = (Student)bf.getBean("s");
		System.out.println(s);
		//  s.add();
		
		  Student s1 = (Student)bf.getBean("s");
				  System.out.println(s1);;
	}
	
	
	
}
