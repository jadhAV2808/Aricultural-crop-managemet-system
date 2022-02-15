package com.agri.models;

public class BankDetails {
	
	private String daccuntHolderName;
	private long daccountNumber;
	private String dbankName;
	public String getAccuntHolderName() {
		return daccuntHolderName;
	}
	public void setAccuntHolderName(String daccuntHolderName) {
		this.daccuntHolderName = daccuntHolderName;
	}
	public long getAccountNumber() {
		return daccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.daccountNumber = daccountNumber;
	}
	public String getBankName() {
		return dbankName;
	}
	public void setBankName(String dbankName) {
		this.dbankName = dbankName;
	}
	public BankDetails(String daccuntHolderName, long daccountNumber, String dbankName) {
		
		this.daccuntHolderName = daccuntHolderName;
		this.daccountNumber = daccountNumber;
		this.dbankName = dbankName;
	}
	
public BankDetails() {
		
		
	}
	
	@Override
	public String toString() {
		return "BankDetails [accuntHolderName=" + daccuntHolderName + ", accountNumber=" + daccountNumber + ", bankName="
				+ dbankName + "]";
	}
	
	
	
	

}
