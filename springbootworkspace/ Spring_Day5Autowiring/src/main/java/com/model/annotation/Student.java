package com.model.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	
	private Address adr;

	public Student(Address adr) {
		super();
		this.adr = adr;
	}
}
