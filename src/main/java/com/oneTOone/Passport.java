package com.oneTOone;

import javax.persistence.Entity;

@Entity
public class Passport 
{
    private int PassportId;
    private String PassportName;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int passportId, String passportName) {
		super();
		PassportId = passportId;
		PassportName = passportName;
	}
	public int getPassportId() {
		return PassportId;
	}
	public void setPassportId(int passportId) {
		PassportId = passportId;
	}
	public String getPassportName() {
		return PassportName;
	}
	public void setPassportName(String passportName) {
		PassportName = passportName;
	}
	@Override
	public String toString() {
		return "Passport [PassportId=" + PassportId + ", PassportName=" + PassportName + "]";
	}
    
}
