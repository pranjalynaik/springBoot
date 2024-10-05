package com.modelConstructorInjection;

import java.util.List;
import java.util.Map;

import com.modelSetterInjection.Address;

public class Student {
	private int rollno;
	private Address adr;
	private List <String> names;
	private Map <String,Integer> country;
	
public Student(int rollno, Address adr, List<String> names, Map<String, Integer> country) {
		super();
		this.rollno = rollno;
		this.adr = adr;
		this.names = names;
		this.country = country;
	}
	private int getRollno() {
		return rollno;
	}
	private Address getAdr() {
		return adr;
	}
	private List<String> getNames() {
		return names;
	}
	private Map<String, Integer> getCountry() {
		return country;
	}
	
	

}
