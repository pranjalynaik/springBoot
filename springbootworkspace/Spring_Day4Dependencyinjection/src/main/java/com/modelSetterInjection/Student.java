package com.modelSetterInjection;

import java.util.List;
import java.util.Map;

public class Student {

	private int rollno;
	private Address adr;
	private List <String> names;
	private Map <String,Integer> country;
	
	
	public int getRollno() {
		return rollno;
	}
	public Map<String, Integer> getCountry() {
		return country;
	}
	public void setCountry(Map<String, Integer> country) {
		this.country = country;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	
	
}
