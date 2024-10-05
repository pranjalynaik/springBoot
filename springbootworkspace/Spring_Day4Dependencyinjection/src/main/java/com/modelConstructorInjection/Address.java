package com.modelConstructorInjection;

public class Address {
	
	private String areaname;

	public String getAreaname() {
		return areaname;
				
	}

	public Address(String areaname) {
		super();
		this.areaname = areaname;
	}

}
