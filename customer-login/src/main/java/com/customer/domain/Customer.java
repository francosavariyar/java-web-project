package com.customer.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "customer")
public class Customer {
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
//	@Column(name= "cusotmername")
	private String customerName;
//	@Column(name= "email")
	private String email;
//	@Column(name= "password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer() {
		
	}
	
	public Customer(int id, String customerName, String email, String password) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
		this.password = password;
	}

}