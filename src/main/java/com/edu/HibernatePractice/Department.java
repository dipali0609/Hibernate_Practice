package com.edu.HibernatePractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department 
{
	@Id
   private int DepartemntID;
   private int DepartmentName;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int departemntID, int departmentName) {
	super();
	DepartemntID = departemntID;
	DepartmentName = departmentName;
}
public int getDepartemntID() {
	return DepartemntID;
}
public void setDepartemntID(int departemntID) {
	DepartemntID = departemntID;
}
public int getDepartmentName() {
	return DepartmentName;
}
public void setDepartmentName(int departmentName) {
	DepartmentName = departmentName;
}
@Override
public String toString() {
	return "Department [DepartemntID=" + DepartemntID + ", DepartmentName=" + DepartmentName + "]";
}
   
   
   
}
