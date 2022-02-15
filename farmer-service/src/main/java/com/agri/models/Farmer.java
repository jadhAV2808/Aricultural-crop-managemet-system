package com.agri.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Farmer")
public class Farmer {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phoneNo;
	private String password;
	private BankDetails bankdetails;	
	private ProductDetails productdetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BankDetails getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}
	public ProductDetails getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(ProductDetails productdetails) {
		this.productdetails = productdetails;
	}
	public Farmer(int id, String name, String email, long phoneNo, String password, BankDetails bankdetails,
			ProductDetails productdetails) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.bankdetails = bankdetails;
		this.productdetails = productdetails;
	}

		
	public Farmer() {	
		
	}
	@Override
	public String toString() {
		return "Farmer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", password="
				+ password + ", bankdetails=" + bankdetails + ", productdetails=" + productdetails + "]";
	}

		
	





	 
	

}
