package com.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int cid;
	@Column(name="customer_Name", length=50, nullable=false,unique=true)
	String cname;
	String email_id;
	String Adderess;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid,String cname, String email_id, String adderess) {
		super();
        this.cid = cid;
		this.cname = cname;
		this.email_id = email_id;
		this.Adderess = adderess;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAdderess() {
		return Adderess;
	}
	public void setAdderess(String adderess) {
		Adderess = adderess;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email_id=" + email_id + ", Adderess=" + Adderess + "]";
	}
	
	
	

}
