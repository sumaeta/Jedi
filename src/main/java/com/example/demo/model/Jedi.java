package com.example.demo.model;

public class Jedi {

	private String name;
	private String lastname;
	
	public Jedi(final String name, final String lastname) {
		this.name = name;
		this.lastname = name;
	}

	
	
	public Jedi() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
