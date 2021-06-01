package com.vehicles.project.people;

import java.util.Date;

public class Persona {
	
	protected String name;
	protected String surName;
	protected Date birthdate;
	
	public Persona(String name, String surName, Date birthdate) {
		
		this.name = name;
		this.surName = surName;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", surName=" + surName + ", birthdate=" + birthdate + "]";
	}
}
