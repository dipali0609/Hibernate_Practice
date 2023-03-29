package com.oneTOone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
   private int PersonId;
   private String PersonNmae;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int personId, String personNmae) {
	super();
	PersonId = personId;
	PersonNmae = personNmae;
}
public int getPersonId() {
	return PersonId;
}
public void setPersonId(int personId) {
	PersonId = personId;
}
public String getPersonNmae() {
	return PersonNmae;
}
public void setPersonNmae(String personNmae) {
	PersonNmae = personNmae;
}
@Override
public String toString() {
	return "Person [PersonId=" + PersonId + ", PersonNmae=" + PersonNmae + "]";
}
   
}
