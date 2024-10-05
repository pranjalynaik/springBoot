package com.model_lazyloading;
 import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test_student {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		 
		XmlBeanDefinitionReader r = new XmlBeanDefinitionReader(bf);
		
		r.loadBeanDefinitions("bean.xml");
    	bf.getBean("s");
	}

}
