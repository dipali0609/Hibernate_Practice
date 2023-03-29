package com.student;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {

	@Id

	int sid;
	String sname;
	float fees;
	
	public Student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
   
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	public static void main(String[] args) {
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}
	

}
