package com.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	
	@Id int pid;
	@Column(name="ProductName",length=50,nullable=false,unique=true) 
	String Pname;
	float Price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.Pname = pname;
		this.Price = price;
	}


public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	
	
@Override
	public String toString() {
		return "Product [pid=" + pid + ", Pname=" + Pname + ", Price=" + Price + "]";
	}


}
