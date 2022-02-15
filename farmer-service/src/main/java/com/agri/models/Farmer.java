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
//	private BankDetails bankdetails;
	private long acconuntNo;
	private ProductDetails productDeetails;
	private String password;
	
	
	
	public long getAcconuntNo() {
		return acconuntNo;
	}
	public void setAcconuntNo(long acconuntNo) {
		this.acconuntNo = acconuntNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
//	public BankDetails getBankdetails() {
//		return bankdetails;
//	}
//	public void setBankdetails(BankDetails bankdetails) {
//		this.bankdetails = bankdetails;
//	}
	public ProductDetails getProductDeetails() {
		return productDeetails;
	}
	public void setProductDeetails(ProductDetails productDeetails) {
		this.productDeetails = productDeetails;
	}
	
	
public Farmer() {	
		
	}
public Farmer(int id, String name, String email, long phoneNo, long acconuntNo, ProductDetails productDeetails,
		String password) {
//	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phoneNo = phoneNo;
	this.acconuntNo = acconuntNo;
	this.productDeetails = productDeetails;
	this.password = password;
}
@Override
public String toString() {
	return "Farmer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", acconuntNo="
			+ acconuntNo + ", productDeetails=" + productDeetails + ", password=" + password + "]";
}







	 
	

}
