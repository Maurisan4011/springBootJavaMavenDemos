package com.maudev.h2.modelo;

public class Persona {
	private int id;
	private String name;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
