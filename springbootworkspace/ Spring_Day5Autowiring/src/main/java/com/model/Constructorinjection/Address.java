package com.model.Constructorinjection;

public class Address {

	private String areaname;

	@Override
	public String toString() {
		return "Address [areaname=" + areaname + "]";
	}

	public Address(String areaname) {
		super();
		this.areaname = areaname;
	}

}
