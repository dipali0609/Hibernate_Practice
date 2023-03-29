package com.edu.HibernatePractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int employeeId;
  private String employeeName;
  private float employeeSalary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String employeeName, float employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public float getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(float employeeSalary) {
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}  
}
