package com.cjc.springbootday2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class Springbootday2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootday2Application.class, args);
		
		System.out.println("Hello");
		
		Employee e = new Employee();
		    e.setId(12);
		    e.setName("pranjal");
		    
		    System.out.println(e.getId());
		    System.out.println(e.getName());
		
		
	}

}
