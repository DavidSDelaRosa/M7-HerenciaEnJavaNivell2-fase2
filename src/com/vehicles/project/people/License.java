package com.vehicles.project.people;

import java.util.Date;

public class License {
	
	protected int id;
	protected char type;
	protected String licenseName;
	protected Date expirationDate;
	
	public License(int id, char type, String licenseName, Date expirationDate) {
		this.id = id;
		this.type = type;
		this.licenseName = licenseName;
		this.expirationDate = expirationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getLicenseName() {
		return licenseName;
	}

	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "License [id=" + id + ", type=" + type + ", licenseName=" + licenseName + ", expirationDate="
				+ expirationDate + "]";
	}
	
}
