package com.model_prototype;
 import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test_student2 {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		 
		XmlBeanDefinitionReader r = new XmlBeanDefinitionReader(bf);
		
		r.loadBeanDefinitions("bean2.xml");
    	bf.getBean("s");
	}

}
