package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEx 
{
	@Id
     int id;
     String ename;
     float salary;
	public EmployeeEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public EmployeeEx(int id, String ename, float fees) {
			super();
			this.id = id;
			this.ename = ename;
			this.salary = fees;
		}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getFees() {
		return salary;
	}

	public void setFees(float fees) {
		this.salary = fees;
	}

	@Override
	public String toString() {
		return "EmployeeEx [id=" + id + ", ename=" + ename + ", fees=" + salary + "]";
	}
	

}
