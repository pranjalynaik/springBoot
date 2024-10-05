package com.model;

public class Mysql implements Connection{

	public void open() {
		System.out.println("open");
		
	}

	public void close() {
	System.out.println("close");
		
	}

}
