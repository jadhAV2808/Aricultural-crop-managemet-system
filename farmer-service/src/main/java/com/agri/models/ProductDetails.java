package com.agri.models;

import org.springframework.data.mongodb.core.mapping.Document;


public class ProductDetails {
	
	private String cropname;
	private long quantity;
	private double price;
	private String variety;
	
	
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public ProductDetails(String cropname, long quantity, double price, String variety) {
		
		this.cropname = cropname;
		this.quantity = quantity;
		this.price = price;
		this.variety = variety;
	}
	
public ProductDetails() {
		
	
	}
	
	@Override
	public String toString() {
		return "ProductDetails [cropname=" + cropname + ", quantity=" + quantity + ", price=" + price + ", variety="
				+ variety + "]";
	}
	
	
	

}
